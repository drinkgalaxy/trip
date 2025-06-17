package edu.example.trip;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    LinearLayout main;
    View dialogView;

    Button category1, category2, category3;
    ImageView[] imageViews = new ImageView[27];
    int[] imageViewIds = {
            // 하나에 3개 세팅 순서대로 ->
            R.id.cg1img1, R.id.cg1img2, R.id.cg1img3, // 0, 1, 2
            R.id.cg1img4, R.id.cg1img5, R.id.cg1img6, // 3, 4, 5
            R.id.cg1img7, R.id.cg1img8, R.id.cg1img9, // 6, 7, 8

            R.id.cg2img1, R.id.cg2img2, R.id.cg2img3, // 9, 10, 11
            R.id.cg2img4, R.id.cg2img5, R.id.cg2img6, // 12, 13, 14
            R.id.cg2img7, R.id.cg2img8, R.id.cg2img9, // 15, 16, 17

            R.id.cg3img1, R.id.cg3img2, R.id.cg3img3, // 18, 19, 20
            R.id.cg3img4, R.id.cg3img5, R.id.cg3img6, // 21, 22, 23
            R.id.cg3img7, R.id.cg3img8, R.id.cg3img9 // 24, 25, 26
    };

    TextView tripCostText, tripIntroText;
    EditText inputPrice;
    CalcPrice calcPrice = new CalcPrice();
    ImageControl imageControl = new ImageControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final String[] types = new String[] {"당일", "2박3일", "일주일"};

        main = findViewById(R.id.main);
        category1 = findViewById(R.id.category1);
        category2 = findViewById(R.id.category2);
        category3 = findViewById(R.id.category3);
        tripCostText = findViewById(R.id.tripCostText);
        tripIntroText = findViewById(R.id.tripIntroText);
        inputPrice = findViewById(R.id.inputPrice);

        // 이미지 findViewById for 문으로 등록
        for (int i = 0; i < imageViews.length; i++) {
            imageViews[i] = findViewById(imageViewIds[i]);
        }

        // 선택한 메뉴에 맞게 이미지 변경 함수 호출
        // 이미지 변경할 때 여행 일정 가격, 설명 칸도 계속 초기화
        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                imageControl.control(imageViews, 1);
            }
        });

        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                imageControl.control(imageViews, 2);
            }
        });

        category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                imageControl.control(imageViews, 3);
            }
        });

        // 사진 클릭 시 dlg 뜨도록 하는 동작 for 문으로 등록
        for (int i = 0; i < imageViews.length; i++) {
            // 사진의 고유 아이디 저장
            final int selectImageId = imageViewIds[i];
            imageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { // 여행 일정 선택 시 CalcPrice 호출 해서 계산 후 리턴값 tripCostText, tripIntroText 에 각각 set 하기
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setTitle("여행 기간 선택");
                    dlg.setSingleChoiceItems(types, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String type = types[which];
                            tripCostText.setText(String.format("여행 경비는 : %s", String.valueOf(calcPrice.calculate(selectImageId, type))));
                            tripIntroText.setText(calcPrice.getInformation(selectImageId));
                        }
                    });
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });
        }
    }

    // 일반 메뉴 등록
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu); // menu1 xml 을 일반 메뉴로 등록
        return true;
    }

    // 메뉴에 따른 선택 동작 등록
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.categoryBar1 || item.getItemId() == R.id.resetBar) {
            reset();
            imageControl.control(imageViews, 1);
        } else if (item.getItemId() == R.id.categoryBar2) {
            reset();
            imageControl.control(imageViews, 2);
        } else if (item.getItemId() == R.id.categoryBar3) {
            reset();
            imageControl.control(imageViews, 3);
        } else if (item.getItemId() == R.id.recommendBar) {
            dialogView = (View) View.inflate(MainActivity.this, R.layout.dialog, null);
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle("경비와 비슷한 여행지를 추천해드립니다.");
            dlg.setView(dialogView);
            dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    inputPrice = (EditText) dialogView.findViewById(R.id.inputPrice);

                    if ((inputPrice == null) || inputPrice.getText().toString().trim().isEmpty()) {
                        Toast.makeText(MainActivity.this, "값을 입력한 후 확인을 눌러주세요,", LENGTH_SHORT).show();
                        return;
                    }

                    String input = inputPrice.getText().toString().trim();

                    if (Long.parseLong(input) < 70000) {
                        Toast.makeText(MainActivity.this, "최소 금액은 7만원입니다.", LENGTH_SHORT).show();
                    } else if (Long.parseLong(input) > 10000000L) {
                        Toast.makeText(MainActivity.this, "최대 금액은 천만원입니다.", LENGTH_SHORT).show();
                    } else {
                        // 가격에 맞춰서 여행지 선택하는 함수 호출하고 계산 결과에 따라 tripCostText, tripIntroText 변경
                        InfoStore infoStore = new InfoStore();
                        Place destination = infoStore.getDestination(input);

                        tripCostText.setText(String.format("여행 경비는 : %s", String.valueOf(destination.getTripCost())));
                        tripIntroText.setText(destination.getInformation());
                    }
                }
            });
            dlg.setNegativeButton("취소", null);
            dlg.show();
        }

        return true;
    }

    // 내용 초기화 함수
    public void reset() {
        tripCostText.setText("여행 경비는");
        tripIntroText.setText("여행지 소개는");
    }
}
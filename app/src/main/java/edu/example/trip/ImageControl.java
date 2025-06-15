package edu.example.trip;

import android.view.View;
import android.widget.ImageView;

public class ImageControl {

    public void control(ImageView[] imageViews, int num) {

        if (num == 1) {
            for (int i = 0; i < 9; i++) {
                imageViews[i].setVisibility(View.VISIBLE);
            }

            for (int i = 9; i < 18; i++) {
                imageViews[i].setVisibility(View.INVISIBLE);
            }

            for (int i = 18; i < 27; i++) {
                imageViews[i].setVisibility(View.INVISIBLE);
            }
        } else if (num == 2) {
            for (int i = 0; i < 9; i++) {
                imageViews[i].setVisibility(View.INVISIBLE);
            }

            for (int i = 9; i < 18; i++) {
                imageViews[i].setVisibility(View.VISIBLE);
            }

            for (int i = 18; i < 27; i++) {
                imageViews[i].setVisibility(View.INVISIBLE);
            }
        } else if (num == 3) {
            for (int i = 0; i < 9; i++) {
                imageViews[i].setVisibility(View.INVISIBLE);
            }

            for (int i = 9; i < 18; i++) {
                imageViews[i].setVisibility(View.INVISIBLE);
            }

            for (int i = 18; i < 27; i++) {
                imageViews[i].setVisibility(View.VISIBLE);
            }
        }
    }
}

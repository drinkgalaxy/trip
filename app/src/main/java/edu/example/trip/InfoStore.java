package edu.example.trip;

import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class InfoStore {

    private static final Map<Integer, Place> placeInfoMap = new HashMap<>();

    static {
        // 자연
        placeInfoMap.put(R.id.cg1img1, new Place(114000, "선택하신 지역은 강원도 평창입니다. 맑은 계곡과 대관령 양떼목장, 오대산 국립공원의 숲길 등에서 자연과 목장 풍경을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img2, new Place(156000, "선택하신 지역은 제주도입니다. 한라산 등반, 협재해변의 에메랄드 바다, 우도 등에서 다양한 풍경과 먹거리, 액티비티를 경험하실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img3, new Place(85000, "선택하신 지역은 전라남도 담양입니다. 대나무 숲 죽녹원과 메타세쿼이아길 산책로를 걸으며 힐링과 담양 떡갈비 맛집을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img4, new Place(98000, "선택하신 지역은 충청북도 제천입니다. 청풍호 유람선, 산악열차, 고즈넉한 의림지 등에서 자연 풍광과 레트로 감성을 함께 느끼실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img5, new Place(195000, "선택하신 지역은 경상북도 울릉도입니다. 맑고 깊은 바다와 해안 절경, 독도 전망 등 천혜의 자연을 감상하실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img6, new Place(131000, "선택하신 지역은 경상남도 거제도입니다. 바람의 언덕, 외도 보타니아 등 다양한 해안 관광명소와 신선한 해산물을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img7, new Place(109000, "선택하신 지역은 전라북도 부안입니다. 변산반도국립공원, 채석강 등 서해안 자연 경관을 감상하시기에 좋은 여행지입니다."));
        placeInfoMap.put(R.id.cg1img8, new Place(91000, "선택하신 지역은 충청남도 태안입니다. 안면도와 꽃지해수욕장에서 낙조와 해변, 해산물 맛집 등 다양한 볼거리와 휴식을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg1img9, new Place(77000, "선택하신 지역은 인제/홍천입니다. 내린천 래프팅, 백담사 산사, 알프스마을 등에서 산과 강이 어우러진 자연을 동시에 경험하실 수 있습니다."));

        // 도시
        placeInfoMap.put(R.id.cg2img1, new Place(86000, "선택하신 지역은 광주입니다. 충장로의 젊은 거리와 펭귄마을 등 예술과 레트로가 공존하는 도심 속 소도시 여행을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img2, new Place(101000, "선택하신 지역은 대전입니다. 둔산동 번화가, 유성온천, 계족산 황토길 등에서 다양한 도시의 매력과 휴식을 경험하실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img3, new Place(113000, "선택하신 지역은 인천입니다. 송도, 차이나타운, 월미도 등에서 바다와 도심의 다양한 볼거리와 먹거리를 누리실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img4, new Place(93000, "선택하신 지역은 수원입니다. 유네스코 세계유산 화성, 행궁동, 수원역, 갤러리아 등에서 다양한 역사와 현대적 경험을 하실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img5, new Place(82000, "선택하신 지역은 청주입니다. 성안길, 직지사, 청남대 등 전통과 현대, 자연이 어우러진 다양한 매력을 느끼실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img6, new Place(107000, "선택하신 지역은 전주입니다. 한옥마을, 풍남문, 전주객사 등에서 전통과 현대가 어우러진 여행을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img7, new Place(127000, "선택하신 지역은 서울입니다. 강남, 홍대, 이태원, 명동 등 트렌디한 쇼핑과 글로벌 맛집, 다양한 문화 체험을 하실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img8, new Place(119000, "선택하신 지역은 부산입니다. 해운대, 광안리, 서면 등에서 아름다운 해변과 신선한 해산물, 도시 야경을 함께 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg2img9, new Place(89000, "선택하신 지역은 대구입니다. 동성로, 김광석 거리 등에서 예술과 다양한 먹거리를 경험하실 수 있습니다."));

        // 역사
        placeInfoMap.put(R.id.cg3img1, new Place(124000, "선택하신 지역은 경주입니다. 불국사, 첨성대, 대릉원 등 신라 천년의 고도에서 유네스코 세계유산과 고분군, 야경을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img2, new Place(89000, "선택하신 지역은 안동입니다. 하회마을, 도산서원, 탈춤박물관 등에서 전통 한옥과 유교 문화를 체험하실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img3, new Place(78000, "선택하신 지역은 공주입니다. 공산성, 무령왕릉, 송산리 고분군 등 백제의 역사와 문화를 걸으며 체험하실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img4, new Place(96000, "선택하신 지역은 강화도입니다. 고인돌, 외규장각, 조양방직 등에서 역사와 감성이 어우러진 섬 여행을 즐기실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img5, new Place(81000, "선택하신 지역은 남원입니다. 광한루, 춘향테마파크 등에서 전통과 사랑의 테마가 살아 있는 여행을 하실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img6, new Place(119000, "선택하신 지역은 통영입니다. 세병관, 동피랑 벽화마을, 한산도 이충무공 유적 등에서 바다와 역사를 함께 경험하실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img7, new Place(91000, "선택하신 지역은 진주입니다. 진주성, 촉석루, 국립진주박물관 등에서 역사와 문화, 남강의 야경을 모두 감상하실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img8, new Place(83000, "선택하신 지역은 부여입니다. 정림사지, 궁남지, 백제문화단지 등 찬란한 백제의 고대 유적과 자연 풍광을 체험하실 수 있습니다."));
        placeInfoMap.put(R.id.cg3img9, new Place(94000, "선택하신 지역은 파주입니다. 임진각, 도라산역, 헤이리마을 등에서 분단의 현장과 평화, 예술 문화 체험이 가능합니다."));
    }

    public static Place getPlace(int key) {
        return placeInfoMap.get(key);
    }

    public Place getDestination(String input) {

        // tripCost 기준으로 기준값과 최대한 비슷한 금액을 추출한 후 그 금액의 Place 객체 return
        int targetPrice = Integer.parseInt(input);

        Place closestPlace = null;
        int minDifference = Integer.MAX_VALUE;

        for (Place place : placeInfoMap.values()) {
            int diff = Math.abs(place.getTripCost() - targetPrice);
            if (diff < minDifference) {
                minDifference = diff;
                closestPlace = place;
            }
        }

        return closestPlace;
    }
}

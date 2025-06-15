package edu.example.trip;

public class CalcPrice {

    // 매개변수로 선택장소와 여행기간을 전달받고 계산 비용을 리턴
    // 얼마나 여행 하는 지에 따라 선택 장소의 당일 치기 가격에 * 여행 기간

    public int calculate(int selectImageId, String type) {
        Place place = InfoStore.getPlace(selectImageId);
        if (validCheck(place)) { // 계산이 가능한 값인지 먼저 체크
            if (type.equals("당일")) {
                return place.getTripCost();
            } else if (type.equals("2박3일")) {
                return place.getTripCost() * 3;
            } else if (type.equals("일주일")) {
                return place.getTripCost() * 7;
            }
        }
        return -1;
    }

    public String getInformation(int selectImageId) {
        Place place = InfoStore.getPlace(selectImageId);
        if (validCheck(place)) {
            return place.getInformation();
        }
        return "여행지 소개가 아직 등록되지 않았습니다.";
    }

    public boolean validCheck(Place place) {
        if (place != null) {
            if (place.getTripCost() != 0 && place.getInformation() != null) {
                return true;
            }
        }
        return false;
    }

}

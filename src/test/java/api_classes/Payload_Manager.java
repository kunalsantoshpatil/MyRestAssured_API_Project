package api_classes;

import org.json.JSONObject;

public class Payload_Manager {
    public static String createBookingPayload() {
        JSONObject json = new JSONObject();
        json.put("firstname", "John");
        json.put("lastname", "Doe");
        json.put("totalprice", 123);
        json.put("depositpaid", true);

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2025-07-10");
        bookingDates.put("checkout", "2025-07-15");

        json.put("bookingdates", bookingDates);
        json.put("additionalneeds", "Breakfast");

        return json.toString();
    }

    public static String updateBookingPayload() {
        JSONObject json = new JSONObject();
        json.put("firstname", "Jane");
        json.put("lastname", "Smith");
        json.put("totalprice", 150);
        json.put("depositpaid", false);

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2025-08-01");
        bookingDates.put("checkout", "2025-08-10");

        json.put("bookingdates", bookingDates);
        json.put("additionalneeds", "Lunch");

        return json.toString();
    }

    public static String authPayload() {
        return new JSONObject()
            .put("username", "admin")
            .put("password", "password123")
            .toString();
    }
}

package ng.com.hybridintegrated.a365dailyreadingsfornigeria.Bulletin;

public class bulletinmodel {
    private String title,body;
    public bulletinmodel(String title, String body) {
        this.title=title;
        this.body=body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}

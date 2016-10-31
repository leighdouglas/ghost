package nyc.c4q.leighdouglas.ghost;

/**
 * Created by leighdouglas on 10/29/16.
 */

public class ContactName {
    private String contactName;
    private String color;

    public ContactName(String contactName, String color) {
        this.contactName = contactName;
        this.color = color;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getColor() {
        return this.color;
    }
}

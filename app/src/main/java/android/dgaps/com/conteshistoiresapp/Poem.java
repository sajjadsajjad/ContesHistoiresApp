package android.dgaps.com.conteshistoiresapp;

/**
 * Created by HP on 1/19/2017.
 */

public class Poem {
    private String id;
    private String poem_title;
    private String poem_description;

    public Poem(String id, String poem_title, String poem_description) {
        this.id = id;
        this.poem_title = poem_title;
        this.poem_description = poem_description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoem_title() {
        return poem_title;
    }

    public void setPoem_title(String poem_title) {
        this.poem_title = poem_title;
    }

    public String getPoem_description() {
        return poem_description;
    }

    public void setPoem_description(String poem_description) {
        this.poem_description = poem_description;
    }


}

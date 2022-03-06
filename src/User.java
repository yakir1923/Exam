import java.util.Arrays;

public class User {
    private String id;
    private String name;


    public User(String id, String name) {
        this.id = newId(id);
        newId(id);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String newId(String id) {
         String newId;
        char[] oldId=id.toCharArray();
        char theNumToChange = id.toCharArray()[8];
        int location = (Integer.parseInt(id) % 100 - Integer.parseInt(id) % 10) / 10;
        return addChar(id,theNumToChange,location);
        }
    public String addChar(String str, char ch, int position) {
        int strSize = str.length();
        char[] updatedArr = new char[strSize + 1];
        str.getChars(0, position, updatedArr, 0);
        updatedArr[position] = ch;
        str.getChars(position, strSize, updatedArr, position + 1);
        return new String(updatedArr);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


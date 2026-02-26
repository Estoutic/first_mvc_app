package estoutic;

public class UserDto {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto(String name) {
        this.name = name;
    }

    private String name;
}

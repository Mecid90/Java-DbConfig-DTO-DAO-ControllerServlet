package dto;

public class UserDTO {

    private Integer id;
    private String name;
    private String surname;
    private String birthplace;
    private String depname;
    private String depmanager;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDepmanager() {
        return depmanager;
    }

    public void setDepmanager(String depmanager) {
        this.depmanager = depmanager;
    }

    public UserDTO(Integer id, String name, String surname, String birthplace, String depname, String depmanager) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthplace = birthplace;
        this.depname = depname;
        this.depmanager = depmanager;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", depname='" + depname + '\'' +
                ", depmanager='" + depmanager + '\'' +
                '}';
    }
}

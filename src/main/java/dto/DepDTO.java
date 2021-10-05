package dto;

public class DepDTO {

    private Integer id;
    private String depname;
    private String depmanager;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public DepDTO(String depname, String depmanager) {
        this.id = id;
        this.depname = depname;
        this.depmanager = depmanager;
    }

    public DepDTO(Integer id, String depname, String depmanager) {
        this.id = id;
        this.depname = depname;
        this.depmanager = depmanager;
    }

    @Override
    public String toString() {
        return "DepDTO{" +
                "id=" + id +
                ", depname='" + depname + '\'' +
                ", depmanager='" + depmanager + '\'' +
                '}';
    }
}

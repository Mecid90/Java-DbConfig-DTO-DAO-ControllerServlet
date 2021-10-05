package utility;

public enum Query {

    USER_LIST("SELECT EMP.ID,EMP.NAME,EMP.SURNAME,EMP.BIRTH_PLACE,DEP.DEPARTMENT_NAME,DEP.DEPARTMENT_MANAGER FROM EMPLOYEE EMP INNER JOIN DEPARTMENT DEP ON EMP.DEP_ID = DEP.ID"),
    DEP_LIST("SELECT * FROM DEPARTMENT");


    private String query;
    Query (String query){this.query=query;}
    public String getQuery() {

        return query;
    }
}

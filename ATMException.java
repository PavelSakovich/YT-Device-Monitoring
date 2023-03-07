import java.util.Objects;

public final class  ATMException  {
    private final String WORD1 ;
    private final String WORD2 ;

    private Object object;

    public Object getObject() {
        return object;
    }

    public String getWORD1() {
        return WORD1;
    }

    public String getWORD2() {
        return WORD2;
    }

    public ATMException(String WORD1, String WORD2) {
        this.WORD1 = WORD1;
        this.WORD2 = WORD2;
    }

}
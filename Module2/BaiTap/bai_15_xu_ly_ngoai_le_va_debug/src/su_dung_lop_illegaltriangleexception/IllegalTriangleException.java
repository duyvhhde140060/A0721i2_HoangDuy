package su_dung_lop_illegaltriangleexception;

public class IllegalTriangleException extends Exception {
    private String msg;

    public IllegalTriangleException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public IllegalTriangleException() {
        super("Invalid!");
    }
}

package org.Manish.Custom;

public class CustomEx extends Throwable{

    public CustomEx ()
    {
        super();
    }

    public CustomEx (String msg)
    {
        super(msg);
    }
    public CustomEx(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomEx(Throwable cause) {
        super(cause);
    }
}

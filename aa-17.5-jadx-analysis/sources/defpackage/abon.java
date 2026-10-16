package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class abon extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public abon(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void a() {
        this.a = true;
    }

    public abon(String str) {
        super(str);
    }

    public abon(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}

package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class ejp extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public ejp(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public ejp(String str) {
        super(str);
    }

    public ejp(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class abpp extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public abpp(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void a() {
        this.a = true;
    }

    public abpp(java.lang.String str) {
        super(str);
    }

    public abpp(java.io.IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}

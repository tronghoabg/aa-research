package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ejx extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public ejx(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public ejx(java.lang.String str) {
        super(str);
    }

    public ejx(java.io.IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}

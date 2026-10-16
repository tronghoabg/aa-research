package defpackage;

/* loaded from: classes.dex */
public class qrz extends Exception {
    private static final long serialVersionUID = 7092395140127673786L;

    public qrz(byte[] bArr) {
        super("cannot get audio record binder");
    }

    public qrz(Exception exc) {
        super(exc);
    }

    public qrz() {
    }
}

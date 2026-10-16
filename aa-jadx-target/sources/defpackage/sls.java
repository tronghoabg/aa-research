package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class sls extends java.lang.Exception {

    @java.lang.Deprecated
    public final com.google.android.gms.common.api.Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public sls(com.google.android.gms.common.api.Status status) {
        int i = status.f;
        java.lang.String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }

    public final int a() {
        return this.a.f;
    }
}

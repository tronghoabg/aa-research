package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yrw extends defpackage.yqu {
    private final java.lang.String a;

    protected yrw(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.yqu
    public java.lang.String f() {
        return this.a;
    }

    @Override // defpackage.yqu
    public void g(java.lang.RuntimeException runtimeException, defpackage.yqt yqtVar) {
        android.util.Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}

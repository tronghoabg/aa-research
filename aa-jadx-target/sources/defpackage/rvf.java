package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rvf implements defpackage.rwe, defpackage.rwf {
    public final int a;
    public final defpackage.rwh b;
    protected final android.os.Handler c;

    public rvf(int i, defpackage.rwh rwhVar, android.os.Handler handler) {
        this.a = i;
        this.b = rwhVar;
        this.c = handler;
    }

    @Override // defpackage.rtv
    public final int a() {
        return this.a;
    }
}

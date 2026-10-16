package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rtc implements defpackage.rtx {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public defpackage.rtz b;
    public final android.content.Context c;
    public android.os.Handler g;
    public java.lang.Runnable h;
    public boolean i;
    public final defpackage.run j;
    public volatile boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public final boolean e = true;

    public rtc(android.content.Context context, defpackage.run runVar, boolean z) {
        this.c = context;
        this.j = runVar;
    }

    public final void a() {
        java.lang.Runnable runnable;
        synchronized (this.f) {
            android.os.Handler handler = this.g;
            if (handler != null && (runnable = this.h) != null) {
                handler.removeCallbacks(runnable);
            }
        }
    }
}

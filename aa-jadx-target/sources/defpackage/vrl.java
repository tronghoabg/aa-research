package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vrl {
    public android.os.Handler e;
    public defpackage.vlu h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final java.util.Set g = new java.util.HashSet();
    public final java.lang.Runnable f = new defpackage.rzu(this, 15);

    public vrl(android.content.Context context) {
        this.e = null;
        this.e = new android.os.Handler(context.getMainLooper());
        ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new defpackage.vrj(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (defpackage.vqu vquVar : this.g) {
            }
            this.d = true;
        }
    }
}

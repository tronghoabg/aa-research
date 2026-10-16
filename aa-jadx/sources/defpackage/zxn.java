package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zxn {
    public static final java.lang.String a = "zxn";
    public boolean b = false;
    public defpackage.vhm c = null;
    public defpackage.vhm d = null;
    private final java.util.concurrent.Executor e;

    public zxn(java.util.concurrent.Executor executor) {
        this.e = executor;
    }

    public final void a() {
        synchronized (this) {
            if (this.b && (this.d != null || this.c != null)) {
                this.e.execute(new defpackage.xgr(this, 19));
            }
        }
    }

    public final void b(boolean z) {
        synchronized (this) {
            this.b = z;
        }
        a();
    }
}

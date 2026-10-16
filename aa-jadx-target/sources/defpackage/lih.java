package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lih implements defpackage.lhn {
    private static final j$.time.Duration b = j$.time.Duration.ofMinutes(1);
    public final android.os.Handler a = new android.os.Handler();
    private boolean c = false;
    private final java.lang.Runnable d;

    public lih(java.util.function.Supplier supplier) {
        this.d = new defpackage.lig(this, supplier);
    }

    public static long a() {
        return b.toMillis();
    }

    @Override // defpackage.lhn
    public final void d() {
        if (!this.c) {
            ((defpackage.yqj) defpackage.lin.a.l().ai((char) 3935)).u("HeartbeatHelper not started!");
        } else {
            this.a.removeCallbacks(this.d);
            this.c = false;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.c) {
            ((defpackage.yqj) defpackage.lin.a.l().ai((char) 3934)).u("HeartbeatHelper already started!");
            return;
        }
        this.c = true;
        long jA = a();
        if (jA <= 0) {
            defpackage.yqm yqmVar = defpackage.lin.a;
        } else {
            this.a.postDelayed(this.d, jA);
        }
    }
}

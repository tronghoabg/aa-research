package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gih {
    public final java.lang.Object a;
    public java.lang.Object b;

    public gih() {
        this.a = new java.util.ArrayList();
    }

    public final void a() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            ((java.util.Timer) obj).cancel();
        }
        this.b = null;
    }

    public final void b() {
        synchronized (this.a) {
            a();
            java.util.Timer timer = new java.util.Timer(true);
            timer.schedule(new defpackage.gig(this), 10000L, Long.MAX_VALUE);
            this.b = timer;
        }
    }

    public gih(defpackage.afer aferVar) {
        this.a = aferVar;
        b();
    }
}

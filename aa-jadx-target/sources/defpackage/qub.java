package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qub extends defpackage.qzf {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SENSOR");
    static final int[] b = {11, 2, 7, 6};
    defpackage.qtd c;
    public boolean d;
    public boolean e;
    public android.location.Location f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public long h;
    public final java.util.Random i;
    public android.location.Location j;
    public final java.lang.Runnable k;
    public final java.lang.Runnable l;
    private final android.os.HandlerThread m;
    private final android.os.Handler n;
    private final defpackage.qsw o;
    private final defpackage.qsx p;
    private final defpackage.sup q;
    private final defpackage.mgr r;

    public qub(android.content.Context context, android.os.HandlerThread handlerThread) {
        defpackage.sup supVar = new defpackage.sup(context.getApplicationContext());
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = 0L;
        this.i = new java.util.Random();
        this.r = new defpackage.mgr(null);
        this.o = new defpackage.qsw();
        this.p = new defpackage.qsx();
        this.j = new android.location.Location("Car-GPS");
        this.k = new defpackage.qtk(this, 2, null);
        this.l = new defpackage.qtk(this, 3, null);
        this.m = handlerThread;
        this.n = new defpackage.stq(handlerThread.getLooper());
        this.q = supVar;
    }

    public final void a(android.location.Location location) {
        defpackage.kwv kwvVar = defpackage.rly.c;
        defpackage.rly.a(kwvVar);
        this.q.c(location);
        defpackage.rly.a(kwvVar);
    }

    @Override // defpackage.qzg
    public final void b(com.google.android.gms.car.CarSensorEvent carSensorEvent) {
        int i = carSensorEvent.b;
        if (i == 2) {
            defpackage.qsw qswVar = this.o;
            carSensorEvent.e(qswVar);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.g;
            float f = qswVar.a;
            atomicBoolean.set(f < 0.5f && f > -0.5f);
            return;
        }
        if (i == 6) {
            defpackage.qsx qsxVar = this.p;
            carSensorEvent.f(qsxVar);
            if (qsxVar.a) {
                this.g.set(true);
                return;
            }
            return;
        }
        if (i != 7) {
            if (i == 10) {
                defpackage.rbz.f(this.m.getLooper(), new defpackage.qnf((java.lang.Object) this, (java.lang.Object) carSensorEvent, 7, (byte[]) null));
                return;
            } else {
                if (i != 11) {
                    throw new java.lang.RuntimeException(defpackage.a.bo(i, "unrequested event "));
                }
                return;
            }
        }
        defpackage.mgr mgrVar = this.r;
        carSensorEvent.h(mgrVar);
        if (mgrVar.a == 101) {
            this.g.set(true);
        }
    }

    public final void c(java.lang.Runnable runnable, long j) {
        this.n.postDelayed(runnable, j);
    }

    public final void d() {
        this.n.removeCallbacksAndMessages(null);
    }

    public final void f(defpackage.qtd qtdVar) {
        this.c = qtdVar;
        defpackage.rbz.f(this.m.getLooper(), new ozv(7));
    }
}

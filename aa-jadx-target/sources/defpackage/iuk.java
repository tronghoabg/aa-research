package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iuk {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE");
    public static final defpackage.yhx b = new defpackage.ynu("com.google.android.googlequicksearchbox");
    public volatile defpackage.ikp A;
    public volatile defpackage.ikr B;
    public volatile defpackage.ild C;
    public volatile defpackage.ikz D;
    public volatile defpackage.ilo E;
    public volatile defpackage.ike F;
    public volatile defpackage.ikn G;
    public volatile defpackage.ikm H;
    public volatile iub I;
    public volatile defpackage.iro J;
    private defpackage.jcv M;
    public final defpackage.iuj c;
    public final defpackage.xzi d;
    public final defpackage.jfd e;
    public final defpackage.ilj f;
    public final defpackage.jfe g;
    public final defpackage.ill h;
    public final defpackage.ilm i;
    public final defpackage.xzi j;
    public final android.content.Context k;
    public final defpackage.rbz m;
    public boolean n;
    public volatile long o;
    public volatile int p;
    public volatile defpackage.jfo q;
    public volatile com.google.android.gms.carsetup.CarInfoInternal r;
    public volatile defpackage.jbw s;
    public volatile boolean t;
    public volatile android.os.HandlerThread u;
    public volatile defpackage.jfn v;
    public volatile iul w;
    public volatile defpackage.ixh x;
    public volatile defpackage.irk y;
    public volatile defpackage.iwk z;
    public volatile defpackage.yhe K = defpackage.ync.a;
    public final java.util.Map L = new j$.util.concurrent.ConcurrentHashMap();
    public final android.os.Handler l = new android.os.Handler(android.os.Looper.getMainLooper());

    public iuk(defpackage.iuj iujVar, defpackage.xzi xziVar, defpackage.jfd jfdVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, defpackage.ill illVar, defpackage.ilm ilmVar, defpackage.xzi xziVar2, android.content.Context context, defpackage.rbz rbzVar) {
        this.c = iujVar;
        this.d = xziVar;
        this.e = jfdVar;
        this.f = iljVar;
        this.g = jfeVar;
        this.h = illVar;
        this.i = ilmVar;
        this.j = xziVar2;
        this.k = context;
        this.m = rbzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(defpackage.ygw ygwVar, defpackage.xkd xkdVar) {
        int size = ygwVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((defpackage.ivc) ((android.util.Pair) ygwVar.get(i2)).first).k.equals(xkdVar)) {
                i++;
            }
        }
        return i;
    }

    private static final boolean f() {
        return ((int) defpackage.acxb.a.fF().a()) == 1;
    }

    public final synchronized defpackage.jcw b() {
        return this.M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c() {
        defpackage.jcv jcvVar = this.M;
        if (jcvVar != null) {
            defpackage.yqm yqmVar = jcvVar.g;
            defpackage.yxx yxxVar = jcvVar.f;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1887)).y("Logging in use buffers for consumer: %s", yxxVar.name());
            int i = 0;
            while (true) {
                defpackage.ygw ygwVar = jcvVar.c;
                if (i >= ((defpackage.ymx) ygwVar).c) {
                    break;
                }
                ((defpackage.jcs) ygwVar.get(i)).f();
                i++;
            }
        }
        this.M = null;
    }

    public final synchronized void d(defpackage.yxx yxxVar) {
        if (yxxVar.ordinal() != 2) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.format("Construction of pool for %s is not supported", yxxVar.name()));
        }
        if (this.M == null) {
            defpackage.acou acouVar = defpackage.acou.a;
            this.M = defpackage.jcv.a(acouVar.fF().b().b, defpackage.a.N(), f(), defpackage.yxx.POOL_VIDEO, new defpackage.jcx(f(), (int) acouVar.fF().a()));
        }
    }

    public final boolean e() {
        com.google.android.gms.car.CarInfo carInfo = this.r != null ? this.r.a : null;
        return carInfo != null && carInfo.r == 3;
    }
}

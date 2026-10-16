package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwe {
    private static final defpackage.yqm d = defpackage.yqm.c("CAR.FR.InteractiveMode");
    private final defpackage.jjv e;
    private final boolean f;
    public final java.lang.Object a = new java.lang.Object();
    public boolean b = false;
    public boolean c = false;
    private final defpackage.jju g = new defpackage.iwf(this, 1);

    public iwe(defpackage.jjv jjvVar, com.google.android.gms.car.CarInfo carInfo) {
        this.e = jjvVar;
        defpackage.absc abscVarN = defpackage.acsa.a.fF().n();
        defpackage.yqm yqmVar = defpackage.kjl.a;
        this.f = defpackage.kjl.g(carInfo, abscVarN.b);
    }

    public final void a(boolean z, boolean z2) {
        int iB;
        long jD;
        defpackage.yqm yqmVar = d;
        ((defpackage.yqj) yqmVar.l().ai(1437)).Q("onPowerStateChanged(/* inLowPowerMode= */ %b, /* inInteractiveMode= */ %b)", z, z2);
        synchronized (this.a) {
            this.b = z;
            this.c = z2;
            if (!this.f || z2) {
                if (!z && !z2) {
                    jD = defpackage.acsa.a.fF().e();
                } else if (z && z2) {
                    jD = defpackage.acsa.e();
                } else if (!z || z2) {
                    iB = 0;
                } else {
                    jD = defpackage.acsa.d();
                }
                iB = (int) jD;
            } else {
                defpackage.acsa acsaVar = defpackage.acsa.a;
                iB = (int) acsaVar.fF().b();
                int iE = (int) (!this.b ? acsaVar.fF().e() : defpackage.acsa.d());
                ((defpackage.yqj) yqmVar.l().ai(1436)).B("Getting capped limit based on limit: %s, cap %s", iE, iB);
                if (iE != 0) {
                    iB = java.lang.Math.min(iB, iE);
                }
            }
        }
        this.e.b(this.g, iB);
    }
}

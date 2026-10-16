package defpackage;

import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final class ivw {
    private static final yph d = yph.c("CAR.FR.InteractiveMode");
    private final jjo e;
    private final boolean f;
    public final Object a = new Object();
    public boolean b = false;
    public boolean c = false;
    private final jjn g = new ivx(this, 1);

    public ivw(jjo jjoVar, CarInfo carInfo) {
        this.e = jjoVar;
        abqz abqzVarN = acqy.a.gu().n();
        yph yphVar = kjf.a;
        this.f = kjf.g(carInfo, abqzVarN.b);
    }

    public final void a(boolean z, boolean z2) {
        int iB;
        long jD;
        yph yphVar = d;
        ((ype) yphVar.l().ai(1437)).Q("onPowerStateChanged(/* inLowPowerMode= */ %b, /* inInteractiveMode= */ %b)", z, z2);
        synchronized (this.a) {
            this.b = z;
            this.c = z2;
            if (!this.f || z2) {
                if (!z && !z2) {
                    jD = acqy.a.gu().e();
                } else if (z && z2) {
                    jD = acqy.e();
                } else if (!z || z2) {
                    iB = 0;
                } else {
                    jD = acqy.d();
                }
                iB = (int) jD;
            } else {
                acqy acqyVar = acqy.a;
                iB = (int) acqyVar.gu().b();
                int iE = (int) (!this.b ? acqyVar.gu().e() : acqy.d());
                ((ype) yphVar.l().ai(1436)).B("Getting capped limit based on limit: %s, cap %s", iE, iB);
                if (iE != 0) {
                    iB = Math.min(iB, iE);
                }
            }
        }
        this.e.b(this.g, iB);
    }
}

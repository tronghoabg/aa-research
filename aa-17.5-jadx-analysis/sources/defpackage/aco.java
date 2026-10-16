package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class aco extends acv implements cws, cvs {
    public agg a;
    public agb b;
    public agb c;
    public agb d;
    public acp e;
    public acq f;
    public afdr g;
    public adb h;
    public final cvr i;
    public cfn j;
    public aci k;
    private long l;
    private final afec m;
    private final afec n;

    public aco(agg aggVar, agb agbVar, agb agbVar2, agb agbVar3, acp acpVar, acq acqVar, adb adbVar, afdr afdrVar, aci aciVar) {
        this.a = aggVar;
        this.b = agbVar;
        this.c = agbVar2;
        this.d = agbVar3;
        this.e = acpVar;
        this.f = acqVar;
        this.g = afdrVar;
        this.k = aciVar;
        this.h = adbVar;
        aezu aezuVar = new aezu(acb.a, adbVar);
        cvu cvuVar = new cvu((bzi) aezuVar.a);
        cvuVar.b((bzi) aezuVar.a, aezuVar.b);
        this.i = cvuVar;
        this.l = -9223372034707292160L;
        dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
        this.m = new aai(this, 20);
        this.n = new acm(this, 1);
    }

    public final cfn a() {
        abw abwVar;
        if (this.a.d().h(acc.a, acc.b)) {
            abw abwVar2 = this.e.b.c;
            if (abwVar2 != null) {
                return abwVar2.a;
            }
            abwVar = this.f.b.c;
            if (abwVar == null) {
                return null;
            }
        } else {
            abw abwVar3 = this.f.b.c;
            if (abwVar3 != null) {
                return abwVar3.a;
            }
            abwVar = this.e.b.c;
            if (abwVar == null) {
                return null;
            }
        }
        return abwVar.a;
    }

    @Override // defpackage.cvs
    public final cvr d() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0107 A[PHI: r10
  0x0107: PHI (r10v2 bym) = (r10v1 bym), (r10v5 bym) binds: [B:44:0x00fd, B:38:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctq el(defpackage.cts r22, defpackage.cto r23, long r24) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aco.el(cts, cto, long):ctq");
    }

    @Override // defpackage.cfx
    public final void er() {
        this.l = -9223372034707292160L;
    }

    @Override // defpackage.cxs
    public final /* synthetic */ void et(long j) {
    }

    @Override // defpackage.cws
    public final void f(cst cstVar) {
    }
}

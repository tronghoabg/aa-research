package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class adp extends cfx implements cwk {
    public agb a;
    public acp b;
    public acq c;
    public adb d;

    public adp(agb agbVar, acp acpVar, acq acqVar, adb adbVar) {
        this.a = agbVar;
        this.b = acpVar;
        this.c = acqVar;
        this.d = adbVar;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        cxdVar.q();
        agb agbVar = this.a;
        acm acmVar = new acm(this, 3);
        adb adbVar = this.d;
        bym bymVarB = agbVar.b(acmVar, adbVar.h() ? new cjv(adbVar.b) : null, null, new ado(this, 0));
        adb adbVar2 = this.d;
        long jD = ((cjv) bymVarB.a()).a;
        adbVar2.j = jD;
        if (adbVar2.i()) {
            cyp cypVar = adbVar2.r;
            if (cypVar.i()) {
                acw acwVarA = adbVar2.a();
                acw acwVar = acw.c;
                if (acwVarA == acwVar && adbVar2.e().j()) {
                    jD = ((cjv) adbVar2.e().d()).a;
                } else if (adbVar2.a() == acwVar || adbVar2.a() == acw.d) {
                    jD = cypVar.d();
                }
            }
        }
        long j = jD;
        if (adbVar2.i()) {
            adbVar2.b = j;
        }
        if (cjv.a(j) == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        acd acdVar = this.b.b;
        adm admVar = this.c.b.e;
        czz.I(cxdVar, j, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, 126);
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}

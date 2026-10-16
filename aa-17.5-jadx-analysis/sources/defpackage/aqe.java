package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aqe extends ama implements cpq {
    public final aqk i;
    public final ciu j;
    private final aqa k;
    private final ane l;
    private final anh m;

    public aqe(aqf aqfVar, aiu aiuVar, aom aomVar, api apiVar, boolean z, boolean z2, asf asfVar, amy amyVar) {
        super(z, asfVar, apiVar);
        anh anhVar = new anh(new kwp(new adk(amc.c), (byte[]) null));
        this.m = anhVar;
        aqk aqkVar = new aqk(aqfVar, aiuVar, aomVar == null ? anhVar : aomVar, apiVar, z2, ((ama) this).c, this, new alg(this, 10));
        this.i = aqkVar;
        aqa aqaVar = new aqa(aqkVar, z);
        this.k = aqaVar;
        ciu ciuVar = new ciu(2, false, null, 10);
        W(ciuVar);
        this.j = ciuVar;
        ane aneVar = new ane(apiVar, aqkVar, z2, amyVar, new alg(this, 11));
        W(aneVar);
        this.l = aneVar;
        tp tpVar = ((ama) this).c;
        afdr afdrVar = cqa.a;
        W(new cpz(aqaVar, tpVar));
        W(new bce(aneVar));
    }

    @Override // defpackage.cpq
    public final boolean A(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f || ((rl.f(keyEvent) != ti.g(93) && rl.f(keyEvent) != ti.g(92)) || rl.e(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean zK = this.i.k();
        ane aneVar = this.l;
        if (zK) {
            float fD = (int) (aneVar.d() & 4294967295L);
            if (rl.f(keyEvent) != ti.g(92)) {
                fD = -fD;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            iFloatToRawIntBits = Float.floatToRawIntBits(fD);
        } else {
            float fD2 = (int) (aneVar.d() >> 32);
            if (rl.f(keyEvent) != ti.g(92)) {
                fD2 = -fD2;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(fD2);
            iFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
        }
        ahnc.d(N(), null, 0, new aqd(this, (jFloatToRawIntBits << 32) | (4294967295L & iFloatToRawIntBits), (afck) null, 1, (byte[]) null), 3);
        return true;
    }

    @Override // defpackage.cpq
    public final boolean B(KeyEvent keyEvent) {
        return false;
    }

    public final void L(aqf aqfVar, api apiVar, aiu aiuVar, boolean z, boolean z2, aom aomVar, asf asfVar, amy amyVar) {
        boolean z3;
        if (this.f != z) {
            this.k.a = z;
            ((ama) this).a = null;
            ((ama) this).b = null;
            bzi.q(this).J();
        }
        aom aomVar2 = aomVar == null ? this.m : aomVar;
        aqk aqkVar = this.i;
        tp tpVar = ((ama) this).c;
        boolean z4 = true;
        if (affa.f(aqkVar.a, aqfVar)) {
            z3 = false;
        } else {
            aqkVar.a = aqfVar;
            z3 = true;
        }
        aqkVar.j = aiuVar;
        if (aqkVar.c != apiVar) {
            aqkVar.c = apiVar;
            z3 = true;
        }
        if (aqkVar.d != z2) {
            aqkVar.d = z2;
        } else {
            z4 = z3;
        }
        aqkVar.b = aomVar2;
        aqkVar.k = tpVar;
        ane aneVar = this.l;
        aneVar.a = apiVar;
        aneVar.c = z2;
        aneVar.d = amyVar;
        G(amc.a, z, asfVar, aqkVar.k() ? api.a : api.b, z4);
    }

    @Override // defpackage.aoe
    public final Object ee(afeg afegVar, afck afckVar) {
        aqk aqkVar = this.i;
        Object objI = aqkVar.i(akq.b, new ams(afegVar, aqkVar, (afck) null, 3), afckVar);
        return objI == afcr.a ? objI : afak.a;
    }

    @Override // defpackage.aoe
    public final void ef(anr anrVar) {
        if (this.A) {
            ahnc.d(((ama) this).c.f(), null, 0, new ain(anrVar, this, (afck) null, 11), 3);
        }
    }

    @Override // defpackage.ama
    protected final ape f() {
        kwp kwpVar = new kwp(ViewConfiguration.get(tt.c(this).getContext()), (byte[]) null);
        aqb aqbVar = new aqb(this, 1, (byte[]) null);
        dlg dlgVar = bzi.q(this).r;
        aqk aqkVar = this.i;
        return new apc(new aph(new alg(aqkVar, 9)), aqkVar, kwpVar, aqbVar, dlgVar, new acm(aqkVar, 15));
    }

    @Override // defpackage.ama
    protected final ape h() {
        aqb aqbVar = new aqb(this, 0);
        dlg dlgVar = bzi.q(this).r;
        aqk aqkVar = this.i;
        return new ard(new aph(new alg(aqkVar, 13)), aqkVar, aqbVar, dlgVar, new acm(aqkVar, 18));
    }

    @Override // defpackage.ama
    protected final Object i(long j, afck afckVar) {
        return apy.a(this.i, j, afckVar);
    }

    @Override // defpackage.ama
    public final /* synthetic */ aqk l() {
        return this.i;
    }

    @Override // defpackage.ama
    protected final anh m() {
        return this.m;
    }
}

package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mwa implements tdb {
    public final /* synthetic */ tdb a;
    public final float b;
    public final float c;
    public final float d;
    public final bym e;
    public final afdr f;

    public mwa(float f, float f2, float f3, bym bymVar, dom domVar, afdr afdrVar) {
        bymVar.getClass();
        domVar.getClass();
        this.a = new tdc(domVar);
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = bymVar;
        this.f = afdrVar;
    }

    public static final cfy b(cfy cfyVar, doj dojVar, afec afecVar) {
        cfyVar.getClass();
        afecVar.getClass();
        return dom.h(cfyVar, dojVar, afecVar);
    }

    public final void a(cfy cfyVar, bux buxVar, int i) {
        int i2;
        boolean z;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1850689960);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (!((Boolean) this.e.a()).booleanValue() || this.f == null) {
                z = true;
                bvvVar = bvvVar2;
                buxVarC.v(-850096432);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-850419328);
                cmw cmwVarB = dao.b(true != ldz.a.a().b() ? R.drawable.ic_close : R.drawable.gs_close_fill1rond100_vd_theme_24, buxVarC, 0);
                boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && buxVarC.E(this));
                Object objS = bvvVar2.S();
                if (z2 || objS == buw.a) {
                    objS = new mvg(this, i4);
                    bvvVar2.ad(objS);
                }
                cfv cfvVar = cfy.e;
                String str = mwb.a;
                bvvVar = bvvVar2;
                z = true;
                khc.l(cmwVarB, (afdr) objS, das.d(cfvVar, mwb.a), null, false, null, null, null, null, buxVarC, 392, 0, 4088);
                bvvVar.Y(false);
            }
            bvvVar.Y(z);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(this, cfyVar, i, 20);
        }
    }

    public final ajmd c() {
        return ((tdc) this.a).a.l();
    }
}

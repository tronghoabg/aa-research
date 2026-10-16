package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class cun implements dlg {
    private boolean a;

    public static /* synthetic */ void A(cun cunVar, cuo cuoVar, int i, int i2, afec afecVar, int i3) {
        if ((i3 & 8) != 0) {
            afecVar = cup.a;
        }
        cunVar.t(cuoVar, i, i2, BitmapDescriptorFactory.HUE_RED, afecVar);
    }

    @Override // defpackage.dlg
    public float a() {
        throw null;
    }

    @Override // defpackage.dlm
    public float b() {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * a();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return eI(ex(f));
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    public abstract int n();

    public abstract dlr o();

    public float p(cuu cuuVar) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(cuo cuoVar) {
        if (cuoVar instanceof cxu) {
            ((cxu) cuoVar).U(this.a);
        }
    }

    public final void r(cuo cuoVar, int i, int i2, float f) {
        q(cuoVar);
        cuoVar.ev(dlo.d((i2 & 4294967295L) | (i << 32), cuoVar.e), f, null);
    }

    public final void s(cuo cuoVar, long j, float f) {
        q(cuoVar);
        cuoVar.ev(dlo.d(j, cuoVar.e), f, null);
    }

    public final void t(cuo cuoVar, int i, int i2, float f, afec afecVar) {
        q(cuoVar);
        cuoVar.ev(dlo.d((i2 & 4294967295L) | (i << 32), cuoVar.e), f, afecVar);
    }

    public final void u(cuo cuoVar, long j, float f, afec afecVar) {
        q(cuoVar);
        cuoVar.ev(dlo.d(j, cuoVar.e), f, afecVar);
    }

    public final void v(cuo cuoVar, long j, cmi cmiVar, float f) {
        q(cuoVar);
        cuoVar.y(dlo.d(j, cuoVar.e), f, cmiVar);
    }

    public final void w(afec afecVar) {
        this.a = true;
        afecVar.invoke(this);
        this.a = false;
    }

    public final void x(cuo cuoVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        if (o() == dlr.a || n() == 0) {
            q(cuoVar);
            cuoVar.ev(dlo.d(j, cuoVar.e), BitmapDescriptorFactory.HUE_RED, null);
            return;
        }
        q(cuoVar);
        cuoVar.ev(dlo.d((((int) (j & 4294967295L)) & 4294967295L) | (((n() - cuoVar.a) - ((int) (j >> 32))) << 32), cuoVar.e), BitmapDescriptorFactory.HUE_RED, null);
    }

    public final void y(cuo cuoVar, int i, int i2, afec afecVar) {
        long j = (i2 & 4294967295L) | (i << 32);
        if (o() == dlr.a || n() == 0) {
            q(cuoVar);
            cuoVar.ev(dlo.d(j, cuoVar.e), BitmapDescriptorFactory.HUE_RED, afecVar);
            return;
        }
        q(cuoVar);
        cuoVar.ev(dlo.d((((int) (j & 4294967295L)) & 4294967295L) | (((n() - cuoVar.a) - ((int) (j >> 32))) << 32), cuoVar.e), BitmapDescriptorFactory.HUE_RED, afecVar);
    }

    public final void z(cuo cuoVar, long j, afec afecVar) {
        if (o() == dlr.a || n() == 0) {
            q(cuoVar);
            cuoVar.ev(dlo.d(j, cuoVar.e), BitmapDescriptorFactory.HUE_RED, afecVar);
            return;
        }
        int iN = n() - cuoVar.a;
        long j2 = j >> 32;
        q(cuoVar);
        cuoVar.ev(dlo.d((((int) (j & 4294967295L)) & 4294967295L) | ((iN - ((int) j2)) << 32), cuoVar.e), BitmapDescriptorFactory.HUE_RED, afecVar);
    }
}

package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class aiz extends cfx implements cwk, cyg, cyu {
    public long a;
    public ckv b;
    public ckm c;
    private long d = 9205357640488583168L;
    private dlr e;
    private ckm f;
    private ckv g;

    public aiz(long j, ckv ckvVar) {
        this.a = j;
        this.b = ckvVar;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        cxd cxdVar2;
        ckm ckmVar;
        if (this.b == ckq.a) {
            long j = this.a;
            float[] fArr = clj.a;
            if (j != cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u)) {
                czz.I(cxdVar, this.a, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, 126);
            }
        } else {
            if (cxdVar.o() == this.d && cxdVar.p() == this.e && affa.f(this.g, this.b)) {
                ckmVar = this.f;
                ckmVar.getClass();
                cxdVar2 = cxdVar;
            } else {
                cxdVar2 = cxdVar;
                cjn.p(this, new aiy(this, cxdVar2, 0));
                ckmVar = this.c;
                this.c = null;
            }
            ckm ckmVar2 = ckmVar;
            this.f = ckmVar2;
            this.d = cxdVar2.o();
            this.e = cxdVar2.p();
            this.g = this.b;
            ckmVar2.getClass();
            long j2 = this.a;
            float[] fArr2 = clj.a;
            if (j2 != cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u)) {
                czz.aL(cxdVar2, ckmVar2, this.a, null, 60);
            }
        }
        cxdVar.q();
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        decVar.a(ddx.T, this.b);
    }

    @Override // defpackage.cyg
    public final void r() {
        this.d = 9205357640488583168L;
        this.e = null;
        this.f = null;
        this.g = null;
        cjn.w(this);
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final boolean z() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}

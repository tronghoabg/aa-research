package defpackage;

import androidx.car.app.constraints.IConstraintHost;

/* loaded from: classes2.dex */
final class hib extends IConstraintHost.Stub {
    final /* synthetic */ hic a;

    public hib(hic hicVar) {
        this.a = hicVar;
    }

    @Override // androidx.car.app.constraints.IConstraintHost
    public final int getContentLimit(int i) {
        hic hicVar = this.a;
        if (!hicVar.b) {
            gks.j("CarApp.H.Con", "Accessed getContentLimit after host became invalidated");
        }
        int iA = hicVar.a.w().a(i);
        gns gnsVarK = hicVar.a.k();
        gnq gnqVarA = gnr.a(19);
        gnqVarA.h = xxh.h(new gnm(i, iA));
        gnsVarK.d(gnqVarA);
        return iA;
    }

    @Override // androidx.car.app.constraints.IConstraintHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.constraints.IConstraintHost
    public final boolean isAppDrivenRefreshEnabled() {
        hic hicVar = this.a;
        if (!hicVar.b) {
            gks.j("CarApp.H.Con", "Accessed isAppDrivenRefreshEnabled after host became invalidated");
        }
        return ((ggk) hicVar.a.F(ggk.class)).h();
    }
}

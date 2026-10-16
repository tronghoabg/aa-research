package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class dmy implements ctp {
    final /* synthetic */ dnq a;
    final /* synthetic */ dlr b;

    public dmy(dnq dnqVar, dlr dlrVar) {
        this.a = dnqVar;
        this.b = dlrVar;
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        this.a.e = this.b;
        return ctsVar.eK(0, 0, afbf.a, new dmw(2));
    }
}

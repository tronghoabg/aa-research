package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class khu extends kwt {
    final /* synthetic */ Long a;
    final /* synthetic */ Long h;
    final /* synthetic */ khx i;

    public khu(khx khxVar, Long l, Long l2) {
        this.a = l;
        this.h = l2;
        this.i = khxVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kwt
    public final eqj a() {
        gms gmsVarJ = this.i.h().j();
        HashMap map = new HashMap();
        ?? r0 = gmsVarJ.a;
        for (qdg qdgVar : r0.keySet()) {
            Long l = this.h;
            Long l2 = this.a;
            map.put(qdgVar, ((kic) r0.get(qdgVar)).c(l2, l));
        }
        return khx.g(szp.l(qcz.b(map)));
    }

    @Override // defpackage.kwt
    public final eqj b() {
        return khx.g(szp.l(this.i.h().d().c(this.a, this.h)));
    }
}

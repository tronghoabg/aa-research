package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class khw extends kwt {
    final /* synthetic */ Long a;
    final /* synthetic */ khx h;

    public khw(khx khxVar, Long l) {
        this.a = l;
        this.h = khxVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kwt
    public final eqj a() {
        gms gmsVarJ = this.h.h().j();
        HashMap map = new HashMap();
        ?? r0 = gmsVarJ.a;
        for (qdg qdgVar : r0.keySet()) {
            Long l = this.a;
            map.put(qdgVar, ((kic) r0.get(qdgVar)).b(l));
        }
        return khx.g(szp.l(qcz.b(map)));
    }

    @Override // defpackage.kwt
    public final eqj b() {
        return khx.g(szp.l(this.h.h().d().b(this.a)));
    }
}

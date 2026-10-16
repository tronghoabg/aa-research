package defpackage;

import j$.time.LocalDate;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class khv extends kwt {
    final /* synthetic */ LocalDate a;
    final /* synthetic */ khx h;

    public khv(khx khxVar, LocalDate localDate) {
        this.a = localDate;
        this.h = khxVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kwt
    public final eqj a() {
        gms gmsVarJ = this.h.h().j();
        HashMap map = new HashMap();
        ?? r0 = gmsVarJ.a;
        for (qdg qdgVar : r0.keySet()) {
            LocalDate localDate = this.a;
            map.put(qdgVar, ((kic) r0.get(qdgVar)).a(localDate));
        }
        return khx.g(szp.l(qcz.b(map)));
    }

    @Override // defpackage.kwt
    public final eqj b() {
        return khx.g(szp.l(this.h.h().d().a(this.a)));
    }
}

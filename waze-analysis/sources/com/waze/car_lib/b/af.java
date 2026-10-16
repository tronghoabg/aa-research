package com.waze.car_lib.b;

import com.waze.R;
import com.waze.jh;
import com.waze.ji;
import com.waze.jj;
import com.waze.jl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f18954a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18955b;

    af(Object obj, int i2) {
        this.f18955b = i2;
        this.f18954a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlinx.coroutines.a.ad] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f18955b;
        if (i2 == 0) {
            if (((Boolean) obj).booleanValue()) {
                Object obj2 = this.f18954a;
                ap apVar = (ap) obj2;
                apVar.v.c(new com.waze.car_lib.p.aj(new com.waze.car_lib.p.ak(apVar.f18984d.c(R.string.AAOS_LCV_WARNING_POPUP_TITLE, new Object[0]), apVar.f18984d.c(R.string.AAOS_LCV_WARNING_POPUP_MESSAGE, new Object[0]), com.waze.car_lib.p.ag.f20542a, new com.waze.car_lib.p.af(apVar.f18984d.c(R.string.AAOS_LCV_WARNING_POPUP_BUTTON, new Object[0]), true, false), null, null, 48), new l(10), new l(11), new com.waze.b.g(obj2, 8)));
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objG = this.f18954a.g((r) obj, eVar);
            return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
        }
        if (i2 == 2) {
            ((com.waze.navigate.a.b) obj).a().a();
            ap apVar2 = (ap) this.f18954a;
            ap.F(apVar2, ap.M(apVar2));
            apVar2.m.f();
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            ((ap) this.f18954a).U((jl) obj);
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            ap apVar3 = (ap) this.f18954a;
            r rVar = (r) apVar3.t.d();
            if (rVar != null) {
                apVar3.J(new u(com.waze.alerters.a.a.f14136e), rVar.c());
            }
            return h.ab.f48028a;
        }
        jj jjVar = (jj) obj;
        if (h.g.b.x.n(jjVar, jh.f24940a)) {
            ((ap) this.f18954a).Q();
        } else {
            if (!(jjVar instanceof ji)) {
                throw new h.i();
            }
            ((ap) this.f18954a).T();
        }
        return h.ab.f48028a;
    }
}

package com.waze.app_nav.hub;

import h.g.b.aq;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f15406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f15407b;

    w(af afVar, aq aqVar) {
        this.f15406a = afVar;
        this.f15407b = aqVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.app_nav.hub.b.k kVar = (com.waze.app_nav.hub.b.k) ((h.k) obj).a();
        af afVar = this.f15406a;
        if (!afVar.isFinishing()) {
            com.waze.shared_infra.i.e eVarC = afVar.al().c();
            Objects.toString(kVar);
            eVarC.e("show popup: ".concat(String.valueOf(kVar)));
            aq aqVar = this.f15407b;
            af.ar(afVar, h.g.b.x.n(aqVar.f48105a, kVar));
            aqVar.f48105a = kVar;
            if (kVar != null) {
                try {
                    afVar.al().c().a("creating popup " + kVar);
                    com.waze.app_nav.hub.b.i iVarCreate = kVar.b().create(afVar);
                    af.as(afVar, iVarCreate, kVar);
                    afVar.aaS = iVarCreate;
                } catch (Exception e2) {
                    af afVar2 = this.f15406a;
                    afVar2.al().c().g("failed to create dialog ".concat(String.valueOf(e2.getMessage())));
                    af.an(afVar2).a(e2, null);
                }
            }
        }
        return h.ab.f48028a;
    }
}

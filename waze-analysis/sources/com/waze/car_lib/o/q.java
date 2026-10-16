package com.waze.car_lib.o;

import com.waze.navigate.en;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    private final List f20482a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20483b;

    /* renamed from: c, reason: collision with root package name */
    private final af f20484c;

    /* renamed from: d, reason: collision with root package name */
    private p f20485d;

    public q(en enVar, List list, kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(list, "monitoredConfigs");
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(eVar, "logger");
        this.f20482a = list;
        this.f20483b = eVar;
        af afVarE = aj.e(abVar);
        this.f20484c = afVarE;
        this.f20485d = new p(false, h.a.i.h());
        ai.m(ai.K(enVar.ag(), new o(this, null)), afVarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List f() {
        List list = this.f20482a;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.config.d) ((com.google.firebase.messaging.l) it.next()).f10212a).b());
        }
        return arrayList;
    }

    @Override // com.waze.car_lib.o.n
    public final boolean a() {
        return this.f20485d.b() && !h.g.b.x.n(this.f20485d.a(), f());
    }
}

package com.waze.network.b;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final bg f32106a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32107b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.f.q[] f32108c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.n f32109d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32110e;

    public x(kotlinx.coroutines.ab abVar, bg bgVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(bgVar, "commandClient");
        h.g.b.x.f(eVar, "logger");
        this.f32106a = bgVar;
        this.f32107b = eVar;
        com.waze.sharedui.f.q[] qVarArrValues = com.waze.sharedui.f.q.values();
        this.f32108c = qVarArrValues;
        this.f32109d = com.waze.shared_infra.q.m.a(true);
        int length = qVarArrValues.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(new bc(this.f32108c[i2].name(), this.f32109d, abVar, this.f32106a, this.f32107b));
        }
        this.f32110e = arrayList;
    }

    @Override // com.waze.network.b.ab
    public final com.waze.shared_infra.s.d a(com.waze.network.g.a aVar, aa aaVar) {
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        h.g.b.x.f(aaVar, "resultHandler");
        Objects.toString(aVar);
        this.f32107b.a("enqueue msg: ".concat(aVar.toString()));
        com.waze.sharedui.f.q qVarG = aVar.g();
        if (qVarG == null) {
            qVarG = com.waze.sharedui.f.q.f38922a;
        }
        return ((bc) this.f32110e.get(qVarG.ordinal())).a(aVar, aaVar);
    }

    @Override // com.waze.network.b.ab
    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f32110e.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((bc) it.next()).b());
        }
        return linkedHashMap;
    }

    @Override // com.waze.network.b.ab
    public final void c(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "predicate");
        Iterator it = this.f32110e.iterator();
        while (it.hasNext()) {
            ((bc) it.next()).c(lVar);
        }
    }
}

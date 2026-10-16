package com.waze.insights_infra;

import com.waze.ap.b.n;
import com.waze.ap.b.o;
import e.a.h.s;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.m;
import java.util.Objects;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f24698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f24699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f24698a = dVar;
        this.f24699b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f24698a, this.f24699b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        d dVar = this.f24698a;
        dVar.f24701b.a("requesting config");
        try {
            n nVar = dVar.f24700a;
            objA = (com.waze.ap.b.d) s.c(nVar.getChannel(), o.b(), nVar.getCallOptions(), com.waze.ap.b.b.newBuilder().build());
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        d dVar2 = this.f24698a;
        Throwable thC = m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.e eVar = dVar2.f24701b;
            Objects.toString(thC);
            eVar.g("failed to load config: ".concat(thC.toString()));
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        com.waze.ap.b.d dVar3 = (com.waze.ap.b.d) objA;
        com.waze.shared_infra.i.e eVar2 = dVar2.f24701b;
        Integer num = dVar3 != null ? new Integer(dVar3.getSerializedSize()) : null;
        Objects.toString(num);
        eVar2.a("loaded config size=".concat(String.valueOf(num)));
        this.f24699b.invoke(dVar3);
        return ab.f48028a;
    }
}

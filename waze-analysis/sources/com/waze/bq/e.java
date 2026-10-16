package com.waze.bq;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17246a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f17247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f17247b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        e eVar2 = new e(this.f17247b, eVar);
        eVar2.f17246a = obj;
        return eVar2;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        a aVar2 = (a) this.f17246a;
        com.waze.shared_infra.i.e eVar = this.f17247b.f17248a;
        Objects.toString(aVar2);
        eVar.a("setStateTo : ".concat(String.valueOf(aVar2)));
        return ab.f48028a;
    }
}

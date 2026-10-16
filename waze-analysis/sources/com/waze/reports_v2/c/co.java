package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class co extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cp f34348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    co(cp cpVar, h.c.e eVar) {
        super(5, eVar);
        this.f34348a = cpVar;
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new co(this.f34348a, (h.c.e) obj5).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(this.f34348a.h());
    }
}

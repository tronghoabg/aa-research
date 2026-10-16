package com.waze.ab;

import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f13778a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.messages.c f13779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, com.waze.messages.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f13778a = fVar;
        this.f13779b = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f13778a, this.f13779b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        f.d(this.f13778a, this.f13779b);
        return h.ab.f48028a;
    }
}

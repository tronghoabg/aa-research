package com.waze.am;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f14317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f14317b = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        f fVar = new f(this.f14317b, eVar);
        fVar.f14316a = obj;
        return fVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((a) this.f14316a).ordinal() < this.f14317b.ordinal());
    }
}

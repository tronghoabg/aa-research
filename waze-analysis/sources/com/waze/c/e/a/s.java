package com.waze.c.e.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f18469b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f18469b, eVar);
        sVar.f18468a = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((c) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        c cVar = (c) this.f18468a;
        boolean z = false;
        if (!cVar.b().h().isEmpty() && ((Boolean) this.f18469b.invoke(cVar.a())).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hf extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hl f40132a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gu f40133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hf(hl hlVar, gu guVar, h.c.e eVar) {
        super(3, eVar);
        this.f40132a = hlVar;
        this.f40133b = guVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new hf(this.f40132a, this.f40133b, (h.c.e) obj3).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f40132a.f40154d.a("signalEndOfStream");
        this.f40133b.b();
        return h.ab.f48028a;
    }
}

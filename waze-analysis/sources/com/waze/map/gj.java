package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gj extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f29154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.ch f29155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gj(kotlinx.coroutines.b.ch chVar, h.c.e eVar) {
        super(1, eVar);
        this.f29155b = chVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new gj(this.f29155b, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((gj) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f29154a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f29154a = 1;
        Object objI = kotlinx.coroutines.b.ai.i(this.f29155b, new gi(null, 0), this);
        return objI == aVar ? aVar : objI;
    }
}

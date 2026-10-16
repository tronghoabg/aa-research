package com.waze.sound;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40357a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f40358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(CompletableDeferred completableDeferred, h.c.e eVar) {
        super(2, eVar);
        this.f40358b = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f40358b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40357a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f40357a = 1;
        Object objC = this.f40358b.c(this);
        return objC == aVar ? aVar : objC;
    }
}

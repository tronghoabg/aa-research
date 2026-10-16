package com.waze.t.b;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class at extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f40692a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ch f40693b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f40694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(az azVar, ch chVar, h.c.e eVar) {
        super(2, eVar);
        this.f40692a = azVar;
        this.f40693b = chVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        at atVar = new at(this.f40692a, this.f40693b, eVar);
        atVar.f40694c = obj;
        return atVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((at) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f40694c;
        az azVar = this.f40692a;
        ch chVar = this.f40693b;
        kotlinx.coroutines.aj.z(afVar, null, null, new aa(azVar, chVar, (h.c.e) null, 4), 3);
        return kotlinx.coroutines.aj.z(afVar, null, null, new aa(azVar, chVar, (h.c.e) null, 5, (byte[]) null), 3);
    }
}

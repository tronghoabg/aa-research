package com.waze.app_nav.hub;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.app_nav.hub.b.e f15369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(com.waze.app_nav.hub.b.e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f15369a = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f15369a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f15369a.c();
        return h.ab.f48028a;
    }
}

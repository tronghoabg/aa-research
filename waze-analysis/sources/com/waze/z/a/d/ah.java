package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f45919a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f45919a = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ah(this.f45919a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f45919a.invoke(l.f45966a);
        return h.ab.f48028a;
    }
}

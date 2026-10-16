package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f18508a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f18509b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ al f18510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(bi biVar, kotlinx.coroutines.af afVar, al alVar, h.c.e eVar) {
        super(2, eVar);
        this.f18508a = biVar;
        this.f18509b = afVar;
        this.f18510c = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ai(this.f18508a, this.f18509b, this.f18510c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bi biVar = this.f18508a;
        if ((biVar.b().a() instanceof c) && biVar.a() == com.waze.c.a.a.f18216a) {
            kotlinx.coroutines.aj.z(this.f18509b, null, null, new ah(this.f18510c, (h.c.e) null, 0), 3);
        }
        return h.ab.f48028a;
    }
}

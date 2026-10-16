package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15570a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bj f15571b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f15572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bj bjVar, h.c.e eVar) {
        super(2, eVar);
        this.f15571b = bjVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bi biVar = new bi(this.f15571b, eVar);
        biVar.f15572c = obj;
        return biVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15570a != 0) {
            afVar = (kotlinx.coroutines.af) this.f15572c;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f15572c;
            this.f15572c = afVar2;
            this.f15570a = 1;
            if (kotlinx.coroutines.aj.q(h.o.a.m(this.f15571b.f15574b.a()), this) == aVar) {
                return aVar;
            }
            afVar = afVar2;
        }
        if (kotlinx.coroutines.aj.j(afVar)) {
            this.f15571b.m();
        }
        return h.ab.f48028a;
    }
}

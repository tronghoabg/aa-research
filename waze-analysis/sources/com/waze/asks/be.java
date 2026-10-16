package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class be extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bj f15562b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bd f15563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bj bjVar, bd bdVar, h.c.e eVar) {
        super(2, eVar);
        this.f15562b = bjVar;
        this.f15563c = bdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new be(this.f15562b, this.f15563c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((be) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15561a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bj bjVar = this.f15562b;
            bd bdVar = this.f15563c;
            this.f15561a = 1;
            if (bjVar.f15581i.emit(bdVar, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

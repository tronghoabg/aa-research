package com.waze.uid.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bh extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bl f44272a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f44273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bl blVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f44272a = blVar;
        this.f44273b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bh(this.f44272a, this.f44273b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bh) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f44272a.j(new com.waze.uid.state_impl.b.c(this.f44273b));
        return h.ab.f48028a;
    }
}

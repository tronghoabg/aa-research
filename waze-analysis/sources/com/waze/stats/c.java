package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f40580b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, Object obj, h.c.e eVar2) {
        super(2, eVar2);
        this.f40580b = eVar;
        this.f40581c = obj;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f40580b, this.f40581c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40579a != 0) {
            e.b.c.b(obj);
            ((h.m) obj).b();
        } else {
            e.b.c.b(obj);
            this.f40579a = 1;
            if (e.b(this.f40580b, this.f40581c, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

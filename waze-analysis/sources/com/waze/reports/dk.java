package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dk extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f33854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dk(Runnable runnable, h.c.e eVar) {
        super(2, eVar);
        this.f33854b = runnable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new dk(this.f33854b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dk) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f33853a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f33853a = 1;
            if (kotlinx.coroutines.aj.q(200L, this) == aVar) {
                return aVar;
            }
        }
        this.f33854b.run();
        return h.ab.f48028a;
    }
}

package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f14193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(y yVar, h.c.e eVar) {
        super(2, eVar);
        this.f14193b = yVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f14193b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14192a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            y yVar = this.f14193b;
            this.f14192a = 1;
            if (yVar.f14211d.emit(yVar.f14210c, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

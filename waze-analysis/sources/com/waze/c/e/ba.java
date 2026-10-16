package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ba extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18559a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f18560b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f18561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bc bcVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f18560b = bcVar;
        this.f18561c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ba(this.f18560b, this.f18561c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ba) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18559a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bc bcVar = this.f18560b;
            boolean z = this.f18561c;
            this.f18559a = 1;
            if (bcVar.f18569c.l(z, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

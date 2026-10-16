package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45916a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f45917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f45917b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new af(this.f45917b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45916a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f45916a = 1;
            if (this.f45917b.a(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

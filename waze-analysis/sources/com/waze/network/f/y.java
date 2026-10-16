package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32366a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f32367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f32367b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new y(this.f32367b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32366a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32366a = 1;
            if (ab.d(this.f32367b, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

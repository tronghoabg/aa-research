package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34638a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ az f34639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(az azVar, h.c.e eVar) {
        super(2, eVar);
        this.f34639b = azVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ah(this.f34639b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34638a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f34638a = 1;
            if (this.f34639b.f(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

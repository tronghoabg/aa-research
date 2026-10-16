package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class iy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f24836a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    iy(at atVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f24837b = i2;
        this.f24836a = atVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f24837b != 0 ? new iy((at) this.f24836a, eVar, 1) : new iy((Runnable) this.f24836a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f24837b != 0 ? ((iy) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((iy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f24837b == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f24836a.run();
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        at atVar = (at) this.f24836a;
        kotlinx.coroutines.aj.z(atVar.f15646b, null, null, new ly(atVar, (h.c.e) null, 1), 3);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    iy(Runnable runnable, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f24837b = i2;
        this.f24836a = runnable;
    }
}

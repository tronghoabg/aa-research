package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f18948a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18949b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(h.g.b.am amVar, com.waze.an.a.b bVar, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f18950c = i2;
        this.f18948a = amVar;
        this.f18949b = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.an.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.an.a.b, java.lang.Object] */
    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f18950c != 0) {
            return new ad(this.f18948a, (com.waze.an.a.b) this.f18949b, (h.c.e) obj3, 1).invokeSuspend(h.ab.f48028a);
        }
        return new ad(this.f18948a, (com.waze.an.a.l) this.f18949b, (h.c.e) obj3, 0).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.an.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.waze.an.a.b, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f18950c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            h.g.b.am amVar = this.f18948a;
            if (amVar.f48101a) {
                amVar.f48101a = false;
                this.f18949b.k();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.g.b.am amVar2 = this.f18948a;
        if (amVar2.f48101a) {
            amVar2.f48101a = false;
            this.f18949b.k();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(h.g.b.am amVar, com.waze.an.a.l lVar, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f18950c = i2;
        this.f18948a = amVar;
        this.f18949b = lVar;
    }
}

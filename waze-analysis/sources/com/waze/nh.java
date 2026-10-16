package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class nh extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32428a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ long f32429b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nl f32430c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.b.ap f32431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nh(nl nlVar, h.g.b.ap apVar, h.c.e eVar) {
        super(2, eVar);
        this.f32430c = nlVar;
        this.f32431d = apVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        nh nhVar = new nh(this.f32430c, this.f32431d, eVar);
        nhVar.f32429b = ((Number) obj).longValue();
        return nhVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nh) create(Long.valueOf(((Number) obj).longValue()), (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        long j2;
        long j3;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32428a == 0) {
            e.b.c.b(obj);
            j2 = this.f32429b;
            nl nlVar = this.f32430c;
            nlVar.f32532g.a("User ID changed to " + j2);
            if (this.f32431d.f48104a != 0) {
                this.f32429b = j2;
                this.f32428a = 1;
                if (nl.f(nlVar, this) == aVar) {
                    return aVar;
                }
                j3 = j2;
            }
            this.f32431d.f48104a = j2;
            return h.ab.f48028a;
        }
        j3 = this.f32429b;
        e.b.c.b(obj);
        j2 = j3;
        this.f32431d.f48104a = j2;
        return h.ab.f48028a;
    }
}

package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class db extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41322a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f41323b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f41324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    db(de deVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f41323b = deVar;
        this.f41324c = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new db(this.f41323b, this.f41324c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((db) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f41322a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                de deVar = this.f41323b;
                int i2 = this.f41324c;
                this.f41322a = 1;
                if (deVar.l(i2, this) == aVar) {
                    return aVar;
                }
            }
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        de deVar2 = this.f41323b;
        if (h.m.e(objA)) {
            deVar2.q.a("Reported End of Trip Overview to BE successfully");
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            deVar2.q.c("Failed to report End of Trip Overview to BE", thC);
        }
        return h.ab.f48028a;
    }
}

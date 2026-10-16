package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class by extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f28450a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(bz bzVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28451b = i2;
        this.f28450a = bzVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f28451b;
        Object obj2 = this.f28450a;
        return i2 != 0 ? new by((h) obj2, eVar, 1) : new by((bz) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f28451b != 0 ? ((by) create((eb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((by) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f28451b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((h) this.f28450a).f29194b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bz bzVar = (bz) this.f28450a;
        bzVar.f28456e = h.a.r.j();
        bzVar.f28452a.clear();
        kotlinx.coroutines.aj.h(bzVar.f28455d, null);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28451b = i2;
        this.f28450a = hVar;
    }
}

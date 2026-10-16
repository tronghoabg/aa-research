package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ce extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19449a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f19450b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ch f19451c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f19452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ce(kotlinx.coroutines.af afVar, ch chVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19452d = i2;
        this.f19450b = afVar;
        this.f19451c = chVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f19452d != 0) {
            ce ceVar = new ce(this.f19450b, this.f19451c, eVar, 1, null);
            ceVar.f19449a = obj;
            return ceVar;
        }
        ce ceVar2 = new ce(this.f19450b, this.f19451c, eVar, 0);
        ceVar2.f19449a = obj;
        return ceVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f19452d != 0 ? ((ce) create((Boolean) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ce) create((com.waze.n.ac) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f19452d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (h.g.b.x.n((Boolean) this.f19449a, false)) {
                kotlinx.coroutines.aj.z(this.f19450b, null, null, new aw(this.f19451c, (h.c.e) null, 3), 3);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (!(((com.waze.n.ac) this.f19449a) instanceof com.waze.car_lib.r.i)) {
            throw new h.i();
        }
        kotlinx.coroutines.aj.z(this.f19450b, null, null, new aw(this.f19451c, (h.c.e) null, 4, (byte[]) null), 3);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ce(kotlinx.coroutines.af afVar, ch chVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f19452d = i2;
        this.f19450b = afVar;
        this.f19451c = chVar;
    }
}

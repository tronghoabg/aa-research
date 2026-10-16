package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class by extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40765a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40766b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f40766b != 0) {
            by byVar = new by(eVar, 1, null);
            byVar.f40765a = obj;
            return byVar;
        }
        by byVar2 = new by(eVar, 0);
        byVar2.f40765a = obj;
        return byVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40766b != 0 ? ((by) create((bw) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((by) create((bw) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f40766b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((bw) this.f40765a) instanceof bs);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(!(((bw) this.f40765a) instanceof bt));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f40766b = i2;
    }
}

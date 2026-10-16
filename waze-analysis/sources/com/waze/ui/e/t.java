package com.waze.ui.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f42241a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f42242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(v vVar, h.c.e eVar, int i2) {
        super(1, eVar);
        this.f42242b = i2;
        this.f42241a = vVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(h.c.e eVar) {
        return this.f42242b != 0 ? new t(this.f42241a, eVar, 1, null) : new t(this.f42241a, eVar, 0);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        return this.f42242b != 0 ? ((t) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a) : ((t) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f42242b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f42241a.j(x.f42258g);
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f42241a.j(x.f42252a);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(v vVar, h.c.e eVar, int i2, byte[] bArr) {
        super(1, eVar);
        this.f42242b = i2;
        this.f42241a = vVar;
    }
}

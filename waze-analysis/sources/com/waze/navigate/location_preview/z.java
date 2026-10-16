package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f31778a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f31779b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f31780c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(h.g.a.p pVar, int i2, h.c.e eVar, int i3) {
        super(1, eVar);
        this.f31781d = i3;
        this.f31779b = pVar;
        this.f31780c = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(h.c.e eVar) {
        int i2 = this.f31781d;
        return i2 != 0 ? i2 != 1 ? new z(this.f31779b, this.f31780c, eVar, 2, (char[]) null) : new z(this.f31779b, this.f31780c, eVar, 1, (byte[]) null) : new z(this.f31779b, this.f31780c, eVar, 0);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f31781d;
        return i2 != 0 ? i2 != 1 ? ((z) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a) : ((z) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a) : ((z) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f31781d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31778a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                h.g.a.p pVar = this.f31779b;
                com.waze.ui.m.be beVar = new com.waze.ui.m.be(this.f31780c, 5);
                this.f31778a = 1;
                if (pVar.invoke(beVar, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f31778a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                h.g.a.p pVar2 = this.f31779b;
                com.waze.ui.m.be beVar2 = new com.waze.ui.m.be(this.f31780c, 7);
                this.f31778a = 1;
                if (pVar2.invoke(beVar2, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f31778a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.g.a.p pVar3 = this.f31779b;
            com.waze.ui.m.be beVar3 = new com.waze.ui.m.be(this.f31780c, 8);
            this.f31778a = 1;
            if (pVar3.invoke(beVar3, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(h.g.a.p pVar, int i2, h.c.e eVar, int i3, byte[] bArr) {
        super(1, eVar);
        this.f31781d = i3;
        this.f31779b = pVar;
        this.f31780c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(h.g.a.p pVar, int i2, h.c.e eVar, int i3, char[] cArr) {
        super(1, eVar);
        this.f31781d = i3;
        this.f31779b = pVar;
        this.f31780c = i2;
    }
}

package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28019a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f28020b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bd bdVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28021c = i2;
        this.f28020b = bdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f28021c;
        if (i2 == 0) {
            ar arVar = new ar(this.f28020b, eVar, 0);
            arVar.f28019a = obj;
            return arVar;
        }
        if (i2 != 1) {
            ar arVar2 = new ar(this.f28020b, eVar, 2, (char[]) null);
            arVar2.f28019a = obj;
            return arVar2;
        }
        ar arVar3 = new ar(this.f28020b, eVar, 1, (byte[]) null);
        arVar3.f28019a = obj;
        return arVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f28021c;
        return i2 != 0 ? i2 != 1 ? ((ar) create((com.waze.map.canvas.bj) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ar) create((dm) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ar) create((dk) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f28021c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f28020b.p.e((dk) this.f28019a);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f28020b.f28065l.e((com.waze.map.canvas.bj) this.f28019a);
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f28020b.q.e((dm) this.f28019a);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bd bdVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f28021c = i2;
        this.f28020b = bdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bd bdVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f28021c = i2;
        this.f28020b = bdVar;
    }
}

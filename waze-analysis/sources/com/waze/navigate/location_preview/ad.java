package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31497a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f31498b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ai f31499c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f31500d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ay f31501e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bm f31502f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f31503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ai aiVar, kotlinx.coroutines.b.bn bnVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31503g = i2;
        this.f31499c = aiVar;
        this.f31500d = bnVar;
        this.f31501e = ayVar;
        this.f31502f = bmVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f31503g;
        if (i2 == 0) {
            ad adVar = new ad(this.f31499c, this.f31500d, this.f31501e, this.f31502f, eVar, 0);
            adVar.f31498b = obj;
            return adVar;
        }
        if (i2 == 1) {
            ad adVar2 = new ad(this.f31499c, this.f31500d, this.f31501e, this.f31502f, eVar, 1, (byte[]) null);
            adVar2.f31498b = obj;
            return adVar2;
        }
        if (i2 != 2) {
            ad adVar3 = new ad(this.f31499c, this.f31500d, this.f31501e, this.f31502f, eVar, 3, (short[]) null);
            adVar3.f31498b = obj;
            return adVar3;
        }
        ad adVar4 = new ad(this.f31499c, this.f31500d, this.f31501e, this.f31502f, eVar, 2, (char[]) null);
        adVar4.f31498b = obj;
        return adVar4;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f31503g;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((ad) create((com.waze.ui.m.cb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((com.waze.ui.m.cb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((com.waze.ui.m.cb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((com.waze.ui.m.cb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f31503g;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31497a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.ui.m.cb cbVar = (com.waze.ui.m.cb) this.f31498b;
                this.f31497a = 1;
                if (this.f31499c.a(cbVar, this.f31500d, this.f31501e, this.f31502f, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f31497a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.ui.m.cb cbVar2 = (com.waze.ui.m.cb) this.f31498b;
                this.f31497a = 1;
                if (this.f31499c.a(cbVar2, this.f31500d, this.f31501e, this.f31502f, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f31497a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.ui.m.cb cbVar3 = (com.waze.ui.m.cb) this.f31498b;
                this.f31497a = 1;
                if (this.f31499c.a(cbVar3, this.f31500d, this.f31501e, this.f31502f, this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f31497a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.ui.m.cb cbVar4 = (com.waze.ui.m.cb) this.f31498b;
            this.f31497a = 1;
            if (this.f31499c.a(cbVar4, this.f31500d, this.f31501e, this.f31502f, this) == aVar4) {
                return aVar4;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ai aiVar, kotlinx.coroutines.b.bn bnVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f31503g = i2;
        this.f31499c = aiVar;
        this.f31500d = bnVar;
        this.f31501e = ayVar;
        this.f31502f = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ai aiVar, kotlinx.coroutines.b.bn bnVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f31503g = i2;
        this.f31499c = aiVar;
        this.f31500d = bnVar;
        this.f31501e = ayVar;
        this.f31502f = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ai aiVar, kotlinx.coroutines.b.bn bnVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f31503g = i2;
        this.f31499c = aiVar;
        this.f31500d = bnVar;
        this.f31501e = ayVar;
        this.f31502f = bmVar;
    }
}

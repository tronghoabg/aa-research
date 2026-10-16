package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class eu extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28860a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f28861b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f28862c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f28863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(cx cxVar, com.waze.map.canvas.a.e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f28863d = i2;
        this.f28861b = cxVar;
        this.f28862c = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f28863d;
        if (i2 == 0) {
            return new eu((cx) this.f28861b, (com.waze.map.canvas.a.e) this.f28862c, eVar, 0);
        }
        if (i2 == 1) {
            return new eu((kotlinx.coroutines.b.k) this.f28862c, (bz) this.f28861b, eVar, 1);
        }
        if (i2 == 2) {
            return new eu((gb) this.f28861b, (com.waze.map.canvas.a.e) this.f28862c, eVar, 2);
        }
        if (i2 != 3) {
            return new eu((cx) this.f28861b, this.f28862c, eVar, 4, null);
        }
        return new eu((gb) this.f28862c, (cx) this.f28861b, eVar, 3);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f28863d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((eu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((eu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((eu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((eu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((eu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f28863d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f28860a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f28861b;
                ?? r3 = this.f28862c;
                this.f28860a = 1;
                if (kotlinx.coroutines.b.ai.e(((cx) obj2).a(), new et(r3, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f28860a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f28860a = 1;
                if (this.f28862c.collect(new ew(this.f28861b, 1), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f28860a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f28861b;
                ?? r32 = this.f28862c;
                this.f28860a = 1;
                if (kotlinx.coroutines.b.ai.e(((gb) obj3).f29138k, new ev(r32, null), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f28860a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f28860a = 1;
                if (((gb) this.f28862c).o.a().collect(new ew(this.f28861b, 0), this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar5 = h.c.a.a.f48038a;
        if (this.f28860a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj4 = this.f28861b;
            Object obj5 = this.f28862c;
            this.f28860a = 1;
            if (((cx) obj4).g().collect(new ew(obj5, 2), this) == aVar5) {
                return aVar5;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(cx cxVar, com.waze.map.canvas.a.e eVar, h.c.e eVar2, int i2, byte[] bArr) {
        super(2, eVar2);
        this.f28863d = i2;
        this.f28861b = cxVar;
        this.f28862c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(gb gbVar, com.waze.map.canvas.a.e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f28863d = i2;
        this.f28861b = gbVar;
        this.f28862c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(gb gbVar, cx cxVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28863d = i2;
        this.f28862c = gbVar;
        this.f28861b = cxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(kotlinx.coroutines.b.k kVar, bz bzVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28863d = i2;
        this.f28862c = kVar;
        this.f28861b = bzVar;
    }
}

package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ak extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18965a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f18966b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(ap apVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18967c = i2;
        this.f18966b = apVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18967c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new ak(this.f18966b, eVar, 5, (boolean[]) null) : new ak(this.f18966b, eVar, 4, (int[]) null) : new ak(this.f18966b, eVar, 3, (short[]) null) : new ak(this.f18966b, eVar, 2, (char[]) null) : new ak(this.f18966b, eVar, 1, (byte[]) null) : new ak(this.f18966b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18967c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18967c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18965a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ap apVar = this.f18966b;
                this.f18965a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.p(new y(apVar, null)), new aj(apVar, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f18965a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ap apVar2 = this.f18966b;
                this.f18965a = 1;
                if (new ai(apVar2.f18992l.d(), 0).collect(new af(apVar2, 0), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f18965a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ap apVar3 = this.f18966b;
                this.f18965a = 1;
                if (new ai(apVar3.m.d(), 2).collect(new af(apVar3, 2), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f18965a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ap apVar4 = this.f18966b;
                this.f18965a = 1;
                if (apVar4.f18983c.b().collect(new af(apVar4, 3), this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f18965a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ap apVar5 = this.f18966b;
                this.f18965a = 1;
                if (new ai(com.waze.map.b.bf.b(apVar5.f18990j), 3).collect(new af(apVar5, 5), this) == aVar5) {
                    return aVar5;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        if (this.f18965a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ap apVar6 = this.f18966b;
            this.f18965a = 1;
            if (apVar6.f18983c.a().collect(new af(apVar6, 4), this) == aVar6) {
                return aVar6;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(ap apVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18967c = i2;
        this.f18966b = apVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(ap apVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18967c = i2;
        this.f18966b = apVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(ap apVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f18967c = i2;
        this.f18966b = apVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(ap apVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f18967c = i2;
        this.f18966b = apVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(ap apVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f18967c = i2;
        this.f18966b = apVar;
    }
}

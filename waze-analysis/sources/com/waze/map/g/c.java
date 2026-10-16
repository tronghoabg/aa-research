package com.waze.map.g;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29046a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f29047b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29048c = i2;
        this.f29047b = sVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f29048c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new c(this.f29047b, eVar, 5, (boolean[]) null) : new c(this.f29047b, eVar, 4, (int[]) null) : new c(this.f29047b, eVar, 3, (short[]) null) : new c(this.f29047b, eVar, 2, (char[]) null) : new c(this.f29047b, eVar, 1, (byte[]) null) : new c(this.f29047b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f29048c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f29048c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f29046a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                s sVar = this.f29047b;
                this.f29046a = 1;
                if (new o(sVar.f29092a.x(), 1).collect(new d(sVar, 1), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f29046a == 0) {
                e.b.c.b(obj);
                s sVar2 = this.f29047b;
                bq bqVarY = sVar2.f29101j.Y();
                this.f29046a = 1;
                if (ai.e(bqVarY, new i(sVar2, null, 1, null), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f29046a == 0) {
                e.b.c.b(obj);
                s sVar3 = this.f29047b;
                this.f29046a = 1;
                if (sVar3.f29097f.a().collect(new d(sVar3, 2), this) == aVar3) {
                    return aVar3;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f29046a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                s sVar4 = this.f29047b;
                this.f29046a = 1;
                if (sVar4.o.f().collect(new d(sVar4, 5), this) == aVar4) {
                    return aVar4;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f29046a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                s sVar5 = this.f29047b;
                this.f29046a = 1;
                if (sVar5.f29096e.collect(new d(sVar5, 8), this) == aVar5) {
                    return aVar5;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        if (this.f29046a == 0) {
            e.b.c.b(obj);
            s sVar6 = this.f29047b;
            this.f29046a = 1;
            if (sVar6.f29097f.b().collect(new d(sVar6, 6), this) == aVar6) {
                return aVar6;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29048c = i2;
        this.f29047b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f29048c = i2;
        this.f29047b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f29048c = i2;
        this.f29047b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f29048c = i2;
        this.f29047b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f29048c = i2;
        this.f29047b = sVar;
    }
}

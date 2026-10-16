package com.waze.c.e.a;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18426a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f18427b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18428c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new e(this.f18427b, eVar, 6, (float[]) null) : new e(this.f18427b, eVar, 5, (boolean[]) null) : new e(this.f18427b, eVar, 4, (int[]) null) : new e(this.f18427b, eVar, 3, (short[]) null) : new e(this.f18427b, eVar, 2, (char[]) null) : new e(this.f18427b, eVar, 1, (byte[]) null) : new e(this.f18427b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18428c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18428c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18426a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18426a = 1;
                if (t.i(this.f18427b, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f18426a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18426a = 1;
                if (t.i(this.f18427b, this) == aVar2) {
                    return aVar2;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f18426a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18426a = 1;
                if (t.d(this.f18427b, this) == aVar3) {
                    return aVar3;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f18426a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18426a = 1;
                if (t.f(this.f18427b, this) == aVar4) {
                    return aVar4;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f18426a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                t tVar = this.f18427b;
                this.f18426a = 1;
                if (ai.d(ai.K(new l(tVar.o.t()), new i(tVar, null)), this) == aVar5) {
                    return aVar5;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 5) {
            h.c.a.a aVar6 = h.c.a.a.f48038a;
            if (this.f18426a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                t tVar2 = this.f18427b;
                this.f18426a = 1;
                if (t.e(tVar2, (c) tVar2.m.d(), false, this) == aVar6) {
                    return aVar6;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar7 = h.c.a.a.f48038a;
        if (this.f18426a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            t tVar3 = this.f18427b;
            this.f18426a = 1;
            if (tVar3.o.o().collect(new o(tVar3, 1), this) == aVar7) {
                return aVar7;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(t tVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f18428c = i2;
        this.f18427b = tVar;
    }
}

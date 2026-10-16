package com.waze.main_screen.t;

import androidx.compose.runtime.SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27618a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27619b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27620c = i2;
        this.f27619b = amVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27620c;
        if (i2 == 0) {
            return new q((am) this.f27619b, eVar, 0);
        }
        if (i2 == 1) {
            return new q((am) this.f27619b, eVar, 1, (byte[]) null);
        }
        if (i2 == 2) {
            return new q((am) this.f27619b, eVar, 2, (char[]) null);
        }
        if (i2 == 3) {
            return new q((am) this.f27619b, eVar, 3, (short[]) null);
        }
        Object obj2 = this.f27619b;
        return i2 != 4 ? new q((aw) obj2, eVar, 5, (byte[]) null) : new q((aw) obj2, eVar, 4);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27620c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27620c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f27618a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f27618a = 1;
                if (((am) this.f27619b).a().i(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f27618a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f27618a = 1;
                if (((am) this.f27619b).a().i(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f27618a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f27619b;
                this.f27618a = 1;
                if (((am) obj2).s().e().collect(new w(obj2, 1), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f27618a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f27619b;
                this.f27618a = 1;
                if (kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new com.waze.car_lib.b.m(obj3, 8))).collect(new w(obj3, 0), this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f27618a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f27618a = 1;
                if (((aw) this.f27619b).e().a(this) == aVar5) {
                    return aVar5;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        if (this.f27618a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj4 = this.f27619b;
            this.f27618a = 1;
            if (kotlinx.coroutines.b.ai.y(new ah(((aw) obj4).f27525b.ag(), 2)).collect(new w(obj4, 6), this) == aVar6) {
                return aVar6;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(am amVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27620c = i2;
        this.f27619b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(am amVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27620c = i2;
        this.f27619b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(am amVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f27620c = i2;
        this.f27619b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(aw awVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27620c = i2;
        this.f27619b = awVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(aw awVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27620c = i2;
        this.f27619b = awVar;
    }
}

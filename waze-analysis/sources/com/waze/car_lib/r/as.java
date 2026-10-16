package com.waze.car_lib.r;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class as extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20970a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f20971b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f20972c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(at atVar, com.waze.car_lib.f.dn dnVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20971b = atVar;
        this.f20972c = dnVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.waze.t.b.h, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f20973d;
        if (i2 == 0) {
            return new as((at) this.f20971b, (com.waze.car_lib.f.dn) this.f20972c, eVar, 0);
        }
        if (i2 == 1) {
            return new as((u) this.f20971b, (CarContext) this.f20972c, eVar, 1);
        }
        if (i2 == 2) {
            return new as((bs) this.f20972c, (kotlinx.coroutines.b.bn) this.f20971b, eVar, 2);
        }
        if (i2 == 3) {
            return new as((kotlinx.coroutines.b.k) this.f20971b, (by) this.f20972c, eVar, 3);
        }
        if (i2 == 4) {
            return new as((de) this.f20972c, (com.waze.t.b.h) this.f20971b, eVar, 4);
        }
        if (i2 == 5) {
            return new as((kotlinx.coroutines.b.ch) this.f20971b, (de) this.f20972c, eVar, 5);
        }
        return new as((fg) this.f20972c, (kotlinx.coroutines.b.bn) this.f20971b, eVar, 6);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f20973d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [com.waze.t.b.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f20973d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20970a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20970a = 1;
                obj = ((at) this.f20971b).f20975b.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            com.waze.shared_infra.i.h.c("LoginError force login: " + zBooleanValue);
            if (zBooleanValue) {
                ((com.waze.shared_infra.coordinators.s) this.f20972c).H(com.waze.car_lib.f.dq.f19498a);
            } else {
                at atVar = (at) this.f20971b;
                atVar.f20978e.setValue(at.c(atVar));
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f20970a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                u uVar = (u) this.f20971b;
                this.f20970a = 1;
                if (kotlinx.coroutines.b.ai.D(uVar.f21717l).collect(new q(uVar, (CarContext) this.f20972c), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f20970a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f20972c;
                Object obj3 = this.f20971b;
                this.f20970a = 1;
                if (((bs) obj2).f21085c.collect(new am(obj3, 8), this) == aVar3) {
                    return aVar3;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f20970a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20970a = 1;
                if (kotlinx.coroutines.b.ai.y(new bg(this.f20971b, 5)).collect(new am(this.f20972c, 9), this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f20970a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj4 = this.f20972c;
                this.f20970a = 1;
                if (de.h((de) obj4, this.f20971b, this) == aVar5) {
                    return aVar5;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 5) {
            h.c.a.a aVar6 = h.c.a.a.f48038a;
            if (this.f20970a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20970a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(new bg(com.waze.t.b.bz.d(this.f20971b), 7)), new cz((de) this.f20972c, null), this) == aVar6) {
                    return aVar6;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar7 = h.c.a.a.f48038a;
        if (this.f20970a == 0) {
            e.b.c.b(obj);
            Object obj5 = this.f20972c;
            Object obj6 = this.f20971b;
            this.f20970a = 1;
            if (((fg) obj5).f21636b.collect(new am(obj6, 15), this) == aVar7) {
                return aVar7;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(bs bsVar, kotlinx.coroutines.b.bn bnVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20972c = bsVar;
        this.f20971b = bnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(de deVar, com.waze.t.b.h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20972c = deVar;
        this.f20971b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(fg fgVar, kotlinx.coroutines.b.bn bnVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20972c = fgVar;
        this.f20971b = bnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(u uVar, CarContext carContext, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20971b = uVar;
        this.f20972c = carContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(kotlinx.coroutines.b.ch chVar, de deVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20971b = chVar;
        this.f20972c = deVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(kotlinx.coroutines.b.k kVar, by byVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20973d = i2;
        this.f20971b = kVar;
        this.f20972c = byVar;
    }
}

package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import com.waze.car_lib.f.hm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21038a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f21039b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f21040c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f21041d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f21042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(hm hmVar, ct ctVar, com.waze.car_lib.screens.core.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21042e = i2;
        this.f21039b = hmVar;
        this.f21041d = ctVar;
        this.f21040c = lVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f21042e;
        if (i2 == 0) {
            return new bi((bk) this.f21039b, (kotlinx.coroutines.af) this.f21040c, (kotlinx.coroutines.b.k) this.f21041d, eVar, 0);
        }
        if (i2 != 1) {
            Object obj2 = this.f21039b;
            return new bi((hm) obj2, (ct) this.f21041d, (com.waze.car_lib.screens.core.l) this.f21040c, eVar, 2);
        }
        Object obj3 = this.f21041d;
        return new bi((u) obj3, (com.waze.car_lib.b.a.a) this.f21040c, (CarContext) this.f21039b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f21042e;
        return i2 != 0 ? i2 != 1 ? ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f21042e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f21038a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f21039b;
                bk bkVar = (bk) obj2;
                bkVar.x().n(this.f21040c);
                ?? r6 = this.f21041d;
                this.f21038a = 1;
                if (kotlinx.coroutines.b.ai.t(bkVar.f21047b, r6, bkVar.x().m(), bkVar.f21052g.g(), bkVar.m, new bh(obj2)).collect(new am(obj2, 5), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f21038a == 0) {
                e.b.c.b(obj);
                hm hmVar = (hm) this.f21039b;
                kotlinx.coroutines.b.ch chVarD = hmVar.a().d();
                ct ctVar = (ct) this.f21041d;
                this.f21038a = 1;
                if (chVarD.collect(new cs(ctVar, hmVar, (com.waze.car_lib.screens.core.l) this.f21040c), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        try {
            if (this.f21038a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f21041d;
                String strC = ((com.waze.car_lib.b.a.a) this.f21040c).c();
                Object obj4 = this.f21039b;
                this.f21038a = 1;
                u uVar = (u) obj3;
                obj = uVar.m(strC, (CarContext) obj4, this);
                if (obj == aVar3) {
                    return aVar3;
                }
            }
            ((u) this.f21041d).l(com.waze.car_lib.b.bb.f19023a);
            return h.ab.f48028a;
        } catch (Throwable th) {
            ((u) this.f21041d).l(com.waze.car_lib.b.bb.f19023a);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bk bkVar, kotlinx.coroutines.af afVar, kotlinx.coroutines.b.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21042e = i2;
        this.f21039b = bkVar;
        this.f21040c = afVar;
        this.f21041d = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(u uVar, com.waze.car_lib.b.a.a aVar, CarContext carContext, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21042e = i2;
        this.f21041d = uVar;
        this.f21040c = aVar;
        this.f21039b = carContext;
    }
}

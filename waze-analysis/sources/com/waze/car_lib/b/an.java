package com.waze.car_lib.b;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class an extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18974a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CarContext f18975b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f18976c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f18977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ap apVar, CarContext carContext, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18977d = i2;
        this.f18976c = apVar;
        this.f18975b = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18977d;
        if (i2 == 0) {
            return new an((ap) this.f18976c, this.f18975b, eVar, 0);
        }
        Object obj2 = this.f18976c;
        if (i2 != 1) {
            return new an((bo) obj2, this.f18975b, eVar, 2);
        }
        return new an((ap) obj2, this.f18975b, eVar, 1, null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18977d;
        return i2 != 0 ? i2 != 1 ? ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18977d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18974a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f18976c;
                this.f18974a = 1;
                if (((ap) obj2).f18987g.a().collect(new am(obj2, this.f18975b, 0), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f18974a == 0) {
                e.b.c.b(obj);
                Object obj3 = this.f18976c;
                this.f18974a = 1;
                if (((bo) obj3).f19040a.B().collect(new am(obj3, this.f18975b, 2), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f18974a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj4 = this.f18976c;
            this.f18974a = 1;
            if (((ap) obj4).f18983c.c().collect(new am(obj4, this.f18975b, 1), this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ap apVar, CarContext carContext, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18977d = i2;
        this.f18976c = apVar;
        this.f18975b = carContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(bo boVar, CarContext carContext, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18977d = i2;
        this.f18976c = boVar;
        this.f18975b = carContext;
    }
}

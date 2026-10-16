package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ed extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f21501b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f21502c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f21503d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f21504e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f21505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ed(de deVar, kotlinx.coroutines.a.ad adVar, CarContext carContext, com.waze.t.b.h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21505f = i2;
        this.f21504e = deVar;
        this.f21501b = adVar;
        this.f21503d = carContext;
        this.f21502c = hVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlinx.coroutines.a.ad] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.waze.map.b.ed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.waze.t.b.h, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f21505f;
        if (i2 == 0) {
            return new ed((kotlinx.coroutines.b.bm) this.f21501b, (kotlinx.coroutines.b.k) this.f21502c, (eh) this.f21503d, (com.waze.map.b.ed) this.f21504e, eVar, 0);
        }
        Object obj2 = this.f21504e;
        if (i2 != 1) {
            return new ed((eh) obj2, (List) this.f21502c, (com.waze.car_lib.n.v) this.f21503d, (kotlinx.coroutines.b.k) this.f21501b, eVar, 2);
        }
        return new ed((de) obj2, (kotlinx.coroutines.a.ad) this.f21501b, (CarContext) this.f21503d, (com.waze.t.b.h) this.f21502c, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f21505f;
        return i2 != 0 ? i2 != 1 ? ((ed) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ed) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ed) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.a.ad] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.t.b.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.waze.map.b.ed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f21505f;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f21500a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f21501b;
                ?? r3 = this.f21502c;
                eh ehVar = (eh) this.f21503d;
                this.f21500a = 1;
                if (kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.q((kotlinx.coroutines.b.k) obj2, r3, new ec(ehVar, this.f21504e, null)), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f21500a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f21504e;
                ?? r1 = this.f21501b;
                Object obj4 = this.f21503d;
                this.f21500a = 1;
                if (de.g((de) obj3, r1, (CarContext) obj4, this.f21502c, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f21500a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f21500a = 1;
            obj = kotlinx.coroutines.aj.I(500L, new eg(this.f21501b, this.f21502c, null), this);
            if (obj == aVar3) {
                return aVar3;
            }
        }
        Object obj5 = this.f21504e;
        ?? r12 = this.f21502c;
        Object obj6 = this.f21503d;
        ((eh) obj5).f21533j.c(r12.size(), (com.waze.car_lib.n.v) obj6, (Integer) obj);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ed(eh ehVar, List list, com.waze.car_lib.n.v vVar, kotlinx.coroutines.b.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21505f = i2;
        this.f21504e = ehVar;
        this.f21502c = list;
        this.f21503d = vVar;
        this.f21501b = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ed(kotlinx.coroutines.b.bm bmVar, kotlinx.coroutines.b.k kVar, eh ehVar, com.waze.map.b.ed edVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21505f = i2;
        this.f21501b = bmVar;
        this.f21502c = kVar;
        this.f21503d = ehVar;
        this.f21504e = edVar;
    }
}

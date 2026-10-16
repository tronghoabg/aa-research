package com.waze.map;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f28985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f28986c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f28987d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f28988e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f28989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fq(cx cxVar, kotlinx.coroutines.b.bn bnVar, com.waze.map.canvas.a.e eVar, gb gbVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f28989f = i2;
        this.f28985b = cxVar;
        this.f28986c = bnVar;
        this.f28987d = eVar;
        this.f28988e = gbVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f28989f == 0) {
            return new fq((cx) this.f28985b, (kotlinx.coroutines.b.bn) this.f28986c, (com.waze.map.canvas.a.e) this.f28987d, (gb) this.f28988e, eVar, 0);
        }
        Object obj2 = this.f28987d;
        return new fq((gb) obj2, (com.waze.map.canvas.a.e) this.f28986c, (cr) this.f28985b, (dc) this.f28988e, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f28989f != 0 ? ((fq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((fq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f28989f == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f28984a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f28985b;
                Object obj3 = this.f28986c;
                this.f28984a = 1;
                if (kotlinx.coroutines.b.ai.q(((cx) obj2).f(), kotlinx.coroutines.b.ai.D((kotlinx.coroutines.b.k) obj3), new fo(null)).collect(new fp((com.waze.map.canvas.a.e) this.f28987d, (gb) this.f28988e, 0), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f28984a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        Object obj4 = this.f28987d;
        ?? r3 = this.f28986c;
        Object obj5 = this.f28985b;
        gb gbVar = (gb) obj4;
        Context context = (Context) gbVar.n.invoke();
        Object obj6 = this.f28988e;
        this.f28984a = 1;
        Object objG = gb.g(gbVar, r3, (cr) obj5, context, (dc) obj6, this);
        return objG == aVar2 ? aVar2 : objG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fq(gb gbVar, com.waze.map.canvas.a.e eVar, cr crVar, dc dcVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f28989f = i2;
        this.f28987d = gbVar;
        this.f28986c = eVar;
        this.f28985b = crVar;
        this.f28988e = dcVar;
    }
}

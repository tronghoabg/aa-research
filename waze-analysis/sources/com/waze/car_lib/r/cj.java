package com.waze.car_lib.r;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21211a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ck f21212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f21213c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f21214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cj(ck ckVar, CarContext carContext, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f21212b = ckVar;
        this.f21213c = carContext;
        this.f21214d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cj(this.f21212b, this.f21213c, this.f21214d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21211a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ck ckVar = this.f21212b;
            kotlinx.coroutines.b.k kVarA = ckVar.f21215a.a();
            CarContext carContext = this.f21213c;
            boolean z = this.f21214d;
            this.f21211a = 1;
            if (kotlinx.coroutines.b.ai.t(kVarA, ckVar.f21216b.a(carContext, z), ckVar.f21217c.b(), new bg(ckVar.f21218d.d(), 6), ckVar.f21219e.ad(), new ch(null)).collect(new am(ckVar, 10), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

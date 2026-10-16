package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ el f21940a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cm f21941b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f21942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cl(el elVar, cm cmVar, CarContext carContext, h.c.e eVar) {
        super(2, eVar);
        this.f21940a = elVar;
        this.f21941b = cmVar;
        this.f21942c = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cl(this.f21940a, this.f21941b, this.f21942c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cl) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.car_lib.r.co coVarO = this.f21940a.o();
        if (coVarO != null) {
            this.f21941b.q(dh.Q(coVarO, this.f21942c));
        }
        return h.ab.f48028a;
    }
}

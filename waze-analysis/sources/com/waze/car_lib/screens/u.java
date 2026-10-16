package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.constraints.ConstraintManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22034a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f22035b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f22036c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f22037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, CarContext carContext, h.c.e eVar) {
        super(2, eVar);
        this.f22035b = vVar;
        this.f22036c = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        u uVar = new u(this.f22035b, this.f22036c, eVar);
        uVar.f22037d = obj;
        return uVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22034a == 0) {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f22037d;
            v vVar = this.f22035b;
            CarContext carContext = this.f22036c;
            this.f22034a = 1;
            if (vVar.f22040c.b(afVar, ((ConstraintManager) carContext.getCarService(ConstraintManager.class)).getContentLimit(0)).collect(new y(vVar, 1), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}

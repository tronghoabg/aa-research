package com.waze.car_lib.j;

import androidx.car.app.CarContext;
import androidx.car.app.navigation.NavigationManager;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20237a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f20238b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f20239c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarContext f20240d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f20241e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ NavigationManager f20242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(r rVar, kotlinx.coroutines.af afVar, CarContext carContext, bn bnVar, NavigationManager navigationManager, h.c.e eVar) {
        super(2, eVar);
        this.f20238b = rVar;
        this.f20239c = afVar;
        this.f20240d = carContext;
        this.f20241e = bnVar;
        this.f20242f = navigationManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f20238b, this.f20239c, this.f20240d, this.f20241e, this.f20242f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20237a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            r rVar = this.f20238b;
            kotlinx.coroutines.af afVar = this.f20239c;
            CarContext carContext = this.f20240d;
            kotlinx.coroutines.b.k kVarD = kotlinx.coroutines.b.ai.D(rVar.f20256a.f(afVar, carContext, false));
            bn bnVar = this.f20241e;
            this.f20237a = 1;
            if (kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.F(kVarD, bnVar, new l(rVar, this.f20242f, carContext, null)), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

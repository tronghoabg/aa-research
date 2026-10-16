package com.waze.car_lib.a;

import androidx.car.app.CarContext;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18850b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f18851c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.o.a f18852d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f18853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(ae aeVar, CarContext carContext, com.waze.shared_infra.o.a aVar, t tVar, h.c.e eVar) {
        super(2, eVar);
        this.f18850b = aeVar;
        this.f18851c = carContext;
        this.f18852d = aVar;
        this.f18853e = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f18850b, this.f18851c, this.f18852d, this.f18853e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18849a == 0) {
            e.b.c.b(obj);
            ae aeVar = this.f18850b;
            CarContext carContext = this.f18851c;
            com.waze.shared_infra.o.a aVar2 = this.f18852d;
            t tVar = this.f18853e;
            this.f18849a = 1;
            if (aeVar.g().collect(new r(carContext, aVar2, aeVar, tVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}

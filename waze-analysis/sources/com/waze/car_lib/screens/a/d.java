package com.waze.car_lib.screens.a;

import androidx.car.app.CarContext;
import com.waze.car_lib.screens.bx;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21740a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f21741b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f21742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, CarContext carContext, h.c.e eVar) {
        super(2, eVar);
        this.f21741b = gVar;
        this.f21742c = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f21741b, this.f21742c, eVar);
        dVar.f21740a = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((bx) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bx bxVar = (bx) this.f21740a;
        g gVar = this.f21741b;
        g.j(gVar, this.f21742c, bxVar, new c(gVar.f21749b), new f((Object) gVar.f21749b, 1, (byte[]) null));
        return ab.f48028a;
    }
}

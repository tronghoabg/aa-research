package com.waze.car_lib.a;

import androidx.car.app.CarContext;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CarContext f18845a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.o.a f18846b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f18847c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f18848d;

    r(CarContext carContext, com.waze.shared_infra.o.a aVar, ae aeVar, t tVar) {
        this.f18845a = carContext;
        this.f18846b = aVar;
        this.f18847c = aeVar;
        this.f18848d = tVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        MapWithContentTemplate mapWithContentTemplateB;
        com.waze.l.m mVar = (com.waze.l.m) obj;
        if (mVar instanceof aa) {
            mapWithContentTemplateB = dh.H();
        } else {
            if (!(mVar instanceof z)) {
                throw new h.i();
            }
            CarContext carContext = this.f18845a;
            com.waze.shared_infra.o.a aVar = this.f18846b;
            z zVar = (z) mVar;
            ae aeVar = this.f18847c;
            mapWithContentTemplateB = com.waze.car_lib.b.b(carContext, aVar, zVar, new q((Object) aeVar, 1, (byte[]) null), new q(aeVar, 0), new q((Object) aeVar, 2, (char[]) null), new q((Object) aeVar, 3, (short[]) null), new q(aeVar, 4, (int[]) null));
        }
        this.f18848d.q(mapWithContentTemplateB);
        return h.ab.f48028a;
    }
}

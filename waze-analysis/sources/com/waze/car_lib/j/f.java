package com.waze.car_lib.j;

import androidx.car.app.CarContext;
import androidx.car.app.notification.CarNotificationManager;
import com.waze.cs;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f20210b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f20211c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarContext f20212d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CarNotificationManager f20213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, kotlinx.coroutines.af afVar, CarContext carContext, CarNotificationManager carNotificationManager, h.c.e eVar) {
        super(2, eVar);
        this.f20210b = gVar;
        this.f20211c = afVar;
        this.f20212d = carContext;
        this.f20213e = carNotificationManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f20210b, this.f20211c, this.f20212d, this.f20213e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20209a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            g gVar = this.f20210b;
            kotlinx.coroutines.b.k kVarE = cs.e(gVar.f20215b);
            ch chVarAh = gVar.f20216c.ah();
            kotlinx.coroutines.af afVar = this.f20211c;
            CarContext carContext = this.f20212d;
            this.f20209a = 1;
            if (kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.r(kVarE, chVarAh, kotlinx.coroutines.b.ai.D(gVar.f20214a.f(afVar, carContext, false)), new e(this.f20213e, carContext, gVar, null)), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

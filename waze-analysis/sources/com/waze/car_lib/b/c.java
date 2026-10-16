package com.waze.car_lib.b;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.OnClickListener;
import androidx.car.app.notification.CarNotificationManager;
import androidx.collection.SieveCacheKt;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19073a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19074b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f19075c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarContext f19076d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppManager f19077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, CarContext carContext, AppManager appManager, h.c.e eVar) {
        super(2, eVar);
        this.f19075c = fVar;
        this.f19076d = carContext;
        this.f19077e = appManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f19075c, this.f19076d, this.f19077e, eVar);
        cVar.f19074b = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((r) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        r rVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19073a != 0) {
            rVar = (r) this.f19074b;
            e.b.c.b(obj);
            objE = obj;
        } else {
            e.b.c.b(obj);
            r rVar2 = (r) this.f19074b;
            f fVar = this.f19075c;
            if (rVar2 == null) {
                r rVar3 = fVar.f19090e;
                if (rVar3 != null) {
                    this.f19077e.dismissAlert(rVar3.a());
                }
                h hVar = fVar.f19088c;
                CarContext carContext = this.f19076d;
                CarNotificationManager carNotificationManagerFrom = CarNotificationManager.from(carContext);
                h.g.b.x.e(carNotificationManagerFrom, "from(...)");
                hVar.a(null, carContext, carNotificationManagerFrom);
                fVar.f19090e = null;
                return h.ab.f48028a;
            }
            r rVar4 = fVar.f19090e;
            if (!h.g.b.x.n(rVar4 != null ? rVar4.c() : null, rVar2.c())) {
                rVar2.k().invoke();
            }
            fVar.f19087b.a("displaying alert with title: " + rVar2.h() + " and ID: " + rVar2.a());
            fVar.f19090e = rVar2;
            AppManager appManager = this.f19077e;
            CarContext carContext2 = this.f19076d;
            CarContext carContext3 = carContext2;
            final ap apVar = fVar.f19086a;
            b bVar = new b(fVar, rVar2, carContext2);
            h.g.b.x.f(rVar2, "<this>");
            h.g.b.x.f(carContext3, "carContext");
            h.g.b.x.f(apVar, "alertPresenter");
            h.g.b.x.f(bVar, "callback");
            int iA = rVar2.a();
            CarText carTextCreate = CarText.create(rVar2.h());
            Long lF = rVar2.f();
            long jLongValue = SieveCacheKt.NodeLinkMask;
            if (lF != null) {
                Long l2 = lF.longValue() > 0 ? lF : null;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
            }
            Alert.Builder builder = new Alert.Builder(iA, carTextCreate, jLongValue);
            String strG = rVar2.g();
            if (strG != null) {
                builder.setSubtitle(CarText.create(strG));
            }
            Integer numE = rVar2.e();
            if (numE != null) {
                builder.setIcon(new CarIcon.Builder(IconCompat.createWithResource(carContext3, numE.intValue())).build());
            }
            Iterator it = rVar2.i().iterator();
            while (true) {
                int i2 = 1;
                if (it.hasNext()) {
                    final q qVar = (q) it.next();
                    final com.waze.k kVarC = rVar2.c();
                    Action.Builder builder2 = new Action.Builder();
                    builder2.setTitle(qVar.e());
                    p pVarB = qVar.b();
                    if (pVarB != null) {
                        int iOrdinal = pVarB.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new h.i();
                            }
                            i2 = 4;
                        }
                        builder2.setFlags(i2);
                    }
                    CarColor carColorA = qVar.a();
                    if (carColorA != null) {
                        builder2.setBackgroundColor(carColorA);
                    }
                    builder2.setOnClickListener(new OnClickListener() { // from class: com.waze.car_lib.b.g
                        @Override // androidx.car.app.model.OnClickListener
                        public final void onClick() {
                            apVar.J(qVar.c(), kVarC);
                        }
                    });
                    com.waze.design_components.b.d dVarD = qVar.d();
                    if (dVarD != null) {
                        builder2.setIcon(new CarIcon.Builder(IconCompat.createWithResource(carContext3, dVarD.b())).build());
                    }
                    Action actionBuild = builder2.build();
                    h.g.b.x.e(actionBuild, "build(...)");
                    builder.addAction(actionBuild);
                } else {
                    builder.setCallback(bVar);
                    Alert alertBuild = builder.build();
                    h.g.b.x.e(alertBuild, "build(...)");
                    appManager.showAlert(alertBuild);
                    this.f19074b = rVar2;
                    this.f19073a = 1;
                    objE = f.e(fVar, rVar2, this);
                    if (objE == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                }
            }
        }
        v vVar = (v) objE;
        if (vVar != null) {
            f fVar2 = this.f19075c;
            fVar2.f19087b.a("timeout reached alertId=" + rVar.c() + ", action=" + vVar);
            fVar2.f19086a.J(vVar, rVar.c());
        }
        return h.ab.f48028a;
    }
}

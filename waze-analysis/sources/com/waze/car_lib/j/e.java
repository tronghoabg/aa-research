package com.waze.car_lib.j;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import androidx.car.app.CarContext;
import androidx.car.app.notification.CarNotificationManager;
import com.waze.R;
import com.waze.car_lib.r.cc;
import com.waze.car_lib.r.cd;
import com.waze.car_lib.r.ce;
import com.waze.car_lib.r.cg;
import com.waze.n.aq;
import com.waze.navigate.de;
import com.waze.navigate.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f20203a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20204b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f20205c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarNotificationManager f20206d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CarContext f20207e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f20208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(CarNotificationManager carNotificationManager, CarContext carContext, g gVar, h.c.e eVar) {
        super(4, eVar);
        this.f20206d = carNotificationManager;
        this.f20207e = carContext;
        this.f20208f = gVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e eVar = new e(this.f20206d, this.f20207e, this.f20208f, (h.c.e) obj4);
        eVar.f20203a = zBooleanValue;
        eVar.f20204b = (ei) obj2;
        eVar.f20205c = (cg) obj3;
        return eVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        aq aqVarH;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f20203a;
        ei eiVar = (ei) this.f20204b;
        cg cgVar = (cg) this.f20205c;
        if (eiVar == ei.f31310a || !z) {
            this.f20206d.cancelAll();
            return h.ab.f48028a;
        }
        CarNotificationManager carNotificationManager = this.f20206d;
        CarContext carContext = this.f20207e;
        com.waze.shared_infra.o.a aVar2 = this.f20208f.f20217d;
        de deVarC = cgVar.b().c();
        String strF = com.waze.sharedui.utils.f.f(aVar2, deVarC != null ? deVarC.b() : 0, true);
        h.g.b.x.e(strF, "getDistanceStringLocalized(...)");
        ce ceVarA = cgVar.b().a();
        Bitmap bitmapB = null;
        SpannableStringBuilder spannableStringBuilderC = ceVarA != null ? ceVarA.c() : null;
        ce ceVarA2 = cgVar.b().a();
        if (ceVarA2 != null && (aqVarH = ceVarA2.h()) != null) {
            if (aqVarH instanceof cc) {
                bitmapB = BitmapFactory.decodeResource(carContext.getResources(), ((cc) aqVarH).b());
            } else {
                if (!(aqVarH instanceof cd)) {
                    throw new h.i();
                }
                bitmapB = ((cd) aqVarH).b();
            }
        }
        carNotificationManager.notify(-1, com.waze.i.a.d(carContext, "Waze Navigation Instructions", strF, spannableStringBuilderC, bitmapB, Integer.valueOf(R.drawable.notification), true, 3, 384));
        return h.ab.f48028a;
    }
}

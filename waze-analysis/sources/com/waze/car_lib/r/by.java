package com.waze.car_lib.r;

import android.text.format.DateFormat;
import androidx.car.app.CarContext;
import androidx.car.app.model.DateTimeWithZone;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.waze.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    private final ck f21108a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.db f21109b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.f f21110c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sound.bs f21111d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.config.d f21112e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.config.b f21113f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.config.b f21114g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.b.bo f21115h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.b.ap f21116i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.map.b.n f21117j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21118k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.z f21119l;
    private final com.waze.network.b.al m;
    private final com.waze.navigate.eo n;
    private final com.waze.network.b.y o;
    private final com.waze.car_lib.c.i p;
    private final com.waze.o.c.c.b q;
    private final kotlinx.coroutines.b.bn r;
    private final com.waze.shared_infra.i.e s;

    public by(ck ckVar, com.waze.navigate.db dbVar, com.waze.car_lib.b.f fVar, com.waze.sound.bs bsVar, com.waze.config.d dVar, com.waze.config.b bVar, com.waze.config.b bVar2, com.waze.car_lib.b.bo boVar, com.waze.car_lib.b.ap apVar, com.waze.map.b.n nVar, com.waze.shared_infra.o.a aVar, com.waze.z zVar, com.waze.network.b.al alVar, com.waze.navigate.eo eoVar, com.waze.network.b.y yVar, com.waze.car_lib.c.i iVar, com.waze.o.c.c.b bVar3) {
        h.g.b.x.f(ckVar, "navigationViewModel");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(fVar, "alertLifecyclePresenter");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(dVar, "configValueNavigationGuidanceMode");
        h.g.b.x.f(bVar, "configValueAddEtaToTripText");
        h.g.b.x.f(bVar2, "configValueAddTimeToDestinationToTripText");
        h.g.b.x.f(boVar, "notificationToastLifecyclePresenter");
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(nVar, "mainMap");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(zVar, "appType");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(iVar, "inCarMainScreenStatsReporter");
        h.g.b.x.f(bVar3, "companinioConfig");
        this.f21108a = ckVar;
        this.f21109b = dbVar;
        this.f21110c = fVar;
        this.f21111d = bsVar;
        this.f21112e = dVar;
        this.f21113f = bVar;
        this.f21114g = bVar2;
        this.f21115h = boVar;
        this.f21116i = apVar;
        this.f21117j = nVar;
        this.f21118k = aVar;
        this.f21119l = zVar;
        this.m = alVar;
        this.n = eoVar;
        this.o = yVar;
        this.p = iVar;
        this.q = bVar3;
        this.r = kotlinx.coroutines.b.ck.b(false);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("NavigationScreenViewModel");
        h.g.b.x.e(eVarD, "create(...)");
        this.s = eVarD;
    }

    public static final /* synthetic */ String e(by byVar, ca caVar, fb fbVar, String str, CarContext carContext, com.waze.navigate.ec ecVar) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (ecVar == com.waze.navigate.ec.f31301b) {
            sb.append(byVar.f21118k.c(R.string.ETA_DRAWER_OFFLINE, new Object[0]));
        }
        boolean z = (byVar.f21119l == com.waze.z.f45554b && carContext.getCarAppApiLevel() < 6) || byVar.f21113f.b().booleanValue();
        if (z && caVar.b() != null) {
            boolean zIs24HourFormat = DateFormat.is24HourFormat(carContext);
            TimeZone timeZone = TimeZone.getDefault();
            h.g.b.x.e(timeZone, "getDefault(...)");
            long jLongValue = caVar.b().longValue();
            h.g.b.x.f(timeZone, "timeZone");
            Date date = new Date(DateTimeWithZone.create(jLongValue, timeZone).getTimeSinceEpochMillis());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(true != zIs24HourFormat ? "hh:mm aa" : "HH:mm", Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            String str3 = simpleDateFormat.format(date);
            h.g.b.x.e(str3, "format(...)");
            Locale locale = Locale.getDefault();
            h.g.b.x.e(locale, "getDefault(...)");
            String upperCase = str3.toUpperCase(locale);
            h.g.b.x.e(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        if ((fbVar == null && str == null) || caVar.c() == null || !byVar.f21114g.b().booleanValue() || z || !bq.j(carContext)) {
            str2 = null;
        } else {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            long jLongValue2 = caVar.c().longValue();
            TimeUnit timeUnit = TimeUnit.HOURS;
            long j2 = jLongValue2 % 60;
            str2 = null;
            long j3 = j2 + (((((-j2) | j2) & (j2 ^ 60)) >> 63) & 60);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            long j4 = jLongValue2 / 60;
            sb.append(h.a.i.aM(h.a.i.k(j4 > 0 ? byVar.f21118k.c(R.string.AA_ETA_BAR_DURATION_HOURS_PD, Long.valueOf(j4)) : null, (j3 > 0 || j4 <= 0) ? byVar.f21118k.c(R.string.AA_ETA_BAR_DURATION_MINUTES_PD, Long.valueOf(j3)) : null), " ", null, null, 0, null, 62));
        }
        if (fbVar != null) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            String strB = fbVar.b();
            if (strB == null && (strB = fbVar.d()) == null) {
                strB = fbVar.a();
            }
            sb.append(strB);
        }
        if (str != null) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(str);
        }
        String string = sb.toString();
        return !h.n.o.G(string) ? string : str2;
    }

    public final LiveData a(kotlinx.coroutines.af afVar, CarContext carContext, Lifecycle lifecycle, com.waze.car_lib.f.ej ejVar, com.waze.car_lib.j.x xVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(ejVar, "controller");
        h.g.b.x.f(xVar, "tollInfoController");
        this.f21110c.h(lifecycle, carContext);
        this.f21115h.b(lifecycle, carContext);
        h.g.b.aq aqVar = new h.g.b.aq();
        kotlinx.coroutines.b.k kVarT = kotlinx.coroutines.b.ai.t(kotlinx.coroutines.b.ai.D(this.f21108a.f(afVar, carContext, true)), kotlinx.coroutines.b.ai.q(this.f21111d.b(), com.waze.n.ac.o(this.f21112e), new bv(null, 0)), this.f21117j.g(), this.f21116i.C(), kotlinx.coroutines.b.ai.r(this.r, new bg(com.waze.network.b.ay.d(this.m.a(), this.o), 4), this.n.ae(), new bw(null)), new bx(aqVar, this, carContext, xVar, ejVar, null));
        kotlinx.coroutines.aj.z(afVar, null, null, new as(kVarT, this, (h.c.e) null, 3), 3);
        return FlowLiveDataConversions.asLiveData$default(kVarT, (h.c.j) null, 0L, 3, (Object) null);
    }

    public final void f() {
        this.p.a(com.waze.car_lib.c.g.f19234g, false);
        this.f21117j.r(com.waze.map.b.q.f28364a, true);
    }

    public final void g(boolean z) {
        this.r.e(Boolean.valueOf(z));
    }

    public final void h() {
        this.s.e("stop navigation Clicked in view model");
        this.p.a(com.waze.car_lib.c.g.f19238k, false);
        this.f21109b.f();
    }

    public final void i() {
        this.p.a(com.waze.car_lib.c.g.f19239l, false);
        com.waze.map.b.bf.c(this.f21117j);
    }

    public final void j() {
        this.p.a(com.waze.car_lib.c.g.m, false);
        com.waze.map.b.bf.d(this.f21117j);
    }
}

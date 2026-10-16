package com.waze.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.ActivityCompat;
import com.waze.car_lib.r.cq;
import com.waze.config.ConfigValues;
import com.waze.fa;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bg {
    public static double a(int i2) {
        return i2 / 1000000.0d;
    }

    public static int b(double d2) {
        return (int) Math.round(d2 * 1000000.0d);
    }

    static Location c(Location location) {
        Location location2 = new Location(location);
        location2.setLatitude(Math.round(location.getLatitude() * 100000.0d) / 100000.0d);
        location2.setLongitude(Math.round(location.getLongitude() * 100000.0d) / 100000.0d);
        location2.setAltitude(Math.round(location.getAltitude() * 0.3333333333333333d) / 0.3333333333333333d);
        return location2;
    }

    public static Location d(Context context) {
        int accuracy;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        Location location = null;
        for (String str : locationManager.getAllProviders()) {
            if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            if (location != null) {
                if (lastKnownLocation != null) {
                    long time = lastKnownLocation.getTime() - location.getTime();
                    if (time <= 300000 && (time < -300000 || ((accuracy = (int) (lastKnownLocation.getAccuracy() - location.getAccuracy())) >= 0 && (time <= 0 || accuracy > 200)))) {
                    }
                }
            }
            location = lastKnownLocation;
        }
        return (location == null || !ConfigValues.CONFIG_VALUE_GPS_REDUCED_ACCURACY_ENABLED.b().booleanValue()) ? location : c(location);
    }

    public static boolean e(List list, com.waze.shared_infra.h.c cVar) {
        if (list.size() != 4) {
            return false;
        }
        com.waze.shared_infra.h.c cVar2 = (com.waze.shared_infra.h.c) list.get(0);
        com.waze.shared_infra.h.c cVar3 = (com.waze.shared_infra.h.c) list.get(1);
        com.waze.shared_infra.h.c cVar4 = (com.waze.shared_infra.h.c) list.get(2);
        double d2 = -Math.atan2(cVar3.a() - cVar2.a(), cVar3.b() - cVar2.b());
        com.waze.shared_infra.h.c cVarJ = j(cVar2, d2);
        com.waze.shared_infra.h.c cVarJ2 = j(cVar4, d2);
        com.waze.shared_infra.h.c cVarJ3 = j(cVar, d2);
        return k(cVarJ3.b(), cVarJ.b(), cVarJ2.b()) && k(cVarJ3.a(), cVarJ.a(), cVarJ2.a());
    }

    public static com.waze.sharedui.utils.c f(com.waze.shared_infra.h.c cVar) {
        if (z.a().lastCoordinate().h() && cVar.h()) {
            return new com.waze.sharedui.utils.c(com.waze.sharedui.utils.f.d(ConfigValues.CONFIG_VALUE_GENERAL_UNITS.b()), Math.round(com.waze.sharedui.utils.f.b(z.a().lastCoordinate(), cVar)), true);
        }
        return null;
    }

    public static final void g(com.waze.main_screen.be beVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(beVar, "wazeMainScreenViewModel");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1454302163);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(beVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454302163, i3, -1, "com.waze.main_screen.WazeMainScreen (MainScreenLayout.kt:53)");
            }
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(976028303, true, new com.waze.main_screen.o(beVar, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(beVar, i2, 10));
        }
    }

    public static final kotlinx.coroutines.b.k h(o oVar) {
        h.g.b.x.f(oVar, "<this>");
        return kotlinx.coroutines.b.ai.n(new be(oVar, null));
    }

    public static final void i(g gVar) {
        h.g.b.x.f(gVar, "<this>");
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new l(gVar, (h.c.e) null, 1), 3);
    }

    private static com.waze.shared_infra.h.c j(com.waze.shared_infra.h.c cVar, double d2) {
        double dCos = Math.cos(d2);
        double dSin = Math.sin(d2);
        double dB = cVar.b();
        double d3 = dSin * dB;
        double dA = cVar.a();
        return new com.waze.shared_infra.h.c(d3 + (dCos * dA), (dCos * dB) - (dSin * dA));
    }

    private static boolean k(double d2, double d3, double d4) {
        return d2 >= Math.min(d3, d4) && d2 <= Math.max(d3, d4);
    }
}

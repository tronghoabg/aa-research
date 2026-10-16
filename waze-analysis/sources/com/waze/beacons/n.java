package com.waze.beacons;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.RoutingInfo;
import androidx.car.app.navigation.model.TravelEstimate;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.asks.ad;
import com.waze.car_lib.ar;
import com.waze.car_lib.p.ae;
import com.waze.car_lib.p.ak;
import com.waze.car_lib.p.an;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.bq;
import com.waze.car_lib.r.ca;
import com.waze.car_lib.r.cf;
import com.waze.car_lib.screens.bx;
import com.waze.fa;
import com.waze.iv;
import h.g.b.x;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class n {
    public /* synthetic */ n() {
    }

    public static void a(com.waze.beacons.a.f fVar, Composer composer, int i2) {
        int i3;
        int i4;
        x.f(fVar, "stateHolder");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(881679937);
        boolean z = true;
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(fVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(881679937, i3, -1, "com.waze.beacons.presentation.BeaconBluetoothPermissionDialog (BeaconBluetoothPermissionDialog.kt:13)");
            }
            if (((Boolean) SnapshotStateKt.collectAsState(fVar.i(), null, composerStartRestartGroup, 0, 1).getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1892790718);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (Build.VERSION.SDK_INT < 31 || (ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0)) {
                    i4 = 4;
                    z = false;
                } else {
                    i4 = 4;
                }
                com.waze.l.v vVarB = fVar.b();
                int i6 = i3 & 14;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i6 == i4 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.ads.b(fVar, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i6 == i4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new iv(fVar, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                com.waze.l.m.d(vVarB, z, aVar, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1892084383);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(fVar, i2, 3));
        }
    }

    public static Context b(com.waze.shared_infra.i.e eVar, com.waze.car_lib.i.a.a aVar, CarContext carContext) {
        x.f(eVar, "logger");
        x.f(aVar, "presentableController");
        x.f(carContext, "context");
        Integer numC = aVar.c();
        int i2 = carContext.getResources().getDisplayMetrics().densityDpi;
        int iIntValue = numC != null ? numC.intValue() : i2;
        eVar.a("Set DPI: presentableController dpi: " + numC + " context dpi: " + i2 + " scale factor: 1.0");
        CarContext carContext2 = carContext;
        x.f(carContext2, "<this>");
        Configuration configuration = new Configuration(carContext2.getResources().getConfiguration());
        configuration.densityDpi = (int) ((float) iIntValue);
        Context contextCreateConfigurationContext = carContext2.createConfigurationContext(configuration);
        x.e(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    public static NavigationTemplate c(CarContext carContext, an anVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, h.g.a.a aVar6, h.g.a.a aVar7, h.g.a.a aVar8, h.g.a.a aVar9, h.g.a.l lVar, com.waze.shared_infra.o.a aVar10) {
        boolean z;
        int i2;
        x.f(carContext, "carContext");
        x.f(anVar, "state");
        x.f(aVar, "searchClicked");
        x.f(aVar2, "stopClicked");
        x.f(aVar3, "reportAlertClicked");
        x.f(aVar4, "routesClicked");
        x.f(aVar5, "soundSettingsClicked");
        x.f(aVar6, "centerOnMeClicked");
        x.f(aVar7, "zoomInClicked");
        x.f(aVar8, "zoomOutClicked");
        x.f(aVar9, "companinioClicked");
        x.f(lVar, "onPanModeChanged");
        x.f(aVar10, "stringProvider");
        NavigationTemplate.Builder builder = new NavigationTemplate.Builder();
        builder.setBackgroundColor(CarColor.createCustom(-16777216, -16777216));
        ActionStrip.Builder builder2 = new ActionStrip.Builder();
        if (anVar.e()) {
            x.f(carContext, "context");
            x.f(aVar10, "stringProvider");
            builder2.addAction(dh.G(R.drawable.no_network_warning_icon, carContext, false, new ar(carContext, aVar10, 4), 12));
        }
        if (anVar.f()) {
            if (anVar.h()) {
                z = false;
                i2 = 12;
                builder2.addAction(dh.G(R.drawable.icon_outline_search_30px, carContext, false, aVar, 12));
            } else {
                z = false;
                i2 = 12;
            }
            if (!anVar.e()) {
                builder2.addAction(dh.G(R.drawable.icon_outline_routes_30px, carContext, z, aVar4, i2));
            }
            if (!anVar.i()) {
                g(builder2, carContext, anVar.a(), aVar5);
            }
            if (bq.j(carContext)) {
                builder2.addAction(dh.G(R.drawable.icon_outline_close_30px, carContext, false, aVar2, 12));
            }
            if (anVar.i()) {
                builder2.addAction(bx.d(carContext, aVar9));
            }
        } else {
            g(builder2, carContext, anVar.a(), aVar5);
        }
        ActionStrip actionStripBuild = builder2.build();
        x.e(actionStripBuild, "build(...)");
        builder.setActionStrip(actionStripBuild);
        builder.setDestinationTravelEstimate(d(anVar.b(), anVar.d()));
        CarContext carContext2 = carContext;
        RoutingInfo routingInfoE = e(anVar.c(), carContext2);
        if (routingInfoE != null) {
            builder.setNavigationInfo(routingInfoE);
        }
        builder.setMapActionStrip(dh.J(carContext2, anVar.g(), anVar.j(), aVar3, aVar6, aVar7, aVar8));
        builder.setPanModeListener(new ae(lVar, 4));
        NavigationTemplate navigationTemplateBuild = builder.build();
        x.e(navigationTemplateBuild, "build(...)");
        return navigationTemplateBuild;
    }

    public static TravelEstimate d(ca caVar, String str) {
        x.f(caVar, "<this>");
        int i2 = com.waze.shared_infra.q.i.f37938a;
        long jA = com.waze.settings.h.c.d().a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Long lC = caVar.c();
        TravelEstimate.Builder builder = new TravelEstimate.Builder(caVar.a(), DateTimeWithZone.create(jA + timeUnit.toMillis(lC != null ? lC.longValue() : 0L), TimeZone.getDefault()));
        Long lC2 = caVar.c();
        long jLongValue = -1;
        if (lC2 != null) {
            boolean z = lC2.longValue() >= 0;
            Boolean.valueOf(z).getClass();
            if (true != z) {
                lC2 = null;
            }
            if (lC2 != null) {
                jLongValue = Long.valueOf(TimeUnit.MINUTES.toSeconds(lC2.longValue())).longValue();
            }
        }
        builder.setRemainingTimeSeconds(jLongValue);
        if (str != null) {
            builder.setTripText(CarText.create(str));
        }
        TravelEstimate travelEstimateBuild = builder.build();
        x.e(travelEstimateBuild, "build(...)");
        return travelEstimateBuild;
    }

    public static RoutingInfo e(cf cfVar, Context context) {
        x.f(cfVar, "<this>");
        x.f(context, "carContext");
        if (cfVar.a() == null) {
            return null;
        }
        RoutingInfo.Builder builder = new RoutingInfo.Builder();
        builder.setCurrentStep(com.waze.i.a.f(cfVar.a(), context), com.waze.car_lib.j.d.a(cfVar.c()));
        if (cfVar.b() != null) {
            builder.setNextStep(com.waze.i.a.f(cfVar.b(), context));
        }
        return builder.build();
    }

    public static MapWithContentTemplate f(Context context, ak akVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.l lVar, h.g.a.a aVar4, h.g.a.a aVar5) {
        int i2;
        x.f(context, "carContext");
        x.f(akVar, "state");
        x.f(aVar, "firstActionClicked");
        x.f(aVar2, "secondActionClicked");
        x.f(aVar3, "onCloseClicked");
        x.f(lVar, "onPanModeChanged");
        x.f(aVar4, "zoomInClicked");
        x.f(aVar5, "zoomOutClicked");
        MessageTemplate.Builder builder = new MessageTemplate.Builder(akVar.d());
        builder.setTitle(akVar.e());
        builder.setHeaderAction(Action.BACK);
        if (akVar.a() != null) {
            builder.addAction(dh.I(akVar.a().a(), akVar.a().c(), akVar.a().b(), new com.waze.car_lib.screens.b.a(aVar, 7)));
        }
        if (akVar.b() != null) {
            builder.addAction(dh.I(akVar.b().a(), akVar.b().c(), akVar.b().b(), new com.waze.car_lib.screens.b.a(aVar2, 8)));
        }
        MessageTemplate messageTemplateBuild = builder.build();
        MapWithContentTemplate.Builder builder2 = new MapWithContentTemplate.Builder();
        builder2.setContentTemplate(messageTemplateBuild);
        MapController.Builder builder3 = new MapController.Builder();
        builder3.setPanModeListener(new ae(lVar, 3));
        builder3.setMapActionStrip(dh.K(context, z, aVar4, aVar5));
        builder2.setMapController(builder3.build());
        ActionStrip.Builder builder4 = new ActionStrip.Builder();
        Integer numC = akVar.c();
        if (numC != null) {
            numC.intValue();
            i2 = R.drawable.icon_outline_routes_30px;
        } else {
            i2 = R.drawable.icon_outline_close_30px;
        }
        builder4.addAction(dh.G(i2, context, false, new ad(aVar3, 6), 12));
        builder2.setActionStrip(builder4.build());
        MapWithContentTemplate mapWithContentTemplateBuild = builder2.build();
        x.e(mapWithContentTemplateBuild, "build(...)");
        return mapWithContentTemplateBuild;
    }

    private static void g(ActionStrip.Builder builder, Context context, int i2, h.g.a.a aVar) {
        builder.addAction(dh.G(i2, context, false, aVar, 12));
    }

    public /* synthetic */ n(byte[] bArr, byte[] bArr2) {
    }
}

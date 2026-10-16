package com.waze.ab.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.media3.common.util.WavUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.asks.at;
import com.waze.car_lib.screens.az;
import com.waze.fa;
import com.waze.gas.GasNativeManager;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Place;
import com.waze.location.bj;
import com.waze.navigate.DriveToNativeManager;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;
import h.g.b.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.a.ui;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class l {
    public /* synthetic */ l(byte[] bArr) {
    }

    public static void c(n nVar, Composer composer, int i2) {
        int i3;
        int i4;
        Composer composer2;
        h.ab abVar;
        h.g.b.x.f(nVar, "state");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(421450516);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(nVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i6 = 9;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(421450516, i3, -1, "com.waze.dialog.userImage.UserImageDialog (UserImageComposables.kt:45)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            int i7 = i3 & 14;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            int i8 = 6;
            if (i7 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.app_nav.hub.c.h(nVar, i8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 0);
            ActivityResultContracts.TakePicture takePicture = new ActivityResultContracts.TakePicture();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.app_nav.hub.c.h(nVar, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0);
            ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new com.waze.app_nav.hub.c.h(nVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (h.g.a.l) objRememberedValue4, composerStartRestartGroup, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new com.waze.app_nav.hub.c.h(nVar, i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult4 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue5, composerStartRestartGroup, 0);
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new com.waze.app_nav.hub.c.h(nVar, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue, null, (h.g.a.l) objRememberedValue6, true, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 2);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Configuration configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
            boolean z = i7 == 4;
            h.ab abVar2 = h.ab.f48028a;
            boolean zChangedInstance = z | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(configuration) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult4) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
            j jVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || jVarRememberedValue == Composer.Companion.getEmpty()) {
                i4 = i7;
                composer2 = composerStartRestartGroup;
                abVar = abVar2;
                j jVar = new j(nVar, context, configuration, managedActivityResultLauncherRememberLauncherForActivityResult4, modalBottomSheetStateRememberModalBottomSheetState, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncherRememberLauncherForActivityResult, managedActivityResultLauncherRememberLauncherForActivityResult2, null);
                modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetStateRememberModalBottomSheetState;
                jVarRememberedValue = jVar;
                composer2.updateRememberedValue(jVarRememberedValue);
            } else {
                i4 = i7;
                composer2 = composerStartRestartGroup;
                abVar = abVar2;
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) jVarRememberedValue, composer2, 6);
            k kVarRememberedValue = composer2.rememberedValue();
            if (i4 == 4 || kVarRememberedValue == Composer.Companion.getEmpty()) {
                kVarRememberedValue = new k(nVar, 1, null);
                composer2.updateRememberedValue(kVarRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) kVarRememberedValue;
            k kVarRememberedValue2 = composer2.rememberedValue();
            if (i4 == 4 || kVarRememberedValue2 == Composer.Companion.getEmpty()) {
                kVarRememberedValue2 = new k(nVar, 0);
                composer2.updateRememberedValue(kVarRememberedValue2);
            }
            composerStartRestartGroup = composer2;
            d(modalBottomSheetStateRememberModalBottomSheetState, afVar, aVar, (h.g.a.a) kVarRememberedValue2, composerStartRestartGroup, ModalBottomSheetState.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(nVar, i2, 9));
        }
    }

    public static void d(ModalBottomSheetState modalBottomSheetState, kotlinx.coroutines.af afVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(modalBottomSheetState, "bottomSheetState");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aVar, "onTakePhotoClicked");
        h.g.b.x.f(aVar2, "onExistingPictureClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1283504758);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(modalBottomSheetState) : composerStartRestartGroup.changedInstance(modalBottomSheetState)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(afVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1283504758, i5, -1, "com.waze.dialog.userImage.UserImageDialogLayout (UserImageComposables.kt:152)");
            }
            composer2 = composerStartRestartGroup;
            be.c(null, modalBottomSheetState, ComposableLambdaKt.rememberComposableLambda(308488929, true, new com.waze.ab.c(afVar, modalBottomSheetState, aVar, aVar2, 4), composerStartRestartGroup, 54), true, null, composer2, (ModalBottomSheetState.$stable << 3) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION | ((i5 << 3) & 112), 17);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b((Object) modalBottomSheetState, (Object) afVar, aVar, aVar2, i2, 6));
        }
    }

    public static ui e(com.waze.ac.p pVar) {
        if (h.g.b.x.n(pVar, com.waze.ac.o.f13867a)) {
            return ui.ETA_POPUP;
        }
        if (h.g.b.x.n(pVar, com.waze.ac.m.f13865a)) {
            return ui.ENCOURAGEMENT_POPUP;
        }
        if (h.g.b.x.n(pVar, com.waze.ac.n.f13866a)) {
            return ui.ETA_CARD;
        }
        if (h.g.b.x.n(pVar, com.waze.ac.l.f13864a)) {
            return ui.APP_LAUNCH_DIALOG;
        }
        throw new h.i();
    }

    public static /* synthetic */ com.waze.ao.b.b f(at atVar) {
        com.waze.ao.b.g gVarG = g(atVar.a());
        int iA = gVarG.a();
        int iB = gVarG.b();
        String str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.speed_bump";
        switch (atVar.a().ordinal()) {
            case 0:
                str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.railroad";
                break;
            case 1:
            case 6:
                break;
            case 2:
                str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.sharp_curve";
                break;
            case 3:
                str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.complex_intersection";
                break;
            case 4:
                str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.complex_merge";
                break;
            case 5:
                str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.toll_booth";
                break;
            case 7:
                str = "settings_main.map_display.on_the_map.reports.alert_on.permanent_hazards_settings.school_zones";
                break;
            case 8:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.speeding_and_intersections.rt_speed_cams";
                break;
            case 9:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.speeding_and_intersections.rt_red_light_cameras";
                break;
            case 10:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.driving_behavior.rt_seatbelt_cameras";
                break;
            case 11:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.driving_behavior.rt_mobile_phone_cameras";
                break;
            case 12:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.speeding_and_intersections.rt_stop_sign_cameras";
                break;
            case 13:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.driving_behavior.rt_noise_cameras";
                break;
            case 14:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.driving_behavior.rt_safe_distance_cameras";
                break;
            case 15:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.lanes.rt_carpool_lane_cameras";
                break;
            case 16:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.lanes.rt_bus_lane_cameras";
                break;
            case 17:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.lanes.rt_hov_lane_cameras";
                break;
            case 18:
                str = "settings_main.map_display.on_the_map.reports.alert_on.cameras.speeding_and_intersections.rt_speed_and_red_light_cameras";
                break;
            default:
                throw new h.i();
        }
        return new com.waze.ao.b.b(str, iB, iA);
    }

    public static com.waze.ao.b.g g(com.waze.asks.h hVar) {
        h.g.b.x.f(hVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        switch (hVar.ordinal()) {
            case 0:
                return new com.waze.ao.b.g(R.string.REPORT_RAILROAD, R.drawable.icon_report_railroad);
            case 1:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_SPEED_BUMP, R.drawable.icon_permanent_hazard_speed_bumps);
            case 2:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_DANGEROUS_CURVE, R.drawable.icon_permanent_hazard_dangerous_curves);
            case 3:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_INTERSECTION, R.drawable.icon_permanent_hazard_intersection);
            case 4:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_LANES_MERGING, R.drawable.icon_permanent_hazard_lanes_merging);
            case 5:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_TOLL_BOOTH, R.drawable.icon_permanent_hazard_toll_booth);
            case 6:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_TOPES, R.drawable.icon_permanent_hazard_topes);
            case 7:
                return new com.waze.ao.b.g(R.string.ALERT_TITLE_PERMANENT_HAZARD_SCHOOL_ZONE, R.drawable.icon_permanent_hazard_school_zone);
            case 8:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_SPEED_CAMERA, R.drawable.icon_alerter_cam_speed);
            case 9:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_RED_LIGHT_CAMERA, R.drawable.icon_alerter_cam_red_light);
            case 10:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_SEAT_BELT_CAMERA, R.drawable.icon_alerter_cam_seat_belt);
            case 11:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_MOBILE_PHONE_CAMERA, R.drawable.icon_alerter_cam_phone);
            case 12:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_STOP_SIGN_CAMERA, R.drawable.icon_alerter_cam_stop_signe);
            case 13:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_NOISE_CAMERA, R.drawable.icon_alerter_cam_noise);
            case 14:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_SAFE_DISTANCE_CAMERA, R.drawable.icon_alerter_cam_distance_between_vehicles);
            case 15:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_CARPOOL_LANE_CAMERA, R.drawable.icon_alerter_cam_hov);
            case 16:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_BUS_LANE_CAMERA, R.drawable.icon_alerter_cam_bus_lane);
            case 17:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_HOV_LANE_CAMERA, R.drawable.icon_alerter_cam_hov);
            case 18:
                return new com.waze.ao.b.g(R.string.REALTIME_ALERTS_RED_LIGHT_AND_SPEED_CAMERA, R.drawable.icon_alerter_cam_combo_speed_and_redlight);
            default:
                throw new h.i();
        }
    }

    public static com.waze.av.a.p h(Place place) {
        String str;
        String str2;
        String str3;
        String str4;
        h.g.b.x.f(place, "<this>");
        String country = place.getAddress().getCountry();
        if (country.length() == 0) {
            country = null;
        }
        String str5 = country;
        String city = place.getAddress().getCity();
        if (city.length() == 0) {
            city = null;
        }
        String str6 = city;
        String state = place.getAddress().getState();
        if (state.length() == 0) {
            state = null;
        }
        String str7 = state;
        String street = place.getAddress().getStreet();
        if (street.length() == 0) {
            street = null;
        }
        String str8 = street;
        String houseNumber = place.getAddress().getHouseNumber();
        if (houseNumber.length() == 0) {
            houseNumber = null;
        }
        String str9 = houseNumber;
        String zip = place.getAddress().getZip();
        if (zip.length() == 0) {
            zip = null;
        }
        com.waze.av.a.a aVar = new com.waze.av.a.a(str5, str6, str8, str9, str7, zip, null, 64);
        Position.IntPosition position = place.getPosition();
        h.g.b.x.e(position, "getPosition(...)");
        com.waze.shared_infra.h.c cVarI = com.waze.notifications.c.k.i(position);
        String venueId = place.getVenueId();
        if (venueId != null) {
            String str10 = venueId;
            if (str10.length() == 0) {
                str10 = null;
            }
            str = str10;
        } else {
            str = null;
        }
        String name = place.getName();
        if (name != null) {
            String str11 = name;
            if (str11.length() == 0) {
                str11 = null;
            }
            str2 = str11;
        } else {
            str2 = null;
        }
        String venueContext = place.getVenueContext();
        if (venueContext != null) {
            String str12 = venueContext;
            if (str12.length() == 0) {
                str12 = null;
            }
            str3 = str12;
        } else {
            str3 = null;
        }
        String routingContext = place.getRoutingContext();
        if (routingContext != null) {
            String str13 = routingContext;
            if (str13.length() == 0) {
                str13 = null;
            }
            str4 = str13;
        } else {
            str4 = null;
        }
        return new com.waze.av.a.p(aVar, cVarI, new com.waze.av.a.o(str, str2, str3, str4, null, place.hasIsResidential() ? Boolean.valueOf(place.getIsResidential().getValue()) : null, 16), place.hasDbId() ? Integer.valueOf(place.getDbId().getValue()) : null, place.getUpdatedTimeSec());
    }

    public static Map i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.waze.parked", 0);
        HashMap map = new HashMap();
        String[] strArr = {"dest_lon", "dest_lat", "dest_name", "dest_venueId"};
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            map.put(str, sharedPreferences.getString(str, ""));
        }
        return map;
    }

    public static void j(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.waze.parked", 0);
        sharedPreferences.edit().putString(DriveToNativeManager.EXTRA_LON, "-1").putString(DriveToNativeManager.EXTRA_LAT, "-1").putString("time", "-1").putString(TtmlNode.ATTR_ID, "").apply();
        sharedPreferences.edit().commit();
    }

    public static bj k(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.waze.parked", 0);
        bj bjVar = new bj();
        bjVar.f25360b = Double.parseDouble(sharedPreferences.getString(DriveToNativeManager.EXTRA_LON, "-1"));
        bjVar.f25359a = Double.parseDouble(sharedPreferences.getString(DriveToNativeManager.EXTRA_LAT, "-1"));
        bjVar.f25361c = Integer.parseInt(sharedPreferences.getString("time", "-1"));
        bjVar.f25362d = sharedPreferences.getString(TtmlNode.ATTR_ID, "");
        return bjVar;
    }

    public static void l(Modifier modifier, AnnotatedString annotatedString, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(modifier, "modifier");
        h.g.b.x.f(annotatedString, "annotatedString");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(603110710);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(modifier) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(annotatedString) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(603110710, i3, -1, "com.waze.menus.destination.bottomsheet.BottomSheetFooter (BottomSheetFooter.kt:23)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4276TextIbK3jfQ(annotatedString, modifier, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composerStartRestartGroup).c(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11013getJustifye0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(modifier, annotatedString, i2, 10));
        }
    }

    public static AnnotatedString m(int i2, final List list, final h.g.a.l lVar, Composer composer) {
        h.g.b.x.f(list, "tags");
        h.g.b.x.f(lVar, "handleLink");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1847692179, 48, -1, "com.waze.menus.destination.bottomsheet.buildAnnotatedWithArgs (BottomSheetFooter.kt:74)");
        }
        composer.startReplaceGroup(1810697588);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List listAf = h.n.o.af(com.waze.ui.r.a.c.c.b(i2, composer, 0), new String[]{"%s"}, 0, 6);
        composer.startReplaceGroup(1810701304);
        final int i3 = 0;
        for (Object obj : listAf) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h.a.i.p();
            }
            String str = (String) obj;
            int iPushStyle = builder.pushStyle(SpanStyle.m10478copyGSF8kmg$default(com.waze.bz.a.h(composer).c().toSpanStyle(), com.waze.bz.a.d(composer, 0).q(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
            try {
                builder.append(str);
                builder.pop(iPushStyle);
                if (i3 < list.size()) {
                    composer.startReplaceGroup(1837015254);
                    String strB = com.waze.ui.r.a.c.c.b(((com.waze.menus.a.a.c) list.get(i3)).a(), composer, 0);
                    String strName = ((com.waze.menus.a.a.c) list.get(i3)).name();
                    TextLinkStyles textLinkStyles = new TextLinkStyles(SpanStyle.m10478copyGSF8kmg$default(com.waze.bz.a.h(composer).c().toSpanStyle(), com.waze.bz.a.d(composer, 0).G(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null), null, null, null, 14, null);
                    boolean zChanged = composer.changed(lVar) | composer.changedInstance(list) | composer.changed(i3);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new LinkInteractionListener() { // from class: com.waze.menus.a.a.b
                            @Override // androidx.compose.ui.text.LinkInteractionListener
                            public final void onClick(LinkAnnotation linkAnnotation) {
                                x.f(linkAnnotation, "it");
                                lVar.invoke(list.get(i3));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    int iPushLink = builder.pushLink(new LinkAnnotation.Clickable(strName, textLinkStyles, (LinkInteractionListener) objRememberedValue));
                    try {
                        builder.append(strB);
                        builder.pop(iPushLink);
                        composer.endReplaceGroup();
                    } catch (Throwable th) {
                        builder.pop(iPushLink);
                        throw th;
                    }
                } else {
                    composer.startReplaceGroup(1837526506);
                    composer.endReplaceGroup();
                }
                i3 = i4;
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        }
        composer.endReplaceGroup();
        AnnotatedString annotatedString = builder.toAnnotatedString();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    public static void n(String str, List list, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.q qVar, Composer composer, int i2) {
        int i3;
        h.g.a.q qVar2;
        Composer composer2;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "options");
        h.g.b.x.f(lVar, "handleDestinationOptionClicked");
        h.g.b.x.f(lVar2, "iconSelector");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(334648653);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            qVar2 = qVar;
            i3 |= true != composerStartRestartGroup.changedInstance(qVar2) ? 8192 : 16384;
        } else {
            qVar2 = qVar;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334648653, i3, -1, "com.waze.menus.destination.bottomsheet.BottomSheetColumnContent (BottomSheetColumnContent.kt:53)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composerStartRestartGroup, (i3 >> 6) & 14);
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(list) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            boolean z = (i3 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new az(list, qVar2, str, lVar2, stateRememberUpdatedState, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (h.g.a.l) objRememberedValue, composer2, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(str, list, lVar, lVar2, qVar, i2, 7));
        }
    }

    private l() {
        throw null;
    }
}

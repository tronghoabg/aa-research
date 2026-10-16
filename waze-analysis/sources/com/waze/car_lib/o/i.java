package com.waze.car_lib.o;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.au;
import com.waze.car_lib.p.dc;
import com.waze.car_lib.screens.cp;
import com.waze.config.ConfigValues;
import com.waze.dx;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.ag;
import com.waze.settings.ds;
import com.waze.settings.eb;
import com.waze.settings.ej;
import com.waze.settings.en;
import com.waze.settings.gr;
import com.waze.settings.gu;
import com.waze.sound.bp;
import com.waze.sound.bu;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f20472a = new i();

    static final h.ab d() {
        ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_SELECTION_STATUS.d("set");
        return h.ab.f48028a;
    }

    public static final com.waze.settings.tree.d.d e(com.waze.shared_infra.o.a aVar, ds dsVar, bu buVar) {
        Object next;
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(buVar, "source");
        en enVar = new en(dsVar.p(), buVar);
        Iterable<bp> iterable = (Iterable) dsVar.p().a().d();
        ArrayList arrayList = new ArrayList(h.a.i.q(iterable, 10));
        for (bp bpVar : iterable) {
            ej ejVarC = gu.c(bpVar);
            arrayList.add(new com.waze.settings.tree.d.g(bpVar.a(), com.waze.ui.ad.b.c(Integer.valueOf(ejVarC.d())), null, com.waze.nightmode.e.s(Integer.valueOf(ejVarC.a())), null, null, 52));
        }
        h.k kVar = new h.k(enVar, arrayList);
        en enVar2 = (en) kVar.a();
        List list = (List) kVar.b();
        com.waze.settings.tree.d.d dVar = new com.waze.settings.tree.d.d("sounds", "VOICE_SETTINGS", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_SOUND_SETTINGS_TITLE, new Object[0])), null, enVar2, list, 8);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((com.waze.settings.tree.d.g) next).s(), enVar2.b())) {
                break;
            }
        }
        com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) next;
        if (gVar == null) {
            gVar = (com.waze.settings.tree.d.g) list.get(0);
        }
        dVar.I(gVar);
        return dVar;
    }

    private static final x f(com.waze.shared_infra.o.a aVar) {
        return new x("navigation_history", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_PRIVACY_SETTINGS_NAVIGATION_HISTORY_TITLE, new Object[0])), null, "DRIVE_HISTORY_SETTINGS", aVar.c(R.string.AAOS_PRIVACY_SETTINGS_NAVIGATION_HISTORY_TITLE, new Object[0]), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_NAVIGATION_HISTORY_TEXT, new Object[0]), false, new dc(aVar.c(R.string.AAOS_PRIVACY_SETTINGS_NAVIGATION_HISTORY_BUTTON, new Object[0]), true), null, null, null, "OK", 5892);
    }

    private static final com.waze.settings.tree.f g() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_ENABLED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_ROUTING_PERSONAL_ETA_ENABLED");
        return new com.waze.settings.tree.d.s("personal_eta", R.string.PERSONALIZED_NAVIGATION_PERSONALIZED_ROUTES_TITLE, R.string.PERSONALIZED_NAVIGATION_PERSONALIZED_ROUTES_DESCRIPTION, "PERSONAL_ETA", bVar, R.drawable.settings_icon_ride_history);
    }

    private static final com.waze.settings.tree.f h(com.waze.shared_infra.o.a aVar, String str, h.g.a.p pVar, int i2, String str2, int i3, int i4, d dVar) {
        return new y(str, aVar.c(i2, new Object[0]), str2, new f(dVar, pVar, i2, i3, i4), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_ITEM_STATUS_ON, new Object[0]), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_ITEM_STATUS_OFF, new Object[0]), aVar.c(i3, new Object[0]), aVar.c(i4, new Object[0]), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_MESSAGE_BUTTON_TURN_OFF, new Object[0]), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_MESSAGE_BUTTON_TURN_ON, new Object[0]), aVar.c(R.string.AAOS_PRIVACY_SETTINGS_MESSAGE_BUTTON_CANCEL, new Object[0]));
    }

    private static final com.waze.settings.tree.f i(com.waze.shared_infra.o.a aVar) {
        return new v("recent_destinations", new com.waze.ui.ac.m(aVar.c(R.string.PRIVACY_SETTINGS_ACTIVITY_RECENT_DESTINATIONS_TITLE, new Object[0])), "RECENT_DESTINATIONS", new au(2));
    }

    private static final x j(com.waze.shared_infra.o.a aVar, h.g.a.a aVar2) {
        return new x("sign_out", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_SIGN_OUT_TITLE, new Object[0])), com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_SIGN_OUT_SUBTITLE, new Object[0])), "LOGOUT_SETTINGS", aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_TITLE, new Object[0]), aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_SIGN_OUT_POPUP_TEXT, new Object[0]), false, new dc(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_SIGN_OUT_POPUP_BUTTON_CONFIRM, new Object[0]), true), new dc(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_SIGN_OUT_POPUP_BUTTON_CANCEL, new Object[0]), false), aVar2, new cp(8), null, 6144);
    }

    public final com.waze.settings.tree.d.n a(com.waze.shared_infra.o.a aVar, ds dsVar, eb ebVar, com.waze.sharedui.b.d dVar, com.waze.car_lib.c.a aVar2, com.waze.ev.n nVar, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, MyWazeNativeManager myWazeNativeManager, RealtimeNativeManager realtimeNativeManager, SettingsNativeManager settingsNativeManager, h.g.a.a aVar6, h.g.a.a aVar7, h.g.a.a aVar8, com.waze.google_assistant.c cVar, com.waze.settings.d.f fVar, com.waze.reports_v2.e eVar, h.g.a.l lVar, boolean z, com.waze.car_lib.r.b.b bVar) {
        com.waze.settings.tree.d.m mVar;
        char c2;
        int i2;
        int i3;
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(aVar2, "aaosAuditReporter");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(aVar3, "onSendLogsClicked");
        h.g.b.x.f(aVar4, "onOpenTollAndHOVSettingsClicked");
        h.g.b.x.f(aVar5, "onOpenLicensePlateClicked");
        h.g.b.x.f(myWazeNativeManager, "myWazeNativeManager");
        h.g.b.x.f(realtimeNativeManager, "realtimeNativeManager");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(aVar6, "onLogoutConfirmed");
        h.g.b.x.f(aVar7, "openPrivacyPolicy");
        h.g.b.x.f(aVar8, "openTermsOfUse");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(lVar, "openRequestRecordAudioPermission");
        h.g.b.x.f(bVar, "hncSettingsStateHolder");
        dsVar.U();
        com.waze.reports_v2.c.r rVar = new com.waze.reports_v2.c.r();
        int i4 = 0;
        gr grVar = new gr(dsVar, settingsNativeManager, ebVar, new b(rVar, 0), dVar, nVar, cVar, fVar, aVar, null, true, DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK);
        boolean z2 = eVar.b() instanceof com.waze.reports_v2.b;
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[6];
        int i5 = 4;
        if (myWazeNativeManager.isGuestUser()) {
            mVar = new com.waze.settings.tree.d.m("account_guest_group", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_GUEST_GROUP_TITLE, new Object[0])), h.a.i.d(j(aVar, aVar6)));
            c2 = 5;
            i2 = 2;
            i3 = 3;
        } else {
            c2 = 5;
            i2 = 2;
            i3 = 3;
            mVar = new com.waze.settings.tree.d.m("account_group", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_SECTION_TITLE, new Object[0])), h.a.i.i(new w("full_name", com.waze.ui.ad.b.d(aVar.c(R.string.FULL_NAME, new Object[0])), new com.waze.app_nav.a.a(dsVar, 18), i5), new w(HintConstants.AUTOFILL_HINT_PHONE, com.waze.ui.ad.b.d(aVar.c(R.string.PHONE, new Object[0])), new com.waze.app_nav.a.a(dsVar, 19), i5), new w(NotificationCompat.CATEGORY_EMAIL, com.waze.ui.ad.b.d(aVar.c(R.string.EMAIL, new Object[0])), new com.waze.app_nav.a.a(dsVar, 20), i5), new w(HintConstants.AUTOFILL_HINT_USERNAME, com.waze.ui.ad.b.d(aVar.c(R.string.USERNAME, new Object[0])), new com.waze.asks.ad(dsVar, 1), i5), j(aVar, aVar6)));
        }
        fVarArr[0] = new com.waze.settings.tree.d.n("account", "ACCOUNT_AND_LOGIN_SETTINGS", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ACCOUNT_SETTINGS_TITLE, new Object[0])), (com.waze.settings.tree.d) null, h.a.i.d(mVar), 24);
        fVarArr[1] = e(aVar, dsVar, bu.f39573b);
        ag agVar = new ag(z, lVar);
        agVar.A(new com.waze.settings.tree.c.e(!z2, 1));
        fVarArr[i2] = agVar;
        fVarArr[i3] = c(aVar, myWazeNativeManager, aVar2, dsVar);
        String coreVersion = realtimeNativeManager.getCoreVersion();
        com.waze.ui.ac.n nVarD = com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_TERMS_SETTINGS_TITLE, new Object[0]));
        com.waze.settings.tree.f[] fVarArr2 = new com.waze.settings.tree.f[4];
        fVarArr2[0] = new v("about", com.waze.ui.ad.b.d(aVar.c(R.string.ABOUT_SETTING_MENU_ITEM, new Object[0])), "ABOUT_SETTINGS", new dx(coreVersion, i3));
        fVarArr2[1] = new x("terms_of_use", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TITLE, new Object[0])), null, "TERMS_OF_USE_SETTINGS", aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TEXT, new Object[0]), true, new dc(aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_BUTTON, new Object[0]), true), null, aVar8, null, null, 7428);
        fVarArr2[i2] = new x("privacy_policy", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TITLE, new Object[0])), null, "PRIVACY_POLICY_SETTINGS", aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TEXT, new Object[0]), true, new dc(aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_BUTTON, new Object[0]), true), null, aVar7, null, null, 7428);
        fVarArr2[3] = new w("version", com.waze.ui.ad.b.d(aVar.c(R.string.AAOS_ABOUT_SETTINGS_VERSION_PS, coreVersion)), null, 12);
        fVarArr[4] = new com.waze.settings.tree.d.n("terms", "TERMS_SETTINGS", nVarD, (com.waze.settings.tree.d) null, h.a.i.i(fVarArr2), 24);
        h.g.b.x.f(aVar3, "clickListener");
        fVarArr[c2] = new com.waze.settings.tree.d.h("send_logs", R.string.SEND_LOGS, "SEND_LOGS_SETTINGS", R.drawable.setting_icon_send_logs, new j(aVar3, 3));
        com.waze.settings.tree.d.m mVar2 = new com.waze.settings.tree.d.m("general_settings", com.waze.ui.ad.b.d(aVar.c(R.string.GENERAL, new Object[0])), h.a.i.i(fVarArr));
        com.waze.settings.tree.f[] fVarArr3 = new com.waze.settings.tree.f[4];
        fVarArr3[0] = grVar.h();
        fVarArr3[1] = new t("subscriptions", "SUBSCRIPTIONS_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.TOLL_AND_HOV_PASSES)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_passes)), new j(aVar4, 1), 8);
        fVarArr3[i2] = ae.h(bVar, aVar, aVar5);
        com.waze.settings.tree.f fVarI = grVar.i();
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.MY_WAZE_EDIT_CAR));
        com.waze.settings.tree.d dVarS = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_car_details));
        com.waze.settings.tree.f[] fVarArr4 = new com.waze.settings.tree.f[i2];
        fVarArr4[0] = fVarI;
        t tVar = new t("license_plate", "LICENSE_PLATE_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SETTINGS_LICENCE_PLATE_TITLE)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_licence_plate)), new j(aVar5, 0), 8);
        tVar.A(new k(i4));
        fVarArr4[1] = tVar;
        fVarArr3[3] = new com.waze.settings.tree.d.n("car_details", "CAR_DETAILS_SETTINGS", nVarC, dVarS, h.a.i.i(fVarArr4), 16);
        com.waze.settings.tree.d.n nVar2 = new com.waze.settings.tree.d.n("settings_main", "SETTINGS_MAIN_SETTINGS", com.waze.ui.ad.b.d(aVar.c(R.string.SETTINGS, new Object[0])), (com.waze.settings.tree.d) null, h.a.i.i(new com.waze.settings.tree.d.m("driving_preferences", com.waze.ui.ad.b.d(aVar.c(R.string.DRIVING_PREFERENCES, new Object[0])), h.a.i.k(fVarArr3)), mVar2), 24);
        rVar.d(nVar2);
        return nVar2;
    }

    public final com.waze.settings.tree.d.n b() {
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.PERSONALIZED_NAVIGATION_TITLE));
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_ROUTING_PERSONALIZED_ROUTES_ENABLED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_ROUTING_PERSONALIZED_ROUTES_ENABLED");
        return new com.waze.settings.tree.d.n("personalized_navigation_settings", (String) null, nVarC, (com.waze.settings.tree.d) null, h.a.i.i(g(), new com.waze.settings.tree.d.s("personal_route", R.string.PERSONALIZED_NAVIGATION_PETA_TITLE, R.string.PERSONALIZED_NAVIGATION_PETA_DESCRIPTION, "PERSONAL_ROUTING", bVar)), 24);
    }

    public final com.waze.settings.tree.d.n c(com.waze.shared_infra.o.a aVar, MyWazeNativeManager myWazeNativeManager, com.waze.car_lib.c.a aVar2, ds dsVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(myWazeNativeManager, "myWazeNativeManager");
        h.g.b.x.f(aVar2, "auditReporter");
        h.g.b.x.f(dsVar, "settingsRepository");
        int i2 = 1;
        if (ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED.b().booleanValue()) {
            com.waze.ui.ac.n nVarD = com.waze.ui.ad.b.d(aVar.c(R.string.PRIVACY_SETTINGS, new Object[0]));
            com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.PERSONALIZED_SETTINGS_TITLE));
            com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.PERSONALIZED_SETTINGS_TRIP_SUGGESTIONS_TITLE));
            com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS;
            h.g.b.x.e(bVar, "CONFIG_VALUE_START_STATE…INGS_ALLOW_TRIP_FORECASTS");
            com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS_NOTIFICATIONS;
            h.g.b.x.e(bVar2, "CONFIG_VALUE_START_STATE…P_FORECASTS_NOTIFICATIONS");
            com.waze.settings.tree.d.s[] sVarArr = {new com.waze.settings.tree.d.s("trip_suggestions", R.string.AAOS_PRIVACY_SETTINGS_TRIP_SUGGESTIONS_TITLE, R.string.AAOS_PRIVACY_SETTINGS_TRIP_SUGGESTIONS_DESCRIPTION, "PREDICTIONS", bVar), new com.waze.settings.tree.d.s("trip_forecasts", R.string.AAOS_PRIVACY_SETTINGS_TRIP_FORECASTS_TITLE, R.string.AAOS_PRIVACY_SETTINGS_TRIP_FORECASTS_DESCRIPTION, "PREDICTIONS_NOTIFICATIONS", bVar2)};
            Integer numValueOf = Integer.valueOf(R.string.PERSONALIZED_SETTINGS_ADS_PERSONALIZATION_TITLE);
            return new com.waze.settings.tree.d.n("privacy", "PRIVACY_SETTINGS", nVarD, (com.waze.settings.tree.d) null, h.a.i.i(new com.waze.settings.tree.d.n("personalization", (String) null, nVarC, (com.waze.settings.tree.d) null, h.a.i.i(b(), new com.waze.settings.tree.d.n("trip_suggestions_settings", (String) null, nVarC2, (com.waze.settings.tree.d) null, h.a.i.i(sVarArr), 24), new com.waze.settings.tree.d.n("ads_personalization_settings", (String) null, com.waze.ui.ad.b.c(numValueOf), (com.waze.settings.tree.d) null, h.a.i.d(new com.waze.settings.tree.d.s("ads_personalization_settings", numValueOf, Integer.valueOf(R.string.PERSONALIZED_SETTINGS_ADS_PERSONALIZATION_DESCRIPTION), (String) null, new e())), 24)), 24), h(aVar, "invisible_mode", new g(aVar2, 1, (byte[]) null), R.string.AAOS_PRIVACY_SETTINGS_INVISIBLE_MODE_TITLE, "INVISIBLE_SETTINGS", R.string.AAOS_PRIVACY_SETTINGS_INVISIBLE_MODE_ON_MESSAGE, R.string.AAOS_PRIVACY_SETTINGS_INVISIBLE_MODE_OFF_MESSAGE, new h(myWazeNativeManager, 1)), f(aVar), i(aVar)), 24);
        }
        com.waze.ui.ac.n nVarD2 = com.waze.ui.ad.b.d(aVar.c(R.string.PRIVACY_SETTINGS, new Object[0]));
        com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING;
        h.g.b.x.e(bVar3, "CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING");
        c cVar = new c(bVar3, new a(0));
        com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS;
        h.g.b.x.e(bVar4, "CONFIG_VALUE_START_STATE…INGS_ALLOW_TRIP_FORECASTS");
        c cVar2 = new c(bVar4, null);
        h hVar = new h(myWazeNativeManager, 0);
        com.waze.settings.tree.f fVarG = g();
        fVarG.A(new k(i2));
        return new com.waze.settings.tree.d.n("privacy", "PRIVACY_SETTINGS", nVarD2, (com.waze.settings.tree.d) null, h.a.i.i(h(aVar, "personalize_ads", new g(aVar2, 0), R.string.AAOS_PRIVACY_SETTINGS_PERSONALIZED_ADS_TITLE, "PERSONALIZE_ADS_SETTINGS", R.string.AAOS_PRIVACY_SETTINGS_PERSONALIZED_ADS_ON_MESSAGE, R.string.AAOS_PRIVACY_SETTINGS_PERSONALIZED_ADS_OFF_MESSAGE, cVar), h(aVar, "trip_suggestions", new g(aVar2, 2, (char[]) null), R.string.AAOS_PRIVACY_SETTINGS_TRIP_SUGGESTIONS_TITLE, "PREDICTIONS", R.string.AAOS_PRIVACY_SETTINGS_TRIP_SUGGESTIONS_ON_MESSAGE, R.string.AAOS_PRIVACY_SETTINGS_TRIP_SUGGESTIONS_OFF_MESSAGE, cVar2), h(aVar, "invisible_mode", new g(aVar2, 3, (byte[]) null), R.string.AAOS_PRIVACY_SETTINGS_INVISIBLE_MODE_TITLE, "INVISIBLE_SETTINGS", R.string.AAOS_PRIVACY_SETTINGS_INVISIBLE_MODE_ON_MESSAGE, R.string.AAOS_PRIVACY_SETTINGS_INVISIBLE_MODE_OFF_MESSAGE, hVar), f(aVar), i(aVar), fVarG), 24);
    }
}

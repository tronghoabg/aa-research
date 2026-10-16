package com.waze.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.internal.AssetHelper;
import com.waze.ConfigManager;
import com.waze.InternalWebBrowser;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.navigate.NavigateNativeManager;
import com.waze.profile.TempUserProfileActivity;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gr {

    /* renamed from: a, reason: collision with root package name */
    private final ds f37328a;

    /* renamed from: b, reason: collision with root package name */
    private final SettingsNativeManager f37329b;

    /* renamed from: c, reason: collision with root package name */
    private final eb f37330c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.settings.tree.o f37331d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.b.d f37332e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ev.n f37333f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.google_assistant.c f37334g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.settings.d.f f37335h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f37336i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.main_screen.c.a f37337j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f37338k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37339l;
    private final com.waze.settings.tree.c.c m;
    private final com.waze.settings.tree.c.c n;

    public /* synthetic */ gr(ds dsVar, SettingsNativeManager settingsNativeManager, eb ebVar, com.waze.settings.tree.o oVar, com.waze.sharedui.b.d dVar, com.waze.ev.n nVar, com.waze.google_assistant.c cVar, com.waze.settings.d.f fVar, com.waze.shared_infra.o.a aVar, com.waze.main_screen.c.a aVar2, boolean z, int i2) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SettingsTreeBuilder");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(oVar, "refProvider");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(eVarD, "logger");
        this.f37328a = dsVar;
        this.f37329b = settingsNativeManager;
        this.f37330c = ebVar;
        this.f37331d = oVar;
        this.f37332e = dVar;
        this.f37333f = nVar;
        this.f37334g = cVar;
        this.f37335h = fVar;
        this.f37336i = aVar;
        this.f37337j = (i2 & 512) != 0 ? null : aVar2;
        this.f37338k = z;
        this.f37339l = eVarD;
        this.m = new com.waze.car_lib.o.k(6);
        this.n = new eh(0);
    }

    static final boolean A(gr grVar) {
        return grVar.f37328a.m().j();
    }

    public static final /* synthetic */ void C(gr grVar, WazeSettingsView wazeSettingsView) {
        int dimension = (int) wazeSettingsView.getResources().getDimension(R.dimen.settings_email_right_decor_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(dimension, dimension, dimension, dimension);
        Context context = wazeSettingsView.getContext();
        h.g.b.x.e(context, "getContext(...)");
        WazeTextView wazeTextView = new WazeTextView(context, null, 0, 6, null);
        wazeTextView.setText(grVar.f37336i.c(R.string.EDIT, new Object[0]));
        wazeTextView.setTextColor(ContextCompat.getColor(wazeTextView.getContext(), R.color.content_p3));
        wazeTextView.setGravity(17);
        wazeTextView.setLayoutParams(marginLayoutParams);
        wazeSettingsView.x(wazeTextView);
    }

    static final void E(gr grVar) {
        com.waze.bc.aboutClick$default(grVar.f37328a.f(), null, 1, null);
    }

    static final void H(gr grVar, com.waze.reports.ba baVar) {
        Context contextC = baVar != null ? baVar.c() : null;
        Activity activity = contextC instanceof Activity ? (Activity) contextC : null;
        if (activity == null) {
            grVar.f37339l.g("GenAccountAndLoginGuest: context is not Activity or null");
        } else {
            activity.startActivityForResult(new Intent(activity, (Class<?>) TempUserProfileActivity.class), 15000);
        }
    }

    static final void I(gr grVar, com.waze.reports.ba baVar) {
        Context contextC = baVar != null ? baVar.c() : null;
        com.waze.ifs.ui.a aVar = contextC instanceof com.waze.ifs.ui.a ? (com.waze.ifs.ui.a) contextC : null;
        if (aVar == null) {
            grVar.f37339l.g("PrivacySettings: context is not ActivityBase or null");
            return;
        }
        int i2 = InternalWebBrowser.f13552f;
        String strC = com.waze.shared_infra.o.b.a().c(R.string.BROWER_TERMS_OF_USE_TITLE, new Object[0]);
        String configValueString = grVar.f37328a.f().getConfigValueString(ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_TERMS_OF_USE_URL);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        aVar.startActivityForResult(com.waze.cs.a(aVar, strC, configValueString, false, 0L), 0);
    }

    static final void J(gr grVar, com.waze.reports.ba baVar) {
        Context contextC = baVar != null ? baVar.c() : null;
        com.waze.ifs.ui.a aVar = contextC instanceof com.waze.ifs.ui.a ? (com.waze.ifs.ui.a) contextC : null;
        if (aVar == null) {
            grVar.f37339l.g("PrivacySettings: context is not ActivityBase or null");
            return;
        }
        int i2 = InternalWebBrowser.f13552f;
        String strC = com.waze.shared_infra.o.b.a().c(R.string.BROWSER_PRIVACY_POLICY_TITLE, new Object[0]);
        String configValueString = grVar.f37328a.f().getConfigValueString(ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_PRIVACY_POLICY_URL);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        aVar.startActivityForResult(com.waze.cs.a(aVar, strC, configValueString, false, 0L), 0);
    }

    static final void K(gr grVar, com.waze.reports.ba baVar) {
        com.waze.app_nav.hub.b.a aVar = null;
        Context contextC = baVar != null ? baVar.c() : null;
        if (contextC == null || !com.waze.navigate.location_preview.ba.g(contextC)) {
            com.waze.app_nav.hub.b.c.f15258a.a().b(new com.waze.app_nav.hub.b.k("SETTINGS_NO_NETWORK", aVar, new com.waze.sharedui.d.c(grVar, 1), 6));
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        com.waze.shared_infra.o.a aVar2 = grVar.f37336i;
        String strC = aVar2.c(R.string.SHARE_WAZE_MESSAGE_SUBJECT, new Object[0]);
        String strC2 = aVar2.c(R.string.SHARE_WAZE_MESSAGE_BODY, new Object[0]);
        intent.putExtra("android.intent.extra.SUBJECT", strC);
        intent.putExtra("android.intent.extra.TEXT", strC2);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        contextC.startActivity(Intent.createChooser(intent, aVar2.c(R.string.SHARE_WAZE_SETTING_SHARE_WAZE_BUTTON, new Object[0])));
    }

    private final com.waze.settings.tree.f L(ds dsVar) {
        List listI;
        com.waze.main_screen.c.a aVar = this.f37337j;
        String str = "ALWAYS_SHOW_SETTINGS";
        String str2 = "always_show";
        if (aVar == null || !aVar.f()) {
            ConfigManager configManagerF = dsVar.f();
            com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_MAP_ICONS_SHOW_ON_SCREEN_ON_TAP;
            h.g.b.x.e(bVar, "CONFIG_VALUE_MAP_ICONS_SHOW_ON_SCREEN_ON_TAP");
            ConfigManager configManagerF2 = dsVar.f();
            com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_MAP_ICONS_SHOW_ZOOM_BUTTON;
            h.g.b.x.e(bVar2, "CONFIG_VALUE_MAP_ICONS_SHOW_ZOOM_BUTTON");
            listI = h.a.i.i(new com.waze.settings.tree.d.s(str2, R.string.ALWAYS_SHOW_MAP_CONTROLS, str, gu.b(configManagerF, bVar, true)), new com.waze.settings.tree.d.l("always_show_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.CONTOLS_ON_MAP_ALWAYS_SHOW_DESCRIPTION))), new com.waze.settings.tree.d.s("zoom_control", R.string.ZOOM_CONTROL, "ZOOM_CONTROL_SETTINGS", gu.b(configManagerF2, bVar2, false)));
        } else {
            int i2 = com.waze.settings.tree.a.h.f37469a;
            com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_BUTTON_PACK_DISPLAY_SOUND_SETTING;
            h.g.b.x.e(bVar3, "CONFIG_VALUE_BUTTON_PACK_DISPLAY_SOUND_SETTING");
            listI = h.a.i.i(com.waze.settings.tree.a.d.c(R.string.MAP_SHORTCUTS_SETTINGS_ASSISTANT, dsVar, aVar, new am(this, 8)), S(R.string.MAP_SHORTCUTS_SETTINGS_AUDIO_SDK), new com.waze.settings.tree.d.s(str2, R.string.MAP_SHORTCUTS_SETTINGS_SOUND_SETTINGS, str, new eo(this, bVar3)));
        }
        com.waze.settings.tree.d.n nVar = new com.waze.settings.tree.d.n("controls_on_map", "CONTROLS_ON_MAP_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.QUICK_ACCESS)), (com.waze.settings.tree.d) null, listI, 24);
        if (aVar == null || !aVar.f()) {
            nVar.D("always_show", R.string.ALWAYS_SHOW_CONTROLS, R.string.TAP_TO_SHOW);
        } else {
            nVar.D("always_show", R.string.ALWAYS_SHOW_CONTROLS_V1, R.string.ALWAYS_SHOW_CONTROLS_V1);
        }
        return nVar;
    }

    private final com.waze.settings.tree.f M() {
        String str = "LICENSE_PLATE_SETTINGS";
        String str2 = "license_plate";
        com.waze.settings.tree.d.n nVar = new com.waze.settings.tree.d.n(str2, str, com.waze.ui.ad.b.c(Integer.valueOf(R.string.SETTINGS_LICENCE_PLATE_TITLE)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_licence_plate)), new com.waze.settings.tree.b.a(this.f37328a).c(), 16);
        nVar.C("license_plate_last_2_digits");
        com.waze.settings.tree.d.n nVar2 = nVar;
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_LICENSE_PLATE_FEATURE_ENABLED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_LICENSE_PLATE_FEATURE_ENABLED");
        com.waze.settings.tree.c.f.a(nVar2, bVar);
        return nVar2;
    }

    private final com.waze.settings.tree.f N(ds dsVar) {
        com.waze.settings.tree.d.n nVar;
        com.waze.settings.tree.d.g gVar;
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER));
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[2];
        boolean z = false;
        fVarArr[0] = new com.waze.settings.tree.d.s("show_speedometer", R.string.SPEEDOMETER_SETTINGS_SHOW_SPEEDOMETER, "SHOW_SPEEDOMETER_SETTINGS", new ew(dsVar, 6));
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEED_LIMIT));
        com.waze.settings.tree.f[] fVarArr2 = new com.waze.settings.tree.f[4];
        com.waze.ui.ac.n nVarC3 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER_SETTINGS_SHOW_LIMIT));
        ConfigManager configManagerF = dsVar.f();
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_USER_ENABLED;
        h.g.b.x.e(dVar, "CONFIG_VALUE_MAP_SPEEDOM…_SPEED_LIMIT_USER_ENABLED");
        com.waze.settings.tree.d dVar2 = null;
        int i2 = 1;
        fVarArr2[0] = new fz(dsVar, nVarC3, gu.d(configManagerF, dVar), h.a.i.i(new com.waze.settings.tree.d.g("no", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER_SETTINGS_DONT_SHOW)), null, null, dVar2, null, 60), new com.waze.settings.tree.d.g("yes", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER_SETTINGS_SHOW_EXCEEDING)), false ? 1 : 0, dVar2, false ? 1 : 0, null, 60), new com.waze.settings.tree.d.g("always", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER_SETTINGS_SHOW_ALWAYS)), null, null, null, null, 60)));
        com.waze.ui.ac.n nVarC4 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.WHEN_TO_DISPLAY));
        ConfigManager configManagerF2 = dsVar.f();
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_ALERT_OFFSET;
        h.g.b.x.e(cVar, "CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_ALERT_OFFSET");
        h.g.b.x.f(configManagerF2, "configManager");
        h.g.b.x.f(cVar, "config");
        el elVar = new el(configManagerF2, cVar, 1);
        List<String> listI = h.a.i.i("0", "-5", "-10", "-15", "-20", "5", "10", "15");
        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
        for (String str : listI) {
            boolean z2 = z;
            if (h.n.o.ah(str, "-")) {
                com.waze.shared_infra.o.a aVar = this.f37336i;
                Integer numValueOf = Integer.valueOf(-Integer.parseInt(str));
                String strS = dsVar.s();
                int i3 = i2;
                Object[] objArr = new Object[2];
                objArr[z2 ? 1 : 0] = numValueOf;
                objArr[i3] = strS;
                gVar = new com.waze.settings.tree.d.g(str, com.waze.ui.ad.b.d(aVar.c(R.string.SPEEDOMETER_SETTINGS_OFFSET_PD_PS, objArr)), null, null, null, null, 60);
            } else {
                int i4 = i2;
                if (h.g.b.x.n(str, "0")) {
                    gVar = new com.waze.settings.tree.d.g(str, com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER_SETTINGS_WHEN_REACHING)), null, null, null, null, 60);
                } else {
                    com.waze.shared_infra.o.a aVar2 = this.f37336i;
                    Integer numValueOf2 = Integer.valueOf(Integer.parseInt(str));
                    Object[] objArr2 = new Object[i4];
                    objArr2[z2 ? 1 : 0] = numValueOf2;
                    gVar = new com.waze.settings.tree.d.g(str, com.waze.ui.ad.b.d(aVar2.c(R.string.SPEEDOMETER_SETTINGS_OFFSET_PD, objArr2)), null, null, null, null, 60);
                }
            }
            arrayList.add(gVar);
            z = z2 ? 1 : 0;
            i2 = 1;
        }
        fVarArr2[1] = new ga(dsVar, nVarC4, elVar, arrayList);
        ConfigManager configManagerF3 = dsVar.f();
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_SOUNDS;
        h.g.b.x.e(bVar, "CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_SOUNDS");
        fVarArr2[2] = new gb(dsVar, gu.b(configManagerF3, bVar, false));
        fVarArr2[3] = new gc(dsVar, com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEEDOMETER_SETTINGS_NOTE)));
        fVarArr[1] = new com.waze.settings.tree.d.m("speed_limits", nVarC2, h.a.i.i(fVarArr2));
        com.waze.settings.tree.d.n nVar2 = new com.waze.settings.tree.d.n("speedometer", "SPEEDOMETER_SETTINGS", nVarC, (com.waze.settings.tree.d) null, h.a.i.i(fVarArr), 24);
        com.waze.main_screen.c.a aVar3 = this.f37337j;
        if (aVar3 == null || !aVar3.f()) {
            nVar2.D("show_speedometer", R.string.ALWAYS_SHOW_CONTROLS, R.string.SPEEDOMETER_SETTINGS_DONT_SHOW);
            nVar = nVar2;
        } else {
            nVar = nVar2;
        }
        return nVar;
    }

    private final com.waze.settings.tree.f O() {
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.START_STATE_SETTINGS_TITLE));
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.START_STATE_SETTINGS_NOTIFICATIONS_SECTION_TITLE));
        ConfigManager configManagerF = this.f37328a.f();
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS_NOTIFICATIONS;
        h.g.b.x.e(bVar, "CONFIG_VALUE_START_STATE…P_FORECASTS_NOTIFICATIONS");
        String str = "trip_suggestions";
        String str2 = "TRIP_SUGGESTIONS_SETTINGS";
        com.waze.settings.tree.d.n nVar = new com.waze.settings.tree.d.n(str, str2, nVarC, (com.waze.settings.tree.d) null, h.a.i.i(new com.waze.settings.tree.d.s("allow_trip_forecasts", R.string.START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS, "PREDICTIONS", new ew(this, 7)), new com.waze.settings.tree.d.l("allow_trip_forecasts_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS_DESCRIPTION))), new com.waze.settings.tree.d.m("start_state_notifications_settings", nVarC2, h.a.i.i(new com.waze.settings.tree.d.s("allow_trip_forecast_notifications", R.string.START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS_NOTIFICATIONS, "PREDICTIONS_NOTIFICATIONS", gu.b(configManagerF, bVar, false)), new com.waze.settings.tree.d.l("allow_trip_forecast_notifications_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS_NOTIFICATIONS_DESCRIPTION)))))), 24);
        com.waze.nightmode.e.o(nVar, R.string.contentDescription_generalSettingsTripForecastsLabel);
        return nVar;
    }

    private final com.waze.settings.tree.d.n P(final ds dsVar) {
        fo foVar;
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ACCOUNT_AND_LOGIN_SETTINGS));
        com.waze.settings.tree.d dVarS = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_account));
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[4];
        fVarArr[0] = new com.waze.settings.tree.ab(0);
        char c2 = 2;
        fVarArr[1] = new com.waze.settings.tree.d.m("account_details", com.waze.ui.ad.b.c(Integer.valueOf(R.string.ACCOUNT_DETAILS_TITLE)), h.a.i.i(new fd(dsVar, this, com.waze.ui.ad.b.c(Integer.valueOf(R.string.FULL_NAME)), h.a.i.i(new com.waze.settings.tree.d.k("first_name", "FIRST_NAME_SETTINGS", Integer.valueOf(R.string.FIRST_NAME), new fg(dsVar, 1), R.drawable.textfield_name_icon, 5, true, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT), new com.waze.settings.tree.d.k("last_name", "LAST_NAME_SETTINGS", Integer.valueOf(R.string.LAST_NAME), new fg(dsVar, 0), R.drawable.textfield_name_icon, 5, false, DisplayStrings.DS_ACCIDENT), new com.waze.settings.tree.d.l("full_name_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.FULLNAME_DESCRIPTION))))), new com.waze.settings.tree.d.l("account_details_footer", com.waze.ui.ad.b.c(Integer.valueOf(R.string.YOUR_PHOTO_AND_FULL_NAME_WILL_BE_SHOWN_TO_FRIENDS_RW)))));
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.LOGIN_INFO_TITLE));
        com.waze.settings.tree.f[] fVarArr2 = new com.waze.settings.tree.f[5];
        fVarArr2[0] = new ez(dsVar, this);
        fVarArr2[1] = new gg(dsVar, this, com.waze.ui.ad.b.c(Integer.valueOf(R.string.NICKNAME)), h.a.i.i(new gh(dsVar, new fg(dsVar, 3)), new gk(dsVar, this), new com.waze.settings.tree.d.l("username_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.NICKNAME_DESCRIPTION)))));
        boolean zBooleanValue = ConfigValues.CONFIG_VALUE_LOGIN_WEB_CHANGE_PASSWORD_PAGE_ENABLED.b().booleanValue();
        Integer numValueOf = Integer.valueOf(R.string.PASSWORD);
        if (zBooleanValue) {
            foVar = new com.waze.settings.tree.d.i(HintConstants.AUTOFILL_HINT_PASSWORD, "PASSWORD_SETTINGS", com.waze.ui.ad.b.c(numValueOf), null, com.waze.settings.tree.c.f37530a, 32);
        } else {
            foVar = new fo(dsVar, com.waze.ui.ad.b.c(numValueOf), h.a.i.i(new com.waze.settings.tree.d.k(HintConstants.AUTOFILL_HINT_PASSWORD, "PASSWORD_SETTINGS", numValueOf, new fg(dsVar, 2), R.drawable.textfield_password_icon, 2, true, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT), new com.waze.settings.tree.d.l("email_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.PASSWORD_DESCRIPTION)))));
            c2 = 2;
        }
        fVarArr2[c2] = foVar;
        ey eyVar = new ey(this, dsVar, com.waze.ui.ad.b.c(Integer.valueOf(R.string.AADC_EDIT_AGE_TITLE)), new ed(dsVar, 4), new bp() { // from class: com.waze.settings.ee
            @Override // com.waze.settings.bp
            public final void a(com.waze.reports.ba baVar) {
                dsVar.ad(new q(this));
            }
        });
        eyVar.A(this.m);
        fVarArr2[3] = eyVar;
        fVarArr2[4] = new com.waze.settings.tree.d.l("login_info_footer", com.waze.ui.ad.b.c(Integer.valueOf(R.string.LOGIN_INFO_NOTE)));
        fVarArr[2] = new com.waze.settings.tree.d.m("login_info", nVarC2, h.a.i.i(fVarArr2));
        com.waze.ui.ac.n nVarC3 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ADVANCED));
        eq eqVar = new eq(dsVar);
        eqVar.A(new ed(dsVar, 9));
        fVarArr[3] = new com.waze.settings.tree.d.m("account_advanced_group", nVarC3, h.a.i.i(new ep(), eqVar, new er(), new com.waze.settings.tree.d.l("advanced_groups_footer", com.waze.ui.ad.b.c(Integer.valueOf(R.string.YOU_CAN_DELETE_YOUR_ACCOUNT_AND_PERSONAL_DATA_ANYTIME_NO_RANK)))));
        return new com.waze.settings.tree.d.n("account_and_login", "ACCOUNT_AND_LOGIN_SETTINGS", nVarC, dVarS, h.a.i.i(fVarArr), 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.waze.settings.tree.d.n Q() {
        String strC;
        boolean zAc = this.f37328a.ac();
        int[] iArr = {5, 25, 50, 100, 200};
        int[] iArr2 = {8, 40, 80, 160, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT};
        com.waze.settings.tree.d.g[] gVarArr = new com.waze.settings.tree.d.g[7];
        com.waze.settings.tree.d dVar = null;
        gVarArr[0] = new com.waze.settings.tree.d.g("-1", com.waze.ui.ad.b.c(Integer.valueOf(R.string.ALL)), null, null, dVar, null, 60);
        gVarArr[1] = new com.waze.settings.tree.d.g("-2", com.waze.ui.ad.b.c(Integer.valueOf(R.string.ON_ROUTE_ONLY)), 0 == true ? 1 : 0, dVar, 0 == true ? 1 : 0, null, 60);
        com.waze.shared_infra.o.a aVar = this.f37336i;
        if (zAc) {
            strC = aVar.c(R.string.KM, new Object[0]);
        } else {
            strC = aVar.c(R.string.MILE, new Object[0]);
            iArr = iArr2;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            gVarArr[i2 + 2] = new com.waze.settings.tree.d.g(String.valueOf(iArr[i2]), com.waze.ui.ad.b.d(iArr[i2] + " " + strC), null, null, null, null, 60);
        }
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ALERTS_AND_REPORTS_SETTINGS));
        com.waze.settings.tree.d dVarS = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alerts));
        com.waze.settings.tree.o oVar = this.f37331d;
        com.waze.settings.tree.d dVar2 = null;
        int i3 = 56;
        com.waze.ui.ac.n nVar = null;
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ALERTS_AND_REPORTS_AREA));
        com.waze.config.d dVar3 = ConfigValues.CONFIG_VALUE_EVENTS_RADIUS;
        h.g.b.x.e(dVar3, "CONFIG_VALUE_EVENTS_RADIUS");
        com.waze.settings.tree.d.m mVar = new com.waze.settings.tree.d.m("safety", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SAFETY)), h.a.i.i(new com.waze.settings.tree.p("high_risk_areas", "settings_main.notifications_and_reminders.reminders.high_risk_areas", oVar, nVar, dVar2, i3), Y()));
        mVar.c();
        return new com.waze.settings.tree.d.n("alerts_and_reports", "ALERTS_AND_REPORTS_SETTINGS", nVarC, dVarS, h.a.i.i(new com.waze.settings.tree.p("reports", "settings_main.map_display.on_the_map.reports", oVar, nVar, dVar2, i3), new es(nVarC2, new com.waze.settings.tree.c.g(dVar3, 0), h.a.c.R(gVarArr)), mVar), 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.waze.settings.tree.d.n R(final ds dsVar) {
        ConfigManager configManagerF = dsVar.f();
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORTS));
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_ALERT_ON));
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[20];
        com.waze.ui.ac.n nVarC3 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.WAZE_TO_GOAL_SETTINGS_LABEL));
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_IS_USER_OPTED_IN;
        h.g.b.x.e(bVar, "CONFIG_VALUE_WAZE_TO_GOAL_IS_USER_OPTED_IN");
        com.waze.settings.tree.s sVar = new com.waze.settings.tree.s("waze_to_goal", "WAZE_TO_GOAL_SETTINGS", nVarC3, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.settings_icon_waze_to_goal)), null, gu.b(configManagerF, bVar, false), null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7);
        sVar.A(new ed(configManagerF, 10));
        int i2 = 0;
        fVarArr[0] = sVar;
        ConfigManager configManagerF2 = dsVar.f();
        com.waze.ui.ac.n nVarC4 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS));
        com.waze.settings.tree.d dVarS = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_cameras));
        com.waze.ui.ac.n nVarC5 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_SPEEDING_AND_INTERSECTIONS));
        com.waze.ui.ac.n nVarC6 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_SPEED_CAMERA));
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEED_CAMS;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_MAP_SHOW_SPEED_CAMS");
        com.waze.settings.tree.c.b bVarB = gu.b(configManagerF2, bVar2, false);
        com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SPEED_CAMERAS;
        h.g.b.x.e(bVar3, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SPEED_CAMERAS");
        com.waze.settings.tree.c.b bVarB2 = gu.b(configManagerF2, bVar3, false);
        h.g.a.p pVar = null;
        int i3 = 192;
        com.waze.ui.ac.n nVarC7 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_RED_LIGHT_CAMERA));
        com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_MAP_SHOW_RED_LIGHT_CAMERAS;
        h.g.b.x.e(bVar4, "CONFIG_VALUE_MAP_SHOW_RED_LIGHT_CAMERAS");
        com.waze.settings.tree.c.b bVarB3 = gu.b(configManagerF2, bVar4, false);
        com.waze.config.b bVar5 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_RED_LIGHT_CAMERAS;
        h.g.b.x.e(bVar5, "CONFIG_VALUE_NOTIFICATIO…N_ROUTE_RED_LIGHT_CAMERAS");
        com.waze.settings.tree.c.b bVarB4 = gu.b(configManagerF2, bVar5, false);
        com.waze.ui.ac.n nVarC8 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_SPEED_AND_RED_LIGHT_CAMERA));
        com.waze.config.b bVar6 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEED_AND_RED_LIGHT_CAMERAS;
        h.g.b.x.e(bVar6, "CONFIG_VALUE_MAP_SHOW_SPEED_AND_RED_LIGHT_CAMERAS");
        com.waze.settings.tree.c.b bVarB5 = gu.b(configManagerF2, bVar6, false);
        com.waze.config.b bVar7 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SPEED_AND_RED_LIGHT_CAMERAS;
        h.g.b.x.e(bVar7, "CONFIG_VALUE_NOTIFICATIO…EED_AND_RED_LIGHT_CAMERAS");
        com.waze.settings.tree.s sVar2 = new com.waze.settings.tree.s("rt_speed_and_red_light_cameras", "RED_LIGHT_AND_SPEED_CAMERA", nVarC8, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_red_light_and_speed_camera)), bVarB5, gu.b(configManagerF2, bVar7, false), pVar, i3);
        int i4 = 2;
        com.waze.ui.ac.n nVarC9 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_STOP_SIGN_CAMERA));
        com.waze.config.b bVar8 = ConfigValues.CONFIG_VALUE_MAP_SHOW_STOP_SIGN_CAMERAS;
        h.g.b.x.e(bVar8, "CONFIG_VALUE_MAP_SHOW_STOP_SIGN_CAMERAS");
        com.waze.settings.tree.c.b bVarB6 = gu.b(configManagerF2, bVar8, false);
        com.waze.config.b bVar9 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_STOP_SIGN_CAMERAS;
        h.g.b.x.e(bVar9, "CONFIG_VALUE_NOTIFICATIO…N_ROUTE_STOP_SIGN_CAMERAS");
        com.waze.settings.tree.c.b bVarB7 = gu.b(configManagerF2, bVar9, false);
        com.waze.ui.ac.n nVarC10 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_POLICE_MOBILE_CAMERA));
        com.waze.config.b bVar10 = ConfigValues.CONFIG_VALUE_MAP_SHOW_POLICE_MOBILE_CAMERA;
        h.g.b.x.e(bVar10, "CONFIG_VALUE_MAP_SHOW_POLICE_MOBILE_CAMERA");
        com.waze.settings.tree.c.b bVarB8 = gu.b(configManagerF2, bVar10, false);
        com.waze.config.b bVar11 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_POLICE_MOBILE_CAMERA;
        h.g.b.x.e(bVar11, "CONFIG_VALUE_NOTIFICATIO…OUTE_POLICE_MOBILE_CAMERA");
        com.waze.settings.tree.s[] sVarArr = {new com.waze.settings.tree.s("rt_speed_cams", "SPEED_CAMS_SETTINGS", nVarC6, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_speed_camera)), bVarB, bVarB2, pVar, i3), new com.waze.settings.tree.s("rt_red_light_cameras", "RED_LIGHT_CAMERAS_SETTINGS", nVarC7, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_red_light_camera)), bVarB3, bVarB4, pVar, i3), sVar2, new com.waze.settings.tree.s("rt_stop_sign_cameras", "STOP_SIGN_CAMERA", nVarC9, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_stop_sign_camera)), bVarB6, bVarB7, pVar, i3), new com.waze.settings.tree.s("rt_mobile_police_cameras", "MOBILE_POLICE_CAMERA", nVarC10, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_police_mobile_camera)), bVarB8, gu.b(configManagerF2, bVar11, false), pVar, i3)};
        com.waze.ui.ac.n nVarC11 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_LANES));
        com.waze.ui.ac.n nVarC12 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_HOV_LANE_CAMERA));
        com.waze.config.b bVar12 = ConfigValues.CONFIG_VALUE_MAP_SHOW_HOV_LANE_CAMERAS;
        h.g.b.x.e(bVar12, "CONFIG_VALUE_MAP_SHOW_HOV_LANE_CAMERAS");
        com.waze.settings.tree.c.b bVarB9 = gu.b(configManagerF2, bVar12, false);
        com.waze.config.b bVar13 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_HOV_LANE_CAMERAS;
        h.g.b.x.e(bVar13, "CONFIG_VALUE_NOTIFICATIO…ON_ROUTE_HOV_LANE_CAMERAS");
        com.waze.settings.tree.c.b bVarB10 = gu.b(configManagerF2, bVar13, false);
        Integer numValueOf = Integer.valueOf(R.drawable.setting_icon_report_hov_camera);
        com.waze.ui.ac.n nVarC13 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_CARPOOL_LANE_CAMERA));
        com.waze.config.b bVar14 = ConfigValues.CONFIG_VALUE_MAP_SHOW_CARPOOL_LANE_CAMERAS;
        h.g.b.x.e(bVar14, "CONFIG_VALUE_MAP_SHOW_CARPOOL_LANE_CAMERAS");
        com.waze.settings.tree.c.b bVarB11 = gu.b(configManagerF2, bVar14, false);
        com.waze.config.b bVar15 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_CARPOOL_LANE_CAMERAS;
        h.g.b.x.e(bVar15, "CONFIG_VALUE_NOTIFICATIO…OUTE_CARPOOL_LANE_CAMERAS");
        com.waze.settings.tree.c.b bVarB12 = gu.b(configManagerF2, bVar15, false);
        com.waze.ui.ac.n nVarC14 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_BUS_LANE_CAMERA));
        com.waze.config.b bVar16 = ConfigValues.CONFIG_VALUE_MAP_SHOW_BUS_LANE_CAMERAS;
        h.g.b.x.e(bVar16, "CONFIG_VALUE_MAP_SHOW_BUS_LANE_CAMERAS");
        com.waze.settings.tree.c.b bVarB13 = gu.b(configManagerF2, bVar16, false);
        com.waze.config.b bVar17 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_BUS_LANE_CAMERAS;
        h.g.b.x.e(bVar17, "CONFIG_VALUE_NOTIFICATIO…ON_ROUTE_BUS_LANE_CAMERAS");
        com.waze.settings.tree.s[] sVarArr2 = {new com.waze.settings.tree.s("rt_hov_lane_cameras", "HOV_LANE_CAMERA", nVarC12, com.waze.nightmode.e.s(numValueOf), bVarB9, bVarB10, pVar, i3), new com.waze.settings.tree.s("rt_carpool_lane_cameras", "CARPOOL_LANE_CAMERA", nVarC13, com.waze.nightmode.e.s(numValueOf), bVarB11, bVarB12, pVar, i3), new com.waze.settings.tree.s("rt_bus_lane_cameras", "BUS_LANE_CAMERA", nVarC14, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_bus_lane_camera)), bVarB13, gu.b(configManagerF2, bVar17, false), pVar, i3)};
        com.waze.ui.ac.n nVarC15 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_DRIVING_BEHAVIOR));
        com.waze.ui.ac.n nVarC16 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_MOBILE_PHONE_CAMERA));
        com.waze.config.b bVar18 = ConfigValues.CONFIG_VALUE_MAP_SHOW_MOBILE_PHONE_CAMERAS;
        h.g.b.x.e(bVar18, "CONFIG_VALUE_MAP_SHOW_MOBILE_PHONE_CAMERAS");
        com.waze.settings.tree.c.b bVarB14 = gu.b(configManagerF2, bVar18, false);
        com.waze.config.b bVar19 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_MOBILE_PHONE_CAMERAS;
        h.g.b.x.e(bVar19, "CONFIG_VALUE_NOTIFICATIO…OUTE_MOBILE_PHONE_CAMERAS");
        com.waze.settings.tree.c.b bVarB15 = gu.b(configManagerF2, bVar19, false);
        com.waze.ui.ac.n nVarC17 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_NOISE_CAMERA));
        com.waze.config.b bVar20 = ConfigValues.CONFIG_VALUE_MAP_SHOW_NOISE_CAMERAS;
        h.g.b.x.e(bVar20, "CONFIG_VALUE_MAP_SHOW_NOISE_CAMERAS");
        com.waze.settings.tree.c.b bVarB16 = gu.b(configManagerF2, bVar20, false);
        com.waze.config.b bVar21 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_NOISE_CAMERAS;
        h.g.b.x.e(bVar21, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_NOISE_CAMERAS");
        com.waze.settings.tree.c.b bVarB17 = gu.b(configManagerF2, bVar21, false);
        com.waze.ui.ac.n nVarC18 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_SAFE_DISTANCE_CAMERA));
        com.waze.config.b bVar22 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SAFE_DISTANCE_CAMERAS;
        h.g.b.x.e(bVar22, "CONFIG_VALUE_MAP_SHOW_SAFE_DISTANCE_CAMERAS");
        com.waze.settings.tree.c.b bVarB18 = gu.b(configManagerF2, bVar22, false);
        com.waze.config.b bVar23 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SAFE_DISTANCE_CAMERAS;
        h.g.b.x.e(bVar23, "CONFIG_VALUE_NOTIFICATIO…UTE_SAFE_DISTANCE_CAMERAS");
        com.waze.settings.tree.c.b bVarB19 = gu.b(configManagerF2, bVar23, false);
        com.waze.ui.ac.n nVarC19 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAMERA_REPORT_SETTINGS_SEATBELT_CAMERA));
        com.waze.config.b bVar24 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SEATBELT_CAMERAS;
        h.g.b.x.e(bVar24, "CONFIG_VALUE_MAP_SHOW_SEATBELT_CAMERAS");
        com.waze.settings.tree.c.b bVarB20 = gu.b(configManagerF2, bVar24, false);
        com.waze.config.b bVar25 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SEATBELT_CAMERAS;
        h.g.b.x.e(bVar25, "CONFIG_VALUE_NOTIFICATIO…ON_ROUTE_SEATBELT_CAMERAS");
        int i5 = 3;
        fVarArr[1] = new com.waze.settings.tree.d.n("cameras", "CAMERAS_SETTINGS", nVarC4, dVarS, h.a.i.i(new com.waze.settings.tree.d.m("speeding_and_intersections", nVarC5, h.a.i.i(sVarArr)), new com.waze.settings.tree.d.m("lanes", nVarC11, h.a.i.i(sVarArr2)), new com.waze.settings.tree.d.m("driving_behavior", nVarC15, h.a.i.i(new com.waze.settings.tree.s("rt_mobile_phone_cameras", "MOBILE_PHONE_CAMERA", nVarC16, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_phone_camera)), bVarB14, bVarB15, pVar, i3), new com.waze.settings.tree.s("rt_noise_cameras", "NOISE_CAMERA", nVarC17, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_noise_camera)), bVarB16, bVarB17, pVar, i3), new com.waze.settings.tree.s("rt_safe_distance_cameras", "SAFE_DISTANCE_CAMERA", nVarC18, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_safe_distance_camera)), bVarB18, bVarB19, pVar, i3), new com.waze.settings.tree.s("rt_seatbelt_cameras", "SEATBELT_CAMERA", nVarC19, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_seatbelt_camera)), bVarB20, gu.b(configManagerF2, bVar25, false), pVar, i3)))), 16);
        ConfigManager configManagerF3 = dsVar.f();
        com.waze.ui.ac.n nVarC20 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.PERMANENT_HAZARD_SETTINGS_LABEL));
        com.waze.settings.tree.d dVarS2 = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_permanent_hazards));
        com.waze.settings.tree.f[] fVarArr2 = new com.waze.settings.tree.f[14];
        com.waze.ui.ac.n nVarC21 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_RAILROAD));
        com.waze.config.b bVar26 = ConfigValues.CONFIG_VALUE_MAP_SHOW_RAILROAD;
        h.g.b.x.e(bVar26, "CONFIG_VALUE_MAP_SHOW_RAILROAD");
        com.waze.settings.tree.c.b bVarB21 = gu.b(configManagerF3, bVar26, false);
        com.waze.config.b bVar27 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_RAILROAD;
        h.g.b.x.e(bVar27, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_RAILROAD");
        fVarArr2[0] = new com.waze.settings.tree.s("railroad", "RAILROAD_SETTINGS", nVarC21, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_railroad)), bVarB21, gu.b(configManagerF3, bVar27, false), pVar, i3);
        com.waze.ui.ac.n nVarC22 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_TRAFFIC_LIGHTS));
        com.waze.config.b bVar28 = ConfigValues.CONFIG_VALUE_MAP_SHOW_TRAFFIC_LIGHTS;
        h.g.b.x.e(bVar28, "CONFIG_VALUE_MAP_SHOW_TRAFFIC_LIGHTS");
        com.waze.settings.tree.s sVar3 = new com.waze.settings.tree.s("traffic_lights", "TRAFFIC_LIGHTS_SETTINGS", nVarC22, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.settings_icon_traffic_light)), gu.b(configManagerF3, bVar28, false), null, pVar, 224);
        sVar3.A(new ed(configManagerF3, 12));
        fVarArr2[1] = sVar3;
        com.waze.ui.ac.n nVarC23 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_TOLL_BOOTH));
        com.waze.config.b bVar29 = ConfigValues.CONFIG_VALUE_MAP_SHOW_TOLL_BOOTH_PERMANENT_HAZARD;
        h.g.b.x.e(bVar29, "CONFIG_VALUE_MAP_SHOW_TOLL_BOOTH_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB22 = gu.b(configManagerF3, bVar29, false);
        com.waze.config.b bVar30 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_TOLL_BOOTH;
        h.g.b.x.e(bVar30, "CONFIG_VALUE_NOTIFICATIO…RMANENT_HAZARD_TOLL_BOOTH");
        int i6 = 192;
        fVarArr2[2] = new com.waze.settings.tree.s("toll_booth", "TOLL_BOOTH_SETTINGS", nVarC23, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.icon_permanent_hazard_toll_booth)), bVarB22, gu.b(configManagerF3, bVar30, false), pVar, i6);
        com.waze.ui.ac.n nVarC24 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_SPEED_BUMP));
        com.waze.config.b bVar31 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEED_BUMPS_PERMANENT_HAZARD;
        h.g.b.x.e(bVar31, "CONFIG_VALUE_MAP_SHOW_SPEED_BUMPS_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB23 = gu.b(configManagerF3, bVar31, false);
        com.waze.config.b bVar32 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_SPEED_BUMP;
        h.g.b.x.e(bVar32, "CONFIG_VALUE_NOTIFICATIO…RMANENT_HAZARD_SPEED_BUMP");
        fVarArr2[3] = new com.waze.settings.tree.s("speed_bump", "SPEED_BUMPS_SETTINGS", nVarC24, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.icon_permanent_hazard_speed_bumps)), bVarB23, gu.b(configManagerF3, bVar32, false), pVar, i6);
        com.waze.ui.ac.n nVarC25 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_SHARP_CURVE));
        com.waze.config.b bVar33 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SHARP_CURVE_PERMANENT_HAZARD;
        h.g.b.x.e(bVar33, "CONFIG_VALUE_MAP_SHOW_SHARP_CURVE_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB24 = gu.b(configManagerF3, bVar33, false);
        com.waze.config.b bVar34 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_SHARP_CURVE;
        h.g.b.x.e(bVar34, "CONFIG_VALUE_NOTIFICATIO…MANENT_HAZARD_SHARP_CURVE");
        fVarArr2[4] = new com.waze.settings.tree.s("sharp_curve", "SHARP_CURVES_SETTINGS", nVarC25, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.icon_permanent_hazard_dangerous_curves)), bVarB24, gu.b(configManagerF3, bVar34, false), pVar, i6);
        com.waze.ui.ac.n nVarC26 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.SPEED_LIMIT_DECREASE_SETTINGS_LABEL));
        com.waze.config.b bVar35 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SPEED_LIMIT_DECREASE;
        h.g.b.x.e(bVar35, "CONFIG_VALUE_NOTIFICATIO…OUTE_SPEED_LIMIT_DECREASE");
        h.g.a.p pVar2 = null;
        fVarArr2[5] = new com.waze.settings.tree.s("speed_limit_decrease", "SPEED_LIMIT_DECREASE_SETTINGS", nVarC26, com.waze.nightmode.e.s(Integer.valueOf(true != h.g.b.x.n(ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_STYLE.b(), "us") ? R.drawable.icon_speed_limit_world_50 : R.drawable.icon_speed_limit_us_35)), null, gu.b(configManagerF3, bVar35, false), pVar2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7);
        com.waze.ui.ac.n nVarC27 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_COMPLEX_INTERSECTION));
        com.waze.config.b bVar36 = ConfigValues.CONFIG_VALUE_MAP_SHOW_COMPLEX_INTERSECTION_PERMANENT_HAZARD;
        h.g.b.x.e(bVar36, "CONFIG_VALUE_MAP_SHOW_CO…RSECTION_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB25 = gu.b(configManagerF3, bVar36, false);
        com.waze.config.b bVar37 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_COMPLEX_INTERSECTION;
        h.g.b.x.e(bVar37, "CONFIG_VALUE_NOTIFICATIO…ZARD_COMPLEX_INTERSECTION");
        int i7 = 192;
        fVarArr2[6] = new com.waze.settings.tree.s("complex_intersection", "COMPLEX_INTERSECTION_SETTINGS", nVarC27, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.icon_permanent_hazard_intersection)), bVarB25, gu.b(configManagerF3, bVar37, false), pVar2, i7);
        com.waze.ui.ac.n nVarC28 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_COMPLEX_MERGE));
        com.waze.config.b bVar38 = ConfigValues.CONFIG_VALUE_MAP_SHOW_COMPLEX_MERGE_PERMANENT_HAZARD;
        h.g.b.x.e(bVar38, "CONFIG_VALUE_MAP_SHOW_CO…EX_MERGE_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB26 = gu.b(configManagerF3, bVar38, false);
        com.waze.config.b bVar39 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_COMPLEX_MERGE;
        h.g.b.x.e(bVar39, "CONFIG_VALUE_NOTIFICATIO…NENT_HAZARD_COMPLEX_MERGE");
        fVarArr2[7] = new com.waze.settings.tree.s("complex_merge", "COMPLEX_MERGE_SETTINGS", nVarC28, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.icon_permanent_hazard_lanes_merging)), bVarB26, gu.b(configManagerF3, bVar39, false), pVar2, i7);
        com.waze.ui.ac.n nVarC29 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_SCHOOL_ZONES));
        com.waze.config.b bVar40 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SCHOOL_ZONE_PERMANENT_HAZARD;
        h.g.b.x.e(bVar40, "CONFIG_VALUE_MAP_SHOW_SCHOOL_ZONE_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB27 = gu.b(configManagerF3, bVar40, false);
        com.waze.config.b bVar41 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_SCHOOL_ZONE;
        h.g.b.x.e(bVar41, "CONFIG_VALUE_NOTIFICATIO…MANENT_HAZARD_SCHOOL_ZONE");
        fVarArr2[8] = new com.waze.settings.tree.s("school_zones", "SCHOOL_ZONES_SETTINGS", nVarC29, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_report_ph_school_zone)), bVarB27, gu.b(configManagerF3, bVar41, false), pVar2, i7);
        com.waze.ui.ac.n nVarC30 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_LANE_ENDING));
        com.waze.config.b bVar42 = ConfigValues.CONFIG_VALUE_MAP_SHOW_LANE_ENDING_PERMANENT_HAZARD;
        h.g.b.x.e(bVar42, "CONFIG_VALUE_MAP_SHOW_LANE_ENDING_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB28 = gu.b(configManagerF3, bVar42, false);
        com.waze.config.b bVar43 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_LANE_ENDING;
        h.g.b.x.e(bVar43, "CONFIG_VALUE_NOTIFICATIO…MANENT_HAZARD_LANE_ENDING");
        com.waze.settings.tree.s sVar4 = new com.waze.settings.tree.s("lane_ending", "LANE_ENDING_SETTINGS", nVarC30, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_right_lane_ending)), bVarB28, gu.b(configManagerF3, bVar43, false), pVar2, i7);
        sVar4.A(new ed(configManagerF3, 13));
        fVarArr2[9] = sVar4;
        com.waze.ui.ac.n nVarC31 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_RAISED_CROSSWALK));
        com.waze.config.b bVar44 = ConfigValues.CONFIG_VALUE_MAP_SHOW_RAISED_CROSSWALK_PERMANENT_HAZARD;
        h.g.b.x.e(bVar44, "CONFIG_VALUE_MAP_SHOW_RA…ROSSWALK_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB29 = gu.b(configManagerF3, bVar44, false);
        com.waze.config.b bVar45 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_RAISED_CROSSWALK;
        h.g.b.x.e(bVar45, "CONFIG_VALUE_NOTIFICATIO…T_HAZARD_RAISED_CROSSWALK");
        com.waze.settings.tree.s sVar5 = new com.waze.settings.tree.s("raised_crosswalk", "RAISED_CROSSWALK_SETTINGS", nVarC31, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_raised_crosswalk)), bVarB29, gu.b(configManagerF3, bVar45, false), pVar2, i7);
        sVar5.A(new ed(configManagerF3, 1));
        fVarArr2[10] = sVar5;
        com.waze.ui.ac.n nVarC32 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_HIGHWAY_CROSSWALK));
        com.waze.config.b bVar46 = ConfigValues.CONFIG_VALUE_MAP_SHOW_HIGHWAY_CROSSWALK_PERMANENT_HAZARD;
        h.g.b.x.e(bVar46, "CONFIG_VALUE_MAP_SHOW_HI…ROSSWALK_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB30 = gu.b(configManagerF3, bVar46, false);
        com.waze.config.b bVar47 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_HIGHWAY_CROSSWALK;
        h.g.b.x.e(bVar47, "CONFIG_VALUE_NOTIFICATIO…_HAZARD_HIGHWAY_CROSSWALK");
        com.waze.settings.tree.s sVar6 = new com.waze.settings.tree.s("highway_crosswalk", "HIGHWAY_CROSSWALK_SETTINGS", nVarC32, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_highway_crosswalk)), bVarB30, gu.b(configManagerF3, bVar47, false), pVar2, i7);
        sVar6.A(new ed(configManagerF3, i2));
        fVarArr2[11] = sVar6;
        com.waze.ui.ac.n nVarC33 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_SHOULDER_ENDING));
        com.waze.config.b bVar48 = ConfigValues.CONFIG_VALUE_MAP_SHOW_SHOULDER_ENDING_PERMANENT_HAZARD;
        h.g.b.x.e(bVar48, "CONFIG_VALUE_MAP_SHOW_SH…R_ENDING_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB31 = gu.b(configManagerF3, bVar48, false);
        com.waze.config.b bVar49 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_SHOULDER_ENDING;
        h.g.b.x.e(bVar49, "CONFIG_VALUE_NOTIFICATIO…NT_HAZARD_SHOULDER_ENDING");
        com.waze.settings.tree.s sVar7 = new com.waze.settings.tree.s("shoulder_ending", "SHOULDER_ENDING_SETTINGS", nVarC33, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_shoulders_ending)), bVarB31, gu.b(configManagerF3, bVar49, false), pVar2, i7);
        sVar7.A(new ed(configManagerF3, i4));
        fVarArr2[12] = sVar7;
        com.waze.ui.ac.n nVarC34 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.ROAD_FEATURES_SETTINGS_NARROW_BRIDGE));
        com.waze.config.b bVar50 = ConfigValues.CONFIG_VALUE_MAP_SHOW_NARROW_BRIDGE_PERMANENT_HAZARD;
        h.g.b.x.e(bVar50, "CONFIG_VALUE_MAP_SHOW_NA…W_BRIDGE_PERMANENT_HAZARD");
        com.waze.settings.tree.c.b bVarB32 = gu.b(configManagerF3, bVar50, false);
        com.waze.config.b bVar51 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERMANENT_HAZARD_NARROW_BRIDGE;
        h.g.b.x.e(bVar51, "CONFIG_VALUE_NOTIFICATIO…NENT_HAZARD_NARROW_BRIDGE");
        com.waze.settings.tree.s sVar8 = new com.waze.settings.tree.s("narrow_bridge", "NARROW_BRIDGE_SETTINGS", nVarC34, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_narrow_bridge)), bVarB32, gu.b(configManagerF3, bVar51, false), pVar2, i7);
        sVar8.A(new ed(configManagerF3, i5));
        fVarArr2[13] = sVar8;
        fVarArr[2] = new com.waze.settings.tree.d.n("permanent_hazards_settings", "PERMANENT_HAZARDS_SETTINGS", nVarC20, dVarS2, h.a.i.i(fVarArr2), 16);
        com.waze.ui.ac.n nVarC35 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_POLICE));
        com.waze.config.b bVar52 = ConfigValues.CONFIG_VALUE_MAP_SHOW_POLICE;
        h.g.b.x.e(bVar52, "CONFIG_VALUE_MAP_SHOW_POLICE");
        com.waze.settings.tree.c.b bVarB33 = gu.b(configManagerF, bVar52, false);
        com.waze.config.b bVar53 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_POLICE;
        h.g.b.x.e(bVar53, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_POLICE");
        fVarArr[3] = new com.waze.settings.tree.s("police", "POLICE_SETTINGS", nVarC35, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_police)), bVarB33, gu.b(configManagerF, bVar53, false), pVar2, i7);
        com.waze.ui.ac.n nVarC36 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_ACCIDENTS));
        com.waze.config.b bVar54 = ConfigValues.CONFIG_VALUE_MAP_SHOW_ACCIDENTS;
        h.g.b.x.e(bVar54, "CONFIG_VALUE_MAP_SHOW_ACCIDENTS");
        com.waze.settings.tree.c.b bVarB34 = gu.b(configManagerF, bVar54, false);
        com.waze.config.b bVar55 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_ACCIDENT;
        h.g.b.x.e(bVar55, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_ACCIDENT");
        fVarArr[4] = new com.waze.settings.tree.s("accidents", "ACCIDENTS_SETTINGS", nVarC36, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_crash)), bVarB34, gu.b(configManagerF, bVar55, false), pVar2, i7);
        com.waze.ui.ac.n nVarC37 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_TRAFFIC_JAMS));
        com.waze.config.b bVar56 = ConfigValues.CONFIG_VALUE_MAP_SHOW_TRAFFIC_JAMS_ICONS;
        h.g.b.x.e(bVar56, "CONFIG_VALUE_MAP_SHOW_TRAFFIC_JAMS_ICONS");
        fVarArr[5] = new com.waze.settings.tree.s("traffic_jams", "TRAFFIC_JAMS_SETTINGS", nVarC37, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_jam)), gu.b(configManagerF, bVar56, false), null, pVar2, 224);
        com.waze.ui.ac.n nVarC38 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_HAZARD_ON_ROAD));
        com.waze.config.b bVar57 = ConfigValues.CONFIG_VALUE_MAP_SHOW_HAZARDS;
        h.g.b.x.e(bVar57, "CONFIG_VALUE_MAP_SHOW_HAZARDS");
        com.waze.settings.tree.c.b bVarB35 = gu.b(configManagerF, bVar57, false);
        com.waze.config.b bVar58 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_HAZARD_ON_ROAD;
        h.g.b.x.e(bVar58, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_HAZARD_ON_ROAD");
        int i8 = 192;
        fVarArr[6] = new com.waze.settings.tree.s("hazard_on_road", "HAZARD_ON_ROAD_SETTINGS", nVarC38, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_hazard_on_road)), bVarB35, gu.b(configManagerF, bVar58, false), 0 == true ? 1 : 0, i8);
        com.waze.ui.ac.n nVarC39 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_HAZARD_ON_SHOULDER));
        com.waze.config.b bVar59 = ConfigValues.CONFIG_VALUE_MAP_SHOW_HAZARDS;
        h.g.b.x.e(bVar59, "CONFIG_VALUE_MAP_SHOW_HAZARDS");
        com.waze.settings.tree.c.b bVarB36 = gu.b(configManagerF, bVar59, false);
        com.waze.config.b bVar60 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_HARAZD_ON_SHOULDER;
        h.g.b.x.e(bVar60, "CONFIG_VALUE_NOTIFICATIO…_ROUTE_HARAZD_ON_SHOULDER");
        fVarArr[7] = new com.waze.settings.tree.s("hazard_on_shoulder", "HAZARD_ON_SHOULDER_SETTINGS", nVarC39, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_hazard_on_shoulder)), bVarB36, gu.b(configManagerF, bVar60, false), 0 == true ? 1 : 0, i8);
        com.waze.ui.ac.n nVarC40 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_OTHER_HAZARDS));
        com.waze.config.b bVar61 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_OTHER_HAZARD;
        h.g.b.x.e(bVar61, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_OTHER_HAZARD");
        com.waze.settings.tree.c.b bVarB37 = gu.b(configManagerF, bVar61, false);
        com.waze.settings.tree.d dVarS3 = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_hazard));
        int i9 = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7;
        com.waze.settings.tree.c.b bVar62 = null;
        fVarArr[8] = new com.waze.settings.tree.s("other_hazards", "OTHER_HAZARDS_SETTINGS", nVarC40, dVarS3, bVar62, bVarB37, 0 == true ? 1 : 0, i9);
        com.waze.ui.ac.n nVarC41 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_WEATHER_HAZARDS));
        com.waze.config.b bVar63 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_WEATHER_HAZARD;
        h.g.b.x.e(bVar63, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_WEATHER_HAZARD");
        fVarArr[9] = new com.waze.settings.tree.s("weather_hazard", "WEATHER_HAZARD_SETTINGS", nVarC41, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_hazard_weather)), bVar62, gu.b(configManagerF, bVar63, false), 0 == true ? 1 : 0, i9);
        com.waze.ui.ac.n nVarC42 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_BLOCKED_LANES));
        com.waze.config.b bVar64 = ConfigValues.CONFIG_VALUE_MAP_SHOW_BLOCKED_LANES;
        h.g.b.x.e(bVar64, "CONFIG_VALUE_MAP_SHOW_BLOCKED_LANES");
        com.waze.settings.tree.c.b bVarB38 = gu.b(configManagerF, bVar64, false);
        com.waze.config.b bVar65 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_BLOCKED_LANE;
        h.g.b.x.e(bVar65, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_BLOCKED_LANE");
        fVarArr[10] = new com.waze.settings.tree.s("blocked_lanes", "BLOCKED_LANE_SETTINGS", nVarC42, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_blocked_lane)), bVarB38, gu.b(configManagerF, bVar65, false), 0 == true ? 1 : 0, 192);
        com.waze.ui.ac.n nVarC43 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_SOS));
        com.waze.config.b bVar66 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SOS;
        h.g.b.x.e(bVar66, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_SOS");
        fVarArr[11] = new com.waze.settings.tree.s("sos", "SOS_SETTINGS", nVarC43, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_assistance)), null, gu.b(configManagerF, bVar66, false), 0 == true ? 1 : 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7);
        com.waze.ui.ac.n nVarC44 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_ROAD_CONSTRUCTION));
        com.waze.config.b bVar67 = ConfigValues.CONFIG_VALUE_MAP_SHOW_ROAD_CONSTRUCTION;
        h.g.b.x.e(bVar67, "CONFIG_VALUE_MAP_SHOW_ROAD_CONSTRUCTION");
        int i10 = 224;
        com.waze.settings.tree.c.b bVar68 = null;
        fVarArr[12] = new com.waze.settings.tree.s("road_construction", "ROAD_CONSTRUCTION_SETTINGS", nVarC44, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_hazard_construction)), gu.b(configManagerF, bVar67, false), bVar68, 0 == true ? 1 : 0, i10);
        com.waze.ui.ac.n nVarC45 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_CHIT_CHATS));
        com.waze.config.b bVar69 = ConfigValues.CONFIG_VALUE_MAP_SHOW_CHIT_CHATS;
        h.g.b.x.e(bVar69, "CONFIG_VALUE_MAP_SHOW_CHIT_CHATS");
        fVarArr[13] = new com.waze.settings.tree.s("chit_chats", "CHIT_CHATS_SETTINGS", nVarC45, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_mapchat)), gu.b(configManagerF, bVar69, false), bVar68, 0 == true ? 1 : 0, i10);
        com.waze.ui.ac.n nVarC46 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_CLOSURES));
        com.waze.config.b bVar70 = ConfigValues.CONFIG_VALUE_MAP_SHOW_CLOSURES;
        h.g.b.x.e(bVar70, "CONFIG_VALUE_MAP_SHOW_CLOSURES");
        fVarArr[14] = new com.waze.settings.tree.s("closures", "CLOSURES_SETTINGS", nVarC46, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_closure)), gu.b(configManagerF, bVar70, false), bVar68, 0 == true ? 1 : 0, i10);
        com.waze.ui.ac.n nVarC47 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_GUARDIAN));
        com.waze.config.b bVar71 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_GUARDIAN;
        h.g.b.x.e(bVar71, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_GUARDIAN");
        com.waze.settings.tree.c.b bVar72 = null;
        com.waze.settings.tree.s sVar9 = new com.waze.settings.tree.s("guardian", "GUARDIAN_SETTINGS", nVarC47, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_guardian)), bVar72, gu.b(configManagerF, bVar71, false), null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7);
        sVar9.A(new ed(configManagerF, 11));
        fVarArr[15] = sVar9;
        com.waze.settings.tree.s sVar10 = new com.waze.settings.tree.s("high_risk_alert", "HIGH_RISK_ALERT_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_HIGH_RISK_AREAS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_high_risk)), bVar72, new fw(dsVar, this, 0), new h.g.a.p() { // from class: com.waze.settings.ei
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                com.waze.ifs.ui.a aVar = (com.waze.ifs.ui.a) obj;
                WazeSettingsView wazeSettingsView = (WazeSettingsView) obj2;
                h.g.b.x.f(aVar, "activity");
                h.g.b.x.f(wazeSettingsView, "view");
                kotlinx.coroutines.br brVarZ = kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(aVar), null, null, new di(dsVar, wazeSettingsView, (h.c.e) null, 6, (char[]) null), 3);
                WazeSettingsView wazeSettingsView2 = wazeSettingsView;
                if (!wazeSettingsView2.isAttachedToWindow()) {
                    wazeSettingsView2.addOnAttachStateChangeListener(new fx(wazeSettingsView2, wazeSettingsView, brVarZ));
                } else if (wazeSettingsView2.isAttachedToWindow()) {
                    wazeSettingsView2.addOnAttachStateChangeListener(new fy(wazeSettingsView2, brVarZ));
                } else {
                    brVarZ.s(null);
                }
                return h.ab.f48028a;
            }
        }, 80);
        com.waze.config.b bVar73 = ConfigValues.CONFIG_VALUE_ROUTING_PALESTINIAN_ROADS_ENABLED;
        h.g.b.x.e(bVar73, "CONFIG_VALUE_ROUTING_PALESTINIAN_ROADS_ENABLED");
        com.waze.settings.tree.c.f.a(sVar10, bVar73);
        fVarArr[16] = sVar10;
        com.waze.ui.ac.n nVarC48 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.PERSONAL_SAFETY_SETTINGS_LABEL));
        com.waze.config.b bVar74 = ConfigValues.CONFIG_VALUE_MAP_SHOW_PERSONAL_SAFETY;
        h.g.b.x.e(bVar74, "CONFIG_VALUE_MAP_SHOW_PERSONAL_SAFETY");
        com.waze.settings.tree.c.b bVarB39 = gu.b(configManagerF, bVar74, false);
        com.waze.config.b bVar75 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_PERSONAL_SAFETY;
        h.g.b.x.e(bVar75, "CONFIG_VALUE_NOTIFICATIO…_ON_ROUTE_PERSONAL_SAFETY");
        h.g.a.p pVar3 = null;
        int i11 = 192;
        com.waze.settings.tree.s sVar11 = new com.waze.settings.tree.s("personal_safety", "PERSONAL_SAFETY_SETTINGS", nVarC48, dsVar.h().b() ? com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_personal_safety_a)) : com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_personal_safety_b)), bVarB39, gu.b(configManagerF, bVar75, false), pVar3, i11);
        com.waze.config.b bVar76 = ConfigValues.CONFIG_VALUE_ALERTS_PERSONAL_SAFETY_ALERT_ENABLED;
        h.g.b.x.e(bVar76, "CONFIG_VALUE_ALERTS_PERSONAL_SAFETY_ALERT_ENABLED");
        com.waze.settings.tree.c.f.a(sVar11, bVar76);
        fVarArr[17] = sVar11;
        com.waze.ui.ac.n nVarC49 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORT_ANIMAL));
        com.waze.config.b bVar77 = ConfigValues.CONFIG_VALUE_MAP_SHOW_ANIMAL;
        h.g.b.x.e(bVar77, "CONFIG_VALUE_MAP_SHOW_ANIMAL");
        com.waze.settings.tree.c.b bVarB40 = gu.b(configManagerF, bVar77, false);
        com.waze.config.b bVar78 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_ANIMAL;
        h.g.b.x.e(bVar78, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_ANIMAL");
        com.waze.settings.tree.s sVar12 = new com.waze.settings.tree.s("animal", "ANIMAL", nVarC49, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_animal)), bVarB40, gu.b(configManagerF, bVar78, false), pVar3, i11);
        com.waze.config.b bVar79 = ConfigValues.CONFIG_VALUE_ALERTS_ANIMAL_SURFACING_FEATURE_ENABLED;
        h.g.b.x.e(bVar79, "CONFIG_VALUE_ALERTS_ANIM…SURFACING_FEATURE_ENABLED");
        com.waze.settings.tree.c.f.a(sVar12, bVar79);
        fVarArr[18] = sVar12;
        com.waze.ui.ac.n nVarC50 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CYCLISTS_SETTINGS_LABEL));
        com.waze.config.b bVar80 = ConfigValues.CONFIG_VALUE_MAP_SHOW_CYCLISTS;
        h.g.b.x.e(bVar80, "CONFIG_VALUE_MAP_SHOW_CYCLISTS");
        com.waze.settings.tree.c.b bVarB41 = gu.b(configManagerF, bVar80, false);
        com.waze.config.b bVar81 = ConfigValues.CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_CYCLISTS;
        h.g.b.x.e(bVar81, "CONFIG_VALUE_NOTIFICATIONS_ON_ROUTE_CYCLISTS");
        com.waze.settings.tree.s sVar13 = new com.waze.settings.tree.s("cyclists", "CYCLISTS_SETTINGS", nVarC50, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_alert_cyclist)), bVarB41, gu.b(configManagerF, bVar81, false), pVar3, i11);
        com.waze.config.b bVar82 = ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_CYCLISTS_ENABLED;
        h.g.b.x.e(bVar82, "CONFIG_VALUE_INSIGHTS_INFRA_CYCLISTS_ENABLED");
        com.waze.settings.tree.c.f.a(sVar13, bVar82);
        fVarArr[19] = sVar13;
        return new com.waze.settings.tree.d.n("reports", "REPORTS_SETTINGS", nVarC, (com.waze.settings.tree.d) null, h.a.i.d(new com.waze.settings.tree.d.m("alert_on", nVarC2, h.a.i.i(fVarArr))), 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.settings.tree.d.s S(int i2) {
        return new com.waze.settings.tree.d.s("enable_audio_apps", i2, "ENABLE_AUDIO_APPS", new gn(this));
    }

    private final com.waze.settings.tree.d.s T() {
        com.waze.main_screen.c.a aVar = this.f37337j;
        int i2 = R.string.SHOW_TRAFFIC;
        if (aVar != null && aVar.f()) {
            i2 = R.string.SHOW_TRAFFIC_V1;
        }
        return new com.waze.settings.tree.d.s("traffic", i2, "TRAFFIC_SETTINGS", new ew(this, 10));
    }

    private final com.waze.settings.tree.d.s U() {
        com.waze.main_screen.c.a aVar = this.f37337j;
        int i2 = R.string.WAZERS;
        if (aVar != null && aVar.f()) {
            i2 = R.string.WAZERS_V1;
        }
        return new com.waze.settings.tree.d.s("show_wazers", i2, "SHOW_WAZERS_SETTINGS", new ew(this, 11));
    }

    private final List V() {
        return h.a.i.i(new com.waze.settings.tree.d.s("personalize_ads", R.string.ADS_SETTINGS_PROFILE_TARGETING_ITEM, "PERSONALIZE_ADS_SETTINGS", new ew(this, 9)), new com.waze.settings.tree.d.l("personalize_ads_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.ADS_SETTINGS_PROFILE_TARGETING_DESCRIPTION))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(Context context) {
        com.waze.main_screen.c.a aVar = this.f37337j;
        if (aVar == null) {
            return;
        }
        Toast.makeText(context, this.f37336i.c(R.string.SETTINGS_TOO_MANY_BUTTONS_TOAST_PS, Integer.valueOf(aVar.a())), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        String strE = com.waze.sdk.bi.d().e();
        String str = strE;
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = String.format(com.waze.shared_infra.o.b.a().c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_SETTINGS_PAGE_POPUP_BODY_PL, new Object[0]), Arrays.copyOf(new Object[]{ConfigValues.CONFIG_VALUE_TRANSPORTATION_LEARN_MORE_URL.b()}, 1));
        h.g.b.x.e(str2, "format(...)");
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = this.f37336i;
        oVar.Q(aVar.c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_SETTINGS_PAGE_POPUP_TITLE_PS, strE));
        oVar.P(str2);
        oVar.M(aVar.c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_SETTINGS_PAGE_POPUP_BUTTON, new Object[0]));
        oVar.y(false);
        com.waze.z.a.d.ai.q(oVar);
    }

    private static final com.waze.settings.tree.d.s Y() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_LIGHTS_ALERT_FEATURE_CONFIGURED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_LIGHTS_ALERT_FEATURE_CONFIGURED");
        com.waze.settings.tree.d.s sVar = new com.waze.settings.tree.d.s("headlights", R.string.HEADLIGHTS_SETTING, "HEADLIGHTS_SETTINGS", bVar);
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_LIGHTS_ALERT_FEATURE_ENABLED;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_LIGHTS_ALERT_FEATURE_ENABLED");
        com.waze.settings.tree.c.f.a(sVar, bVar2);
        return sVar;
    }

    private static final com.waze.settings.tree.f Z() {
        return new com.waze.settings.tree.d.j("subscriptions", "SUBSCRIPTIONS_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.TOLL_AND_HOV_PASSES)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_passes)), SettingsHOVActivity.class);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i a(gr grVar, Context context) {
        h.g.b.x.f(context, "it");
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = grVar.f37336i;
        oVar.Q(aVar.c(R.string.NO_NETWORK_CONNECTION, new Object[0]));
        oVar.P(aVar.c(R.string.SORRY__YOU_HAVE_NO_NETWORK_CONNECTION_RIGHT_NOW__PLEASE_TRY_LATER, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        h.g.b.x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    public static final /* synthetic */ com.waze.settings.tree.f g(gr grVar) {
        return new gq(grVar, com.waze.ui.ad.b.c(Integer.valueOf(R.string.WAZE_VOICE)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_voice_placeholder)), com.waze.ui.ad.b.d(grVar.f37336i.b(((bs) grVar.f37328a.A().d()).o())));
    }

    public static final /* synthetic */ com.waze.settings.tree.d.n m(gr grVar) {
        return new com.waze.settings.tree.a.h(grVar.f37328a, grVar.f37334g, grVar.f37337j, new am(grVar, 9));
    }

    static final h.ab r(gr grVar, Context context) {
        h.g.b.x.f(context, "it");
        grVar.W(context);
        return h.ab.f48028a;
    }

    static final h.ab s(gr grVar, Context context) {
        h.g.b.x.f(context, "it");
        grVar.W(context);
        return h.ab.f48028a;
    }

    static final h.ab t(gr grVar, Context context) {
        h.g.b.x.f(context, "it");
        grVar.W(context);
        return h.ab.f48028a;
    }

    static final boolean w() {
        return !((com.waze.b.s) com.waze.b.u.f16171a.a().a().d()).d();
    }

    static final boolean x(gr grVar) {
        return grVar.f37328a.m().j();
    }

    static final boolean y(gr grVar) {
        return grVar.f37328a.m().j();
    }

    static final boolean z(gr grVar) {
        return (!ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_FEATURE_ENABLED.b().booleanValue() || ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED.b().booleanValue() || grVar.f37338k) ? false : true;
    }

    public final void F(View view) {
        h.g.b.x.f(view, "view");
        NavigateNativeManager.instance().isUsingOneOffNavigationSettings(new com.waze.car_lib.i.a.v(view, this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0d2f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.settings.tree.f G(com.waze.sound.fm r54, com.waze.sound.fc r55, com.waze.settings.tree.c.b r56) {
        /*
            Method dump skipped, instructions count: 4076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.gr.G(com.waze.sound.fm, com.waze.sound.fc, com.waze.settings.tree.c.b):com.waze.settings.tree.f");
    }

    public final ds d() {
        return this.f37328a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.waze.settings.tree.f h() {
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[12];
        com.waze.settings.tree.d.s sVarP = p();
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_ROUTING_TOLLS_ROADS_ENABLED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_ROUTING_TOLLS_ROADS_ENABLED");
        com.waze.settings.tree.c.f.a(sVarP, bVar);
        fVarArr[0] = sVarP;
        fVarArr[1] = Z();
        com.waze.settings.tree.d dVarS = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_hoy_no_circula));
        com.waze.settings.tree.o oVar = this.f37331d;
        com.waze.settings.tree.p pVar = new com.waze.settings.tree.p("hoy_no_circula", "settings_main.driving_preferences.hoy_no_circula", oVar, null, dVarS, 40);
        pVar.A(new ed(this, 5));
        fVarArr[2] = pVar;
        fVarArr[3] = new com.waze.settings.tree.d.q();
        fVarArr[4] = n();
        fVarArr[5] = o();
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.DIRT_ROADS));
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TRAILS;
        h.g.b.x.e(dVar, "CONFIG_VALUE_ROUTING_AVOID_TRAILS");
        fVarArr[6] = new fq(this, nVarC, new com.waze.settings.tree.c.g(dVar, 0), h.a.i.i(new com.waze.settings.tree.d.g("Allow", com.waze.ui.ad.b.c(Integer.valueOf(R.string.ALLOW)), null, null, null, null, 60), new com.waze.settings.tree.d.g("Don't allow", com.waze.ui.ad.b.c(Integer.valueOf(R.string.DONT_ALLOW)), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 60), new com.waze.settings.tree.d.g("Avoid long ones", com.waze.ui.ad.b.c(Integer.valueOf(R.string.AVOID_LONG_ONES)), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 60)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_dirt_road)));
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.AVOID_DIFFICULT_INTERSECTIONS));
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_DANGEROUS_TURNS;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_ROUTING_AVOID_DANGEROUS_TURNS");
        com.waze.settings.tree.d dVar2 = null;
        com.waze.settings.tree.d.d dVar3 = new com.waze.settings.tree.d.d("reduce_difficult_intersection", "REDUCE_DIFFICULT_INTERSECTION_SETTINGS", nVarC2, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_intersections)), new com.waze.settings.tree.c.a(bVar2), h.a.i.i(new com.waze.settings.tree.d.g(CredentialEntry.TRUE_STRING, com.waze.ui.ad.b.c(Integer.valueOf(R.string.AVOID_DIFFICULT_ALWAYS)), 0 == true ? 1 : 0, 0 == true ? 1 : 0, dVar2, null, 60), new com.waze.settings.tree.d.g(CredentialEntry.FALSE_STRING, com.waze.ui.ad.b.c(Integer.valueOf(R.string.AVOID_DIFFICULT_NEVER)), 0 == true ? 1 : 0, dVar2, 0 == true ? 1 : 0, null, 60)));
        com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_ROUTING_DANGEROUS_TURNS_ENABLED;
        h.g.b.x.e(bVar3, "CONFIG_VALUE_ROUTING_DANGEROUS_TURNS_ENABLED");
        com.waze.settings.tree.c.f.a(dVar3, bVar3);
        fVarArr[7] = dVar3;
        com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_ENABLED;
        h.g.b.x.e(bVar4, "CONFIG_VALUE_ROUTING_PERSONAL_ETA_ENABLED");
        com.waze.settings.tree.d.s sVar = new com.waze.settings.tree.d.s("personal_eta", R.string.NAVIGATION_SETTINGS_PERSONALIZED_ETA, "PERSONAL_ETA", bVar4, R.drawable.settings_icon_ride_history);
        sVar.A(new ed(this, 6));
        fVarArr[8] = sVar;
        com.waze.settings.tree.d.l lVar = new com.waze.settings.tree.d.l("personal_eta_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.NAVIGATION_SETTINGS_PERSONALIZED_ETA_DESCRIPTION_HTML)));
        com.waze.settings.tree.c.f.b(lVar, ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_FEATURE_ENABLED.b().booleanValue() && !ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED.b().booleanValue());
        fVarArr[9] = lVar;
        com.waze.settings.tree.d.q qVar = new com.waze.settings.tree.d.q();
        com.waze.config.b bVar5 = ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED;
        h.g.b.x.e(bVar5, "CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED");
        com.waze.settings.tree.c.f.a(qVar, bVar5);
        fVarArr[10] = qVar;
        com.waze.settings.tree.p pVar2 = new com.waze.settings.tree.p("personalization", "settings_main.general.personalization", oVar, null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_personalization)), 40);
        com.waze.config.b bVar6 = ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED;
        h.g.b.x.e(bVar6, "CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED");
        com.waze.settings.tree.c.f.a(pVar2, bVar6);
        fVarArr[11] = pVar2;
        List listI = h.a.i.i(fVarArr);
        com.waze.ui.ac.n nVarC3 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.NAVIGATION));
        com.waze.settings.tree.d dVarS2 = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_navigation));
        if (!this.f37338k) {
            com.waze.ui.ac.n nVarC4 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.CAR_DETAILS));
            com.waze.settings.tree.f[] fVarArr2 = {i(), M()};
            com.waze.settings.tree.d.m mVar = new com.waze.settings.tree.d.m("restricted_areas", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SETTINGS_RESTRICTED_AREAS_TITLE)), h.a.i.d(new com.waze.settings.tree.p("high_risk_areas", "settings_main.notifications_and_reminders.reminders.high_risk_areas", oVar, null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_high_risk)), 40)));
            com.waze.config.b bVar7 = ConfigValues.CONFIG_VALUE_ROUTING_PALESTINIAN_ROADS_ENABLED;
            h.g.b.x.e(bVar7, "CONFIG_VALUE_ROUTING_PALESTINIAN_ROADS_ENABLED");
            com.waze.settings.tree.c.f.a(mVar, bVar7);
            listI = h.a.i.i(new com.waze.settings.tree.d.m("navigation_preferences", com.waze.ui.ad.b.c(Integer.valueOf(R.string.NAVIGATION_PREFERENCES)), listI), new com.waze.settings.tree.d.m("your_vehicle", nVarC4, h.a.i.i(fVarArr2)), mVar, new com.waze.settings.tree.d.q());
        }
        return new com.waze.settings.tree.d.n("navigation", "NAVIGATION_SETTINGS", nVarC3, dVarS2, listI, 16);
    }

    public final com.waze.settings.tree.f i() {
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.VEHICLE_TYPE));
        fh fhVar = new fh(this, 3);
        List listV = this.f37328a.v();
        com.waze.settings.tree.d.g[] gVarArr = new com.waze.settings.tree.d.g[listV.size() / 2];
        for (int i2 = 1; i2 < listV.size(); i2 += 2) {
            String str = (String) listV.get(i2);
            int iHashCode = str.hashCode();
            int i3 = R.drawable.vehicle_private_unselected;
            int i4 = R.drawable.vehicle_private_selected;
            int i5 = R.string.VEHICLE_PRIVATE_DESCRIPTION;
            if (iHashCode != 2567710) {
                if (iHashCode == 403485027) {
                    str.equals("PRIVATE");
                } else if (iHashCode == 871058833 && str.equals("MOTORCYCLE")) {
                    i5 = R.string.VEHICLE_MOTORCYCLE_DESCRIPTION;
                    i4 = R.drawable.vehicle_motorcylce_selected;
                    i3 = R.drawable.vehicle_motorcylce_unselected;
                }
            } else if (str.equals("TAXI")) {
                i5 = R.string.VEHICLE_TAXI_DESCRIPTION;
                i4 = R.drawable.vehicle_taxi_selected;
                i3 = R.drawable.vehicle_taxi_unselected;
            }
            gVarArr[i2 / 2] = new com.waze.settings.tree.d.a((String) listV.get(i2), com.waze.ui.ad.b.d((String) listV.get(i2 - 1)), com.waze.ui.ad.b.c(Integer.valueOf(i5)), com.waze.nightmode.e.s(Integer.valueOf(i3)), com.waze.nightmode.e.s(Integer.valueOf(i4)));
        }
        return new gl(this, nVarC, fhVar, h.a.c.R(gVarArr), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_vehicle_private)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.waze.settings.tree.f j() {
        this.f37339l.a("Initializing Settings QuickMap");
        ds dsVar = this.f37328a;
        h.g.b.x.f(dsVar, "settingsRepository");
        com.waze.settings.tree.o oVar = this.f37331d;
        h.g.b.x.f(oVar, "referencedSettingProvider");
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.MODE));
        com.waze.settings.tree.d dVarS = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_map_mode));
        ConfigManager configManagerF = dsVar.f();
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_DISPLAY_MAP_SUB_SKIN;
        h.g.b.x.e(dVar, "CONFIG_VALUE_DISPLAY_MAP_SUB_SKIN");
        com.waze.settings.tree.c.h hVarD = gu.d(configManagerF, dVar);
        Integer numValueOf = Integer.valueOf(R.string.AUTO);
        String str = null;
        int i2 = 36;
        com.waze.ui.ac.n nVar = null;
        com.waze.settings.tree.e eVar = new com.waze.settings.tree.e("quick_map_mode_settings", "QUICK_MAP_MODE_SETTINGS_SETTINGS", nVarC, dVarS, h.a.i.d(new com.waze.settings.tree.d.b("map_mode", R.string.NOTIFICATIONS, "MAP_MODE_SETTINGS", hVarD, h.a.i.i(new com.waze.settings.tree.d.g("day", com.waze.ui.ad.b.c(Integer.valueOf(R.string.DAY)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapmode_day_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapmode_day_selected)), null, 36), new com.waze.settings.tree.d.g("", com.waze.ui.ad.b.c(numValueOf), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapmode_auto_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapmode_auto_selected)), null, 36), new com.waze.settings.tree.d.g("night", com.waze.ui.ad.b.c(Integer.valueOf(R.string.NIGHT)), nVar, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapmode_night_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapmode_night_selected)), str, i2)))));
        eVar.C("map_mode");
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.MAP_COLOR_SCHEME));
        com.waze.settings.tree.d dVarS2 = com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_map_scheme));
        ConfigManager configManagerF2 = dsVar.f();
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_DISPLAY_MAP_SCHEME;
        h.g.b.x.e(dVar2, "CONFIG_VALUE_DISPLAY_MAP_SCHEME");
        com.waze.settings.tree.e eVar2 = new com.waze.settings.tree.e("quick_color_scheme_settings", "QUICK_COLOR_SCHEME_SETTINGS_SETTINGS", nVarC2, dVarS2, h.a.i.d(new com.waze.settings.tree.d.b("map_scheme", R.string.NOTIFICATIONS, "MAP_SCHEME_SETTINGS", gu.d(configManagerF2, dVar2), h.a.i.i(new com.waze.settings.tree.d.g("12", com.waze.ui.ad.b.c(Integer.valueOf(R.string.DEFAULT)), nVar, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapscheme_default_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapscheme_default_selected)), str, i2), new com.waze.settings.tree.d.g("8", com.waze.ui.ad.b.c(Integer.valueOf(R.string.MAP_COLORS_EDITORS)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapscheme_editor_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.mapscheme_editor_selected)), null, 36)))));
        eVar2.C("map_scheme");
        com.waze.ui.ac.n nVarC3 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.DISPLAY));
        ConfigManager configManagerF3 = dsVar.f();
        com.waze.config.d dVar3 = ConfigValues.CONFIG_VALUE_MAP_PERSPECTIVE;
        h.g.b.x.e(dVar3, "CONFIG_VALUE_MAP_PERSPECTIVE");
        int i3 = 32;
        return new com.waze.settings.tree.e("quick_map_settings", "QUICK_MAP_SETTINGS_SETTINGS", nVarC3, h.a.i.i(new com.waze.settings.tree.d.b("map_camera", R.string.EMPTY, "ANALYTICS_EVENT_SETTINGS_MAP_PERSPECTIVE", gu.d(configManagerF3, dVar3), h.a.i.i(new com.waze.settings.tree.d.g("2D", com.waze.ui.ad.b.c(Integer.valueOf(R.string.TWO_D)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.camera_2d_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.camera_2d_selected)), 0 == true ? 1 : 0, 36), new com.waze.settings.tree.d.g("AUTO", com.waze.ui.ad.b.c(numValueOf), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.camera_auto_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.camera_auto_selected)), null, 36), new com.waze.settings.tree.d.g("3D manual", com.waze.ui.ad.b.c(Integer.valueOf(R.string.THREE_D)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.camera_3d_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.camera_3d_selected)), null, 36))), eVar, eVar2, new com.waze.settings.tree.p("reports", "settings_main.map_display.on_the_map.reports", oVar, com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORTS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_display_on_map)), i3), new com.waze.settings.tree.p("map_display", "settings_main.map_display", oVar, com.waze.ui.ad.b.c(Integer.valueOf(R.string.MORE_DISPLAY_OPTIONS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_more_options)), i3)));
    }

    public final com.waze.settings.tree.f k() {
        this.f37339l.a("Initializing Settings QuickNavigation");
        return new com.waze.settings.tree.b.f(this.f37328a, this.f37329b, this.f37331d, this.f37330c).c();
    }

    public final com.waze.settings.tree.f l() {
        this.f37339l.a("Initializing Settings QuickSound");
        com.waze.settings.tree.o oVar = this.f37331d;
        h.g.b.x.f(oVar, "referencedSettingProvider");
        return new com.waze.settings.tree.e("quick_sound_settings", "QUICK_SOUND_SETTINGS_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SOUND)), h.a.i.i(new com.waze.settings.tree.d.b("quick_sound", R.string.EMPTY, "QUICK_SOUND_SETTINGS", new em(), h.a.i.i(new com.waze.settings.tree.d.g("no", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SOUNDS_OFF)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.sound_off_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.sound_off_selected)), null, 36), new com.waze.settings.tree.d.g("alerts", com.waze.ui.ad.b.c(Integer.valueOf(R.string.ALERTS_ONLY)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.sound_alertsonly_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.sound_alertsonly_selected)), null, 36), new com.waze.settings.tree.d.g("yes", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SOUNDS_ON)), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.sound_on_unselected)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.sound_on_selected)), null, 36))), new com.waze.settings.tree.p("waze_voice", "settings_main.voice.navigation_guidance.waze_voice", oVar, null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_voicedirection)), 40), new com.waze.settings.tree.p("voice", "settings_main.voice", oVar, com.waze.ui.ad.b.c(Integer.valueOf(R.string.MORE_SOUND_OPTIONS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_more_options)), 32)));
    }

    public final com.waze.settings.tree.d.s n() {
        return new et(this, ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES);
    }

    public final com.waze.settings.tree.d.s o() {
        return new eu(this, new ew(this, 1));
    }

    public final com.waze.settings.tree.d.s p() {
        return new ev(this, new ew(this, 0));
    }
}

package com.waze.settings;

import com.waze.MainActivity;
import com.waze.jni.protos.settings.NotificationCategoryListProto;
import com.waze.jni.protos.settings.NotificationCategoryProto;
import com.waze.lm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SettingsNativeManager extends cr {
    public static final int $stable = 8;
    private final kotlinx.coroutines.b.bm<cj> _events;
    private final kotlinx.coroutines.b.bq<cj> events;
    private final com.waze.shared_infra.i.e logger;
    private com.waze.navigate.a.j onInCarDeeplinkActionListener;
    private final lm wazeActivityManager;

    public SettingsNativeManager(lm lmVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(lmVar, "wazeActivityManager");
        h.g.b.x.f(eVar, "logger");
        this.wazeActivityManager = lmVar;
        this.logger = eVar;
        kotlinx.coroutines.b.bm<cj> bmVarE = kotlinx.coroutines.b.bu.e(0, 16, kotlinx.coroutines.a.a.f51272b, 1);
        this._events = bmVarE;
        this.events = kotlinx.coroutines.b.ai.S(bmVarE);
    }

    private final void launchSettingsScreen(String str) {
        MainActivity mainActivityC = this.wazeActivityManager.c();
        com.waze.app_nav.a.e eVarO = mainActivityC != null ? mainActivityC.O() : null;
        if (eVarO == null) {
            this.logger.b("A mobile coordinator wasn't acquired to show the settings screen");
        } else {
            eVarO.a().d(str, "DEEP_LINK", true);
        }
    }

    public final native boolean getColorRoadsNTV();

    public final native boolean getCurrentSearchVoiceIsAutoNTV();

    public final native String getCurrentSearchVoiceNTV();

    public final native String getCurrentVoiceIdNTV();

    public final native String getCurrentVoiceSearchLabelNTV();

    public final native String getDefaultVoiceSearchLabelNTV();

    public final kotlinx.coroutines.b.bq<cj> getEvents() {
        return this.events;
    }

    public final native String getFallbackLocaleNTV();

    public final native byte[] getGasStationsNTV();

    public final native byte[] getGasTypesNTV();

    public final native String getLanguagesLocaleNTV();

    public final native byte[] getLanguagesNTV();

    public final native int getNotificationPreferencesNTV();

    public final native byte[] getSearchByVoiceDataNTV();

    public final native String getSelectedCustomPromptNTV();

    public final native boolean getShowWazersNTV();

    public final native String getVoiceSearchLangNTV();

    public final native void initNativeLayerNTV();

    public final native boolean isMarketplaceMoodCachedNTV();

    public final native boolean isMarketplaceVoiceCachedNTV();

    public final native boolean isMarketplaceVoiceNTV(String str);

    public final native byte[] loadGasTypesNTV();

    public final void onGetPushPreferencesResult$third_party_waze_client_android_project_waze_src_main_waze(NotificationCategoryListProto notificationCategoryListProto) {
        h.g.b.x.f(notificationCategoryListProto, "result");
        List<NotificationCategoryProto> categoriesList = notificationCategoryListProto.getCategoriesList();
        h.g.b.x.e(categoriesList, "getCategoriesList(...)");
        List<NotificationCategoryProto> list = categoriesList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (NotificationCategoryProto notificationCategoryProto : list) {
            ah ahVar = new ah();
            ahVar.f36767a = notificationCategoryProto.getName();
            ahVar.f36768b = notificationCategoryProto.getIsEnabled();
            ahVar.f36769c = notificationCategoryProto.getLanguageName();
            ahVar.f36770d = notificationCategoryProto.getLanguageDescription();
            arrayList.add(ahVar);
        }
        if (this._events.c(new ch(arrayList))) {
            return;
        }
        this.logger.b("Event emission failed");
    }

    public final void onSetPushPreferencesResult$third_party_waze_client_android_project_waze_src_main_waze(int i2) {
        if (this._events.c(ci.f36968a)) {
            return;
        }
        this.logger.b("Event emission failed");
    }

    public boolean openInCarSettingsPage(com.waze.settings.b.l lVar) {
        h.g.b.x.f(lVar, "page");
        com.waze.navigate.a.j jVar = this.onInCarDeeplinkActionListener;
        if (jVar == null) {
            return false;
        }
        if (true != jVar.b()) {
            jVar = null;
        }
        if (jVar == null) {
            return false;
        }
        jVar.a(new com.waze.navigate.a.c(new com.waze.navigate.a.g(lVar)));
        return true;
    }

    public final void openLicensePlateSettings$third_party_waze_client_android_project_waze_src_main_waze() {
        if (openInCarSettingsPage(com.waze.settings.b.i.f36840a)) {
            return;
        }
        launchSettingsScreen("settings_main.driving_preferences.navigation.your_vehicle.license_plate");
    }

    public final void openVehicleDetailsSettings$third_party_waze_client_android_project_waze_src_main_waze() {
        launchSettingsScreen("settings_main.driving_preferences.car_details");
    }

    public final void registerOnInCarDeeplinkActionListener(com.waze.navigate.a.j jVar) {
        h.g.b.x.f(jVar, "listener");
        if (this.onInCarDeeplinkActionListener != jVar) {
            this.onInCarDeeplinkActionListener = jVar;
            this.logger.a("registerOnInCarDeeplinkActionListener: " + jVar.hashCode());
        }
    }

    public final native void setLanguageNTV(String str);

    public final native void setMarketplaceVoiceProtoNTV(byte[] bArr);

    public final native int setNotificationPreferencesNTV(String str, boolean z);

    public final native void setPreferredStationNTV(int i2);

    public final native void setPreferredTypeNTV(int i2);

    public final native void setSearchVoiceAutoNTV();

    public final native void setSearchVoiceNTV(String str);

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SettingsNativeManager(lm lmVar, com.waze.shared_infra.i.e eVar, int i2, h.g.b.o oVar) {
        if ((i2 & 2) != 0) {
            eVar = com.waze.shared_infra.i.a.d("SettingsNativeManager");
            h.g.b.x.e(eVar, "create(...)");
        }
        this(lmVar, eVar);
    }
}

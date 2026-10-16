package com.waze.settings;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.settings.CopilotMarketplaceVoice;
import com.waze.jni.protos.settings.NotificationCategoryListProto;
import com.waze.jni.protos.settings.SearchByVoiceDataProto;
import com.waze.jni.protos.settings.SettingsValueListProto;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class cr {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCurrentVoiceId$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentVoiceId");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.getCurrentVoiceId(lVar);
    }

    static final String getCurrentVoiceId$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return ((SettingsNativeManager) crVar).getCurrentVoiceIdNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getLanguages$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguages");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.getLanguages(lVar);
    }

    static final byte[] getLanguages$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return ((SettingsNativeManager) crVar).getLanguagesNTV();
    }

    static final void getLanguages$lambda$1(h.g.a.l lVar, byte[] bArr) {
        SettingsValueListProto settingsValueListProto = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                settingsValueListProto = (SettingsValueListProto) SettingsValueListProto.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(settingsValueListProto);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNotificationPreferences$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotificationPreferences");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.getNotificationPreferences(lVar);
    }

    static final Integer getNotificationPreferences$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return Integer.valueOf(((SettingsNativeManager) crVar).getNotificationPreferencesNTV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSearchByVoiceData$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchByVoiceData");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.getSearchByVoiceData(lVar);
    }

    static final byte[] getSearchByVoiceData$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return ((SettingsNativeManager) crVar).getSearchByVoiceDataNTV();
    }

    static final void getSearchByVoiceData$lambda$1(h.g.a.l lVar, byte[] bArr) {
        SearchByVoiceDataProto searchByVoiceDataProto = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                searchByVoiceDataProto = (SearchByVoiceDataProto) SearchByVoiceDataProto.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(searchByVoiceDataProto);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isMarketplaceMoodCached$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isMarketplaceMoodCached");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.isMarketplaceMoodCached(lVar);
    }

    static final Boolean isMarketplaceMoodCached$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return Boolean.valueOf(((SettingsNativeManager) crVar).isMarketplaceMoodCachedNTV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isMarketplaceVoice$default(cr crVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isMarketplaceVoice");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        crVar.isMarketplaceVoice(str, lVar);
    }

    static final Boolean isMarketplaceVoice$lambda$0(cr crVar, String str) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return Boolean.valueOf(((SettingsNativeManager) crVar).isMarketplaceVoiceNTV(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isMarketplaceVoiceCached$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isMarketplaceVoiceCached");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.isMarketplaceVoiceCached(lVar);
    }

    static final Boolean isMarketplaceVoiceCached$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return Boolean.valueOf(((SettingsNativeManager) crVar).isMarketplaceVoiceCachedNTV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadGasTypes$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadGasTypes");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.loadGasTypes(lVar);
    }

    static final byte[] loadGasTypes$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return ((SettingsNativeManager) crVar).loadGasTypesNTV();
    }

    static final void loadGasTypes$lambda$1(h.g.a.l lVar, byte[] bArr) {
        SettingsValueListProto settingsValueListProto = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                settingsValueListProto = (SettingsValueListProto) SettingsValueListProto.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(settingsValueListProto);
            }
        }
    }

    static final void onGetPushPreferencesResultJNI$lambda$0(cr crVar, NotificationCategoryListProto notificationCategoryListProto) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        h.g.b.x.c(notificationCategoryListProto);
        ((SettingsNativeManager) crVar).onGetPushPreferencesResult$third_party_waze_client_android_project_waze_src_main_waze(notificationCategoryListProto);
    }

    static final void onSetPushPreferencesResultJNI$lambda$0(cr crVar, int i2) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).onSetPushPreferencesResult$third_party_waze_client_android_project_waze_src_main_waze(i2);
    }

    static final void openLicensePlateSettingsJNI$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).openLicensePlateSettings$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void openVehicleDetailsSettingsJNI$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).openVehicleDetailsSettings$third_party_waze_client_android_project_waze_src_main_waze();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLanguage$default(cr crVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLanguage");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        crVar.setLanguage(str, lVar);
    }

    static final h.ab setLanguage$lambda$0(cr crVar, String str) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).setLanguageNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMarketplaceVoiceProto$default(cr crVar, CopilotMarketplaceVoice copilotMarketplaceVoice, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMarketplaceVoiceProto");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        crVar.setMarketplaceVoiceProto(copilotMarketplaceVoice, lVar);
    }

    static final h.ab setMarketplaceVoiceProto$lambda$0(cr crVar, CopilotMarketplaceVoice copilotMarketplaceVoice) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).setMarketplaceVoiceProtoNTV(copilotMarketplaceVoice != null ? copilotMarketplaceVoice.toByteArray() : null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setNotificationPreferences$default(cr crVar, String str, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNotificationPreferences");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        crVar.setNotificationPreferences(str, z, lVar);
    }

    static final Integer setNotificationPreferences$lambda$0(cr crVar, String str, boolean z) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        return Integer.valueOf(((SettingsNativeManager) crVar).setNotificationPreferencesNTV(str, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPreferredStation$default(cr crVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPreferredStation");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        crVar.setPreferredStation(i2, lVar);
    }

    static final h.ab setPreferredStation$lambda$0(cr crVar, int i2) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).setPreferredStationNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPreferredType$default(cr crVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPreferredType");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        crVar.setPreferredType(i2, lVar);
    }

    static final h.ab setPreferredType$lambda$0(cr crVar, int i2) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).setPreferredTypeNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSearchVoice$default(cr crVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSearchVoice");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        crVar.setSearchVoice(str, lVar);
    }

    static final h.ab setSearchVoice$lambda$0(cr crVar, String str) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).setSearchVoiceNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSearchVoiceAuto$default(cr crVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSearchVoiceAuto");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        crVar.setSearchVoiceAuto(lVar);
    }

    static final h.ab setSearchVoiceAuto$lambda$0(cr crVar) {
        h.g.b.x.d(crVar, "null cannot be cast to non-null type com.waze.settings.SettingsNativeManager");
        ((SettingsNativeManager) crVar).setSearchVoiceAutoNTV();
        return null;
    }

    public boolean getColorRoads() {
        return ((SettingsNativeManager) this).getColorRoadsNTV();
    }

    public String getCurrentSearchVoice() {
        return ((SettingsNativeManager) this).getCurrentSearchVoiceNTV();
    }

    public boolean getCurrentSearchVoiceIsAuto() {
        return ((SettingsNativeManager) this).getCurrentSearchVoiceIsAutoNTV();
    }

    public void getCurrentVoiceId(h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 0), lVar != null ? new cl(lVar, 2) : null);
    }

    public String getCurrentVoiceSearchLabel() {
        return ((SettingsNativeManager) this).getCurrentVoiceSearchLabelNTV();
    }

    public String getDefaultVoiceSearchLabel() {
        return ((SettingsNativeManager) this).getDefaultVoiceSearchLabelNTV();
    }

    public String getFallbackLocale() {
        return ((SettingsNativeManager) this).getFallbackLocaleNTV();
    }

    public SettingsValueListProto getGasStations() {
        byte[] gasStationsNTV = ((SettingsNativeManager) this).getGasStationsNTV();
        if (gasStationsNTV != null) {
            try {
                return (SettingsValueListProto) SettingsValueListProto.parser().c(gasStationsNTV);
            } catch (com.google.v.eu unused) {
            }
        }
        return null;
    }

    public SettingsValueListProto getGasTypes() {
        byte[] gasTypesNTV = ((SettingsNativeManager) this).getGasTypesNTV();
        if (gasTypesNTV != null) {
            try {
                return (SettingsValueListProto) SettingsValueListProto.parser().c(gasTypesNTV);
            } catch (com.google.v.eu unused) {
            }
        }
        return null;
    }

    public void getLanguages(h.g.a.l<? super SettingsValueListProto, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 7), new cl(lVar, 14));
    }

    public String getLanguagesLocale() {
        return ((SettingsNativeManager) this).getLanguagesLocaleNTV();
    }

    public void getNotificationPreferences(h.g.a.l<? super Integer, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 5), lVar != null ? new cl(lVar, 12) : null);
    }

    public void getSearchByVoiceData(h.g.a.l<? super SearchByVoiceDataProto, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 2), new cl(lVar, 3));
    }

    public String getSelectedCustomPrompt() {
        return ((SettingsNativeManager) this).getSelectedCustomPromptNTV();
    }

    public boolean getShowWazers() {
        return ((SettingsNativeManager) this).getShowWazersNTV();
    }

    public String getVoiceSearchLang() {
        return ((SettingsNativeManager) this).getVoiceSearchLangNTV();
    }

    public void isMarketplaceMoodCached(h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 6), lVar != null ? new cl(lVar, 13) : null);
    }

    public void isMarketplaceVoice(String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        h.g.b.x.f(str, "voiceId");
        NativeManager.runNativeTask(new co(this, str, 3), lVar != null ? new cl(lVar, 10) : null);
    }

    public void isMarketplaceVoiceCached(h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 4), lVar != null ? new cl(lVar, 8) : null);
    }

    public void loadGasTypes(h.g.a.l<? super SettingsValueListProto, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 3), new cl(lVar, 5));
    }

    protected final void onGetPushPreferencesResultJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "result");
        try {
            final NotificationCategoryListProto notificationCategoryListProto = (NotificationCategoryListProto) NotificationCategoryListProto.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.settings.cp
                @Override // java.lang.Runnable
                public final void run() {
                    cr.onGetPushPreferencesResultJNI$lambda$0(this.f36981a, notificationCategoryListProto);
                }
            });
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onSetPushPreferencesResultJNI(final int i2) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.settings.cn
            @Override // java.lang.Runnable
            public final void run() {
                cr.onSetPushPreferencesResultJNI$lambda$0(this.f36976a, i2);
            }
        });
    }

    protected final void openLicensePlateSettingsJNI() {
        NativeManager.runMainThreadTask(new m(this, 5));
    }

    protected final void openVehicleDetailsSettingsJNI() {
        NativeManager.runMainThreadTask(new m(this, 4));
    }

    public void setLanguage(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new co(this, str, 2), lVar != null ? new cl(lVar, 9) : null);
    }

    public void setMarketplaceVoiceProto(CopilotMarketplaceVoice copilotMarketplaceVoice, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new co(this, copilotMarketplaceVoice, 0), lVar != null ? new cl(lVar, 7) : null);
    }

    public void setNotificationPreferences(final String str, final boolean z, h.g.a.l<? super Integer, h.ab> lVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        NativeManager.runNativeTask(new hw() { // from class: com.waze.settings.ck
            @Override // com.waze.hw
            public final Object a() {
                return cr.setNotificationPreferences$lambda$0(this.f36969a, str, z);
            }
        }, lVar != null ? new cl(lVar, 0) : null);
    }

    public void setPreferredStation(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new cq(this, i2, 1), lVar != null ? new cl(lVar, 11) : null);
    }

    public void setPreferredType(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new cq(this, i2, 0), lVar != null ? new cl(lVar, 1) : null);
    }

    public void setSearchVoice(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "key");
        NativeManager.runNativeTask(new co(this, str, 1), lVar != null ? new cl(lVar, 6) : null);
    }

    public void setSearchVoiceAuto(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new cm(this, 1), lVar != null ? new cl(lVar, 4) : null);
    }

    public final void getSearchByVoiceData() {
        getSearchByVoiceData$default(this, null, 1, null);
    }

    public final void loadGasTypes() {
        loadGasTypes$default(this, null, 1, null);
    }

    public final void getLanguages() {
        getLanguages$default(this, null, 1, null);
    }

    public final void getCurrentVoiceId() {
        getCurrentVoiceId$default(this, null, 1, null);
    }

    public final void setMarketplaceVoiceProto(CopilotMarketplaceVoice copilotMarketplaceVoice) {
        setMarketplaceVoiceProto$default(this, copilotMarketplaceVoice, null, 2, null);
    }

    public final void setPreferredType(int i2) {
        setPreferredType$default(this, i2, null, 2, null);
    }

    public final void setSearchVoiceAuto() {
        setSearchVoiceAuto$default(this, null, 1, null);
    }

    public final void getNotificationPreferences() {
        getNotificationPreferences$default(this, null, 1, null);
    }

    public final void isMarketplaceMoodCached() {
        isMarketplaceMoodCached$default(this, null, 1, null);
    }

    public final void isMarketplaceVoiceCached() {
        isMarketplaceVoiceCached$default(this, null, 1, null);
    }

    public final void setLanguage(String str) {
        setLanguage$default(this, str, null, 2, null);
    }

    public final void setPreferredStation(int i2) {
        setPreferredStation$default(this, i2, null, 2, null);
    }

    public final void setNotificationPreferences(String str, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        setNotificationPreferences$default(this, str, z, null, 4, null);
    }

    public final void setSearchVoice(String str) {
        h.g.b.x.f(str, "key");
        setSearchVoice$default(this, str, null, 2, null);
    }

    public final void isMarketplaceVoice(String str) {
        h.g.b.x.f(str, "voiceId");
        isMarketplaceVoice$default(this, str, null, 2, null);
    }
}

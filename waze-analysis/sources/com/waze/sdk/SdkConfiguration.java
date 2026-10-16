package com.waze.sdk;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.lh;
import com.waze.lm;
import com.waze.mg;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SdkConfiguration implements Serializable {
    private static final int CANT_OPEN_APP_INSTALL_PAGE_DIALOG_TIMEOUT_SECS = 500;
    public static final int CLIENT_API_TYPE_AUDIO = 2;
    public static final int CLIENT_API_TYPE_TRANSPORT = 1;
    public static final int CLIENT_API_TYPE_UNSPECIFIED = 0;
    private static final int DATA_DESTINATION = 2;
    private static final int DATA_ROUTE = 4;
    private static final int DATA_TURNS_AND_ETA = 1;
    private static final int FEATURE_AUDIO = 2097152;
    private static final int FEATURE_CHANGE_CAR = 32768;
    private static final int FEATURE_CHANGE_VEHICLE_TYLE = 262144;
    private static final int FEATURE_CHANGE_VOICE = 131072;
    private static final int FEATURE_RETURN_REQUEST = 524288;
    private static final String GOOGLE_PLAY_URI = "https://play.google.com/store/apps/details?id=";
    private static final int IS_AUDIO_PARTNER_INTERNAL_TESTING = 268435456;
    private static final int IS_GRADUAL_ROLLOUT = 536870912;
    private static final int IS_TEST_APP = -1073741824;
    private static final String KEY_LAST_CONNECTED_AUDIO_SDK = "lastConnectedAudioSdk";
    private static final String PREF_AUDIO_APP_ENABLED = "com.waze.sdk.audio.enabled";
    private static final String PREF_DATA_AGREEMENT_TIMESTAMP = "com.waze.transportation";
    private static final String PREF_GENERAL_SDK_SETTINGS = "com.waze.sdk.general";
    private static final String PREF_LAST_SDK_CONNECTION_TIMESTAMP = "com.waze.sdk.general.timestamp";
    private static final String PREF_SDK_PACKAGE_SCOPES = "com.waze.sdk.scopes";
    private static final String PREF_TRANSPORTATION_CUSTOMIZATION_TIMESTAMP = "com.waze.transportation.customization";
    private static final int SCOPE_NOT_WHITE_LISTED = 0;
    private static Map<String, au> appConfigs = null;
    private static BroadcastReceiver packageIntentReceiver = null;
    private static String partnerAppIconBaseUrl = null;
    private static final long serialVersionUID = 1;
    public String AppIconBaseUrl;
    public String[] AppNames;
    public String[] InstallationUrls;
    public String[] PackageNames;
    public int[] Scopes;
    private static final String TIMESTAMP = new SimpleDateFormat("yyyyMMdd").format(new Date());
    private static final au[] DEBUG_APPS = {new au("com.waze.sdk.audio.sample", "Audio Demo", 2097159)};
    private static final Map<Integer, String> externalApps = new ConcurrentHashMap();

    public static void enableAudioSdk(boolean z) {
        ConfigManager.getInstance().setConfigValueBool(ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SDK_ON, z);
        bd.d().B(z);
    }

    public static synchronized au getAppConfig(String str) {
        String str2 = null;
        if (str != null) {
            Map<String, au> map = appConfigs;
            if (map == null) {
                return null;
            }
            if (map.containsKey(str)) {
                return appConfigs.get(str);
            }
        }
        return new au(str2, "", 0);
    }

    static int getCachedPackageScope(Context context, String str) {
        return context.getSharedPreferences(PREF_SDK_PACKAGE_SCOPES, 0).getInt(str, 0);
    }

    static String getCustomizedAppIconUrl(Resources resources, String str) {
        if (partnerAppIconBaseUrl == null) {
            return "";
        }
        float f2 = resources.getDisplayMetrics().density;
        return partnerAppIconBaseUrl.concat(String.format("%s_%s.png?date=%s", str, f2 > 2.0f ? "xl" : ((double) f2) > 1.5d ? CmcdData.STREAM_TYPE_LIVE : f2 > 1.0f ? CmcdData.OBJECT_TYPE_MANIFEST : CmcdData.STREAMING_FORMAT_SS, TIMESTAMP));
    }

    public static String getExternalAppPackageName(int i2) {
        return externalApps.get(Integer.valueOf(i2));
    }

    static long getLastAppAuthorizedTimestamp(String str) {
        try {
            return new JSONObject(ConfigValues.CONFIG_VALUE_SDK_PARTNER_DATA_CONFIRM.b()).getLong(str);
        } catch (JSONException unused) {
            return 0L;
        }
    }

    public static String getLastConnectedAudioApp() {
        return mg.a().getSharedPreferences(PREF_GENERAL_SDK_SETTINGS, 0).getString(KEY_LAST_CONNECTED_AUDIO_SDK, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: all -> 0x0085, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0012, B:10:0x001e, B:11:0x0028, B:13:0x002e, B:15:0x003e, B:17:0x0044, B:19:0x004c, B:22:0x0054, B:24:0x005a, B:25:0x005e, B:27:0x0062, B:33:0x0080, B:30:0x0070, B:32:0x0079), top: B:39:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List<com.waze.sdk.au> getPartnerAudioApps(android.content.Context r7, boolean r8) {
        /*
            java.lang.Class<com.waze.sdk.SdkConfiguration> r0 = com.waze.sdk.SdkConfiguration.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.util.Map<java.lang.String, com.waze.sdk.au> r2 = com.waze.sdk.SdkConfiguration.appConfigs     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5e
            boolean r2 = com.waze.ConfigManager.isReady()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5e
            com.waze.config.b r2 = com.waze.config.ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SDK_FEATURE_ENABLED     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L85
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5e
            java.util.Map<java.lang.String, com.waze.sdk.au> r2 = com.waze.sdk.SdkConfiguration.appConfigs     // Catch: java.lang.Throwable -> L85
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L85
        L28:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L85
            com.waze.sdk.au r3 = (com.waze.sdk.au) r3     // Catch: java.lang.Throwable -> L85
            int r4 = r3.f35260c     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r3.f35258a     // Catch: java.lang.Throwable -> L85
            boolean r6 = isAudioSupported(r4, r5)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L28
            boolean r6 = isGradualRollout(r4)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L4c
            com.waze.sdk.ap r6 = com.waze.sdk.ap.f35250a     // Catch: java.lang.Throwable -> L85
            boolean r5 = r6.d(r5)     // Catch: java.lang.Throwable -> L85
            if (r5 == 0) goto L28
        L4c:
            boolean r5 = r3.g(r7)     // Catch: java.lang.Throwable -> L85
            if (r5 != 0) goto L5a
            if (r8 == 0) goto L28
            boolean r4 = isTestApp(r4)     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L28
        L5a:
            r1.add(r3)     // Catch: java.lang.Throwable -> L85
            goto L28
        L5e:
            java.util.Map<java.lang.String, com.waze.sdk.au> r2 = com.waze.sdk.SdkConfiguration.appConfigs     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L6e
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "com.spotify.music"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L80
        L6e:
            if (r8 != 0) goto L79
            com.waze.sdk.b.m.v()     // Catch: java.lang.Throwable -> L85
            boolean r8 = com.waze.sdk.b.m.af()     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L80
        L79:
            com.waze.sdk.au r8 = getSpotifyAppConfig()     // Catch: java.lang.Throwable -> L85
            r1.add(r8)     // Catch: java.lang.Throwable -> L85
        L80:
            registerPackageIntentReceiverIfNeeded(r7)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)
            return r1
        L85:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sdk.SdkConfiguration.getPartnerAudioApps(android.content.Context, boolean):java.util.List");
    }

    @Deprecated
    static au getSpotifyAppConfig() {
        au auVar;
        String str = "com.spotify.music";
        au appConfig = getAppConfig("com.spotify.music");
        if (appConfig == null) {
            auVar = new au(str, "Spotify", 2097153);
        } else {
            auVar = new au("com.spotify.music", appConfig.f35259b, 2097153, appConfig.f35261d, null);
        }
        com.waze.sdk.b.m.v();
        auVar.f35262e = Boolean.valueOf(com.waze.sdk.b.m.af());
        return auVar;
    }

    public static Drawable getSystemAppIcon(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationIcon(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return context.getResources().getDrawable(R.drawable.audio_generic_music_icon);
        }
    }

    public static Boolean getTransportationCustomizationAgreed(String str) {
        SharedPreferences sharedPreferences = mg.a().getSharedPreferences(PREF_TRANSPORTATION_CUSTOMIZATION_TIMESTAMP, 0);
        if (sharedPreferences.contains(str)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return null;
    }

    static boolean hasValidUserAgreement(String str) {
        long lastAppAuthorizedTimestamp = getLastAppAuthorizedTimestamp(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = ConfigValues.CONFIG_VALUE_SDK_DATA_CONFIRM_EXPIRY_DAYS.b().longValue();
        int i2 = lh.f25149a;
        return jCurrentTimeMillis - lastAppAuthorizedTimestamp <= jLongValue * CalendarModelKt.MillisecondsIn24Hours;
    }

    private static boolean isAudioPartnerInternalTesting(int i2, String str) {
        return (i2 & 268435456) != 0 && isAudioPartnerInternalTestingAllowed(str);
    }

    private static boolean isAudioPartnerInternalTestingAllowed(String str) {
        return ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_PARTNER_TESTING.b().booleanValue() && ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_PARTNER_TESTING_PACKAGE_NAME.b().equals(str);
    }

    public static boolean isAudioSdkEnabled() {
        return ConfigManager.isReady() && ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SDK_ON.b().booleanValue();
    }

    public static boolean isAudioSupported(int i2, String str) {
        if ((2097152 & i2) != 0) {
            return (i2 & 268435456) == 0 || isAudioPartnerInternalTestingAllowed(str);
        }
        return false;
    }

    public static boolean isCustomizeCarIconSupported(int i2) {
        return (i2 & 32768) != 0;
    }

    public static boolean isCustomizeVehicleTypeSupported(int i2) {
        return (i2 & 262144) != 0;
    }

    public static boolean isCustomizeVoiceTypeSupported(int i2) {
        return (i2 & 131072) != 0;
    }

    public static boolean isGradualRollout(int i2) {
        return (i2 & 536870912) != 0;
    }

    public static synchronized boolean isSdkConfigurationLoaded() {
        if (appConfigs != null) {
            if (ConfigManager.getInstance().isConfigSynced()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTestApp(int i2) {
        return (i2 & IS_TEST_APP) != 0;
    }

    public static boolean isWhiteListed(int i2) {
        return i2 != 0;
    }

    public static void openAppInstallPage(Context context, String str) {
        au appConfig = getAppConfig(str);
        if (appConfig != null) {
            String str2 = appConfig.f35261d;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(GOOGLE_PLAY_URI + str));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        } catch (ActivityNotFoundException e2) {
            com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
            com.waze.ab.o oVar = new com.waze.ab.o();
            oVar.Q(aVarA.c(R.string.CUI_CANT_OPEN_BROWSER_POPUP_TITLE, new Object[0]));
            oVar.M(aVarA.c(R.string.CUI_CANT_OPEN_BROWSER_CLOSE_POPUP, new Object[0]));
            oVar.w(500);
            com.waze.z.a.d.ai.q(oVar);
            com.waze.shared_infra.i.h.c("could not open the browser. Error: ".concat(e2.toString()));
        }
    }

    public static void openAudioSdkSettingsScreen() {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            com.waze.bs.a.e(eVarE, "settings_main.driving_preferences.music_controls", null);
        }
    }

    private static void registerPackageIntentReceiverIfNeeded(Context context) {
        if (packageIntentReceiver != null) {
            return;
        }
        packageIntentReceiver = new ar();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_INSTALL");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addDataScheme("package");
        context.getApplicationContext().registerReceiver(packageIntentReceiver, intentFilter);
    }

    private static void savePackageScopesToSharedPref() {
        SharedPreferences.Editor editorEdit = mg.a().getSharedPreferences(PREF_SDK_PACKAGE_SCOPES, 0).edit();
        for (au auVar : appConfigs.values()) {
            editorEdit.putInt(auVar.f35258a, auVar.f35260c);
        }
        editorEdit.apply();
    }

    public static void setExternalAppAndType(final String str, final int i2) {
        externalApps.put(Integer.valueOf(i2), str);
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.sdk.aq
            @Override // java.lang.Runnable
            public final void run() {
                NativeManager.getInstance().SetExternalApp(i2, str);
            }
        });
    }

    static void setLastAppAuthorizedTimestamp(String str, long j2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(ConfigValues.CONFIG_VALUE_SDK_PARTNER_DATA_CONFIRM.b());
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        try {
            if (j2 > 0) {
                jSONObject.put(str, j2);
            } else {
                jSONObject.remove(str);
            }
        } catch (JSONException unused2) {
        }
        ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_SDK_PARTNER_DATA_CONFIRM, jSONObject.toString());
    }

    public static void setLastConnectedAudioApp(String str) {
        mg.a().getSharedPreferences(PREF_GENERAL_SDK_SETTINGS, 0).edit().putString(KEY_LAST_CONNECTED_AUDIO_SDK, str).apply();
    }

    public static void setTransportationCustomizationAgreed(String str, boolean z) {
        mg.a().getSharedPreferences(PREF_TRANSPORTATION_CUSTOMIZATION_TIMESTAMP, 0).edit().putBoolean(str, z).apply();
    }

    public static boolean shouldSendFullRouteGeometry(int i2) {
        return (i2 & 4) != 0;
    }

    public static boolean shouldSendTurnsAndEta(int i2) {
        return (i2 & 1) != 0;
    }

    static synchronized void updateAppList() {
        if (appConfigs == null || ConfigManager.getInstance().isConfigSynced()) {
            SdkConfiguration sdkConfigurationConfigGetSdkConfigurationNTV = NativeManager.getInstance().configGetSdkConfigurationNTV();
            if (sdkConfigurationConfigGetSdkConfigurationNTV != null && sdkConfigurationConfigGetSdkConfigurationNTV.PackageNames != null && sdkConfigurationConfigGetSdkConfigurationNTV.AppNames != null && sdkConfigurationConfigGetSdkConfigurationNTV.Scopes != null && sdkConfigurationConfigGetSdkConfigurationNTV.InstallationUrls != null) {
                partnerAppIconBaseUrl = sdkConfigurationConfigGetSdkConfigurationNTV.AppIconBaseUrl;
                appConfigs = new HashMap();
                int i2 = 0;
                while (true) {
                    String[] strArr = sdkConfigurationConfigGetSdkConfigurationNTV.PackageNames;
                    if (i2 >= strArr.length) {
                        savePackageScopesToSharedPref();
                        return;
                    }
                    Map<String, au> map = appConfigs;
                    String str = strArr[i2];
                    map.put(str, new au(str, sdkConfigurationConfigGetSdkConfigurationNTV.AppNames[i2], sdkConfigurationConfigGetSdkConfigurationNTV.Scopes[i2], sdkConfigurationConfigGetSdkConfigurationNTV.InstallationUrls[i2], null));
                    i2++;
                }
            }
            com.waze.shared_infra.i.h.c("updateAppList: at least one of the sdkConfigs is not initialized");
        }
    }

    static boolean wouldSendTransportationData(int i2) {
        return (i2 & 7) != 0;
    }
}

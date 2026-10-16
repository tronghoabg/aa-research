package com.waze;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.Size;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ads.AdsNativeManager;
import com.waze.ads.TrustlessTokenNativeManager;
import com.waze.alerters.AlerterNativeManager;
import com.waze.asks.WazeAsksNativeManager;
import com.waze.authentication.AuthNativeManager;
import com.waze.beacons.BeaconsNativeManager;
import com.waze.calendar.CalendarNativeManager;
import com.waze.config.ConfigNativeManager;
import com.waze.config.ConfigValues;
import com.waze.config.PreferencesConfigNativeManager;
import com.waze.crash.CrashNativeManager;
import com.waze.ev.EVNetworksNativeManager;
import com.waze.external_poi.ExternalPoiNativeManager;
import com.waze.favorites.FavoritesActivity;
import com.waze.favorites.FavoritesNativeManager;
import com.waze.gas.GasNativeManager;
import com.waze.google_assistant.GoogleAssistantNativeManager;
import com.waze.gw.Gateway;
import com.waze.inbox.InboxNativeManager;
import com.waze.insights_infra.InsightsInfraNativeManager;
import com.waze.insights_infra.NotificationInsightsNativeManager;
import com.waze.install.InstallNativeManager;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.EtaLabelRequest;
import com.waze.jni.protos.EtaLabelResponse;
import com.waze.jni.protos.GetCurrencyStringRequest;
import com.waze.jni.protos.GetCurrencyStringResponse;
import com.waze.jni.protos.LoadAutoCompleteVenueResponse;
import com.waze.jni.protos.MessageBoxIconProto;
import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.NativeBitmapWithAlignment;
import com.waze.jni.protos.NotificationMessage;
import com.waze.jni.protos.QuestionProto;
import com.waze.jni.protos.RtAlertsThumbsUpDataProto;
import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.jni.protos.VenueOrPlace;
import com.waze.jni.protos.WazeApplicationInfo;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import com.waze.jni.protos.places.Place;
import com.waze.location.LocationNativeManager;
import com.waze.log.LogNativeManager;
import com.waze.map.MapColorNativeManager;
import com.waze.map.MapNativeManager;
import com.waze.map.NativeCanvasRenderer;
import com.waze.map.NativeFontBitmapGenerator;
import com.waze.map.canvas.AndroidPlatformCanvasNativeManager;
import com.waze.map.canvas.CanvasNativeCallbacksBridge;
import com.waze.map.canvas.MainCanvasSwapperNativeManager;
import com.waze.messages.MessagesNativeManager;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.native_managers.JniDaemonThreadNativeManager;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import com.waze.nav_connect.NavConnectNativeManager;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.NavResultData;
import com.waze.navigate.NavigateNativeManager;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.navigate.NavigationStartPointNativeManager;
import com.waze.navigate.NewVenuePinNativeManager;
import com.waze.navigate.ParkedHereNativeManager;
import com.waze.network.GrpcCallerNativeManager;
import com.waze.notifications.WazeNotificationNativeManager;
import com.waze.perf.BootMonitorNativeManager;
import com.waze.perf.tracer.TraceNativeManager;
import com.waze.places.PlaceFormatterNativeManager;
import com.waze.places.PlacesNativeManager;
import com.waze.planned_drive.PlannedDriveNativeManager;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.realtime_report_feedback.ReportFeedbackServiceProvider;
import com.waze.reports.WazeReportNativeManager;
import com.waze.resources.ResourcesNativeManager;
import com.waze.resume_drive.ResumeDriveNativeManager;
import com.waze.rtalerts.RealtimeAlertsNativeManager;
import com.waze.rtalerts.RtAlertsNativeManager;
import com.waze.sdk.SdkConfiguration;
import com.waze.search.SearchNativeManager;
import com.waze.settings.SettingsNativeManager;
import com.waze.share.ShareNativeManager;
import com.waze.sharedrive.ShareDriveNativeManager;
import com.waze.sharedui.utils.RequestPermissionActivity;
import com.waze.sound.SoundConfigNativeManager;
import com.waze.sound.SoundNativeManager;
import com.waze.sound.TtsNativeManager;
import com.waze.sound.VoiceAssetsNativeManager;
import com.waze.sound.VoicesNativeManager;
import com.waze.sound.WazeTtsDownloaderNativeManager;
import com.waze.sound.WazeTtsPlayerNativeManager;
import com.waze.sound.WazeTtsStringsProviderNativeManager;
import com.waze.stats.AdEventsReporterNativeManager;
import com.waze.stats.MetricsReporterNativeManager;
import com.waze.stats.StatsReporterNativeManager;
import com.waze.system.SystemNativeManager;
import com.waze.user.FriendUserData;
import com.waze.user.UserData;
import com.waze.view.bottom.BottomNotificationNativeManager;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.UUID;
import java.util.Vector;
import kotlinx.coroutines.CompletableDeferred;
import l.a.ahd;
import l.a.ahe;
import l.a.bow;
import l.a.boy;
import l.a.uq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class NativeManager extends iz implements com.waze.native_managers.i, lc, gi, lk, lj, com.waze.shared_infra.s.b, cy, ky, ag {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int APP_TYPE_WAZE_AUTOMOTIVE = 1;
    public static final int APP_TYPE_WAZE_MOBILE = 0;
    public static final String ARG_MESSAGE = "MESSAGE";
    public static final int CALENDAR_ACCESS_REQUEST_CODE = 7781;
    private static final long CAMERA_PREVIEW_TIMEOUT = 60000;
    private static final String CONFIG_VALUE_FTE_WITH_TEXT = "FTE_WITH_TEXT";
    private static final String CONFIG_VALUE_NO_FTE = "NO_FTE";
    public static final int DEEPLINK_MAX_TRIES = 10;
    public static final int DEEPLINK_TRY_DELAY_MS = 1000;
    public static final int EXTERNAL_APP_TYPE_AUDIO = 2;
    public static final int EXTERNAL_APP_TYPE_TRANSPORT = 1;
    public static final int EXTERNAL_DISPLAY_TYPE_AA = 4;
    public static final int EXTERNAL_DISPLAY_TYPE_NONE = 0;
    private static final long GPS_DISABLED_WARNING_TIMEOUT = 3000;
    public static final int NATIVE_MANAGER_NO = 4;
    public static final int NATIVE_MANAGER_YES = 3;
    static final String PARKING_ICON_NAME = "category_group_parking.png";
    static final String PARKING_ICON_NAME_LATAM = "category_group_parking_latam.png";
    static final String PARKING_TITLE = "parking";
    public static final String PREFS_DB = "WAZE MAIN PREFS";
    private static final String PREFS_KEY_WEB_USER_AGENT = "webUserAgent";
    public static final String REFERRER_URL_PARAM_PREFIX = "ref=";
    private static final int SHARE_REQUEST_TYPE_CREATE_MEETING = 1;
    private static final long STORAGE_SPACE_LOW_BOUND = 5000000;
    private static final boolean WAZE_WIDGET_ENABLED = false;
    private boolean isNativeLayerShutdown;
    private KeyguardManager keyguardManager;
    private Runnable mCreateMeetingRunnable;
    private boolean mIsInTransportationMode;
    private com.waze.location.o mLocationListner;
    private kotlinx.coroutines.ab mNativeDispatcher;
    private NavResultData mNavResultData;
    private NotificationManager mNotificationManager;
    private volatile boolean mOpenPoiCalled;
    private ResourcesNativeManager mResManager;
    private boolean mShowRoutesWhenNavigationStarts;
    private le mSpeechttManager;
    private int mSysValScreenTimeout;
    private int mSysValVolume;
    private NativeTimerManager mTimerManager;
    private WazeNativeLooperDispatcher mWazeNativeLooperDispatcher;
    public static final int UH_SEARCH_VENUES = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_VENUE_STATUS = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_VENUE_ADD_IMAGE_RESULT = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_LOGIN_DONE = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_GAS_PRICE_UPDATED = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_PARKING_CHANGED = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_SHOW_SDK_ERROR_MESSAGE_POPUP = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_CANCEL_SDK_ERROR_MESSAGE_POPUP = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_SHOW_NOTIFICATION_MESSAGE = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static volatile boolean sAppStarted = false;
    private static volatile boolean IsSyncValid = false;
    private static NativeManager mInstance = null;
    public static boolean bToCreateAcc = false;
    public static String mInviteId = null;
    private static final Object mAppStartedLock = new Object();
    private static volatile boolean mAppStartedFlushed = false;
    private static final ArrayList<Runnable> mAppStartedEvents = new ArrayList<>();
    private static Vector<Runnable> mInitialLooperQueue = new Vector<>();
    private int mFeatures = -1;
    private boolean mCalendarEventsDirty = true;
    private com.waze.navigate.eo navigationStatusInterface = null;
    private hz searchCategoryGroupsChangedListener = null;
    private com.waze.ifs.a.f handlers = new com.waze.ifs.a.f();
    private final ArrayList<hs> mOnUserNameResultArray = new ArrayList<>(4);
    private com.waze.navigate.a.j mOnInCarDeeplinkActionListener = null;
    private com.waze.main_screen.ab.i popupsBridgeCompat = null;
    private boolean mIsShowingCloseSharedDriveDialog = false;
    private Handler search_handler = null;
    private String[] mProblematicGPUNames = null;
    private com.waze.ab.v mProgressBarCommon = null;
    private boolean mAppInitializedFlag = false;
    private boolean isGasUpdateable = false;
    protected boolean shouldDisplayGasSettings = false;
    private boolean mAppCanvasBufReady = true;
    private boolean mIsMenuEnabled = true;
    private int mAppMediaVolume = -1;
    private final h.f<com.waze.shared_infra.r.y> userState = com.waze.web.r.j(com.waze.shared_infra.r.y.class);
    private final h.f<com.waze.map.eq> primaryMapConfig = com.waze.web.r.j(com.waze.map.eq.class);
    private final h.f<com.waze.map.aq> mapMarkerResolverConfig = com.waze.web.r.j(com.waze.map.aq.class);
    int countParkingHandlers = 0;
    private Timer mTimer = new Timer("Waze Timer");

    /* compiled from: WazeSource */
    public class AddressStrings {
        public String[] address;
        public String[] city;
        public int numResults;
        public int numToFilterTo;
        public String[] street;
    }

    /* compiled from: WazeSource */
    public class AdsActiveContext {
        public String event_info;
        public int pin_id;
        public int promo_id;
    }

    /* compiled from: WazeSource */
    public class HOVPermitDescriptor {
        public final String id;
        public final String name;

        public HOVPermitDescriptor(String str, String str2) {
            this.id = str;
            this.name = str2;
        }
    }

    /* compiled from: WazeSource */
    public class LineObject {
        public LineObject(NativeManager nativeManager) {
            Objects.requireNonNull(nativeManager);
        }
    }

    /* compiled from: WazeSource */
    public class VenueCategory {
        public String id;
        public String label;
        public String parent;
    }

    /* compiled from: WazeSource */
    public class VenueFieldPoints {
        public int categories;
        public int city;
        public int description;
        public int hours;
        public int house_number;
        public int images;
        public int location;
        public int name;
        public int phone;
        public int services;
        public int street;
        public int url;
    }

    /* compiled from: WazeSource */
    public class VenueFieldValidators {
        public String city;
        public String description;
        public String house_number;
        public String name;
        public String phone;
        public String street;
        public String url;
    }

    public static /* synthetic */ Void $r8$lambda$UeIEL0xt2GBnHlZvdRMYkSGaaqM(NativeManager nativeManager, int i2, long j2, long j3) {
        nativeManager.lambda$NativeManagerCallback$0(i2, j2, j3);
        return null;
    }

    private NativeManager() {
        WazeNativeLooperDispatcher wazeNativeLooperDispatcher = (WazeNativeLooperDispatcher) com.waze.web.r.h(WazeNativeLooperDispatcher.class);
        this.mWazeNativeLooperDispatcher = wazeNativeLooperDispatcher;
        this.mNativeDispatcher = asCoroutineDispatcher(wazeNativeLooperDispatcher, "native dispatcher");
        this.mWazeNativeLooperDispatcher.post(new ay(this, 8));
    }

    private native boolean AccessToCalendarAllowedNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native void AddPopupNTV(int[] iArr, int[] iArr2);

    private native void AppInitNTV();

    private native void AppStartNTV();

    private native void CallbackNTV(int i2, long j2, long j3);

    private void CloseSharedDriveImpl(String str, boolean z) {
        t.l(new gy(this, str, z, 1, (byte[]) null));
    }

    private native void ClosedProperlyNTV(int i2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void CreateSharedDriveNTV(String str, int i2, int i3, String str2, String str3, String str4, String str5);

    /* JADX INFO: Access modifiers changed from: private */
    public native void EditBoxCallbackNTV(int i2, String str, long j2);

    private native int GetAutoCompleteFeaturesNTV();

    private native boolean GetIsDriveOnLeftSideNTV();

    private native boolean GetIsPushEnableNTV();

    private native String GetNavLinkNTV(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public native String GetTitleNTV(String str);

    private native String GetTripUnitsNTV();

    private native String GetWazeAutoCompleteURLNTV(String str);

    private void InitNativeManager() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        Vector<Runnable> vector = mInitialLooperQueue;
        int size = vector.size();
        for (int i2 = 0; i2 < size; i2++) {
            vector.get(i2).run();
        }
        mInitialLooperQueue.clear();
        ResourcesNativeManager resourcesNativeManager = ResourcesNativeManager.getInstance();
        this.mResManager = resourcesNativeManager;
        resourcesNativeManager.initNativeLayerNTV();
        int i3 = Build.VERSION.SDK_INT;
        String str = Build.DISPLAY + " | " + Build.ID + " | " + Build.PRODUCT;
        String webUserAgent = getWebUserAgent(mg.a());
        WazeApplicationInfo.Builder builderNewBuilder = WazeApplicationInfo.newBuilder();
        builderNewBuilder.setBuildSdkVersion(i3);
        builderNewBuilder.setDeviceName(com.waze.stats.storage.h.a());
        builderNewBuilder.setDeviceModel(com.waze.stats.storage.h.b());
        builderNewBuilder.setDeviceManufacturer(Build.MANUFACTURER);
        builderNewBuilder.setDeviceBrand(Build.BRAND);
        builderNewBuilder.setRomInfo(str);
        builderNewBuilder.setOsVersion(com.waze.stats.storage.h.c());
        builderNewBuilder.setExternalPath(getExternalPath());
        builderNewBuilder.setUserPath(getUserPath());
        builderNewBuilder.setWebUserAgent(webUserAgent);
        builderNewBuilder.setAppType(getAppType());
        builderNewBuilder.setIsTestBuild(true);
        InitializeNativeManager(builderNewBuilder.build());
        SetUpgradeRunNTV(com.waze.resources.i.f35096a);
        this.mTimerManager = new NativeTimerManager(this);
        ((TraceNativeManager) com.waze.web.r.h(TraceNativeManager.class)).initNativeLayerNTV();
        LocationNativeManager.INSTANCE.initialize();
        NativeFontBitmapGenerator.INSTANCE.start();
        NavigateNativeManager.instance().InitNTV();
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).start();
        BootMonitorNativeManager.INSTANCE.initialize();
        com.waze.location.z.a().init();
        startLocation();
        NavigationInfoNativeManager.getInstance().initNativeLayerNTV();
        org.a.d.a.a aVar = com.waze.network.ba.f32115a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i4 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.network.ba.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i5 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.network.ba.class);
        }
        ((com.waze.network.ba) bVarC.a(mVar, null, null)).startNetwork();
        RtAlertsNativeManager.getInstance().initNativeLayerNTV();
        ((InstallNativeManager) com.waze.web.r.h(InstallNativeManager.class)).initNativeLayerNTV();
        PlannedDriveNativeManager.getInstance().initialize();
        this.mSpeechttManager = new le();
        IsSyncValid = true;
        com.waze.sharedui.web.as.a();
        ((MessageBoxNativeManager) com.waze.web.r.h(MessageBoxNativeManager.class)).initNativeLayerNTV();
        ((NotificationInsightsNativeManager) com.waze.web.r.h(NotificationInsightsNativeManager.class)).initNativeLayerNTV();
        ((BottomNotificationNativeManager) com.waze.web.r.h(BottomNotificationNativeManager.class)).initNativeLayerNTV();
        ((AdsNativeManager) com.waze.web.r.h(AdsNativeManager.class)).initNativeLayerNTV();
        ((TrustlessTokenNativeManager) com.waze.web.r.h(TrustlessTokenNativeManager.class)).initNativeLayerNTV();
        AlerterNativeManager.getInstance().init();
        AndroidPlatformCanvasNativeManager.getInstance().initNativeLayerNTV();
        ((BeaconsNativeManager) com.waze.web.r.h(BeaconsNativeManager.class)).initNativeLayerNTV();
        ConfigManager.getInstance().initNativeLayer();
        ConfigNativeManager.getInstance().initNativeLayerNTV();
        ((CrashNativeManager) com.waze.web.r.h(CrashNativeManager.class)).initNativeLayerNTV();
        ExternalPoiNativeManager.INSTANCE.initNativeLayerNTV();
        RealtimeAlertsNativeManager.INSTANCE.initNativeLayerNTV();
        ((FavoritesNativeManager) com.waze.web.r.h(FavoritesNativeManager.class)).initNativeLayerNTV();
        ((GasNativeManager) com.waze.web.r.h(GasNativeManager.class)).initNativeLayerNTV();
        GoogleAssistantNativeManager.getInstance().initNativeLayerNTV();
        InboxNativeManager.getInstance().initNativeLayerNTV();
        MapNativeManager.getInstance().initNativeLayerNTV();
        MessagesNativeManager.getInstance().InitNativeLayerNTV();
        MoodManager.getInstance().InitMoodManagerNTV();
        MyWazeNativeManager.getInstance().initNTV();
        ((NavigationStartPointNativeManager) com.waze.web.r.h(NavigationStartPointNativeManager.class)).initNativeLayerNTV();
        ((NavConnectNativeManager) com.waze.web.r.h(NavConnectNativeManager.class)).initNativeLayerNTV();
        PlacesNativeManager.INSTANCE.initNativeLayerNTV();
        ((PlaceFormatterNativeManager) com.waze.web.r.h(PlaceFormatterNativeManager.class)).initNativeLayerNTV();
        PlannedDriveNativeManager.getInstance();
        RealtimeNativeManager.getInstance().initNativeLayerNTV();
        ResumeDriveNativeManager.getInstance().initNativeLayerNTV();
        SearchNativeManager.getInstance().initNativeLayerNTV();
        ((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).initNativeLayerNTV();
        if (((com.waze.sharedrive.b.a) com.waze.web.r.h(com.waze.sharedrive.b.a.class)).b()) {
            ShareDriveNativeManager.INSTANCE.initNativeLayerNTV();
        } else {
            ((ShareNativeManager) com.waze.web.r.h(ShareNativeManager.class)).initNativeLayerNTV();
        }
        ((StatsReporterNativeManager) com.waze.web.r.h(StatsReporterNativeManager.class)).initNativeLayerNTV();
        ((MetricsReporterNativeManager) com.waze.web.r.h(MetricsReporterNativeManager.class)).initNativeLayerNTV();
        ((AdEventsReporterNativeManager) com.waze.web.r.h(AdEventsReporterNativeManager.class)).initNativeLayerNTV();
        SystemNativeManager systemNativeManager = (SystemNativeManager) com.waze.web.r.h(SystemNativeManager.class);
        systemNativeManager.initNativeLayerNTV();
        systemNativeManager.init();
        WazeNotificationNativeManager.getInstance().initNativeLayerNTV();
        ((WazeReportNativeManager) com.waze.web.r.h(WazeReportNativeManager.class)).initNativeLayerNTV();
        PreferencesConfigNativeManager.getInstance().initNativeLayerNTV();
        ReportFeedbackServiceProvider.getInstance().initNativeLayerNTV();
        nl.a();
        CanvasNativeCallbacksBridge.INSTANCE.initNativeLayerNTV();
        MainCanvasSwapperNativeManager.INSTANCE.initNativeLayerNTV();
        MapColorNativeManager.INSTANCE.nativeInitialize();
        EVNetworksNativeManager.INSTANCE.initNativeLayerNTV();
        WazeAsksNativeManager.getInstance().initNativeLayerNTV();
        CalendarNativeManager.Companion.a().initNativeLayerNTV();
        ((TtsNativeManager) com.waze.web.r.h(TtsNativeManager.class)).initNativeLayer();
        ((SoundConfigNativeManager) com.waze.web.r.h(SoundConfigNativeManager.class)).initialize();
        ((VoicesNativeManager) com.waze.web.r.h(VoicesNativeManager.class)).initNativeLayer();
        SoundNativeManager.getInstance().initNativeLayer();
        ((ParkedHereNativeManager) com.waze.web.r.h(ParkedHereNativeManager.class)).initialize();
        InsightsInfraNativeManager.INSTANCE.initialize();
        ((NewVenuePinNativeManager) com.waze.web.r.h(NewVenuePinNativeManager.class)).initialize();
        ((DeeplinkUpdatesNativeManager) com.waze.web.r.h(DeeplinkUpdatesNativeManager.class)).initialize();
        ((GrpcCallerNativeManager) com.waze.web.r.h(GrpcCallerNativeManager.class)).initNativeLayerNTV();
        ((WazeTtsDownloaderNativeManager) com.waze.web.r.h(WazeTtsDownloaderNativeManager.class)).initNativeLayerNTV();
        ((WazeTtsPlayerNativeManager) com.waze.web.r.h(WazeTtsPlayerNativeManager.class)).initNativeLayerNTV();
        ((WazeTtsStringsProviderNativeManager) com.waze.web.r.h(WazeTtsStringsProviderNativeManager.class)).initNativeLayerNTV();
        ((VoiceAssetsNativeManager) com.waze.web.r.h(VoiceAssetsNativeManager.class)).initNativeLayerNTV();
        this.keyguardManager = (KeyguardManager) mg.a().getSystemService("keyguard");
        com.waze.web.r.h(com.waze.av.a.b.class);
        this.mWazeNativeLooperDispatcher.a();
        this.mAppInitializedFlag = true;
        shouldDisplayGasSettings(new hg(this));
    }

    private native void InitOfflineNativeManagerNTV(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void LogOutNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native void OpenAutoCompletePlaceNTV(String str, String str2, String str3, String str4, boolean z, int i2, String str5, String str6, boolean z2);

    private void OpenFeatureToggles() {
        openSettings("feature_toggles", "MAP");
    }

    public static boolean Post(Runnable runnable) {
        NativeManager nativeManager = mInstance;
        if (nativeManager != null) {
            return nativeManager.PostRunnable(runnable);
        }
        return false;
    }

    public static void PostInitEvent(Runnable runnable) {
        if (isAppStarted()) {
            getNativeManagerLogger().g("The application has been already started - the event will not be called");
        } else {
            mInitialLooperQueue.add(runnable);
        }
    }

    private native void ResetDisplayNTV(int i2);

    private void SendGpsWarningStat(boolean z) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        Location lastLocation = com.waze.location.z.a().getLastLocation();
        org.a.d.a.a aVar = com.waze.ai.d.f14068a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ai.d.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ai.d.class);
        }
        com.waze.ai.d dVar = (com.waze.ai.d) bVarC.a(mVar, null, null);
        if (z) {
            dVar.b(lastLocation);
        } else {
            dVar.a(lastLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void SetPrivacyConsentApprovedNTV();

    private native void SetPushNotificationNTV(String str, boolean z);

    private native void SetUpgradeRunNTV(boolean z);

    private native boolean ShouldShowTypingWhileDrivingWarningNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native void SuggsetUserNameRequestNTV(String str, String str2, String str3);

    public static void UiReadyToShowEncouragement(com.waze.messages.c cVar) {
        com.waze.shared_infra.i.h.a("UiReadyToShowEncouragement - showing pending request");
        t.l(new ay(cVar, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void callCallbackIntNTV(long j2, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void callCallbackNTV(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public void closeProgressPopup() {
        onCloseProgressPopup();
        com.waze.ab.v vVar = this.mProgressBarCommon;
        if (vVar != null) {
            vVar.dismiss();
        }
        this.mProgressBarCommon = null;
    }

    private static com.waze.messages.c convertProtoToQuestionDataForEncouragement(QuestionProto questionProto) {
        com.waze.messages.c cVar = new com.waze.messages.c();
        if (questionProto.hasText()) {
            cVar.f29765a = questionProto.getText();
        }
        if (questionProto.hasQuestionId()) {
            cVar.w = questionProto.getQuestionId();
        }
        if (questionProto.hasSubtitle()) {
            cVar.f29766b = questionProto.getSubtitle();
        }
        if (questionProto.hasImageUrl()) {
            cVar.f29767c = questionProto.getImageUrl();
        }
        if (questionProto.hasKey()) {
            cVar.D = questionProto.getKey();
        }
        cVar.v = questionProto.getButtonOrientation();
        cVar.E = questionProto.getDisplayTimeSec();
        cVar.G = questionProto.getAlwaysShow();
        cVar.H = questionProto.getDismissible();
        QuestionProto.EncTemplate encTemplate = QuestionProto.EncTemplate.UNKNOWN;
        com.waze.native_managers.h hVar = com.waze.native_managers.h.f30691a;
        MessageBoxIconProto messageBoxIconProto = MessageBoxIconProto.bigblue_v_icon;
        int iOrdinal = questionProto.getEncTemplate().ordinal();
        cVar.F = iOrdinal != 2 ? iOrdinal != 3 ? 0 : 2 : 1;
        List<QuestionProto.CallToAction> ctasList = questionProto.getCtasList();
        if (!ctasList.isEmpty()) {
            QuestionProto.CallToAction callToAction = ctasList.get(0);
            if (callToAction.hasText()) {
                cVar.f29768d = callToAction.getText();
            }
            if (callToAction.hasUrl()) {
                cVar.f29771g = callToAction.getUrl();
            }
            if (callToAction.hasId()) {
                cVar.f29774j = callToAction.getId();
            }
            if (callToAction.hasIcon()) {
                cVar.m = callToAction.getIcon();
            }
            cVar.p = callToAction.getBgColor();
            cVar.s = callToAction.getTextColor();
            callToAction.getWidthRatio();
        }
        if (ctasList.size() > 1) {
            QuestionProto.CallToAction callToAction2 = ctasList.get(1);
            if (callToAction2.hasText()) {
                cVar.f29769e = callToAction2.getText();
            }
            if (callToAction2.hasUrl()) {
                cVar.f29772h = callToAction2.getUrl();
            }
            if (callToAction2.hasId()) {
                cVar.f29775k = callToAction2.getId();
            }
            if (callToAction2.hasIcon()) {
                cVar.n = callToAction2.getIcon();
            }
            cVar.q = callToAction2.getBgColor();
            cVar.t = callToAction2.getTextColor();
            callToAction2.getWidthRatio();
        }
        if (ctasList.size() > 2) {
            QuestionProto.CallToAction callToAction3 = ctasList.get(2);
            if (callToAction3.hasText()) {
                cVar.f29770f = callToAction3.getText();
            }
            if (callToAction3.hasUrl()) {
                cVar.f29773i = callToAction3.getUrl();
            }
            if (callToAction3.hasId()) {
                cVar.f29776l = callToAction3.getId();
            }
            if (callToAction3.hasIcon()) {
                cVar.o = callToAction3.getIcon();
            }
            cVar.r = callToAction3.getBgColor();
            cVar.u = callToAction3.getTextColor();
            callToAction3.getWidthRatio();
        }
        List<QuestionProto.Link> linksList = questionProto.getLinksList();
        if (!linksList.isEmpty()) {
            QuestionProto.Link link = linksList.get(0);
            if (link.hasCaption()) {
                cVar.x = link.getCaption();
            }
            if (link.hasUrl()) {
                cVar.z = link.getUrl();
            }
            if (link.hasTitle()) {
                cVar.B = link.getTitle();
            }
        }
        if (linksList.size() > 1) {
            QuestionProto.Link link2 = linksList.get(1);
            if (link2.hasCaption()) {
                cVar.y = link2.getCaption();
            }
            if (link2.hasUrl()) {
                cVar.A = link2.getUrl();
            }
            if (link2.hasTitle()) {
                cVar.C = link2.getTitle();
            }
        }
        return cVar;
    }

    private static synchronized NativeManager createAndSetInstance() {
        NativeManager nativeManager = mInstance;
        if (nativeManager != null) {
            return nativeManager;
        }
        NativeManager nativeManager2 = new NativeManager();
        mInstance = nativeManager2;
        return nativeManager2;
    }

    public static Intent createParkingSearchIntent(Context context) {
        AddressItem currentNavigatingAddressItem = ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getCurrentNavigatingAddressItem();
        com.waze.navigate.eo eoVar = (com.waze.navigate.eo) com.waze.web.r.h(com.waze.navigate.eo.class);
        com.waze.search.t tVar = new com.waze.search.t();
        tVar.d(PARKING_TITLE);
        if (currentNavigatingAddressItem == null || !eoVar.T()) {
            tVar.k();
        } else {
            tVar.f(currentNavigatingAddressItem);
        }
        return tVar.a(context);
    }

    private native void disableCalendarNTV();

    public static int displayDpi() {
        return NativeCanvasRenderer.a();
    }

    private void flushOnAppStartedEvents() {
        synchronized (mAppStartedLock) {
            while (true) {
                ArrayList<Runnable> arrayList = mAppStartedEvents;
                if (arrayList.size() > 0) {
                    arrayList.remove(0).run();
                } else {
                    mAppStartedFlushed = true;
                }
            }
        }
    }

    private native void focusCanvasNTV(int i2);

    private native void focusCanvasUserNTV(int i2);

    private WazeApplicationInfo.AppType getAppType() {
        z zVar = (z) com.waze.web.r.h(z.class);
        return zVar == z.f45553a ? WazeApplicationInfo.AppType.WAZE_MOBILE : zVar == z.f45554b ? WazeApplicationInfo.AppType.WAZE_AUTOMOTIVE : WazeApplicationInfo.AppType.WAZE_MOBILE;
    }

    private native String getCalendarLearnMoreUrlNTV();

    private String getExternalPath() {
        return String.valueOf(t.f(mg.a())).concat("/waze/");
    }

    private String getInstallationUUID() {
        return com.b.b.a.u.d().c().a();
    }

    public static NativeManager getInstance() {
        NativeManager nativeManager = mInstance;
        return nativeManager != null ? nativeManager : createAndSetInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.waze.main_screen.ab.i getPopupsBridgeCompat() {
        if (this.popupsBridgeCompat == null) {
            this.popupsBridgeCompat = ((com.waze.main_screen.ab.h) com.waze.web.r.h(com.waze.main_screen.ab.h.class)).a();
        }
        return this.popupsBridgeCompat;
    }

    private String getSessionUUID() {
        return com.b.b.a.u.d().d();
    }

    private String getUserPath() {
        return String.valueOf(mg.a().getFilesDir().getParent()).concat(DomExceptionUtils.SEPARATOR);
    }

    private native String getUserPathNTV();

    private native int getVenueGetTimeoutNTV();

    public static String getWebUserAgent(Context context) {
        return context.getSharedPreferences(PREFS_DB, 0).getString(PREFS_KEY_WEB_USER_AGENT, "");
    }

    public static void handlePushToken() {
        if (isAppStarted() && getInstance().isLoggedInNTV()) {
            runNativeTask(new go(0));
        } else {
            com.waze.shared_infra.i.h.h("NativeManager: Pushing GCM token: App not started yet or not logged in, wait...");
            runOnUserLoggedIn(new com.google.android.gms.common.api.internal.bc(4));
        }
    }

    private void injectBootDelay() throws InterruptedException {
        int iIntValue = ConfigValues.CONFIG_VALUE_DEBUG_PARAMS_MAX_BOOT_DELAY_MS.b().intValue();
        if (iIntValue == 0) {
            return;
        }
        long jMax = Math.max(500, new Random().nextInt(iIntValue));
        Toast.makeText(mg.a(), String.format("Delaying startup for testing [delayMs=%d]", Long.valueOf(jMax)), 1).show();
        Log.e("NativeManager", "!!! Delaying startup for testing");
        try {
            Thread.sleep(jMax);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        Log.e("NativeManager", "Delay for testing done!");
    }

    public static boolean isAppStarted() {
        return sAppStarted;
    }

    private native String isCategorySearchNTV(String str);

    private boolean isConnectedThroughWifi() {
        NetworkInfo networkInfo = ((ConnectivityManager) mg.a().getSystemService("connectivity")).getNetworkInfo(1);
        return networkInfo != null && networkInfo.isConnected();
    }

    private native boolean isDebugNTV();

    private native boolean isGasPopUpShownNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNavigating() {
        com.waze.navigate.eo eoVar = this.navigationStatusInterface;
        if (eoVar == null) {
            eoVar = (com.waze.navigate.eo) com.waze.web.r.h(com.waze.navigate.eo.class);
            this.navigationStatusInterface = eoVar;
        }
        return eoVar.T();
    }

    private boolean isTestBuild() {
        return true;
    }

    private /* synthetic */ Void lambda$NativeManagerCallback$0(int i2, long j2, long j3) {
        CallbackNTV(i2, j2, j3);
        return null;
    }

    static /* synthetic */ void lambda$OpenMainMenu$0() {
        lm.d().m();
        com.waze.app_nav.w wVarE = com.waze.alerters.a.k.e();
        com.waze.main_screen.u uVar = com.waze.main_screen.u.f27645a;
        wVarE.a(new com.waze.app_nav.m(com.waze.main_screen.u.c().a(), com.waze.app_nav.ah.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ResetDisplay$0(int i2, Runnable runnable) {
        ResetDisplayNTV(i2);
        runMainThreadTask(new bl(ResourcesNativeManager.getInstance().getImageResolutionSuffix(), runnable, 2));
    }

    static /* synthetic */ void lambda$ResetDisplay$1(String str, Runnable runnable) {
        com.waze.resources.a.g(str);
        runnable.run();
    }

    static /* synthetic */ void lambda$UiReadyToShowEncouragement$0(final com.waze.messages.c cVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (!(eVarE instanceof MainActivity) || eVarE.isFinishing()) {
            com.waze.ac.r rVar = (com.waze.ac.r) com.waze.web.r.i(com.waze.ac.r.class);
            if (rVar != null) {
                rVar.e(cVar, uq.IN_CAR_PROJECTED_CONNECTED, new com.waze.ac.k(com.waze.ac.l.f13864a, cVar.f29767c));
                return;
            }
            return;
        }
        com.waze.ac.f fVar = com.waze.ac.r.f13870a;
        com.waze.ac.r rVarA = fVar.a();
        int i2 = cVar.F;
        if (i2 == 2) {
            showAppLaunchDialog(cVar, rVarA);
            return;
        }
        if (i2 == 0) {
            showFullScreenEncouragement(eVarE, cVar, rVarA);
            return;
        }
        if (i2 != 1) {
            com.waze.shared_infra.i.h.c("Encouragement: ShowEncouragement called with unknown template: " + i2);
            return;
        }
        com.waze.shared_infra.i.h.a("Encouragement: Message Box was called");
        fVar.a().d(cVar, new com.waze.ac.k(com.waze.ac.m.f13865a, cVar.f29767c));
        org.a.d.a.a aVar = com.waze.ac.b.e.f13837a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ac.b.e.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i4 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.ac.b.e.class);
        }
        ((com.waze.ac.b.e) bVarC.a(mVar, null, null)).a(cVar.w);
        Bitmap encBitmap = ResourcesNativeManager.getInstance().getEncBitmap(getInstance().getEncImagePath(cVar.f29767c));
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(cVar.f29765a);
        oVar.P(cVar.f29766b);
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.ac.c
            @Override // com.waze.ab.q
            public final void onClick(boolean z) {
                e.a(cVar, z);
            }
        };
        oVar.M(cVar.f29768d);
        oVar.N(cVar.f29769e);
        oVar.D(encBitmap);
        oVar.H(new DialogInterface.OnCancelListener() { // from class: com.waze.ac.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                e.C(j.f13858f, cVar);
            }
        });
        oVar.R(cVar.v != 0);
        oVar.y(cVar.H);
        com.waze.z.a.d.ai.r(oVar, lm.d().c());
    }

    static /* synthetic */ void lambda$UrlHandler$0(ia iaVar, boolean z) {
        if (iaVar != null) {
            iaVar.a(z);
        }
    }

    static /* synthetic */ h.ab lambda$UrlHandler$1(ia iaVar, Boolean bool) {
        iaVar.a(bool.booleanValue());
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCurrentLineForReporting$0(hv hvVar) {
        LineObject lineObject = new LineObject(this);
        getCurrentLineForReportingNTV(lineObject);
        t.l(new bl(hvVar, lineObject, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getETALabel$0(EtaLabelRequest etaLabelRequest) {
        com.waze.design_components.b.d dVarA;
        Drawable drawableE = (!etaLabelRequest.getLabelData().hasImageType() || (dVarA = ci.a(etaLabelRequest.getLabelData().getImageType())) == null) ? null : dVarA.e(mg.a(), com.waze.design_components.b.e.f23314c);
        if (drawableE == null && etaLabelRequest.getLabelData().hasImage()) {
            drawableE = ResourcesNativeManager.getInstance().getSkinDrawable(mg.a().getResources(), etaLabelRequest.getLabelData().getImage());
        }
        com.waze.design_components.e.a aVar = new com.waze.design_components.e.a(etaLabelRequest.getLabelData().getTitle(), etaLabelRequest.getLabelData().hasSubTitle() ? etaLabelRequest.getLabelData().getSubTitle() : null, drawableE, null, etaLabelRequest.getLabelData().getTitleColor(), etaLabelRequest.getLabelData().hasSubtitleColor() ? Integer.valueOf(etaLabelRequest.getLabelData().getSubtitleColor()) : null, etaLabelRequest.getLabelData().getBackgroundColor());
        List<EtaLabelDefinitions.PinAlignment> pinAlignmentsToGenerateList = etaLabelRequest.getPinAlignmentsToGenerateList();
        int dpi = etaLabelRequest.getLabelData().getDpi();
        h.g.b.x.f(aVar, "labelData");
        h.g.b.x.f(pinAlignmentsToGenerateList, "pinAlignmentsToGenerate");
        org.a.d.k.b bVarC = org.a.b.b.d.e().a().c();
        int i2 = h.g.b.ar.f48106a;
        com.waze.map.ap apVar = (com.waze.map.ap) bVarC.a(new h.g.b.m(com.waze.map.ap.class), null, null);
        lx lxVar = mg.f29780a;
        Configuration configuration = new Configuration(lxVar.a().getResources().getConfiguration());
        configuration.densityDpi = dpi;
        Context contextCreateConfigurationContext = lxVar.a().createConfigurationContext(configuration);
        List<EtaLabelDefinitions.PinAlignment> list = pinAlignmentsToGenerateList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(list, 10)), 16));
        for (Object obj : list) {
            com.waze.map.ay ayVar = new com.waze.map.ay(new Size(500, 500), new com.waze.ui.u((EtaLabelDefinitions.PinAlignment) obj, aVar, 8));
            h.g.b.x.c(contextCreateConfigurationContext);
            linkedHashMap.put(obj, apVar.a(contextCreateConfigurationContext, ayVar));
        }
        EtaLabelResponse.Builder builderNewBuilder = EtaLabelResponse.newBuilder();
        builderNewBuilder.setRequestId(etaLabelRequest.getRequestId());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            NativeBitmapWithAlignment.Builder builderNewBuilder2 = NativeBitmapWithAlignment.newBuilder();
            builderNewBuilder2.setAlignment((EtaLabelDefinitions.PinAlignment) entry.getKey());
            builderNewBuilder2.setBitmap((NativeBitmap) entry.getValue());
            builderNewBuilder.addNativeBitmaps(builderNewBuilder2.build());
        }
        onETALabelGenerated(builderNewBuilder.build());
    }

    static /* synthetic */ void lambda$handlePushToken$0() {
        String strA = com.waze.push.o.a(mg.a());
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(mg.a()).areNotificationsEnabled();
        com.waze.shared_infra.i.h.h("NativeManager: Pushing GCM token notification to native code, enabled=" + zAreNotificationsEnabled);
        getInstance().SetPushNotificationNTV(strA, zAreNotificationsEnabled);
    }

    static /* synthetic */ com.waze.app_nav.hub.b.i lambda$openPoi$0(com.waze.shared_infra.o.a aVar, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(aVar.c(R.string.NO_NETWORK_CONNECTION, new Object[0]));
        oVar.P(aVar.c(R.string.SORRY__YOU_HAVE_NO_NETWORK_CONNECTION_RIGHT_NOW__PLEASE_TRY_LATER, new Object[0]));
        oVar.N(aVar.c(R.string.OK, new Object[0]));
        oVar.C(false);
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openSendHome$0(AddressItem addressItem) {
        if (addressItem != null) {
            com.waze.share.aa.e(lm.d().c(), com.waze.share.z.f37756c, addressItem);
        } else {
            OpenHomeWorkSettings();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openSendWork$0(AddressItem addressItem) {
        if (addressItem != null) {
            com.waze.share.aa.e(lm.d().c(), com.waze.share.z.f37756c, addressItem);
        } else {
            OpenHomeWorkSettings();
        }
    }

    static /* synthetic */ void lambda$openSoundQuickSettings$0() {
        if (lm.d().c() != null) {
            lm.d().c();
            h.g.b.x.f(com.waze.settings.hd.f37382a, "<this>");
            com.waze.settings.hd.c("quick_sound_settings", "MAP");
        }
    }

    static /* synthetic */ void lambda$runNativeTask$0(hw hwVar, com.waze.jni.a aVar) {
        Object objA = hwVar.a();
        if (aVar != null) {
            runMainThreadTask(new bl(aVar, objA, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shouldShowTypingWhileDrivingWarning$0(com.waze.view.text.b bVar) {
        t.l(new gl(bVar, ShouldShowTypingWhileDrivingWarningNTV(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTypingWhileDrivingWarningIfNeeded$0() {
        if (ShouldShowTypingWhileDrivingWarningNTV()) {
            com.waze.view.navbar.o.d().g();
        } else {
            com.waze.view.navbar.o.d().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLocation$0() {
        this.mLocationListner.start();
    }

    private native String langGetIntNTV(int i2);

    private native String langGetNTV(String str);

    private void openGasVehiclePopup(boolean z) {
        if (lm.d().c() == null) {
            return;
        }
        t.m(new go(this, 6, (short[]) null), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openProgressPopup(Context context, String str, int i2, boolean z) {
        com.waze.ab.v vVar = new com.waze.ab.v(context, str, i2, z);
        this.mProgressBarCommon = vVar;
        try {
            vVar.show();
        } catch (WindowManager.BadTokenException e2) {
            com.waze.shared_infra.i.h.c("openProgressPopup: exception trying to open progress bar dialog - ".concat(String.valueOf(e2.getMessage())));
        }
    }

    private void openReportMenu(com.waze.reports_v2.c.dj djVar) {
        sendReportMenuCommand(new com.waze.reports_v2.c.dh(djVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void openSettings(String str, String str2) {
        t.l(new bl(str, str2, 9, (byte[]) null));
    }

    public static void postResultOk(hu huVar, boolean z) {
        if (huVar == null) {
            return;
        }
        t.l(new ay(huVar, 14));
    }

    public static boolean registerOnAppStartedEvent(Runnable runnable) {
        boolean z;
        synchronized (mAppStartedLock) {
            mAppStartedEvents.add(runnable);
            z = !mAppStartedFlushed;
        }
        return z;
    }

    private native void registerParkingUpdatesCallbackNTV();

    public static void runMainThreadTask(Runnable runnable) {
        t.l(runnable);
    }

    public static <T> void runNativeTask(hw<T> hwVar, com.waze.jni.a<T> aVar) {
        runNativeTask(new bl(hwVar, aVar, 3));
    }

    public static boolean runOnNativeManagerReady(Runnable runnable) {
        if (!isAppStarted()) {
            return registerOnAppStartedEvent(runnable);
        }
        runnable.run();
        return true;
    }

    public static void runOnUserLoggedIn(Runnable runnable) {
        runOnNativeManagerReady(new ay(runnable, 11));
    }

    private void runTests() {
        test_venueFlagRequestType(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        test_alertTickerTypes();
        test_tooltipTypes();
        ConfigManager.testCounterConfigEnum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void sendAlertRequestNTV(String str, String str2, String str3, int i2, int i3, int i4, int i5, String str4);

    private void sendReportMenuCommand(com.waze.reports_v2.c.di diVar) {
        ((com.waze.reports_v2.c.dk) com.waze.web.r.h(com.waze.reports_v2.c.dk.class)).b(diVar);
    }

    public static void setTestInstance(NativeManager nativeManager) {
        mInstance = nativeManager;
    }

    public static void setWebUserAgent(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_DB, 0);
            String string = sharedPreferences.getString(PREFS_KEY_WEB_USER_AGENT, "");
            if (string == null || !string.equals(str)) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(PREFS_KEY_WEB_USER_AGENT, str);
                editorEdit.apply();
                if (mInstance == null || !isAppStarted()) {
                    return;
                }
                mInstance.updateClientInfo(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean shouldDisplayGasSettingsNTV();

    private static void showAppLaunchDialog(com.waze.messages.c cVar, com.waze.ac.r rVar) {
        com.waze.shared_infra.i.h.a("Encouragement: App Launch Dialog was called");
        ((com.waze.ab.f) com.waze.web.r.h(com.waze.ab.f.class)).e(cVar);
    }

    private static void showFullScreenEncouragement(Activity activity, com.waze.messages.c cVar, com.waze.ac.r rVar) {
        com.waze.shared_infra.i.h.c("Encouragement: app launch dialog wasn't shown, was called with deprecated FULL_SCREEN template");
        rVar.e(cVar, uq.FLAG_TO_PROTO_MISMATCH, new com.waze.ac.k(com.waze.ac.m.f13865a, cVar.f29767c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startShutdownNTV, reason: merged with bridge method [inline-methods] */
    public native void lambda$shutDown$0();

    private native void test_alertTickerTypes();

    private native void test_tooltipTypes();

    private native void test_venueFlagRequestType(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12);

    private native void unregisterParkingUpdatesCallbackNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native void venueCreateNTV(byte[] bArr, String str, String str2, boolean z);

    private native VenueServices venueProviderGetServicesNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native void venueSaveNavNTV(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void venueUpdateNTV(byte[] bArr, byte[] bArr2, String str, String str2);

    public void AuthenticateCompleted(int i2, int i3, ResultStruct resultStruct) {
        t.l(new go(this, 3));
    }

    protected native void BeepClosedNTV(int i2);

    public void ClearNotifications() {
        com.waze.push.o.b();
    }

    public void CloseAlertPopup(int i2) {
        getPopupsBridgeCompat().c(i2);
        t.l(new ay(this, 15, (byte[]) null));
    }

    public void CloseAlertTicker(int i2) {
        t.l(new hf(this, i2, 1, null));
    }

    public void CloseAllAlertTickers() {
        t.l(new go(this, 10, (byte[][]) null));
    }

    protected native void CloseAllPopupsNTV(int i2);

    public void CloseNavigationResult() {
    }

    public void CloseProgressPopup() {
        t.l(new ay(this, 17, (short[]) null));
    }

    public void CloseSharedDrive(String str) {
        CloseSharedDriveImpl(str, false);
    }

    public void CloseUserPopup() {
        t.l(new go(this, 7, (int[]) null));
    }

    public void Config_Set_Closed_Properly(int i2, String str) {
        if (this.mAppInitializedFlag) {
            ClosedProperlyNTV(i2, str);
        }
    }

    protected native void ConnectivityChangedNTV(boolean z);

    public void CreateSharedDrive(String str, int i2, int i3, String str2, String str3, String str4, String str5) {
        hk hkVar = new hk(this, str, i2, i3, str2, str3, str4, str5);
        this.mCreateMeetingRunnable = hkVar;
        Post(hkVar);
    }

    protected native void DeleteAccountNTV();

    public native void ExecuteActionNTV(String str);

    public void ForceCloseSharedDrive(String str) {
        CloseSharedDriveImpl(str, true);
    }

    public String GetKeyData(String str) {
        if (mg.a() != null) {
            return com.waze.be.b.f16231a.a(mg.a()).getString(str, null);
        }
        Log.w("NativeManager", "GetKeyData failed to run because context was null");
        return null;
    }

    public int GetScreenHeight() {
        return t.c().getHeight();
    }

    public int GetScreenRotation() {
        return t.c().getRotation();
    }

    public int GetScreenWidth() {
        return t.c().getWidth();
    }

    public native boolean GetShowScreenIconsNTV();

    protected native boolean GetSocialIsFirstTimeNTV();

    public String GetWazeAutocompleteUrl(String str) {
        return GetWazeAutoCompleteURLNTV(str);
    }

    public void HandlePickUpRequest(String str, boolean z) {
        t.l(new ay(this, str, 12));
    }

    public native boolean HasClosureDataNTV();

    public void HideAlertTickerByMeetingId(String str) {
        t.l(new go(this, 8, (boolean[]) null));
    }

    protected native void InitializeNativeManagerNTV(byte[] bArr);

    public boolean IsAlerterShown() {
        com.waze.alerters.b.b bVar = (com.waze.alerters.b.b) com.waze.web.r.i(com.waze.alerters.b.b.class);
        return (bVar == null || bVar.a().d() == null) ? false : true;
    }

    public boolean IsMenuEnabled() {
        return this.mIsMenuEnabled;
    }

    public boolean IsSDKBound() {
        return BoundService.b(mg.a().getPackageManager()) != null;
    }

    public void LogOutAccount() {
        Post(new ay(this, 18, (int[]) null));
    }

    public void NativeManagerCallback(final int i2, final long j2, final long j3, com.waze.jni.a<Void> aVar) {
        runNativeTask(new hw() { // from class: com.waze.gm
            @Override // com.waze.hw
            public final Object a() {
                NativeManager.$r8$lambda$UeIEL0xt2GBnHlZvdRMYkSGaaqM(this.f24046a, i2, j2, j3);
                return null;
            }
        }, aVar);
    }

    public void OnCreateMeetingFailed(int i2) {
        t.l(new gw(this, com.waze.shared_infra.o.b.a(), i2, 3));
    }

    public void OnHovAdded() {
        t.l(new hn(this, 2));
    }

    public void OpenAccountAndLogin() {
        t.l(new hm(this, 2, (char[]) null));
    }

    public void OpenAddPlace() {
        t.l(new go(this, 17, (char[][][]) null));
    }

    public void OpenAlertSettings() {
        openSettings("settings_main.map_display.on_the_map.reports", "DEEP_LINK");
    }

    public void OpenAlertTicker(int i2, int i3, String str, String str2, String str3) {
        t.l(new go(this, 9, (float[]) null));
    }

    public void OpenCarSettings() {
        openSettings("settings_main.map_display.car_icon", "DEEP_LINK");
    }

    public void OpenClosureFromQuestion() {
        openReportMenu(com.waze.reports_v2.c.dj.f34414f);
    }

    public void OpenCustomPromptsSettings() {
        OpenSettingsSoundActivity();
    }

    public void OpenFriendsDriving(String str) {
        t.l(new hn(this, str, 0));
    }

    public void OpenGasVehicleTypePopup() {
        openGasVehiclePopup(true);
    }

    public void OpenHOVSettings(boolean z) {
        com.waze.navigate.a.j jVar = this.mOnInCarDeeplinkActionListener;
        if (jVar == null || !jVar.b()) {
            t.l(new hm(this, 5, (boolean[]) null));
        } else {
            this.mOnInCarDeeplinkActionListener.a(new com.waze.navigate.a.c(new com.waze.navigate.a.g(new com.waze.settings.b.g(z ? com.waze.settings.b.e.f36837a : com.waze.settings.b.d.f36836a))));
        }
    }

    public void OpenHomeWorkSettings() {
        t.l(new hm(this, 6, (float[]) null));
    }

    public void OpenInviteSignUp(String str) {
        t.l(new hn(this, str, 1, (byte[]) null));
    }

    public void OpenMainActivityProgressPopup(String str, boolean z) {
        t.l(new gy(this, str, z, 2, (char[]) null));
    }

    public void OpenMainMenu() {
        t.l(new go(2));
    }

    public void OpenNavResultPopup(NavResultData navResultData) {
        this.mNavResultData = navResultData;
        onNavResultData(navResultData);
        if (lm.d().c() == null) {
            return;
        }
        t.l(new bl(this, navResultData, 7));
    }

    public void OpenNavigateActivity() {
        com.waze.navigate.a.j jVar = this.mOnInCarDeeplinkActionListener;
        if (jVar != null && jVar.b()) {
            this.mOnInCarDeeplinkActionListener.a(new com.waze.navigate.a.c(com.waze.navigate.a.h.f30942a));
        } else {
            lm.d().m();
            com.waze.a.af.h(com.waze.alerters.a.k.e(), false, "");
        }
    }

    public void OpenOSNotificationSettings() {
        t.l(new hm(this, 3, (short[]) null));
    }

    void OpenParkingSearch() {
        AddressItem currentNavigatingAddressItem = ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getCurrentNavigatingAddressItem();
        com.waze.sharedui.a.e eVarE = lm.d().e();
        com.waze.ui.x.u.j(eVarE, eVarE.getWindow().getDecorView());
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).setSkipConfirmWaypoint(false);
        com.waze.search.t tVarD = new com.waze.search.t().d(PARKING_TITLE);
        if (currentNavigatingAddressItem == null || !isNavigating()) {
            com.waze.shared_infra.o.b.a().c(R.string.PARKING, new Object[0]);
            tVarD.k();
        } else {
            tVarD.f(currentNavigatingAddressItem);
        }
        tVarD.h(eVarE, 5002);
    }

    public void OpenParkingSearchPublic() {
        OpenParkingSearch();
    }

    public void OpenPreview(String str) {
        if (lm.d().e() == null) {
            return;
        }
        this.search_handler = new hy();
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.search_handler);
        venueGet(str, 1, false);
    }

    public void OpenProgressIconPopup(String str, int i2, int i3) {
        closeAndOpenProgressPopup(str, i2);
        if (i3 == 0) {
            return;
        }
        t.m(new ay(this, 16, (char[]) null), i3);
    }

    public void OpenProgressPopup(String str, boolean z) {
        t.l(new gy(this, str, z, 0));
    }

    public void OpenQuickMenuSettings() {
        openSettings("settings_main", "DEEP_LINK");
    }

    public void OpenReportMenu() {
        openReportMenu(com.waze.reports_v2.c.dj.f34409a);
    }

    public void OpenSettingsGeneralActivity() {
        openSettings("settings_main.general", "DEEP_LINK");
    }

    public void OpenSettingsLangActivity() {
        openSettings("settings_main.general.language", "DEEP_LINK");
    }

    public void OpenSettingsMusicActivity() {
        openSettings("settings_main.driving_preferences.music_controls", "DEEP_LINK");
    }

    public void OpenSettingsNotificationActivity() {
        t.l(new hm(this, 4, (int[]) null));
    }

    public void OpenSettingsReminderActivity() {
        openSettings("settings_main.notifications_and_reminders.reminders", "DEEP_LINK");
    }

    public void OpenSettingsSoundActivity() {
        openSettings("settings_main.voice.navigation_guidance.waze_voice", "DEEP_LINK");
    }

    public void OpenSharePopup(FriendUserData friendUserData, int i2, String str, String str2) {
        t.l(new gr(this, friendUserData, i2, str, str2));
    }

    public void OpenSimpleListMenu(String str, String[] strArr, String[] strArr2) {
        com.waze.shared_infra.i.h.a("OpenSimpleListMenu: labels are:");
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            com.waze.shared_infra.i.h.a("OpenSimpleListMenu: " + strArr[i2] + ":" + strArr2[i2]);
        }
        t.l(new ft(this, str, strArr, strArr2, 2));
    }

    public void OpenSoundSettings() {
        openSettings("settings_main.voice", "DEEP_LINK");
    }

    public void OpenSwipePopup(int i2) {
        t.l(new da(this, i2, 1));
    }

    public void OpenTickersPopups(int[] iArr, int[] iArr2) {
        Post(new ft(this, iArr, iArr2, 1));
    }

    public void OpenUserPopup(UserData userData, int i2, int i3) {
        t.l(new gq(this, userData, i2, i3));
    }

    public void OpenVehicleTypePopup() {
        openGasVehiclePopup(false);
    }

    boolean PlatformUrlHandler(String str) {
        String strB;
        com.waze.sharedui.c.c cVarE = com.waze.sharedui.c.c.e(Uri.parse(str));
        if (cVarE != null && (strB = cVarE.b(com.waze.x.c.MIN_VERSION.a())) != null) {
            h.g.b.x.f("5.20.90.901", "currentVersion");
            h.g.b.x.f(strB, "minVersion");
            List listAf = h.n.o.af("5.20.90.901", new String[]{"."}, 0, 6);
            ArrayList arrayList = new ArrayList(h.a.i.q(listAf, 10));
            Iterator it = listAf.iterator();
            while (it.hasNext()) {
                Integer numF = h.n.o.f((String) it.next());
                arrayList.add(Integer.valueOf(numF != null ? numF.intValue() : 0));
            }
            ArrayList arrayList2 = arrayList;
            List listAf2 = h.n.o.af(strB, new String[]{"."}, 0, 6);
            ArrayList arrayList3 = new ArrayList(h.a.i.q(listAf2, 10));
            Iterator it2 = listAf2.iterator();
            while (it2.hasNext()) {
                Integer numF2 = h.n.o.f((String) it2.next());
                arrayList3.add(Integer.valueOf(numF2 != null ? numF2.intValue() : 0));
            }
            ArrayList arrayList4 = arrayList3;
            int iMax = Math.max(arrayList2.size(), arrayList4.size());
            int i2 = 0;
            while (i2 < iMax) {
                int iIntValue = ((Number) ((i2 < 0 || i2 >= arrayList2.size()) ? 0 : arrayList2.get(i2))).intValue();
                int iIntValue2 = ((Number) ((i2 < 0 || i2 >= arrayList4.size()) ? 0 : arrayList4.get(i2))).intValue();
                if (iIntValue >= iIntValue2) {
                    if (iIntValue > iIntValue2) {
                        break;
                    }
                    i2++;
                } else {
                    t.l(new com.google.android.material.internal.o(cVarE, 14));
                    return true;
                }
            }
        }
        return cVarE != null && cVarE.b(com.waze.x.c.POPUP_MESSAGE.a()) == null && com.waze.sharedui.c.b.b(cVarE);
    }

    protected native void PopupShownNTV(int i2, int i3, int i4, int i5);

    public void PostNativeMessage(int i2, com.waze.native_managers.b bVar, int i3) {
        WazeNativeLooperDispatcher wazeNativeLooperDispatcher = this.mWazeNativeLooperDispatcher;
        h.g.b.x.f(bVar, "messageParam");
        Message messageObtain = Message.obtain(wazeNativeLooperDispatcher, com.waze.aj.b.d(com.waze.native_managers.d.f30681c), i2, i3);
        messageObtain.obj = bVar;
        messageObtain.sendToTarget();
    }

    public boolean PostPriorityEvent(Runnable runnable) {
        WazeNativeLooperDispatcher wazeNativeLooperDispatcher = this.mWazeNativeLooperDispatcher;
        h.g.b.x.f(runnable, "runnable");
        return wazeNativeLooperDispatcher.d(runnable, null);
    }

    public void PostPriorityNativeMessage(int i2, com.waze.native_managers.b bVar, int i3) {
        this.mWazeNativeLooperDispatcher.b(i2, bVar, i3);
    }

    public boolean PostRunnable(Runnable runnable) {
        WazeNativeLooperDispatcher wazeNativeLooperDispatcher = this.mWazeNativeLooperDispatcher;
        h.g.b.x.f(runnable, "runnable");
        return WazeNativeLooperDispatcher.f(wazeNativeLooperDispatcher, runnable, null, 6);
    }

    public void PostUIMessage(com.waze.native_managers.d dVar) {
        WazeNativeLooperDispatcher wazeNativeLooperDispatcher = this.mWazeNativeLooperDispatcher;
        h.g.b.x.f(dVar, NotificationCompat.CATEGORY_EVENT);
        Message.obtain(wazeNativeLooperDispatcher, com.waze.aj.b.d(dVar)).sendToTarget();
    }

    public void RefreshFriendsDriving() {
        t.l(new go(this, 4, (byte[]) null));
    }

    public void RegisterActivity() {
        t.l(new go(this, 13, (int[][]) null));
    }

    public void ResetDisplay(int i2, Runnable runnable) {
        com.waze.resources.a.g(null);
        Post(new com.google.android.gms.common.api.internal.z(this, i2, runnable, 2));
    }

    public void RetryCreateMeeting() {
        Runnable runnable = this.mCreateMeetingRunnable;
        if (runnable != null) {
            Post(runnable);
        }
    }

    void RoadClosureArrowSelected(int i2, int i3, int i4) {
        t.l(new he(this, i2, i3, i4));
    }

    public void SaveImageToCache(String str) {
        t.l(new hn(this, str, 5, (char[]) null));
    }

    public void SaveKeyData(String str, String str2) {
        Context contextA = mg.a();
        if (contextA != null) {
            com.waze.be.b.f16231a.a(contextA).edit().putString(str, str2).apply();
        } else {
            Log.w("NativeManager", "SaveKeyData failed to run because context was null.");
        }
    }

    public void SendAction(String str, String str2) {
        t.l(new bl(this, str, str2, 6));
    }

    public void SetBackLightOn(int i2) {
        getNativeManagerLogger().a("BackLight: Always on value: " + i2);
        t.l(new hf(this, i2, 0));
    }

    protected native void SetExternalAppNTV(int i2, String str);

    protected native void SetExternalDisplayNTV(int i2);

    public void SetPrivacyConsentApproved(Runnable runnable) {
        Post(new bl(this, runnable, 10));
    }

    protected native void SetSocialIsFirstTimeNTV(boolean z);

    public boolean ShouldDisplayGasInSettings() {
        return shouldDisplayGasSettingsNTV();
    }

    public void ShowAdsSettings() {
        openSettings("settings_main.general.ad_settings", "DEEP_LINK");
    }

    public void ShowEditBox(int i2, int i3, byte[] bArr, long j2, int i4, int i5) {
        if (lm.d().c() == null) {
            return;
        }
        new bp(this, j2);
        t.l(new go(this, 14, (boolean[][]) null));
    }

    void ShowEncouragement(QuestionProto questionProto) {
        com.waze.shared_infra.i.h.h("ShowEncouragement - requesting encouragement from controller");
        com.waze.ac.b.a aVar = (com.waze.ac.b.a) com.waze.web.r.i(com.waze.ac.b.a.class);
        if (aVar != null) {
            aVar.c(new com.waze.ac.a.a(convertProtoToQuestionDataForEncouragement(questionProto)));
        } else {
            com.waze.shared_infra.i.h.j("EncouragementController null - cannot enqueue request");
        }
    }

    public void ShowLocationPermissionUpdatePopup() {
        ix.o(false);
    }

    public void ShowPrivacyConsentBump() {
        com.waze.b.u uVarA = com.waze.b.u.f16171a.a();
        com.waze.shared_infra.i.h.h("ShowPrivacyConsentBump - requesting consent from controller");
        com.waze.bf.b.a aVar = (com.waze.bf.b.a) com.waze.web.r.i(com.waze.bf.b.a.class);
        if (aVar != null) {
            aVar.c(uVarA);
        } else {
            com.waze.shared_infra.i.h.j("PrivacyConsentController null - cannot enqueue request");
        }
    }

    public void ShowPrivacySettings() {
        openSettings("settings_main.account.privacy", "DEEP_LINK");
    }

    public void ShowSpreadTheWordScreen() {
        openSettings("settings_main.spread_the_word", "DEEP_LINK");
    }

    protected native void SilentLogOutNTV();

    protected native void StopFollowNTV();

    public void SuggestUserNameRequest(String str, String str2, String str3) {
        Post(new cp(this, str, str2, str3, 1));
    }

    public void UpdateShareUser(FriendUserData friendUserData) {
        t.l(new ay(this, friendUserData, 13));
    }

    protected native void UploadProfileImageNTV(String str);

    public void UrlHandler(String str, final ia iaVar) {
        ia iaVar2 = new ia() { // from class: com.waze.gn
            @Override // com.waze.ia
            public final void a(boolean z) {
                NativeManager.lambda$UrlHandler$0(iaVar, z);
            }
        };
        if (str == null) {
            iaVar2.a(false);
            return;
        }
        int i2 = 1;
        if (PlatformUrlHandler(str)) {
            iaVar2.a(true);
        } else {
            handleDeepLink(str, new iv(iaVar2, i2));
        }
    }

    public void UrlHandlerImmediate(String str) {
        if (str == null) {
            return;
        }
        handleDeepLinkImmediate(str);
    }

    public void UserNameSuggestResult(int i2, String str) {
        t.l(new gw(this, i2, str, 1));
    }

    public void VenueAddImageResult(boolean z, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("res", z);
        bundle.putString("path", str);
        bundle.putString(TtmlNode.ATTR_ID, str2);
        bundle.putString("image_url", str3);
        bundle.putString("image_thumbnail_url", str4);
        this.handlers.d(UH_VENUE_ADD_IMAGE_RESULT, bundle);
    }

    public void VenueStatusResponse(int i2, int i3, String str, ResultStruct resultStruct) {
        Bundle bundle = new Bundle();
        ResultStruct.addToBundle(bundle, resultStruct);
        bundle.putInt("res", i2);
        bundle.putInt("points", i3);
        bundle.putString(TtmlNode.ATTR_ID, str);
        this.handlers.d(UH_VENUE_STATUS, bundle);
    }

    public void addParkingUpdates(Handler handler) {
        this.handlers.b(UH_PARKING_CHANGED, handler);
        int i2 = this.countParkingHandlers + 1;
        this.countParkingHandlers = i2;
        if (i2 == 1) {
            registerParkingUpdatesCallbackNTV();
        }
    }

    protected native void auditReportConsentBumpAgreeClickedNTV();

    public void autoCompleteVenueGet(String str, String str2, String str3, String str4, boolean z, int i2, String str5, String str6, boolean z2) {
        Post(new gv(this, str, str2, str3, str4, z, i2, str5, str6, z2));
    }

    public native void bumpRecentShareAppNTV(String str);

    public boolean calendarAccessEnabled(Context context) {
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") == 0 && calendarAuthorized();
    }

    protected native boolean calendarAuthUndeterminedNTV();

    protected native boolean calendarAuthorizedNTV();

    protected native void calendarRequestAccessNTV();

    public void callCallbackInt(long j2, int i2) {
        if (j2 == 0) {
            return;
        }
        Post(new hc(this, j2, i2));
    }

    public void callInternalBrowserCallback(long j2) {
        if (j2 == 0) {
            return;
        }
        Post(new hb(this, j2));
    }

    protected native void cancelMySosAlertNTV();

    public void cancelSdkErrorMessagePopup() {
        this.handlers.d(UH_CANCEL_SDK_ERROR_MESSAGE_POPUP, Bundle.EMPTY);
    }

    public void clearParking() {
        com.waze.ab.a.l.j(mg.a());
    }

    public void closeAndOpenProgressPopup(String str, int i2) {
        t.l(new gw(this, str, i2, 2));
    }

    public void closeDetailsPopup() {
        if (lm.d().c() == null) {
            return;
        }
        t.l(new go(this, 12, (short[][]) null));
    }

    protected native HOVPermitDescriptor[] configGetHOVPermitDescriptorsNTV();

    public native SdkConfiguration configGetSdkConfigurationNTV();

    public void disableCalendar() {
        CalendarChangeReceiver.a(mg.a(), false);
        disableCalendarNTV();
    }

    public void displayGeoConfigProgress() {
        if (Locale.getDefault().getCountry().equalsIgnoreCase("CN")) {
            OpenProgressPopup("????????????????????????");
        } else {
            OpenProgressPopup("Initializing, please wait...");
        }
    }

    protected native void editTextDialogCallbackNTV(String str, long j2, long j3);

    public native void externalPoiClosedNTV(boolean z);

    protected native void fetchAutocompleteVenueNTV(byte[] bArr, CompletableDeferred<com.waze.av.b.n> completableDeferred);

    public void focusCanvas(int i2) {
        focusCanvasNTV(i2);
    }

    public void focusCanvasUser(int i2) {
        focusCanvasUserNTV(i2);
    }

    String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public boolean getAccessToCalendarAllowed() {
        return calendarAccessEnabled() && AccessToCalendarAllowedNTV();
    }

    public native AddressStrings getAddressByLocationNTV(int i2, int i3);

    public native int getAltRoutesPinMinutesThresholdNTV();

    public native float getAltRoutesPinPercentThresholdNTV();

    public int getAutoCompleteFeatures() {
        int i2 = this.mFeatures;
        if (i2 != -1) {
            return i2;
        }
        int iGetAutoCompleteFeaturesNTV = GetAutoCompleteFeaturesNTV();
        this.mFeatures = iGetAutoCompleteFeaturesNTV;
        return iGetAutoCompleteFeaturesNTV;
    }

    public int getBatteryLevel() {
        kk kkVarD = t.d();
        if (kkVarD != null) {
            return kkVarD.a();
        }
        return -1;
    }

    public String getCalendarLearnMoreUrl() {
        return String.format(getCalendarLearnMoreUrlNTV(), getLanguageCode2Letters());
    }

    public boolean getCanvasBufReady() {
        return this.mAppCanvasBufReady;
    }

    byte[] getClientInfoProtobuf() {
        return ((com.waze.network.a.a) com.waze.web.r.h(com.waze.network.a.a.class)).a(true).toByteArray();
    }

    void getCurrencyString(GetCurrencyStringRequest getCurrencyStringRequest) {
        GetCurrencyStringResponse.Builder builderNewBuilder = GetCurrencyStringResponse.newBuilder();
        builderNewBuilder.setRequestId(getCurrencyStringRequest.getRequestId());
        builderNewBuilder.setPrice(com.waze.shared_infra.q.m.d(getCurrencyStringRequest.getPrice().getPrice(), getCurrencyStringRequest.getPrice().getCurrencyCode()));
        onGetCurrencyString(builderNewBuilder.build());
    }

    public void getCurrentLineForReporting(hv hvVar) {
        Post(new com.google.android.libraries.phenotype.client.stable.x(this, hvVar, 5, null));
    }

    public native void getCurrentLineForReportingNTV(LineObject lineObject);

    public native byte[] getDestinationVenueDataNTV();

    void getETALabel(EtaLabelRequest etaLabelRequest) {
        boolean zB = this.mapMarkerResolverConfig.getValue().b();
        boolean zIsWazeMapAsPrimaryEnabled = this.primaryMapConfig.getValue().isWazeMapAsPrimaryEnabled();
        com.google.android.libraries.phenotype.client.stable.x xVar = new com.google.android.libraries.phenotype.client.stable.x(this, etaLabelRequest, 3);
        if (zB || !zIsWazeMapAsPrimaryEnabled) {
            xVar.run();
        } else {
            launchOnCoroutineDispatchersDefault(xVar);
        }
    }

    protected native String getEncImagePathNTV(String str);

    public boolean getGasPopupVisibilty() {
        return isGasPopUpShownNTV();
    }

    public native int getIdOfMyCurrentSosAlertNTV();

    public boolean getInitializedStatus() {
        return this.mAppInitializedFlag;
    }

    public int getIsCharging() {
        kk kkVarD = t.d();
        if (kkVarD == null) {
            return -1;
        }
        return kkVarD.d() ? 1 : 0;
    }

    public boolean getIsDriveOnLeft() {
        return GetIsDriveOnLeftSideNTV();
    }

    public String getLanguageCode() {
        return getLocale().getLanguage();
    }

    public String getLanguageCode2Letters() {
        String language = getLocale().getLanguage();
        return language.equals("iw") ? "he" : language.equals("in") ? TtmlNode.ATTR_ID : language.equals("ji") ? "yi" : language;
    }

    public native byte[] getLastDestinationVenueDataNTV();

    @Override // com.waze.shared_infra.s.b
    public Locale getLocale() {
        Locale locale = Locale.getDefault();
        String languagesLocale = ((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).getLanguagesLocale();
        if (TextUtils.isEmpty(languagesLocale)) {
            return locale;
        }
        String str = "-";
        if (!languagesLocale.contains("-")) {
            str = "_";
            if (!languagesLocale.contains("_")) {
                str = null;
            }
        }
        if (str == null) {
            return new Locale.Builder().setLanguage(languagesLocale).build();
        }
        int iIndexOf = languagesLocale.indexOf(str);
        String strSubstring = languagesLocale.substring(0, iIndexOf);
        return new Locale.Builder().setLanguage(strSubstring).setRegion(languagesLocale.substring(iIndexOf + 1, languagesLocale.length())).build();
    }

    public com.waze.location.o getLocationListner() {
        return this.mLocationListner;
    }

    @Override // com.waze.gj
    public kotlinx.coroutines.ab getNativeDispatcher() {
        return this.mNativeDispatcher;
    }

    public String getNavLink(int i2, int i3) {
        return GetNavLinkNTV(i2, i3);
    }

    public String getParkingId() {
        return com.waze.ab.a.l.k(mg.a()).f25362d;
    }

    public String getPushInstallationUUID() {
        return Settings.Secure.getString(mg.a().getContentResolver(), "android_id");
    }

    public native String getRTServerId();

    public native String[] getRecentShareAppsNTV();

    public native String getRelativeTimeStringNTV(long j2, boolean z);

    public native int getReturnToWazeFromPhoneTimeoutNTV();

    public native String getServerCookie();

    protected native String getServerEnvNTV();

    public native int getServerSessionId();

    public native String getSessionUuid();

    le getSpeechttManager() {
        return this.mSpeechttManager;
    }

    public native int getSubtypeOfMyCurrentSosAlertNTV();

    public int getTemperature() {
        kk kkVarD = t.d();
        if (kkVarD != null) {
            return kkVarD.b();
        }
        return -1;
    }

    public Timer getTimer() {
        return this.mTimer;
    }

    public void getTitle(String str, hr hrVar) {
        Post(new hj(this, str, hrVar));
    }

    public String getTripUnits() {
        return GetTripUnitsNTV();
    }

    public String getUserPathBlocking() {
        return getUserPathNTV();
    }

    public int getVenueGetTimeout() {
        return getVenueGetTimeoutNTV();
    }

    protected native boolean handleDeepLinkImmediateNTV(String str);

    protected native boolean handleDeepLinkNTV(String str);

    public native boolean hasNetworkNTV();

    public native boolean inWalkingModeNTV();

    @Override // com.waze.shared_infra.s.b
    public boolean is24HrClock() {
        return DateFormat.is24HourFormat(mg.a());
    }

    public String isCategorySearch(String str) {
        if (com.google.d.b.an.f(str)) {
            return null;
        }
        return isCategorySearchNTV(str.trim().replaceAll("\\s{2,}", " "));
    }

    protected native boolean isCsvSimulatorActiveNTV();

    public boolean isDebug() {
        return isDebugNTV();
    }

    public boolean isDialogShowingOnMain() {
        MainActivity mainActivityC = lm.d().c();
        return mainActivityC != null && mainActivityC.aJ();
    }

    public native boolean isEnforcementAlertsEnabledNTV();

    public native int isEnforcementPoliceEnabledNTV();

    public native boolean isFollowActiveNTV();

    public boolean isGasUpdateable() {
        return this.isGasUpdateable;
    }

    public boolean isInTransportationMode() {
        return this.mIsInTransportationMode;
    }

    public boolean isLoggedIn() {
        return isAppStarted() && isLoggedInNTV();
    }

    public native boolean isLoggedInNTV();

    boolean isMainActivity() {
        MainActivity mainActivityC = lm.d().c();
        return mainActivityC != null && mainActivityC.aK() && mainActivityC.aL();
    }

    public native boolean isMeetingActiveNTV(String str);

    public native boolean isMovingNTV();

    protected native boolean isNearNTV();

    public boolean isShutdown() {
        return this.isNativeLayerShutdown;
    }

    protected native String loadServerEnvNTV();

    public native void logAnalyticsAdsContextClearNTV();

    public native void logAnalyticsAdsContextNTV(String str);

    public native void logAnalyticsAdsContextNavigationSaveNTV();

    public native void logAnalyticsAdsContextSearchInitNTV(String str, int i2, int i3, int i4, boolean z, String str2, String str3, String str4, String str5);

    public native AdsActiveContext logAnalyticsAdsGetActiveContextNTV();

    public native void logAnalyticsAdsSearchEventNTV(String str, String str2, int i2, int i3, int i4, boolean z, String str3, String str4, String str5, String str6);

    protected native void logAppLaunchAnalyticsNTV(String str, String str2, int i2);

    public void mainMenuShowMyWaze() {
        MyWazeNativeManager.getInstance().launchMyWaze();
    }

    public boolean mainMenuShown() {
        com.waze.app_nav.w wVarE = com.waze.alerters.a.k.e();
        h.g.b.x.f(wVarE, "<this>");
        return (((com.waze.app_nav.v) wVarE.b().d()).a().b() instanceof com.waze.main_screen.t) || (((com.waze.app_nav.v) wVarE.b().d()).a().b() instanceof com.waze.search.f);
    }

    public void mapProblemsReport() {
        openReportMenu(com.waze.reports_v2.c.dj.f34413e);
    }

    public void navResOpenEtaScreen(boolean z, boolean z2) {
        t.l(new ho(this, z, z2));
    }

    public void navResPause() {
    }

    public void navResResume() {
    }

    void navigateFromDeepLink(VenueOrPlace venueOrPlace, boolean z) {
        com.waze.places.f fVarH;
        h.g.b.x.f(venueOrPlace, "<this>");
        if (venueOrPlace.hasFavorite()) {
            Favorite favorite = venueOrPlace.getFavorite();
            h.g.b.x.e(favorite, "getFavorite(...)");
            h.g.b.x.f(favorite, "<this>");
            Place place = favorite.getPlace();
            h.g.b.x.e(place, "getPlace(...)");
            fVarH = com.waze.notifications.c.k.h(place, favorite.getName());
        } else if (venueOrPlace.hasPlace()) {
            Place place2 = venueOrPlace.getPlace();
            h.g.b.x.e(place2, "getPlace(...)");
            fVarH = com.waze.notifications.c.k.h(place2, null);
        } else if (venueOrPlace.hasVenue()) {
            Place placeI = new com.waze.reports.ed(venueOrPlace.getVenue()).i();
            h.g.b.x.e(placeI, "getPlace(...)");
            fVarH = com.waze.notifications.c.k.h(placeI, null);
        } else {
            fVarH = null;
        }
        ((bj) com.waze.web.r.h(bj.class)).b(new bi(com.waze.notifications.c.k.f(fVarH), z));
    }

    public native int navigateMainGetTimesNavigatedNTV();

    protected native void notifyOrientationChangedNTV();

    @Override // com.waze.iz
    protected void offlineInit() {
        JniDaemonThreadNativeManager jniDaemonThreadNativeManager = (JniDaemonThreadNativeManager) com.waze.web.r.h(JniDaemonThreadNativeManager.class);
        if (jniDaemonThreadNativeManager == null) {
            h.g.b.x.h("null cannot be cast to non-null type com.waze.native_managers.JniDaemonThreadNativeManager");
        }
        jniDaemonThreadNativeManager.initNativeLayerNTV();
        InitOfflineNativeManagerNTV(getUserPath(), getExternalPath());
        LogNativeManager.onNativeReady();
        AuthNativeManager.initialize();
    }

    protected native void onAppBackgroundNTV();

    protected native void onAppForegroundNTV();

    void onAutocompleteVenueLoaded(LoadAutoCompleteVenueResponse loadAutoCompleteVenueResponse, Object obj) {
        if (obj instanceof CompletableDeferred) {
            CompletableDeferred completableDeferred = (CompletableDeferred) obj;
            com.waze.av.b.m mVar = null;
            if (loadAutoCompleteVenueResponse != null && loadAutoCompleteVenueResponse.hasPlace()) {
                mVar = new com.waze.av.b.m(com.waze.ab.a.l.h(loadAutoCompleteVenueResponse.getPlace()));
            }
            completableDeferred.a(mVar);
        }
    }

    protected native void onETALabelGeneratedNTV(byte[] bArr);

    protected native void onGetCurrencyStringNTV(byte[] bArr);

    void onLogout(boolean z) {
        com.waze.shared_infra.i.h.j("onLogout: clearing user data, signUpEnabled = " + z);
        ((com.waze.crash.c) com.waze.web.r.h(com.waze.crash.c.class)).k();
        Context contextA = mg.a();
        int i2 = com.waze.shared_infra.r.n.f37979a;
        h.g.b.x.f(contextA, "context");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(contextA);
        Intent intent = new Intent("ACTION_USER_LOGOUT");
        intent.putExtra("ACTION_USER_LOGOUT_PARAMETER_SIGN_UP_ENABLED", z);
        localBroadcastManager.sendBroadcast(intent);
    }

    void onNativeLayerShutDown(boolean z) {
        this.mWazeNativeLooperDispatcher.c();
        this.isNativeLayerShutdown = true;
        if (z) {
            nl.a().i();
        }
        com.waze.ifs.ui.z.a().c();
    }

    public void onParkingUpdate() {
        this.handlers.d(UH_PARKING_CHANGED, null);
    }

    void onProfileReset() {
        com.waze.sharedui.profile.b.a().g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void onProfileUpdated(byte[] bArr) {
        try {
            com.waze.sharedui.profile.b.a().i(((i.b.l.jb) i.b.l.jc.newBuilder().mergeFrom(bArr)).build());
        } catch (Exception unused) {
            com.waze.shared_infra.i.h.j("failed to read profile data");
        }
    }

    public void onReachedDestination() {
        t.l(new hm(this, 0));
    }

    void onSearchCategoryGroupsChanged(VenueCategoryGroups venueCategoryGroups) {
        hz hzVar = this.searchCategoryGroupsChangedListener;
        if (hzVar != null) {
            hzVar.a(venueCategoryGroups);
        }
    }

    public void onShareStateChanged(boolean z) {
        NavigationInfoNativeManager.getInstance().onShareDriveStateChanged(z);
    }

    public void onSkinChanged() {
        t.l(new go(this, 15, (float[][]) null));
    }

    public void onSocialInfoReceived() {
        com.waze.shared_infra.i.h.h("NativeManager:onSocialInfoReceived: notifying");
        this.handlers.d(UH_LOGIN_DONE, null);
        updateCalendarEvents();
        long jA = t.a();
        Long lValueOf = Long.valueOf(jA);
        com.waze.stats.ax axVarA = com.waze.stats.ax.f40550a.a();
        bow bowVarNewBuilder = boy.newBuilder();
        ahd ahdVarNewBuilder = ahe.newBuilder();
        lValueOf.getClass();
        ahdVarNewBuilder.a(jA);
        bowVarNewBuilder.g(ahdVarNewBuilder.build());
        com.waze.sharedui.utils.o.L(axVarA, bowVarNewBuilder.build());
        com.waze.bj.c.f(mg.a());
        com.waze.google_assistant.aa.f24060a.a().q();
        ((com.waze.crash.c) com.waze.web.r.h(com.waze.crash.c.class)).j();
        Context contextA = mg.a();
        int i2 = com.waze.shared_infra.r.n.f37979a;
        h.g.b.x.f(contextA, "context");
        LocalBroadcastManager.getInstance(contextA).sendBroadcast(new Intent("ACTION_USER_LOGIN"));
        com.waze.location.z.a().onLogin();
    }

    void onUserCredentialsChanged() {
        com.waze.shared_infra.i.h.j("onUserCredentialsChanged: notifying listeners");
        Context contextA = mg.a();
        int i2 = com.waze.shared_infra.r.n.f37979a;
        h.g.b.x.f(contextA, "context");
        LocalBroadcastManager.getInstance(contextA).sendBroadcast(new Intent("ACTION_USER_CREDENTIALS_CHANGED"));
    }

    @Override // com.waze.iz
    protected void onlineInit() throws InterruptedException {
        com.waze.perf.c.a(com.waze.perf.b.f33026d);
        InitNativeManager();
        AppInitNTV();
        sAppStarted = true;
        com.waze.perf.c.a(com.waze.perf.b.f33027e);
        flushOnAppStartedEvents();
        com.waze.resources.a.g(ResourcesNativeManager.getInstance().getImageResolutionSuffix());
        injectBootDelay();
        AppStartNTV();
        com.waze.perf.c.a(com.waze.perf.b.f33028f);
        Log.i("NativeManager", "Application has started");
        if (mg.a() != null) {
            ApplicationInfo applicationInfo = mg.a().getApplicationInfo();
            int i2 = applicationInfo.flags & 2;
            applicationInfo.flags = i2;
            if (i2 != 0) {
                runTests();
            }
        }
    }

    public void openAddFav() {
        t.l(new hm(this, 1, (byte[]) null));
    }

    public void openAddHome() {
        t.l(new go(this, 19, (int[][][]) null));
    }

    public void openAddWork() {
        t.l(new go(this, 20, (boolean[][][]) null));
    }

    public void openAudioControlPanelFromDeeplink() {
        t.l(new hn(this, 3, (byte[]) null));
    }

    void openBeepPopup(RtAlertsThumbsUpDataProto rtAlertsThumbsUpDataProto, String str, int i2) {
        if (lm.d().c() != null) {
            return;
        }
        com.waze.shared_infra.i.h.c("Cannot open thumbs up Popup. Main activity is not available");
    }

    public void openCalendarSettings() {
        openSettings("settings_main.notifications_and_reminders.planned_drive", "DEEP_LINK");
    }

    void openExternalBrowser(String str) {
        com.waze.sharedui.web.at.f(mg.a(), str);
    }

    void openFavorites() {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            eVarE.startActivity(new Intent(eVarE, (Class<?>) FavoritesActivity.class));
        }
    }

    void openInternalBrowserFromJni(String str, String str2, long j2) {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            int i2 = InternalWebBrowser.f13552f;
            eVarE.startActivityForResult(cs.a(eVarE, str, str2, true, j2), 0);
        }
    }

    public void openMapDisplaySettings() {
        openSettings("settings_main.map_display", "DEEP_LINK");
    }

    public void openNavList() {
        com.waze.app_nav.w wVarE = com.waze.alerters.a.k.e();
        com.waze.main_screen.u uVar = com.waze.main_screen.u.f27645a;
        wVarE.a(new com.waze.app_nav.m(com.waze.main_screen.u.c().a(), com.waze.app_nav.ah.d()));
    }

    public void openPlaceEdit(String str) {
        if (lm.d().e() == null) {
            return;
        }
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, new hx());
        venueGet(str, 1, false);
    }

    void openPoi(String str) {
        this.mOpenPoiCalled = true;
        int i2 = 0;
        if (com.waze.navigate.location_preview.ba.g(mg.a())) {
            getPopupsBridgeCompat().b(new com.waze.main_screen.ab.d(0, cf.c(str), null));
        } else {
            com.waze.shared_infra.i.h.c("NativeManager: OpenPoi, no network connection");
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("openPoi", new gp(com.waze.shared_infra.o.b.a(), i2)));
        }
    }

    void openProgressIconPopup(String str, MessageBoxIconProto messageBoxIconProto) {
        QuestionProto.EncTemplate encTemplate = QuestionProto.EncTemplate.UNKNOWN;
        com.waze.native_managers.h hVar = com.waze.native_managers.h.f30691a;
        MessageBoxIconProto messageBoxIconProto2 = MessageBoxIconProto.bigblue_v_icon;
        int iOrdinal = messageBoxIconProto.ordinal();
        closeAndOpenProgressPopup(str, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? 0 : R.drawable.sign_up_big_v : R.drawable.networkblue_icon : R.drawable.flag_verified : R.drawable.bigblue_x_icon : R.drawable.bigblue_v_icon);
    }

    public void openSearchGasScreen() {
        t.l(new go(this, 16, (byte[][][]) null));
    }

    public void openSendCurrentLocation() {
        t.l(new go(this, 18, (short[][][]) null));
    }

    public void openSendDrive() {
        t.l(new ay(this, 19, (boolean[]) null));
    }

    public void openSendHome() {
        ((com.waze.favorites.k) com.waze.web.r.h(com.waze.favorites.k.class)).b(new bb(this, 13));
    }

    public void openSendWork() {
        ((com.waze.favorites.k) com.waze.web.r.h(com.waze.favorites.k.class)).c(new bb(this, 12));
    }

    public void openSoundQuickSettings() {
        t.l(new go(1));
    }

    @Override // com.waze.native_managers.i
    public boolean post(com.waze.native_managers.h hVar, Runnable runnable) {
        QuestionProto.EncTemplate encTemplate = QuestionProto.EncTemplate.UNKNOWN;
        com.waze.native_managers.h hVar2 = com.waze.native_managers.h.f30691a;
        MessageBoxIconProto messageBoxIconProto = MessageBoxIconProto.bigblue_v_icon;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            return PostRunnable(runnable);
        }
        if (iOrdinal == 1) {
            return PostPriorityEvent(runnable);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return runOnNativeManagerReady(runnable);
    }

    void preparePoi(String str) {
        this.mOpenPoiCalled = false;
        if (lm.d().c() == null) {
            return;
        }
        getPopupsBridgeCompat().b(new com.waze.main_screen.ab.d(null, cf.c(str), null));
    }

    protected native boolean randomUserMsgNTV();

    public void registerOnInCarDeeplinkActionListener(com.waze.navigate.a.j jVar) {
        if (this.mOnInCarDeeplinkActionListener != jVar) {
            this.mOnInCarDeeplinkActionListener = jVar;
            com.waze.shared_infra.i.h.b("NativeManager", "registerOnInCarDeeplinkActionListener: " + jVar.hashCode());
        }
    }

    public void registerOnUserNameResultListener(hs hsVar) {
        if (this.mOnUserNameResultArray.contains(hsVar)) {
            return;
        }
        this.mOnUserNameResultArray.add(hsVar);
    }

    void reloadPlatformStrings(String str, String str2) {
        com.waze.shared_infra.o.b.a().f(str, new HashSet(Arrays.asList(str2.split(","))));
    }

    public void removeParkingUpdates(Handler handler) {
        this.handlers.c(UH_PARKING_CHANGED, handler);
        int i2 = this.countParkingHandlers - 1;
        this.countParkingHandlers = i2;
        if (i2 == 0) {
            unregisterParkingUpdatesCallbackNTV();
        }
    }

    protected native void reportAlertPopupActionNTV(int i2, String str);

    public boolean reportMenuShown() {
        int i2 = com.waze.reports_v2.presentation.ci.f34949a;
        return com.waze.reports_v2.presentation.ci.a().get();
    }

    public void requestCalendarAccess(long j2, long j3) {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        com.waze.sharedui.utils.i iVar = new com.waze.sharedui.utils.i(j2, j3, true);
        com.waze.sharedui.utils.i iVar2 = new com.waze.sharedui.utils.i(j2, j3, true);
        Intent intent = new Intent(eVarE, (Class<?>) RequestPermissionActivity.class);
        intent.putExtra("needed_permissions", new String[]{"android.permission.READ_CALENDAR"});
        intent.putExtra("on_granted", iVar);
        intent.putExtra("on_rejected", iVar2);
        com.waze.shared_infra.i.h.j("NM: OpenAddrequestCalendarAccessPlace: Requesting permission READ_CALENDAR");
        eVarE.startActivityForResult(intent, CALENDAR_ACCESS_REQUEST_CODE);
    }

    protected native void requestCalendarAccessCallbackNTV(long j2, long j3, boolean z);

    protected native void resetEventsNTV();

    public void resetSearchHandler() {
        this.search_handler = null;
    }

    protected native void restorePoiFocusNTV();

    void saveDestinationAsQuestionData(double d2, double d3, String str, String str2) {
        t.l(new hd(this, d3, d2, str, str2));
    }

    public void sendAlertRequest(String str, String str2, String str3, int i2, int i3, int i4, int i5, com.waze.rtalerts.y yVar) {
        Post(new hp(this, str, str2, str3, i2, i3, i4, i5, yVar));
    }

    public native void sendBeepBackNTV(int i2);

    protected native void sendThumbsDownNTV(int i2);

    protected native void sendThumbsUpNTV(int i2);

    protected native void setAndroidAutoModeNTV(boolean z);

    public void setCalendarEventsDirty(boolean z) {
        com.waze.shared_infra.i.h.a("calendar setting dirty flag to " + z);
        this.mCalendarEventsDirty = z;
    }

    public void setCanvasBufReady(boolean z) {
        this.mAppCanvasBufReady = z;
    }

    public void setEtaCard(String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, int i5, int i6, int i7) {
        NavigationInfoNativeManager.getInstance().setEtaCardData(new br(str, str2, str3, str4, str5, str6));
        t.l(new go(this, 11, (char[][]) null));
    }

    public native void setExcludedCalendarsNTV(String str);

    public void setInTransportationMode(boolean z) {
        this.mIsInTransportationMode = z;
    }

    public void setOnSearchCategoryGroupsChangedListener(hz hzVar) {
        this.searchCategoryGroupsChangedListener = hzVar;
    }

    public void setShowRoutesWhenNavigationStarts(boolean z) {
        this.mShowRoutesWhenNavigationStarts = z;
    }

    public void setUpdateHandler(int i2, Handler handler) {
        this.handlers.b(i2, handler);
    }

    public void shouldDisplayGasSettings(hq hqVar) {
        Post(new hi(this, hqVar));
    }

    public void shouldShowTypingWhileDrivingWarning(com.waze.view.text.b bVar) {
        if (bVar != null) {
            PostRunnable(new com.google.android.libraries.phenotype.client.stable.x(this, bVar, 4));
        }
    }

    protected native void showDebugToolsMenuNTV();

    void showDetailsPopup(int i2, int i3, int i4, MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo) {
        com.waze.map.bj bjVarA = com.waze.gas.a.a(detailsPopupInfo);
        com.waze.map.bq bqVarE = t.e();
        MainActivity mainActivityC = lm.d().c();
        if (bqVarE != null) {
            bqVarE.n(bjVarA, i2, i3, i4);
        } else {
            if (mainActivityC == null || mainActivityC.aK()) {
                return;
            }
            com.waze.shared_infra.i.h.c("Cannot show DetailsPopup. MapView is not available, awaiting MainActivity::onResume and to retry");
            MainActivity.z(new ip(this, i2, i3, i4, detailsPopupInfo, 1));
        }
    }

    public void showNavigationSettings() {
        com.waze.navigate.a.j jVar = this.mOnInCarDeeplinkActionListener;
        if (jVar == null || !jVar.b()) {
            openSettings("settings_main.driving_preferences.navigation", "DEEP_LINK");
        } else {
            this.mOnInCarDeeplinkActionListener.a(new com.waze.navigate.a.c(new com.waze.navigate.a.g(ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED.b().booleanValue() ? com.waze.settings.b.j.f36841a : com.waze.settings.b.k.f36842a)));
        }
    }

    void showNotificationMessage(NotificationMessage notificationMessage) {
        jk jkVar;
        kd kdVar = (kd) com.waze.web.r.h(kd.class);
        h.g.b.x.f(notificationMessage, "<this>");
        String message = notificationMessage.getMessage();
        h.g.b.x.e(message, "getMessage(...)");
        NotificationMessage.Type type = notificationMessage.getType();
        NotificationMessage.Type type2 = NotificationMessage.Type.GPS;
        switch (type.ordinal()) {
            case 0:
                jkVar = jk.f24942a;
                break;
            case 1:
                jkVar = jk.f24943b;
                break;
            case 2:
                jkVar = jk.f24944c;
                break;
            case 3:
                jkVar = jk.f24945d;
                break;
            case 4:
                jkVar = jk.f24946e;
                break;
            case 5:
                jkVar = jk.f24947f;
                break;
            case 6:
                jkVar = jk.f24948g;
                break;
            case 7:
                jkVar = jk.f24949h;
                break;
            case 8:
                jkVar = jk.f24950i;
                break;
            case 9:
                jkVar = jk.f24945d;
                break;
            default:
                throw new h.i();
        }
        kdVar.e(new jl(message, jkVar));
    }

    public void showNotificationMessagePopup(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ARG_MESSAGE, str);
        this.handlers.d(UH_SHOW_NOTIFICATION_MESSAGE, bundle);
    }

    public void showReportAnIssue(String str) {
        t.l(new ay(this, str, 20, null));
    }

    public void showSdkErrorMessagePopup(String str, String str2, String str3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("partner_name", str);
        bundle.putString("error_message", str2);
        bundle.putString("package_name", str3);
        bundle.putBoolean("is_offline", z);
        this.handlers.d(UH_SHOW_SDK_ERROR_MESSAGE_POPUP, bundle);
    }

    public void showSosAlertActive(boolean z, int i2) {
        if (z) {
            openReportMenu(com.waze.reports_v2.c.dj.f34417i);
        } else {
            sendReportMenuCommand(com.waze.reports_v2.c.df.f34405a);
        }
    }

    public void showTooltip(int i2, int i3, long j2, int i4) {
    }

    public void showTypingWhileDrivingWarningIfNeeded() {
        PostRunnable(new com.google.android.material.internal.o(this, 2));
    }

    public void showVenueAddressPreview(AddressItem addressItem) {
        if (addressItem == null) {
            com.waze.shared_infra.i.h.c("NM: showVenueAddressPreview: Received null AddressItem");
            return;
        }
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            new com.waze.navigate.cs(addressItem).b(eVarE, 1);
        }
    }

    public void show_root() {
        t.l(new go(this, 5, (char[]) null));
    }

    @Override // com.waze.lc
    public void shutDown() {
        if (Gateway.shouldPreventShutdown()) {
            return;
        }
        getNativeManagerLogger().e("About to shut down waze");
        runNativeTask(new com.google.android.material.internal.o(this, 3));
    }

    protected native String speedUnitNTV();

    void startAutoDrive() {
        com.waze.location.bg.i((com.waze.location.g) com.waze.web.r.h(com.waze.location.g.class));
    }

    public void startLocation() {
        this.mLocationListner = com.waze.location.z.a();
        Post(new com.google.android.material.internal.o(this, 4));
    }

    public void startNativeOptionActivity(com.waze.sharedui.a.e eVar, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, AddressItem addressItem, String str8) {
        AddressItem addressItem2 = addressItem;
        AddressItem addressItem3 = new AddressItem(Integer.valueOf(i3), Integer.valueOf(i2), str, null, str2, null, null, 99, null, 6, null, str8, "", str4, str5, str6, str7, null, null);
        if (addressItem2 == null) {
            addressItem2 = addressItem3;
        } else if (addressItem2.getCategory() == null) {
            addressItem2.setCategory(99);
        }
        com.waze.navigate.cs csVar = new com.waze.navigate.cs(addressItem2);
        if (eVar != null) {
            csVar.b(eVar, 32778);
        }
    }

    public native void startTripServerNavigationNTV();

    protected native void stopNavigationNTV();

    protected native void stopTripServerNavigationNTV();

    public void unregisterOnUserNameResultListener(hs hsVar) {
        if (this.mOnUserNameResultArray.contains(hsVar)) {
            this.mOnUserNameResultArray.remove(hsVar);
        }
    }

    public void unsetUpdateHandler(int i2, Handler handler) {
        this.handlers.c(i2, handler);
    }

    public boolean unzipFile(String str, String str2) {
        try {
            int i2 = com.waze.shared_infra.c.a.f37800a;
            com.waze.shared_infra.c.a.a(str, str2);
            return true;
        } catch (IOException e2) {
            getNativeManagerLogger().c("unzip exception", e2);
            return false;
        }
    }

    public void updateCalendarEvents() {
        if (this.mCalendarEventsDirty) {
            Post(new hn(this, 4, (char[]) null));
        }
    }

    public native void updateCalendarEventsNTV();

    protected native void updateClientInfoNTV(String str);

    public void updateDetailsPopup(int i2, int i3) {
        if (lm.d().c() == null) {
            return;
        }
        t.l(new gx(this, i2, i3, 1, null));
    }

    public void updateDetailsPopupContent(int i2, String str, String str2) {
        if (lm.d().c() == null) {
            return;
        }
        t.l(new gw(this, i2, str, str2, 0));
    }

    public void updateDetailsPopupInfo(int i2, String str, boolean z) {
        if (lm.d().c() == null) {
            return;
        }
        t.l(new gl(this, str, z, 2));
    }

    public void updateIsGasUpdateable(boolean z) {
        this.isGasUpdateable = z;
        if (z) {
            com.waze.reports.bd.i();
        }
    }

    public void updateUserPopup(int i2, int i3) {
        t.l(new gx(this, i2, i3, 0));
    }

    protected native void venueAddImageNTV(String str);

    public void venueCreate(com.waze.reports.ed edVar, String str, String str2, boolean z) {
        Post(new gz(this, edVar, str, str2, z));
    }

    protected native void venueDeleteImageNTV(String str, String str2);

    protected native void venueFlagImageNTV(String str, String str2, int i2);

    protected native void venueFlagNTV(String str, int i2, String str2, String str3);

    protected native void venueGetNTV(String str, int i2, boolean z);

    public native VenueCategory[] venueProviderGetCategories();

    protected native byte[] venueProviderGetCategoryGroupsNTV();

    public native VenueFieldPoints venueProviderGetFieldPoints();

    public native VenueFieldValidators venueProviderGetFieldValidators();

    @Override // com.waze.ky
    public VenueServices venueProviderGetServices() {
        return venueProviderGetServicesNTV();
    }

    public void venueSaveNav(com.waze.reports.ed edVar) {
        Post(new bl(this, edVar, 8));
    }

    protected native void venueSearchNTV(int i2, int i3);

    public void venueSearchResponse(byte[][] bArr) {
        com.waze.reports.ed[] edVarArr = new com.waze.reports.ed[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            edVarArr[i2] = new com.waze.reports.ed(bArr[i2]);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("venue_data", edVarArr);
        this.handlers.d(UH_SEARCH_VENUES, bundle);
    }

    public void venueUpdate(com.waze.reports.ed edVar, com.waze.reports.ed edVar2, String str, String str2) {
        Post(new ha(this, edVar, edVar2, str, str2));
    }

    public native void wazeUiDetailsPopupClosedNTV();

    public native void wazeUiDetailsPopupNextNTV();

    public boolean shouldDisplayGasSettings() {
        return this.shouldDisplayGasSettings;
    }

    public static void runNativeTask(Runnable runnable) {
        Post(runnable);
    }

    public void OpenProgressPopup(String str) {
        OpenProgressPopup(str, true);
    }

    public static void Post(Runnable runnable, long j2) {
        NativeManager nativeManager = mInstance;
        if (nativeManager != null) {
            nativeManager.PostRunnable(runnable, j2);
        }
    }

    public void PostPriorityEvent(Runnable runnable, Runnable runnable2) {
        this.mWazeNativeLooperDispatcher.d(runnable, runnable2);
    }

    public void OpenMainActivityProgressPopup(String str) {
        OpenMainActivityProgressPopup(str, true);
    }

    public void PostRunnable(Runnable runnable, long j2) {
        this.mWazeNativeLooperDispatcher.e(runnable, null, j2);
    }

    public void PostRunnable(Runnable runnable, Runnable runnable2) {
        WazeNativeLooperDispatcher wazeNativeLooperDispatcher = this.mWazeNativeLooperDispatcher;
        h.g.b.x.f(runnable, "runnable");
        WazeNativeLooperDispatcher.f(wazeNativeLooperDispatcher, runnable, runnable2, 4);
    }

    @Deprecated
    public boolean calendarAccessEnabled() {
        return calendarAccessEnabled(mg.a());
    }

    public void autoCompleteVenueGet(String str, String str2, String str3, String str4, boolean z, int i2, String str5, String str6) {
        autoCompleteVenueGet(str, str2, str3, str4, z, i2, str5, str6, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openProgressPopup(Context context, String str, int i2) {
        openProgressPopup(context, str, i2, true);
    }

    public void UrlHandler(String str) {
        UrlHandler(str, null);
    }
}

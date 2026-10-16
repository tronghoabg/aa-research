package com.waze.gw;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import com.google.android.libraries.assistant.appintegration.shared.AssistantConstants;
import com.waze.gw.PointNoticeRepository;
import com.waze.gw.RoadRulesRepository;
import com.waze.strings.DisplayStrings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class Gateway {
    private static final long GPS_FIX_STALE_MS = 8000;
    private static final int LOOKAHEAD_M = 500;
    private static final int OVER_MARGIN = 0;
    private static final long OVER_REPEAT_MS = 12000;
    private static final long SLOW_DEBOUNCE_MS = 4000;
    private static final int SPEED_DROP_HOLD_MAX_M = 1000;
    private static final long SPEED_DROP_RETRY_MS = 1000;
    private static final int STABLE_UPDATES = 3;
    private static final String TAG = "WazeGW";
    private static final int TYPE_ACCIDENT = 2;
    private static final int TYPE_CAMERA = 10;
    private static final int TYPE_HAZARD = 5;
    private static final int TYPE_PERM_HAZARD = 21;
    private static final int TYPE_POLICE = 1;
    private static final int TYPE_SPEED_DROP = 23;
    private static volatile Context aaCarContext;
    private static volatile Method aaLocationMatcherMethod;
    private static volatile Method aaMatcherStreetMethod;
    private static volatile Method aaNavGetInstanceMethod;
    private static volatile Method aaNavIsNavigatingMethod;
    private static volatile Object aaStreetRenderer;
    private static volatile RawRouteSegments activeRawRoute;
    private static Object audioFocusReq;
    private static volatile boolean avgZoneFromAlerts;
    private static volatile boolean avgZoneFromNavigation;
    private static Context ctx;
    private static volatile long gpsFixElapsed;
    private static int gpsPendingCount;
    private static volatile int gpsStableLevel;
    private static long lastGpsLogMs;
    private static volatile int lastLandscapeAnchorLogKey;
    private static volatile int lastLandscapeViewportLogKey;
    private static volatile long lastWazeLocationElapsed;
    private static Method mGetFromNode;
    private static Method mGetStreet;
    private static Method mGetToNode;
    private static Method mHasStreet;
    private static Method mIntLatitude;
    private static Method mIntLongitude;
    private static Method mMatchedAccuracy;
    private static Method mMatchedPosition;
    private static Method mMatcher;
    private static Method mProviderAccuracy;
    private static Method mProviderPosition;
    private static Method mProviderSteering;
    private static volatile boolean motorcycleArrowAssetsReady;
    private static MediaPlayer mp;
    private static volatile String[] mpDescs;
    private static volatile int[] mpTypes;
    public static volatile View nativeSpeedo;
    private static volatile WeakReference<View> navBarBackgroundRef;
    private static volatile WeakReference<View> navLaneBackgroundRef;
    private static Field navManagerCurrentStreet;
    private static Method navManagerGetInstance;
    private static volatile long navStreetRefreshAt;
    private static volatile WeakReference<View> navThenBackgroundRef;
    private static ImageView parkingSign;
    private static Handler parkingTick;
    private static boolean taskRemovalShutdownStarted;
    private static final Object assetAudioCacheLock = new Object();
    private static volatile String aaRenderedStreet = "";
    private static volatile boolean explicitShutdownRequested = false;
    private static final Object taskRemovalShutdownLock = new Object();
    private static int announcedLimit = -1;
    private static int candidate = -999;
    private static int candidateCount = 0;
    private static boolean wasOver = false;
    private static long lastOverMs = 0;
    private static int lastGpsLogRaw = Integer.MIN_VALUE;
    private static int lastGpsLogCorrected = Integer.MIN_VALUE;
    private static int lastGpsLogOffset = Integer.MIN_VALUE;
    private static int lastGpsLogPct = Integer.MIN_VALUE;
    private static volatile double gpsAccuracyRaw = -1.0d;
    private static volatile double gpsAccuracySmoothed = -1.0d;
    private static volatile String gpsFixSource = "";
    private static int gpsPendingLevel = -1;
    private static final HashSet<String> seenAlert = new HashSet<>();
    private static final HashSet<String> announcedAlert = new HashSet<>();
    private static final HashMap<String, Long> speedDropRetryAt = new HashMap<>();
    private static volatile boolean speedDropNativeConfigured = false;
    private static volatile String heldSpeedDropKey = "";
    private static volatile int heldSpeedDropValue = -1;
    private static volatile int heldSpeedDropMeters = -1;
    private static volatile int heldSpeedDropFromLimit = -1;
    private static volatile long heldSpeedDropAtMs = 0;
    private static volatile String speedDropRouteUuid = "";
    public static volatile int hudSpeed = -1;
    private static volatile AaSpeedSnapshot aaPhoneSpeed = new AaSpeedSnapshot(-1, -1, "", 0);
    private static volatile int lastNotifiedSlowSpeed = -1;
    private static volatile long lastSlowMs = 0;
    public static volatile int hudLimit = -1;
    public static volatile String hudUnits = "";
    public static volatile List<String> hudAlerts = new ArrayList();
    private static volatile List<String> nativeHudAlerts = new ArrayList();
    private static volatile List<String> pointHudAlerts = new ArrayList();
    private static volatile List<String> roadPointHudAlerts = new ArrayList();
    public static volatile int hudTurn = -1;
    public static volatile boolean hudNavigating = false;
    private static volatile int googleMapsDestinationLatE6 = Integer.MIN_VALUE;
    private static volatile int googleMapsDestinationLonE6 = Integer.MIN_VALUE;
    private static volatile WeakReference<ImageButton> googleMapsButton = new WeakReference<>(null);
    public static volatile int hudTurnNext = -1;
    public static volatile int hudExit = -1;
    public static volatile int hudTurnDist = -1;
    public static volatile String hudStreet = "";
    public static volatile String hudCurStreet = "";
    public static volatile LaneSnapshot hudLanes = LaneSnapshot.EMPTY;
    public static volatile long hudRoadSegmentId = -1;
    public static volatile int hudRouteSegmentIdx = -1;
    public static volatile int hudSegmentTileId = -1;
    public static volatile int hudSegmentClientId = -1;
    public static volatile String hudEtaClock = "";
    public static volatile int hudEtaMin = -1;
    public static volatile String hudEtaTimeStr = "";
    public static volatile int hudEtaDistM = -1;
    public static volatile boolean avgZone = false;
    public static volatile int avgLeftM = -1;
    public static volatile int avgRecSpeed = -1;
    public static volatile int avgPercent = -1;
    private static volatile int avgAlertLeftM = -1;
    public static volatile int parkingRestriction = 0;
    public static volatile int minimumSpeedLimit = -1;
    private static final ConcurrentHashMap<Long, Boolean> freewayBySegment = new ConcurrentHashMap<>();
    private static volatile String classifiedStreetName = "";
    private static volatile boolean classifiedStreetIsFreeway = false;
    private static volatile WeakReference<Vignette> mapOverspeedVignette = new WeakReference<>(null);
    private static final Map<Object, AaModReportCategory> AA_MOD_REPORT_CATEGORIES = Collections.synchronizedMap(new IdentityHashMap());
    private static final AaModReportCategory[] AA_MOD_REPORT_SPECS = {new AaModReportCategory("gw_mod:category:speed", "mod_report_wrong_speed", "mod_report_icon_wrong_speed", new AaModReportLeaf[]{aaLeaf("gw_mod:speed:30", "mod_report_speed_30"), aaLeaf("gw_mod:speed:40", "mod_report_speed_40"), aaLeaf("gw_mod:speed:50", "mod_report_speed_50"), aaLeaf("gw_mod:speed:60", "mod_report_speed_60"), aaLeaf("gw_mod:speed:70", "mod_report_speed_70"), aaLeaf("gw_mod:speed:80", "mod_report_speed_80"), aaLeaf("gw_mod:speed:90", "mod_report_speed_90"), aaLeaf("gw_mod:speed:100", "mod_report_speed_100"), aaLeaf("gw_mod:speed:120", "mod_report_speed_120")}), new AaModReportCategory("gw_mod:category:turn", "mod_report_turn", "mod_report_icon_turn", new AaModReportLeaf[]{aaLeaf("gw_mod:turn:left", "mod_report_turn_left"), aaLeaf("gw_mod:turn:right", "mod_report_turn_right"), aaLeaf("gw_mod:turn:u", "mod_report_turn_u"), aaLeaf("gw_mod:turn:left_u", "mod_report_turn_left_u"), aaLeaf("gw_mod:turn:right_u", "mod_report_turn_right_u")}), new AaModReportCategory("gw_mod:category:camera", "mod_report_camera", "mod_report_icon_camera", new AaModReportLeaf[]{aaLeaf("gw_mod:camera:combined", "mod_report_camera_combined"), aaLeaf("gw_mod:camera:speed", "mod_report_camera_speed"), aaLeaf("gw_mod:camera:red_light", "mod_report_camera_red_light")}), new AaModReportCategory("gw_mod:category:no_camera_here", "mod_report_no_camera_here", "mod_report_icon_no_camera_here", new AaModReportLeaf[]{new AaModReportLeaf("gw_mod:no_camera_here", "mod_report_no_camera_here", "mod_report_icon_no_camera_here")}), new AaModReportCategory("gw_mod:category:no_passing", "mod_report_no_passing", "mod_report_icon_no_passing", new AaModReportLeaf[]{new AaModReportLeaf("gw_mod:no_passing", "mod_report_no_passing", "mod_report_icon_no_passing")}), new AaModReportCategory("gw_mod:category:end_no_passing", "mod_report_end_no_passing", "mod_report_icon_end_no_passing", new AaModReportLeaf[]{new AaModReportLeaf("gw_mod:end_no_passing", "mod_report_end_no_passing", "mod_report_icon_end_no_passing")}), new AaModReportCategory("gw_mod:category:end_prohibitions", "mod_report_end_prohibitions", "mod_report_icon_end_prohibitions", new AaModReportLeaf[]{new AaModReportLeaf("gw_mod:end_prohibitions", "mod_report_end_prohibitions", "mod_report_icon_end_prohibitions")}), new AaModReportCategory("gw_mod:category:residential_start", "mod_report_residential_start", "mod_report_icon_residential_area_start", new AaModReportLeaf[]{new AaModReportLeaf("gw_mod:residential_start", "mod_report_residential_start", "mod_report_icon_residential_area_start")}), new AaModReportCategory("gw_mod:category:residential_end", "mod_report_residential_end", "mod_report_icon_residential_area_end", new AaModReportLeaf[]{new AaModReportLeaf("gw_mod:residential_end", "mod_report_residential_end", "mod_report_icon_residential_area_end")})};
    private static long lastFromNode = -1;
    private static long lastToNode = -1;
    private static volatile String legacyAlertKey = "";
    private static volatile String vehType = "";
    private static long vehCheckedMs = -100000;
    private static final LinkedHashMap<String, RawRouteSegments> rawRoutes = new LinkedHashMap<String, RawRouteSegments>(8, 0.75f, true) { // from class: com.waze.gw.Gateway.9
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, RawRouteSegments> entry) {
            return size() > 12;
        }
    };
    private static volatile String activeRawRouteKey = "";
    public static volatile long hudSegmentId = -1;

    public static Object injectPointMapMarkers(Object obj, Object obj2) {
        try {
            return PointNoticeMapBridge.attach(obj, obj2);
        } catch (Throwable th) {
            Log.w(TAG, "Point map marker hook failed", th);
            return obj2;
        }
    }

    static final class AaSpeedSnapshot {
        final long elapsedRealtimeMs;
        final int limit;
        final int speed;
        final String units;

        AaSpeedSnapshot(int i2, int i3, String str, long j2) {
            this.speed = i2;
            this.limit = i3;
            this.units = str == null ? "" : str;
            this.elapsedRealtimeMs = j2;
        }
    }

    static AaSpeedSnapshot aaPhoneSpeedSnapshot() {
        return aaPhoneSpeed;
    }

    private static void publishAaPhoneSpeed(int i2, String str, int i3) {
        aaPhoneSpeed = new AaSpeedSnapshot(i2, i3, str, SystemClock.elapsedRealtime());
    }

    public static final class LaneSnapshot {
        public static final LaneSnapshot EMPTY = new LaneSnapshot(new int[0][], new boolean[0][], "");
        private final int[][] angles;
        private final boolean[][] selected;
        private final String signature;

        private LaneSnapshot(int[][] iArr, boolean[][] zArr, String str) {
            this.angles = iArr;
            this.selected = zArr;
            this.signature = str;
        }

        public int size() {
            return this.angles.length;
        }

        public int angleCount(int i2) {
            if (i2 < 0 || i2 >= this.angles.length) {
                return 0;
            }
            return this.angles[i2].length;
        }

        public int angleAt(int i2, int i3) {
            return this.angles[i2][i3];
        }

        public boolean isSelected(int i2, int i3) {
            return this.selected[i2][i3];
        }

        public String signature() {
            return this.signature;
        }
    }

    private static final class LaneRow {
        final int[] angles;
        final int index;
        final boolean[] selected;

        LaneRow(int i2, int[] iArr, boolean[] zArr) {
            this.index = i2;
            this.angles = iArr;
            this.selected = zArr;
        }
    }

    private static Context ctx() {
        if (ctx == null) {
            try {
                ctx = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable th) {
            }
        }
        return ctx;
    }

    static boolean modEnabled() {
        return true;
    }

    static boolean modEnabled(Context context) {
        return true;
    }

    static boolean trustedBuild() {
        return RuntimeState.a(ctx());
    }

    static boolean trustedBuild(Context context) {
        if (context == null) {
            context = ctx();
        }
        return RuntimeState.a(context);
    }

    public static void onSharedSearchText(String str) {
        try {
            GoogleMapsShareFallback.onSharedText(str);
        } catch (Throwable th) {
            Log.w(TAG, "Unable to prepare shared-map fallback", th);
        }
    }

    public static void onSharedSearchResultsEmpty() {
        try {
            GoogleMapsShareFallback.onSearchResultsEmpty();
        } catch (Throwable th) {
            Log.w(TAG, "Unable to open shared-map fallback", th);
        }
    }

    public static void requestExplicitShutdown() {
        explicitShutdownRequested = true;
        Log.i(TAG, "Explicit Waze shutdown requested; keep-alive bypassed");
        try {
            Context contextCtx = ctx();
            Bubble.hide();
            if (contextCtx != null) {
                contextCtx.stopService(new Intent(contextCtx, (Class<?>) BubbleKeepAliveService.class));
                HudLinkService.stop(contextCtx);
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to stop bubble keep-alive during explicit shutdown", th);
        }
    }

    static boolean isExplicitShutdownRequested() {
        return explicitShutdownRequested;
    }

    public static void onTaskRemoved() {
        requestExplicitShutdown();
        synchronized (taskRemovalShutdownLock) {
            if (taskRemovalShutdownStarted) {
                return;
            }
            taskRemovalShutdownStarted = true;
            final int iMyPid = Process.myPid();
            try {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.waze.gw.Gateway.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.i(Gateway.TAG, "Completing task-removal shutdown; terminating process");
                        Process.killProcess(iMyPid);
                    }
                }, 1000L);
            } catch (Throwable th) {
                Log.w(TAG, "Unable to schedule final task-removal process exit", th);
            }
            try {
                Class<?> cls = Class.forName("com.waze.NativeManager");
                cls.getMethod("shutDown", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            } catch (Throwable th2) {
                Log.e(TAG, "Native shutdown after task removal failed", th2);
                Process.killProcess(iMyPid);
            }
        }
    }

    public static boolean shouldPreventShutdown() {
        try {
            if (explicitShutdownRequested) {
                Log.i(TAG, "Shutdown gate open for explicit user shutdown");
                return false;
            }
            Context contextCtx = ctx();
            boolean z = true;
            boolean z2 = trustedBuild(contextCtx) && pref("bubble", false);
            boolean z3 = contextCtx != null && (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(contextCtx));
            if (!z2 || !z3) {
                z = false;
            }
            Log.w(TAG, "Shutdown gate: prevent=" + z + " enabled=" + z2 + " overlay=" + z3 + " showing=" + Bubble.isShowing());
            return z;
        } catch (Throwable th) {
            Log.w(TAG, "Shutdown gate failed open", th);
            return false;
        }
    }

    private static SharedPreferences prefs() {
        try {
            Context contextCtx = ctx();
            return contextCtx != null ? contextCtx.getSharedPreferences("waze_hud_gw", 0) : null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static void applyNavBarOpacity(View view) {
        if (view == null) {
            return;
        }
        navBarBackgroundRef = new WeakReference<>(view);
        applyConfiguredNavAppearance(view);
    }

    public static void applyNavLaneAppearance(View view) {
        if (view == null) {
            return;
        }
        navLaneBackgroundRef = new WeakReference<>(view);
        applyConfiguredNavAppearance(view);
    }

    public static void applyNavThenAppearance(View view) {
        if (view == null) {
            return;
        }
        navThenBackgroundRef = new WeakReference<>(view);
        applyConfiguredNavAppearance(view);
    }

    private static void applyConfiguredNavAppearance(View view) {
        int i2;
        try {
            SharedPreferences sharedPreferencesPrefs = prefs();
            int i3 = 78;
            if (sharedPreferencesPrefs == null) {
                i2 = 100;
            } else {
                if (sharedPreferencesPrefs.contains("nav_banner_opacity")) {
                    i3 = sharedPreferencesPrefs.getInt("nav_banner_opacity", 78);
                } else if (!sharedPreferencesPrefs.getBoolean("transparent_nav_banner", true)) {
                    i3 = 100;
                }
                i2 = sharedPreferencesPrefs.getInt("nav_banner_size", 100);
            }
            int iMax = Math.max(40, Math.min(100, i3));
            int iMax2 = Math.max(50, Math.min(100, i2));
            Drawable background = view.getBackground();
            if (background != null) {
                background.mutate().setAlpha(Math.round((iMax * 255.0f) / 100.0f));
            }
            float f2 = iMax2 / 100.0f;
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(f2);
            view.setScaleY(f2);
            applyNavigationAmbientColor(view);
            view.invalidate();
        } catch (Throwable th) {
        }
    }

    private static void applyNavigationAmbientColor(View view) {
        View view2;
        if (view == null) {
            return;
        }
        int i2 = 0;
        View view3 = view;
        while (i2 < 4) {
            try {
                if (!(view3.getParent() instanceof View) || (view2 = (View) view3.getParent()) == null) {
                    break;
                }
                i2++;
                view3 = view2;
            } catch (Throwable th) {
                return;
            }
        }
        Context context = view.getContext();
        int identifier = context.getResources().getIdentifier("navBarStreetLine", TtmlNode.ATTR_ID, context.getPackageName());
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier("navBarStreetLine", TtmlNode.ATTR_ID, "com.waze");
        }
        View viewFindViewById = identifier == 0 ? null : view3.findViewById(identifier);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextColor(AmbientTheme.color(context));
        }
    }

    public static void refreshNavBarOpacity() {
        refreshNavBarAppearance();
    }

    public static void refreshNavBarAppearance() {
        WeakReference<View> weakReference = navBarBackgroundRef;
        final View view = weakReference == null ? null : weakReference.get();
        if (view != null) {
            view.post(new Runnable() { // from class: com.waze.gw.Gateway.2
                @Override // java.lang.Runnable
                public void run() {
                    Gateway.applyNavBarOpacity(view);
                }
            });
        }
        WeakReference<View> weakReference2 = navLaneBackgroundRef;
        final View view2 = weakReference2 == null ? null : weakReference2.get();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.waze.gw.Gateway.3
                @Override // java.lang.Runnable
                public void run() {
                    Gateway.applyNavLaneAppearance(view2);
                }
            });
        }
        WeakReference<View> weakReference3 = navThenBackgroundRef;
        final View view3 = weakReference3 != null ? weakReference3.get() : null;
        if (view3 != null) {
            view3.post(new Runnable() { // from class: com.waze.gw.Gateway.4
                @Override // java.lang.Runnable
                public void run() {
                    Gateway.applyNavThenAppearance(view3);
                }
            });
        }
    }

    public static void refreshAmbientTheme() {
        refreshNavBarAppearance();
        refreshNativeSpeedoTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean pref(String str, boolean z) {
        try {
            SharedPreferences sharedPreferencesPrefs = prefs();
            return sharedPreferencesPrefs == null ? z : sharedPreferencesPrefs.getBoolean(str, z);
        } catch (Throwable th) {
            return z;
        }
    }

    private static int prefInt(String str, int i2) {
        try {
            SharedPreferences sharedPreferencesPrefs = prefs();
            return sharedPreferencesPrefs == null ? i2 : sharedPreferencesPrefs.getInt(str, i2);
        } catch (Throwable th) {
            return i2;
        }
    }

    public static void cacheAaStreetRenderer(Object obj, Object obj2) {
        try {
            aaCarContext = obj instanceof Context ? (Context) obj : null;
            aaStreetRenderer = obj2;
            aaRenderedStreet = "";
        } catch (Throwable th) {
            aaCarContext = null;
            aaStreetRenderer = null;
            aaRenderedStreet = "";
        }
    }

    public static int getAaSuggestWidgetMode() {
        try {
            int iPrefInt = prefInt("aa_suggest_widget_mode", 1);
            if (iPrefInt < 0 || iPrefInt > 3) {
                return 1;
            }
            return iPrefInt;
        } catch (Throwable th) {
            return 1;
        }
    }

    public static void onWazeLocationForAA(Object obj) {
        try {
            if (!modEnabled() || !pref("aa_force_current_street", true) || obj == null || isAaNavigating()) {
                return;
            }
            Method method = aaLocationMatcherMethod;
            if (method == null || method.getDeclaringClass() != obj.getClass()) {
                method = obj.getClass().getMethod("g", new Class[0]);
                method.setAccessible(true);
                aaLocationMatcherMethod = method;
            }
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return;
            }
            Method method2 = aaMatcherStreetMethod;
            if (method2 == null || method2.getDeclaringClass() != objInvoke.getClass()) {
                method2 = objInvoke.getClass().getMethod("d", new Class[0]);
                method2.setAccessible(true);
                aaMatcherStreetMethod = method2;
            }
            Object objInvoke2 = method2.invoke(objInvoke, new Object[0]);
            String strTrim = objInvoke2 == null ? "" : objInvoke2.toString().trim();
            if (strTrim.length() != 0 && !strTrim.equals(aaRenderedStreet)) {
                Context context = aaCarContext;
                Object obj2 = aaStreetRenderer;
                if (context != null && obj2 != null) {
                    renderAaCurrentStreet(context, obj2, strTrim);
                }
            }
        } catch (Throwable th) {
            Log.w(TAG, "AA current street update failed", th);
        }
    }

    private static boolean isAaNavigating() throws Exception {
        Method method = aaNavGetInstanceMethod;
        Method method2 = aaNavIsNavigatingMethod;
        if (method == null || method2 == null) {
            Class<?> cls = Class.forName("com.waze.navigate.NavigationInfoNativeManager");
            Method method3 = cls.getMethod("getInstance", new Class[0]);
            Method method4 = cls.getMethod("isNavigating", new Class[0]);
            method3.setAccessible(true);
            method4.setAccessible(true);
            aaNavGetInstanceMethod = method3;
            aaNavIsNavigatingMethod = method4;
            method2 = method4;
            method = method3;
        }
        Object objInvoke = method.invoke(null, new Object[0]);
        return objInvoke == null || Boolean.TRUE.equals(method2.invoke(objInvoke, new Object[0]));
    }

    private static void renderAaCurrentStreet(Context context, Object obj, String str) throws Exception {
        if (Boolean.TRUE.equals(Class.forName("com.waze.gw.AaStreetRendererBridge").getMethod("render", Context.class, Object.class, String.class).invoke(null, context, obj, str))) {
            aaRenderedStreet = str;
        }
    }

    public static Rect centerLandscapeMapViewport(Rect rect, Rect rect2) {
        try {
            Context contextCtx = ctx();
            if (rect != null && rect2 != null && contextCtx != null && pref("center_landscape_map", true) && contextCtx.getResources().getConfiguration().orientation == 2 && !AaSpeedo.isSurfaceActive() && rect.width() > 0 && rect.height() > 0 && rect2.width() > 0 && rect2.height() > 0) {
                Rect rect3 = new Rect(rect2);
                rect3.left = rect.left;
                rect3.right = rect.right;
                if (rect3.top < rect.top) {
                    rect3.top = rect.top;
                }
                if (rect3.bottom > rect.bottom) {
                    rect3.bottom = rect.bottom;
                }
                if (rect3.width() > 0 && rect3.height() > 0) {
                    int i2 = (((((rect.left * 31) + rect.right) * 31) + rect2.left) * 31) + rect2.right;
                    if (lastLandscapeViewportLogKey != i2) {
                        lastLandscapeViewportLogKey = i2;
                        Log.i(TAG, "Landscape map centered: map=" + String.valueOf(rect) + " viewport=" + String.valueOf(rect2) + " -> " + String.valueOf(rect3));
                    }
                    return rect3;
                }
                return rect2;
            }
            return rect2;
        } catch (Throwable th) {
            Log.w(TAG, "Landscape viewport adjustment failed safely", th);
            return rect2;
        }
    }

    public static float raiseLandscapeMapAnchor(float f2) {
        try {
            Context contextCtx = ctx();
            if (contextCtx != null && pref("center_landscape_map", true) && contextCtx.getResources().getConfiguration().orientation == 2 && !AaSpeedo.isSurfaceActive()) {
                float fMin = Math.min(f2, 0.72f);
                int iFloatToIntBits = (Float.floatToIntBits(f2) * 31) + Float.floatToIntBits(fMin);
                if (lastLandscapeAnchorLogKey != iFloatToIntBits) {
                    lastLandscapeAnchorLogKey = iFloatToIntBits;
                    Log.i(TAG, "Landscape map anchor Y: " + f2 + " -> " + fMin);
                }
                return fMin;
            }
            return f2;
        } catch (Throwable th) {
            Log.w(TAG, "Landscape anchor adjustment failed safely", th);
            return f2;
        }
    }

    private static String voiceDir() {
        int iPrefInt = prefInt("voice_preset", 2);
        return iPrefInt == 2 ? "voice_waze/" : iPrefInt == 3 ? "voice_short/" : iPrefInt == 4 ? "voice_thai_ngoc_bich/" : "voice/";
    }

    public static int adjustSpeed(int i2) {
        if (!modEnabled() || i2 < 3) {
            return i2;
        }
        if (prefInt("gps_pct", 0) != 0) {
            return Math.max(0, Math.round((i2 * (r0 + 100)) / 100.0f));
        }
        int iPrefInt = prefInt("gps_offset", 0);
        return iPrefInt != 0 ? Math.max(0, i2 + iPrefInt) : i2;
    }

    public static int adjustLocationSpeedMmPerSecond(int i2) {
        return i2;
    }

    public static int onSpeedoAndAdjust(int i2, String str, int i3, double d2) {
        try {
            lastWazeLocationElapsed = SystemClock.elapsedRealtime();
            int iAdjustSpeed = adjustSpeed(i2);
            logGpsCorrection(i2, iAdjustSpeed);
            publishAaPhoneSpeed(iAdjustSpeed, str, i3);
            onSpeedo(iAdjustSpeed, str, i3, d2);
            return iAdjustSpeed;
        } catch (Throwable th) {
            try {
                publishAaPhoneSpeed(i2, str, i3);
                onSpeedo(i2, str, i3, d2);
            } catch (Throwable th2) {
            }
            return i2;
        }
    }

    public static int onSpeedoAndAdjust(int i2, String str, int i3, int i4) {
        try {
            lastWazeLocationElapsed = SystemClock.elapsedRealtime();
            int iAdjustSpeed = adjustSpeed(i2);
            logGpsCorrection(i2, iAdjustSpeed);
            publishAaPhoneSpeed(iAdjustSpeed, str, i3);
            onSpeedo(iAdjustSpeed, str, i3, i4);
            return iAdjustSpeed;
        } catch (Throwable th) {
            try {
                publishAaPhoneSpeed(i2, str, i3);
                onSpeedo(i2, str, i3, i4);
            } catch (Throwable th2) {
            }
            return i2;
        }
    }

    private static void logGpsCorrection(int i2, int i3) {
        int iPrefInt = prefInt("gps_pct", 0);
        int iPrefInt2 = prefInt("gps_offset", 0);
        if (iPrefInt == 0 && iPrefInt2 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i2 == lastGpsLogRaw && i3 == lastGpsLogCorrected && iPrefInt2 == lastGpsLogOffset && iPrefInt == lastGpsLogPct && jElapsedRealtime - lastGpsLogMs < 15000) {
            return;
        }
        lastGpsLogRaw = i2;
        lastGpsLogCorrected = i3;
        lastGpsLogOffset = iPrefInt2;
        lastGpsLogPct = iPrefInt;
        lastGpsLogMs = jElapsedRealtime;
        Log.i(TAG, "GPS correction raw=" + i2 + " corrected=" + i3 + " offset=" + iPrefInt2 + " pct=" + iPrefInt + " enabled=" + modEnabled());
    }

    static long wazeLocationAgeMs() {
        long j2 = lastWazeLocationElapsed;
        if (j2 <= 0) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - j2);
    }

    static void resetWazeLocationWatchdog() {
        lastWazeLocationElapsed = SystemClock.elapsedRealtime();
    }

    static void onKeepAliveLocation(Location location) {
        int iMax;
        if (location == null || !modEnabled()) {
            return;
        }
        try {
            if (location.hasSpeed()) {
                iMax = Math.max(0, Math.round(location.getSpeed() * 3.6f));
            } else {
                iMax = Math.max(0, hudSpeed);
            }
            int iAdjustSpeed = adjustSpeed(iMax);
            String str = (hudUnits == null || hudUnits.isEmpty()) ? "km/h" : hudUnits;
            publishAaPhoneSpeed(iAdjustSpeed, str, hudLimit);
            onSpeedo(iAdjustSpeed, str, hudLimit);
            publishGpsFix(location.hasAccuracy() ? location.getAccuracy() : -1.0d, "GPS dự phòng");
            Context contextCtx = ctx();
            if (contextCtx != null) {
                int iRound = location.hasBearing() ? Math.round(location.getBearing()) : -1;
                PointNoticeRepository.PositionSnapshot positionSnapshot = new PointNoticeRepository.PositionSnapshot(location.getLatitude(), location.getLongitude(), iAdjustSpeed, iRound, location.hasAccuracy() ? location.getAccuracy() : -1.0d, false, SystemClock.elapsedRealtime());
                TripBlackBox.onPosition(contextCtx, location.getLatitude(), location.getLongitude(), iAdjustSpeed, hudLimit, iRound, location.hasAccuracy() ? location.getAccuracy() : -1.0d, false, hudRoadSegmentId, hudCurStreet);
                PointNoticeRepository.onPosition(contextCtx, positionSnapshot);
                RoadPointNoticeRepository.onPosition(contextCtx, positionSnapshot);
            }
        } catch (Throwable th) {
            Log.w(TAG, "Fallback location update rejected safely", th);
        }
    }

    public static void openModSettings(Context context) {
        if (context == null) {
            try {
                context = ctx();
            } catch (Throwable th) {
                return;
            }
        }
        if (modEnabled(context)) {
            Intent intent = new Intent(context, (Class<?>) ModSettingsActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static int modResourceId(Context context, String str, String str2) {
        if (context == null || str == null || str2 == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0 && !"com.waze".equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str, str2, "com.waze");
        }
        return identifier;
    }

    public static Object patchNativeReportMenuState(Object obj) {
        Object objReflectNoArg;
        Constructor<?> constructor;
        Enum r10;
        String str = "mod_report_speed_";
        if (obj == null || !trustedBuild()) {
            return obj;
        }
        try {
            if ("com.waze.ui.w.b.ba".equals(obj.getClass().getName()) && (objReflectNoArg = reflectNoArg(obj, CmcdData.STREAM_TYPE_LIVE)) != null && "com.waze.ui.w.b.ao".equals(objReflectNoArg.getClass().getName())) {
                Object objReflectNoArg2 = reflectNoArg(objReflectNoArg, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
                if (!(objReflectNoArg2 instanceof List)) {
                    return obj;
                }
                List list = (List) objReflectNoArg2;
                Context contextCtx = ctx();
                if (contextCtx == null) {
                    return obj;
                }
                int iModResourceId = modResourceId(contextCtx, "mod_report_wrong_speed", TypedValues.Custom.S_STRING);
                int iModResourceId2 = modResourceId(contextCtx, "mod_report_turn", TypedValues.Custom.S_STRING);
                int iModResourceId3 = modResourceId(contextCtx, "mod_report_camera", TypedValues.Custom.S_STRING);
                for (Object obj2 : list) {
                    Object objReflectNoArg3 = reflectNoArg(obj2, "g");
                    if ((objReflectNoArg3 instanceof String) && ((String) objReflectNoArg3).startsWith("gw_mod:")) {
                        return obj;
                    }
                    Object objReflectNoArg4 = reflectNoArg(obj2, "b");
                    if (objReflectNoArg4 instanceof Number) {
                        int iIntValue = ((Number) objReflectNoArg4).intValue();
                        if ((iModResourceId != 0 && iIntValue == iModResourceId) || ((iModResourceId2 != 0 && iIntValue == iModResourceId2) || (iModResourceId3 != 0 && iIntValue == iModResourceId3))) {
                            return obj;
                        }
                    }
                }
                ClassLoader classLoader = obj.getClass().getClassLoader();
                Class<?> cls = Class.forName("com.waze.ui.w.b.bj", true, classLoader);
                Enum enumValueOf = Enum.valueOf(cls, "TRAFFIC_DEFAULT");
                Constructor<?> constructor2 = Class.forName("com.waze.ui.w.b.au", true, classLoader).getConstructor(cls, Integer.TYPE, Integer.TYPE, Object.class);
                Class<?> cls2 = Class.forName("com.waze.ui.w.b.bh", true, classLoader);
                Constructor<?> constructor3 = Class.forName("com.waze.ui.w.b.as", true, classLoader).getConstructor(cls2, Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class);
                ArrayList arrayList = new ArrayList(9);
                int[] iArr = {30, 40, 50, 60, 70, 80, 90, 100, 120};
                int i2 = 0;
                for (int i3 = 9; i2 < i3; i3 = 9) {
                    int i4 = iArr[i2];
                    int i5 = i2;
                    ArrayList arrayList2 = arrayList;
                    String str2 = str;
                    Class<?> cls3 = cls2;
                    Object objNativeReportLeaf = nativeReportLeaf(contextCtx, constructor2, enumValueOf, "gw_mod:speed:" + i4, str + i4, str + i4);
                    Enum r29 = enumValueOf;
                    Constructor<?> constructor4 = constructor2;
                    if (objNativeReportLeaf != null) {
                        arrayList2.add(objNativeReportLeaf);
                    }
                    cls2 = cls3;
                    i2 = i5 + 1;
                    enumValueOf = r29;
                    constructor2 = constructor4;
                    arrayList = arrayList2;
                    str = str2;
                }
                Enum r0 = enumValueOf;
                Constructor<?> constructor5 = constructor2;
                Class<?> cls4 = cls2;
                ArrayList arrayList3 = arrayList;
                ArrayList<Object> arrayListNativeReportLeaves = nativeReportLeaves(contextCtx, constructor5, r0, new String[][]{new String[]{"gw_mod:turn:left", "mod_report_turn_left"}, new String[]{"gw_mod:turn:right", "mod_report_turn_right"}, new String[]{"gw_mod:turn:u", "mod_report_turn_u"}, new String[]{"gw_mod:turn:left_u", "mod_report_turn_left_u"}, new String[]{"gw_mod:turn:right_u", "mod_report_turn_right_u"}});
                ArrayList<Object> arrayListNativeReportLeaves2 = nativeReportLeaves(contextCtx, constructor5, r0, new String[][]{new String[]{"gw_mod:camera:combined", "mod_report_camera_combined"}, new String[]{"gw_mod:camera:speed", "mod_report_camera_speed"}, new String[]{"gw_mod:camera:red_light", "mod_report_camera_red_light"}});
                Enum enumValueOf2 = Enum.valueOf(cls4, "HAZARD");
                Enum enumValueOf3 = Enum.valueOf(cls4, "MAP_ISSUE");
                Enum enumValueOf4 = Enum.valueOf(cls4, "POLICE");
                ArrayList arrayList4 = new ArrayList(7);
                Object objNativeReportCategory = nativeReportCategory(contextCtx, constructor3, enumValueOf2, "mod_report_wrong_speed", "mod_report_icon_wrong_speed", arrayList3);
                Object objNativeReportCategory2 = nativeReportCategory(contextCtx, constructor3, enumValueOf3, "mod_report_turn", "mod_report_icon_turn", arrayListNativeReportLeaves);
                Enum r23 = enumValueOf3;
                Object objNativeReportCategory3 = nativeReportCategory(contextCtx, constructor3, enumValueOf4, "mod_report_camera", "mod_report_icon_camera", arrayListNativeReportLeaves2);
                Constructor<?> constructor6 = constructor3;
                if (objNativeReportCategory != null) {
                    arrayList4.add(objNativeReportCategory);
                }
                if (objNativeReportCategory2 != null) {
                    arrayList4.add(objNativeReportCategory2);
                }
                if (objNativeReportCategory3 != null) {
                    arrayList4.add(objNativeReportCategory3);
                }
                String[][] strArr = {new String[]{"gw_mod:no_camera_here", "mod_report_no_camera_here", "mod_report_icon_no_camera_here"}, new String[]{"gw_mod:no_passing", "mod_report_no_passing", "mod_report_icon_no_passing"}, new String[]{"gw_mod:end_no_passing", "mod_report_end_no_passing", "mod_report_icon_end_no_passing"}, new String[]{"gw_mod:end_prohibitions", "mod_report_end_prohibitions", "mod_report_icon_end_prohibitions"}, new String[]{"gw_mod:residential_start", "mod_report_residential_start", "mod_report_icon_residential_area_start"}, new String[]{"gw_mod:residential_end", "mod_report_residential_end", "mod_report_icon_residential_area_end"}};
                int i6 = 0;
                for (int i7 = 6; i6 < i7; i7 = 6) {
                    String[] strArr2 = strArr[i6];
                    Object objNativeReportLeaf2 = nativeReportLeaf(contextCtx, constructor5, r0, strArr2[0], strArr2[1], strArr2[2]);
                    if (objNativeReportLeaf2 == null) {
                        constructor = constructor6;
                        r10 = r23;
                    } else {
                        constructor = constructor6;
                        r10 = r23;
                        Object objNativeReportCategory4 = nativeReportCategory(contextCtx, constructor, r10, strArr2[1], strArr2[2], Collections.singletonList(objNativeReportLeaf2));
                        if (objNativeReportCategory4 != null) {
                            arrayList4.add(objNativeReportCategory4);
                        }
                    }
                    i6++;
                    constructor6 = constructor;
                    r23 = r10;
                }
                if (arrayList4.isEmpty()) {
                    Log.w(TAG, "No Mod report resources resolved for package " + contextCtx.getPackageName());
                } else {
                    Log.i(TAG, "Resolved " + arrayList4.size() + " Mod report entries for package " + contextCtx.getPackageName());
                }
                ArrayList arrayList5 = new ArrayList(list.size() + 7);
                arrayList5.addAll(arrayList4);
                arrayList5.addAll(list);
                if (arrayList5.size() == list.size()) {
                    return obj;
                }
                return Class.forName("com.waze.ui.w.b.ba", true, classLoader).getConstructor(Class.forName("com.waze.ui.x.u", true, classLoader), Class.forName("com.waze.ui.j.h", true, classLoader)).newInstance(Class.forName("com.waze.ui.w.b.ao", true, classLoader).getConstructor(List.class, Boolean.TYPE).newInstance(arrayList5, Boolean.valueOf(Boolean.TRUE.equals(reflectNoArg(objReflectNoArg, "b")))), reflectNoArg(obj, CmcdData.OBJECT_TYPE_MANIFEST));
            }
            return obj;
        } catch (Throwable th) {
            Log.w(TAG, "Unable to extend native report menu", th);
            return obj;
        }
    }

    public static void onNativeReportMenuVisibility(boolean z) {
        try {
            FloatSpeedo.setNativeReportVisible(z);
        } catch (Throwable th) {
        }
    }

    private static final class AaModReportLeaf {
        final String icon;
        final String key;
        final String label;

        AaModReportLeaf(String str, String str2, String str3) {
            this.key = str;
            this.label = str2;
            this.icon = str3;
        }
    }

    private static final class AaModReportCategory {
        final String icon;
        final String id;
        final String label;
        final AaModReportLeaf[] leaves;

        AaModReportCategory(String str, String str2, String str3, AaModReportLeaf[] aaModReportLeafArr) {
            this.id = str;
            this.label = str2;
            this.icon = str3;
            this.leaves = aaModReportLeafArr;
        }
    }

    private static AaModReportLeaf aaLeaf(String str, String str2) {
        return new AaModReportLeaf(str, str2, str2);
    }

    private static AaModReportCategory aaModReportRoot() {
        AaModReportLeaf[] aaModReportLeafArr = new AaModReportLeaf[AA_MOD_REPORT_SPECS.length];
        for (int i2 = 0; i2 < AA_MOD_REPORT_SPECS.length; i2++) {
            AaModReportCategory aaModReportCategory = AA_MOD_REPORT_SPECS[i2];
            aaModReportLeafArr[i2] = new AaModReportLeaf(aaModReportCategory.id, aaModReportCategory.label, aaModReportCategory.icon);
        }
        return new AaModReportCategory("gw_mod:category:root", "literal:Waze Mod", "mod_report_icon_wrong_speed", aaModReportLeafArr);
    }

    public static Object patchAaReportMenuState(Object obj) {
        if (obj == null || !trustedBuild() || !"com.waze.car_lib.r.df".equals(obj.getClass().getName())) {
            return obj;
        }
        try {
            Object objReflectNoArg = reflectNoArg(obj, "d");
            if (!(objReflectNoArg instanceof List)) {
                return obj;
            }
            List list = (List) objReflectNoArg;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object objReflectNoArg2 = reflectNoArg(it.next(), "b");
                if ((objReflectNoArg2 instanceof String) && ((String) objReflectNoArg2).startsWith("gw_mod:")) {
                    return obj;
                }
            }
            Context contextCtx = ctx();
            if (contextCtx == null) {
                return obj;
            }
            ClassLoader classLoader = obj.getClass().getClassLoader();
            ArrayList arrayList = new ArrayList(list.size() + 1);
            AaModReportCategory aaModReportCategoryAaModReportRoot = aaModReportRoot();
            Object objNewAaReportUiItem = newAaReportUiItem(classLoader, contextCtx, aaModReportCategoryAaModReportRoot.id, aaModReportCategoryAaModReportRoot.label, aaModReportCategoryAaModReportRoot.icon);
            if (objNewAaReportUiItem != null) {
                arrayList.add(objNewAaReportUiItem);
            }
            arrayList.addAll(list);
            return copyAaReportState(obj, arrayList, null, null, null);
        } catch (Throwable th) {
            Log.w(TAG, "Unable to extend Android Auto report menu", th);
            return obj;
        }
    }

    public static boolean openAaModReportCategory(Object obj, String str) {
        AaModReportCategory aaModReportCategory;
        if (obj == null || str == null || !trustedBuild() || (aaModReportCategory = aaModReportCategory(str)) == null) {
            return false;
        }
        try {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Class<?> cls = Class.forName("com.waze.reports_v2.b.q", true, classLoader);
            Class<?> cls2 = Class.forName("com.waze.reports_v2.b.at", true, classLoader);
            Class<?> cls3 = Class.forName("com.waze.reports_v2.b.ag", true, classLoader);
            Enum enumValueOf = Enum.valueOf(cls, "TRAFFIC");
            Enum enumValueOf2 = Enum.valueOf(cls2, "TRAFFIC_DEFAULT");
            ArrayList arrayList = new ArrayList(aaModReportCategory.leaves.length);
            for (int i2 = 0; i2 < aaModReportCategory.leaves.length; i2++) {
                arrayList.add(enumValueOf2);
            }
            Object objNewInstance = cls3.getConstructor(cls, List.class).newInstance(enumValueOf, arrayList);
            AA_MOD_REPORT_CATEGORIES.put(objNewInstance, aaModReportCategory);
            obj.getClass().getMethod("c", cls3).invoke(obj, objNewInstance);
            return true;
        } catch (Throwable th) {
            Log.w(TAG, "Unable to open Android Auto Mod report category " + str, th);
            return true;
        }
    }

    public static Object patchAaSubReportState(Object obj, Object obj2) {
        AaModReportCategory aaModReportCategory;
        if (obj == null || obj2 == null || !trustedBuild() || (aaModReportCategory = AA_MOD_REPORT_CATEGORIES.get(obj)) == null) {
            return obj2;
        }
        try {
            Context contextCtx = ctx();
            if (contextCtx == null) {
                return obj2;
            }
            ClassLoader classLoader = obj2.getClass().getClassLoader();
            ArrayList arrayList = new ArrayList(aaModReportCategory.leaves.length);
            for (AaModReportLeaf aaModReportLeaf : aaModReportCategory.leaves) {
                Object objNewAaReportUiItem = newAaReportUiItem(classLoader, contextCtx, aaModReportLeaf.key, aaModReportLeaf.label, aaModReportLeaf.icon);
                if (objNewAaReportUiItem != null) {
                    arrayList.add(objNewAaReportUiItem);
                }
            }
            return copyAaReportState(obj2, arrayList, resourceText(contextCtx, aaModReportCategory.label), Boolean.TRUE, null);
        } catch (Throwable th) {
            Log.w(TAG, "Unable to build Android Auto Mod report submenu", th);
            return obj2;
        }
    }

    public static boolean handleAaModReportLeaf(Object obj, String str) {
        if (str == null || !str.startsWith("gw_mod:")) {
            return false;
        }
        if (str.startsWith("gw_mod:category:")) {
            return openAaModReportCategory(obj, str);
        }
        if (!trustedBuild()) {
            return true;
        }
        try {
        } catch (Throwable th) {
            Log.w(TAG, "Unable to submit Android Auto Mod report " + str, th);
        }
        if (!ModReport.submitNativeItem(str)) {
            Log.w(TAG, "Unknown Android Auto Mod report key " + str);
            return true;
        }
        if (obj != null) {
            obj.getClass().getMethod("H", Object.class).invoke(obj, Class.forName("com.waze.car_lib.f.gj", true, obj.getClass().getClassLoader()).getField(CmcdData.OBJECT_TYPE_AUDIO_ONLY).get(null));
        }
        return true;
    }

    private static AaModReportCategory aaModReportCategory(String str) {
        if ("gw_mod:category:root".equals(str)) {
            return aaModReportRoot();
        }
        for (AaModReportCategory aaModReportCategory : AA_MOD_REPORT_SPECS) {
            if (aaModReportCategory.id.equals(str)) {
                return aaModReportCategory;
            }
        }
        return null;
    }

    private static Object newAaReportUiItem(ClassLoader classLoader, Context context, String str, String str2, String str3) throws Exception {
        int iModResourceId = modResourceId(context, str3, "drawable");
        String strResourceText = resourceText(context, str2);
        if (iModResourceId == 0 || strResourceText.length() == 0) {
            return null;
        }
        return Class.forName("com.waze.car_lib.b.a.b", true, classLoader).getConstructor(String.class, String.class, Integer.TYPE).newInstance(str, strResourceText, Integer.valueOf(iModResourceId));
    }

    private static String resourceText(Context context, String str) {
        if (str != null && str.startsWith("literal:")) {
            return str.substring("literal:".length()).trim();
        }
        int iModResourceId = modResourceId(context, str, TypedValues.Custom.S_STRING);
        if (iModResourceId == 0) {
            return "";
        }
        try {
            return context.getString(iModResourceId);
        } catch (Throwable th) {
            return "";
        }
    }

    private static Object copyAaReportState(Object obj, List<Object> list, String str, Boolean bool, Object obj2) throws Exception {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = Class.forName("com.waze.car_lib.r.df", true, classLoader);
        Class<?> cls2 = Class.forName("com.waze.car_lib.r.cv", true, classLoader);
        Class<?> cls3 = Class.forName("com.waze.alerters.a.k", true, classLoader);
        Class<?> cls4 = Class.forName("com.waze.reports_v2.d", true, classLoader);
        if (str == null) {
            str = String.valueOf(reflectNoArg(obj, "c"));
        }
        return cls.getConstructor(String.class, List.class, Boolean.TYPE, cls2, cls3, cls4).newInstance(str, list, Boolean.valueOf(bool == null ? Boolean.TRUE.equals(reflectNoArg(obj, "e")) : bool.booleanValue()), reflectNoArg(obj, CmcdData.OBJECT_TYPE_AUDIO_ONLY), reflectNoArg(obj, "f"), reflectNoArg(obj, "b"));
    }

    private static Object nativeReportLeaf(Context context, Constructor<?> constructor, Object obj, String str, String str2, String str3) throws Exception {
        int iModResourceId = modResourceId(context, str2, TypedValues.Custom.S_STRING);
        int iModResourceId2 = modResourceId(context, str3, "drawable");
        if (iModResourceId == 0 || iModResourceId2 == 0) {
            return null;
        }
        return constructor.newInstance(obj, Integer.valueOf(iModResourceId2), Integer.valueOf(iModResourceId), str);
    }

    private static ArrayList<Object> nativeReportLeaves(Context context, Constructor<?> constructor, Object obj, String[][] strArr) throws Exception {
        ArrayList<Object> arrayList = new ArrayList<>(strArr.length);
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String[] strArr2 = strArr[i2];
            Context context2 = context;
            Constructor<?> constructor2 = constructor;
            Object obj2 = obj;
            Object objNativeReportLeaf = nativeReportLeaf(context2, constructor2, obj2, strArr2[0], strArr2[1], strArr2[1]);
            if (objNativeReportLeaf != null) {
                arrayList.add(objNativeReportLeaf);
            }
            i2++;
            context = context2;
            constructor = constructor2;
            obj = obj2;
        }
        return arrayList;
    }

    private static Object nativeReportCategory(Context context, Constructor<?> constructor, Object obj, String str, String str2, List<Object> list) throws Exception {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int iModResourceId = modResourceId(context, str, TypedValues.Custom.S_STRING);
        int iModResourceId2 = modResourceId(context, str2, "drawable");
        if (iModResourceId == 0 || iModResourceId2 == 0) {
            return null;
        }
        Object objNewInstance = constructor.newInstance(obj, Integer.valueOf(iModResourceId2), Integer.valueOf(iModResourceId), Integer.valueOf(iModResourceId), list);
        Field declaredField = objNewInstance.getClass().getSuperclass().getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        declaredField.setAccessible(true);
        declaredField.set(objNewInstance, "gw_mod:category:" + str);
        return objNewInstance;
    }

    public static boolean handleNativeReportMenuAction(Object obj, Object obj2) {
        if (obj == null || obj2 == null || !trustedBuild()) {
            return false;
        }
        try {
            String name = obj2.getClass().getName();
            if ("com.waze.ui.w.b.c".equals(name)) {
                String strSelectedNativeModReportKey = selectedNativeModReportKey(obj);
                if (strSelectedNativeModReportKey == null) {
                    return false;
                }
                return closeAndSubmitNativeModReport(obj, strSelectedNativeModReportKey);
            }
            if (!"com.waze.ui.w.b.h".equals(name)) {
                return false;
            }
            Object objReflectNoArg = reflectNoArg(obj2, "u");
            if (isNativeModReportCategory(objReflectNoArg)) {
                return openNativeModReportSubmenu(obj, objReflectNoArg);
            }
            Object objReflectNoArg2 = reflectNoArg(objReflectNoArg, "g");
            if (!(objReflectNoArg2 instanceof String)) {
                return false;
            }
            String str = (String) objReflectNoArg2;
            if (!str.startsWith("gw_mod:")) {
                return false;
            }
            Object objCurrentNativeReportMenu = currentNativeReportMenu(obj);
            if (objCurrentNativeReportMenu != null && "com.waze.ui.w.b.ap".equals(objCurrentNativeReportMenu.getClass().getName())) {
                return false;
            }
            return closeAndSubmitNativeModReport(obj, str);
        } catch (Throwable th) {
            Log.w(TAG, "Unable to handle Mod report item", th);
            return false;
        }
    }

    private static Object nativeReportViewModel(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("u", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    private static Object currentNativeReportMenu(Object obj) {
        return reflectNoArg(reflectNoArg(reflectNoArg(nativeReportViewModel(obj), TtmlNode.TAG_P), "d"), CmcdData.STREAM_TYPE_LIVE);
    }

    private static String selectedNativeModReportKey(Object obj) {
        Object objCurrentNativeReportMenu = currentNativeReportMenu(obj);
        if (objCurrentNativeReportMenu == null || !"com.waze.ui.w.b.ap".equals(objCurrentNativeReportMenu.getClass().getName())) {
            return null;
        }
        Object objReflectNoArg = reflectNoArg(reflectNoArg(objCurrentNativeReportMenu, "e"), "g");
        if (!(objReflectNoArg instanceof String)) {
            return null;
        }
        String str = (String) objReflectNoArg;
        if (str.startsWith("gw_mod:")) {
            return str;
        }
        return null;
    }

    private static boolean closeAndSubmitNativeModReport(Object obj, final String str) {
        Object objReflectNoArg = reflectNoArg(obj, "requireActivity");
        if (!(objReflectNoArg instanceof Activity)) {
            objReflectNoArg = reflectNoArg(obj, "getActivity");
        }
        if (!(objReflectNoArg instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) objReflectNoArg;
        try {
            obj.getClass().getMethod(CmcdData.OBJECT_TYPE_MANIFEST, new Class[0]).invoke(obj, new Object[0]);
        } catch (Throwable th) {
            activity.onBackPressed();
        }
        activity.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.waze.gw.Gateway.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!ModReport.submitNativeItem(str)) {
                        Log.w(Gateway.TAG, "Unknown Mod report key " + str);
                    }
                } catch (Throwable th2) {
                }
            }
        }, 80L);
        return true;
    }

    private static boolean isNativeModReportCategory(Object obj) {
        if (obj == null || !"com.waze.ui.w.b.as".equals(obj.getClass().getName())) {
            return false;
        }
        Object objReflectNoArg = reflectNoArg(obj, "g");
        return (objReflectNoArg instanceof String) && ((String) objReflectNoArg).startsWith("gw_mod:category:");
    }

    private static boolean openNativeModReportSubmenu(Object obj, Object obj2) {
        Object objNativeReportViewModel;
        long millis;
        Method method;
        Method method2;
        try {
            Object objReflectNoArg = reflectNoArg(obj2, "e");
            Object objReflectNoArg2 = reflectNoArg(obj2, "d");
            Object objReflectNoArg3 = reflectNoArg(obj2, "c");
            if ((objReflectNoArg instanceof List) && objReflectNoArg2 != null && (objReflectNoArg3 instanceof Number)) {
                List list = (List) objReflectNoArg;
                if (list.isEmpty() || (objNativeReportViewModel = nativeReportViewModel(obj)) == null) {
                    return true;
                }
                ClassLoader classLoader = objNativeReportViewModel.getClass().getClassLoader();
                try {
                    millis = TimeUnit.SECONDS.toMillis(((Number) Class.forName("com.waze.reports_v2.presentation.db", true, classLoader).getMethod("c", new Class[0]).invoke(null, new Object[0])).intValue());
                } catch (Throwable th) {
                    millis = 10000;
                }
                Object objNewInstance = Class.forName("com.waze.ui.w.b.ap", true, classLoader).getConstructor(Integer.TYPE, Class.forName("com.waze.ui.w.b.bh", true, classLoader), List.class, Long.TYPE, Long.TYPE, Class.forName("com.waze.ui.w.b.au", true, classLoader)).newInstance(Integer.valueOf(((Number) objReflectNoArg3).intValue()), objReflectNoArg2, list, Long.valueOf(System.currentTimeMillis()), Long.valueOf(millis), list.get(0));
                Object objReflectNoArg4 = reflectNoArg(reflectNoArg(reflectNoArg(objNativeReportViewModel, TtmlNode.TAG_P), "d"), CmcdData.OBJECT_TYPE_MANIFEST);
                if (objReflectNoArg4 != null) {
                    method = null;
                } else {
                    method = null;
                    objReflectNoArg4 = Class.forName("com.waze.ui.w.b.ax", true, classLoader).getField(CmcdData.OBJECT_TYPE_AUDIO_ONLY).get(null);
                }
                Object objNewInstance2 = Class.forName("com.waze.ui.w.b.ba", true, classLoader).getConstructor(Class.forName("com.waze.ui.x.u", true, classLoader), Class.forName("com.waze.ui.j.h", true, classLoader)).newInstance(objNewInstance, objReflectNoArg4);
                Field declaredField = objNativeReportViewModel.getClass().getDeclaredField("r");
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(objNativeReportViewModel);
                Method[] methods = obj3.getClass().getMethods();
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method2 = method;
                        break;
                    }
                    Method method3 = methods[i2];
                    if (!"e".equals(method3.getName()) || method3.getParameterTypes().length != 1) {
                        i2++;
                    } else {
                        method2 = method3;
                        break;
                    }
                }
                if (method2 == null) {
                    throw new NoSuchMethodException("MutableStateFlow.e(Object)");
                }
                method2.invoke(obj3, objNewInstance2);
                return true;
            }
            return true;
        } catch (Throwable th2) {
            Log.w(TAG, "Unable to open native Mod report submenu", th2);
            return true;
        }
    }

    private static Object reflectNoArg(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            Method method = obj.getClass().getMethod(str, new Class[0]);
            method.setAccessible(true);
            return method.invoke(obj, new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    public static void finishPcmGain(ByteBuffer byteBuffer, int i2, int i3) {
    }

    public static void onSpeedo(int i2, String str, int i3, double d2) {
        publishGpsFix(d2, "Waze");
        onSpeedo(i2, str, i3);
    }

    private static synchronized void publishGpsFix(double d2, String str) {
        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
                gpsFixElapsed = SystemClock.elapsedRealtime();
                if (str == null) {
                    str = "";
                }
                gpsFixSource = str;
                gpsAccuracyRaw = d2;
                if (gpsAccuracySmoothed > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    d2 = (d2 * 0.28d) + (gpsAccuracySmoothed * 0.72d);
                }
                gpsAccuracySmoothed = d2;
                int iGpsLevelForAccuracy = gpsLevelForAccuracy(gpsAccuracySmoothed);
                if (iGpsLevelForAccuracy >= gpsStableLevel) {
                    gpsStableLevel = iGpsLevelForAccuracy;
                    gpsPendingLevel = -1;
                    gpsPendingCount = 0;
                } else if (gpsPendingLevel == iGpsLevelForAccuracy) {
                    int i2 = gpsPendingCount + 1;
                    gpsPendingCount = i2;
                    if (i2 >= 2) {
                        gpsStableLevel = iGpsLevelForAccuracy;
                        gpsPendingLevel = -1;
                        gpsPendingCount = 0;
                    }
                } else {
                    gpsPendingLevel = iGpsLevelForAccuracy;
                    gpsPendingCount = 1;
                }
            }
        }
    }

    private static int gpsLevelForAccuracy(double d2) {
        if (d2 <= 5.0d) {
            return 4;
        }
        if (d2 <= 10.0d) {
            return 3;
        }
        if (d2 <= 20.0d) {
            return 2;
        }
        return d2 <= 50.0d ? 1 : 0;
    }

    public static int gpsSignalLevel() {
        if (gpsFixAgeMs() > GPS_FIX_STALE_MS) {
            return 0;
        }
        return gpsStableLevel;
    }

    public static int gpsInstantSignalLevel() {
        if (gpsFixAgeMs() > GPS_FIX_STALE_MS) {
            return 0;
        }
        double d2 = gpsAccuracyRaw;
        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return gpsLevelForAccuracy(d2);
        }
        return 0;
    }

    public static double gpsAccuracyMeters() {
        if (gpsFixAgeMs() > GPS_FIX_STALE_MS) {
            return -1.0d;
        }
        return gpsAccuracyRaw;
    }

    public static double gpsSmoothedAccuracyMeters() {
        if (gpsFixAgeMs() > GPS_FIX_STALE_MS) {
            return -1.0d;
        }
        return gpsAccuracySmoothed;
    }

    public static long gpsFixAgeMs() {
        long j2 = gpsFixElapsed;
        if (j2 <= 0) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - j2);
    }

    public static String gpsFixSource() {
        return gpsFixSource;
    }

    public static void onSpeedo(int i2, String str, int i3) {
        int iResolve;
        if (modEnabled()) {
            try {
                configureSpeedDropNativeOnce();
                RoadNoticeClient.start(ctx());
                PointNoticeClient.start(ctx());
                HudLink.ensureStarted(ctx());
                Updater.ensureChecked();
                hudSpeed = i2;
                onSlowSpeed();
                if (str == null) {
                    str = "";
                }
                hudUnits = str;
                hudLimit = i3;
                updateMapOverspeedEffect(i2, i3);
                long j2 = hudRoadSegmentId;
                if (pref("minimum_speed", false) && isMetricSpeedUnits(hudUnits)) {
                    iResolve = MinimumSpeedPolicy.resolve(i3, j2, isCurrentRoadFreeway(j2));
                } else {
                    iResolve = -1;
                }
                if (iResolve != minimumSpeedLimit) {
                    minimumSpeedLimit = iResolve;
                    Log.i(TAG, "minimum limit -> " + iResolve + " (maximum=" + i3 + ", segment=" + j2 + ")");
                }
                if (i3 != announcedLimit) {
                    if (i3 == candidate) {
                        int i4 = candidateCount + 1;
                        candidateCount = i4;
                        if (i4 >= 3) {
                            announcedLimit = i3;
                            candidate = -999;
                            candidateCount = 0;
                            Log.i(TAG, "limit stable -> " + i3);
                            if (i3 >= 10 && i3 <= 120 && pref("say_limit", true) && voiceSpeedEnabled("say_limit_speed_", i3)) {
                                if (!playCustomOrAsset("current_" + i3, voiceDir() + "current_speed_" + i3 + ".mp3")) {
                                    WazeTtsBridge.speak("Tốc độ giới hạn hiện tại " + i3 + " ki lô mét trên giờ");
                                }
                            }
                        }
                    } else {
                        candidate = i3;
                        candidateCount = 1;
                    }
                } else {
                    candidate = -999;
                    candidateCount = 0;
                }
                int i5 = announcedLimit;
                if (i5 >= 10 && i2 > prefInt("over_margin", 0) + i5) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = prefInt("over_repeat_mode", 1) == 1;
                    if (!wasOver || (z && jElapsedRealtime - lastOverMs > OVER_REPEAT_MS)) {
                        boolean zPref = pref("say_over", true);
                        if (!zPref || playOverspeedAlert()) {
                            wasOver = true;
                            lastOverMs = jElapsedRealtime;
                            Log.i(TAG, "overspeed warning " + (zPref ? "started" : "disabled") + " speed=" + i2 + " limit=" + i5 + " androidAuto=" + isAndroidAutoActive());
                            return;
                        }
                        Log.w(TAG, "overspeed warning deferred; audio output not ready speed=" + i2 + " limit=" + i5 + " androidAuto=" + isAndroidAutoActive());
                        return;
                    }
                    return;
                }
                if (i2 <= i5) {
                    wasOver = false;
                }
            } catch (Throwable th) {
            }
        }
    }

    private static boolean isMetricSpeedUnits(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.contains("mph") && !lowerCase.contains("mi/h")) {
            return true;
        }
        return false;
    }

    public static void onMinimumSpeedSettingChanged(boolean z) {
        if (!z) {
            minimumSpeedLimit = -1;
        }
    }

    private static boolean isCurrentRoadFreeway(long j2) {
        String str = hudCurStreet != null ? hudCurStreet : "";
        if (!str.equals(classifiedStreetName)) {
            classifiedStreetIsFreeway = RoadTypeClassifier.isFreewayStreetName(str);
            classifiedStreetName = str;
            Log.i(TAG, "road name=[" + str + "] freewayByName=" + classifiedStreetIsFreeway);
        }
        if (classifiedStreetIsFreeway) {
            return true;
        }
        return Boolean.TRUE.equals(freewayBySegment.get(Long.valueOf(j2)));
    }

    public static void onRoadTypePolylines(Object obj) {
        if (modEnabled() && obj != null) {
            try {
                Object objInvoke = obj.getClass().getMethod("getPolylinesList", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke instanceof Iterable) {
                    int i2 = 0;
                    int i3 = 0;
                    for (Object obj2 : (Iterable) objInvoke) {
                        if (obj2 != null) {
                            Object objInvoke2 = obj2.getClass().getMethod("getRoadType", new Class[0]).invoke(obj2, new Object[0]);
                            String strName = objInvoke2 instanceof Enum ? ((Enum) objInvoke2).name() : String.valueOf(objInvoke2);
                            boolean z = "FREEWAY".equalsIgnoreCase(strName) || "ROAD_TYPE_FREEWAY".equalsIgnoreCase(strName);
                            Object objInvoke3 = obj2.getClass().getMethod("getServerSegmentIdList", new Class[0]).invoke(obj2, new Object[0]);
                            if (objInvoke3 instanceof Iterable) {
                                for (Object obj3 : (Iterable) objInvoke3) {
                                    if (obj3 instanceof Number) {
                                        long jLongValue = ((Number) obj3).longValue();
                                        if (jLongValue < 0) {
                                            jLongValue &= MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                                        }
                                        if (jLongValue > 0) {
                                            freewayBySegment.put(Long.valueOf(jLongValue), Boolean.valueOf(z));
                                            i2++;
                                            if (z) {
                                                i3++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 > 0) {
                        Log.i(TAG, "road types cached=" + i2 + " freeway=" + i3);
                    }
                }
            } catch (Throwable th) {
                Log.w(TAG, "road type metadata unavailable: " + th.getClass().getSimpleName());
            }
        }
    }

    private static void onSlowSpeed() {
        if (hudSpeed >= 5 || hudSpeed < 0) {
            lastNotifiedSlowSpeed = -1;
            return;
        }
        if (hudSpeed == lastNotifiedSlowSpeed) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lastSlowMs < SLOW_DEBOUNCE_MS) {
            return;
        }
        lastNotifiedSlowSpeed = hudSpeed;
        lastSlowMs = jElapsedRealtime;
        lastFromNode = hudSegmentId >> 32;
        lastToNode = hudSegmentId & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        if (pref("parking_test", false)) {
            checkParkingRestriction();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ac A[Catch: all -> 0x04eb, TryCatch #4 {all -> 0x04eb, blocks: (B:7:0x0010, B:10:0x0028, B:14:0x005a, B:115:0x03f7, B:17:0x007f, B:20:0x0097, B:23:0x00bc, B:29:0x011d, B:32:0x0144, B:34:0x014a, B:54:0x0191, B:68:0x022e, B:72:0x0261, B:77:0x026f, B:81:0x02b0, B:85:0x02bf, B:87:0x02cf, B:89:0x02d8, B:91:0x02e0, B:94:0x02ea, B:102:0x02fe, B:108:0x035a, B:111:0x037d, B:112:0x03ae, B:103:0x0337, B:116:0x0408, B:119:0x0420, B:121:0x042a, B:126:0x0435, B:129:0x043d, B:136:0x048a, B:137:0x0497, B:138:0x049a, B:139:0x04a6, B:141:0x04ac, B:143:0x04ba, B:144:0x04c0, B:145:0x04c4, B:149:0x04d0, B:130:0x0479), top: B:162:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0261 A[Catch: all -> 0x04eb, TryCatch #4 {all -> 0x04eb, blocks: (B:7:0x0010, B:10:0x0028, B:14:0x005a, B:115:0x03f7, B:17:0x007f, B:20:0x0097, B:23:0x00bc, B:29:0x011d, B:32:0x0144, B:34:0x014a, B:54:0x0191, B:68:0x022e, B:72:0x0261, B:77:0x026f, B:81:0x02b0, B:85:0x02bf, B:87:0x02cf, B:89:0x02d8, B:91:0x02e0, B:94:0x02ea, B:102:0x02fe, B:108:0x035a, B:111:0x037d, B:112:0x03ae, B:103:0x0337, B:116:0x0408, B:119:0x0420, B:121:0x042a, B:126:0x0435, B:129:0x043d, B:136:0x048a, B:137:0x0497, B:138:0x049a, B:139:0x04a6, B:141:0x04ac, B:143:0x04ba, B:144:0x04c0, B:145:0x04c4, B:149:0x04d0, B:130:0x0479), top: B:162:0x0010 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void onAlerts(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.Gateway.onAlerts(java.lang.Object):void");
    }

    private static void configureSpeedDropNativeOnce() {
        if (speedDropNativeConfigured) {
            return;
        }
        int iPrefInt = prefInt("speed_drop_read_mode", 0);
        int iConfigureSpeedDropFilter = SegmentNative.configureSpeedDropFilter(iPrefInt == 1);
        if (iConfigureSpeedDropFilter != 0) {
            speedDropNativeConfigured = true;
            Log.i(TAG, "speed-drop native mode=" + iPrefInt + " result=" + iConfigureSpeedDropFilter);
        }
    }

    static void setPointAlerts(List<String> list) {
        synchronized (Gateway.class) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (String str : list) {
                    if (!hudNavigating || str == null || !str.startsWith("speeddrop_")) {
                        arrayList.add(str);
                    }
                }
            }
            pointHudAlerts = arrayList;
            mergeHudAlertsLocked();
        }
    }

    static void setRoadPointAlerts(List<String> list) {
        ArrayList arrayList;
        synchronized (Gateway.class) {
            if (list == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(list);
            }
            roadPointHudAlerts = arrayList;
            mergeHudAlertsLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setNativeAlerts(List<String> list) {
        ArrayList arrayList;
        synchronized (Gateway.class) {
            if (list == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(list);
            }
            nativeHudAlerts = arrayList;
            mergeHudAlertsLocked();
        }
    }

    private static void mergeHudAlertsLocked() {
        ArrayList arrayList = new ArrayList(nativeHudAlerts.size() + pointHudAlerts.size() + roadPointHudAlerts.size());
        arrayList.addAll(nativeHudAlerts);
        arrayList.addAll(pointHudAlerts);
        arrayList.addAll(roadPointHudAlerts);
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String[] strArrSplit = str == null ? new String[0] : str.split("\\t", -1);
            if (strArrSplit.length >= 5) {
                String lowerCase = strArrSplit[4] == null ? "" : strArrSplit[4].toLowerCase(Locale.US);
                if (lowerCase.startsWith("speeddrop_")) {
                    String str2 = (String) map.get(lowerCase);
                    if (str2 == null || alertMeters(str) < alertMeters(str2)) {
                        map.put(lowerCase, str);
                    }
                } else {
                    arrayList2.add(str);
                }
            }
        }
        arrayList2.addAll(map.values());
        Collections.sort(arrayList2, new Comparator<String>() { // from class: com.waze.gw.Gateway.6
            @Override // java.util.Comparator
            public int compare(String str3, String str4) {
                int iAlertMeters = Gateway.alertMeters(str3);
                int iAlertMeters2 = Gateway.alertMeters(str4);
                if (iAlertMeters != iAlertMeters2) {
                    return iAlertMeters < iAlertMeters2 ? -1 : 1;
                }
                return str3.compareTo(str4);
            }
        });
        hudAlerts = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int alertMeters(String str) {
        try {
            String[] strArrSplit = str.split("\\t", -1);
            if (strArrSplit.length >= 4) {
                return Integer.parseInt(strArrSplit[3]);
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            return Integer.MAX_VALUE;
        }
    }

    public static void onLegacyAlert(Object obj) {
        if (modEnabled() && obj != null) {
            try {
                Class<?> cls = obj.getClass();
                int iIntValue = -1;
                try {
                    Object objInvoke = cls.getMethod("getTypeValue", new Class[0]).invoke(obj, new Object[0]);
                    if (objInvoke instanceof Number) {
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    Object objInvoke2 = cls.getMethod("getType", new Class[0]).invoke(obj, new Object[0]);
                    if (objInvoke2 != null) {
                        Object objInvoke3 = objInvoke2.getClass().getMethod("getNumber", new Class[0]).invoke(objInvoke2, new Object[0]);
                        if (objInvoke3 instanceof Number) {
                            iIntValue = ((Number) objInvoke3).intValue();
                        }
                    }
                }
                String strStringResult = stringResult(cls.getMethod("getIconName", new Class[0]).invoke(obj, new Object[0]));
                String strStringResult2 = stringResult(cls.getMethod("getTitle", new Class[0]).invoke(obj, new Object[0]));
                int distM = parseDistM(stringResult(cls.getMethod("getDistanceString", new Class[0]).invoke(obj, new Object[0])));
                if (!strStringResult.isEmpty() && distM >= 0) {
                    String strResolveIcon = resolveIcon(iIntValue, strStringResult);
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(strResolveIcon + "\t" + strStringResult2 + "\t" + fmtDist(distM) + "\t" + distM + "\t" + strStringResult);
                    setNativeAlerts(arrayList);
                    String str = iIntValue + ":" + strStringResult + ":" + strStringResult2;
                    try {
                        Object objInvoke4 = cls.getMethod("getTimeoutSeconds", new Class[0]).invoke(obj, new Object[0]);
                        clearLegacyAlertLater(str, objInvoke4 instanceof Number ? Math.max(3, ((Number) objInvoke4).intValue()) : 15);
                    } catch (Throwable th2) {
                        clearLegacyAlertLater(str, 15);
                    }
                }
            } catch (Throwable th3) {
            }
        }
    }

    private static void clearLegacyAlertLater(final String str, int i2) {
        legacyAlertKey = str;
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.waze.gw.Gateway.7
                @Override // java.lang.Runnable
                public void run() {
                    if (str.equals(Gateway.legacyAlertKey)) {
                        Gateway.setNativeAlerts(new ArrayList());
                        Gateway.legacyAlertKey = "";
                    }
                }
            }, Math.min(60, Math.max(3, i2)) * 1000);
        } catch (Throwable th) {
        }
    }

    public static void onNavTurn(int i2) {
        if (modEnabled()) {
            hudTurn = i2;
        }
    }

    public static void onNavTurnNext(int i2) {
        if (modEnabled()) {
            hudTurnNext = i2;
        }
    }

    public static void onExitNumber(int i2) {
        if (modEnabled()) {
            hudExit = i2;
        }
    }

    public static void onLanes(Object obj) {
        Object next;
        if (modEnabled()) {
            if (obj == null) {
                clearLanes();
                return;
            }
            try {
                Object objReflectNoArg = reflectNoArg(obj, "getNavigationLaneList");
                if (!(objReflectNoArg instanceof List)) {
                    clearLanes();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) objReflectNoArg).iterator();
                while (true) {
                    if (!it.hasNext() || (next = it.next()) == null || arrayList.size() >= 12) {
                        break;
                    }
                    Object objReflectNoArg2 = reflectNoArg(next, "getIndex");
                    Object objReflectNoArg3 = reflectNoArg(next, "getAngleList");
                    if ((objReflectNoArg2 instanceof Number) && (objReflectNoArg3 instanceof List)) {
                        List list = (List) objReflectNoArg3;
                        int iMin = Math.min(4, list.size());
                        int[] iArrCopyOf = new int[iMin];
                        boolean[] zArrCopyOf = new boolean[iMin];
                        int i2 = 0;
                        for (int i3 = 0; i3 < list.size() && i2 < iMin; i3++) {
                            Object obj2 = list.get(i3);
                            Object objReflectNoArg4 = reflectNoArg(obj2, "getAngle");
                            if (objReflectNoArg4 instanceof Number) {
                                int iIntValue = ((Number) objReflectNoArg4).intValue();
                                while (iIntValue > 180) {
                                    iIntValue -= 360;
                                }
                                while (iIntValue < -180) {
                                    iIntValue += DisplayStrings.DS_ONE_DAY_AGO;
                                }
                                iArrCopyOf[i2] = iIntValue;
                                zArrCopyOf[i2] = Boolean.TRUE.equals(reflectNoArg(obj2, "getIsSelected"));
                                i2++;
                            }
                        }
                        if (i2 != 0) {
                            if (i2 != iMin) {
                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                                zArrCopyOf = Arrays.copyOf(zArrCopyOf, i2);
                            }
                            arrayList.add(new LaneRow(((Number) objReflectNoArg2).intValue(), iArrCopyOf, zArrCopyOf));
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    clearLanes();
                    return;
                }
                Collections.sort(arrayList, new Comparator<LaneRow>() { // from class: com.waze.gw.Gateway.8
                    @Override // java.util.Comparator
                    public int compare(LaneRow laneRow, LaneRow laneRow2) {
                        return Gateway$8$$ExternalSyntheticBackport0.m(laneRow.index, laneRow2.index);
                    }
                });
                int[][] iArr = new int[arrayList.size()][];
                boolean[][] zArr = new boolean[arrayList.size()][];
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    LaneRow laneRow = (LaneRow) arrayList.get(i4);
                    iArr[i4] = laneRow.angles;
                    zArr[i4] = laneRow.selected;
                    if (i4 > 0) {
                        sb.append('|');
                    }
                    sb.append(laneRow.index).append(':');
                    for (int i5 = 0; i5 < laneRow.angles.length; i5++) {
                        if (i5 > 0) {
                            sb.append(',');
                        }
                        sb.append(laneRow.angles[i5]).append(laneRow.selected[i5] ? '*' : '-');
                    }
                }
                LaneSnapshot laneSnapshot = new LaneSnapshot(iArr, zArr, sb.toString());
                String strSignature = hudLanes.signature();
                hudLanes = laneSnapshot;
                if (!laneSnapshot.signature().equals(strSignature)) {
                    Log.i(TAG, "lane guidance " + laneSnapshot.signature());
                }
            } catch (Throwable th) {
                clearLanes();
                Log.w(TAG, "Unable to decode lane guidance", th);
            }
        }
    }

    private static void clearLanes() {
        if (hudLanes.size() != 0) {
            Log.i(TAG, "lane guidance cleared");
        }
        hudLanes = LaneSnapshot.EMPTY;
    }

    public static int capLimit(int i2) {
        try {
            if (modEnabled() && pref("moto_cap", true)) {
                if (isMotorcycle()) {
                    if (i2 > 80) {
                        return 70;
                    }
                    if (i2 > 70 && i2 <= 80) {
                        return 60;
                    }
                    return i2;
                }
            }
            return i2;
        } catch (Throwable th) {
            return i2;
        }
    }

    static boolean isMotorcycle() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - vehCheckedMs > 5000) {
            vehCheckedMs = jElapsedRealtime;
            vehType = cfgString("CONFIG_VALUE_CAR_TYPE_PERMANENT_CAR_TYPE");
        }
        return "MOTORCYCLE".equalsIgnoreCase(vehType);
    }

    public static void ensureMotorcycleArrowAssets() {
        File parentFile;
        if (motorcycleArrowAssetsReady) {
            return;
        }
        synchronized (Gateway.class) {
            if (motorcycleArrowAssetsReady) {
                return;
            }
            Context contextCtx = ctx();
            if (contextCtx == null) {
                return;
            }
            try {
                parentFile = contextCtx.getFilesDir().getParentFile();
            } catch (Throwable th) {
                Log.w(TAG, "Unable to refresh motorcycle map-car assets", th);
            }
            if (parentFile == null) {
                return;
            }
            File file = new File(parentFile, "waze/skins/default/cars");
            if (file.isDirectory() || file.mkdirs()) {
                copyAssetAtomically(contextCtx, "res/skins/default/cars/motorbike_model.obj", new File(file, "motorbike_model.obj"));
                copyAssetAtomically(contextCtx, "res/skins/default/cars/arrow_texture_normal.png", new File(file, "motorbike_texture.png"));
                motorcycleArrowAssetsReady = true;
                Log.i(TAG, "Motorcycle map-car assets set to scaled Arrow");
            }
        }
    }

    private static void copyAssetAtomically(Context context, String str, File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file2 = new File(file.getPath() + ".wzmod.tmp");
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 < 0) {
                        break;
                    } else if (i2 > 0) {
                        fileOutputStream.write(bArr, 0, i2);
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                if (file.exists() && !file.delete()) {
                    file2.delete();
                    throw new IOException("Cannot replace " + String.valueOf(file));
                }
                if (!file2.renameTo(file)) {
                    file2.delete();
                    throw new IOException("Cannot install " + String.valueOf(file));
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    static String cfgString(String str) {
        Object objInvoke;
        Object obj;
        try {
            objInvoke = Class.forName("com.waze.ConfigManager").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            obj = Class.forName("com.waze.config.ConfigValues").getField(str).get(null);
        } catch (Throwable th) {
        }
        if (objInvoke != null && obj != null) {
            for (Method method : objInvoke.getClass().getMethods()) {
                if (method.getName().equals("getConfigValueString") && method.getParameterTypes().length == 1) {
                    Object objInvoke2 = method.invoke(objInvoke, obj);
                    return objInvoke2 != null ? objInvoke2.toString() : "";
                }
            }
            return "";
        }
        return "";
    }

    public static void onNavState(boolean z) {
        if (modEnabled()) {
            hudNavigating = z;
            if (z) {
                refreshGoogleMapsButton();
                return;
            }
            clearGoogleMapsDestination();
            refreshGoogleMapsButton();
            announcedAlert.clear();
            speedDropRetryAt.clear();
            hudTurn = -1;
            hudTurnNext = -1;
            hudExit = -1;
            hudTurnDist = -1;
            hudStreet = "";
            clearLanes();
            hudEtaMin = -1;
            hudEtaClock = "";
            hudEtaTimeStr = "";
            hudEtaDistM = -1;
            clearRoadSegmentState();
            speedDropRouteUuid = "";
            clearSpeedDropRouteState();
            onAvgSpeedZoneClear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void onNavRoute(java.lang.Object r5) {
        /*
            java.lang.String r0 = ""
            boolean r1 = modEnabled()
            if (r1 != 0) goto L9
            return
        L9:
            captureGoogleMapsDestination(r5)
            refreshGoogleMapsButton()
            if (r5 == 0) goto L2c
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "getRouteUUID"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L86
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L2c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L86
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.String r2 = com.waze.gw.Gateway.speedDropRouteUuid     // Catch: java.lang.Throwable -> L86
            com.waze.gw.Gateway.speedDropRouteUuid = r1     // Catch: java.lang.Throwable -> L86
            activateRawRoute(r5)     // Catch: java.lang.Throwable -> L86
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r5 != 0) goto L46
            boolean r5 = r2.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r5 != 0) goto L46
            boolean r5 = r1.equals(r2)     // Catch: java.lang.Throwable -> L86
            if (r5 != 0) goto L85
        L46:
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r5 != 0) goto L58
            boolean r5 = r2.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r5 != 0) goto L5a
            boolean r5 = r1.equals(r2)     // Catch: java.lang.Throwable -> L86
            if (r5 != 0) goto L5a
        L58:
            com.waze.gw.Gateway.hudStreet = r0     // Catch: java.lang.Throwable -> L86
        L5a:
            clearSpeedDropRouteState()     // Catch: java.lang.Throwable -> L86
            com.waze.gw.RoadRulesRepository.onTripReset()     // Catch: java.lang.Throwable -> L86
            com.waze.gw.PointNoticeRepository.onTripReset()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "WazeGW"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "speed-drop route reset "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = " -> "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L86
            android.util.Log.i(r5, r1)     // Catch: java.lang.Throwable -> L86
        L85:
            goto L8e
        L86:
            r5 = move-exception
            com.waze.gw.Gateway.speedDropRouteUuid = r0
            com.waze.gw.Gateway.hudStreet = r0
            clearSpeedDropRouteState()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.Gateway.onNavRoute(java.lang.Object):void");
    }

    private static void captureGoogleMapsDestination(Object obj) {
        Object objInvoke;
        if (obj == null) {
            clearGoogleMapsDestination();
            return;
        }
        try {
            String str = "waypoint";
            Object objInvoke2 = obj.getClass().getMethod("getWaypointsCount", new Class[0]).invoke(obj, new Object[0]);
            if (!(objInvoke2 instanceof Number)) {
                throw new IllegalStateException("waypoint count");
            }
            int iIntValue = ((Number) objInvoke2).intValue();
            Object objInvoke3 = null;
            if (iIntValue <= 0) {
                objInvoke = null;
            } else {
                Object objInvoke4 = obj.getClass().getMethod("getWaypoints", Integer.TYPE).invoke(obj, Integer.valueOf(iIntValue - 1));
                if (objInvoke4 == null) {
                    objInvoke = null;
                } else {
                    objInvoke = objInvoke4.getClass().getMethod("getCoordinate", new Class[0]).invoke(objInvoke4, new Object[0]);
                }
            }
            if (objInvoke == null) {
                str = "geometry";
                Object objInvoke5 = obj.getClass().getMethod("getGeometry", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke5 != null) {
                    objInvoke3 = objInvoke5.getClass().getMethod("getPositionCount", new Class[0]).invoke(objInvoke5, new Object[0]);
                }
                int iIntValue2 = objInvoke3 instanceof Number ? ((Number) objInvoke3).intValue() : 0;
                if (iIntValue2 > 0) {
                    objInvoke = objInvoke5.getClass().getMethod("getPosition", Integer.TYPE).invoke(objInvoke5, Integer.valueOf(iIntValue2 - 1));
                }
            }
            if (objInvoke == null) {
                throw new IllegalStateException("no destination coordinate");
            }
            Object objInvoke6 = objInvoke.getClass().getMethod("getLatitude", new Class[0]).invoke(objInvoke, new Object[0]);
            Object objInvoke7 = objInvoke.getClass().getMethod("getLongitude", new Class[0]).invoke(objInvoke, new Object[0]);
            if (!(objInvoke6 instanceof Number) || !(objInvoke7 instanceof Number)) {
                throw new IllegalStateException("invalid destination coordinate");
            }
            int iIntValue3 = ((Number) objInvoke6).intValue();
            int iIntValue4 = ((Number) objInvoke7).intValue();
            if (iIntValue3 < -90000000 || iIntValue3 > 90000000 || iIntValue4 < -180000000 || iIntValue4 > 180000000 || (iIntValue3 == 0 && iIntValue4 == 0)) {
                throw new IllegalStateException("destination out of range");
            }
            googleMapsDestinationLatE6 = iIntValue3;
            googleMapsDestinationLonE6 = iIntValue4;
            Log.i(TAG, "Google Maps destination captured source=" + str + " latE6=" + iIntValue3 + " lonE6=" + iIntValue4);
        } catch (Throwable th) {
            clearGoogleMapsDestination();
            Log.w(TAG, "Google Maps destination unavailable", th);
        }
    }

    private static void clearGoogleMapsDestination() {
        googleMapsDestinationLatE6 = Integer.MIN_VALUE;
        googleMapsDestinationLonE6 = Integer.MIN_VALUE;
    }

    public static void onNavRouteGeometry(Object obj) {
        String str;
        if (modEnabled()) {
            if (obj == null) {
                str = "";
            } else {
                str = obj.getClass().getName() + ":" + obj.hashCode();
            }
            String str2 = speedDropRouteUuid;
            speedDropRouteUuid = str;
            if (str.isEmpty() || str2.isEmpty() || !str.equals(str2)) {
                if (str.isEmpty() || (!str2.isEmpty() && !str.equals(str2))) {
                    hudStreet = "";
                }
                clearSpeedDropRouteState();
                RoadRulesRepository.onTripReset();
                PointNoticeRepository.onTripReset();
                Log.i(TAG, "speed-drop geometry reset " + str2 + " -> " + str);
            }
        }
    }

    public static void onNavRouteCleared() {
        if (modEnabled()) {
            hudNavigating = false;
            clearGoogleMapsDestination();
            refreshGoogleMapsButton();
            announcedAlert.clear();
            speedDropRetryAt.clear();
            speedDropRouteUuid = "";
            hudStreet = "";
            clearSpeedDropRouteState();
            RoadRulesRepository.onTripReset();
            PointNoticeRepository.onTripReset();
            clearLanes();
            clearRoadSegmentState();
        }
    }

    private static final class RawRouteSegments {
        final int[] clientIds;
        final long[] fromNodeIds;
        final long[] serverIds;
        final int[] tileIds;

        RawRouteSegments(int i2) {
            this.serverIds = new long[i2];
            this.fromNodeIds = new long[i2];
            this.tileIds = new int[i2];
            this.clientIds = new int[i2];
            Arrays.fill(this.serverIds, -1L);
            Arrays.fill(this.fromNodeIds, -1L);
            Arrays.fill(this.tileIds, -1);
            Arrays.fill(this.clientIds, -1);
        }
    }

    public static void onRawRoute(Object obj) {
        boolean z;
        long j2;
        int i2;
        long j3;
        if (modEnabled() && obj != null) {
            try {
                Class<?> cls = obj.getClass();
                int i3 = 0;
                String strStringResult = stringResult(cls.getMethod("getAlternativeRouteUuid", new Class[0]).invoke(obj, new Object[0]));
                long j4 = -1;
                long jNumberResult = numberResult(cls.getMethod("getAltId", new Class[0]).invoke(obj, new Object[0]), -1L);
                long j5 = 0;
                int iNumberResult = (int) numberResult(cls.getMethod("getRouteSegmentCount", new Class[0]).invoke(obj, new Object[0]), 0L);
                if (iNumberResult <= 0) {
                    return;
                }
                int i4 = 1;
                Method method = cls.getMethod("getRouteSegment", Integer.TYPE);
                RawRouteSegments rawRouteSegments = new RawRouteSegments(iNumberResult);
                int i5 = 0;
                while (i5 < iNumberResult) {
                    Object[] objArr = new Object[i4];
                    objArr[i3] = Integer.valueOf(i5);
                    Object objInvoke = method.invoke(obj, objArr);
                    if (objInvoke == null) {
                        i2 = iNumberResult;
                        j2 = j5;
                        j3 = j4;
                    } else {
                        Class<?> cls2 = objInvoke.getClass();
                        j2 = j5;
                        long jNumberResult2 = numberResult(cls2.getMethod("getServerSegmentId", new Class[i3]).invoke(objInvoke, new Object[i3]), j4);
                        if (jNumberResult2 < j2) {
                            jNumberResult2 &= MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                        }
                        i2 = iNumberResult;
                        long jNumberResult3 = numberResult(cls2.getMethod("getFromNode", new Class[i3]).invoke(objInvoke, new Object[i3]), -1L);
                        long j6 = jNumberResult3 < j2 ? jNumberResult3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE : jNumberResult3;
                        long[] jArr = rawRouteSegments.serverIds;
                        if (jNumberResult2 <= j2) {
                            jNumberResult2 = -1;
                        }
                        jArr[i5] = jNumberResult2;
                        long[] jArr2 = rawRouteSegments.fromNodeIds;
                        if (j6 <= j2) {
                            j6 = -1;
                        }
                        jArr2[i5] = j6;
                        rawRouteSegments.tileIds[i5] = (int) numberResult(cls2.getMethod("getTileId", new Class[0]).invoke(objInvoke, new Object[0]), -1L);
                        j3 = -1;
                        rawRouteSegments.clientIds[i5] = (int) numberResult(cls2.getMethod("getClientId", new Class[0]).invoke(objInvoke, new Object[0]), -1L);
                    }
                    i5++;
                    j4 = j3;
                    iNumberResult = i2;
                    j5 = j2;
                    i3 = 0;
                    i4 = 1;
                }
                int i6 = iNumberResult;
                long j7 = j5;
                int iFindRouteIndexByNodePair = findRouteIndexByNodePair(rawRouteSegments, hudSegmentId);
                synchronized (rawRoutes) {
                    if (!strStringResult.isEmpty()) {
                        rawRoutes.put("uuid:" + strStringResult, rawRouteSegments);
                    }
                    if (jNumberResult >= j7) {
                        rawRoutes.put("alt:" + jNumberResult, rawRouteSegments);
                    }
                    if ((strStringResult.isEmpty() || !activeRawRouteKey.equals("uuid:" + strStringResult)) && ((jNumberResult < j7 || !activeRawRouteKey.equals("alt:" + jNumberResult)) && iFindRouteIndexByNodePair < 0)) {
                        z = false;
                    } else {
                        activeRawRoute = rawRouteSegments;
                        if (iFindRouteIndexByNodePair >= 0) {
                            activeRawRouteKey = (!strStringResult.isEmpty() ? new StringBuilder().append("uuid:").append(strStringResult) : new StringBuilder().append("alt:").append(jNumberResult)).toString();
                        }
                        z = true;
                    }
                }
                Log.i(TAG, "raw route segments=" + i6 + " uuid=" + strStringResult + " alt=" + jNumberResult);
                if (z) {
                    int i7 = iFindRouteIndexByNodePair >= 0 ? iFindRouteIndexByNodePair : hudRouteSegmentIdx;
                    if (iFindRouteIndexByNodePair >= 0) {
                        Log.i(TAG, "raw route node-pair match idx=" + iFindRouteIndexByNodePair);
                    }
                    updateRoadSegmentFromTable(rawRouteSegments, i7);
                }
            } catch (Throwable th) {
                Log.w(TAG, "raw route segment ids unavailable: " + th.getClass().getSimpleName());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void activateRawRoute(java.lang.Object r10) {
        /*
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            if (r10 != 0) goto L9
            r0 = r3
            goto Ld
        L9:
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Throwable -> L90
        Ld:
            if (r0 == 0) goto L91
            java.lang.String r4 = "getRouteUUID"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = r4.invoke(r10, r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = stringResult(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "getAltId"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L90
            java.lang.Object r10 = r0.invoke(r10, r5)     // Catch: java.lang.Throwable -> L90
            r5 = -1
            long r5 = numberResult(r10, r5)     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap<java.lang.String, com.waze.gw.Gateway$RawRouteSegments> r10 = com.waze.gw.Gateway.rawRoutes     // Catch: java.lang.Throwable -> L90
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L90
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L5a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = "uuid:"
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap<java.lang.String, com.waze.gw.Gateway$RawRouteSegments> r0 = com.waze.gw.Gateway.rawRoutes     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L8d
            com.waze.gw.Gateway$RawRouteSegments r0 = (com.waze.gw.Gateway.RawRouteSegments) r0     // Catch: java.lang.Throwable -> L8d
            r3 = r0
        L5a:
            if (r3 != 0) goto L8b
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "alt:"
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap<java.lang.String, com.waze.gw.Gateway$RawRouteSegments> r4 = com.waze.gw.Gateway.rawRoutes     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L8d
            com.waze.gw.Gateway$RawRouteSegments r4 = (com.waze.gw.Gateway.RawRouteSegments) r4     // Catch: java.lang.Throwable -> L8d
            if (r4 != 0) goto L89
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L8a
            goto L89
        L86:
            r0 = move-exception
            r3 = r4
            goto L8e
        L89:
            r1 = r0
        L8a:
            r3 = r4
        L8b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r0 = move-exception
        L8e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L90
        L90:
            r0 = move-exception
        L91:
            com.waze.gw.Gateway.activeRawRouteKey = r1
            com.waze.gw.Gateway.activeRawRoute = r3
            r8 = -1
            java.lang.String r9 = "route-activate"
            r4 = -1
            r6 = -1
            r7 = -1
            setRoadSegmentState(r4, r6, r7, r8, r9)
            java.lang.String r10 = "WazeGW"
            if (r3 == 0) goto La5
            r2 = 1
        La5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "active raw route "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " matched="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.Gateway.activateRawRoute(java.lang.Object):void");
    }

    public static void onCurrentStreetUpdate(Object obj) {
        onNavStreet(obj);
        if (modEnabled() && obj != null) {
            try {
                updateRoadSegmentFromTable(activeRawRoute, (int) numberResult(obj.getClass().getMethod("getSegmentIdx", new Class[0]).invoke(obj, new Object[0]), -1L));
            } catch (Throwable th) {
                setRoadSegmentState(-1L, -1, -1, -1, "street-update-error");
            }
        }
    }

    private static void updateRoadSegmentFromTable(RawRouteSegments rawRouteSegments, int i2) {
        int i3;
        int i4;
        long j2;
        if (rawRouteSegments != null && i2 >= 0 && i2 < rawRouteSegments.serverIds.length) {
            long j3 = rawRouteSegments.serverIds[i2];
            int i5 = rawRouteSegments.tileIds[i2];
            i4 = rawRouteSegments.clientIds[i2];
            i3 = i5;
            j2 = j3;
        } else {
            i3 = -1;
            i4 = -1;
            j2 = -1;
        }
        setRoadSegmentState(j2, i2, i3, i4, "route");
    }

    private static void setRoadSegmentState(long j2, int i2, int i3, int i4, String str) {
        long j3 = hudRoadSegmentId;
        hudRouteSegmentIdx = i2;
        hudRoadSegmentId = j2;
        hudSegmentTileId = i3;
        hudSegmentClientId = i4;
        if (j2 == j3) {
            return;
        }
        Log.i(TAG, "road segment " + j3 + " -> " + j2 + " source=" + str + " idx=" + i2 + " tile=" + i3 + " client=" + i4);
        if (j2 > 0) {
            RoadRulesRepository.onSegmentChanged(ctx(), new RoadRulesRepository.SegmentSnapshot(j2, hudSegmentId, i2, i3, i4, hudCurStreet, str));
        } else if (j3 > 0) {
            RoadRulesRepository.onSegmentCleared(j3);
        }
    }

    private static int findRouteIndexByNodePair(RawRouteSegments rawRouteSegments, long j2) {
        if (rawRouteSegments == null || j2 == -1 || rawRouteSegments.fromNodeIds.length < 2) {
            return -1;
        }
        long j3 = j2 >>> 32;
        long j4 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= rawRouteSegments.fromNodeIds.length) {
                return -1;
            }
            if (rawRouteSegments.fromNodeIds[i2] == j3 && rawRouteSegments.fromNodeIds[i3] == j4) {
                return i2;
            }
            i2 = i3;
        }
    }

    private static void clearRoadSegmentState() {
        activeRawRoute = null;
        activeRawRouteKey = "";
        setRoadSegmentState(-1L, -1, -1, -1, "clear");
    }

    private static String stringResult(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    private static long numberResult(Object obj, long j2) {
        return obj instanceof Number ? ((Number) obj).longValue() : j2;
    }

    public static synchronized void onAvgSpeedZone(int i2, int i3, int i4) {
        if (modEnabled()) {
            avgZoneFromNavigation = true;
            avgZone = true;
            avgLeftM = i2;
            avgRecSpeed = i3;
            avgPercent = i4;
        }
    }

    public static synchronized void onAvgSpeedZoneClear() {
        if (modEnabled()) {
            avgZoneFromNavigation = false;
            avgZone = avgZoneFromAlerts;
            avgLeftM = avgZoneFromAlerts ? avgAlertLeftM : -1;
            avgRecSpeed = -1;
            avgPercent = -1;
        }
    }

    private static synchronized void setAverageZoneFromAlerts(boolean z, int i2) {
        avgZoneFromAlerts = z;
        avgAlertLeftM = z ? i2 : -1;
        if (!avgZoneFromNavigation) {
            avgZone = z;
            if (!z) {
                i2 = -1;
            }
            avgLeftM = i2;
            avgRecSpeed = -1;
            avgPercent = -1;
        }
    }

    public static void onEtaTime(String str, String str2, int i2) {
        if (modEnabled()) {
            if (str == null) {
                str = "";
            }
            hudEtaTimeStr = str;
            hudEtaMin = i2;
        }
    }

    public static void onEtaClock(String str) {
        if (modEnabled()) {
            if (str == null) {
                str = "";
            }
            hudEtaClock = str;
        }
    }

    public static void onEtaDist(Object obj) {
        if (modEnabled() && obj != null) {
            try {
                Object objInvoke = obj.getClass().getMethod("getRawMeters", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke instanceof Number) {
                    hudEtaDistM = ((Number) objInvoke).intValue();
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void onNavDist(Object obj) {
        if (modEnabled() && obj != null) {
            try {
                Object objInvoke = obj.getClass().getMethod("getRawMeters", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke instanceof Number) {
                    hudTurnDist = ((Number) objInvoke).intValue();
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void onNavStreet(java.lang.Object r8) {
        /*
            java.lang.String r0 = ""
            if (r8 != 0) goto L8
            onNavStreetStr(r0)
            return
        L8:
            java.lang.String r1 = "getStreetName"
            java.lang.String r1 = navPayloadText(r8, r1)
            r2 = 0
            java.lang.Class r3 = r8.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "hasRoadSign"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r3.invoke(r8, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L40
            java.lang.Class r3 = r8.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "getRoadSign"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r3.invoke(r8, r4)     // Catch: java.lang.Throwable -> L5f
            goto L41
        L40:
            r8 = 0
        L41:
            if (r8 == 0) goto L5c
            java.lang.String r3 = "getTextRepresentation"
            java.lang.String r3 = navPayloadText(r8, r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "getPrimaryMarkup"
            java.lang.String r4 = navPayloadText(r8, r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "getSecondaryMarkup"
            java.lang.String r8 = navPayloadText(r8, r5)     // Catch: java.lang.Throwable -> L57
            r0 = r3
            goto L5e
        L57:
            r8 = move-exception
            goto L62
        L59:
            r8 = move-exception
            r4 = r0
            goto L62
        L5c:
            r8 = r0
            r4 = r8
        L5e:
            goto L64
        L5f:
            r8 = move-exception
            r3 = r0
            r4 = r3
        L62:
            r8 = r0
            r0 = r3
        L64:
            boolean r3 = isNavConnector(r1)
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L7a
            java.lang.String[] r3 = new java.lang.String[r5]
            r3[r2] = r0
            r3[r7] = r8
            r3[r6] = r4
            java.lang.String r2 = firstNavLabel(r3)
            goto L89
        L7a:
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r2] = r1
            r3[r7] = r0
            r3[r6] = r8
            r3[r5] = r4
            java.lang.String r2 = firstNavLabel(r3)
        L89:
            int r3 = r1.length()
            if (r3 > 0) goto La1
            int r3 = r0.length()
            if (r3 > 0) goto La1
            int r3 = r4.length()
            if (r3 > 0) goto La1
            int r3 = r8.length()
            if (r3 <= 0) goto Le7
        La1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "maneuver street payload street=["
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = "] sign=["
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "] primary=["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "] secondary=["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = "] resolved=["
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "WazeGW"
            android.util.Log.i(r0, r8)
        Le7:
            onNavStreetStr(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.Gateway.onNavStreet(java.lang.Object):void");
    }

    public static void refreshNavStreetFromManager() {
        if (hudStreet == null || hudStreet.trim().length() <= 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - navStreetRefreshAt < 1000) {
                return;
            }
            navStreetRefreshAt = jElapsedRealtime;
            try {
                Class<?> cls = Class.forName("com.waze.navigate.NavigationInfoNativeManager");
                Method method = navManagerGetInstance;
                if (method == null) {
                    method = cls.getMethod("getInstance", new Class[0]);
                    method.setAccessible(true);
                    navManagerGetInstance = method;
                }
                Object objInvoke = method.invoke(null, new Object[0]);
                if (objInvoke == null) {
                    return;
                }
                Field declaredField = navManagerCurrentStreet;
                if (declaredField == null || declaredField.getDeclaringClass() != cls) {
                    declaredField = cls.getDeclaredField("currentStreetNameUpdate");
                    declaredField.setAccessible(true);
                    navManagerCurrentStreet = declaredField;
                }
                Object obj = declaredField.get(objInvoke);
                if (obj != null) {
                    onNavStreet(obj);
                }
            } catch (Throwable th) {
            }
        }
    }

    private static String navPayloadText(Object obj, String str) {
        if (obj == null) {
            return "";
        }
        try {
            Object objInvoke = obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
            return objInvoke == null ? "" : objInvoke.toString().trim();
        } catch (Throwable th) {
            return "";
        }
    }

    private static String firstNavLabel(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (str != null) {
                String strTrim = str.replaceAll("<[^>]*>", " ").replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replaceAll("\\s+", " ").trim();
                if (strTrim.length() > 0) {
                    return strTrim;
                }
            }
        }
        return "";
    }

    private static boolean isNavConnector(String str) {
        if (str == null) {
            return true;
        }
        String strTrim = str.trim().toLowerCase(Locale.ROOT).replaceAll("[\\p{Punct}\\s]+", " ").trim();
        return strTrim.length() == 0 || "sau đó".equals(strTrim) || "sau do".equals(strTrim) || "tiếp theo".equals(strTrim) || "then".equals(strTrim) || "next".equals(strTrim);
    }

    public static void onNavStreetStr(String str) {
        String strTrim = str != null ? str.trim() : "";
        if (!strTrim.equals(hudStreet)) {
            Log.i(TAG, "next street=[" + strTrim + "]");
        }
        hudStreet = strTrim;
    }

    public static void onMatchedPos(Object obj) {
        if (modEnabled() && obj != null) {
            try {
                lastWazeLocationElapsed = SystemClock.elapsedRealtime();
                long jCurrentServerSegmentId = SegmentNative.currentServerSegmentId();
                if (mMatcher == null) {
                    mMatcher = obj.getClass().getMethod("getMatcherInfo", new Class[0]);
                }
                Object objInvoke = mMatcher.invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    publishPointPosition(obj, null);
                    if (jCurrentServerSegmentId > 0 && jCurrentServerSegmentId != hudRoadSegmentId) {
                        setRoadSegmentState(jCurrentServerSegmentId, -1, -1, -1, "map-matcher");
                        return;
                    }
                    return;
                }
                if (mHasStreet == null) {
                    mHasStreet = objInvoke.getClass().getMethod("hasStreetName", new Class[0]);
                    mGetStreet = objInvoke.getClass().getMethod("getStreetName", new Class[0]);
                    mGetFromNode = objInvoke.getClass().getMethod("getFromNodeDbId", new Class[0]);
                    mGetToNode = objInvoke.getClass().getMethod("getToNodeDbId", new Class[0]);
                }
                if (Boolean.TRUE.equals(mHasStreet.invoke(objInvoke, new Object[0]))) {
                    Object objInvoke2 = mGetStreet.invoke(objInvoke, new Object[0]);
                    hudCurStreet = objInvoke2 != null ? objInvoke2.toString() : "";
                }
                Object objInvoke3 = mGetFromNode.invoke(objInvoke, new Object[0]);
                Object objInvoke4 = mGetToNode.invoke(objInvoke, new Object[0]);
                long j2 = -1;
                if ((objInvoke3 instanceof Number) && (objInvoke4 instanceof Number)) {
                    long jLongValue = ((Number) objInvoke3).longValue();
                    long jLongValue2 = ((Number) objInvoke4).longValue();
                    long j3 = hudSegmentId;
                    if (jLongValue > 0 && jLongValue2 > 0) {
                        j2 = (jLongValue << 32) | (jLongValue2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    }
                    hudSegmentId = j2;
                    if (hudSegmentId != j3) {
                        Log.i(TAG, "segment " + jLongValue + "->" + jLongValue2);
                    }
                    if (jCurrentServerSegmentId > 0 && jCurrentServerSegmentId != hudRoadSegmentId) {
                        setRoadSegmentState(jCurrentServerSegmentId, -1, -1, -1, "map-matcher");
                    }
                    publishPointPosition(obj, objInvoke);
                    return;
                }
                hudSegmentId = -1L;
                publishPointPosition(obj, objInvoke);
                if (jCurrentServerSegmentId > 0 && jCurrentServerSegmentId != hudRoadSegmentId) {
                    setRoadSegmentState(jCurrentServerSegmentId, -1, -1, -1, "map-matcher");
                }
            } catch (Throwable th) {
                mGetToNode = null;
                mGetFromNode = null;
                mGetStreet = null;
                mHasStreet = null;
                mMatcher = null;
                mProviderAccuracy = null;
                mProviderSteering = null;
                mProviderPosition = null;
                mIntLongitude = null;
                mIntLatitude = null;
                mMatchedAccuracy = null;
                mMatchedPosition = null;
            }
        }
    }

    private static void publishPointPosition(Object obj, Object obj2) {
        Object objInvoke;
        double dDoubleValue;
        if (obj == null) {
            return;
        }
        try {
            if (obj2 != null) {
                if (mMatchedPosition == null) {
                    mMatchedPosition = obj2.getClass().getMethod("getPosition", new Class[0]);
                    mMatchedAccuracy = obj2.getClass().getMethod("getAccuracyMeters", new Class[0]);
                }
                objInvoke = mMatchedPosition.invoke(obj2, new Object[0]);
                Object objInvoke2 = mMatchedAccuracy.invoke(obj2, new Object[0]);
                dDoubleValue = objInvoke2 instanceof Number ? ((Number) objInvoke2).doubleValue() : -1.0d;
            } else {
                if (mProviderPosition == null) {
                    mProviderPosition = obj.getClass().getMethod("getPosition", new Class[0]);
                    mProviderSteering = obj.getClass().getMethod("getSteering", new Class[0]);
                    mProviderAccuracy = obj.getClass().getMethod("getAccuracy", new Class[0]);
                }
                objInvoke = mProviderPosition.invoke(obj, new Object[0]);
                Object objInvoke3 = mProviderAccuracy.invoke(obj, new Object[0]);
                dDoubleValue = objInvoke3 instanceof Number ? ((Number) objInvoke3).doubleValue() : -1.0d;
            }
            if (objInvoke == null) {
                return;
            }
            if (mIntLatitude == null) {
                mIntLatitude = objInvoke.getClass().getMethod("getLatitude", new Class[0]);
                mIntLongitude = objInvoke.getClass().getMethod("getLongitude", new Class[0]);
            }
            Object objInvoke4 = mIntLatitude.invoke(objInvoke, new Object[0]);
            Object objInvoke5 = mIntLongitude.invoke(objInvoke, new Object[0]);
            if ((objInvoke4 instanceof Number) && (objInvoke5 instanceof Number)) {
                if (mProviderSteering == null) {
                    mProviderSteering = obj.getClass().getMethod("getSteering", new Class[0]);
                }
                Object objInvoke6 = mProviderSteering.invoke(obj, new Object[0]);
                int iIntValue = objInvoke6 instanceof Number ? ((Number) objInvoke6).intValue() : -1;
                double dIntValue = ((Number) objInvoke4).intValue();
                Double.isNaN(dIntValue);
                double d2 = dIntValue / 1000000.0d;
                double dIntValue2 = ((Number) objInvoke5).intValue();
                Double.isNaN(dIntValue2);
                double d3 = dIntValue2 / 1000000.0d;
                publishGpsFix(dDoubleValue, obj2 != null ? "Waze (khớp đường)" : "Waze");
                Context contextCtx = ctx();
                if (contextCtx != null) {
                    PointNoticeRepository.PositionSnapshot positionSnapshot = new PointNoticeRepository.PositionSnapshot(d2, d3, hudSpeed, iIntValue, dDoubleValue, obj2 != null, SystemClock.elapsedRealtime());
                    TripBlackBox.onPosition(contextCtx, d2, d3, hudSpeed, hudLimit, iIntValue, dDoubleValue, obj2 != null, hudRoadSegmentId, hudCurStreet);
                    PointNoticeRepository.onPosition(contextCtx, positionSnapshot);
                    RoadPointNoticeRepository.onPosition(contextCtx, positionSnapshot);
                }
            }
        } catch (Throwable th) {
            mProviderAccuracy = null;
            mProviderSteering = null;
            mProviderPosition = null;
            mIntLongitude = null;
            mIntLatitude = null;
            mMatchedAccuracy = null;
            mMatchedPosition = null;
        }
    }

    public static String currentSegmentId() {
        if (!modEnabled()) {
            return "N/A";
        }
        long j2 = hudRoadSegmentId;
        if (j2 > 0) {
            return "segment " + j2;
        }
        long j3 = hudSegmentId;
        if (j3 < 0) {
            return "N/A";
        }
        return "segment " + (j3 >> 32) + "->" + (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static void attachHud(View view) {
        if (view == null) {
            return;
        }
        try {
            if (modEnabled(view.getContext())) {
                nativeSpeedo = view;
                applyNativeSpeedoSize(view);
                applyNativeSpeedoTextColor(view);
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.gw.Gateway.10
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        Gateway.applyNativeSpeedoSize(view2);
                        Gateway.applyNativeSpeedoVisibility(view2);
                        Gateway.applyNativeSpeedoTextColor(view2);
                    }
                });
                WazeDialogs.showAuthenticityNoticeOnce(view);
                warmMapProblems();
                Bubble.installAutoHide(view.getContext());
                HudLink.ensureStarted(view.getContext());
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.waze.gw.Gateway.11
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        try {
                            Context context = view2.getContext();
                            Intent intentCreateIntent = HudActivity.createIntent(context);
                            intentCreateIntent.addFlags(268435456);
                            context.startActivity(intentCreateIntent);
                            return true;
                        } catch (Throwable th) {
                            return true;
                        }
                    }
                });
                applyNativeSpeedoVisibility(view);
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.waze.gw.Gateway.12
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        Gateway.addModReport(view2);
                        Gateway.addFloatSpeedo(view2);
                        Gateway.addUpcomingAlertRail(view2);
                        Gateway.addParkingSign(view2);
                        Gateway.addMapOverspeedEffect(view2);
                        Gateway.addGoogleMapsButton(view2);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }
                });
                if (view.isAttachedToWindow()) {
                    addModReport(view);
                    addFloatSpeedo(view);
                    addUpcomingAlertRail(view);
                    addParkingSign(view);
                    addMapOverspeedEffect(view);
                    addGoogleMapsButton(view);
                }
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyNativeSpeedoSize(final View view) {
        if (view == null) {
            return;
        }
        final float fMax = Math.max(100, Math.min(200, prefInt("native_speedo_size", 100))) / 100.0f;
        view.post(new Runnable() { // from class: com.waze.gw.Gateway.13
            @Override // java.lang.Runnable
            public void run() {
                try {
                    view.setPivotX(0.0f);
                    view.setPivotY(view.getHeight());
                    view.setScaleX(fMax);
                    view.setScaleY(fMax);
                    view.invalidate();
                } catch (Throwable th) {
                }
            }
        });
    }

    public static void refreshNativeSpeedoSize() {
        View view = nativeSpeedo;
        if (view != null) {
            applyNativeSpeedoSize(view);
        }
    }

    public static void applyNativeSpeedoTextColor(View view) {
        if (view != null) {
            if (!pref("float_speed_current_ambient", false)) {
                return;
            }
            try {
                TextView textViewNativeSpeedoText = nativeSpeedoText(view, "speedText");
                TextView textViewNativeSpeedoText2 = nativeSpeedoText(view, "speedUnits");
                Context context = view.getContext();
                int identifier = context.getResources().getIdentifier("RedSweet", "color", context.getPackageName());
                int color = identifier != 0 ? context.getResources().getColor(identifier) : -44462;
                boolean z = hudLimit >= 10 && hudSpeed > hudLimit;
                if (!z && textViewNativeSpeedoText != null && hudSpeed < 0) {
                    z = textViewNativeSpeedoText.getCurrentTextColor() == color;
                }
                if (!z) {
                    color = AmbientTheme.color(context);
                }
                if (textViewNativeSpeedoText != null) {
                    textViewNativeSpeedoText.setTextColor(color);
                }
                if (textViewNativeSpeedoText2 != null) {
                    textViewNativeSpeedoText2.setTextColor(color);
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextView nativeSpeedoText(View view, String str) {
        try {
            Context context = view.getContext();
            int identifier = context.getResources().getIdentifier(str, TtmlNode.ATTR_ID, context.getPackageName());
            if (identifier == 0) {
                identifier = context.getResources().getIdentifier(str, TtmlNode.ATTR_ID, "com.waze");
            }
            View viewFindViewById = identifier == 0 ? null : view.findViewById(identifier);
            if (viewFindViewById instanceof TextView) {
                return (TextView) viewFindViewById;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static void refreshNativeSpeedoTextColor() {
        final View view = nativeSpeedo;
        if (view == null) {
            return;
        }
        if (pref("float_speed_current_ambient", false)) {
            applyNativeSpeedoTextColor(view);
        } else {
            view.post(new Runnable() { // from class: com.waze.gw.Gateway.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Context context = view.getContext();
                        int identifier = context.getResources().getIdentifier("White", "color", context.getPackageName());
                        int identifier2 = context.getResources().getIdentifier("RedSweet", "color", context.getPackageName());
                        int color = identifier != 0 ? context.getResources().getColor(identifier) : -1;
                        int color2 = identifier2 != 0 ? context.getResources().getColor(identifier2) : -44462;
                        TextView textViewNativeSpeedoText = Gateway.nativeSpeedoText(view, "speedText");
                        TextView textViewNativeSpeedoText2 = Gateway.nativeSpeedoText(view, "speedUnits");
                        if (textViewNativeSpeedoText != null) {
                            if (Gateway.hudLimit < 10 || Gateway.hudSpeed <= Gateway.hudLimit) {
                                color2 = color;
                            }
                            textViewNativeSpeedoText.setTextColor(color2);
                        }
                        if (textViewNativeSpeedoText2 != null) {
                            textViewNativeSpeedoText2.setTextColor(color);
                        }
                    } catch (Throwable th) {
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyNativeSpeedoVisibility(final View view) {
        if (view == null) {
            return;
        }
        final boolean zPref = pref("native_speedo_visible", true);
        view.post(new Runnable() { // from class: com.waze.gw.Gateway.15
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                try {
                    view.setAlpha(zPref ? 1.0f : 0.0f);
                    view.setEnabled(zPref);
                    view.setLongClickable(zPref);
                    View view2 = view;
                    if (zPref) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    view2.setImportantForAccessibility(i2);
                    view.invalidate();
                } catch (Throwable th) {
                }
            }
        });
    }

    public static void refreshNativeSpeedoVisibility() {
        View view = nativeSpeedo;
        if (view != null) {
            applyNativeSpeedoVisibility(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addMapOverspeedEffect(View view) {
        FrameLayout frameLayout;
        Vignette vignette;
        try {
            View rootView = view.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewFindViewById;
            } else if (!(rootView instanceof FrameLayout)) {
                return;
            } else {
                frameLayout = (FrameLayout) rootView;
            }
            View viewFindViewWithTag = frameLayout.findViewWithTag("map_overspeed_vignette");
            if (viewFindViewWithTag instanceof Vignette) {
                vignette = (Vignette) viewFindViewWithTag;
            } else {
                vignette = new Vignette(view.getContext());
                vignette.setTag("map_overspeed_vignette");
                vignette.setEdgeAlpha(120);
                frameLayout.addView(vignette, new FrameLayout.LayoutParams(-1, -1));
            }
            vignette.setEdgeAlpha(120);
            mapOverspeedVignette = new WeakReference<>(vignette);
            updateMapOverspeedEffect(hudSpeed, hudLimit);
        } catch (Throwable th) {
        }
    }

    private static void updateMapOverspeedEffect(int i2, int i3) {
        final Vignette vignette = mapOverspeedVignette.get();
        if (vignette == null) {
            return;
        }
        final boolean z = false;
        final int iPrefInt = prefInt("map_overspeed_effect_mode", 0);
        if (iPrefInt != 0 && i3 >= 10 && i2 > i3) {
            z = true;
        }
        vignette.post(new Runnable() { // from class: com.waze.gw.Gateway.16
            @Override // java.lang.Runnable
            public void run() {
                if (vignette.isAttachedToWindow()) {
                    vignette.setMode(iPrefInt);
                    vignette.setActive(z);
                }
            }
        });
    }

    public static void onMapOverspeedSettingChanged() {
        updateMapOverspeedEffect(hudSpeed, hudLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addFloatSpeedo(View view) {
        FrameLayout frameLayout;
        try {
            View rootView = view.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewFindViewById;
            } else if (!(rootView instanceof FrameLayout)) {
                return;
            } else {
                frameLayout = (FrameLayout) rootView;
            }
            View viewFindViewWithTag = frameLayout.findViewWithTag("float_speedo");
            if (viewFindViewWithTag instanceof FloatSpeedo) {
                attachResizeClamp(frameLayout, (FloatSpeedo) viewFindViewWithTag);
                return;
            }
            Context context = view.getContext();
            float f2 = context.getResources().getDisplayMetrics().density;
            FloatSpeedo floatSpeedo = new FloatSpeedo(context);
            floatSpeedo.setTag("float_speedo");
            SharedPreferences sharedPreferencesPrefs = prefs();
            int i2 = sharedPreferencesPrefs != null ? sharedPreferencesPrefs.getInt("fs_x", (int) (16.0f * f2)) : (int) (16.0f * f2);
            int i3 = sharedPreferencesPrefs != null ? sharedPreferencesPrefs.getInt("fs_y", (int) (f2 * 130.0f)) : (int) (f2 * 130.0f);
            floatSpeedo.desiredX = i2;
            floatSpeedo.desiredY = i3;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i3;
            frameLayout.addView(floatSpeedo, layoutParams);
            attachResizeClamp(frameLayout, floatSpeedo);
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addUpcomingAlertRail(View view) {
        FrameLayout frameLayout;
        try {
            View rootView = view.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewFindViewById;
            } else if (!(rootView instanceof FrameLayout)) {
                return;
            } else {
                frameLayout = (FrameLayout) rootView;
            }
            View viewFindViewWithTag = frameLayout.findViewWithTag("upcoming_alert_rail");
            if (viewFindViewWithTag instanceof UpcomingAlertRail) {
                ((UpcomingAlertRail) viewFindViewWithTag).attachToRoot(frameLayout);
                return;
            }
            UpcomingAlertRail upcomingAlertRail = new UpcomingAlertRail(view.getContext());
            upcomingAlertRail.setTag("upcoming_alert_rail");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388659;
            frameLayout.addView(upcomingAlertRail, layoutParams);
            upcomingAlertRail.attachToRoot(frameLayout);
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addGoogleMapsButton(View view) {
        final FrameLayout frameLayout;
        final ImageButton imageButton;
        try {
            View rootView = view.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewFindViewById;
            } else if (!(rootView instanceof FrameLayout)) {
                return;
            } else {
                frameLayout = (FrameLayout) rootView;
            }
            View viewFindViewWithTag = frameLayout.findViewWithTag("google_maps_nav_button");
            if (viewFindViewWithTag instanceof ImageButton) {
                imageButton = (ImageButton) viewFindViewWithTag;
            } else {
                imageButton = new ImageButton(view.getContext());
                imageButton.setTag("google_maps_nav_button");
                imageButton.setContentDescription("Mở tuyến đường này trong Google Maps");
                imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageButton.setPadding(dp(imageButton, 10), dp(imageButton, 10), dp(imageButton, 10), dp(imageButton, 10));
                imageButton.setElevation(dp(imageButton, 8));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(-460036);
                gradientDrawable.setStroke(dp(imageButton, 1), -2564376);
                imageButton.setBackground(gradientDrawable);
                try {
                    imageButton.setImageDrawable(view.getContext().getPackageManager().getApplicationIcon(AssistantConstants.GMM_PACKAGE));
                } catch (Throwable th) {
                    imageButton.setImageResource(R.drawable.ic_menu_directions);
                }
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.Gateway.17
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Gateway.openGoogleMapsNavigation(view2.getContext());
                    }
                });
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(imageButton, 56), dp(imageButton, 56));
                layoutParams.gravity = 8388661;
                frameLayout.addView(imageButton, layoutParams);
                frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.gw.Gateway.18
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        Gateway.positionGoogleMapsButton(frameLayout, imageButton);
                    }
                });
            }
            googleMapsButton = new WeakReference<>(imageButton);
            positionGoogleMapsButton(frameLayout, imageButton);
            refreshGoogleMapsButton();
        } catch (Throwable th2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void positionGoogleMapsButton(FrameLayout frameLayout, ImageButton imageButton) {
        if (frameLayout == null || imageButton == null) {
            return;
        }
        try {
            ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                WindowInsets rootWindowInsets = frameLayout.getRootWindowInsets();
                layoutParams2.topMargin = Math.min((rootWindowInsets != null ? Math.max(0, rootWindowInsets.getSystemWindowInsetTop()) : 0) + dp(imageButton, frameLayout.getWidth() > frameLayout.getHeight() ? 102 : 240), Math.max(0, frameLayout.getHeight() - dp(imageButton, 64)));
                layoutParams2.rightMargin = dp(imageButton, 14);
                layoutParams2.gravity = 8388661;
                imageButton.setLayoutParams(layoutParams2);
            }
        } catch (Throwable th) {
        }
    }

    public static void refreshGoogleMapsButton() {
        final ImageButton imageButton = googleMapsButton.get();
        if (imageButton == null) {
            return;
        }
        final boolean z = false;
        if (pref("google_maps_nav_button", false) && hudNavigating && googleMapsDestinationLatE6 != Integer.MIN_VALUE && googleMapsDestinationLonE6 != Integer.MIN_VALUE) {
            z = true;
        }
        imageButton.post(new Runnable() { // from class: com.waze.gw.Gateway.19
            @Override // java.lang.Runnable
            public void run() {
                imageButton.setVisibility(z ? 0 : 8);
                imageButton.setEnabled(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void openGoogleMapsNavigation(Context context) {
        if (context == null || !hudNavigating) {
            return;
        }
        int i2 = googleMapsDestinationLatE6;
        int i3 = googleMapsDestinationLonE6;
        if (i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) {
            return;
        }
        Locale locale = Locale.US;
        double d2 = i2;
        Double.isNaN(d2);
        Double dValueOf = Double.valueOf(d2 / 1000000.0d);
        double d3 = i3;
        Double.isNaN(d3);
        String str = String.format(locale, "%.6f,%.6f", dValueOf, Double.valueOf(d3 / 1000000.0d));
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("google.navigation:q=" + str + "&mode=d"));
            intent.setPackage(AssistantConstants.GMM_PACKAGE);
            intent.addFlags(268435456);
            context.startActivity(intent);
            Log.i(TAG, "Opened Google Maps driving destination=" + str);
        } catch (Throwable th) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/dir/?api=1&destination=" + str + "&travelmode=driving"));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Throwable th2) {
                Toast.makeText(context, "Không mở được Google Maps", 0).show();
            }
        }
    }

    private static void attachResizeClamp(FrameLayout frameLayout, final FloatSpeedo floatSpeedo) {
        if (floatSpeedo.getTag(2130706433) != null) {
            return;
        }
        floatSpeedo.setTag(2130706433, Boolean.TRUE);
        frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.gw.Gateway.20
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = i4 - i2;
                int i11 = i5 - i3;
                if (i10 <= 0 || i11 <= 0 || floatSpeedo.getWidth() <= 0 || floatSpeedo.getHeight() <= 0 || floatSpeedo.desiredX < 0 || floatSpeedo.desiredY < 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = floatSpeedo.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    float scaleX = floatSpeedo.getScaleX() > 0.0f ? floatSpeedo.getScaleX() : 1.0f;
                    int width = (int) (floatSpeedo.getWidth() * scaleX);
                    int iMax = Math.max(0, Math.min(floatSpeedo.desiredX, Math.max(0, i10 - width)));
                    int iMax2 = Math.max(0, Math.min(floatSpeedo.desiredY, Math.max(0, i11 - ((int) (floatSpeedo.getHeight() * scaleX)))));
                    if (iMax != layoutParams2.leftMargin || iMax2 != layoutParams2.topMargin) {
                        layoutParams2.leftMargin = iMax;
                        layoutParams2.topMargin = iMax2;
                        floatSpeedo.setLayoutParams(layoutParams2);
                    }
                }
            }
        });
    }

    private static int dp(View view, int i2) {
        return (int) ((i2 * view.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addModReport(View view) {
        try {
            View rootView = view.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                rootView = viewFindViewById;
            } else if (!(rootView instanceof FrameLayout)) {
                return;
            }
            ModReport.attach((FrameLayout) rootView, false);
        } catch (Throwable th) {
        }
    }

    public static void attachSettingsButton(View view) {
        if (view == null) {
            return;
        }
        try {
            if (!modEnabled(view.getContext())) {
                return;
            }
            View viewFindViewById = view.findViewById(com.waze.R.id.settingsLinearLayout);
            if (viewFindViewById instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) viewFindViewById;
                if (linearLayout.findViewWithTag("mod_settings_row") != null) {
                    return;
                }
                final Context context = view.getContext();
                float f2 = context.getResources().getDisplayMetrics().density;
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setTag("mod_settings_row");
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                float f3 = f2 * 16.0f;
                linearLayout2.setPadding((int) (10.0f * f2), 0, (int) f3, 0);
                linearLayout2.setClickable(true);
                linearLayout2.setFocusable(true);
                linearLayout2.setContentDescription("Cài đặt Mod");
                TypedValue typedValue = new TypedValue();
                if (context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) && typedValue.resourceId != 0) {
                    linearLayout2.setBackgroundResource(typedValue.resourceId);
                }
                TextView textView = new TextView(context);
                textView.setText("⚙");
                textView.setTextColor(-1);
                textView.setTextSize(20.0f);
                textView.setGravity(17);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(-419492483);
                gradientDrawable.setStroke((int) (2.0f * f2), 1728053247);
                textView.setBackground(gradientDrawable);
                int i2 = (int) ((40.0f * f2) + 0.5f);
                linearLayout2.addView(textView, new LinearLayout.LayoutParams(i2, i2));
                TextView textView2 = new TextView(context);
                textView2.setText("Cài đặt Mod");
                textView2.setTextSize(16.0f);
                textView2.setGravity(16);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
                layoutParams.leftMargin = (int) (f3 + 0.5f);
                linearLayout2.addView(textView2, layoutParams);
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.Gateway.21
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Gateway.openModSettings(context);
                    }
                });
                linearLayout.addView(linearLayout2, Math.min(1, linearLayout.getChildCount()), new LinearLayout.LayoutParams(-1, (int) ((f2 * 60.0f) + 0.5f)));
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addParkingSign(View view) {
        FrameLayout frameLayout;
        try {
            View rootView = view.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewFindViewById;
            } else if (!(rootView instanceof FrameLayout)) {
                return;
            } else {
                frameLayout = (FrameLayout) rootView;
            }
            if (frameLayout.findViewWithTag("parking_sign") != null) {
                return;
            }
            final Context context = view.getContext();
            float f2 = context.getResources().getDisplayMetrics().density;
            int i2 = (int) (72.0f * f2);
            final ImageView imageView = new ImageView(context);
            imageView.setTag("parking_sign");
            imageView.setVisibility(8);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 8388629;
            layoutParams.rightMargin = (int) (f2 * 18.0f);
            frameLayout.addView(imageView, layoutParams);
            parkingSign = imageView;
            parkingTick = new Handler(Looper.getMainLooper());
            final Handler handler = parkingTick;
            parkingTick.post(new Runnable() { // from class: com.waze.gw.Gateway.22
                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmapPin;
                    try {
                        if (Gateway.parkingRestriction > 0 && Gateway.pref("parking_test", false)) {
                            String str = Gateway.parkingRestriction == 1 ? "no_parking" : "no_stopping_and_parking";
                            if (imageView.getDrawable() == null && (bitmapPin = Signs.pin(context, str)) != null) {
                                imageView.setImageBitmap(bitmapPin);
                            }
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                            imageView.setImageDrawable(null);
                        }
                    } catch (Throwable th) {
                    }
                    handler.postDelayed(this, 500L);
                }
            });
        } catch (Throwable th) {
        }
    }

    private static void checkParkingRestriction() {
        Log.i(TAG, "parking: speed slow on segment " + (hudSegmentId >> 32) + "->" + (hudSegmentId & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    private static Object rtMgr() throws Exception {
        return Class.forName("com.waze.rtalerts.RtAlertsNativeManager").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    }

    public static void warmMapProblems() {
        Class<?> cls;
        if (modEnabled() && mpTypes == null) {
            try {
                Object objRtMgr = rtMgr();
                try {
                    cls = Class.forName("com.waze.rtalerts.q");
                } catch (Throwable th) {
                    cls = Class.forName("com.waze.rtalerts.RtAlertsNativeManager$e");
                }
                objRtMgr.getClass().getMethod("getMapProblems", cls).invoke(objRtMgr, Proxy.newProxyInstance(objRtMgr.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.waze.gw.Gateway.23
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
                    @Override // java.lang.reflect.InvocationHandler
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
                        /*
                            r5 = this;
                            java.lang.String r6 = "WazeGW"
                            r7 = 0
                            r0 = 0
                            if (r8 == 0) goto L17
                            int r1 = r8.length     // Catch: java.lang.Throwable -> L14
                            if (r1 <= 0) goto L17
                            r1 = r8[r0]     // Catch: java.lang.Throwable -> L14
                            boolean r1 = r1 instanceof java.lang.Object[]     // Catch: java.lang.Throwable -> L14
                            if (r1 == 0) goto L17
                            r8 = r8[r0]     // Catch: java.lang.Throwable -> L14
                            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch: java.lang.Throwable -> L14
                            goto L18
                        L14:
                            r8 = move-exception
                            goto L8a
                        L17:
                            r8 = r7
                        L18:
                            if (r8 == 0) goto L90
                            int r1 = r8.length     // Catch: java.lang.Throwable -> L14
                            if (r1 <= 0) goto L90
                            int r1 = r8.length     // Catch: java.lang.Throwable -> L14
                            int[] r1 = new int[r1]     // Catch: java.lang.Throwable -> L14
                            int r2 = r8.length     // Catch: java.lang.Throwable -> L14
                            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L14
                        L24:
                            int r3 = r8.length     // Catch: java.lang.Throwable -> L14
                            if (r0 >= r3) goto L5b
                            r3 = r8[r0]     // Catch: java.lang.Throwable -> L14
                            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L14
                            java.lang.String r4 = "type"
                            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch: java.lang.Throwable -> L14
                            r4 = r8[r0]     // Catch: java.lang.Throwable -> L14
                            int r3 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L14
                            r1[r0] = r3     // Catch: java.lang.Throwable -> L14
                            r3 = r8[r0]     // Catch: java.lang.Throwable -> L14
                            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L14
                            java.lang.String r4 = "description"
                            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch: java.lang.Throwable -> L14
                            r4 = r8[r0]     // Catch: java.lang.Throwable -> L14
                            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L14
                            if (r3 == 0) goto L54
                            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L14
                            goto L56
                        L54:
                            java.lang.String r3 = ""
                        L56:
                            r2[r0] = r3     // Catch: java.lang.Throwable -> L14
                            int r0 = r0 + 1
                            goto L24
                        L5b:
                            com.waze.gw.Gateway.m24487$$Nest$sfputmpDescs(r2)     // Catch: java.lang.Throwable -> L14
                            com.waze.gw.Gateway.m24488$$Nest$sfputmpTypes(r1)     // Catch: java.lang.Throwable -> L14
                            java.lang.String r8 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> L14
                            java.lang.String r0 = java.util.Arrays.toString(r2)     // Catch: java.lang.Throwable -> L14
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
                            r1.<init>()     // Catch: java.lang.Throwable -> L14
                            java.lang.String r2 = "mapProblems types="
                            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L14
                            java.lang.StringBuilder r8 = r1.append(r8)     // Catch: java.lang.Throwable -> L14
                            java.lang.String r1 = " labels="
                            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L14
                            java.lang.StringBuilder r8 = r8.append(r0)     // Catch: java.lang.Throwable -> L14
                            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L14
                            android.util.Log.i(r6, r8)     // Catch: java.lang.Throwable -> L14
                            goto L90
                        L8a:
                            java.lang.String r0 = "mapProblems parse"
                            android.util.Log.w(r6, r0, r8)
                            goto L91
                        L90:
                        L91:
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.Gateway.AnonymousClass23.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                    }
                }));
            } catch (Throwable th2) {
                Log.w(TAG, "warmMapProblems", th2);
            }
        }
    }

    private static int generalMapType() {
        int[] iArr = mpTypes;
        String[] strArr = mpDescs;
        if (iArr == null || strArr == null || iArr.length <= 0) {
            return 0;
        }
        String[] strArr2 = {"khác", "chung", "general", "other", "misc", "còn lại"};
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String lowerCase = strArr[i2] != null ? strArr[i2].toLowerCase() : "";
            for (int i3 = 0; i3 < 6; i3++) {
                if (lowerCase.contains(strArr2[i3])) {
                    return iArr[i2];
                }
            }
        }
        return iArr[0];
    }

    public static void reportWrongSpeed(int i2) {
        if (trustedBuild()) {
            int i3 = hudLimit;
            submitReport("báo sai tốc độ: " + i2 + " km/h", "Sai giới hạn tốc độ. Đúng: " + i2 + " km/h" + (i3 >= 10 ? " (Waze: " + i3 + ")" : "") + ". [báo tự động]");
        }
    }

    public static void reportIssue(String str, String str2) {
        if (trustedBuild()) {
            submitReport(str, str2);
        }
    }

    private static void submitReport(final String str, String str2) {
        final String str3;
        toast("Đang gửi " + str);
        warmMapProblems();
        try {
            final Object objRtMgr = rtMgr();
            final int iGeneralMapType = generalMapType();
            try {
                Class<?> cls = Class.forName("h.g.a.l");
                final Method method = objRtMgr.getClass().getMethod("reportMapIssue", String.class, Integer.TYPE, Boolean.TYPE);
                str3 = str2;
                try {
                    objRtMgr.getClass().getMethod("setAndRetrieveReportLocation", cls).invoke(objRtMgr, Proxy.newProxyInstance(objRtMgr.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.waze.gw.Gateway.24
                        boolean done;

                        @Override // java.lang.reflect.InvocationHandler
                        public Object invoke(Object obj, Method method2, Object[] objArr) {
                            if (!this.done) {
                                this.done = true;
                                try {
                                    method.invoke(objRtMgr, str3, Integer.valueOf(iGeneralMapType), Boolean.TRUE);
                                    Log.i(Gateway.TAG, "reportMapIssue OK type=" + iGeneralMapType + " '" + str3 + "'");
                                    Gateway.toast("✓ Đã gửi " + str);
                                    return null;
                                } catch (Throwable th) {
                                    Log.w(Gateway.TAG, "reportMapIssue", th);
                                    Gateway.toast("Báo lỗi thất bại");
                                    return null;
                                }
                            }
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    try {
                        final Method declaredMethod = objRtMgr.getClass().getDeclaredMethod("setAndRetrieveReportLocationNTV", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Class.forName("com.waze.NativeManager").getMethod("Post", Runnable.class).invoke(null, new Runnable() { // from class: com.waze.gw.Gateway.25
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    declaredMethod.invoke(objRtMgr, new Object[0]);
                                } catch (Throwable th2) {
                                }
                            }
                        });
                        objRtMgr.getClass().getMethod("reportMapIssue", String.class, Integer.TYPE).invoke(objRtMgr, str3, Integer.valueOf(iGeneralMapType));
                        Log.i(TAG, "reportMapIssue(4.x) OK type=" + iGeneralMapType + " '" + str3 + "'");
                        toast("✓ Đã gửi " + str);
                    } catch (Throwable th2) {
                        Log.w(TAG, "reportIssue 4.x", th2);
                        toast("Báo lỗi thất bại");
                    }
                }
            } catch (Throwable th3) {
                str3 = str2;
            }
        } catch (Throwable th4) {
            Log.w(TAG, "reportIssue init", th4);
            toast("Báo lỗi thất bại");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toast(final String str) {
        final Context contextCtx = ctx();
        if (contextCtx == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.waze.gw.Gateway.26
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Toast.makeText(contextCtx, str, 0).show();
                } catch (Throwable th) {
                }
            }
        });
    }

    private static String safe(String str) {
        return str == null ? "" : str;
    }

    private static boolean isActiveAverageZoneAlert(String str, String str2, String str3) {
        String strNormalizeAlertText = normalizeAlertText(safe(str) + " " + safe(str2));
        if (!(strNormalizeAlertText.contains("average") || strNormalizeAlertText.contains("french") || strNormalizeAlertText.contains("cam vuot"))) {
            return false;
        }
        String strNormalizeAlertText2 = normalizeAlertText(str3);
        return strNormalizeAlertText2.startsWith("trong ") || strNormalizeAlertText2.contains(" trong ") || strNormalizeAlertText2.startsWith("remaining ") || strNormalizeAlertText2.contains(" remaining ");
    }

    private static String normalizeAlertText(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toLowerCase(Locale.US).trim();
        } catch (Throwable th) {
            return str.toLowerCase(Locale.US).trim();
        }
    }

    private static String resolveIcon(int i2, String str) {
        String lowerCase = str == null ? "" : str.toLowerCase();
        if (lowerCase.contains("railway") || lowerCase.contains("railroad") || lowerCase.contains("train")) {
            return "bigpin_railroad";
        }
        if (i2 != 10) {
            return str != null ? str : "";
        }
        if (lowerCase.contains("red_light") || lowerCase.contains("traffic_light")) {
            return "icon_report_camera_trafficlight";
        }
        return lowerCase.contains("fake") ? "icon_report_camera_fake" : "icon_report_camera_speed";
    }

    private static int heldSpeedDropRemaining(long j2) {
        long jMax = Math.max(0L, j2 - heldSpeedDropAtMs);
        double dMax = Math.max(0, hudSpeed);
        Double.isNaN(dMax);
        double d2 = dMax / 3.6d;
        String lowerCase = hudUnits == null ? "" : hudUnits.toLowerCase(Locale.US);
        if (lowerCase.contains("mph") || lowerCase.contains("mi/h")) {
            double dMax2 = Math.max(0, hudSpeed);
            Double.isNaN(dMax2);
            d2 = 0.44704d * dMax2;
        }
        int i2 = heldSpeedDropMeters;
        double d3 = jMax;
        Double.isNaN(d3);
        return i2 - ((int) Math.round((d2 * d3) / 1000.0d));
    }

    private static void clearHeldSpeedDrop() {
        heldSpeedDropKey = "";
        heldSpeedDropValue = -1;
        heldSpeedDropMeters = -1;
        heldSpeedDropFromLimit = -1;
        heldSpeedDropAtMs = 0L;
    }

    private static void clearSpeedDropRouteState() {
        clearHeldSpeedDrop();
        synchronized (Gateway.class) {
            List<String> list = nativeHudAlerts;
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || !str.startsWith("speeddrop_")) {
                    arrayList.add(str);
                }
            }
            nativeHudAlerts = arrayList;
            mergeHudAlertsLocked();
        }
    }

    private static String fmtDist(int i2) {
        if (i2 < 0) {
            return "";
        }
        if (i2 < 1000) {
            return i2 + CmcdData.OBJECT_TYPE_MANIFEST;
        }
        Locale locale = Locale.US;
        double d2 = i2;
        Double.isNaN(d2);
        return String.format(locale, "%.1fkm", Double.valueOf(d2 / 1000.0d));
    }

    private static int parseDistM(String str) {
        if (str == null) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("([0-9]+(?:[.,][0-9]+)?)\\s*(km|m)", 2).matcher(str);
            int i2 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                if (strGroup != null && strGroup2 != null) {
                    double d2 = Double.parseDouble(strGroup.replace(',', '.'));
                    if ("km".equalsIgnoreCase(strGroup2)) {
                        d2 *= 1000.0d;
                    }
                    i2 = (int) d2;
                }
            }
            return i2;
        } catch (Throwable th) {
            return -1;
        }
    }

    private static int trailingInt(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        while (length > 0) {
            int i2 = length - 1;
            if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                break;
            }
            length--;
        }
        if (length == str.length()) {
            return -1;
        }
        try {
            return Integer.parseInt(str.substring(length));
        } catch (Throwable th) {
            return -1;
        }
    }

    private static boolean voiceSpeedEnabled(String str, int i2) {
        if (i2 < 10 || i2 > 120) {
            return false;
        }
        return pref(str + i2, true);
    }

    static boolean playNextSpeedAsset(int i2) {
        if (i2 < 10 || i2 > 120 || i2 % 10 != 0) {
            return false;
        }
        return playCustomOrAsset("next_" + i2, voiceDir() + "next_speed_" + i2 + ".mp3");
    }

    private static boolean playOverspeedAlert() {
        return playCustomOrAsset("overspeed", voiceDir() + "over_speed_limit.mp3");
    }

    static boolean previewOverspeedAlert() {
        return playOverspeedAlert();
    }

    static long previewOverspeedDurationMs() {
        return customOrAssetDurationMs("overspeed", voiceDir() + "over_speed_limit.mp3");
    }

    static boolean previewSpeedAlert(boolean z, int i2) {
        String str;
        if (i2 < 10 || i2 > 120) {
            return false;
        }
        if (playCustomOrAsset((z ? "next_" : "current_") + i2, voiceDir() + (z ? "next_speed_" : "current_speed_") + i2 + ".mp3")) {
            return true;
        }
        if (z) {
            str = "Phía trước giới hạn tốc độ ";
        } else {
            str = "Tốc độ giới hạn hiện tại ";
        }
        return WazeTtsBridge.speak(str + i2 + " ki lô mét trên giờ");
    }

    static long previewSpeedDurationMs(boolean z, int i2) {
        if (i2 < 10 || i2 > 120) {
            return 3500L;
        }
        return customOrAssetDurationMs((z ? "next_" : "current_") + i2, voiceDir() + (z ? "next_speed_" : "current_speed_") + i2 + ".mp3");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(2:7|(1:9))|10|(2:61|11)|(3:74|12|13)|35|(1:37)(1:38)|39|(1:41)|59|42|(2:67|46)|49) */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #7 {all -> 0x0048, blocks: (B:11:0x002a, B:35:0x0068, B:38:0x0073, B:27:0x0054, B:34:0x0061), top: B:61:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long customOrAssetDurationMs(java.lang.String r14, java.lang.String r15) {
        /*
            android.content.Context r1 = ctx()
            r2 = 3500(0xdac, double:1.729E-320)
            if (r1 != 0) goto L9
            return r2
        L9:
            java.lang.String r0 = com.waze.gw.CustomAlertAudio.modeKey(r14)
            r4 = 0
            int r0 = prefInt(r0, r4)
            r4 = 0
            if (r0 == 0) goto L23
            java.io.File r14 = com.waze.gw.CustomAlertAudio.file(r1, r14)
            long r6 = com.waze.gw.CustomAlertAudio.durationMs(r14)
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 <= 0) goto L23
            return r6
        L23:
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r14 = 0
            android.content.res.AssetManager r0 = r1.getAssets()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r15)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            java.io.FileDescriptor r9 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            long r10 = r6.getStartOffset()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            long r12 = r6.getLength()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r8.setDataSource(r9, r10, r12)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r14 = r6
            goto L68
        L43:
            r0 = move-exception
            r14 = r6
            goto L89
        L46:
            r0 = move-exception
            goto L4c
        L48:
            r0 = move-exception
            goto L89
        L4a:
            r0 = move-exception
            r6 = r14
        L4c:
            if (r6 == 0) goto L53
            r6.close()     // Catch: java.lang.Throwable -> L52
            goto L53
        L52:
            r0 = move-exception
        L53:
            java.io.File r15 = materializeAssetAudio(r1, r15)     // Catch: java.lang.Throwable -> L48
            if (r15 != 0) goto L61
            r8.release()     // Catch: java.lang.Throwable -> L5e
            goto L5f
        L5e:
            r0 = move-exception
        L5f:
            return r2
        L61:
            java.lang.String r15 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            r8.setDataSource(r15)     // Catch: java.lang.Throwable -> L48
        L68:
            r15 = 9
            java.lang.String r15 = r8.extractMetadata(r15)     // Catch: java.lang.Throwable -> L48
            if (r15 != 0) goto L73
            r0 = -1
            goto L77
        L73:
            long r0 = java.lang.Long.parseLong(r15)     // Catch: java.lang.Throwable -> L48
        L77:
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 <= 0) goto L7c
            r2 = r0
        L7c:
            r8.release()     // Catch: java.lang.Throwable -> L80
            goto L81
        L80:
            r0 = move-exception
        L81:
            if (r14 == 0) goto L88
            r14.close()     // Catch: java.lang.Throwable -> L87
            goto L88
        L87:
            r0 = move-exception
        L88:
            return r2
        L89:
            r8.release()     // Catch: java.lang.Throwable -> L8e
            goto L8f
        L8e:
            r0 = move-exception
        L8f:
            if (r14 == 0) goto L96
            r14.close()     // Catch: java.lang.Throwable -> L95
            goto L96
        L95:
            r0 = move-exception
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.Gateway.customOrAssetDurationMs(java.lang.String, java.lang.String):long");
    }

    private static boolean playCustomOrAsset(String str, String str2) {
        Context contextCtx = ctx();
        int iPrefInt = prefInt(CustomAlertAudio.modeKey(str), 0);
        if (contextCtx != null && iPrefInt != 0) {
            File file = CustomAlertAudio.file(contextCtx, str);
            if (CustomAlertAudio.hasAudio(contextCtx, str) && playFile(file)) {
                return true;
            }
            Log.w(TAG, "Custom alert audio unavailable slot=" + str + "; using built-in voice");
        }
        return play(str2);
    }

    static boolean previewCurrentSpeedAudio() {
        return playCustomOrAsset("current_60", new StringBuilder().append(voiceDir()).append("current_speed_60.mp3").toString()) || WazeTtsBridge.speak(new StringBuilder().append("Tốc độ giới hạn hiện tại ").append(60).append(" ki lô mét trên giờ").toString());
    }

    static boolean previewNavigationAudio() {
        return WazeTtsBridge.speak("Sau 200 mét, rẽ phải");
    }

    private static boolean play(String str) {
        IOException iOException;
        AssetFileDescriptor assetFileDescriptor;
        Throwable th;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        Context contextCtx = ctx();
        if (contextCtx == null) {
            return false;
        }
        try {
            if (mp == null) {
                mp = new MediaPlayer();
            } else {
                mp.reset();
            }
            mp.setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build());
            AssetFileDescriptor assetFileDescriptor2 = null;
            try {
                try {
                    assetFileDescriptorOpenFd = contextCtx.getAssets().openFd(str);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                iOException = e2;
                assetFileDescriptor = null;
            }
            try {
                mp.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                if (assetFileDescriptorOpenFd != null) {
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th3) {
                    }
                }
            } catch (IOException e3) {
                iOException = e3;
                assetFileDescriptor = assetFileDescriptorOpenFd;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (Throwable th4) {
                    }
                }
                File fileMaterializeAssetAudio = materializeAssetAudio(contextCtx, str);
                if (fileMaterializeAssetAudio == null) {
                    throw iOException;
                }
                mp.setDataSource(fileMaterializeAssetAudio.getAbsolutePath());
                Log.i(TAG, "Using extracted compressed audio asset=" + str);
                requestGuidanceFocus(contextCtx);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.waze.gw.Gateway.27
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Gateway.abandonGuidanceFocus();
                    }
                });
                mp.prepare();
                mp.start();
                Log.i(TAG, "audio started asset=" + str + " androidAuto=" + isAndroidAutoActive());
                return true;
            } catch (Throwable th5) {
                th = th5;
                assetFileDescriptor2 = assetFileDescriptorOpenFd;
                if (assetFileDescriptor2 == null) {
                    throw th;
                }
                try {
                    assetFileDescriptor2.close();
                    throw th;
                } catch (Throwable th6) {
                    throw th;
                }
            }
            requestGuidanceFocus(contextCtx);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.waze.gw.Gateway.27
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    Gateway.abandonGuidanceFocus();
                }
            });
            mp.prepare();
            mp.start();
            Log.i(TAG, "audio started asset=" + str + " androidAuto=" + isAndroidAutoActive());
            return true;
        } catch (Throwable th7) {
            abandonGuidanceFocus();
            Log.w(TAG, "audio failed asset=" + str, th7);
            return false;
        }
    }

    private static File materializeAssetAudio(Context context, String str) {
        long j2;
        if (context == null || str == null || str.length() == 0) {
            return null;
        }
        synchronized (assetAudioCacheLock) {
            File file = new File(context.getCacheDir(), "wazemod_asset_audio");
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            String strReplaceAll = str.substring(str.lastIndexOf(47) + 1).replaceAll("[^A-Za-z0-9._-]", "_");
            try {
                j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            } catch (Throwable th) {
                j2 = 0;
            }
            File file2 = new File(file, Long.toHexString(j2) + "_" + Integer.toHexString(str.hashCode()) + "_" + strReplaceAll);
            if (file2.isFile() && file2.length() > 0) {
                return file2;
            }
            File file3 = new File(file, file2.getName() + ".tmp");
            if (file3.exists()) {
                file3.delete();
            }
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        byte[] bArr = new byte[16384];
                        long j3 = 0;
                        while (true) {
                            int i2 = inputStreamOpen.read(bArr);
                            if (i2 >= 0) {
                                j3 += i2;
                                if (j3 > 16777216) {
                                    throw new IOException("asset audio too large");
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            } else {
                                fileOutputStream.getFD().sync();
                                fileOutputStream.close();
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                                if (j3 <= 0) {
                                    file3.delete();
                                    return null;
                                }
                                if (file2.exists() && !file2.delete()) {
                                    file3.delete();
                                    return null;
                                }
                                if (file3.renameTo(file2)) {
                                    return file2;
                                }
                                file3.delete();
                                return null;
                            }
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                file3.delete();
                Log.w(TAG, "Unable to extract compressed audio asset=" + str, th2);
                return null;
            }
        }
    }

    private static boolean playFile(File file) {
        Context contextCtx = ctx();
        if (contextCtx == null || file == null || !file.isFile()) {
            return false;
        }
        try {
            if (mp == null) {
                mp = new MediaPlayer();
            } else {
                mp.reset();
            }
            mp.setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build());
            mp.setDataSource(file.getAbsolutePath());
            requestGuidanceFocus(contextCtx);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.waze.gw.Gateway.28
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    Gateway.abandonGuidanceFocus();
                }
            });
            mp.prepare();
            mp.start();
            Log.i(TAG, "custom overspeed audio started androidAuto=" + isAndroidAutoActive());
            return true;
        } catch (Throwable th) {
            abandonGuidanceFocus();
            Log.w(TAG, "custom overspeed audio failed", th);
            return false;
        }
    }

    private static boolean isAndroidAutoActive() {
        return aaCarContext != null || AaSpeedo.isSurfaceActive();
    }

    private static void requestGuidanceFocus(Context context) {
        AudioManager audioManager;
        try {
            if ((!AudioMixPolicy.isMixEnabled(context) || isAndroidAutoActive()) && (audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build()).build();
                    audioFocusReq = audioFocusRequestBuild;
                    audioManager.requestAudioFocus(audioFocusRequestBuild);
                    return;
                }
                audioManager.requestAudioFocus(null, 3, 3);
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void abandonGuidanceFocus() {
        AudioManager audioManager;
        try {
            Context contextCtx = ctx();
            if (contextCtx == null || (audioManager = (AudioManager) contextCtx.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26 && audioFocusReq != null) {
                audioManager.abandonAudioFocusRequest((AudioFocusRequest) audioFocusReq);
                audioFocusReq = null;
            } else {
                audioManager.abandonAudioFocus(null);
            }
        } catch (Throwable th) {
        }
    }
}

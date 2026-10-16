package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.d.bs;
import com.waze.strings.DisplayStrings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_MASK = 7;
    private static final int COUNTRY_GROUP_SHIFT_2G = 3;
    private static final int COUNTRY_GROUP_SHIFT_3G = 6;
    private static final int COUNTRY_GROUP_SHIFT_4G = 9;
    private static final int COUNTRY_GROUP_SHIFT_5G_NSA = 12;
    private static final int COUNTRY_GROUP_SHIFT_5G_SA = 15;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final bn<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final bn<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final bn<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final bn<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final Context context;
    private String countryCode;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final bs<Integer, Long> initialBitrateEstimates;
    private final InitialBitrateSupplier initialBitrateSupplier;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final bn<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = bn.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final bn<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = bn.t(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* compiled from: WazeSource */
    public interface InitialBitrateSupplier {
        long getInitialBitrateEstimate(int i2);
    }

    static {
        Long lValueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = bn.t(lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = bn.t(2500000L, 1700000L, Long.valueOf(RemoteWorkManager.MAX_SESSION_TIMEOUT_MILLIS), 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = bn.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = bn.t(2700000L, lValueOf, 1600000L, 1300000L, 1000000L);
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i2, Clock clock, boolean z, InitialBitrateSupplier initialBitrateSupplier) {
        this.context = context == null ? null : context.getApplicationContext();
        this.initialBitrateEstimates = bs.e(map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i2);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        this.initialBitrateSupplier = initialBitrateSupplier;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = 1000000L;
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i3) throws Throwable {
                this.f$0.onNetworkTypeChanged(i3);
            }
        }, BackgroundExecutor.get());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static int getInitialBitrateCountryGroupAssignment(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 2091) {
            return str.equals("AL") ? 74825 : 74898;
        }
        if (iHashCode == 2092) {
            return str.equals("AM") ? 75418 : 74898;
        }
        if (iHashCode == 2102) {
            return str.equals("AW") ? 75986 : 74898;
        }
        if (iHashCode == 2103) {
            return str.equals("AX") ? 74896 : 74898;
        }
        if (iHashCode == 2111) {
            return str.equals("BA") ? 74313 : 74898;
        }
        if (iHashCode == 2112) {
            return str.equals("BB") ? 73745 : 74898;
        }
        if (iHashCode == 2135) {
            return str.equals("BY") ? 75473 : 74898;
        }
        if (iHashCode == 2136) {
            return str.equals("BZ") ? 74386 : 74898;
        }
        switch (iHashCode) {
            case DisplayStrings.DS_NEW_LOCATION_PERMISSION_BUTTON_SETTINGS /* 2083 */:
                return str.equals("AD") ? 73745 : 74898;
            case DisplayStrings.DS_ANDROID_AUTO_NOT_THERE /* 2084 */:
                return str.equals("AE") ? 50849 : 74898;
            case DisplayStrings.DS_ANDROID_AUTO_TTS_NO_HOME_WORK /* 2085 */:
                return str.equals("AF") ? 76004 : 74898;
            case DisplayStrings.DS_DRIVE_OVERVIEW_TRAFFIC_MINUTES /* 2086 */:
                return str.equals("AG") ? 76002 : 74898;
            default:
                switch (iHashCode) {
                    case DisplayStrings.DS_DRIVE_OVERVIEW_ALERT_TIP_TRAFFIC /* 2088 */:
                        return str.equals("AI") ? 73745 : 74898;
                    case DisplayStrings.DS_DRIVE_OVERVIEW_ALERT_TIP_HAZARD_FORMAT_PD /* 2094 */:
                        return str.equals("AO") ? 75555 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_POLICE_VISIBLE /* 2105 */:
                        return str.equals("AZ") ? 75476 : 74898;
                    case 2114:
                        return str.equals("BD") ? 83146 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD /* 2115 */:
                        return str.equals("BE") ? 69696 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_ON_ROAD /* 2116 */:
                        return str.equals("BF") ? 76060 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_ON_SHOULDER /* 2117 */:
                        return str.equals("BG") ? 69632 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_OBJECT /* 2118 */:
                        return str.equals("BH") ? 83545 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_CONSTRUCTION /* 2119 */:
                        return str.equals("BI") ? 76068 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_POTHOLE /* 2120 */:
                        return str.equals("BJ") ? 75428 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_ICE /* 2133 */:
                        return str.equals("BW") ? 73811 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_TURN_CLOSURE /* 2142 */:
                        return str.equals("CA") ? 111696 : 74898;
                    case 2145:
                        return str.equals("CD") ? 74907 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_SOS_MEDICAL_ISSUE /* 2152 */:
                        return str.equals("CK") ? 74386 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_GUARDIAN_PS_PS /* 2153 */:
                        return str.equals("CL") ? 74888 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_WEATHER_HAZARD /* 2154 */:
                        return str.equals("CM") ? 75996 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_SLIPPERY_ROAD /* 2155 */:
                        return str.equals("CN") ? 45634 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_EMERGENCY_VEHICLE /* 2156 */:
                        return str.equals("CO") ? 74970 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_CENTER /* 2159 */:
                        return str.equals("CR") ? 76066 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_PERMANENT_HAZARD_TOPES /* 2162 */:
                        return str.equals("CU") ? 76052 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_PERMANENT_HAZARD_TOLL_BOOTH /* 2163 */:
                        return str.equals("CV") ? 74266 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_PERMANENT_HAZARD_DANGEROUS_CURVE /* 2164 */:
                        return str.equals("CW") ? 73745 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_PERMANENT_HAZARD_FORK /* 2165 */:
                        return str.equals("CX") ? 74896 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_PERMANENT_HAZARD_LANES_MERGING /* 2166 */:
                        return str.equals("CY") ? 65601 : 74898;
                    case 2167:
                        return str.equals("CZ") ? 69760 : 74898;
                    case DisplayStrings.DS_ALERT_TITLE_PERMANENT_HAZARD_NARROW_BRIDGE /* 2177 */:
                        return str.equals("DE") ? 42248 : 74898;
                    case 2182:
                        return str.equals("DJ") ? 75476 : 74898;
                    case DisplayStrings.DS_ALERT_DESCRIPTION_REPORTED_BY_GOOGLE_MAPS /* 2183 */:
                        return str.equals("DK") ? 65664 : 74898;
                    case DisplayStrings.DS_PERMANENT_HAZARD_SETTINGS_LABEL /* 2185 */:
                        return str.equals("DM") ? 73745 : 74898;
                    case DisplayStrings.DS_PERSONAL_SAFETY_SETTINGS_LABEL /* 2187 */:
                        return str.equals("DO") ? 76067 : 74898;
                    case 2198:
                        return str.equals("DZ") ? 76059 : 74898;
                    case 2206:
                        return str.equals("EC") ? 74393 : 74898;
                    case 2208:
                        return str.equals("EE") ? 65536 : 74898;
                    case DisplayStrings.DS_REQUEST_CONTACTS_BODY /* 2210 */:
                        return str.equals("EG") ? 75491 : 74898;
                    case 2221:
                        return str.equals("ER") ? 74900 : 74898;
                    case 2222:
                        return str.equals("ES") ? 4096 : 74898;
                    case 2223:
                        return str.equals("ET") ? 84252 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_SETTINGS_BUTTON_TITLE /* 2243 */:
                        return str.equals("FI") ? 66048 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_INSTRUCTIONS /* 2244 */:
                        return str.equals("FJ") ? 75411 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_LINK_TITLE /* 2245 */:
                        return str.equals("FK") ? 74899 : 74898;
                    case 2247:
                        return str.equals("FM") ? 74004 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_MIC_INSTRUCTIONS /* 2249 */:
                        return str.equals("FO") ? 73872 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_FROM_PLANNED_DRIVE_TEXT /* 2252 */:
                        return str.equals("FR") ? 66121 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_ANDROID_GRANT_BUTTON_TITLE /* 2266 */:
                        return str.equals("GA") ? 73763 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_ANDROID_FROM_PLANNED_DRIVE_TITLE /* 2267 */:
                        return str.equals("GB") ? 74953 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_ANDROID_FROM_SYNC_CALENDAR_TITLE /* 2269 */:
                        return str.equals("GD") ? 73746 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_ANDROID_FROM_SYNC_CALENDAR_TEXT /* 2270 */:
                        return str.equals("GE") ? 74761 : 74898;
                    case DisplayStrings.DS_PERMISSIONS_INSTRUCTIONS_POPUP_LOCATION_ANDROID_LINK_TITLE /* 2271 */:
                        return str.equals("GF") ? 75475 : 74898;
                    case DisplayStrings.DS_NO_REPORTS_TEXT /* 2272 */:
                        return str.equals("GG") ? 74320 : 74898;
                    case DisplayStrings.DS_ADD_FAVORITES_POP_UP_TITLE /* 2273 */:
                        return str.equals("GH") ? 74971 : 74898;
                    case DisplayStrings.DS_ADD_FAVORITES_POP_UP_ADD_HOME_BTN /* 2274 */:
                        return str.equals("GI") ? 74256 : 74898;
                    case DisplayStrings.DS_ADD_FAVORITES_POP_UP_CANCEL_BTN /* 2277 */:
                        return str.equals("GL") ? 73873 : 74898;
                    case DisplayStrings.DS_WAZE_CORRUPT_FILE_SYSTEM_TITLE /* 2278 */:
                        return str.equals("GM") ? 75932 : 74898;
                    case DisplayStrings.DS_WAZE_CORRUPT_FILE_SYSTEM_TEXT /* 2279 */:
                        return str.equals("GN") ? 75043 : 74898;
                    case DisplayStrings.DS_ENTER_LANE_INSTRUCTION_RIGHT /* 2281 */:
                        return str.equals("GP") ? 75338 : 74898;
                    case DisplayStrings.DS_ENTER_LANE_INSTRUCTION_LEFT /* 2282 */:
                        return str.equals("GQ") ? 76068 : 74898;
                    case DisplayStrings.DS_ENTER_LANE_INSTRUCTION_STRAIGHT /* 2283 */:
                        return str.equals("GR") ? 69633 : 74898;
                    case DisplayStrings.DS_FOR_LANE_HOT /* 2285 */:
                        return str.equals("GT") ? 74378 : 74898;
                    case 2286:
                        return str.equals("GU") ? 79634 : 74898;
                    case 2288:
                        return str.equals("GW") ? 74852 : 74898;
                    case DisplayStrings.DS_STAY_ON_LANE_TITLE_HOT /* 2290 */:
                        return str.equals("GY") ? 75339 : 74898;
                    case 2307:
                        return str.equals("HK") ? 4616 : 74898;
                    case DisplayStrings.DS_CUI_CANT_OPEN_BROWSER_CLOSE_POPUP /* 2314 */:
                        return str.equals("HR") ? 65537 : 74898;
                    case DisplayStrings.DS_CUI_ONBOARDING_DAY_SELECT_SUNDAY /* 2316 */:
                        return str.equals("HT") ? 76068 : 74898;
                    case DisplayStrings.DS_CUI_ONBOARDING_DAY_SELECT_MONDAY /* 2317 */:
                        return str.equals("HU") ? 65536 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_LICENCE_PLATE_MISSING_BODY /* 2331 */:
                        return str.equals("ID") ? 141003 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_LICENCE_PLATE_MISSING_YES /* 2332 */:
                        return str.equals("IE") ? 70217 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_BODY /* 2339 */:
                        return str.equals("IL") ? 83601 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_YES /* 2340 */:
                        return str.equals("IM") ? 74256 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_CRITAIR_MISSING_NO /* 2341 */:
                        return str.equals("IN") ? 107721 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_CRITAIR_WRONG_TITLE /* 2342 */:
                        return str.equals("IO") ? 73875 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_CRITAIR_WRONG_YES /* 2344 */:
                        return str.equals("IQ") ? 74963 : 74898;
                    case DisplayStrings.DS_ROUTE_POPUP_CRITAIR_WRONG_NO /* 2345 */:
                        return str.equals("IR") ? 116436 : 74898;
                    case 2346:
                        return str.equals("IS") ? 65536 : 74898;
                    case 2347:
                        return str.equals("IT") ? 70728 : 74898;
                    case DisplayStrings.DS_PRIVACY_ADS_CONSENT_TEXT /* 2363 */:
                        return str.equals("JE") ? 74256 : 74898;
                    case 2371:
                        return str.equals("JM") ? 74466 : 74898;
                    case 2373:
                        return str.equals("JO") ? 74313 : 74898;
                    case 2374:
                        return str.equals("JP") ? 83608 : 74898;
                    case DisplayStrings.DS_PRIVACY_SETTINGS_ANDROID_LOCATION_USE /* 2394 */:
                        return str.equals("KE") ? 70227 : 74898;
                    case DisplayStrings.DS_PRIVACY_SETTINGS_ANDROID_LOCATION_DISCLAIMER /* 2396 */:
                        return str.equals("KG") ? 74826 : 74898;
                    case DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_TITLE /* 2397 */:
                        return str.equals("KH") ? 75009 : 74898;
                    case DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_RECENT_DESTINATIONS_TITLE /* 2398 */:
                        return str.equals("KI") ? 76052 : 74898;
                    case DisplayStrings.DS_PRIVACY_SETTINGS_ACCOUNT_AND_LOGIN_TITLE /* 2402 */:
                        return str.equals("KM") ? 74972 : 74898;
                    case DisplayStrings.DS_PRIVACY_SETTINGS_ACCOUNT_AND_LOGIN_DESCRIPTION /* 2403 */:
                        return str.equals("KN") ? 73745 : 74898;
                    case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_TEXT /* 2407 */:
                        return str.equals("KR") ? 149648 : 74898;
                    case DisplayStrings.DS_PRIVACY_ANDROID_Q_LOCATION_POPUP_YES_TEXT /* 2412 */:
                        return str.equals("KW") ? 65537 : 74898;
                    case DisplayStrings.DS_PRIVACY_ANDROID_Q_LOCATION_POPUP_TEXT /* 2414 */:
                        return str.equals("KY") ? 73745 : 74898;
                    case DisplayStrings.DS_PRIVACY_ANDROID_Q_LOCATION_POPUP_NO_TEXT /* 2415 */:
                        return str.equals("KZ") ? 78986 : 74898;
                    case DisplayStrings.DS_ACCOUNT_DETAILS_TITLE /* 2421 */:
                        return str.equals("LA") ? 75345 : 74898;
                    case DisplayStrings.DS_LOGIN_INFO_TITLE /* 2422 */:
                        return str.equals("LB") ? 74827 : 74898;
                    case DisplayStrings.DS_ACCOUNT_DETAILS_SAVE /* 2423 */:
                        return str.equals("LC") ? 74322 : 74898;
                    case DisplayStrings.DS_VEHICLE_TAXI_DESCRIPTION /* 2429 */:
                        return str.equals("LI") ? 74896 : 74898;
                    case DisplayStrings.DS_MAP_SETTINGS /* 2431 */:
                        return str.equals("LK") ? 83667 : 74898;
                    case DisplayStrings.DS_SHOW_TRAFFIC_V1 /* 2438 */:
                        return str.equals("LR") ? 76067 : 74898;
                    case DisplayStrings.DS_WHEN_TO_DISPLAY /* 2439 */:
                        return str.equals("LS") ? 75484 : 74898;
                    case DisplayStrings.DS_QUICK_ACCESS /* 2440 */:
                        return str.equals("LT") ? 66056 : 74898;
                    case DisplayStrings.DS_QUICK_SETTINGS_BOTTOM_BUTTON_TEXT /* 2441 */:
                        return str.equals("LU") ? 103620 : 74898;
                    case DisplayStrings.DS_ALWAYS_SHOW_CONTROLS /* 2442 */:
                        return str.equals("LV") ? 65536 : 74898;
                    case DisplayStrings.DS_COMPASS /* 2445 */:
                        return str.equals("LY") ? 75476 : 74898;
                    case 2452:
                        return str.equals("MA") ? 74331 : 74898;
                    case DisplayStrings.DS_SETTINGS_SOUNDS_OFF /* 2454 */:
                        return str.equals("MC") ? 73873 : 74898;
                    case DisplayStrings.DS_SETTINGS_SOUND_BRIEF_MODE /* 2455 */:
                        return str.equals("MD") ? 73729 : 74898;
                    case 2456:
                        return str.equals("ME") ? 78338 : 74898;
                    case DisplayStrings.DS_SETTING_VOLUME /* 2457 */:
                        return str.equals("MF") ? 75409 : 74898;
                    case DisplayStrings.DS_MUTE_DURING_CALLS /* 2458 */:
                        return str.equals("MG") ? 75491 : 74898;
                    case DisplayStrings.DS_MUSIC_CONTROL /* 2459 */:
                        return str.equals("MH") ? 75924 : 74898;
                    case DisplayStrings.DS_AVOID_DIFFICULT_ALWAYS /* 2462 */:
                        return str.equals("MK") ? 78337 : 74898;
                    case DisplayStrings.DS_AVOID_DIFFICULT_NEVER /* 2463 */:
                        return str.equals("ML") ? 74907 : 74898;
                    case DisplayStrings.DS_CAR_DETAILS /* 2464 */:
                        return str.equals("MM") ? 83667 : 74898;
                    case 2465:
                        return str.equals("MN") ? 74882 : 74898;
                    case 2466:
                        return str.equals("MO") ? 47376 : 74898;
                    case 2467:
                        return str.equals("MP") ? 74897 : 74898;
                    case 2468:
                        return str.equals("MQ") ? 75402 : 74898;
                    case 2469:
                        return str.equals("MR") ? 75996 : 74898;
                    case 2470:
                        return str.equals("MS") ? 74896 : 74898;
                    case 2471:
                        return str.equals("MT") ? 65536 : 74898;
                    case 2472:
                        return str.equals("MU") ? 74763 : 74898;
                    case DisplayStrings.DS_CAMERA_REPORT_SETTINGS_LANES /* 2473 */:
                        return str.equals("MV") ? 83539 : 74898;
                    case 2474:
                        return str.equals("MW") ? 74387 : 74898;
                    case DisplayStrings.DS_CAMERA_REPORT_SETTINGS_CARPOOL_LANE_CAMERA /* 2475 */:
                        return str.equals("MX") ? 80162 : 74898;
                    case DisplayStrings.DS_CAMERA_REPORT_SETTINGS_BUS_LANE_CAMERA /* 2476 */:
                        return str.equals("MY") ? 4865 : 74898;
                    case DisplayStrings.DS_CAMERA_REPORT_SETTINGS_DRIVING_BEHAVIOR /* 2477 */:
                        return str.equals("MZ") ? 74891 : 74898;
                    case DisplayStrings.DS_REPORT_RAILROAD /* 2483 */:
                        return str.equals("NA") ? 74979 : 74898;
                    case DisplayStrings.DS_REPORT_ANIMAL /* 2485 */:
                        return str.equals("NC") ? 75994 : 74898;
                    case DisplayStrings.DS_REPORT_TRAFFIC_JAMS /* 2487 */:
                        return str.equals("NE") ? 76068 : 74898;
                    case DisplayStrings.DS_REPORT_HAZARD_ON_ROAD /* 2488 */:
                        return str.equals("NF") ? 74899 : 74898;
                    case DisplayStrings.DS_REPORT_HAZARD_ON_SHOULDER /* 2489 */:
                        return str.equals("NG") ? 74403 : 74898;
                    case DisplayStrings.DS_REPORT_WEATHER_HAZARDS /* 2491 */:
                        return str.equals("NI") ? 76066 : 74898;
                    case DisplayStrings.DS_REPORT_ROAD_CONSTRUCTION /* 2494 */:
                        return str.equals("NL") ? 132874 : 74898;
                    case 2497:
                        return str.equals("NO") ? 65728 : 74898;
                    case DisplayStrings.DS_REPORT_DISPLAYS /* 2498 */:
                        return str.equals("NP") ? 75538 : 74898;
                    case DisplayStrings.DS_REPORT_ALERT_ON /* 2500 */:
                        return str.equals("NR") ? 76052 : 74898;
                    case DisplayStrings.DS_REPORT_HIGH_RISK_AREAS /* 2503 */:
                        return str.equals("NU") ? 74900 : 74898;
                    case DisplayStrings.DS_ALERTER_THANKS /* 2508 */:
                        return str.equals("NZ") ? 83008 : 74898;
                    case DisplayStrings.DS_TIME_TO_LEAVE_REMINDER /* 2526 */:
                        return str.equals("OM") ? 83034 : 74898;
                    case DisplayStrings.DS_ROAD_FEATURES_SETTINGS_HIGHWAY_CROSSWALK /* 2545 */:
                        return str.equals("PA") ? 75418 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_SOUND_ON_TITLE /* 2549 */:
                        return str.equals("PE") ? 80145 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_BRIEF_TITLE /* 2550 */:
                        return str.equals("PF") ? 74450 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_SMART_TITLE /* 2551 */:
                        return str.equals("PG") ? 75484 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_ALERTS_TITLE /* 2552 */:
                        return str.equals("PH") ? 42634 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_QUICK_SETTINGS_SHEET_VOICE_DIRECTIONS_TITLE /* 2555 */:
                        return str.equals("PK") ? 75483 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_QUICK_SETTINGS_SHEET_LISTEN_ON_TITLE /* 2556 */:
                        return str.equals("PL") ? 148609 : 74898;
                    case DisplayStrings.DS_VOICE_GUIDANCE_AAP_SETTINGS_AUDIO_DIRECTIONS_TITLE /* 2557 */:
                        return str.equals("PM") ? 74896 : 74898;
                    case DisplayStrings.DS_CARPLAY_SEARCH_MENU_TITLE /* 2562 */:
                        return str.equals("PR") ? 8834 : 74898;
                    case DisplayStrings.DS_CARPLAY_MENU_FAVORITE_NOT_SET_SUBTITLE /* 2563 */:
                        return str.equals("PS") ? 75363 : 74898;
                    case DisplayStrings.DS_CARPLAY_FAVORITES_MENU_TITLE /* 2564 */:
                        return str.equals("PT") ? 69632 : 74898;
                    case DisplayStrings.DS_CARPLAY_SEARCH_RESULTS_AD /* 2567 */:
                        return str.equals("PW") ? 74514 : 74898;
                    case 2569:
                        return str.equals("PY") ? 74897 : 74898;
                    case DisplayStrings.DS_CARPLAY_STOP /* 2576 */:
                        return str.equals("QA") ? 84257 : 74898;
                    case 2611:
                        return str.equals("RE") ? 71320 : 74898;
                    case DisplayStrings.DS_CARPLAY_CATEGORY_SEARCH_LIST_ITEM_FAVORITES /* 2621 */:
                        return str.equals("RO") ? 78400 : 74898;
                    case DisplayStrings.DS_CARPLAY_REPORT_GRID_MORE /* 2625 */:
                        return str.equals("RS") ? 74241 : 74898;
                    case DisplayStrings.DS_CARPLAY_LOGIN_ERROR_START_NEW_DRIVE_TITLE /* 2627 */:
                        return str.equals("RU") ? 111105 : 74898;
                    case DisplayStrings.DS_CARPLAY_LOGIN_ERROR_CONFIRM_BUTTON /* 2629 */:
                        return str.equals("RW") ? 73883 : 74898;
                    case 2638:
                        return str.equals("SA") ? 9291 : 74898;
                    case 2639:
                        return str.equals("SB") ? 75540 : 74898;
                    case 2640:
                        return str.equals("SC") ? 74900 : 74898;
                    case DisplayStrings.DS_CARPLAY_ROUTING_SETTINGS_TITLE /* 2641 */:
                        return str.equals("SD") ? 76060 : 74898;
                    case DisplayStrings.DS_CARPLAY_ROUTING_SETTINGS_AVOID_FERRIES /* 2642 */:
                        return str.equals("SE") ? 65536 : 74898;
                    case DisplayStrings.DS_CARPLAY_ROUTING_SETTINGS_AVOID_TOLLS /* 2644 */:
                        return str.equals("SG") ? 38618 : 74898;
                    case DisplayStrings.DS_CARPLAY_ROUTING_SETTINGS_ALLOW_TOLLS /* 2645 */:
                        return str.equals("SH") ? 74900 : 74898;
                    case DisplayStrings.DS_CARPLAY_ROUTING_SETTINGS_AVOID_HIGHWAYS /* 2646 */:
                        return str.equals("SI") ? 69632 : 74898;
                    case DisplayStrings.DS_CARPLAY_ROUTING_SETTINGS_ALLOW_HIGHWAYS /* 2647 */:
                        return str.equals("SJ") ? 74899 : 74898;
                    case DisplayStrings.DS_ALTERNATE_ROUTES_CONNECTED_TO_CARPLAY_DIALOG_TITLE /* 2648 */:
                        return str.equals("SK") ? 74312 : 74898;
                    case DisplayStrings.DS_ALTERNATE_ROUTES_CONNECTED_TO_CARPLAY_DIALOG_SUBTITLE /* 2649 */:
                        return str.equals("SL") ? 75476 : 74898;
                    case DisplayStrings.DS_ALTERNATE_ROUTES_CONNECTED_TO_CARPLAY_DIALOG_CLOSE /* 2650 */:
                        return str.equals("SM") ? 74896 : 74898;
                    case DisplayStrings.DS_dayInterval /* 2651 */:
                        return str.equals("SN") ? 74980 : 74898;
                    case DisplayStrings.DS_daysInterval /* 2652 */:
                        return str.equals("SO") ? 84178 : 74898;
                    case DisplayStrings.DS_minuteInterval /* 2655 */:
                        return str.equals("SR") ? 74530 : 74898;
                    case 2656:
                        return str.equals("SS") ? 75932 : 74898;
                    case 2657:
                        return str.equals("ST") ? 74834 : 74898;
                    case DisplayStrings.DS_kilometersAbbr /* 2659 */:
                        return str.equals("SV") ? 74394 : 74898;
                    case DisplayStrings.DS_metersAbbr /* 2661 */:
                        return str.equals("SX") ? 73745 : 74898;
                    case DisplayStrings.DS_miles /* 2662 */:
                        return str.equals("SY") ? 76060 : 74898;
                    case DisplayStrings.DS_milesAbbr /* 2663 */:
                        return str.equals("SZ") ? 76004 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_HOTWORD_OPT_IN_ONBOARDING_SUBTITLE_LINK_TARGET /* 2671 */:
                        return str.equals("TC") ? 74835 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_HOTWORD_OPT_IN_ONBOARDING_SUBTITLE_LINK_TEXT /* 2672 */:
                        return str.equals("TD") ? 76060 : 74898;
                    case 2675:
                        return str.equals("TG") ? 73827 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_SHOW_MIC_ON_MAP /* 2676 */:
                        return str.equals("TH") ? 74888 : 74898;
                    case 2678:
                        return str.equals("TJ") ? 76059 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_ETA_WIDGET_EDUCATION /* 2680 */:
                        return str.equals("TL") ? 76052 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_BOTTOM_SHEET_INTRO_TITLE /* 2681 */:
                        return str.equals("TM") ? 75924 : 74898;
                    case 2682:
                        return str.equals("TN") ? 74315 : 74898;
                    case 2683:
                        return str.equals("TO") ? 75539 : 74898;
                    case 2686:
                        return str.equals("TR") ? 74313 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_SEARCH_TOOLTIP_SUBTITLE_DEFAULT /* 2688 */:
                        return str.equals("TT") ? 73826 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_SEARCH_TOOLTIP_NO_HOTWORD_SUBTITLE_WORK /* 2690 */:
                        return str.equals("TV") ? 75924 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_SEARCH_TOOLTIP_NO_HOTWORD_SUBTITLE_HOME /* 2691 */:
                        return str.equals("TW") ? 0 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_ANIMATED_ONBOARDING_LABEL_2 /* 2694 */:
                        return str.equals("TZ") ? 78499 : 74898;
                    case 2700:
                        return str.equals("UA") ? 111696 : 74898;
                    case 2706:
                        return str.equals("UG") ? 83611 : 74898;
                    case 2718:
                        return str.equals("US") ? 45842 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_DRIVING_ACTION_NOTIFICATION_NO_HW_FREEWAYS_ALLOW /* 2724 */:
                        return str.equals("UY") ? 70730 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_DRIVING_ACTION_NOTIFICATION_NO_HW_FERRIES_AVOID /* 2725 */:
                        return str.equals("UZ") ? 80081 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_REPORT_NOTIFICATION_HW_TITLE /* 2731 */:
                        return str.equals("VA") ? 74896 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_REPORT_NOTIFICATION_HW_ACCIDENT /* 2733 */:
                        return str.equals("VC") ? 73745 : 74898;
                    case 2735:
                        return str.equals("VE") ? 76068 : 74898;
                    case 2737:
                        return str.equals("VG") ? 139858 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_REPORT_NOTIFICATION_HW_POTHOLE /* 2739 */:
                        return str.equals("VI") ? 74832 : 74898;
                    case 2744:
                        return str.equals("VN") ? 74816 : 74898;
                    case DisplayStrings.DS_GOOGLE_ASSISTANT_DRIVING_ACTION_NOTIFICATION_HW_STOP_NAVIGATION /* 2751 */:
                        return str.equals("VU") ? 74972 : 74898;
                    case 2767:
                        return str.equals("WF") ? 75924 : 74898;
                    case 2780:
                        return str.equals("WS") ? 74891 : 74898;
                    case 2803:
                        return str.equals("XK") ? 74321 : 74898;
                    case DisplayStrings.DS_WELCOME_SCREEN_TERMS_OF_SERVICE_LINK_TEXT /* 2828 */:
                        return str.equals("YE") ? 76068 : 74898;
                    case DisplayStrings.DS_NO_CONNECTION_ERROR /* 2843 */:
                        return str.equals("YT") ? 75994 : 74898;
                    case DisplayStrings.DS_SIGNUP_EMAIL_EMAIL_PLACEHOLDER /* 2855 */:
                        return str.equals("ZA") ? 70306 : 74898;
                    case DisplayStrings.DS_VERIFY_EMAIL_WRONG_PIN_MSG /* 2867 */:
                        return str.equals("ZM") ? 75556 : 74898;
                    case DisplayStrings.DS_ACCOUNT_EXISTS_TITLE /* 2877 */:
                        return str.equals("ZW") ? 75540 : 74898;
                    default:
                        switch (iHashCode) {
                            case DisplayStrings.DS_NEW_HEADER_TITLE /* 2096 */:
                                return str.equals("AQ") ? 74900 : 74898;
                            case DisplayStrings.DS_GALLERY_THANK /* 2097 */:
                                return str.equals("AR") ? 70802 : 74898;
                            case DisplayStrings.DS_GALLERY_FLAG /* 2098 */:
                                return str.equals("AS") ? 75474 : 74898;
                            case DisplayStrings.DS_GALLERY_DELETE /* 2099 */:
                                return str.equals("AT") ? 65536 : 74898;
                            case DisplayStrings.DS_ALERT_TITLE_ACCIDENT /* 2100 */:
                                return str.equals("AU") ? 12888 : 74898;
                            default:
                                switch (iHashCode) {
                                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_ANIMALS /* 2122 */:
                                        return str.equals("BL") ? 74897 : 74898;
                                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_CAR_STOPPED /* 2123 */:
                                        return str.equals("BM") ? 73744 : 74898;
                                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_MISSING_SIGN /* 2124 */:
                                        return str.equals("BN") ? 73747 : 74898;
                                    case DisplayStrings.DS_ALERT_TITLE_HAZARD_WEATHER /* 2125 */:
                                        return str.equals("BO") ? 76049 : 74898;
                                    default:
                                        switch (iHashCode) {
                                            case DisplayStrings.DS_ALERT_TITLE_HAZARD_FOG /* 2127 */:
                                                return str.equals("BQ") ? 73745 : 74898;
                                            case 2128:
                                                return str.equals("BR") ? 139849 : 74898;
                                            case 2129:
                                                return str.equals("BS") ? 74323 : 74898;
                                            case 2130:
                                                return str.equals("BT") ? 78987 : 74898;
                                            default:
                                                switch (iHashCode) {
                                                    case DisplayStrings.DS_ALERT_TITLE_MAP_CHAT /* 2147 */:
                                                        return str.equals("CF") ? 75028 : 74898;
                                                    case DisplayStrings.DS_ALERT_TITLE_SOS_GENERAL_ASSISTANCE /* 2148 */:
                                                        return str.equals("CG") ? 75491 : 74898;
                                                    case DisplayStrings.DS_ALERT_TITLE_SOS_EMPTY_TANK /* 2149 */:
                                                        return str.equals("CH") ? 65544 : 74898;
                                                    case 2150:
                                                        return str.equals("CI") ? 76002 : 74898;
                                                    default:
                                                        return 74898;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i2) {
        InitialBitrateSupplier initialBitrateSupplier = this.initialBitrateSupplier;
        if (initialBitrateSupplier != null) {
            long initialBitrateEstimate = initialBitrateSupplier.getInitialBitrateEstimate(i2);
            if (initialBitrateEstimate != C.TIME_UNSET) {
                return initialBitrateEstimate;
            }
        }
        Long lValueOf = this.initialBitrateEstimates.get(Integer.valueOf(i2));
        if (lValueOf == null) {
            lValueOf = this.initialBitrateEstimates.get(0);
        } else if (lValueOf.longValue() == C.TIME_UNSET) {
            lValueOf = Long.valueOf(getInitialBitrateEstimatesForCountry(this.countryCode, i2));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getInitialBitrateEstimatesForCountry(String str, int i2) {
        int initialBitrateCountryGroupAssignment = getInitialBitrateCountryGroupAssignment(an.e(str));
        if (i2 != 2) {
            if (i2 == 3) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get((initialBitrateCountryGroupAssignment >> 3) & 7).longValue();
            }
            if (i2 == 4) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get((initialBitrateCountryGroupAssignment >> 6) & 7).longValue();
            }
            if (i2 == 5) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get((initialBitrateCountryGroupAssignment >> 9) & 7).longValue();
            }
            if (i2 != 7) {
                if (i2 == 9) {
                    return DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment >> 15).longValue();
                }
                if (i2 != 10) {
                    return 1000000L;
                }
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get((initialBitrateCountryGroupAssignment >> 12) & 7).longValue();
            }
        }
        return DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment & 7).longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeterBuild;
        defaultBandwidthMeterBuild = singletonInstance;
        if (defaultBandwidthMeterBuild == null) {
            defaultBandwidthMeterBuild = new Builder(context).build();
            singletonInstance = defaultBandwidthMeterBuild;
        }
        return defaultBandwidthMeterBuild;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i2, long j2, long j3) {
        int i3;
        long j4;
        if (i2 == 0) {
            if (j2 != 0) {
                j4 = j2;
            } else if (j3 == this.lastReportedBitrateEstimate) {
                return;
            } else {
                j4 = 0;
            }
            i3 = 0;
        } else {
            i3 = i2;
            j4 = j2;
        }
        this.lastReportedBitrateEstimate = j3;
        this.eventDispatcher.bandwidthSample(i3, j4, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0001, B:10:0x000f, B:16:0x001b, B:21:0x0026, B:24:0x0032, B:30:0x004a), top: B:44:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onNetworkTypeChanged(int r9) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.networkType     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto Lf
            boolean r1 = r8.resetOnNetworkTypeChange     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Lf
        L9:
            r2 = r8
            goto L63
        Lb:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L68
        Lf:
            boolean r1 = r8.networkTypeOverrideSet     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L15
            int r9 = r8.networkTypeOverride     // Catch: java.lang.Throwable -> Lb
        L15:
            if (r0 != r9) goto L1b
            java.lang.String r0 = r8.countryCode     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L9
        L1b:
            r8.networkType = r9     // Catch: java.lang.Throwable -> L65
            r0 = 1
            if (r9 == r0) goto L9
            if (r9 == 0) goto L9
            r0 = 8
            if (r9 == r0) goto L9
            java.lang.String r0 = r8.countryCode     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L32
            android.content.Context r0 = r8.context     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = androidx.media3.common.util.Util.getCountryCode(r0)     // Catch: java.lang.Throwable -> Lb
            r8.countryCode = r0     // Catch: java.lang.Throwable -> Lb
        L32:
            long r0 = r8.getInitialBitrateEstimateForNetworkType(r9)     // Catch: java.lang.Throwable -> L65
            r8.bitrateEstimate = r0     // Catch: java.lang.Throwable -> L65
            androidx.media3.common.util.Clock r9 = r8.clock     // Catch: java.lang.Throwable -> L65
            long r0 = r9.elapsedRealtime()     // Catch: java.lang.Throwable -> L65
            int r9 = r8.streamCount     // Catch: java.lang.Throwable -> L65
            if (r9 <= 0) goto L48
            long r2 = r8.sampleStartTimeMs     // Catch: java.lang.Throwable -> Lb
            long r2 = r0 - r2
            int r9 = (int) r2
            goto L49
        L48:
            r9 = 0
        L49:
            r3 = r9
            long r4 = r8.sampleBytesTransferred     // Catch: java.lang.Throwable -> L65
            long r6 = r8.bitrateEstimate     // Catch: java.lang.Throwable -> L65
            r2 = r8
            r2.maybeNotifyBandwidthSample(r3, r4, r6)     // Catch: java.lang.Throwable -> L6a
            r2.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L6a
            r8 = 0
            r2.sampleBytesTransferred = r8     // Catch: java.lang.Throwable -> L6a
            r2.totalBytesTransferred = r8     // Catch: java.lang.Throwable -> L6a
            r2.totalElapsedTimeMs = r8     // Catch: java.lang.Throwable -> L6a
            androidx.media3.exoplayer.upstream.SlidingPercentile r8 = r2.slidingPercentile     // Catch: java.lang.Throwable -> L6a
            r8.reset()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r2)
            return
        L63:
            monitor-exit(r2)
            return
        L65:
            r0 = move-exception
            r2 = r8
        L67:
            r9 = r0
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r9
        L6a:
            r0 = move-exception
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.onNetworkTypeChanged(int):void");
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        an.B(handler);
        an.B(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i2) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #1 {all -> 0x0077, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0010, B:13:0x002d, B:23:0x005f, B:22:0x0054), top: B:39:0x0001 }] */
    @Override // androidx.media3.datasource.TransferListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(androidx.media3.datasource.DataSource r11, androidx.media3.datasource.DataSpec r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = isTransferAtFullNetworkSpeed(r12, r13)     // Catch: java.lang.Throwable -> L77
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L77
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            com.google.d.b.an.u(r11)     // Catch: java.lang.Throwable -> L77
            androidx.media3.common.util.Clock r11 = r10.clock     // Catch: java.lang.Throwable -> L77
            long r11 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L77
            long r0 = r10.sampleStartTimeMs     // Catch: java.lang.Throwable -> L77
            long r0 = r11 - r0
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L77
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L77
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L77
            long r2 = r2 + r0
            r10.totalElapsedTimeMs = r2     // Catch: java.lang.Throwable -> L77
            long r0 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L77
            long r2 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L77
            long r0 = r0 + r2
            r10.totalBytesTransferred = r0     // Catch: java.lang.Throwable -> L77
            if (r5 <= 0) goto L6e
            float r13 = (float) r2     // Catch: java.lang.Throwable -> L77
            androidx.media3.exoplayer.upstream.SlidingPercentile r0 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L77
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L77
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L77
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L77
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r13 = r13 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L77
            float r13 = r13 / r2
            r0.addSample(r1, r13)     // Catch: java.lang.Throwable -> L77
            long r0 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L77
            r2 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L54
            long r0 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L50
            r2 = 524288(0x80000, double:2.590327E-318)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 < 0) goto L5f
            goto L54
        L50:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7a
        L54:
            androidx.media3.exoplayer.upstream.SlidingPercentile r13 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L77
            r0 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13.getPercentile(r0)     // Catch: java.lang.Throwable -> L77
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L77
            r10.bitrateEstimate = r0     // Catch: java.lang.Throwable -> L77
        L5f:
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L77
            long r8 = r10.bitrateEstimate     // Catch: java.lang.Throwable -> L77
            r4 = r10
            r4.maybeNotifyBandwidthSample(r5, r6, r8)     // Catch: java.lang.Throwable -> L7c
            r4.sampleStartTimeMs = r11     // Catch: java.lang.Throwable -> L7c
            r10 = 0
            r4.sampleBytesTransferred = r10     // Catch: java.lang.Throwable -> L7c
            goto L6f
        L6e:
            r4 = r10
        L6f:
            int r10 = r4.streamCount     // Catch: java.lang.Throwable -> L7c
            int r10 = r10 + (-1)
            r4.streamCount = r10     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r4)
            return
        L77:
            r0 = move-exception
            r4 = r10
        L79:
            r11 = r0
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            throw r11
        L7c:
            r0 = move-exception
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.onTransferEnd(androidx.media3.datasource.DataSource, androidx.media3.datasource.DataSpec, boolean):void");
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i2) {
        this.networkTypeOverride = i2;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i2);
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Clock clock;
        private final Context context;
        private final Map<Integer, Long> initialBitrateEstimates;
        private InitialBitrateSupplier initialBitrateSupplier;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
            HashMap map = new HashMap(8);
            this.initialBitrateEstimates = map;
            map.put(0, 1000000L);
            Long lValueOf = Long.valueOf(C.TIME_UNSET);
            map.put(2, lValueOf);
            map.put(3, lValueOf);
            map.put(4, lValueOf);
            map.put(5, lValueOf);
            map.put(10, lValueOf);
            map.put(9, lValueOf);
            map.put(7, lValueOf);
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange, this.initialBitrateSupplier);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            Map<Integer, Long> map = this.initialBitrateEstimates;
            String strL = an.L(str);
            for (Integer num : map.keySet()) {
                setInitialBitrateEstimate(num.intValue(), DefaultBandwidthMeter.getInitialBitrateEstimatesForCountry(strL, num.intValue()));
            }
            return this;
        }

        public Builder setInitialBitrateSupplier(InitialBitrateSupplier initialBitrateSupplier) {
            this.initialBitrateSupplier = initialBitrateSupplier;
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i2) {
            this.slidingWindowMaxWeight = i2;
            return this;
        }

        public Builder setInitialBitrateEstimate(long j2) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j2);
            }
            return this;
        }

        public Builder setInitialBitrateEstimate(int i2, long j2) {
            this.initialBitrateEstimates.put(Integer.valueOf(i2), Long.valueOf(j2));
            return this;
        }
    }
}

package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brf extends com.google.v.du<brf, brd> implements com.google.v.fj {
    public static final int ADS_STATS_WRAPPER_FIELD_NUMBER = 5;
    public static final int ALTERNATE_ROUTES_STATS_WRAPPER_FIELD_NUMBER = 23;
    public static final int APP_LIFECYCLE_STATS_WRAPPER_FIELD_NUMBER = 24;
    public static final int BEACON_STATS_WRAPPER_FIELD_NUMBER = 40;
    public static final int CARPLAY_STATS_WRAPPER_FIELD_NUMBER = 25;
    public static final int CLIENT_ENG_STATS_WRAPPER_FIELD_NUMBER = 60;
    public static final int CLUSTER_STATS_WRAPPER_FIELD_NUMBER = 56;
    public static final int COMMON_WRAPPER_FIELD_NUMBER = 3;
    public static final int CONSENT_STATS_WRAPPER_FIELD_NUMBER = 10;
    public static final int CONVERSATION_STATS_WRAPPER_FIELD_NUMBER = 61;
    public static final int CO_PILOT_STATS_WRAPPER_FIELD_NUMBER = 26;
    public static final int DEEPLINK_STATS_WRAPPER_FIELD_NUMBER = 13;
    private static final brf DEFAULT_INSTANCE;
    public static final int DESTINATION_CARD_STATS_WRAPPER_FIELD_NUMBER = 7;
    public static final int DETOUR_STATS_WRAPPER_FIELD_NUMBER = 27;
    public static final int DRIVE_DETECTION_STATS_WRAPPER_FIELD_NUMBER = 53;
    public static final int DRIVE_SUGGESTION_STATS_WRAPPER_FIELD_NUMBER = 51;
    public static final int ENCOURAGEMENT_STATS_WRAPPER_FIELD_NUMBER = 9;
    public static final int ETA_STATS_WRAPPER_FIELD_NUMBER = 28;
    public static final int EV_STATS_WRAPPER_FIELD_NUMBER = 41;
    public static final int FAVORITES_STATS_WRAPPER_FIELD_NUMBER = 50;
    public static final int GOOGLE_ADS_STATS_WRAPPER_FIELD_NUMBER = 54;
    public static final int GOOGLE_ASSISTANT_STATS_WRAPPER_FIELD_NUMBER = 11;
    public static final int GPS_STATS_WRAPPER_FIELD_NUMBER = 29;
    public static final int GUIDANCE_STATS_WRAPPER_FIELD_NUMBER = 57;
    public static final int INBOX_STATS_WRAPPER_FIELD_NUMBER = 12;
    public static final int INSIGHT_COMPONENT_STATS_WRAPPER_FIELD_NUMBER = 59;
    public static final int IN_CAR_MAIN_SCREEN_STATS_WRAPPER_FIELD_NUMBER = 52;
    public static final int LOCATION_PREVIEW_STATS_WRAPPER_FIELD_NUMBER = 30;
    public static final int MAIN_MENU_STATS_WRAPPER_FIELD_NUMBER = 31;
    public static final int MAP_STATS_WRAPPER_FIELD_NUMBER = 32;
    public static final int MUSIC_PLAYER_STATS_WRAPPER_FIELD_NUMBER = 22;
    public static final int NAVIGATION_STATS_WRAPPER_FIELD_NUMBER = 8;
    public static final int NAV_CONNECT_STATS_WRAPPER_FIELD_NUMBER = 63;
    public static final int NETWORK_STATS_WRAPPER_FIELD_NUMBER = 14;
    public static final int PARKING_STATS_WRAPPER_FIELD_NUMBER = 42;
    private static volatile com.google.v.fo<brf> PARSER = null;
    public static final int PERFORMANCE_STATS_WRAPPER_FIELD_NUMBER = 33;
    public static final int PERMISSIONS_STATS_WRAPPER_FIELD_NUMBER = 43;
    public static final int PLANNED_DRIVE_STATS_WRAPPER_FIELD_NUMBER = 16;
    public static final int PUSH_STATS_WRAPPER_FIELD_NUMBER = 15;
    public static final int REAL_TIME_ALERTER_STATS_WRAPPER_FIELD_NUMBER = 4;
    public static final int REPORTING_STATS_WRAPPER_FIELD_NUMBER = 18;
    public static final int REROUTE_STATS_WRAPPER_FIELD_NUMBER = 34;
    public static final int ROUTING_STATS_WRAPPER_FIELD_NUMBER = 35;
    public static final int SEARCH_STATS_WRAPPER_FIELD_NUMBER = 6;
    public static final int SETTINGS_STATS_WRAPPER_FIELD_NUMBER = 36;
    public static final int SHARED_STAT_WRAPPER_FIELD_NUMBER = 2;
    public static final int SHARE_DRIVE_STATS_WRAPPER_FIELD_NUMBER = 44;
    public static final int SIRI_SHORTCUTS_STATS_WRAPPER_FIELD_NUMBER = 37;
    public static final int START_STATE_STATS_WRAPPER_FIELD_NUMBER = 20;
    public static final int SURFACED_INSIGHTS_STATS_WRAPPER_FIELD_NUMBER = 55;
    public static final int TRAFFIC_BAR_STATS_WRAPPER_FIELD_NUMBER = 45;
    public static final int TRIP_OVERVIEW_STATS_WRAPPER_FIELD_NUMBER = 21;
    public static final int TTS_STATS_WRAPPER_FIELD_NUMBER = 46;
    public static final int UID_STATS_WRAPPER_FIELD_NUMBER = 19;
    public static final int USER_LOGIN_STATS_WRAPPER_FIELD_NUMBER = 38;
    public static final int USER_POSITION_STATS_WRAPPER_FIELD_NUMBER = 49;
    public static final int USER_PROFILE_STATS_WRAPPER_FIELD_NUMBER = 17;
    public static final int USER_TRACKING_STATS_WRAPPER_FIELD_NUMBER = 62;
    public static final int VOICES_STATS_WRAPPER_FIELD_NUMBER = 58;
    public static final int VOICE_ASSISTANT_STATS_WRAPPER_FIELD_NUMBER = 47;
    public static final int WAZE_STAT_WRAPPER_FIELD_NUMBER = 1;
    public static final int WEB_VIEW_STATS_WRAPPER_FIELD_NUMBER = 48;
    public static final int ZERO_SPEED_STATS_WRAPPER_FIELD_NUMBER = 39;
    private int statWrapperCase_ = 0;
    private Object statWrapper_;

    static {
        brf brfVar = new brf();
        DEFAULT_INSTANCE = brfVar;
        com.google.v.du.registerDefaultInstance(brf.class, brfVar);
    }

    private brf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdsStatsWrapper() {
        if (this.statWrapperCase_ == 5) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternateRoutesStatsWrapper() {
        if (this.statWrapperCase_ == 23) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppLifecycleStatsWrapper() {
        if (this.statWrapperCase_ == 24) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconStatsWrapper() {
        if (this.statWrapperCase_ == 40) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayStatsWrapper() {
        if (this.statWrapperCase_ == 25) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientEngStatsWrapper() {
        if (this.statWrapperCase_ == 60) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClusterStatsWrapper() {
        if (this.statWrapperCase_ == 56) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoPilotStatsWrapper() {
        if (this.statWrapperCase_ == 26) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommonWrapper() {
        if (this.statWrapperCase_ == 3) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsentStatsWrapper() {
        if (this.statWrapperCase_ == 10) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationStatsWrapper() {
        if (this.statWrapperCase_ == 61) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeeplinkStatsWrapper() {
        if (this.statWrapperCase_ == 13) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCardStatsWrapper() {
        if (this.statWrapperCase_ == 7) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourStatsWrapper() {
        if (this.statWrapperCase_ == 27) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveDetectionStatsWrapper() {
        if (this.statWrapperCase_ == 53) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveSuggestionStatsWrapper() {
        if (this.statWrapperCase_ == 51) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementStatsWrapper() {
        if (this.statWrapperCase_ == 9) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaStatsWrapper() {
        if (this.statWrapperCase_ == 28) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvStatsWrapper() {
        if (this.statWrapperCase_ == 41) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoritesStatsWrapper() {
        if (this.statWrapperCase_ == 50) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdsStatsWrapper() {
        if (this.statWrapperCase_ == 54) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantStatsWrapper() {
        if (this.statWrapperCase_ == 11) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsStatsWrapper() {
        if (this.statWrapperCase_ == 29) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidanceStatsWrapper() {
        if (this.statWrapperCase_ == 57) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarMainScreenStatsWrapper() {
        if (this.statWrapperCase_ == 52) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboxStatsWrapper() {
        if (this.statWrapperCase_ == 12) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentStatsWrapper() {
        if (this.statWrapperCase_ == 59) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationPreviewStatsWrapper() {
        if (this.statWrapperCase_ == 30) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainMenuStatsWrapper() {
        if (this.statWrapperCase_ == 31) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapStatsWrapper() {
        if (this.statWrapperCase_ == 32) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicPlayerStatsWrapper() {
        if (this.statWrapperCase_ == 22) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectStatsWrapper() {
        if (this.statWrapperCase_ == 63) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationStatsWrapper() {
        if (this.statWrapperCase_ == 8) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkStatsWrapper() {
        if (this.statWrapperCase_ == 14) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingStatsWrapper() {
        if (this.statWrapperCase_ == 42) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerformanceStatsWrapper() {
        if (this.statWrapperCase_ == 33) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermissionsStatsWrapper() {
        if (this.statWrapperCase_ == 43) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveStatsWrapper() {
        if (this.statWrapperCase_ == 16) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushStatsWrapper() {
        if (this.statWrapperCase_ == 15) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealTimeAlerterStatsWrapper() {
        if (this.statWrapperCase_ == 4) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingStatsWrapper() {
        if (this.statWrapperCase_ == 18) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteStatsWrapper() {
        if (this.statWrapperCase_ == 34) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingStatsWrapper() {
        if (this.statWrapperCase_ == 35) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchStatsWrapper() {
        if (this.statWrapperCase_ == 6) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsStatsWrapper() {
        if (this.statWrapperCase_ == 36) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveStatsWrapper() {
        if (this.statWrapperCase_ == 44) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedStatWrapper() {
        if (this.statWrapperCase_ == 2) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiriShortcutsStatsWrapper() {
        if (this.statWrapperCase_ == 37) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStateStatsWrapper() {
        if (this.statWrapperCase_ == 20) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatWrapper() {
        this.statWrapperCase_ = 0;
        this.statWrapper_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedInsightsStatsWrapper() {
        if (this.statWrapperCase_ == 55) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficBarStatsWrapper() {
        if (this.statWrapperCase_ == 45) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewStatsWrapper() {
        if (this.statWrapperCase_ == 21) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsStatsWrapper() {
        if (this.statWrapperCase_ == 46) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUidStatsWrapper() {
        if (this.statWrapperCase_ == 19) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserLoginStatsWrapper() {
        if (this.statWrapperCase_ == 38) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPositionStatsWrapper() {
        if (this.statWrapperCase_ == 49) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserProfileStatsWrapper() {
        if (this.statWrapperCase_ == 17) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserTrackingStatsWrapper() {
        if (this.statWrapperCase_ == 62) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceAssistantStatsWrapper() {
        if (this.statWrapperCase_ == 47) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicesStatsWrapper() {
        if (this.statWrapperCase_ == 58) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeStatWrapper() {
        if (this.statWrapperCase_ == 1) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebViewStatsWrapper() {
        if (this.statWrapperCase_ == 48) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZeroSpeedStatsWrapper() {
        if (this.statWrapperCase_ == 39) {
            this.statWrapperCase_ = 0;
            this.statWrapper_ = null;
        }
    }

    public static brf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdsStatsWrapper(bp bpVar) {
        Objects.requireNonNull(bpVar);
        if (this.statWrapperCase_ == 5 && this.statWrapper_ != bp.getDefaultInstance()) {
            bn bnVarNewBuilder = bp.newBuilder((bp) this.statWrapper_);
            bnVarNewBuilder.mergeFrom((bn) bpVar);
            bpVar = bnVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bpVar;
        this.statWrapperCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternateRoutesStatsWrapper(dh dhVar) {
        Objects.requireNonNull(dhVar);
        if (this.statWrapperCase_ == 23 && this.statWrapper_ != dh.getDefaultInstance()) {
            df dfVarNewBuilder = dh.newBuilder((dh) this.statWrapper_);
            dfVarNewBuilder.mergeFrom((df) dhVar);
            dhVar = dfVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = dhVar;
        this.statWrapperCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppLifecycleStatsWrapper(fb fbVar) {
        Objects.requireNonNull(fbVar);
        if (this.statWrapperCase_ == 24 && this.statWrapper_ != fb.getDefaultInstance()) {
            ez ezVarNewBuilder = fb.newBuilder((fb) this.statWrapper_);
            ezVarNewBuilder.mergeFrom((ez) fbVar);
            fbVar = ezVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = fbVar;
        this.statWrapperCase_ = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconStatsWrapper(hw hwVar) {
        Objects.requireNonNull(hwVar);
        if (this.statWrapperCase_ == 40 && this.statWrapper_ != hw.getDefaultInstance()) {
            hu huVarNewBuilder = hw.newBuilder((hw) this.statWrapper_);
            huVarNewBuilder.mergeFrom((hu) hwVar);
            hwVar = huVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = hwVar;
        this.statWrapperCase_ = 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayStatsWrapper(jl jlVar) {
        Objects.requireNonNull(jlVar);
        if (this.statWrapperCase_ == 25 && this.statWrapper_ != jl.getDefaultInstance()) {
            jj jjVarNewBuilder = jl.newBuilder((jl) this.statWrapper_);
            jjVarNewBuilder.mergeFrom((jj) jlVar);
            jlVar = jjVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = jlVar;
        this.statWrapperCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientEngStatsWrapper(kj kjVar) {
        Objects.requireNonNull(kjVar);
        if (this.statWrapperCase_ == 60 && this.statWrapper_ != kj.getDefaultInstance()) {
            kh khVarNewBuilder = kj.newBuilder((kj) this.statWrapper_);
            khVarNewBuilder.mergeFrom((kh) kjVar);
            kjVar = khVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = kjVar;
        this.statWrapperCase_ = 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClusterStatsWrapper(lf lfVar) {
        Objects.requireNonNull(lfVar);
        if (this.statWrapperCase_ == 56 && this.statWrapper_ != lf.getDefaultInstance()) {
            ld ldVarNewBuilder = lf.newBuilder((lf) this.statWrapper_);
            ldVarNewBuilder.mergeFrom((ld) lfVar);
            lfVar = ldVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = lfVar;
        this.statWrapperCase_ = 56;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoPilotStatsWrapper(lq lqVar) {
        Objects.requireNonNull(lqVar);
        if (this.statWrapperCase_ == 26 && this.statWrapper_ != lq.getDefaultInstance()) {
            lo loVarNewBuilder = lq.newBuilder((lq) this.statWrapper_);
            loVarNewBuilder.mergeFrom((lo) lqVar);
            lqVar = loVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = lqVar;
        this.statWrapperCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommonWrapper(lt ltVar) {
        Objects.requireNonNull(ltVar);
        if (this.statWrapperCase_ == 3 && this.statWrapper_ != lt.getDefaultInstance()) {
            lr lrVarNewBuilder = lt.newBuilder((lt) this.statWrapper_);
            lrVarNewBuilder.mergeFrom((lr) ltVar);
            ltVar = lrVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = ltVar;
        this.statWrapperCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConsentStatsWrapper(lw lwVar) {
        Objects.requireNonNull(lwVar);
        if (this.statWrapperCase_ == 10 && this.statWrapper_ != lw.getDefaultInstance()) {
            lu luVarNewBuilder = lw.newBuilder((lw) this.statWrapper_);
            luVarNewBuilder.mergeFrom((lu) lwVar);
            lwVar = luVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = lwVar;
        this.statWrapperCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationStatsWrapper(nh nhVar) {
        Objects.requireNonNull(nhVar);
        if (this.statWrapperCase_ == 61 && this.statWrapper_ != nh.getDefaultInstance()) {
            nf nfVarNewBuilder = nh.newBuilder((nh) this.statWrapper_);
            nfVarNewBuilder.mergeFrom((nf) nhVar);
            nhVar = nfVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = nhVar;
        this.statWrapperCase_ = 61;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeeplinkStatsWrapper(ps psVar) {
        Objects.requireNonNull(psVar);
        if (this.statWrapperCase_ == 13 && this.statWrapper_ != ps.getDefaultInstance()) {
            pq pqVarNewBuilder = ps.newBuilder((ps) this.statWrapper_);
            pqVarNewBuilder.mergeFrom((pq) psVar);
            psVar = pqVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = psVar;
        this.statWrapperCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCardStatsWrapper(qj qjVar) {
        Objects.requireNonNull(qjVar);
        if (this.statWrapperCase_ == 7 && this.statWrapper_ != qj.getDefaultInstance()) {
            qh qhVarNewBuilder = qj.newBuilder((qj) this.statWrapper_);
            qhVarNewBuilder.mergeFrom((qh) qjVar);
            qjVar = qhVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = qjVar;
        this.statWrapperCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourStatsWrapper(sg sgVar) {
        Objects.requireNonNull(sgVar);
        if (this.statWrapperCase_ == 27 && this.statWrapper_ != sg.getDefaultInstance()) {
            se seVarNewBuilder = sg.newBuilder((sg) this.statWrapper_);
            seVarNewBuilder.mergeFrom((se) sgVar);
            sgVar = seVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = sgVar;
        this.statWrapperCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriveDetectionStatsWrapper(sy syVar) {
        Objects.requireNonNull(syVar);
        if (this.statWrapperCase_ == 53 && this.statWrapper_ != sy.getDefaultInstance()) {
            sw swVarNewBuilder = sy.newBuilder((sy) this.statWrapper_);
            swVarNewBuilder.mergeFrom((sw) syVar);
            syVar = swVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = syVar;
        this.statWrapperCase_ = 53;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriveSuggestionStatsWrapper(tb tbVar) {
        Objects.requireNonNull(tbVar);
        if (this.statWrapperCase_ == 51 && this.statWrapper_ != tb.getDefaultInstance()) {
            sz szVarNewBuilder = tb.newBuilder((tb) this.statWrapper_);
            szVarNewBuilder.mergeFrom((sz) tbVar);
            tbVar = szVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = tbVar;
        this.statWrapperCase_ = 51;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncouragementStatsWrapper(uu uuVar) {
        Objects.requireNonNull(uuVar);
        if (this.statWrapperCase_ == 9 && this.statWrapper_ != uu.getDefaultInstance()) {
            us usVarNewBuilder = uu.newBuilder((uu) this.statWrapper_);
            usVarNewBuilder.mergeFrom((us) uuVar);
            uuVar = usVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = uuVar;
        this.statWrapperCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaStatsWrapper(vq vqVar) {
        Objects.requireNonNull(vqVar);
        if (this.statWrapperCase_ == 28 && this.statWrapper_ != vq.getDefaultInstance()) {
            vo voVarNewBuilder = vq.newBuilder((vq) this.statWrapper_);
            voVarNewBuilder.mergeFrom((vo) vqVar);
            vqVar = voVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = vqVar;
        this.statWrapperCase_ = 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvStatsWrapper(vt vtVar) {
        Objects.requireNonNull(vtVar);
        if (this.statWrapperCase_ == 41 && this.statWrapper_ != vt.getDefaultInstance()) {
            vr vrVarNewBuilder = vt.newBuilder((vt) this.statWrapper_);
            vrVarNewBuilder.mergeFrom((vr) vtVar);
            vtVar = vrVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = vtVar;
        this.statWrapperCase_ = 41;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoritesStatsWrapper(wm wmVar) {
        Objects.requireNonNull(wmVar);
        if (this.statWrapperCase_ == 50 && this.statWrapper_ != wm.getDefaultInstance()) {
            wk wkVarNewBuilder = wm.newBuilder((wm) this.statWrapper_);
            wkVarNewBuilder.mergeFrom((wk) wmVar);
            wmVar = wkVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = wmVar;
        this.statWrapperCase_ = 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdsStatsWrapper(zq zqVar) {
        Objects.requireNonNull(zqVar);
        if (this.statWrapperCase_ == 54 && this.statWrapper_ != zq.getDefaultInstance()) {
            zo zoVarNewBuilder = zq.newBuilder((zq) this.statWrapper_);
            zoVarNewBuilder.mergeFrom((zo) zqVar);
            zqVar = zoVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = zqVar;
        this.statWrapperCase_ = 54;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantStatsWrapper(aam aamVar) {
        Objects.requireNonNull(aamVar);
        if (this.statWrapperCase_ == 11 && this.statWrapper_ != aam.getDefaultInstance()) {
            aak aakVarNewBuilder = aam.newBuilder((aam) this.statWrapper_);
            aakVarNewBuilder.mergeFrom((aak) aamVar);
            aamVar = aakVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = aamVar;
        this.statWrapperCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsStatsWrapper(aax aaxVar) {
        Objects.requireNonNull(aaxVar);
        if (this.statWrapperCase_ == 29 && this.statWrapper_ != aax.getDefaultInstance()) {
            aav aavVarNewBuilder = aax.newBuilder((aax) this.statWrapper_);
            aavVarNewBuilder.mergeFrom((aav) aaxVar);
            aaxVar = aavVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = aaxVar;
        this.statWrapperCase_ = 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGuidanceStatsWrapper(abh abhVar) {
        Objects.requireNonNull(abhVar);
        if (this.statWrapperCase_ == 57 && this.statWrapper_ != abh.getDefaultInstance()) {
            abf abfVarNewBuilder = abh.newBuilder((abh) this.statWrapper_);
            abfVarNewBuilder.mergeFrom((abf) abhVar);
            abhVar = abfVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = abhVar;
        this.statWrapperCase_ = 57;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarMainScreenStatsWrapper(act actVar) {
        Objects.requireNonNull(actVar);
        if (this.statWrapperCase_ == 52 && this.statWrapper_ != act.getDefaultInstance()) {
            acr acrVarNewBuilder = act.newBuilder((act) this.statWrapper_);
            acrVarNewBuilder.mergeFrom((acr) actVar);
            actVar = acrVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = actVar;
        this.statWrapperCase_ = 52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInboxStatsWrapper(adf adfVar) {
        Objects.requireNonNull(adfVar);
        if (this.statWrapperCase_ == 12 && this.statWrapper_ != adf.getDefaultInstance()) {
            add addVarNewBuilder = adf.newBuilder((adf) this.statWrapper_);
            addVarNewBuilder.mergeFrom((add) adfVar);
            adfVar = addVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = adfVar;
        this.statWrapperCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentStatsWrapper(aep aepVar) {
        Objects.requireNonNull(aepVar);
        if (this.statWrapperCase_ == 59 && this.statWrapper_ != aep.getDefaultInstance()) {
            aen aenVarNewBuilder = aep.newBuilder((aep) this.statWrapper_);
            aenVarNewBuilder.mergeFrom((aen) aepVar);
            aepVar = aenVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = aepVar;
        this.statWrapperCase_ = 59;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationPreviewStatsWrapper(agy agyVar) {
        Objects.requireNonNull(agyVar);
        if (this.statWrapperCase_ == 30 && this.statWrapper_ != agy.getDefaultInstance()) {
            agw agwVarNewBuilder = agy.newBuilder((agy) this.statWrapper_);
            agwVarNewBuilder.mergeFrom((agw) agyVar);
            agyVar = agwVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = agyVar;
        this.statWrapperCase_ = 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainMenuStatsWrapper(aht ahtVar) {
        Objects.requireNonNull(ahtVar);
        if (this.statWrapperCase_ == 31 && this.statWrapper_ != aht.getDefaultInstance()) {
            ahr ahrVarNewBuilder = aht.newBuilder((aht) this.statWrapper_);
            ahrVarNewBuilder.mergeFrom((ahr) ahtVar);
            ahtVar = ahrVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = ahtVar;
        this.statWrapperCase_ = 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapStatsWrapper(ajc ajcVar) {
        Objects.requireNonNull(ajcVar);
        if (this.statWrapperCase_ == 32 && this.statWrapper_ != ajc.getDefaultInstance()) {
            aja ajaVarNewBuilder = ajc.newBuilder((ajc) this.statWrapper_);
            ajaVarNewBuilder.mergeFrom((aja) ajcVar);
            ajcVar = ajaVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = ajcVar;
        this.statWrapperCase_ = 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMusicPlayerStatsWrapper(akq akqVar) {
        Objects.requireNonNull(akqVar);
        if (this.statWrapperCase_ == 22 && this.statWrapper_ != akq.getDefaultInstance()) {
            ako akoVarNewBuilder = akq.newBuilder((akq) this.statWrapper_);
            akoVarNewBuilder.mergeFrom((ako) akqVar);
            akqVar = akoVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = akqVar;
        this.statWrapperCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectStatsWrapper(alt altVar) {
        Objects.requireNonNull(altVar);
        if (this.statWrapperCase_ == 63 && this.statWrapper_ != alt.getDefaultInstance()) {
            alr alrVarNewBuilder = alt.newBuilder((alt) this.statWrapper_);
            alrVarNewBuilder.mergeFrom((alr) altVar);
            altVar = alrVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = altVar;
        this.statWrapperCase_ = 63;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationStatsWrapper(ams amsVar) {
        Objects.requireNonNull(amsVar);
        if (this.statWrapperCase_ == 8 && this.statWrapper_ != ams.getDefaultInstance()) {
            amq amqVarNewBuilder = ams.newBuilder((ams) this.statWrapper_);
            amqVarNewBuilder.mergeFrom((amq) amsVar);
            amsVar = amqVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = amsVar;
        this.statWrapperCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkStatsWrapper(ank ankVar) {
        Objects.requireNonNull(ankVar);
        if (this.statWrapperCase_ == 14 && this.statWrapper_ != ank.getDefaultInstance()) {
            ani aniVarNewBuilder = ank.newBuilder((ank) this.statWrapper_);
            aniVarNewBuilder.mergeFrom((ani) ankVar);
            ankVar = aniVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = ankVar;
        this.statWrapperCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingStatsWrapper(apo apoVar) {
        Objects.requireNonNull(apoVar);
        if (this.statWrapperCase_ == 42 && this.statWrapper_ != apo.getDefaultInstance()) {
            apm apmVarNewBuilder = apo.newBuilder((apo) this.statWrapper_);
            apmVarNewBuilder.mergeFrom((apm) apoVar);
            apoVar = apmVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = apoVar;
        this.statWrapperCase_ = 42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePerformanceStatsWrapper(apz apzVar) {
        Objects.requireNonNull(apzVar);
        if (this.statWrapperCase_ == 33 && this.statWrapper_ != apz.getDefaultInstance()) {
            apx apxVarNewBuilder = apz.newBuilder((apz) this.statWrapper_);
            apxVarNewBuilder.mergeFrom((apx) apzVar);
            apzVar = apxVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = apzVar;
        this.statWrapperCase_ = 33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermissionsStatsWrapper(aqg aqgVar) {
        Objects.requireNonNull(aqgVar);
        if (this.statWrapperCase_ == 43 && this.statWrapper_ != aqg.getDefaultInstance()) {
            aqe aqeVarNewBuilder = aqg.newBuilder((aqg) this.statWrapper_);
            aqeVarNewBuilder.mergeFrom((aqe) aqgVar);
            aqgVar = aqeVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = aqgVar;
        this.statWrapperCase_ = 43;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlannedDriveStatsWrapper(arb arbVar) {
        Objects.requireNonNull(arbVar);
        if (this.statWrapperCase_ == 16 && this.statWrapper_ != arb.getDefaultInstance()) {
            aqz aqzVarNewBuilder = arb.newBuilder((arb) this.statWrapper_);
            aqzVarNewBuilder.mergeFrom((aqz) arbVar);
            arbVar = aqzVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = arbVar;
        this.statWrapperCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushStatsWrapper(atc atcVar) {
        Objects.requireNonNull(atcVar);
        if (this.statWrapperCase_ == 15 && this.statWrapper_ != atc.getDefaultInstance()) {
            ata ataVarNewBuilder = atc.newBuilder((atc) this.statWrapper_);
            ataVarNewBuilder.mergeFrom((ata) atcVar);
            atcVar = ataVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = atcVar;
        this.statWrapperCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealTimeAlerterStatsWrapper(atp atpVar) {
        Objects.requireNonNull(atpVar);
        if (this.statWrapperCase_ == 4 && this.statWrapper_ != atp.getDefaultInstance()) {
            atn atnVarNewBuilder = atp.newBuilder((atp) this.statWrapper_);
            atnVarNewBuilder.mergeFrom((atn) atpVar);
            atpVar = atnVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = atpVar;
        this.statWrapperCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportingStatsWrapper(avc avcVar) {
        Objects.requireNonNull(avcVar);
        if (this.statWrapperCase_ == 18 && this.statWrapper_ != avc.getDefaultInstance()) {
            ava avaVarNewBuilder = avc.newBuilder((avc) this.statWrapper_);
            avaVarNewBuilder.mergeFrom((ava) avcVar);
            avcVar = avaVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = avcVar;
        this.statWrapperCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteStatsWrapper(avj avjVar) {
        Objects.requireNonNull(avjVar);
        if (this.statWrapperCase_ == 34 && this.statWrapper_ != avj.getDefaultInstance()) {
            avh avhVarNewBuilder = avj.newBuilder((avj) this.statWrapper_);
            avhVarNewBuilder.mergeFrom((avh) avjVar);
            avjVar = avhVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = avjVar;
        this.statWrapperCase_ = 34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingStatsWrapper(aww awwVar) {
        Objects.requireNonNull(awwVar);
        if (this.statWrapperCase_ == 35 && this.statWrapper_ != aww.getDefaultInstance()) {
            awu awuVarNewBuilder = aww.newBuilder((aww) this.statWrapper_);
            awuVarNewBuilder.mergeFrom((awu) awwVar);
            awwVar = awuVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = awwVar;
        this.statWrapperCase_ = 35;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchStatsWrapper(azv azvVar) {
        Objects.requireNonNull(azvVar);
        if (this.statWrapperCase_ == 6 && this.statWrapper_ != azv.getDefaultInstance()) {
            azt aztVarNewBuilder = azv.newBuilder((azv) this.statWrapper_);
            aztVarNewBuilder.mergeFrom((azt) azvVar);
            azvVar = aztVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = azvVar;
        this.statWrapperCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettingsStatsWrapper(bcb bcbVar) {
        Objects.requireNonNull(bcbVar);
        if (this.statWrapperCase_ == 36 && this.statWrapper_ != bcb.getDefaultInstance()) {
            bbz bbzVarNewBuilder = bcb.newBuilder((bcb) this.statWrapper_);
            bbzVarNewBuilder.mergeFrom((bbz) bcbVar);
            bcbVar = bbzVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bcbVar;
        this.statWrapperCase_ = 36;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveStatsWrapper(bdg bdgVar) {
        Objects.requireNonNull(bdgVar);
        if (this.statWrapperCase_ == 44 && this.statWrapper_ != bdg.getDefaultInstance()) {
            bde bdeVarNewBuilder = bdg.newBuilder((bdg) this.statWrapper_);
            bdeVarNewBuilder.mergeFrom((bde) bdgVar);
            bdgVar = bdeVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bdgVar;
        this.statWrapperCase_ = 44;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSharedStatWrapper(bdn bdnVar) {
        Objects.requireNonNull(bdnVar);
        if (this.statWrapperCase_ == 2 && this.statWrapper_ != bdn.getDefaultInstance()) {
            bdl bdlVarNewBuilder = bdn.newBuilder((bdn) this.statWrapper_);
            bdlVarNewBuilder.mergeFrom((bdl) bdnVar);
            bdnVar = bdlVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bdnVar;
        this.statWrapperCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSiriShortcutsStatsWrapper(bew bewVar) {
        Objects.requireNonNull(bewVar);
        if (this.statWrapperCase_ == 37 && this.statWrapper_ != bew.getDefaultInstance()) {
            beu beuVarNewBuilder = bew.newBuilder((bew) this.statWrapper_);
            beuVarNewBuilder.mergeFrom((beu) bewVar);
            bewVar = beuVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bewVar;
        this.statWrapperCase_ = 37;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartStateStatsWrapper(bgk bgkVar) {
        Objects.requireNonNull(bgkVar);
        if (this.statWrapperCase_ == 20 && this.statWrapper_ != bgk.getDefaultInstance()) {
            bgi bgiVarNewBuilder = bgk.newBuilder((bgk) this.statWrapper_);
            bgiVarNewBuilder.mergeFrom((bgi) bgkVar);
            bgkVar = bgiVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bgkVar;
        this.statWrapperCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedInsightsStatsWrapper(bhl bhlVar) {
        Objects.requireNonNull(bhlVar);
        if (this.statWrapperCase_ == 55 && this.statWrapper_ != bhl.getDefaultInstance()) {
            bhj bhjVarNewBuilder = bhl.newBuilder((bhl) this.statWrapper_);
            bhjVarNewBuilder.mergeFrom((bhj) bhlVar);
            bhlVar = bhjVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bhlVar;
        this.statWrapperCase_ = 55;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficBarStatsWrapper(bjn bjnVar) {
        Objects.requireNonNull(bjnVar);
        if (this.statWrapperCase_ == 45 && this.statWrapper_ != bjn.getDefaultInstance()) {
            bjl bjlVarNewBuilder = bjn.newBuilder((bjn) this.statWrapper_);
            bjlVarNewBuilder.mergeFrom((bjl) bjnVar);
            bjnVar = bjlVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bjnVar;
        this.statWrapperCase_ = 45;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewStatsWrapper(bmb bmbVar) {
        Objects.requireNonNull(bmbVar);
        if (this.statWrapperCase_ == 21 && this.statWrapper_ != bmb.getDefaultInstance()) {
            blz blzVarNewBuilder = bmb.newBuilder((bmb) this.statWrapper_);
            blzVarNewBuilder.mergeFrom((blz) bmbVar);
            bmbVar = blzVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bmbVar;
        this.statWrapperCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTtsStatsWrapper(bmo bmoVar) {
        Objects.requireNonNull(bmoVar);
        if (this.statWrapperCase_ == 46 && this.statWrapper_ != bmo.getDefaultInstance()) {
            bmm bmmVarNewBuilder = bmo.newBuilder((bmo) this.statWrapper_);
            bmmVarNewBuilder.mergeFrom((bmm) bmoVar);
            bmoVar = bmmVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bmoVar;
        this.statWrapperCase_ = 46;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUidStatsWrapper(bof bofVar) {
        Objects.requireNonNull(bofVar);
        if (this.statWrapperCase_ == 19 && this.statWrapper_ != bof.getDefaultInstance()) {
            bod bodVarNewBuilder = bof.newBuilder((bof) this.statWrapper_);
            bodVarNewBuilder.mergeFrom((bod) bofVar);
            bofVar = bodVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bofVar;
        this.statWrapperCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserLoginStatsWrapper(boy boyVar) {
        Objects.requireNonNull(boyVar);
        if (this.statWrapperCase_ == 38 && this.statWrapper_ != boy.getDefaultInstance()) {
            bow bowVarNewBuilder = boy.newBuilder((boy) this.statWrapper_);
            bowVarNewBuilder.mergeFrom((bow) boyVar);
            boyVar = bowVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = boyVar;
        this.statWrapperCase_ = 38;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPositionStatsWrapper(bpd bpdVar) {
        Objects.requireNonNull(bpdVar);
        if (this.statWrapperCase_ == 49 && this.statWrapper_ != bpd.getDefaultInstance()) {
            bpb bpbVarNewBuilder = bpd.newBuilder((bpd) this.statWrapper_);
            bpbVarNewBuilder.mergeFrom((bpb) bpdVar);
            bpdVar = bpbVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bpdVar;
        this.statWrapperCase_ = 49;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserProfileStatsWrapper(bpg bpgVar) {
        Objects.requireNonNull(bpgVar);
        if (this.statWrapperCase_ == 17 && this.statWrapper_ != bpg.getDefaultInstance()) {
            bpe bpeVarNewBuilder = bpg.newBuilder((bpg) this.statWrapper_);
            bpeVarNewBuilder.mergeFrom((bpe) bpgVar);
            bpgVar = bpeVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bpgVar;
        this.statWrapperCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserTrackingStatsWrapper(bpj bpjVar) {
        Objects.requireNonNull(bpjVar);
        if (this.statWrapperCase_ == 62 && this.statWrapper_ != bpj.getDefaultInstance()) {
            bph bphVarNewBuilder = bpj.newBuilder((bpj) this.statWrapper_);
            bphVarNewBuilder.mergeFrom((bph) bpjVar);
            bpjVar = bphVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bpjVar;
        this.statWrapperCase_ = 62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceAssistantStatsWrapper(bqa bqaVar) {
        Objects.requireNonNull(bqaVar);
        if (this.statWrapperCase_ == 47 && this.statWrapper_ != bqa.getDefaultInstance()) {
            bpy bpyVarNewBuilder = bqa.newBuilder((bqa) this.statWrapper_);
            bpyVarNewBuilder.mergeFrom((bpy) bqaVar);
            bqaVar = bpyVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bqaVar;
        this.statWrapperCase_ = 47;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoicesStatsWrapper(bqs bqsVar) {
        Objects.requireNonNull(bqsVar);
        if (this.statWrapperCase_ == 58 && this.statWrapper_ != bqs.getDefaultInstance()) {
            bqq bqqVarNewBuilder = bqs.newBuilder((bqs) this.statWrapper_);
            bqqVarNewBuilder.mergeFrom((bqq) bqsVar);
            bqsVar = bqqVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bqsVar;
        this.statWrapperCase_ = 58;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeStatWrapper(bsm bsmVar) {
        Objects.requireNonNull(bsmVar);
        if (this.statWrapperCase_ == 1 && this.statWrapper_ != bsm.getDefaultInstance()) {
            bsk bskVarNewBuilder = bsm.newBuilder((bsm) this.statWrapper_);
            bskVarNewBuilder.mergeFrom((bsk) bsmVar);
            bsmVar = bskVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bsmVar;
        this.statWrapperCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebViewStatsWrapper(bsp bspVar) {
        Objects.requireNonNull(bspVar);
        if (this.statWrapperCase_ == 48 && this.statWrapper_ != bsp.getDefaultInstance()) {
            bsn bsnVarNewBuilder = bsp.newBuilder((bsp) this.statWrapper_);
            bsnVarNewBuilder.mergeFrom((bsn) bspVar);
            bspVar = bsnVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = bspVar;
        this.statWrapperCase_ = 48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZeroSpeedStatsWrapper(btf btfVar) {
        Objects.requireNonNull(btfVar);
        if (this.statWrapperCase_ == 39 && this.statWrapper_ != btf.getDefaultInstance()) {
            btd btdVarNewBuilder = btf.newBuilder((btf) this.statWrapper_);
            btdVarNewBuilder.mergeFrom((btd) btfVar);
            btfVar = btdVarNewBuilder.buildPartial();
        }
        this.statWrapper_ = btfVar;
        this.statWrapperCase_ = 39;
    }

    public static brd newBuilder() {
        return (brd) DEFAULT_INSTANCE.createBuilder();
    }

    public static brf parseDelimitedFrom(InputStream inputStream) {
        return (brf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brf parseFrom(com.google.v.v vVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<brf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdsStatsWrapper(bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.statWrapper_ = bpVar;
        this.statWrapperCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternateRoutesStatsWrapper(dh dhVar) {
        Objects.requireNonNull(dhVar);
        this.statWrapper_ = dhVar;
        this.statWrapperCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppLifecycleStatsWrapper(fb fbVar) {
        Objects.requireNonNull(fbVar);
        this.statWrapper_ = fbVar;
        this.statWrapperCase_ = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconStatsWrapper(hw hwVar) {
        Objects.requireNonNull(hwVar);
        this.statWrapper_ = hwVar;
        this.statWrapperCase_ = 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayStatsWrapper(jl jlVar) {
        Objects.requireNonNull(jlVar);
        this.statWrapper_ = jlVar;
        this.statWrapperCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientEngStatsWrapper(kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.statWrapper_ = kjVar;
        this.statWrapperCase_ = 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClusterStatsWrapper(lf lfVar) {
        Objects.requireNonNull(lfVar);
        this.statWrapper_ = lfVar;
        this.statWrapperCase_ = 56;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoPilotStatsWrapper(lq lqVar) {
        Objects.requireNonNull(lqVar);
        this.statWrapper_ = lqVar;
        this.statWrapperCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommonWrapper(lt ltVar) {
        Objects.requireNonNull(ltVar);
        this.statWrapper_ = ltVar;
        this.statWrapperCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentStatsWrapper(lw lwVar) {
        Objects.requireNonNull(lwVar);
        this.statWrapper_ = lwVar;
        this.statWrapperCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationStatsWrapper(nh nhVar) {
        Objects.requireNonNull(nhVar);
        this.statWrapper_ = nhVar;
        this.statWrapperCase_ = 61;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkStatsWrapper(ps psVar) {
        Objects.requireNonNull(psVar);
        this.statWrapper_ = psVar;
        this.statWrapperCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCardStatsWrapper(qj qjVar) {
        Objects.requireNonNull(qjVar);
        this.statWrapper_ = qjVar;
        this.statWrapperCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourStatsWrapper(sg sgVar) {
        Objects.requireNonNull(sgVar);
        this.statWrapper_ = sgVar;
        this.statWrapperCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveDetectionStatsWrapper(sy syVar) {
        Objects.requireNonNull(syVar);
        this.statWrapper_ = syVar;
        this.statWrapperCase_ = 53;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveSuggestionStatsWrapper(tb tbVar) {
        Objects.requireNonNull(tbVar);
        this.statWrapper_ = tbVar;
        this.statWrapperCase_ = 51;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementStatsWrapper(uu uuVar) {
        Objects.requireNonNull(uuVar);
        this.statWrapper_ = uuVar;
        this.statWrapperCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaStatsWrapper(vq vqVar) {
        Objects.requireNonNull(vqVar);
        this.statWrapper_ = vqVar;
        this.statWrapperCase_ = 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvStatsWrapper(vt vtVar) {
        Objects.requireNonNull(vtVar);
        this.statWrapper_ = vtVar;
        this.statWrapperCase_ = 41;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoritesStatsWrapper(wm wmVar) {
        Objects.requireNonNull(wmVar);
        this.statWrapper_ = wmVar;
        this.statWrapperCase_ = 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdsStatsWrapper(zq zqVar) {
        Objects.requireNonNull(zqVar);
        this.statWrapper_ = zqVar;
        this.statWrapperCase_ = 54;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantStatsWrapper(aam aamVar) {
        Objects.requireNonNull(aamVar);
        this.statWrapper_ = aamVar;
        this.statWrapperCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsStatsWrapper(aax aaxVar) {
        Objects.requireNonNull(aaxVar);
        this.statWrapper_ = aaxVar;
        this.statWrapperCase_ = 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceStatsWrapper(abh abhVar) {
        Objects.requireNonNull(abhVar);
        this.statWrapper_ = abhVar;
        this.statWrapperCase_ = 57;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarMainScreenStatsWrapper(act actVar) {
        Objects.requireNonNull(actVar);
        this.statWrapper_ = actVar;
        this.statWrapperCase_ = 52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboxStatsWrapper(adf adfVar) {
        Objects.requireNonNull(adfVar);
        this.statWrapper_ = adfVar;
        this.statWrapperCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentStatsWrapper(aep aepVar) {
        Objects.requireNonNull(aepVar);
        this.statWrapper_ = aepVar;
        this.statWrapperCase_ = 59;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPreviewStatsWrapper(agy agyVar) {
        Objects.requireNonNull(agyVar);
        this.statWrapper_ = agyVar;
        this.statWrapperCase_ = 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainMenuStatsWrapper(aht ahtVar) {
        Objects.requireNonNull(ahtVar);
        this.statWrapper_ = ahtVar;
        this.statWrapperCase_ = 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapStatsWrapper(ajc ajcVar) {
        Objects.requireNonNull(ajcVar);
        this.statWrapper_ = ajcVar;
        this.statWrapperCase_ = 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicPlayerStatsWrapper(akq akqVar) {
        Objects.requireNonNull(akqVar);
        this.statWrapper_ = akqVar;
        this.statWrapperCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectStatsWrapper(alt altVar) {
        Objects.requireNonNull(altVar);
        this.statWrapper_ = altVar;
        this.statWrapperCase_ = 63;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationStatsWrapper(ams amsVar) {
        Objects.requireNonNull(amsVar);
        this.statWrapper_ = amsVar;
        this.statWrapperCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkStatsWrapper(ank ankVar) {
        Objects.requireNonNull(ankVar);
        this.statWrapper_ = ankVar;
        this.statWrapperCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingStatsWrapper(apo apoVar) {
        Objects.requireNonNull(apoVar);
        this.statWrapper_ = apoVar;
        this.statWrapperCase_ = 42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerformanceStatsWrapper(apz apzVar) {
        Objects.requireNonNull(apzVar);
        this.statWrapper_ = apzVar;
        this.statWrapperCase_ = 33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionsStatsWrapper(aqg aqgVar) {
        Objects.requireNonNull(aqgVar);
        this.statWrapper_ = aqgVar;
        this.statWrapperCase_ = 43;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveStatsWrapper(arb arbVar) {
        Objects.requireNonNull(arbVar);
        this.statWrapper_ = arbVar;
        this.statWrapperCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushStatsWrapper(atc atcVar) {
        Objects.requireNonNull(atcVar);
        this.statWrapper_ = atcVar;
        this.statWrapperCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeAlerterStatsWrapper(atp atpVar) {
        Objects.requireNonNull(atpVar);
        this.statWrapper_ = atpVar;
        this.statWrapperCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingStatsWrapper(avc avcVar) {
        Objects.requireNonNull(avcVar);
        this.statWrapper_ = avcVar;
        this.statWrapperCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteStatsWrapper(avj avjVar) {
        Objects.requireNonNull(avjVar);
        this.statWrapper_ = avjVar;
        this.statWrapperCase_ = 34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingStatsWrapper(aww awwVar) {
        Objects.requireNonNull(awwVar);
        this.statWrapper_ = awwVar;
        this.statWrapperCase_ = 35;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchStatsWrapper(azv azvVar) {
        Objects.requireNonNull(azvVar);
        this.statWrapper_ = azvVar;
        this.statWrapperCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsStatsWrapper(bcb bcbVar) {
        Objects.requireNonNull(bcbVar);
        this.statWrapper_ = bcbVar;
        this.statWrapperCase_ = 36;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveStatsWrapper(bdg bdgVar) {
        Objects.requireNonNull(bdgVar);
        this.statWrapper_ = bdgVar;
        this.statWrapperCase_ = 44;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedStatWrapper(bdn bdnVar) {
        Objects.requireNonNull(bdnVar);
        this.statWrapper_ = bdnVar;
        this.statWrapperCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriShortcutsStatsWrapper(bew bewVar) {
        Objects.requireNonNull(bewVar);
        this.statWrapper_ = bewVar;
        this.statWrapperCase_ = 37;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStateStatsWrapper(bgk bgkVar) {
        Objects.requireNonNull(bgkVar);
        this.statWrapper_ = bgkVar;
        this.statWrapperCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedInsightsStatsWrapper(bhl bhlVar) {
        Objects.requireNonNull(bhlVar);
        this.statWrapper_ = bhlVar;
        this.statWrapperCase_ = 55;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficBarStatsWrapper(bjn bjnVar) {
        Objects.requireNonNull(bjnVar);
        this.statWrapper_ = bjnVar;
        this.statWrapperCase_ = 45;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewStatsWrapper(bmb bmbVar) {
        Objects.requireNonNull(bmbVar);
        this.statWrapper_ = bmbVar;
        this.statWrapperCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsStatsWrapper(bmo bmoVar) {
        Objects.requireNonNull(bmoVar);
        this.statWrapper_ = bmoVar;
        this.statWrapperCase_ = 46;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUidStatsWrapper(bof bofVar) {
        Objects.requireNonNull(bofVar);
        this.statWrapper_ = bofVar;
        this.statWrapperCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLoginStatsWrapper(boy boyVar) {
        Objects.requireNonNull(boyVar);
        this.statWrapper_ = boyVar;
        this.statWrapperCase_ = 38;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPositionStatsWrapper(bpd bpdVar) {
        Objects.requireNonNull(bpdVar);
        this.statWrapper_ = bpdVar;
        this.statWrapperCase_ = 49;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserProfileStatsWrapper(bpg bpgVar) {
        Objects.requireNonNull(bpgVar);
        this.statWrapper_ = bpgVar;
        this.statWrapperCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTrackingStatsWrapper(bpj bpjVar) {
        Objects.requireNonNull(bpjVar);
        this.statWrapper_ = bpjVar;
        this.statWrapperCase_ = 62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceAssistantStatsWrapper(bqa bqaVar) {
        Objects.requireNonNull(bqaVar);
        this.statWrapper_ = bqaVar;
        this.statWrapperCase_ = 47;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicesStatsWrapper(bqs bqsVar) {
        Objects.requireNonNull(bqsVar);
        this.statWrapper_ = bqsVar;
        this.statWrapperCase_ = 58;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeStatWrapper(bsm bsmVar) {
        Objects.requireNonNull(bsmVar);
        this.statWrapper_ = bsmVar;
        this.statWrapperCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebViewStatsWrapper(bsp bspVar) {
        Objects.requireNonNull(bspVar);
        this.statWrapper_ = bspVar;
        this.statWrapperCase_ = 48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZeroSpeedStatsWrapper(btf btfVar) {
        Objects.requireNonNull(btfVar);
        this.statWrapper_ = btfVar;
        this.statWrapperCase_ = 39;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000?\u0001\u0000\u0001??\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000+<\u0000,<\u0000-<\u0000.<\u0000/<\u00000<\u00001<\u00002<\u00003<\u00004<\u00005<\u00006<\u00007<\u00008<\u00009<\u0000:<\u0000;<\u0000<<\u0000=<\u0000><\u0000?<\u0000", new Object[]{"statWrapper_", "statWrapperCase_", bsm.class, bdn.class, lt.class, atp.class, bp.class, azv.class, qj.class, ams.class, uu.class, lw.class, aam.class, adf.class, ps.class, ank.class, atc.class, arb.class, bpg.class, avc.class, bof.class, bgk.class, bmb.class, akq.class, dh.class, fb.class, jl.class, lq.class, sg.class, vq.class, aax.class, agy.class, aht.class, ajc.class, apz.class, avj.class, aww.class, bcb.class, bew.class, boy.class, btf.class, hw.class, vt.class, apo.class, aqg.class, bdg.class, bjn.class, bmo.class, bqa.class, bsp.class, bpd.class, wm.class, tb.class, act.class, sy.class, zq.class, bhl.class, lf.class, abh.class, bqs.class, aep.class, kj.class, nh.class, bpj.class, alt.class});
        }
        if (iOrdinal == 3) {
            return new brf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new brd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<brf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (brf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bp getAdsStatsWrapper() {
        return this.statWrapperCase_ == 5 ? (bp) this.statWrapper_ : bp.getDefaultInstance();
    }

    public dh getAlternateRoutesStatsWrapper() {
        return this.statWrapperCase_ == 23 ? (dh) this.statWrapper_ : dh.getDefaultInstance();
    }

    public fb getAppLifecycleStatsWrapper() {
        return this.statWrapperCase_ == 24 ? (fb) this.statWrapper_ : fb.getDefaultInstance();
    }

    public hw getBeaconStatsWrapper() {
        return this.statWrapperCase_ == 40 ? (hw) this.statWrapper_ : hw.getDefaultInstance();
    }

    public jl getCarplayStatsWrapper() {
        return this.statWrapperCase_ == 25 ? (jl) this.statWrapper_ : jl.getDefaultInstance();
    }

    public kj getClientEngStatsWrapper() {
        return this.statWrapperCase_ == 60 ? (kj) this.statWrapper_ : kj.getDefaultInstance();
    }

    public lf getClusterStatsWrapper() {
        return this.statWrapperCase_ == 56 ? (lf) this.statWrapper_ : lf.getDefaultInstance();
    }

    public lq getCoPilotStatsWrapper() {
        return this.statWrapperCase_ == 26 ? (lq) this.statWrapper_ : lq.getDefaultInstance();
    }

    @Deprecated
    public lt getCommonWrapper() {
        return this.statWrapperCase_ == 3 ? (lt) this.statWrapper_ : lt.getDefaultInstance();
    }

    public lw getConsentStatsWrapper() {
        return this.statWrapperCase_ == 10 ? (lw) this.statWrapper_ : lw.getDefaultInstance();
    }

    public nh getConversationStatsWrapper() {
        return this.statWrapperCase_ == 61 ? (nh) this.statWrapper_ : nh.getDefaultInstance();
    }

    public ps getDeeplinkStatsWrapper() {
        return this.statWrapperCase_ == 13 ? (ps) this.statWrapper_ : ps.getDefaultInstance();
    }

    public qj getDestinationCardStatsWrapper() {
        return this.statWrapperCase_ == 7 ? (qj) this.statWrapper_ : qj.getDefaultInstance();
    }

    public sg getDetourStatsWrapper() {
        return this.statWrapperCase_ == 27 ? (sg) this.statWrapper_ : sg.getDefaultInstance();
    }

    public sy getDriveDetectionStatsWrapper() {
        return this.statWrapperCase_ == 53 ? (sy) this.statWrapper_ : sy.getDefaultInstance();
    }

    public tb getDriveSuggestionStatsWrapper() {
        return this.statWrapperCase_ == 51 ? (tb) this.statWrapper_ : tb.getDefaultInstance();
    }

    public uu getEncouragementStatsWrapper() {
        return this.statWrapperCase_ == 9 ? (uu) this.statWrapper_ : uu.getDefaultInstance();
    }

    public vq getEtaStatsWrapper() {
        return this.statWrapperCase_ == 28 ? (vq) this.statWrapper_ : vq.getDefaultInstance();
    }

    public vt getEvStatsWrapper() {
        return this.statWrapperCase_ == 41 ? (vt) this.statWrapper_ : vt.getDefaultInstance();
    }

    public wm getFavoritesStatsWrapper() {
        return this.statWrapperCase_ == 50 ? (wm) this.statWrapper_ : wm.getDefaultInstance();
    }

    public zq getGoogleAdsStatsWrapper() {
        return this.statWrapperCase_ == 54 ? (zq) this.statWrapper_ : zq.getDefaultInstance();
    }

    public aam getGoogleAssistantStatsWrapper() {
        return this.statWrapperCase_ == 11 ? (aam) this.statWrapper_ : aam.getDefaultInstance();
    }

    public aax getGpsStatsWrapper() {
        return this.statWrapperCase_ == 29 ? (aax) this.statWrapper_ : aax.getDefaultInstance();
    }

    public abh getGuidanceStatsWrapper() {
        return this.statWrapperCase_ == 57 ? (abh) this.statWrapper_ : abh.getDefaultInstance();
    }

    public act getInCarMainScreenStatsWrapper() {
        return this.statWrapperCase_ == 52 ? (act) this.statWrapper_ : act.getDefaultInstance();
    }

    public adf getInboxStatsWrapper() {
        return this.statWrapperCase_ == 12 ? (adf) this.statWrapper_ : adf.getDefaultInstance();
    }

    public aep getInsightComponentStatsWrapper() {
        return this.statWrapperCase_ == 59 ? (aep) this.statWrapper_ : aep.getDefaultInstance();
    }

    public agy getLocationPreviewStatsWrapper() {
        return this.statWrapperCase_ == 30 ? (agy) this.statWrapper_ : agy.getDefaultInstance();
    }

    public aht getMainMenuStatsWrapper() {
        return this.statWrapperCase_ == 31 ? (aht) this.statWrapper_ : aht.getDefaultInstance();
    }

    public ajc getMapStatsWrapper() {
        return this.statWrapperCase_ == 32 ? (ajc) this.statWrapper_ : ajc.getDefaultInstance();
    }

    public akq getMusicPlayerStatsWrapper() {
        return this.statWrapperCase_ == 22 ? (akq) this.statWrapper_ : akq.getDefaultInstance();
    }

    public alt getNavConnectStatsWrapper() {
        return this.statWrapperCase_ == 63 ? (alt) this.statWrapper_ : alt.getDefaultInstance();
    }

    public ams getNavigationStatsWrapper() {
        return this.statWrapperCase_ == 8 ? (ams) this.statWrapper_ : ams.getDefaultInstance();
    }

    public ank getNetworkStatsWrapper() {
        return this.statWrapperCase_ == 14 ? (ank) this.statWrapper_ : ank.getDefaultInstance();
    }

    public apo getParkingStatsWrapper() {
        return this.statWrapperCase_ == 42 ? (apo) this.statWrapper_ : apo.getDefaultInstance();
    }

    public apz getPerformanceStatsWrapper() {
        return this.statWrapperCase_ == 33 ? (apz) this.statWrapper_ : apz.getDefaultInstance();
    }

    public aqg getPermissionsStatsWrapper() {
        return this.statWrapperCase_ == 43 ? (aqg) this.statWrapper_ : aqg.getDefaultInstance();
    }

    public arb getPlannedDriveStatsWrapper() {
        return this.statWrapperCase_ == 16 ? (arb) this.statWrapper_ : arb.getDefaultInstance();
    }

    public atc getPushStatsWrapper() {
        return this.statWrapperCase_ == 15 ? (atc) this.statWrapper_ : atc.getDefaultInstance();
    }

    public atp getRealTimeAlerterStatsWrapper() {
        return this.statWrapperCase_ == 4 ? (atp) this.statWrapper_ : atp.getDefaultInstance();
    }

    public avc getReportingStatsWrapper() {
        return this.statWrapperCase_ == 18 ? (avc) this.statWrapper_ : avc.getDefaultInstance();
    }

    public avj getRerouteStatsWrapper() {
        return this.statWrapperCase_ == 34 ? (avj) this.statWrapper_ : avj.getDefaultInstance();
    }

    public aww getRoutingStatsWrapper() {
        return this.statWrapperCase_ == 35 ? (aww) this.statWrapper_ : aww.getDefaultInstance();
    }

    public azv getSearchStatsWrapper() {
        return this.statWrapperCase_ == 6 ? (azv) this.statWrapper_ : azv.getDefaultInstance();
    }

    public bcb getSettingsStatsWrapper() {
        return this.statWrapperCase_ == 36 ? (bcb) this.statWrapper_ : bcb.getDefaultInstance();
    }

    public bdg getShareDriveStatsWrapper() {
        return this.statWrapperCase_ == 44 ? (bdg) this.statWrapper_ : bdg.getDefaultInstance();
    }

    @Deprecated
    public bdn getSharedStatWrapper() {
        return this.statWrapperCase_ == 2 ? (bdn) this.statWrapper_ : bdn.getDefaultInstance();
    }

    public bew getSiriShortcutsStatsWrapper() {
        return this.statWrapperCase_ == 37 ? (bew) this.statWrapper_ : bew.getDefaultInstance();
    }

    public bgk getStartStateStatsWrapper() {
        return this.statWrapperCase_ == 20 ? (bgk) this.statWrapper_ : bgk.getDefaultInstance();
    }

    public bre getStatWrapperCase() {
        switch (this.statWrapperCase_) {
            case 0:
                return bre.al;
            case 1:
                return bre.f54549a;
            case 2:
                return bre.f54550b;
            case 3:
                return bre.f54551c;
            case 4:
                return bre.f54552d;
            case 5:
                return bre.f54553e;
            case 6:
                return bre.f54554f;
            case 7:
                return bre.f54555g;
            case 8:
                return bre.f54556h;
            case 9:
                return bre.f54557i;
            case 10:
                return bre.f54558j;
            case 11:
                return bre.f54559k;
            case 12:
                return bre.f54560l;
            case 13:
                return bre.m;
            case 14:
                return bre.n;
            case 15:
                return bre.o;
            case 16:
                return bre.p;
            case 17:
                return bre.q;
            case 18:
                return bre.r;
            case 19:
                return bre.s;
            case 20:
                return bre.t;
            case 21:
                return bre.u;
            case 22:
                return bre.v;
            case 23:
                return bre.w;
            case 24:
                return bre.x;
            case 25:
                return bre.y;
            case 26:
                return bre.z;
            case 27:
                return bre.A;
            case 28:
                return bre.B;
            case 29:
                return bre.C;
            case 30:
                return bre.D;
            case 31:
                return bre.E;
            case 32:
                return bre.F;
            case 33:
                return bre.G;
            case 34:
                return bre.H;
            case 35:
                return bre.I;
            case 36:
                return bre.J;
            case 37:
                return bre.K;
            case 38:
                return bre.L;
            case 39:
                return bre.M;
            case 40:
                return bre.N;
            case 41:
                return bre.O;
            case 42:
                return bre.P;
            case 43:
                return bre.Q;
            case 44:
                return bre.R;
            case 45:
                return bre.S;
            case 46:
                return bre.T;
            case 47:
                return bre.U;
            case 48:
                return bre.V;
            case 49:
                return bre.W;
            case 50:
                return bre.X;
            case 51:
                return bre.Y;
            case 52:
                return bre.Z;
            case 53:
                return bre.aa;
            case 54:
                return bre.ab;
            case 55:
                return bre.ac;
            case 56:
                return bre.ad;
            case 57:
                return bre.ae;
            case 58:
                return bre.af;
            case 59:
                return bre.ag;
            case 60:
                return bre.ah;
            case 61:
                return bre.ai;
            case 62:
                return bre.aj;
            case 63:
                return bre.ak;
            default:
                return null;
        }
    }

    public bhl getSurfacedInsightsStatsWrapper() {
        return this.statWrapperCase_ == 55 ? (bhl) this.statWrapper_ : bhl.getDefaultInstance();
    }

    public bjn getTrafficBarStatsWrapper() {
        return this.statWrapperCase_ == 45 ? (bjn) this.statWrapper_ : bjn.getDefaultInstance();
    }

    public bmb getTripOverviewStatsWrapper() {
        return this.statWrapperCase_ == 21 ? (bmb) this.statWrapper_ : bmb.getDefaultInstance();
    }

    public bmo getTtsStatsWrapper() {
        return this.statWrapperCase_ == 46 ? (bmo) this.statWrapper_ : bmo.getDefaultInstance();
    }

    public bof getUidStatsWrapper() {
        return this.statWrapperCase_ == 19 ? (bof) this.statWrapper_ : bof.getDefaultInstance();
    }

    public boy getUserLoginStatsWrapper() {
        return this.statWrapperCase_ == 38 ? (boy) this.statWrapper_ : boy.getDefaultInstance();
    }

    public bpd getUserPositionStatsWrapper() {
        return this.statWrapperCase_ == 49 ? (bpd) this.statWrapper_ : bpd.getDefaultInstance();
    }

    public bpg getUserProfileStatsWrapper() {
        return this.statWrapperCase_ == 17 ? (bpg) this.statWrapper_ : bpg.getDefaultInstance();
    }

    public bpj getUserTrackingStatsWrapper() {
        return this.statWrapperCase_ == 62 ? (bpj) this.statWrapper_ : bpj.getDefaultInstance();
    }

    public bqa getVoiceAssistantStatsWrapper() {
        return this.statWrapperCase_ == 47 ? (bqa) this.statWrapper_ : bqa.getDefaultInstance();
    }

    public bqs getVoicesStatsWrapper() {
        return this.statWrapperCase_ == 58 ? (bqs) this.statWrapper_ : bqs.getDefaultInstance();
    }

    @Deprecated
    public bsm getWazeStatWrapper() {
        return this.statWrapperCase_ == 1 ? (bsm) this.statWrapper_ : bsm.getDefaultInstance();
    }

    public bsp getWebViewStatsWrapper() {
        return this.statWrapperCase_ == 48 ? (bsp) this.statWrapper_ : bsp.getDefaultInstance();
    }

    public btf getZeroSpeedStatsWrapper() {
        return this.statWrapperCase_ == 39 ? (btf) this.statWrapper_ : btf.getDefaultInstance();
    }

    public boolean hasAdsStatsWrapper() {
        return this.statWrapperCase_ == 5;
    }

    public boolean hasAlternateRoutesStatsWrapper() {
        return this.statWrapperCase_ == 23;
    }

    public boolean hasAppLifecycleStatsWrapper() {
        return this.statWrapperCase_ == 24;
    }

    public boolean hasBeaconStatsWrapper() {
        return this.statWrapperCase_ == 40;
    }

    public boolean hasCarplayStatsWrapper() {
        return this.statWrapperCase_ == 25;
    }

    public boolean hasClientEngStatsWrapper() {
        return this.statWrapperCase_ == 60;
    }

    public boolean hasClusterStatsWrapper() {
        return this.statWrapperCase_ == 56;
    }

    public boolean hasCoPilotStatsWrapper() {
        return this.statWrapperCase_ == 26;
    }

    @Deprecated
    public boolean hasCommonWrapper() {
        return this.statWrapperCase_ == 3;
    }

    public boolean hasConsentStatsWrapper() {
        return this.statWrapperCase_ == 10;
    }

    public boolean hasConversationStatsWrapper() {
        return this.statWrapperCase_ == 61;
    }

    public boolean hasDeeplinkStatsWrapper() {
        return this.statWrapperCase_ == 13;
    }

    public boolean hasDestinationCardStatsWrapper() {
        return this.statWrapperCase_ == 7;
    }

    public boolean hasDetourStatsWrapper() {
        return this.statWrapperCase_ == 27;
    }

    public boolean hasDriveDetectionStatsWrapper() {
        return this.statWrapperCase_ == 53;
    }

    public boolean hasDriveSuggestionStatsWrapper() {
        return this.statWrapperCase_ == 51;
    }

    public boolean hasEncouragementStatsWrapper() {
        return this.statWrapperCase_ == 9;
    }

    public boolean hasEtaStatsWrapper() {
        return this.statWrapperCase_ == 28;
    }

    public boolean hasEvStatsWrapper() {
        return this.statWrapperCase_ == 41;
    }

    public boolean hasFavoritesStatsWrapper() {
        return this.statWrapperCase_ == 50;
    }

    public boolean hasGoogleAdsStatsWrapper() {
        return this.statWrapperCase_ == 54;
    }

    public boolean hasGoogleAssistantStatsWrapper() {
        return this.statWrapperCase_ == 11;
    }

    public boolean hasGpsStatsWrapper() {
        return this.statWrapperCase_ == 29;
    }

    public boolean hasGuidanceStatsWrapper() {
        return this.statWrapperCase_ == 57;
    }

    public boolean hasInCarMainScreenStatsWrapper() {
        return this.statWrapperCase_ == 52;
    }

    public boolean hasInboxStatsWrapper() {
        return this.statWrapperCase_ == 12;
    }

    public boolean hasInsightComponentStatsWrapper() {
        return this.statWrapperCase_ == 59;
    }

    public boolean hasLocationPreviewStatsWrapper() {
        return this.statWrapperCase_ == 30;
    }

    public boolean hasMainMenuStatsWrapper() {
        return this.statWrapperCase_ == 31;
    }

    public boolean hasMapStatsWrapper() {
        return this.statWrapperCase_ == 32;
    }

    public boolean hasMusicPlayerStatsWrapper() {
        return this.statWrapperCase_ == 22;
    }

    public boolean hasNavConnectStatsWrapper() {
        return this.statWrapperCase_ == 63;
    }

    public boolean hasNavigationStatsWrapper() {
        return this.statWrapperCase_ == 8;
    }

    public boolean hasNetworkStatsWrapper() {
        return this.statWrapperCase_ == 14;
    }

    public boolean hasParkingStatsWrapper() {
        return this.statWrapperCase_ == 42;
    }

    public boolean hasPerformanceStatsWrapper() {
        return this.statWrapperCase_ == 33;
    }

    public boolean hasPermissionsStatsWrapper() {
        return this.statWrapperCase_ == 43;
    }

    public boolean hasPlannedDriveStatsWrapper() {
        return this.statWrapperCase_ == 16;
    }

    public boolean hasPushStatsWrapper() {
        return this.statWrapperCase_ == 15;
    }

    public boolean hasRealTimeAlerterStatsWrapper() {
        return this.statWrapperCase_ == 4;
    }

    public boolean hasReportingStatsWrapper() {
        return this.statWrapperCase_ == 18;
    }

    public boolean hasRerouteStatsWrapper() {
        return this.statWrapperCase_ == 34;
    }

    public boolean hasRoutingStatsWrapper() {
        return this.statWrapperCase_ == 35;
    }

    public boolean hasSearchStatsWrapper() {
        return this.statWrapperCase_ == 6;
    }

    public boolean hasSettingsStatsWrapper() {
        return this.statWrapperCase_ == 36;
    }

    public boolean hasShareDriveStatsWrapper() {
        return this.statWrapperCase_ == 44;
    }

    @Deprecated
    public boolean hasSharedStatWrapper() {
        return this.statWrapperCase_ == 2;
    }

    public boolean hasSiriShortcutsStatsWrapper() {
        return this.statWrapperCase_ == 37;
    }

    public boolean hasStartStateStatsWrapper() {
        return this.statWrapperCase_ == 20;
    }

    public boolean hasSurfacedInsightsStatsWrapper() {
        return this.statWrapperCase_ == 55;
    }

    public boolean hasTrafficBarStatsWrapper() {
        return this.statWrapperCase_ == 45;
    }

    public boolean hasTripOverviewStatsWrapper() {
        return this.statWrapperCase_ == 21;
    }

    public boolean hasTtsStatsWrapper() {
        return this.statWrapperCase_ == 46;
    }

    public boolean hasUidStatsWrapper() {
        return this.statWrapperCase_ == 19;
    }

    public boolean hasUserLoginStatsWrapper() {
        return this.statWrapperCase_ == 38;
    }

    public boolean hasUserPositionStatsWrapper() {
        return this.statWrapperCase_ == 49;
    }

    public boolean hasUserProfileStatsWrapper() {
        return this.statWrapperCase_ == 17;
    }

    public boolean hasUserTrackingStatsWrapper() {
        return this.statWrapperCase_ == 62;
    }

    public boolean hasVoiceAssistantStatsWrapper() {
        return this.statWrapperCase_ == 47;
    }

    public boolean hasVoicesStatsWrapper() {
        return this.statWrapperCase_ == 58;
    }

    @Deprecated
    public boolean hasWazeStatWrapper() {
        return this.statWrapperCase_ == 1;
    }

    public boolean hasWebViewStatsWrapper() {
        return this.statWrapperCase_ == 48;
    }

    public boolean hasZeroSpeedStatsWrapper() {
        return this.statWrapperCase_ == 39;
    }

    public static brd newBuilder(brf brfVar) {
        return (brd) DEFAULT_INSTANCE.createBuilder(brfVar);
    }

    public static brf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static brf parseFrom(com.google.v.z zVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static brf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static brf parseFrom(InputStream inputStream) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brf parseFrom(ByteBuffer byteBuffer) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static brf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static brf parseFrom(byte[] bArr) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static brf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (brf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bas extends com.google.v.du<bas, bao> implements com.google.v.fj {
    public static final int API_FIELD_NUMBER = 1;
    public static final int APP_CHECK_TOKEN_GENERATION_LATENCY_MS_FIELD_NUMBER = 15;
    public static final int CLIENT_QUEUE_LATENCY_MS_FIELD_NUMBER = 7;
    private static final bas DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int FAILURE_REASON_FIELD_NUMBER = 4;
    public static final int FAILURE_REASON_SOURCE_FIELD_NUMBER = 6;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bas> PARSER = null;
    public static final int QUALITY_OF_SERVICE_FIELD_NUMBER = 11;
    public static final int REQUEST_QUEUE_FIELD_NUMBER = 12;
    public static final int REQUEST_SIZE_BYTES_FIELD_NUMBER = 13;
    public static final int RESPONSE_SIZE_BYTES_FIELD_NUMBER = 14;
    public static final int RETRIES_FIELD_NUMBER = 10;
    public static final int ROUNDTRIP_LATENCY_MS_FIELD_NUMBER = 9;
    public static final int SERVER_PROCESSING_LATENCY_MS_FIELD_NUMBER = 8;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int api_;
    private long appCheckTokenGenerationLatencyMs_;
    private int bitField0_;
    private long clientQueueLatencyMs_;
    private long errorCode_;
    private int failureReasonSource_;
    private String failureReason_ = "";
    private long latencyMs_;
    private int qualityOfService_;
    private int requestQueue_;
    private long requestSizeBytes_;
    private long responseSizeBytes_;
    private long retries_;
    private long roundtripLatencyMs_;
    private long serverProcessingLatencyMs_;
    private boolean success_;

    static {
        bas basVar = new bas();
        DEFAULT_INSTANCE = basVar;
        com.google.v.du.registerDefaultInstance(bas.class, basVar);
    }

    private bas() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApi() {
        this.api_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppCheckTokenGenerationLatencyMs() {
        this.bitField0_ &= -513;
        this.appCheckTokenGenerationLatencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientQueueLatencyMs() {
        this.bitField0_ &= -9;
        this.clientQueueLatencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -5;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.failureReason_ = getDefaultInstance().getFailureReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReasonSource() {
        this.failureReasonSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -3;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualityOfService() {
        this.qualityOfService_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestQueue() {
        this.requestQueue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestSizeBytes() {
        this.bitField0_ &= -129;
        this.requestSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseSizeBytes() {
        this.bitField0_ &= -257;
        this.responseSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetries() {
        this.bitField0_ &= -65;
        this.retries_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundtripLatencyMs() {
        this.bitField0_ &= -33;
        this.roundtripLatencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerProcessingLatencyMs() {
        this.bitField0_ &= -17;
        this.serverProcessingLatencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    public static bas getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bao newBuilder() {
        return (bao) DEFAULT_INSTANCE.createBuilder();
    }

    public static bas parseDelimitedFrom(InputStream inputStream) {
        return (bas) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bas parseFrom(com.google.v.v vVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bas> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApi(ban banVar) {
        this.api_ = banVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiValue(int i2) {
        this.api_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppCheckTokenGenerationLatencyMs(long j2) {
        this.bitField0_ |= 512;
        this.appCheckTokenGenerationLatencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientQueueLatencyMs(long j2) {
        this.bitField0_ |= 8;
        this.clientQueueLatencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 4;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(String str) {
        Objects.requireNonNull(str);
        this.failureReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.failureReason_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonSource(bap bapVar) {
        this.failureReasonSource_ = bapVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonSourceValue(int i2) {
        this.failureReasonSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 2;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityOfService(baq baqVar) {
        this.qualityOfService_ = baqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityOfServiceValue(int i2) {
        this.qualityOfService_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestQueue(bar barVar) {
        this.requestQueue_ = barVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestQueueValue(int i2) {
        this.requestQueue_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestSizeBytes(long j2) {
        this.bitField0_ |= 128;
        this.requestSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseSizeBytes(long j2) {
        this.bitField0_ |= 256;
        this.responseSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetries(long j2) {
        this.bitField0_ |= 64;
        this.retries_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundtripLatencyMs(long j2) {
        this.bitField0_ |= 32;
        this.roundtripLatencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerProcessingLatencyMs(long j2) {
        this.bitField0_ |= 16;
        this.serverProcessingLatencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003ဂ\u0001\u0004Ȉ\u0005ဂ\u0002\u0006\f\u0007ဂ\u0003\bဂ\u0004\tဂ\u0005\nဂ\u0006\u000b\f\f\f\rဂ\u0007\u000eဂ\b\u000fဂ\t", new Object[]{"bitField0_", "api_", "success_", "latencyMs_", "failureReason_", "errorCode_", "failureReasonSource_", "clientQueueLatencyMs_", "serverProcessingLatencyMs_", "roundtripLatencyMs_", "retries_", "qualityOfService_", "requestQueue_", "requestSizeBytes_", "responseSizeBytes_", "appCheckTokenGenerationLatencyMs_"});
        }
        if (iOrdinal == 3) {
            return new bas();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bao(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bas> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bas.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ban getApi() {
        ban banVar;
        switch (this.api_) {
            case 0:
                banVar = ban.API_UNSPECIFIED;
                break;
            case 1:
                banVar = ban.ADD_USER_REPORTED_ALERT;
                break;
            case 2:
                banVar = ban.AUTH_SERVICE_GET_TOKEN;
                break;
            case 3:
                banVar = ban.CHECK_USER_AUTH;
                break;
            case 4:
                banVar = ban.COMPLETE_VERIFY_EMAIL;
                break;
            case 5:
                banVar = ban.CONNECT_GUEST_TO_IDENTIFIER;
                break;
            case 6:
                banVar = ban.CREATE_MEETING;
                break;
            case 7:
                banVar = ban.BACK_FROM_TRIP_OVERVIEW;
                break;
            case 8:
                banVar = ban.GET_COPILOT_ASSETS;
                break;
            case 9:
                banVar = ban.GET_GAMING_STATUS;
                break;
            case 10:
                banVar = ban.GET_MAIN_MENU_BANNERS;
                break;
            case 11:
                banVar = ban.GET_MARKETPLACE_NEW_CONTENT_AVAILABILITY;
                break;
            case 12:
                banVar = ban.IS_AADC_RESTRICTED;
                break;
            case 13:
                banVar = ban.LIST_SUGGESTIONS;
                break;
            case 14:
                banVar = ban.LOCATE_ACCOUNT_BY_COMMUNITY;
                break;
            case 15:
                banVar = ban.LOGIN;
                break;
            case 16:
                banVar = ban.LOGOUT;
                break;
            case 17:
                banVar = ban.QR_LOGIN_CREATE_LOGIN_CREDENTIALS_REQUEST;
                break;
            case 18:
                banVar = ban.QR_LOGIN_GET_CREDENTIAL_FOR_QR_TOKEN_REQUEST;
                break;
            case 19:
                banVar = ban.QR_LOGIN_NOTIFY_QR_SCANNED_REQUEST;
                break;
            case 20:
                banVar = ban.REGISTER;
                break;
            case 21:
                banVar = ban.REGISTER_CONNECT;
                break;
            case 22:
                banVar = ban.REPORT_EVENTS;
                break;
            case 23:
                banVar = ban.REPORT_THUMBS_DOWN;
                break;
            case 24:
                banVar = ban.REPORT_THUMBS_UP;
                break;
            case 25:
                banVar = ban.ROUTES_DURATION;
                break;
            case 26:
                banVar = ban.ROUTING_REQUEST;
                break;
            case 27:
                banVar = ban.SELECT_ROUTE;
                break;
            case 28:
                banVar = ban.SWITCH_ACCOUNT;
                break;
            case 29:
                banVar = ban.UPDATE_MAIN_MENU_BANNER_ACTION;
                break;
            case 30:
                banVar = ban.UPDATE_USER_FIELDS;
                break;
            case 31:
                banVar = ban.VERIFY_EMAIL;
                break;
            case 32:
                banVar = ban.ALTERNATIVE_ROUTES_REQUEST;
                break;
            case 33:
                banVar = ban.DETOUR_SELECTED_REQUEST;
                break;
            case 34:
                banVar = ban.SEARCH_V2;
                break;
            case 35:
                banVar = ban.COPILOT_GET_CARS;
                break;
            case 36:
                banVar = ban.REFRESH_CYCLE;
                break;
            case 37:
                banVar = ban.GET_MAP_BANNERS;
                break;
            case 38:
                banVar = ban.UPDATE_MAP_BANNER_ACTION;
                break;
            case 39:
                banVar = ban.GET_GEO_CONFIG;
                break;
            case 40:
                banVar = ban.PUSH_DISPLAYED_REQUEST;
                break;
            case 41:
                banVar = ban.ENGAGEMENT_DISPLAYED_REQUEST;
                break;
            case 42:
                banVar = ban.ENGAGEMENT_BUTTON_CLICKED_REQUEST;
                break;
            case 43:
                banVar = ban.ENABLE_LOCATION_REPORTING_REQUEST;
                break;
            case 44:
                banVar = ban.START_WALKING_REQUEST;
                break;
            case 45:
                banVar = ban.NOTIFY_REFERRER_RECEIVED_REQUEST;
                break;
            case 46:
                banVar = ban.GET_UPDATE_MEETINGS_REQUEST;
                break;
            case 47:
                banVar = ban.INITIATE_CONVERSATION;
                break;
            case 48:
                banVar = ban.SEND_CONVERSATION_MESSAGE;
                break;
            case 49:
                banVar = ban.TRIP_OVERVIEW_REQUEST;
                break;
            case 50:
                banVar = ban.START_NAVIGATION_REQUEST;
                break;
            case 51:
                banVar = ban.ADD_WAYPOINT;
                break;
            case 52:
                banVar = ban.WAZE_ASKS;
                break;
            case 53:
                banVar = ban.GET_VOICE_INSTRUCTIONS;
                break;
            case 54:
                banVar = ban.AUTHENTICATE;
                break;
            case 55:
                banVar = ban.GENERATE_TEXT_VOICE_ASSET;
                break;
            case 56:
                banVar = ban.GENERATE_INSTRUCTION_VOICE_ASSETS;
                break;
            case 57:
                banVar = ban.ESTIMATE_WAYPOINT_DETOUR;
                break;
            case 58:
                banVar = ban.GET_ROUTE_DESCRIPTION;
                break;
            case 59:
                banVar = ban.GET_PIN_ADS;
                break;
            case 60:
                banVar = ban.DRIVE_DETECTION;
                break;
            case 61:
                banVar = ban.USER_PERFORMED_PLAN_DRIVE_CHECK;
                break;
            case 62:
                banVar = ban.GET_VOICES_SETTINGS;
                break;
            case 63:
                banVar = ban.REPORT_MAP_ISSUE;
                break;
            case 64:
                banVar = ban.ROUTE_UPDATE_REQUEST;
                break;
            case 65:
                banVar = ban.CHAT_REQUEST;
                break;
            case 66:
                banVar = ban.CALCULATE_AND_START_NAVIGATION_REQUEST;
                break;
            case 67:
                banVar = ban.REROUTE_REQUEST;
                break;
            case 68:
                banVar = ban.QR_LOGIN_CREATE_QR_TOKEN_REQUEST;
                break;
            case 69:
                banVar = ban.QR_LOGIN_USER_REFUSED_REQUEST;
                break;
            case 70:
                banVar = ban.SEARCH;
                break;
            case 71:
                banVar = ban.QUERY_PROFILE;
                break;
            case 72:
                banVar = ban.COMPLETE_ONBOARDING;
                break;
            case 73:
                banVar = ban.VENUE_SEARCH;
                break;
            case 74:
                banVar = ban.ANSWER_QUESTION;
                break;
            case 75:
                banVar = ban.REVOKE_CREDENTIALS_TOKENS_REQUEST;
                break;
            case 76:
                banVar = ban.REPORT_AD_EVENTS;
                break;
            case 77:
                banVar = ban.GENERATE_NOTIFICATION_VOICE_ASSET;
                break;
            case 78:
                banVar = ban.REPORT_SKAN_ACTIVITY;
                break;
            case 79:
                banVar = ban.GET_INSIGHT_CONFIGURATIONS;
                break;
            case 80:
                banVar = ban.ALTERNATIVE_ROUTES_REQUEST_V2;
                break;
            case 81:
                banVar = ban.REPORTING_AGENT_START_CHAT;
                break;
            case 82:
                banVar = ban.REPORTING_AGENT_CHAT;
                break;
            case 83:
                banVar = ban.GET_QUESTION_BY_TRIGGER;
                break;
            case 84:
                banVar = ban.CREATE_SHARE_DRIVE;
                break;
            case 85:
                banVar = ban.NAV_CONNECT_VALIDATE_ACTION_TOKEN;
                break;
            case 86:
                banVar = ban.NAV_CONNECT_REPORT_TRIP_DATA;
                break;
            case 87:
                banVar = ban.PREVIEW_SHARE_DRIVE;
                break;
            case 88:
                banVar = ban.LEAVE_SHARE_DRIVE;
                break;
            case 89:
                banVar = ban.JOIN_SHARE_DRIVE;
                break;
            case 90:
                banVar = ban.VIEW_SHARE_DRIVE;
                break;
            case 91:
                banVar = ban.UPDATE_LOCATION_IN_SHARE_DRIVE;
                break;
            case 92:
                banVar = ban.UPDATE_ROUTE_IN_SHARE_DRIVE;
                break;
            case 93:
                banVar = ban.CHANGE_ROLE_IN_SHARE_DRIVE;
                break;
            case 94:
                banVar = ban.GET_LIVE_MATCHES;
                break;
            case 95:
                banVar = ban.UPDATE_ETA_IN_SHARE_DRIVE;
                break;
            case 96:
                banVar = ban.REPORT_DRIVER_ARRIVED_IN_SHARE_DRIVE;
                break;
            case 97:
                banVar = ban.SEARCH_AGENT_START_CHAT;
                break;
            case 98:
                banVar = ban.SEARCH_AGENT_CHAT;
                break;
            case 99:
                banVar = ban.COMPANINIO_START_CHAT;
                break;
            case 100:
                banVar = ban.COMPANINIO_CHAT;
                break;
            default:
                banVar = null;
                break;
        }
        return banVar == null ? ban.UNRECOGNIZED : banVar;
    }

    public int getApiValue() {
        return this.api_;
    }

    public long getAppCheckTokenGenerationLatencyMs() {
        return this.appCheckTokenGenerationLatencyMs_;
    }

    public long getClientQueueLatencyMs() {
        return this.clientQueueLatencyMs_;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public String getFailureReason() {
        return this.failureReason_;
    }

    public com.google.v.v getFailureReasonBytes() {
        return com.google.v.v.s(this.failureReason_);
    }

    public bap getFailureReasonSource() {
        int i2 = this.failureReasonSource_;
        bap bapVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bap.SERVER : bap.CLIENT : bap.ERROR_SOURCE_UNSPECIFIED;
        return bapVar == null ? bap.UNRECOGNIZED : bapVar;
    }

    public int getFailureReasonSourceValue() {
        return this.failureReasonSource_;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public baq getQualityOfService() {
        int i2 = this.qualityOfService_;
        baq baqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : baq.DATA_SEND : baq.DATA_FETCH : baq.USER_VISIBLE : baq.USER_AWAITED : baq.QUALITY_OF_SERVICE_UNSPECIFIED;
        return baqVar == null ? baq.UNRECOGNIZED : baqVar;
    }

    public int getQualityOfServiceValue() {
        return this.qualityOfService_;
    }

    public bar getRequestQueue() {
        bar barVar;
        switch (this.requestQueue_) {
            case 0:
                barVar = bar.REQUEST_QUEUE_UNSPECIFIED;
                break;
            case 1:
                barVar = bar.GENERAL;
                break;
            case 2:
                barVar = bar.ROUTING;
                break;
            case 3:
                barVar = bar.BACKGROUND;
                break;
            case 4:
                barVar = bar.REGISTER_USER;
                break;
            case 5:
                barVar = bar.DRIVE_SUGGESTIONS;
                break;
            case 6:
                barVar = bar.GEO_CONFIG;
                break;
            case 7:
                barVar = bar.USERNAME;
                break;
            case 8:
                barVar = bar.ROUTING_UPDATE;
                break;
            default:
                barVar = null;
                break;
        }
        return barVar == null ? bar.UNRECOGNIZED : barVar;
    }

    public int getRequestQueueValue() {
        return this.requestQueue_;
    }

    public long getRequestSizeBytes() {
        return this.requestSizeBytes_;
    }

    public long getResponseSizeBytes() {
        return this.responseSizeBytes_;
    }

    public long getRetries() {
        return this.retries_;
    }

    public long getRoundtripLatencyMs() {
        return this.roundtripLatencyMs_;
    }

    public long getServerProcessingLatencyMs() {
        return this.serverProcessingLatencyMs_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean hasAppCheckTokenGenerationLatencyMs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasClientQueueLatencyMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRequestSizeBytes() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasResponseSizeBytes() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRetries() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRoundtripLatencyMs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasServerProcessingLatencyMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bao newBuilder(bas basVar) {
        return (bao) DEFAULT_INSTANCE.createBuilder(basVar);
    }

    public static bas parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bas) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bas parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bas parseFrom(com.google.v.z zVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bas parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bas parseFrom(InputStream inputStream) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bas parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bas parseFrom(ByteBuffer byteBuffer) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bas parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bas parseFrom(byte[] bArr) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bas parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bas) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

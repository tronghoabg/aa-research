package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bby extends com.google.v.du<bby, bbw> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int CHANGED_FROM_FIELD_NUMBER = 4;
    public static final int CHANGED_PARAM_FIELD_NUMBER = 6;
    public static final int CHANGED_TO_FIELD_NUMBER = 5;
    private static final bby DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bby> PARSER = null;
    public static final int SCREEN_NAME_FIELD_NUMBER = 1;
    private int action_;
    private int screenName_;
    private String button_ = "";
    private String changedFrom_ = "";
    private String changedTo_ = "";
    private String changedParam_ = "";

    static {
        bby bbyVar = new bby();
        DEFAULT_INSTANCE = bbyVar;
        com.google.v.du.registerDefaultInstance(bby.class, bbyVar);
    }

    private bby() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = getDefaultInstance().getButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = getDefaultInstance().getChangedFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedParam() {
        this.changedParam_ = getDefaultInstance().getChangedParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = getDefaultInstance().getChangedTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenName() {
        this.screenName_ = 0;
    }

    public static bby getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbw newBuilder() {
        return (bbw) DEFAULT_INSTANCE.createBuilder();
    }

    public static bby parseDelimitedFrom(InputStream inputStream) {
        return (bby) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bby parseFrom(com.google.v.v vVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bby> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(yl ylVar) {
        this.action_ = ylVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(String str) {
        Objects.requireNonNull(str);
        this.button_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.button_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(String str) {
        Objects.requireNonNull(str);
        this.changedFrom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedFrom_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedParam(String str) {
        Objects.requireNonNull(str);
        this.changedParam_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedParamBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedParam_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(String str) {
        Objects.requireNonNull(str);
        this.changedTo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedTo_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenName(bbx bbxVar) {
        this.screenName_ = bbxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenNameValue(int i2) {
        this.screenName_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"screenName_", "action_", "button_", "changedFrom_", "changedTo_", "changedParam_"});
        }
        if (iOrdinal == 3) {
            return new bby();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bby> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bby.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public yl getAction() {
        yl ylVarA = yl.a(this.action_);
        return ylVarA == null ? yl.UNRECOGNIZED : ylVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getButton() {
        return this.button_;
    }

    public com.google.v.v getButtonBytes() {
        return com.google.v.v.s(this.button_);
    }

    public String getChangedFrom() {
        return this.changedFrom_;
    }

    public com.google.v.v getChangedFromBytes() {
        return com.google.v.v.s(this.changedFrom_);
    }

    public String getChangedParam() {
        return this.changedParam_;
    }

    public com.google.v.v getChangedParamBytes() {
        return com.google.v.v.s(this.changedParam_);
    }

    public String getChangedTo() {
        return this.changedTo_;
    }

    public com.google.v.v getChangedToBytes() {
        return com.google.v.v.s(this.changedTo_);
    }

    public bbx getScreenName() {
        bbx bbxVar;
        switch (this.screenName_) {
            case 0:
                bbxVar = bbx.SCREEN_NAME_UNSPECIFIED;
                break;
            case 1:
                bbxVar = bbx.GENERAL_SETTINGS;
                break;
            case 2:
                bbxVar = bbx.VOICE_SETTINGS;
                break;
            case 3:
                bbxVar = bbx.WAZE_VOICE_SETTINGS;
                break;
            case 4:
                bbxVar = bbx.CAR_ICON_SETTINGS;
                break;
            case 5:
                bbxVar = bbx.VEHICLE_TYPE_SETTINGS;
                break;
            case 6:
                bbxVar = bbx.PRIVACY_SETTINGS;
                break;
            case 7:
                bbxVar = bbx.GAS_TYPE_SETTINGS;
                break;
            case 8:
                bbxVar = bbx.REPORTS_SETTINGS;
                break;
            case 9:
                bbxVar = bbx.NAVIGATION_SETTINGS;
                break;
            case 10:
                bbxVar = bbx.PLANNED_DRIVE_SETTINGS;
                break;
            case 11:
                bbxVar = bbx.TRIP_SUGGESTIONS_SETTINGS;
                break;
            case 12:
                bbxVar = bbx.ACCOUNT_AND_LOGIN_SETTINGS;
                break;
            case 13:
                bbxVar = bbx.SPEEDOMETER_SETTINGS;
                break;
            case 14:
                bbxVar = bbx.MAIN_SETTINGS;
                break;
            case 15:
                bbxVar = bbx.NAVIGATION_HISTORY_SETTINGS;
                break;
            case 16:
                bbxVar = bbx.EV_PROFILE_SETTINGS;
                break;
            case 17:
                bbxVar = bbx.EV_CONNECTORS_SETTINGS;
                break;
            case 18:
                bbxVar = bbx.GAS_STATIONS_SETTINGS;
                break;
            case 19:
                bbxVar = bbx.GOOGLE_ASSISTANT_SETTINGS;
                break;
            case 20:
                bbxVar = bbx.QUICK_GAS_SETTINGS;
                break;
            case 21:
                bbxVar = bbx.QUICK_NAVIGATION_SETTINGS;
                break;
            case 22:
                bbxVar = bbx.QUICK_SOUND_SETTINGS;
                break;
            case 23:
                bbxVar = bbx.EV_NETWORKS_SETTINGS;
                break;
            case 24:
                bbxVar = bbx.LICENSE_PLATE_SETTINGS;
                break;
            case 25:
                bbxVar = bbx.PREFERRED_STATION_SETTINGS;
                break;
            case 26:
                bbxVar = bbx.SIRI_SHORTCUTS_SETTINGS;
                break;
            case 27:
                bbxVar = bbx.VEHICLE_DETAILS_SETTINGS;
                break;
            case 28:
                bbxVar = bbx.CAMERAS_SETTINGS;
                break;
            case 29:
                bbxVar = bbx.PERSONALIZED_SETTINGS;
                break;
            case 30:
                bbxVar = bbx.PERSONALIZED_NAVIGATION_SETTINGS;
                break;
            case 31:
                bbxVar = bbx.MAP_DISPLAY_SETTINGS;
                break;
            case 32:
                bbxVar = bbx.TRAFFIC_LIGHTS_SETTINGS;
                break;
            case 33:
                bbxVar = bbx.PERMANENT_HAZARDS_SETTINGS;
                break;
            case 34:
                bbxVar = bbx.HOY_NO_CIRCULA_SETTINGS;
                break;
            default:
                bbxVar = null;
                break;
        }
        return bbxVar == null ? bbx.UNRECOGNIZED : bbxVar;
    }

    public int getScreenNameValue() {
        return this.screenName_;
    }

    public static bbw newBuilder(bby bbyVar) {
        return (bbw) DEFAULT_INSTANCE.createBuilder(bbyVar);
    }

    public static bby parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bby) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bby parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bby parseFrom(com.google.v.z zVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bby parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bby parseFrom(InputStream inputStream) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bby parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bby parseFrom(ByteBuffer byteBuffer) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bby parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bby parseFrom(byte[] bArr) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bby parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bby) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

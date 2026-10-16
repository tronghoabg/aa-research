package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aaa extends com.google.v.du<aaa, zy> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int ACTION_SUBTYPE_FIELD_NUMBER = 2;
    public static final int ANDROID_INVOCATION_CODE_FIELD_NUMBER = 7;
    private static final aaa DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 3;
    public static final int GA_REPORT_SUBTYPE_FIELD_NUMBER = 9;
    public static final int GA_REPORT_TYPE_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<aaa> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 5;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 6;
    public static final int SUCCESSFUL_FIELD_NUMBER = 4;
    private int actionSubtype_;
    private int action_;
    private int bitField0_;
    private int direction_;
    private int gaReportSubtype_;
    private int gaReportType_;
    private int sourceType_;
    private boolean successful_;
    private String source_ = "";
    private String androidInvocationCode_ = "";

    static {
        aaa aaaVar = new aaa();
        DEFAULT_INSTANCE = aaaVar;
        com.google.v.du.registerDefaultInstance(aaa.class, aaaVar);
    }

    private aaa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionSubtype() {
        this.actionSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidInvocationCode() {
        this.androidInvocationCode_ = getDefaultInstance().getAndroidInvocationCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.direction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaReportSubtype() {
        this.gaReportSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaReportType() {
        this.gaReportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = getDefaultInstance().getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceType() {
        this.sourceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccessful() {
        this.bitField0_ &= -2;
        this.successful_ = false;
    }

    public static aaa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static zy newBuilder() {
        return (zy) DEFAULT_INSTANCE.createBuilder();
    }

    public static aaa parseDelimitedFrom(InputStream inputStream) {
        return (aaa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aaa parseFrom(com.google.v.v vVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aaa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(zw zwVar) {
        this.action_ = zwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSubtype(zx zxVar) {
        this.actionSubtype_ = zxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSubtypeValue(int i2) {
        this.actionSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidInvocationCode(String str) {
        Objects.requireNonNull(str);
        this.androidInvocationCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidInvocationCodeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.androidInvocationCode_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirection(zz zzVar) {
        this.direction_ = zzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionValue(int i2) {
        this.direction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaReportSubtype(boa boaVar) {
        this.gaReportSubtype_ = boaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaReportSubtypeValue(int i2) {
        this.gaReportSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaReportType(bob bobVar) {
        this.gaReportType_ = bobVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaReportTypeValue(int i2) {
        this.gaReportType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        Objects.requireNonNull(str);
        this.source_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.source_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceType(aaj aajVar) {
        this.sourceType_ = aajVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceTypeValue(int i2) {
        this.sourceType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessful(boolean z) {
        this.bitField0_ |= 1;
        this.successful_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004ဇ\u0000\u0005Ȉ\u0006\f\u0007Ȉ\b\f\t\f", new Object[]{"bitField0_", "action_", "actionSubtype_", "direction_", "successful_", "source_", "sourceType_", "androidInvocationCode_", "gaReportType_", "gaReportSubtype_"});
        }
        if (iOrdinal == 3) {
            return new aaa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aaa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aaa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zw getAction() {
        zw zwVar;
        switch (this.action_) {
            case 0:
                zwVar = zw.ACTION_UNSPECIFIED;
                break;
            case 1:
                zwVar = zw.ALTERNATE_ROUTES;
                break;
            case 2:
                zwVar = zw.ETA_QUERY;
                break;
            case 3:
                zwVar = zw.NAVIGATE;
                break;
            case 4:
                zwVar = zw.RECENTER;
                break;
            case 5:
                zwVar = zw.REPORT_CRASH;
                break;
            case 6:
                zwVar = zw.REPORT_HAZARD;
                break;
            case 7:
                zwVar = zw.REPORT_POLICE;
                break;
            case 8:
                zwVar = zw.REPORT_TRAFFIC;
                break;
            case 9:
                zwVar = zw.ROUTE_OVERVIEW;
                break;
            case 10:
                zwVar = zw.ROUTE_PREFERENCE_HIGHWAYS;
                break;
            case 11:
                zwVar = zw.ROUTE_PREFERENCE_TOLLS;
                break;
            case 12:
                zwVar = zw.SEARCH;
                break;
            case 13:
                zwVar = zw.SET_HOME;
                break;
            case 14:
                zwVar = zw.SET_WORK;
                break;
            case 15:
                zwVar = zw.SHOW_DIRECTIONS;
                break;
            case 16:
                zwVar = zw.STOP_NAVIGATION;
                break;
            case 17:
                zwVar = zw.VOICE_DIRECTIONS;
                break;
            case 18:
                zwVar = zw.SEND_REPORT;
                break;
            default:
                zwVar = null;
                break;
        }
        return zwVar == null ? zw.UNRECOGNIZED : zwVar;
    }

    public zx getActionSubtype() {
        zx zxVar;
        switch (this.actionSubtype_) {
            case 0:
                zxVar = zx.ACTION_SUBTYPE_UNSPECIFIED;
                break;
            case 1:
                zxVar = zx.BROKEN_TRAFFIC_LIGHT;
                break;
            case 2:
                zxVar = zx.DEFAULT;
                break;
            case 3:
                zxVar = zx.HEAVY;
                break;
            case 4:
                zxVar = zx.HOME;
                break;
            case 5:
                zxVar = zx.LOCATION;
                break;
            case 6:
                zxVar = zx.MAJOR;
                break;
            case 7:
                zxVar = zx.MINOR;
                break;
            case 8:
                zxVar = zx.MODERATE;
                break;
            case 9:
                zxVar = zx.OFF;
                break;
            case 10:
                zxVar = zx.ON;
                break;
            case 11:
                zxVar = zx.ON_ROAD;
                break;
            case 12:
                zxVar = zx.ON_ROAD_CAR_STOPPED;
                break;
            case 13:
                zxVar = zx.ON_ROAD_CONSTRUCTION;
                break;
            case 14:
                zxVar = zx.ON_ROAD_ICE;
                break;
            case 15:
                zxVar = zx.ON_ROAD_OBJECT;
                break;
            case 16:
                zxVar = zx.ON_ROAD_POT_HOLE;
                break;
            case 17:
                zxVar = zx.ON_ROAD_ROAD_KILL;
                break;
            case 18:
                zxVar = zx.ON_SHOULDER;
                break;
            case 19:
                zxVar = zx.ON_SHOULDER_ANIMALS;
                break;
            case 20:
                zxVar = zx.ON_SHOULDER_CAR_STOPPED;
                break;
            case 21:
                zxVar = zx.STANDSTILL;
                break;
            case 22:
                zxVar = zx.WEATHER_FLOOD;
                break;
            case 23:
                zxVar = zx.WEATHER_FOG;
                break;
            case 24:
                zxVar = zx.WEATHER_HEAVY_RAIN;
                break;
            case 25:
                zxVar = zx.WORK;
                break;
            default:
                zxVar = null;
                break;
        }
        return zxVar == null ? zx.UNRECOGNIZED : zxVar;
    }

    public int getActionSubtypeValue() {
        return this.actionSubtype_;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getAndroidInvocationCode() {
        return this.androidInvocationCode_;
    }

    public com.google.v.v getAndroidInvocationCodeBytes() {
        return com.google.v.v.s(this.androidInvocationCode_);
    }

    public zz getDirection() {
        int i2 = this.direction_;
        zz zzVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : zz.OTHER_SIDE : zz.SAME_SIDE : zz.DIRECTION_UNSPECIFIED;
        return zzVar == null ? zz.UNRECOGNIZED : zzVar;
    }

    public int getDirectionValue() {
        return this.direction_;
    }

    public boa getGaReportSubtype() {
        boa boaVarA = boa.a(this.gaReportSubtype_);
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getGaReportSubtypeValue() {
        return this.gaReportSubtype_;
    }

    public bob getGaReportType() {
        bob bobVarA = bob.a(this.gaReportType_);
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getGaReportTypeValue() {
        return this.gaReportType_;
    }

    @Deprecated
    public String getSource() {
        return this.source_;
    }

    @Deprecated
    public com.google.v.v getSourceBytes() {
        return com.google.v.v.s(this.source_);
    }

    public aaj getSourceType() {
        aaj aajVarA = aaj.a(this.sourceType_);
        return aajVarA == null ? aaj.UNRECOGNIZED : aajVarA;
    }

    public int getSourceTypeValue() {
        return this.sourceType_;
    }

    public boolean getSuccessful() {
        return this.successful_;
    }

    public boolean hasSuccessful() {
        return (this.bitField0_ & 1) != 0;
    }

    public static zy newBuilder(aaa aaaVar) {
        return (zy) DEFAULT_INSTANCE.createBuilder(aaaVar);
    }

    public static aaa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aaa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aaa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aaa parseFrom(com.google.v.z zVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aaa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aaa parseFrom(InputStream inputStream) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aaa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aaa parseFrom(ByteBuffer byteBuffer) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aaa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aaa parseFrom(byte[] bArr) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aaa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aaa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

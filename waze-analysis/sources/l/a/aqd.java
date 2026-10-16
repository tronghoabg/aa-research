package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqd extends com.google.v.du<aqd, aqa> implements com.google.v.fj {
    private static final aqd DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_INSIGHT_METERS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<aqd> PARSER = null;
    public static final int PERMANENT_LOCATION_BASED_INSIGHT_SUBTYPE_FIELD_NUMBER = 2;
    public static final int PERMANENT_LOCATION_BASED_INSIGHT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long distanceToInsightMeters_;
    private int permanentLocationBasedInsightSubtype_;
    private int permanentLocationBasedInsightType_;

    static {
        aqd aqdVar = new aqd();
        DEFAULT_INSTANCE = aqdVar;
        com.google.v.du.registerDefaultInstance(aqd.class, aqdVar);
    }

    private aqd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToInsightMeters() {
        this.bitField0_ &= -2;
        this.distanceToInsightMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermanentLocationBasedInsightSubtype() {
        this.permanentLocationBasedInsightSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermanentLocationBasedInsightType() {
        this.permanentLocationBasedInsightType_ = 0;
    }

    public static aqd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqa newBuilder() {
        return (aqa) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqd parseDelimitedFrom(InputStream inputStream) {
        return (aqd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqd parseFrom(com.google.v.v vVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToInsightMeters(long j2) {
        this.bitField0_ |= 1;
        this.distanceToInsightMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentLocationBasedInsightSubtype(aqb aqbVar) {
        this.permanentLocationBasedInsightSubtype_ = aqbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentLocationBasedInsightSubtypeValue(int i2) {
        this.permanentLocationBasedInsightSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentLocationBasedInsightType(aqc aqcVar) {
        this.permanentLocationBasedInsightType_ = aqcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentLocationBasedInsightTypeValue(int i2) {
        this.permanentLocationBasedInsightType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဂ\u0000", new Object[]{"bitField0_", "permanentLocationBasedInsightType_", "permanentLocationBasedInsightSubtype_", "distanceToInsightMeters_"});
        }
        if (iOrdinal == 3) {
            return new aqd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDistanceToInsightMeters() {
        return this.distanceToInsightMeters_;
    }

    public aqb getPermanentLocationBasedInsightSubtype() {
        aqb aqbVar;
        switch (this.permanentLocationBasedInsightSubtype_) {
            case 0:
                aqbVar = aqb.SUBTYPE_UNSPECIFIED;
                break;
            case 1:
                aqbVar = aqb.CAMERA_SPEED;
                break;
            case 2:
                aqbVar = aqb.CAMERA_RED_LIGHT;
                break;
            case 3:
                aqbVar = aqb.CAMERA_DUMMY;
                break;
            case 4:
                aqbVar = aqb.CAMERA_RAILROAD;
                break;
            case 5:
                aqbVar = aqb.CAMERA_HOV_LANE;
                break;
            case 6:
                aqbVar = aqb.CAMERA_BUS_LANE;
                break;
            case 7:
                aqbVar = aqb.CAMERA_CARPOOL_LANE;
                break;
            case 8:
                aqbVar = aqb.CAMERA_RED_LIGHT_AND_SPEED;
                break;
            case 9:
                aqbVar = aqb.CAMERA_PHONE_ENFORCEMENT;
                break;
            case 10:
                aqbVar = aqb.CAMERA_SEATBELT_ENFORCEMENT;
                break;
            case 11:
                aqbVar = aqb.CAMERA_DISTANCE_BETWEEN_VEHICLES_ENFORCEMENT;
                break;
            case 12:
                aqbVar = aqb.CAMERA_STOP_SIGN_ENFORCEMENT;
                break;
            case 13:
                aqbVar = aqb.CAMERA_ROAD_SAFETY_ENFORCEMENT_NOISE_ENFORCEMENT;
                break;
            case 14:
                aqbVar = aqb.CAMERA_AVG_SPEED_CAMERA;
                break;
            case 15:
                aqbVar = aqb.CAMERA_SPEED_ENFORCEMENT_ZONE;
                break;
            case 16:
                aqbVar = aqb.CAMERA_LOW_EMISSION_ZONE;
                break;
            case 17:
                aqbVar = aqb.CAMERA_ULTRA_LOW_EMISSION_ZONE;
                break;
            case 18:
                aqbVar = aqb.CAMERA_CITY_HISTORICAL_CENTER;
                break;
            case 19:
                aqbVar = aqb.CAMERA_CLEAN_AIR_ZONE;
                break;
            case 20:
                aqbVar = aqb.CAMERA_NATIONAL_PARK;
                break;
            case 21:
                aqbVar = aqb.CAMERA_CONGESTION_CHARGE_ZONE;
                break;
            case 22:
                aqbVar = aqb.CAMERA_LIMITED_TRAFFIC_ZONE;
                break;
            case 23:
                aqbVar = aqb.PERMANENT_HAZARD_SPEED_BUMP;
                break;
            case 24:
                aqbVar = aqb.PERMANENT_HAZARD_TOPES;
                break;
            case 25:
                aqbVar = aqb.PERMANENT_HAZARD_TOLL_BOOTH;
                break;
            case 26:
                aqbVar = aqb.PERMANENT_HAZARD_DANGEROUS_CURVE;
                break;
            case 27:
                aqbVar = aqb.PERMANENT_HAZARD_FORK;
                break;
            case 28:
                aqbVar = aqb.PERMANENT_HAZARD_LANES_MERGING;
                break;
            case 29:
                aqbVar = aqb.PERMANENT_HAZARD_INTERSECTION;
                break;
            case 30:
                aqbVar = aqb.PERMANENT_HAZARD_SCHOOL_ZONE;
                break;
            case 31:
                aqbVar = aqb.GUARDIAN_LONG;
                break;
            case 32:
                aqbVar = aqb.GUARDIAN_SHORT;
                break;
            case 33:
                aqbVar = aqb.SPEED_LIMIT_DECREASE_DEFAULT;
                break;
            case 34:
                aqbVar = aqb.DANGER_ZONE_HIGH_RISK_AREA;
                break;
            case 35:
                aqbVar = aqb.DANGER_ZONE_CRIME_AREA;
                break;
            default:
                aqbVar = null;
                break;
        }
        return aqbVar == null ? aqb.UNRECOGNIZED : aqbVar;
    }

    public int getPermanentLocationBasedInsightSubtypeValue() {
        return this.permanentLocationBasedInsightSubtype_;
    }

    public aqc getPermanentLocationBasedInsightType() {
        int i2 = this.permanentLocationBasedInsightType_;
        aqc aqcVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : aqc.DANGER_ZONE : aqc.SPEED_LIMIT_DECREASE : aqc.GUARDIAN : aqc.PERMANENT_HAZARD : aqc.CAMERA : aqc.TYPE_UNSPECIFIED;
        return aqcVar == null ? aqc.UNRECOGNIZED : aqcVar;
    }

    public int getPermanentLocationBasedInsightTypeValue() {
        return this.permanentLocationBasedInsightType_;
    }

    public boolean hasDistanceToInsightMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aqa newBuilder(aqd aqdVar) {
        return (aqa) DEFAULT_INSTANCE.createBuilder(aqdVar);
    }

    public static aqd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqd parseFrom(com.google.v.z zVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqd parseFrom(InputStream inputStream) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqd parseFrom(ByteBuffer byteBuffer) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqd parseFrom(byte[] bArr) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

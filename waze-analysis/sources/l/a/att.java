package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class att extends com.google.v.du<att, atq> implements com.google.v.fj {
    private static final att DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_INSIGHT_METERS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<att> PARSER = null;
    public static final int REAL_TIME_LOCATION_BASED_INSIGHT_SUBTYPE_FIELD_NUMBER = 2;
    public static final int REAL_TIME_LOCATION_BASED_INSIGHT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long distanceToInsightMeters_;
    private int realTimeLocationBasedInsightSubtype_;
    private int realTimeLocationBasedInsightType_;

    static {
        att attVar = new att();
        DEFAULT_INSTANCE = attVar;
        com.google.v.du.registerDefaultInstance(att.class, attVar);
    }

    private att() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToInsightMeters() {
        this.bitField0_ &= -2;
        this.distanceToInsightMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealTimeLocationBasedInsightSubtype() {
        this.realTimeLocationBasedInsightSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealTimeLocationBasedInsightType() {
        this.realTimeLocationBasedInsightType_ = 0;
    }

    public static att getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atq newBuilder() {
        return (atq) DEFAULT_INSTANCE.createBuilder();
    }

    public static att parseDelimitedFrom(InputStream inputStream) {
        return (att) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static att parseFrom(com.google.v.v vVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<att> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToInsightMeters(long j2) {
        this.bitField0_ |= 1;
        this.distanceToInsightMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeLocationBasedInsightSubtype(atr atrVar) {
        this.realTimeLocationBasedInsightSubtype_ = atrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeLocationBasedInsightSubtypeValue(int i2) {
        this.realTimeLocationBasedInsightSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeLocationBasedInsightType(ats atsVar) {
        this.realTimeLocationBasedInsightType_ = atsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeLocationBasedInsightTypeValue(int i2) {
        this.realTimeLocationBasedInsightType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဂ\u0000", new Object[]{"bitField0_", "realTimeLocationBasedInsightType_", "realTimeLocationBasedInsightSubtype_", "distanceToInsightMeters_"});
        }
        if (iOrdinal == 3) {
            return new att();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<att> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (att.class) {
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

    public atr getRealTimeLocationBasedInsightSubtype() {
        atr atrVar;
        switch (this.realTimeLocationBasedInsightSubtype_) {
            case 0:
                atrVar = atr.SUBTYPE_UNSPECIFIED;
                break;
            case 1:
                atrVar = atr.BAD_WEATHER_DEFAULT;
                break;
            case 2:
                atrVar = atr.BAD_WEATHER_FLOOD;
                break;
            case 3:
                atrVar = atr.BAD_WEATHER_FOG;
                break;
            case 4:
                atrVar = atr.BAD_WEATHER_FREEZING_RAIN;
                break;
            case 5:
                atrVar = atr.BAD_WEATHER_HAIL;
                break;
            case 6:
                atrVar = atr.BAD_WEATHER_HEAT_WAVE;
                break;
            case 7:
                atrVar = atr.BAD_WEATHER_HEAVY_RAIN;
                break;
            case 8:
                atrVar = atr.BAD_WEATHER_HEAVY_SNOW;
                break;
            case 9:
                atrVar = atr.BAD_WEATHER_HURRICANE;
                break;
            case 10:
                atrVar = atr.BAD_WEATHER_ICY_ROAD;
                break;
            case 11:
                atrVar = atr.BAD_WEATHER_MONSOON;
                break;
            case 12:
                atrVar = atr.BAD_WEATHER_SLIPPERY_ROAD;
                break;
            case 13:
                atrVar = atr.BAD_WEATHER_TORNADO;
                break;
            case 14:
                atrVar = atr.BAD_WEATHER_UNPLOWED_ROAD;
                break;
            case 15:
                atrVar = atr.BLOCKED_LANE_DEFAULT;
                break;
            case 16:
                atrVar = atr.BLOCKED_LANE_CENTER;
                break;
            case 17:
                atrVar = atr.BLOCKED_LANE_LEFT;
                break;
            case 18:
                atrVar = atr.BLOCKED_LANE_RIGHT;
                break;
            case 19:
                atrVar = atr.ACCIDENT_DEFAULT;
                break;
            case 20:
                atrVar = atr.ACCIDENT_MAJOR;
                break;
            case 21:
                atrVar = atr.ACCIDENT_MINOR;
                break;
            case 22:
                atrVar = atr.ACCIDENT_PILE_UP;
                break;
            case 23:
                atrVar = atr.HAZARD_DEFAULT;
                break;
            case 24:
                atrVar = atr.HAZARD_ON_ROAD;
                break;
            case 25:
                atrVar = atr.HAZARD_ON_SHOULDER;
                break;
            case 26:
                atrVar = atr.HAZARD_OBJECT_ON_ROAD;
                break;
            case 27:
                atrVar = atr.HAZARD_POTHOLE;
                break;
            case 28:
                atrVar = atr.HAZARD_ROAD_KILL;
                break;
            case 29:
                atrVar = atr.HAZARD_ON_SHOULDER_CAR_STOPPED;
                break;
            case 30:
                atrVar = atr.HAZARD_ON_ROAD_CAR_STOPPED;
                break;
            case 31:
                atrVar = atr.HAZARD_ANIMALS;
                break;
            case 32:
                atrVar = atr.HAZARD_MISSING_SIGN;
                break;
            case 33:
                atrVar = atr.HAZARD_ON_ROAD_LANE_CLOSED;
                break;
            case 34:
                atrVar = atr.HAZARD_OIL;
                break;
            case 35:
                atrVar = atr.HAZARD_CONSTRUCTION;
                break;
            case 36:
                atrVar = atr.HAZARD_BROKEN_TRAFFIC_LIGHT;
                break;
            case 37:
                atrVar = atr.HAZARD_EMERGENCY_VEHICLE;
                break;
            case 38:
                atrVar = atr.POLICE_DEFAULT;
                break;
            case 39:
                atrVar = atr.POLICE_HIDDEN;
                break;
            case 40:
                atrVar = atr.POLICE_VISIBLE;
                break;
            case 41:
                atrVar = atr.TRAFFIC_DEFAULT;
                break;
            case 42:
                atrVar = atr.TRAFFIC_LIGHT;
                break;
            case 43:
                atrVar = atr.TRAFFIC_MODERATE;
                break;
            case 44:
                atrVar = atr.TRAFFIC_HEAVY;
                break;
            case 45:
                atrVar = atr.TRAFFIC_STANDSTILL;
                break;
            case 46:
                atrVar = atr.LANE_BLOCKED_DEFAULT;
                break;
            case 47:
                atrVar = atr.LANE_BLOCKED_LEFT;
                break;
            case 48:
                atrVar = atr.LANE_BLOCKED_CENTER;
                break;
            case 49:
                atrVar = atr.LANE_BLOCKED_RIGHT;
                break;
            case 50:
                atrVar = atr.TURN_CLOSURE_DEFAULT;
                break;
            case 51:
                atrVar = atr.ROAD_CLOSED_DEFAULT;
                break;
            case 52:
                atrVar = atr.ROAD_CLOSED_CONSTRUCTION;
                break;
            case 53:
            case 54:
            default:
                atrVar = null;
                break;
            case 55:
                atrVar = atr.ROAD_CLOSED_EVENT;
                break;
            case 56:
                atrVar = atr.ROAD_CLOSED_HAZARD;
                break;
            case 57:
                atrVar = atr.SYSTEM_ROAD_CLOSED_DEFAULT;
                break;
            case 58:
                atrVar = atr.SOS_BATTERY_ISSUE;
                break;
            case 59:
                atrVar = atr.SOS_FLAT_TIRE;
                break;
            case 60:
                atrVar = atr.SOS_MECHANICAL_PROBLEM;
                break;
            case 61:
                atrVar = atr.SOS_MEDICAL_HELP;
                break;
            case 62:
                atrVar = atr.SOS_NO_FUEL;
                break;
            case 63:
                atrVar = atr.SOS_OTHER;
                break;
            case 64:
                atrVar = atr.TRAFFIC_INFO_DEFAULT;
                break;
            case 65:
                atrVar = atr.PERSONAL_SAFETY_DEFAULT;
                break;
            case 66:
                atrVar = atr.MOBILE_POLICE_CAMERA;
                break;
        }
        return atrVar == null ? atr.UNRECOGNIZED : atrVar;
    }

    public int getRealTimeLocationBasedInsightSubtypeValue() {
        return this.realTimeLocationBasedInsightSubtype_;
    }

    public ats getRealTimeLocationBasedInsightType() {
        ats atsVar;
        switch (this.realTimeLocationBasedInsightType_) {
            case 0:
                atsVar = ats.TYPE_UNSPECIFIED;
                break;
            case 1:
                atsVar = ats.BAD_WEATHER;
                break;
            case 2:
                atsVar = ats.ACCIDENT;
                break;
            case 3:
                atsVar = ats.HAZARD;
                break;
            case 4:
                atsVar = ats.TRAFFIC;
                break;
            case 5:
                atsVar = ats.POLICE;
                break;
            case 6:
                atsVar = ats.LANE_BLOCKED;
                break;
            case 7:
                atsVar = ats.TURN_CLOSURE;
                break;
            case 8:
                atsVar = ats.ROAD_CLOSED;
                break;
            case 9:
                atsVar = ats.SYSTEM_ROAD_CLOSED;
                break;
            case 10:
                atsVar = ats.SOS;
                break;
            case 11:
                atsVar = ats.TRAFFIC_INFO;
                break;
            case 12:
                atsVar = ats.PERSONAL_SAFETY;
                break;
            default:
                atsVar = null;
                break;
        }
        return atsVar == null ? ats.UNRECOGNIZED : atsVar;
    }

    public int getRealTimeLocationBasedInsightTypeValue() {
        return this.realTimeLocationBasedInsightType_;
    }

    public boolean hasDistanceToInsightMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public static atq newBuilder(att attVar) {
        return (atq) DEFAULT_INSTANCE.createBuilder(attVar);
    }

    public static att parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (att) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static att parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static att parseFrom(com.google.v.z zVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static att parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static att parseFrom(InputStream inputStream) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static att parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static att parseFrom(ByteBuffer byteBuffer) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static att parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static att parseFrom(byte[] bArr) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static att parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (att) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

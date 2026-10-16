package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bov extends com.google.v.du<bov, bou> implements com.google.v.fj {
    public static final int ACCURACY_METERS_FIELD_NUMBER = 1;
    private static final bov DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bov> PARSER = null;
    public static final int ROAD_TYPE_FIELD_NUMBER = 2;
    public static final int SPEED_FIELD_NUMBER = 3;
    public static final int USER_COORDINATES_FIELD_NUMBER = 4;
    private long accuracyMeters_;
    private int bitField0_;
    private int roadType_;
    private long speed_;
    private afx userCoordinates_;

    static {
        bov bovVar = new bov();
        DEFAULT_INSTANCE = bovVar;
        com.google.v.du.registerDefaultInstance(bov.class, bovVar);
    }

    private bov() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyMeters() {
        this.bitField0_ &= -2;
        this.accuracyMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadType() {
        this.roadType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.bitField0_ &= -3;
        this.speed_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCoordinates() {
        this.userCoordinates_ = null;
        this.bitField0_ &= -5;
    }

    public static bov getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.userCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.userCoordinates_ = afxVar;
        this.bitField0_ |= 4;
    }

    public static bou newBuilder() {
        return (bou) DEFAULT_INSTANCE.createBuilder();
    }

    public static bov parseDelimitedFrom(InputStream inputStream) {
        return (bov) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bov parseFrom(com.google.v.v vVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bov> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyMeters(long j2) {
        this.bitField0_ |= 1;
        this.accuracyMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadType(avy avyVar) {
        this.roadType_ = avyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadTypeValue(int i2) {
        this.roadType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(long j2) {
        this.bitField0_ |= 2;
        this.speed_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.userCoordinates_ = afxVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002\f\u0003ဂ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "accuracyMeters_", "roadType_", "speed_", "userCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new bov();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bou(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bov> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bov.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAccuracyMeters() {
        return this.accuracyMeters_;
    }

    public avy getRoadType() {
        avy avyVar;
        switch (this.roadType_) {
            case 0:
                avyVar = avy.ROAD_TYPE_UNSPECIFIED;
                break;
            case 1:
                avyVar = avy.ROAD_TYPE_FREEWAY;
                break;
            case 2:
                avyVar = avy.ROAD_TYPE_PRIMARY;
                break;
            case 3:
                avyVar = avy.ROAD_TYPE_SECONDARY;
                break;
            case 4:
                avyVar = avy.ROAD_TYPE_RAMP;
                break;
            case 5:
                avyVar = avy.ROAD_TYPE_MAIN;
                break;
            case 6:
                avyVar = avy.ROAD_TYPE_EXIT;
                break;
            case 7:
                avyVar = avy.ROAD_TYPE_STREET;
                break;
            case 8:
                avyVar = avy.ROAD_TYPE_PEDESTRIAN;
                break;
            case 9:
                avyVar = avy.ROAD_TYPE_4X4;
                break;
            case 10:
                avyVar = avy.ROAD_TYPE_TRAIL;
                break;
            case 11:
                avyVar = avy.ROAD_TYPE_WALKWAY;
                break;
            case 12:
                avyVar = avy.ROAD_TYPE_RAILROAD;
                break;
            case 13:
                avyVar = avy.ROAD_TYPE_RUNWAY;
                break;
            case 14:
                avyVar = avy.ROAD_TYPE_FERRY;
                break;
            case 15:
                avyVar = avy.ROAD_TYPE_PRIVATE;
                break;
            case 16:
                avyVar = avy.ROAD_TYPE_PARKING;
                break;
            case 17:
                avyVar = avy.ROAD_TYPE_DIRT;
                break;
            case 18:
                avyVar = avy.ROAD_TYPE_MINOR;
                break;
            case 19:
                avyVar = avy.ROAD_TYPE_LAST;
                break;
            default:
                avyVar = null;
                break;
        }
        return avyVar == null ? avy.UNRECOGNIZED : avyVar;
    }

    public int getRoadTypeValue() {
        return this.roadType_;
    }

    public long getSpeed() {
        return this.speed_;
    }

    public afx getUserCoordinates() {
        afx afxVar = this.userCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasAccuracyMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSpeed() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserCoordinates() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bou newBuilder(bov bovVar) {
        return (bou) DEFAULT_INSTANCE.createBuilder(bovVar);
    }

    public static bov parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bov) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bov parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bov parseFrom(com.google.v.z zVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bov parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bov parseFrom(InputStream inputStream) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bov parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bov parseFrom(ByteBuffer byteBuffer) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bov parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bov parseFrom(byte[] bArr) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bov parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

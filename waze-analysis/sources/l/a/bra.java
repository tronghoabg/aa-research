package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bra extends com.google.v.du<bra, bqz> implements com.google.v.fj {
    private static final bra DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_CAR_METERS_FIELD_NUMBER = 2;
    public static final int FULL_FUNCTIONALITY_MODE_FIELD_NUMBER = 4;
    public static final int PARKING_START_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bra> PARSER = null;
    public static final int TIME_TO_CAR_SECONDS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long distanceToCarMeters_;
    private boolean fullFunctionalityMode_;
    private long parkingStartTimestampMs_;
    private long timeToCarSeconds_;

    static {
        bra braVar = new bra();
        DEFAULT_INSTANCE = braVar;
        com.google.v.du.registerDefaultInstance(bra.class, braVar);
    }

    private bra() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToCarMeters() {
        this.bitField0_ &= -3;
        this.distanceToCarMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullFunctionalityMode() {
        this.bitField0_ &= -9;
        this.fullFunctionalityMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingStartTimestampMs() {
        this.bitField0_ &= -2;
        this.parkingStartTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToCarSeconds() {
        this.bitField0_ &= -5;
        this.timeToCarSeconds_ = 0L;
    }

    public static bra getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqz newBuilder() {
        return (bqz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bra parseDelimitedFrom(InputStream inputStream) {
        return (bra) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bra parseFrom(com.google.v.v vVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bra> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToCarMeters(long j2) {
        this.bitField0_ |= 2;
        this.distanceToCarMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullFunctionalityMode(boolean z) {
        this.bitField0_ |= 8;
        this.fullFunctionalityMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingStartTimestampMs(long j2) {
        this.bitField0_ |= 1;
        this.parkingStartTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToCarSeconds(long j2) {
        this.bitField0_ |= 4;
        this.timeToCarSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003တ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "parkingStartTimestampMs_", "distanceToCarMeters_", "timeToCarSeconds_", "fullFunctionalityMode_"});
        }
        if (iOrdinal == 3) {
            return new bra();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bra> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bra.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDistanceToCarMeters() {
        return this.distanceToCarMeters_;
    }

    public boolean getFullFunctionalityMode() {
        return this.fullFunctionalityMode_;
    }

    public long getParkingStartTimestampMs() {
        return this.parkingStartTimestampMs_;
    }

    public long getTimeToCarSeconds() {
        return this.timeToCarSeconds_;
    }

    public boolean hasDistanceToCarMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFullFunctionalityMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasParkingStartTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeToCarSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bqz newBuilder(bra braVar) {
        return (bqz) DEFAULT_INSTANCE.createBuilder(braVar);
    }

    public static bra parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bra) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bra parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bra parseFrom(com.google.v.z zVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bra parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bra parseFrom(InputStream inputStream) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bra parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bra parseFrom(ByteBuffer byteBuffer) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bra parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bra parseFrom(byte[] bArr) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bra parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bra) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

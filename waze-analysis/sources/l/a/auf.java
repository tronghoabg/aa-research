package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class auf extends com.google.v.du<auf, aud> implements com.google.v.fj {
    private static final auf DEFAULT_INSTANCE;
    public static final int GPS_TIME_SECONDS_FIELD_NUMBER = 1;
    public static final int LIFETIME_SECONDS_FIELD_NUMBER = 3;
    public static final int PARKING_COORDINATES_FIELD_NUMBER = 2;
    public static final int PARKING_ID_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<auf> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 5;
    private int bitField0_;
    private long gpsTimeSeconds_;
    private long lifetimeSeconds_;
    private afx parkingCoordinates_;
    private String parkingId_ = "";
    private int reason_;

    static {
        auf aufVar = new auf();
        DEFAULT_INSTANCE = aufVar;
        com.google.v.du.registerDefaultInstance(auf.class, aufVar);
    }

    private auf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsTimeSeconds() {
        this.bitField0_ &= -2;
        this.gpsTimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLifetimeSeconds() {
        this.bitField0_ &= -5;
        this.lifetimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingCoordinates() {
        this.parkingCoordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingId() {
        this.parkingId_ = getDefaultInstance().getParkingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static auf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.parkingCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.parkingCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static aud newBuilder() {
        return (aud) DEFAULT_INSTANCE.createBuilder();
    }

    public static auf parseDelimitedFrom(InputStream inputStream) {
        return (auf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auf parseFrom(com.google.v.v vVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<auf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsTimeSeconds(long j2) {
        this.bitField0_ |= 1;
        this.gpsTimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLifetimeSeconds(long j2) {
        this.bitField0_ |= 4;
        this.lifetimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.parkingCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingId(String str) {
        Objects.requireNonNull(str);
        this.parkingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.parkingId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(aue aueVar) {
        this.reason_ = aueVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001တ\u0000\u0002ဉ\u0001\u0003တ\u0002\u0004Ȉ\u0005\f", new Object[]{"bitField0_", "gpsTimeSeconds_", "parkingCoordinates_", "lifetimeSeconds_", "parkingId_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new auf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aud(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<auf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (auf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getGpsTimeSeconds() {
        return this.gpsTimeSeconds_;
    }

    public long getLifetimeSeconds() {
        return this.lifetimeSeconds_;
    }

    public afx getParkingCoordinates() {
        afx afxVar = this.parkingCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public String getParkingId() {
        return this.parkingId_;
    }

    public com.google.v.v getParkingIdBytes() {
        return com.google.v.v.s(this.parkingId_);
    }

    public aue getReason() {
        int i2 = this.reason_;
        aue aueVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : aue.SPEED : aue.OBSOLETE : aue.NEW : aue.WRONG : aue.EDIT : aue.REASON_UNSPECIFIED;
        return aueVar == null ? aue.UNRECOGNIZED : aueVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasGpsTimeSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLifetimeSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasParkingCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aud newBuilder(auf aufVar) {
        return (aud) DEFAULT_INSTANCE.createBuilder(aufVar);
    }

    public static auf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static auf parseFrom(com.google.v.z zVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static auf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static auf parseFrom(InputStream inputStream) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auf parseFrom(ByteBuffer byteBuffer) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static auf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static auf parseFrom(byte[] bArr) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static auf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (auf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

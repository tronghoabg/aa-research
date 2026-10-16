package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpu extends com.google.v.du<bpu, bpt> implements com.google.v.fj {
    public static final int ACTUAL_DURATION_MS_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int ANNOUNCEMENT_ID_FIELD_NUMBER = 2;
    private static final bpu DEFAULT_INSTANCE;
    public static final int DISTANCE_FROM_MANEUVER_METERS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bpu> PARSER;
    private long actualDurationMs_;
    private String alternativeRouteUuid_ = "";
    private long announcementId_;
    private int bitField0_;
    private long distanceFromManeuverMeters_;

    static {
        bpu bpuVar = new bpu();
        DEFAULT_INSTANCE = bpuVar;
        com.google.v.du.registerDefaultInstance(bpu.class, bpuVar);
    }

    private bpu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActualDurationMs() {
        this.bitField0_ &= -3;
        this.actualDurationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementId() {
        this.bitField0_ &= -2;
        this.announcementId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceFromManeuverMeters() {
        this.bitField0_ &= -5;
        this.distanceFromManeuverMeters_ = 0L;
    }

    public static bpu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bpt newBuilder() {
        return (bpt) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpu parseDelimitedFrom(InputStream inputStream) {
        return (bpu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpu parseFrom(com.google.v.v vVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActualDurationMs(long j2) {
        this.bitField0_ |= 2;
        this.actualDurationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementId(long j2) {
        this.bitField0_ |= 1;
        this.announcementId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceFromManeuverMeters(long j2) {
        this.bitField0_ |= 4;
        this.distanceFromManeuverMeters_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"bitField0_", "alternativeRouteUuid_", "announcementId_", "actualDurationMs_", "distanceFromManeuverMeters_"});
        }
        if (iOrdinal == 3) {
            return new bpu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getActualDurationMs() {
        return this.actualDurationMs_;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public long getAnnouncementId() {
        return this.announcementId_;
    }

    public long getDistanceFromManeuverMeters() {
        return this.distanceFromManeuverMeters_;
    }

    public boolean hasActualDurationMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAnnouncementId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceFromManeuverMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bpt newBuilder(bpu bpuVar) {
        return (bpt) DEFAULT_INSTANCE.createBuilder(bpuVar);
    }

    public static bpu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpu parseFrom(com.google.v.z zVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpu parseFrom(InputStream inputStream) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpu parseFrom(ByteBuffer byteBuffer) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpu parseFrom(byte[] bArr) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

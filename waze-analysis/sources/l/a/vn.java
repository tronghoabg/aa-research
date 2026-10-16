package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vn extends com.google.v.du<vn, vm> implements com.google.v.fj {
    private static final vn DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<vn> PARSER = null;
    public static final int ROUTE_LENGTH_METERS_FIELD_NUMBER = 4;
    public static final int ROUTE_TIME_MINUTES_FIELD_NUMBER = 5;
    public static final int ROUTE_TOLL_FIELD_NUMBER = 1;
    public static final int VENUE_ID_FIELD_NUMBER = 6;
    public static final int WITH_STOP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long latencyMs_;
    private long routeLengthMeters_;
    private long routeTimeMinutes_;
    private boolean routeToll_;
    private String venueId_ = "";
    private boolean withStop_;

    static {
        vn vnVar = new vn();
        DEFAULT_INSTANCE = vnVar;
        com.google.v.du.registerDefaultInstance(vn.class, vnVar);
    }

    private vn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -5;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteLengthMeters() {
        this.bitField0_ &= -9;
        this.routeLengthMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTimeMinutes() {
        this.bitField0_ &= -17;
        this.routeTimeMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteToll() {
        this.bitField0_ &= -2;
        this.routeToll_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWithStop() {
        this.bitField0_ &= -3;
        this.withStop_ = false;
    }

    public static vn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static vm newBuilder() {
        return (vm) DEFAULT_INSTANCE.createBuilder();
    }

    public static vn parseDelimitedFrom(InputStream inputStream) {
        return (vn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vn parseFrom(com.google.v.v vVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 4;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteLengthMeters(long j2) {
        this.bitField0_ |= 8;
        this.routeLengthMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTimeMinutes(long j2) {
        this.bitField0_ |= 16;
        this.routeTimeMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteToll(boolean z) {
        this.bitField0_ |= 1;
        this.routeToll_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWithStop(boolean z) {
        this.bitField0_ |= 2;
        this.withStop_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006Ȉ", new Object[]{"bitField0_", "routeToll_", "withStop_", "latencyMs_", "routeLengthMeters_", "routeTimeMinutes_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new vn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public long getRouteLengthMeters() {
        return this.routeLengthMeters_;
    }

    public long getRouteTimeMinutes() {
        return this.routeTimeMinutes_;
    }

    public boolean getRouteToll() {
        return this.routeToll_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean getWithStop() {
        return this.withStop_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRouteLengthMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRouteTimeMinutes() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRouteToll() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWithStop() {
        return (this.bitField0_ & 2) != 0;
    }

    public static vm newBuilder(vn vnVar) {
        return (vm) DEFAULT_INSTANCE.createBuilder(vnVar);
    }

    public static vn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vn parseFrom(com.google.v.z zVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static vn parseFrom(InputStream inputStream) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vn parseFrom(ByteBuffer byteBuffer) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vn parseFrom(byte[] bArr) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

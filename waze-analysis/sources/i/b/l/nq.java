package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nq extends com.google.v.du<nq, np> implements com.google.v.fj {
    public static final int ALTID_FIELD_NUMBER = 2;
    public static final int AUTOSELECTROUTE_FIELD_NUMBER = 3;
    private static final nq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nq> PARSER = null;
    public static final int ROUTEID_FIELD_NUMBER = 1;
    public static final int WAYPOINT_FIELD_NUMBER = 4;
    private long altId_;
    private boolean autoSelectRoute_;
    private int bitField0_;
    private long routeId_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<oi> waypoint_ = emptyProtobufList();

    static {
        nq nqVar = new nq();
        DEFAULT_INSTANCE = nqVar;
        com.google.v.du.registerDefaultInstance(nq.class, nqVar);
    }

    private nq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWaypoint(Iterable<? extends oi> iterable) {
        ensureWaypointIsMutable();
        com.google.v.c.addAll(iterable, this.waypoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoint(int i2, oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureWaypointIsMutable();
        this.waypoint_.add(i2, oiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltId() {
        this.bitField0_ &= -3;
        this.altId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSelectRoute() {
        this.bitField0_ &= -5;
        this.autoSelectRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteId() {
        this.bitField0_ &= -2;
        this.routeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = emptyProtobufList();
    }

    private void ensureWaypointIsMutable() {
        com.google.v.eo<oi> eoVar = this.waypoint_;
        if (eoVar.c()) {
            return;
        }
        this.waypoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static nq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static np newBuilder() {
        return (np) DEFAULT_INSTANCE.createBuilder();
    }

    public static nq parseDelimitedFrom(InputStream inputStream) {
        return (nq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nq parseFrom(com.google.v.v vVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWaypoint(int i2) {
        ensureWaypointIsMutable();
        this.waypoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltId(long j2) {
        this.bitField0_ |= 2;
        this.altId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSelectRoute(boolean z) {
        this.bitField0_ |= 4;
        this.autoSelectRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteId(long j2) {
        this.bitField0_ |= 1;
        this.routeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(int i2, oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureWaypointIsMutable();
        this.waypoint_.set(i2, oiVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004Л", new Object[]{"bitField0_", "routeId_", "altId_", "autoSelectRoute_", "waypoint_", oi.class});
            case 3:
                return new nq();
            case 4:
                return new np(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<nq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (nq.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public long getAltId() {
        return this.altId_;
    }

    public boolean getAutoSelectRoute() {
        return this.autoSelectRoute_;
    }

    public long getRouteId() {
        return this.routeId_;
    }

    public oi getWaypoint(int i2) {
        return this.waypoint_.get(i2);
    }

    public int getWaypointCount() {
        return this.waypoint_.size();
    }

    public List<oi> getWaypointList() {
        return this.waypoint_;
    }

    public oj getWaypointOrBuilder(int i2) {
        return this.waypoint_.get(i2);
    }

    public List<? extends oj> getWaypointOrBuilderList() {
        return this.waypoint_;
    }

    public boolean hasAltId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAutoSelectRoute() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRouteId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static np newBuilder(nq nqVar) {
        return (np) DEFAULT_INSTANCE.createBuilder(nqVar);
    }

    public static nq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nq parseFrom(com.google.v.z zVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoint(oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureWaypointIsMutable();
        this.waypoint_.add(oiVar);
    }

    public static nq parseFrom(InputStream inputStream) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nq parseFrom(ByteBuffer byteBuffer) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nq parseFrom(byte[] bArr) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

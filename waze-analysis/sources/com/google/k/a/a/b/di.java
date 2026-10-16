package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class di extends com.google.v.du<di, dh> implements dj {
    public static final int BOUNDING_MARKER_FIELD_NUMBER = 4;
    public static final int CONNECTION_TOKEN_FIELD_NUMBER = 5;
    public static final int CURVE_FIELD_NUMBER = 6;
    private static final di DEFAULT_INSTANCE;
    public static final int FLOW_FIELD_NUMBER = 3;
    public static final int LANE_CONNECTION_ID_FIELD_NUMBER = 10;
    public static final int LANE_ID_FIELD_NUMBER = 9;
    public static final int LANE_NUMBER_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<di> PARSER = null;
    public static final int PRIMARY_CONNECTION_FIELD_NUMBER = 7;
    public static final int SEGMENT_FIELD_NUMBER = 1;
    public static final int YIELD_TO_OTHER_CONNECTIONS_FIELD_NUMBER = 8;
    private int bitField0_;
    private com.google.k.a.a.cf curve_;
    private de flow_;
    private long laneConnectionId_;
    private long laneId_;
    private int laneNumber_;
    private boolean primaryConnection_;
    private bw segment_;
    private boolean yieldToOtherConnections_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<db> boundingMarker_ = emptyProtobufList();
    private String connectionToken_ = "";

    static {
        di diVar = new di();
        DEFAULT_INSTANCE = diVar;
        com.google.v.du.registerDefaultInstance(di.class, diVar);
    }

    private di() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBoundingMarker(Iterable<? extends db> iterable) {
        ensureBoundingMarkerIsMutable();
        com.google.v.c.addAll(iterable, this.boundingMarker_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBoundingMarker(int i2, db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.add(i2, dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarker() {
        this.boundingMarker_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionToken() {
        this.bitField0_ &= -65;
        this.connectionToken_ = getDefaultInstance().getConnectionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurve() {
        this.curve_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlow() {
        this.flow_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneConnectionId() {
        this.bitField0_ &= -3;
        this.laneConnectionId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneId() {
        this.bitField0_ &= -9;
        this.laneId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneNumber() {
        this.bitField0_ &= -5;
        this.laneNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryConnection() {
        this.bitField0_ &= -129;
        this.primaryConnection_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYieldToOtherConnections() {
        this.bitField0_ &= -257;
        this.yieldToOtherConnections_ = false;
    }

    private void ensureBoundingMarkerIsMutable() {
        com.google.v.eo<db> eoVar = this.boundingMarker_;
        if (eoVar.c()) {
            return;
        }
        this.boundingMarker_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static di getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurve(com.google.k.a.a.cf cfVar) {
        Objects.requireNonNull(cfVar);
        com.google.k.a.a.cf cfVar2 = this.curve_;
        if (cfVar2 != null && cfVar2 != com.google.k.a.a.cf.getDefaultInstance()) {
            com.google.k.a.a.ca caVarNewBuilder = com.google.k.a.a.cf.newBuilder(cfVar2);
            caVarNewBuilder.mergeFrom((com.google.k.a.a.ca) cfVar);
            cfVar = caVarNewBuilder.buildPartial();
        }
        this.curve_ = cfVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFlow(de deVar) {
        Objects.requireNonNull(deVar);
        de deVar2 = this.flow_;
        if (deVar2 != null && deVar2 != de.getDefaultInstance()) {
            dd ddVarNewBuilder = de.newBuilder(deVar2);
            ddVarNewBuilder.mergeFrom((dd) deVar);
            deVar = ddVarNewBuilder.buildPartial();
        }
        this.flow_ = deVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegment(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.segment_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.segment_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static dh newBuilder() {
        return (dh) DEFAULT_INSTANCE.createBuilder();
    }

    public static di parseDelimitedFrom(InputStream inputStream) {
        return (di) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static di parseFrom(com.google.v.v vVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<di> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBoundingMarker(int i2) {
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarker(int i2, db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.set(i2, dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.connectionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTokenBytes(com.google.v.v vVar) {
        this.connectionToken_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurve(com.google.k.a.a.cf cfVar) {
        Objects.requireNonNull(cfVar);
        this.curve_ = cfVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlow(de deVar) {
        Objects.requireNonNull(deVar);
        this.flow_ = deVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneConnectionId(long j2) {
        this.bitField0_ |= 2;
        this.laneConnectionId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneId(long j2) {
        this.bitField0_ |= 8;
        this.laneId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneNumber(int i2) {
        this.bitField0_ |= 4;
        this.laneNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryConnection(boolean z) {
        this.bitField0_ |= 128;
        this.primaryConnection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.segment_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYieldToOtherConnections(boolean z) {
        this.bitField0_ |= 256;
        this.yieldToOtherConnections_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0002\u0001ᐉ\u0000\u0002င\u0002\u0003ဉ\u0004\u0004Л\u0005ဈ\u0006\u0006ဉ\u0005\u0007ဇ\u0007\bဇ\b\tဃ\u0003\nဃ\u0001", new Object[]{"bitField0_", "segment_", "laneNumber_", "flow_", "boundingMarker_", db.class, "connectionToken_", "curve_", "primaryConnection_", "yieldToOtherConnections_", "laneId_", "laneConnectionId_"});
            case 3:
                return new di();
            case 4:
                return new dh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<di> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (di.class) {
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

    public db getBoundingMarker(int i2) {
        return this.boundingMarker_.get(i2);
    }

    public int getBoundingMarkerCount() {
        return this.boundingMarker_.size();
    }

    public List<db> getBoundingMarkerList() {
        return this.boundingMarker_;
    }

    public dc getBoundingMarkerOrBuilder(int i2) {
        return this.boundingMarker_.get(i2);
    }

    public List<? extends dc> getBoundingMarkerOrBuilderList() {
        return this.boundingMarker_;
    }

    public String getConnectionToken() {
        return this.connectionToken_;
    }

    public com.google.v.v getConnectionTokenBytes() {
        return com.google.v.v.s(this.connectionToken_);
    }

    public com.google.k.a.a.cf getCurve() {
        com.google.k.a.a.cf cfVar = this.curve_;
        return cfVar == null ? com.google.k.a.a.cf.getDefaultInstance() : cfVar;
    }

    public de getFlow() {
        de deVar = this.flow_;
        return deVar == null ? de.getDefaultInstance() : deVar;
    }

    public long getLaneConnectionId() {
        return this.laneConnectionId_;
    }

    public long getLaneId() {
        return this.laneId_;
    }

    public int getLaneNumber() {
        return this.laneNumber_;
    }

    public boolean getPrimaryConnection() {
        return this.primaryConnection_;
    }

    public bw getSegment() {
        bw bwVar = this.segment_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public boolean getYieldToOtherConnections() {
        return this.yieldToOtherConnections_;
    }

    public boolean hasConnectionToken() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCurve() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFlow() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasLaneConnectionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLaneId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLaneNumber() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPrimaryConnection() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSegment() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasYieldToOtherConnections() {
        return (this.bitField0_ & 256) != 0;
    }

    public static dh newBuilder(di diVar) {
        return (dh) DEFAULT_INSTANCE.createBuilder(diVar);
    }

    public static di parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (di) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static di parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static di parseFrom(com.google.v.z zVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static di parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBoundingMarker(db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.add(dbVar);
    }

    public static di parseFrom(InputStream inputStream) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static di parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static di parseFrom(ByteBuffer byteBuffer) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static di parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static di parseFrom(byte[] bArr) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static di parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (di) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

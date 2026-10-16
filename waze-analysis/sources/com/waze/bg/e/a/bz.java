package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz extends com.google.v.du<bz, by> implements com.google.v.fj {
    public static final int CLIENT_SEGMENT_INDEX_FIELD_NUMBER = 5;
    public static final int CURRENT_POSITION_FIELD_NUMBER = 3;
    public static final int CURRENT_ROUTE_REVISION_FIELD_NUMBER = 2;
    private static final bz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bz> PARSER = null;
    public static final int ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int WAYPOINT_FIELD_NUMBER = 4;
    private int bitField0_;
    private int clientSegmentIndex_;
    private ei currentPosition_;
    private long currentRouteRevision_;
    private String routeUuid_ = "";
    private hh waypoint_;

    static {
        bz bzVar = new bz();
        DEFAULT_INSTANCE = bzVar;
        com.google.v.du.registerDefaultInstance(bz.class, bzVar);
    }

    private bz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientSegmentIndex() {
        this.bitField0_ &= -17;
        this.clientSegmentIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentPosition() {
        this.currentPosition_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteRevision() {
        this.bitField0_ &= -3;
        this.currentRouteRevision_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUuid() {
        this.bitField0_ &= -2;
        this.routeUuid_ = getDefaultInstance().getRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = null;
        this.bitField0_ &= -9;
    }

    public static bz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentPosition(ei eiVar) {
        Objects.requireNonNull(eiVar);
        ei eiVar2 = this.currentPosition_;
        if (eiVar2 != null && eiVar2 != ei.getDefaultInstance()) {
            eh ehVarNewBuilder = ei.newBuilder(eiVar2);
            ehVarNewBuilder.mergeFrom((eh) eiVar);
            eiVar = ehVarNewBuilder.buildPartial();
        }
        this.currentPosition_ = eiVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypoint(hh hhVar) {
        Objects.requireNonNull(hhVar);
        hh hhVar2 = this.waypoint_;
        if (hhVar2 != null && hhVar2 != hh.getDefaultInstance()) {
            hg hgVarNewBuilder = hh.newBuilder(hhVar2);
            hgVarNewBuilder.mergeFrom((hg) hhVar);
            hhVar = hgVarNewBuilder.buildPartial();
        }
        this.waypoint_ = hhVar;
        this.bitField0_ |= 8;
    }

    public static by newBuilder() {
        return (by) DEFAULT_INSTANCE.createBuilder();
    }

    public static bz parseDelimitedFrom(InputStream inputStream) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(com.google.v.v vVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSegmentIndex(int i2) {
        this.bitField0_ |= 16;
        this.clientSegmentIndex_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPosition(ei eiVar) {
        Objects.requireNonNull(eiVar);
        this.currentPosition_ = eiVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteRevision(long j2) {
        this.bitField0_ |= 2;
        this.currentRouteRevision_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.routeUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuidBytes(com.google.v.v vVar) {
        this.routeUuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(hh hhVar) {
        Objects.requireNonNull(hhVar);
        this.waypoint_ = hhVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"bitField0_", "routeUuid_", "currentRouteRevision_", "currentPosition_", "waypoint_", "clientSegmentIndex_"});
        }
        if (iOrdinal == 3) {
            return new bz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new by(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getClientSegmentIndex() {
        return this.clientSegmentIndex_;
    }

    public ei getCurrentPosition() {
        ei eiVar = this.currentPosition_;
        return eiVar == null ? ei.getDefaultInstance() : eiVar;
    }

    public long getCurrentRouteRevision() {
        return this.currentRouteRevision_;
    }

    public String getRouteUuid() {
        return this.routeUuid_;
    }

    public com.google.v.v getRouteUuidBytes() {
        return com.google.v.v.s(this.routeUuid_);
    }

    public hh getWaypoint() {
        hh hhVar = this.waypoint_;
        return hhVar == null ? hh.getDefaultInstance() : hhVar;
    }

    public boolean hasClientSegmentIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCurrentPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCurrentRouteRevision() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 8) != 0;
    }

    public static by newBuilder(bz bzVar) {
        return (by) DEFAULT_INSTANCE.createBuilder(bzVar);
    }

    public static bz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bz parseFrom(com.google.v.z zVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bz parseFrom(InputStream inputStream) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(ByteBuffer byteBuffer) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bz parseFrom(byte[] bArr) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

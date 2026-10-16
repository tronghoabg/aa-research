package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class in extends com.google.v.du<in, im> implements com.google.v.fj {
    private static final in DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_WAYPOINT_IN_METERS_FIELD_NUMBER = 3;
    public static final int DISTANCE_TO_WAYPOINT_IN_SECONDS_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<in> PARSER = null;
    public static final int WAYPOINT_INDEX_IN_POINTS_FIELD_NUMBER = 4;
    private int bitField0_;
    private int distanceToWaypointInMeters_;
    private int distanceToWaypointInSeconds_;
    private int id_;
    private int waypointIndexInPoints_;

    static {
        in inVar = new in();
        DEFAULT_INSTANCE = inVar;
        com.google.v.du.registerDefaultInstance(in.class, inVar);
    }

    private in() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToWaypointInMeters() {
        this.bitField0_ &= -5;
        this.distanceToWaypointInMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToWaypointInSeconds() {
        this.bitField0_ &= -3;
        this.distanceToWaypointInSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypointIndexInPoints() {
        this.bitField0_ &= -9;
        this.waypointIndexInPoints_ = 0;
    }

    public static in getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static im newBuilder() {
        return (im) DEFAULT_INSTANCE.createBuilder();
    }

    public static in parseDelimitedFrom(InputStream inputStream) {
        return (in) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static in parseFrom(com.google.v.v vVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<in> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToWaypointInMeters(int i2) {
        this.bitField0_ |= 4;
        this.distanceToWaypointInMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToWaypointInSeconds(int i2) {
        this.bitField0_ |= 2;
        this.distanceToWaypointInSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypointIndexInPoints(int i2) {
        this.bitField0_ |= 8;
        this.waypointIndexInPoints_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "id_", "distanceToWaypointInSeconds_", "distanceToWaypointInMeters_", "waypointIndexInPoints_"});
        }
        if (iOrdinal == 3) {
            return new in();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new im(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<in> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (in.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDistanceToWaypointInMeters() {
        return this.distanceToWaypointInMeters_;
    }

    public int getDistanceToWaypointInSeconds() {
        return this.distanceToWaypointInSeconds_;
    }

    public int getId() {
        return this.id_;
    }

    public int getWaypointIndexInPoints() {
        return this.waypointIndexInPoints_;
    }

    public boolean hasDistanceToWaypointInMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDistanceToWaypointInSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaypointIndexInPoints() {
        return (this.bitField0_ & 8) != 0;
    }

    public static im newBuilder(in inVar) {
        return (im) DEFAULT_INSTANCE.createBuilder(inVar);
    }

    public static in parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (in) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static in parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static in parseFrom(com.google.v.z zVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static in parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static in parseFrom(InputStream inputStream) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static in parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static in parseFrom(ByteBuffer byteBuffer) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static in parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static in parseFrom(byte[] bArr) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static in parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (in) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

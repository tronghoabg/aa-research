package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dc extends com.google.v.du<dc, db> implements com.google.v.fj {
    private static final dc DEFAULT_INSTANCE;
    public static final int DIFF_IN_METERS_FIELD_NUMBER = 1;
    public static final int DIFF_IN_SECONDS_FIELD_NUMBER = 2;
    public static final int DISTANCE_TO_WAYPOINT_IN_METERS_FIELD_NUMBER = 4;
    public static final int DISTANCE_TO_WAYPOINT_IN_SECONDS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<dc> PARSER;
    private int bitField0_;
    private int diffInMeters_;
    private int diffInSeconds_;
    private int distanceToWaypointInMeters_;
    private int distanceToWaypointInSeconds_;

    static {
        dc dcVar = new dc();
        DEFAULT_INSTANCE = dcVar;
        com.google.v.du.registerDefaultInstance(dc.class, dcVar);
    }

    private dc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiffInMeters() {
        this.bitField0_ &= -2;
        this.diffInMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiffInSeconds() {
        this.bitField0_ &= -3;
        this.diffInSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToWaypointInMeters() {
        this.bitField0_ &= -9;
        this.distanceToWaypointInMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToWaypointInSeconds() {
        this.bitField0_ &= -5;
        this.distanceToWaypointInSeconds_ = 0;
    }

    public static dc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static db newBuilder() {
        return (db) DEFAULT_INSTANCE.createBuilder();
    }

    public static dc parseDelimitedFrom(InputStream inputStream) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(com.google.v.v vVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiffInMeters(int i2) {
        this.bitField0_ |= 1;
        this.diffInMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiffInSeconds(int i2) {
        this.bitField0_ |= 2;
        this.diffInSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToWaypointInMeters(int i2) {
        this.bitField0_ |= 8;
        this.distanceToWaypointInMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToWaypointInSeconds(int i2) {
        this.bitField0_ |= 4;
        this.distanceToWaypointInSeconds_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "diffInMeters_", "diffInSeconds_", "distanceToWaypointInSeconds_", "distanceToWaypointInMeters_"});
        }
        if (iOrdinal == 3) {
            return new dc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new db(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDiffInMeters() {
        return this.diffInMeters_;
    }

    public int getDiffInSeconds() {
        return this.diffInSeconds_;
    }

    public int getDistanceToWaypointInMeters() {
        return this.distanceToWaypointInMeters_;
    }

    public int getDistanceToWaypointInSeconds() {
        return this.distanceToWaypointInSeconds_;
    }

    public boolean hasDiffInMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDiffInSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDistanceToWaypointInMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDistanceToWaypointInSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public static db newBuilder(dc dcVar) {
        return (db) DEFAULT_INSTANCE.createBuilder(dcVar);
    }

    public static dc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dc parseFrom(com.google.v.z zVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dc parseFrom(InputStream inputStream) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(ByteBuffer byteBuffer) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dc parseFrom(byte[] bArr) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

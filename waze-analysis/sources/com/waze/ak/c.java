package com.waze.ak;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends du<c, b> implements d {
    public static final int ANNOUNCEMENT_ID_FIELD_NUMBER = 1;
    public static final int ANNOUNCEMENT_TIMING_FIELD_NUMBER = 4;
    public static final int APPROACHING_DESTINATION_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int DISTANCE_METERS_FIELD_NUMBER = 2;
    public static final int INCLUDE_AND_THEN_FIELD_NUMBER = 5;
    public static final int INCLUDE_LANE_GUIDANCE_FIELD_NUMBER = 3;
    private static volatile fo<c> PARSER;
    private long announcementId_;
    private int announcementTiming_;
    private boolean approachingDestination_;
    private int bitField0_;
    private int distanceMeters_;
    private boolean includeAndThen_;
    private boolean includeLaneGuidance_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementId() {
        this.bitField0_ &= -2;
        this.announcementId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementTiming() {
        this.bitField0_ &= -9;
        this.announcementTiming_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApproachingDestination() {
        this.bitField0_ &= -33;
        this.approachingDestination_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceMeters() {
        this.bitField0_ &= -3;
        this.distanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeAndThen() {
        this.bitField0_ &= -17;
        this.includeAndThen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeLaneGuidance() {
        this.bitField0_ &= -5;
        this.includeLaneGuidance_ = false;
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementId(long j2) {
        this.bitField0_ |= 1;
        this.announcementId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementTiming(a aVar) {
        this.announcementTiming_ = aVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApproachingDestination(boolean z) {
        this.bitField0_ |= 32;
        this.approachingDestination_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceMeters(int i2) {
        this.bitField0_ |= 2;
        this.distanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeAndThen(boolean z) {
        this.bitField0_ |= 16;
        this.includeAndThen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeLaneGuidance(boolean z) {
        this.bitField0_ |= 4;
        this.includeLaneGuidance_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "announcementId_", "distanceMeters_", "includeLaneGuidance_", "announcementTiming_", k.f14104b, "includeAndThen_", "approachingDestination_"});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAnnouncementId() {
        return this.announcementId_;
    }

    public a getAnnouncementTiming() {
        a aVarA = a.a(this.announcementTiming_);
        return aVarA == null ? a.ANNOUNCEMENT_TIMING_UNSPECIFIED : aVarA;
    }

    public boolean getApproachingDestination() {
        return this.approachingDestination_;
    }

    public int getDistanceMeters() {
        return this.distanceMeters_;
    }

    public boolean getIncludeAndThen() {
        return this.includeAndThen_;
    }

    public boolean getIncludeLaneGuidance() {
        return this.includeLaneGuidance_;
    }

    public boolean hasAnnouncementId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAnnouncementTiming() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasApproachingDestination() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDistanceMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIncludeAndThen() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIncludeLaneGuidance() {
        return (this.bitField0_ & 4) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

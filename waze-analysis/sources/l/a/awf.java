package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awf extends com.google.v.du<awf, awe> implements com.google.v.fj {
    public static final int ACTIVE_SNAPPER_FIELD_NUMBER = 1;
    public static final int CURRENT_ACCURACY_METERS_FIELD_NUMBER = 2;
    private static final awf DEFAULT_INSTANCE;
    public static final int DISTANCE_FROM_NEW_SEGMENT_METERS_FIELD_NUMBER = 3;
    public static final int DISTANCE_FROM_ROUTE_METERS_FIELD_NUMBER = 4;
    public static final int EXPECTED_ANGLE_DEGREES_FIELD_NUMBER = 5;
    public static final int NEW_ANGLE_DEGREES_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<awf> PARSER = null;
    public static final int PREVIOUS_ANGLE_DEGREES_FIELD_NUMBER = 7;
    public static final int PREVIOUS_SEGMENTS_FIELD_NUMBER = 9;
    public static final int TIME_ON_ROUTE_MS_FIELD_NUMBER = 8;
    private int activeSnapper_;
    private int bitField0_;
    private long currentAccuracyMeters_;
    private long distanceFromNewSegmentMeters_;
    private long distanceFromRouteMeters_;
    private long expectedAngleDegrees_;
    private long newAngleDegrees_;
    private long previousAngleDegrees_;
    private com.google.v.eo<aml> previousSegments_ = emptyProtobufList();
    private long timeOnRouteMs_;

    static {
        awf awfVar = new awf();
        DEFAULT_INSTANCE = awfVar;
        com.google.v.du.registerDefaultInstance(awf.class, awfVar);
    }

    private awf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreviousSegments(Iterable<? extends aml> iterable) {
        ensurePreviousSegmentsIsMutable();
        com.google.v.c.addAll(iterable, this.previousSegments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviousSegments(int i2, aml amlVar) {
        Objects.requireNonNull(amlVar);
        ensurePreviousSegmentsIsMutable();
        this.previousSegments_.add(i2, amlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveSnapper() {
        this.activeSnapper_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentAccuracyMeters() {
        this.bitField0_ &= -2;
        this.currentAccuracyMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceFromNewSegmentMeters() {
        this.bitField0_ &= -3;
        this.distanceFromNewSegmentMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceFromRouteMeters() {
        this.bitField0_ &= -5;
        this.distanceFromRouteMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedAngleDegrees() {
        this.bitField0_ &= -9;
        this.expectedAngleDegrees_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAngleDegrees() {
        this.bitField0_ &= -17;
        this.newAngleDegrees_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousAngleDegrees() {
        this.bitField0_ &= -33;
        this.previousAngleDegrees_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousSegments() {
        this.previousSegments_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOnRouteMs() {
        this.bitField0_ &= -65;
        this.timeOnRouteMs_ = 0L;
    }

    private void ensurePreviousSegmentsIsMutable() {
        com.google.v.eo<aml> eoVar = this.previousSegments_;
        if (eoVar.c()) {
            return;
        }
        this.previousSegments_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static awf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awe newBuilder() {
        return (awe) DEFAULT_INSTANCE.createBuilder();
    }

    public static awf parseDelimitedFrom(InputStream inputStream) {
        return (awf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awf parseFrom(com.google.v.v vVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePreviousSegments(int i2) {
        ensurePreviousSegmentsIsMutable();
        this.previousSegments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveSnapper(awd awdVar) {
        this.activeSnapper_ = awdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveSnapperValue(int i2) {
        this.activeSnapper_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAccuracyMeters(long j2) {
        this.bitField0_ |= 1;
        this.currentAccuracyMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceFromNewSegmentMeters(long j2) {
        this.bitField0_ |= 2;
        this.distanceFromNewSegmentMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceFromRouteMeters(long j2) {
        this.bitField0_ |= 4;
        this.distanceFromRouteMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedAngleDegrees(long j2) {
        this.bitField0_ |= 8;
        this.expectedAngleDegrees_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAngleDegrees(long j2) {
        this.bitField0_ |= 16;
        this.newAngleDegrees_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousAngleDegrees(long j2) {
        this.bitField0_ |= 32;
        this.previousAngleDegrees_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousSegments(int i2, aml amlVar) {
        Objects.requireNonNull(amlVar);
        ensurePreviousSegmentsIsMutable();
        this.previousSegments_.set(i2, amlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOnRouteMs(long j2) {
        this.bitField0_ |= 64;
        this.timeOnRouteMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006\t\u001b", new Object[]{"bitField0_", "activeSnapper_", "currentAccuracyMeters_", "distanceFromNewSegmentMeters_", "distanceFromRouteMeters_", "expectedAngleDegrees_", "newAngleDegrees_", "previousAngleDegrees_", "timeOnRouteMs_", "previousSegments_", aml.class});
        }
        if (iOrdinal == 3) {
            return new awf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public awd getActiveSnapper() {
        int i2 = this.activeSnapper_;
        awd awdVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : awd.ROAD_SNAPPER : awd.MATCHER : awd.ACTIVE_SNAPPER_UNSPECIFIED;
        return awdVar == null ? awd.UNRECOGNIZED : awdVar;
    }

    public int getActiveSnapperValue() {
        return this.activeSnapper_;
    }

    public long getCurrentAccuracyMeters() {
        return this.currentAccuracyMeters_;
    }

    public long getDistanceFromNewSegmentMeters() {
        return this.distanceFromNewSegmentMeters_;
    }

    public long getDistanceFromRouteMeters() {
        return this.distanceFromRouteMeters_;
    }

    public long getExpectedAngleDegrees() {
        return this.expectedAngleDegrees_;
    }

    public long getNewAngleDegrees() {
        return this.newAngleDegrees_;
    }

    public long getPreviousAngleDegrees() {
        return this.previousAngleDegrees_;
    }

    public aml getPreviousSegments(int i2) {
        return this.previousSegments_.get(i2);
    }

    public int getPreviousSegmentsCount() {
        return this.previousSegments_.size();
    }

    public List<aml> getPreviousSegmentsList() {
        return this.previousSegments_;
    }

    public amm getPreviousSegmentsOrBuilder(int i2) {
        return this.previousSegments_.get(i2);
    }

    public List<? extends amm> getPreviousSegmentsOrBuilderList() {
        return this.previousSegments_;
    }

    public long getTimeOnRouteMs() {
        return this.timeOnRouteMs_;
    }

    public boolean hasCurrentAccuracyMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceFromNewSegmentMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDistanceFromRouteMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasExpectedAngleDegrees() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNewAngleDegrees() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPreviousAngleDegrees() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeOnRouteMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public static awe newBuilder(awf awfVar) {
        return (awe) DEFAULT_INSTANCE.createBuilder(awfVar);
    }

    public static awf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awf parseFrom(com.google.v.z zVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviousSegments(aml amlVar) {
        Objects.requireNonNull(amlVar);
        ensurePreviousSegmentsIsMutable();
        this.previousSegments_.add(amlVar);
    }

    public static awf parseFrom(InputStream inputStream) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awf parseFrom(ByteBuffer byteBuffer) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awf parseFrom(byte[] bArr) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

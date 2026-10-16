package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbc extends com.google.v.du<bbc, bbb> implements com.google.v.fj {
    public static final int AD_COUNT_FIELD_NUMBER = 1;
    public static final int CALENDAR_EVENT_COUNT_FIELD_NUMBER = 2;
    private static final bbc DEFAULT_INSTANCE;
    public static final int ETA_CHECK_COUNT_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bbc> PARSER = null;
    public static final int PLANNED_DRIVE_COUNT_FIELD_NUMBER = 4;
    public static final int PREDICTION_COUNT_FIELD_NUMBER = 5;
    public static final int SUGGESTED_DESTINATION_COUNT_FIELD_NUMBER = 6;
    private long adCount_;
    private int bitField0_;
    private long calendarEventCount_;
    private long etaCheckCount_;
    private long plannedDriveCount_;
    private long predictionCount_;
    private long suggestedDestinationCount_;

    static {
        bbc bbcVar = new bbc();
        DEFAULT_INSTANCE = bbcVar;
        com.google.v.du.registerDefaultInstance(bbc.class, bbcVar);
    }

    private bbc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdCount() {
        this.bitField0_ &= -2;
        this.adCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalendarEventCount() {
        this.bitField0_ &= -3;
        this.calendarEventCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaCheckCount() {
        this.bitField0_ &= -5;
        this.etaCheckCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveCount() {
        this.bitField0_ &= -9;
        this.plannedDriveCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredictionCount() {
        this.bitField0_ &= -17;
        this.predictionCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedDestinationCount() {
        this.bitField0_ &= -33;
        this.suggestedDestinationCount_ = 0L;
    }

    public static bbc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbb newBuilder() {
        return (bbb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbc parseDelimitedFrom(InputStream inputStream) {
        return (bbc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbc parseFrom(com.google.v.v vVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCount(long j2) {
        this.bitField0_ |= 1;
        this.adCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalendarEventCount(long j2) {
        this.bitField0_ |= 2;
        this.calendarEventCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaCheckCount(long j2) {
        this.bitField0_ |= 4;
        this.etaCheckCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveCount(long j2) {
        this.bitField0_ |= 8;
        this.plannedDriveCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredictionCount(long j2) {
        this.bitField0_ |= 16;
        this.predictionCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedDestinationCount(long j2) {
        this.bitField0_ |= 32;
        this.suggestedDestinationCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"bitField0_", "adCount_", "calendarEventCount_", "etaCheckCount_", "plannedDriveCount_", "predictionCount_", "suggestedDestinationCount_"});
        }
        if (iOrdinal == 3) {
            return new bbc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAdCount() {
        return this.adCount_;
    }

    public long getCalendarEventCount() {
        return this.calendarEventCount_;
    }

    public long getEtaCheckCount() {
        return this.etaCheckCount_;
    }

    public long getPlannedDriveCount() {
        return this.plannedDriveCount_;
    }

    public long getPredictionCount() {
        return this.predictionCount_;
    }

    public long getSuggestedDestinationCount() {
        return this.suggestedDestinationCount_;
    }

    public boolean hasAdCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCalendarEventCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEtaCheckCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlannedDriveCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPredictionCount() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSuggestedDestinationCount() {
        return (this.bitField0_ & 32) != 0;
    }

    public static bbb newBuilder(bbc bbcVar) {
        return (bbb) DEFAULT_INSTANCE.createBuilder(bbcVar);
    }

    public static bbc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbc parseFrom(com.google.v.z zVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbc parseFrom(InputStream inputStream) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbc parseFrom(ByteBuffer byteBuffer) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbc parseFrom(byte[] bArr) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

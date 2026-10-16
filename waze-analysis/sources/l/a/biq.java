package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class biq extends com.google.v.du<biq, bio> implements bir {
    private static final biq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<biq> PARSER = null;
    public static final int TIMELINE_RELATIVE_TRAFFIC_END_POSITION_FIELD_NUMBER = 3;
    public static final int TIMELINE_RELATIVE_TRAFFIC_START_POSITION_FIELD_NUMBER = 2;
    public static final int TRAFFIC_INCIDENT_LEVEL_FIELD_NUMBER = 1;
    private int bitField0_;
    private float timelineRelativeTrafficEndPosition_;
    private float timelineRelativeTrafficStartPosition_;
    private int trafficIncidentLevel_;

    static {
        biq biqVar = new biq();
        DEFAULT_INSTANCE = biqVar;
        com.google.v.du.registerDefaultInstance(biq.class, biqVar);
    }

    private biq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelineRelativeTrafficEndPosition() {
        this.bitField0_ &= -3;
        this.timelineRelativeTrafficEndPosition_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelineRelativeTrafficStartPosition() {
        this.bitField0_ &= -2;
        this.timelineRelativeTrafficStartPosition_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficIncidentLevel() {
        this.trafficIncidentLevel_ = 0;
    }

    public static biq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bio newBuilder() {
        return (bio) DEFAULT_INSTANCE.createBuilder();
    }

    public static biq parseDelimitedFrom(InputStream inputStream) {
        return (biq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static biq parseFrom(com.google.v.v vVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<biq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineRelativeTrafficEndPosition(float f2) {
        this.bitField0_ |= 2;
        this.timelineRelativeTrafficEndPosition_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineRelativeTrafficStartPosition(float f2) {
        this.bitField0_ |= 1;
        this.timelineRelativeTrafficStartPosition_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficIncidentLevel(bip bipVar) {
        this.trafficIncidentLevel_ = bipVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficIncidentLevelValue(int i2) {
        this.trafficIncidentLevel_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ခ\u0000\u0003ခ\u0001", new Object[]{"bitField0_", "trafficIncidentLevel_", "timelineRelativeTrafficStartPosition_", "timelineRelativeTrafficEndPosition_"});
        }
        if (iOrdinal == 3) {
            return new biq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bio(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<biq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (biq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getTimelineRelativeTrafficEndPosition() {
        return this.timelineRelativeTrafficEndPosition_;
    }

    public float getTimelineRelativeTrafficStartPosition() {
        return this.timelineRelativeTrafficStartPosition_;
    }

    public bip getTrafficIncidentLevel() {
        int i2 = this.trafficIncidentLevel_;
        bip bipVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bip.CLOSEDROAD : bip.STANDSTILL : bip.HEAVY : bip.MODERATE : bip.LIGHT : bip.TRAFFIC_INCIDENT_LEVEL_UNSPECIFIED;
        return bipVar == null ? bip.UNRECOGNIZED : bipVar;
    }

    public int getTrafficIncidentLevelValue() {
        return this.trafficIncidentLevel_;
    }

    public boolean hasTimelineRelativeTrafficEndPosition() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimelineRelativeTrafficStartPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bio newBuilder(biq biqVar) {
        return (bio) DEFAULT_INSTANCE.createBuilder(biqVar);
    }

    public static biq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (biq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static biq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static biq parseFrom(com.google.v.z zVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static biq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static biq parseFrom(InputStream inputStream) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static biq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static biq parseFrom(ByteBuffer byteBuffer) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static biq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static biq parseFrom(byte[] bArr) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static biq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (biq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

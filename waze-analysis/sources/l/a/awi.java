package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awi extends com.google.v.du<awi, awh> implements com.google.v.fj {
    public static final int COMPLETE_FIELD_NUMBER = 1;
    private static final awi DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_SERVICE_ENABLED_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<awi> PARSER = null;
    public static final int SEGMENT_COUNT_FIELD_NUMBER = 4;
    public static final int WAYPOINT_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean complete_;
    private boolean instrumentationServiceEnabled_;
    private long segmentCount_;
    private boolean waypoint_;

    static {
        awi awiVar = new awi();
        DEFAULT_INSTANCE = awiVar;
        com.google.v.du.registerDefaultInstance(awi.class, awiVar);
    }

    private awi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComplete() {
        this.bitField0_ &= -2;
        this.complete_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstrumentationServiceEnabled() {
        this.bitField0_ &= -5;
        this.instrumentationServiceEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentCount() {
        this.segmentCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.bitField0_ &= -3;
        this.waypoint_ = false;
    }

    public static awi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awh newBuilder() {
        return (awh) DEFAULT_INSTANCE.createBuilder();
    }

    public static awi parseDelimitedFrom(InputStream inputStream) {
        return (awi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awi parseFrom(com.google.v.v vVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComplete(boolean z) {
        this.bitField0_ |= 1;
        this.complete_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstrumentationServiceEnabled(boolean z) {
        this.bitField0_ |= 4;
        this.instrumentationServiceEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentCount(long j2) {
        this.segmentCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(boolean z) {
        this.bitField0_ |= 2;
        this.waypoint_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004\u0002", new Object[]{"bitField0_", "complete_", "waypoint_", "instrumentationServiceEnabled_", "segmentCount_"});
        }
        if (iOrdinal == 3) {
            return new awi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getComplete() {
        return this.complete_;
    }

    @Deprecated
    public boolean getInstrumentationServiceEnabled() {
        return this.instrumentationServiceEnabled_;
    }

    public long getSegmentCount() {
        return this.segmentCount_;
    }

    public boolean getWaypoint() {
        return this.waypoint_;
    }

    public boolean hasComplete() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasInstrumentationServiceEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 2) != 0;
    }

    public static awh newBuilder(awi awiVar) {
        return (awh) DEFAULT_INSTANCE.createBuilder(awiVar);
    }

    public static awi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awi parseFrom(com.google.v.z zVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static awi parseFrom(InputStream inputStream) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awi parseFrom(ByteBuffer byteBuffer) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awi parseFrom(byte[] bArr) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

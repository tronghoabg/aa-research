package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ow extends com.google.v.du<ow, ov> implements com.google.v.fj {
    private static final ow DEFAULT_INSTANCE;
    public static final int ENDTIMESECONDS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ow> PARSER = null;
    public static final int STARTTIMESECONDS_FIELD_NUMBER = 1;
    public static final int STEPSECONDS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long endTimeSeconds_;
    private long startTimeSeconds_;
    private int stepSeconds_;

    static {
        ow owVar = new ow();
        DEFAULT_INSTANCE = owVar;
        com.google.v.du.registerDefaultInstance(ow.class, owVar);
    }

    private ow() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimeSeconds() {
        this.bitField0_ &= -3;
        this.endTimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeSeconds() {
        this.bitField0_ &= -2;
        this.startTimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStepSeconds() {
        this.bitField0_ &= -5;
        this.stepSeconds_ = 0;
    }

    public static ow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ov newBuilder() {
        return (ov) DEFAULT_INSTANCE.createBuilder();
    }

    public static ow parseDelimitedFrom(InputStream inputStream) {
        return (ow) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ow parseFrom(com.google.v.v vVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ow> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimeSeconds(long j2) {
        this.bitField0_ |= 2;
        this.endTimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeSeconds(long j2) {
        this.bitField0_ |= 1;
        this.startTimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStepSeconds(int i2) {
        this.bitField0_ |= 4;
        this.stepSeconds_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"bitField0_", "startTimeSeconds_", "endTimeSeconds_", "stepSeconds_"});
        }
        if (iOrdinal == 3) {
            return new ow();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ov(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ow> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ow.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEndTimeSeconds() {
        return this.endTimeSeconds_;
    }

    public long getStartTimeSeconds() {
        return this.startTimeSeconds_;
    }

    public int getStepSeconds() {
        return this.stepSeconds_;
    }

    public boolean hasEndTimeSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStartTimeSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStepSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ov newBuilder(ow owVar) {
        return (ov) DEFAULT_INSTANCE.createBuilder(owVar);
    }

    public static ow parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ow) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ow parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ow parseFrom(com.google.v.z zVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ow parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ow parseFrom(InputStream inputStream) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ow parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ow parseFrom(ByteBuffer byteBuffer) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ow parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ow parseFrom(byte[] bArr) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ow parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ow) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

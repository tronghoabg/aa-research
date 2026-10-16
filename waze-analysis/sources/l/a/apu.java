package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apu extends com.google.v.du<apu, aps> implements com.google.v.fj {
    private static final apu DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<apu> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long latencyMs_;
    private int source_;

    static {
        apu apuVar = new apu();
        DEFAULT_INSTANCE = apuVar;
        com.google.v.du.registerDefaultInstance(apu.class, apuVar);
    }

    private apu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static apu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aps newBuilder() {
        return (aps) DEFAULT_INSTANCE.createBuilder();
    }

    public static apu parseDelimitedFrom(InputStream inputStream) {
        return (apu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apu parseFrom(com.google.v.v vVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(apt aptVar) {
        this.source_ = aptVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000", new Object[]{"bitField0_", "source_", "latencyMs_"});
        }
        if (iOrdinal == 3) {
            return new apu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aps(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public apt getSource() {
        int i2 = this.source_;
        apt aptVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : apt.SERVER : apt.CACHE : apt.SOURCE_UNSPECIFIED;
        return aptVar == null ? apt.UNRECOGNIZED : aptVar;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aps newBuilder(apu apuVar) {
        return (aps) DEFAULT_INSTANCE.createBuilder(apuVar);
    }

    public static apu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apu parseFrom(com.google.v.z zVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apu parseFrom(InputStream inputStream) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apu parseFrom(ByteBuffer byteBuffer) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apu parseFrom(byte[] bArr) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

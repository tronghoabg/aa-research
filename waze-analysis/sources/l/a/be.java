package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class be extends com.google.v.du<be, bd> implements com.google.v.fj {
    private static final be DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<be> PARSER = null;
    public static final int RESIDENTIAL_FIELD_NUMBER = 2;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 3;
    private int bitField0_;
    private long latencyMs_;
    private boolean residential_;
    private int triggeringPlatform_;

    static {
        be beVar = new be();
        DEFAULT_INSTANCE = beVar;
        com.google.v.du.registerDefaultInstance(be.class, beVar);
    }

    private be() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidential() {
        this.bitField0_ &= -3;
        this.residential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    public static be getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bd newBuilder() {
        return (bd) DEFAULT_INSTANCE.createBuilder();
    }

    public static be parseDelimitedFrom(InputStream inputStream) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(com.google.v.v vVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<be> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidential(boolean z) {
        this.bitField0_ |= 2;
        this.residential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003\f", new Object[]{"bitField0_", "latencyMs_", "residential_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new be();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<be> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (be.class) {
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

    public boolean getResidential() {
        return this.residential_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasResidential() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bd newBuilder(be beVar) {
        return (bd) DEFAULT_INSTANCE.createBuilder(beVar);
    }

    public static be parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static be parseFrom(com.google.v.z zVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static be parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static be parseFrom(InputStream inputStream) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(ByteBuffer byteBuffer) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static be parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static be parseFrom(byte[] bArr) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static be parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (be) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

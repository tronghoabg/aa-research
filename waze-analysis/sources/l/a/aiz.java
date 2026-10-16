package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aiz extends com.google.v.du<aiz, aiy> implements com.google.v.fj {
    private static final aiz DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aiz> PARSER;
    private int bitField0_;
    private long latencyMs_;

    static {
        aiz aizVar = new aiz();
        DEFAULT_INSTANCE = aizVar;
        com.google.v.du.registerDefaultInstance(aiz.class, aizVar);
    }

    private aiz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    public static aiz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aiy newBuilder() {
        return (aiy) DEFAULT_INSTANCE.createBuilder();
    }

    public static aiz parseDelimitedFrom(InputStream inputStream) {
        return (aiz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aiz parseFrom(com.google.v.v vVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aiz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "latencyMs_"});
        }
        if (iOrdinal == 3) {
            return new aiz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aiy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aiz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aiz.class) {
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

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aiy newBuilder(aiz aizVar) {
        return (aiy) DEFAULT_INSTANCE.createBuilder(aizVar);
    }

    public static aiz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aiz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aiz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aiz parseFrom(com.google.v.z zVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aiz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aiz parseFrom(InputStream inputStream) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aiz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aiz parseFrom(ByteBuffer byteBuffer) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aiz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aiz parseFrom(byte[] bArr) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aiz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aiz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

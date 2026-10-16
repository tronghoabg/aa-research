package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afb extends com.google.v.du<afb, afa> implements com.google.v.fj {
    private static final afb DEFAULT_INSTANCE;
    public static final int HANG_DURATION_MS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<afb> PARSER = null;
    public static final int STACK_TRACE_FIELD_NUMBER = 2;
    private int bitField0_;
    private long hangDurationMs_;
    private String stackTrace_ = "";

    static {
        afb afbVar = new afb();
        DEFAULT_INSTANCE = afbVar;
        com.google.v.du.registerDefaultInstance(afb.class, afbVar);
    }

    private afb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHangDurationMs() {
        this.bitField0_ &= -2;
        this.hangDurationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStackTrace() {
        this.stackTrace_ = getDefaultInstance().getStackTrace();
    }

    public static afb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afa newBuilder() {
        return (afa) DEFAULT_INSTANCE.createBuilder();
    }

    public static afb parseDelimitedFrom(InputStream inputStream) {
        return (afb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afb parseFrom(com.google.v.v vVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHangDurationMs(long j2) {
        this.bitField0_ |= 1;
        this.hangDurationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStackTrace(String str) {
        Objects.requireNonNull(str);
        this.stackTrace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStackTraceBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.stackTrace_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ", new Object[]{"bitField0_", "hangDurationMs_", "stackTrace_"});
        }
        if (iOrdinal == 3) {
            return new afb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getHangDurationMs() {
        return this.hangDurationMs_;
    }

    @Deprecated
    public String getStackTrace() {
        return this.stackTrace_;
    }

    @Deprecated
    public com.google.v.v getStackTraceBytes() {
        return com.google.v.v.s(this.stackTrace_);
    }

    public boolean hasHangDurationMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static afa newBuilder(afb afbVar) {
        return (afa) DEFAULT_INSTANCE.createBuilder(afbVar);
    }

    public static afb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afb parseFrom(com.google.v.z zVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afb parseFrom(InputStream inputStream) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afb parseFrom(ByteBuffer byteBuffer) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afb parseFrom(byte[] bArr) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

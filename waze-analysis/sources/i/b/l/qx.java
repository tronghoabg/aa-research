package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qx extends com.google.v.du<qx, qw> implements com.google.v.fj {
    private static final qx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qx> PARSER = null;
    public static final int TTSWITHARGUMENTS_FIELD_NUMBER = 2;
    public static final int TTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private i.b.ao ttsWithArguments_;
    private String tts_ = "";

    static {
        qx qxVar = new qx();
        DEFAULT_INSTANCE = qxVar;
        com.google.v.du.registerDefaultInstance(qx.class, qxVar);
    }

    private qx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTts() {
        this.bitField0_ &= -2;
        this.tts_ = getDefaultInstance().getTts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsWithArguments() {
        this.ttsWithArguments_ = null;
        this.bitField0_ &= -3;
    }

    public static qx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTtsWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.ttsWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.ttsWithArguments_ = aoVar;
        this.bitField0_ |= 2;
    }

    public static qw newBuilder() {
        return (qw) DEFAULT_INSTANCE.createBuilder();
    }

    public static qx parseDelimitedFrom(InputStream inputStream) {
        return (qx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qx parseFrom(com.google.v.v vVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTts(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.tts_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsBytes(com.google.v.v vVar) {
        this.tts_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.ttsWithArguments_ = aoVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "tts_", "ttsWithArguments_"});
        }
        if (iOrdinal == 3) {
            return new qx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getTts() {
        return this.tts_;
    }

    public com.google.v.v getTtsBytes() {
        return com.google.v.v.s(this.tts_);
    }

    public i.b.ao getTtsWithArguments() {
        i.b.ao aoVar = this.ttsWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public boolean hasTts() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTtsWithArguments() {
        return (this.bitField0_ & 2) != 0;
    }

    public static qw newBuilder(qx qxVar) {
        return (qw) DEFAULT_INSTANCE.createBuilder(qxVar);
    }

    public static qx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qx parseFrom(com.google.v.z zVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qx parseFrom(InputStream inputStream) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qx parseFrom(ByteBuffer byteBuffer) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qx parseFrom(byte[] bArr) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

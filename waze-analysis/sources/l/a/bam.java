package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bam extends com.google.v.du<bam, bal> implements com.google.v.fj {
    public static final int API_FIELD_NUMBER = 1;
    private static final bam DEFAULT_INSTANCE;
    public static final int ELAPSED_TIME_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bam> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    private String api_ = "";
    private int bitField0_;
    private long elapsedTimeMs_;
    private avx result_;

    static {
        bam bamVar = new bam();
        DEFAULT_INSTANCE = bamVar;
        com.google.v.du.registerDefaultInstance(bam.class, bamVar);
    }

    private bam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApi() {
        this.api_ = getDefaultInstance().getApi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElapsedTimeMs() {
        this.bitField0_ &= -3;
        this.elapsedTimeMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = null;
        this.bitField0_ &= -2;
    }

    public static bam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResult(avx avxVar) {
        Objects.requireNonNull(avxVar);
        avx avxVar2 = this.result_;
        if (avxVar2 != null && avxVar2 != avx.getDefaultInstance()) {
            avv avvVarNewBuilder = avx.newBuilder(avxVar2);
            avvVarNewBuilder.mergeFrom((avv) avxVar);
            avxVar = avvVarNewBuilder.buildPartial();
        }
        this.result_ = avxVar;
        this.bitField0_ |= 1;
    }

    public static bal newBuilder() {
        return (bal) DEFAULT_INSTANCE.createBuilder();
    }

    public static bam parseDelimitedFrom(InputStream inputStream) {
        return (bam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bam parseFrom(com.google.v.v vVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApi(String str) {
        Objects.requireNonNull(str);
        this.api_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.api_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElapsedTimeMs(long j2) {
        this.bitField0_ |= 2;
        this.elapsedTimeMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(avx avxVar) {
        Objects.requireNonNull(avxVar);
        this.result_ = avxVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "api_", "result_", "elapsedTimeMs_"});
        }
        if (iOrdinal == 3) {
            return new bam();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bal(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bam> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bam.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getApi() {
        return this.api_;
    }

    public com.google.v.v getApiBytes() {
        return com.google.v.v.s(this.api_);
    }

    public long getElapsedTimeMs() {
        return this.elapsedTimeMs_;
    }

    public avx getResult() {
        avx avxVar = this.result_;
        return avxVar == null ? avx.getDefaultInstance() : avxVar;
    }

    public boolean hasElapsedTimeMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResult() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bal newBuilder(bam bamVar) {
        return (bal) DEFAULT_INSTANCE.createBuilder(bamVar);
    }

    public static bam parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bam parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bam parseFrom(com.google.v.z zVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bam parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bam parseFrom(InputStream inputStream) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bam parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bam parseFrom(ByteBuffer byteBuffer) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bam parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bam parseFrom(byte[] bArr) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bam parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

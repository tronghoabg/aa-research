package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avx extends com.google.v.du<avx, avv> implements com.google.v.fj {
    private static final avx DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<avx> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private String failureReason_ = "";
    private int status_;

    static {
        avx avxVar = new avx();
        DEFAULT_INSTANCE = avxVar;
        com.google.v.du.registerDefaultInstance(avx.class, avxVar);
    }

    private avx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.failureReason_ = getDefaultInstance().getFailureReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static avx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avv newBuilder() {
        return (avv) DEFAULT_INSTANCE.createBuilder();
    }

    public static avx parseDelimitedFrom(InputStream inputStream) {
        return (avx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avx parseFrom(com.google.v.v vVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(String str) {
        Objects.requireNonNull(str);
        this.failureReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.failureReason_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(avw avwVar) {
        this.status_ = avwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i2) {
        this.status_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"status_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new avx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFailureReason() {
        return this.failureReason_;
    }

    public com.google.v.v getFailureReasonBytes() {
        return com.google.v.v.s(this.failureReason_);
    }

    public avw getStatus() {
        int i2 = this.status_;
        avw avwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : avw.FAILURE : avw.SUCCESS : avw.STATUS_UNKNOWN;
        return avwVar == null ? avw.UNRECOGNIZED : avwVar;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public static avv newBuilder(avx avxVar) {
        return (avv) DEFAULT_INSTANCE.createBuilder(avxVar);
    }

    public static avx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avx parseFrom(com.google.v.z zVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avx parseFrom(InputStream inputStream) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avx parseFrom(ByteBuffer byteBuffer) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avx parseFrom(byte[] bArr) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

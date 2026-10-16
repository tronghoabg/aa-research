package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aty extends com.google.v.du<aty, atx> implements com.google.v.fj {
    private static final aty DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_INTERNAL_CODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<aty> PARSER;
    private int bitField0_;
    private long errorCode_;
    private String errorInternalCode_ = "";

    static {
        aty atyVar = new aty();
        DEFAULT_INSTANCE = atyVar;
        com.google.v.du.registerDefaultInstance(aty.class, atyVar);
    }

    private aty() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -2;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorInternalCode() {
        this.errorInternalCode_ = getDefaultInstance().getErrorInternalCode();
    }

    public static aty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atx newBuilder() {
        return (atx) DEFAULT_INSTANCE.createBuilder();
    }

    public static aty parseDelimitedFrom(InputStream inputStream) {
        return (aty) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aty parseFrom(com.google.v.v vVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aty> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 1;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorInternalCode(String str) {
        Objects.requireNonNull(str);
        this.errorInternalCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorInternalCodeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorInternalCode_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ", new Object[]{"bitField0_", "errorCode_", "errorInternalCode_"});
        }
        if (iOrdinal == 3) {
            return new aty();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aty> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aty.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public String getErrorInternalCode() {
        return this.errorInternalCode_;
    }

    public com.google.v.v getErrorInternalCodeBytes() {
        return com.google.v.v.s(this.errorInternalCode_);
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static atx newBuilder(aty atyVar) {
        return (atx) DEFAULT_INSTANCE.createBuilder(atyVar);
    }

    public static aty parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aty) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aty parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aty parseFrom(com.google.v.z zVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aty parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aty parseFrom(InputStream inputStream) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aty parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aty parseFrom(ByteBuffer byteBuffer) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aty parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aty parseFrom(byte[] bArr) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aty parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aty) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

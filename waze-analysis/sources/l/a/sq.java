package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sq extends com.google.v.du<sq, sp> implements com.google.v.fj {
    private static final sq DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
    public static final int HTTP_ERROR_CODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<sq> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 3;
    public static final int RESOURCE_URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private long httpErrorCode_;
    private String errorMessage_ = "";
    private String resourceName_ = "";
    private String resourceUrl_ = "";

    static {
        sq sqVar = new sq();
        DEFAULT_INSTANCE = sqVar;
        com.google.v.du.registerDefaultInstance(sq.class, sqVar);
    }

    private sq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpErrorCode() {
        this.bitField0_ &= -2;
        this.httpErrorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceUrl() {
        this.resourceUrl_ = getDefaultInstance().getResourceUrl();
    }

    public static sq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sp newBuilder() {
        return (sp) DEFAULT_INSTANCE.createBuilder();
    }

    public static sq parseDelimitedFrom(InputStream inputStream) {
        return (sq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sq parseFrom(com.google.v.v vVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        Objects.requireNonNull(str);
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorMessage_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpErrorCode(long j2) {
        this.bitField0_ |= 1;
        this.httpErrorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceName(String str) {
        Objects.requireNonNull(str);
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.resourceName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceUrl(String str) {
        Objects.requireNonNull(str);
        this.resourceUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.resourceUrl_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဂ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "errorMessage_", "httpErrorCode_", "resourceName_", "resourceUrl_"});
        }
        if (iOrdinal == 3) {
            return new sq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public com.google.v.v getErrorMessageBytes() {
        return com.google.v.v.s(this.errorMessage_);
    }

    public long getHttpErrorCode() {
        return this.httpErrorCode_;
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public com.google.v.v getResourceNameBytes() {
        return com.google.v.v.s(this.resourceName_);
    }

    public String getResourceUrl() {
        return this.resourceUrl_;
    }

    public com.google.v.v getResourceUrlBytes() {
        return com.google.v.v.s(this.resourceUrl_);
    }

    public boolean hasHttpErrorCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static sp newBuilder(sq sqVar) {
        return (sp) DEFAULT_INSTANCE.createBuilder(sqVar);
    }

    public static sq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sq parseFrom(com.google.v.z zVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sq parseFrom(InputStream inputStream) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sq parseFrom(ByteBuffer byteBuffer) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sq parseFrom(byte[] bArr) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

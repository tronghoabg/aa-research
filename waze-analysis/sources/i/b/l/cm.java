package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cm extends com.google.v.du<cm, cl> implements com.google.v.fj {
    public static final int CODE_FIELD_NUMBER = 10101;
    private static final cm DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 10102;
    public static final int ERRORCODE_FIELD_NUMBER = 10107;
    public static final int INTERNAL_CODE_FIELD_NUMBER = 10103;
    public static final int PARAMETERS_FIELD_NUMBER = 10108;
    private static volatile com.google.v.fo<cm> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 10105;
    public static final int SERVER_FIELD_NUMBER = 10106;
    public static final int USER_ERROR_MESSAGE_FIELD_NUMBER = 10104;
    private int bitField0_;
    private int code_;
    private i.b.am parameters_;
    private co userErrorMessage_;
    private String description_ = "";
    private String internalCode_ = "";
    private String request_ = "";
    private String server_ = "";
    private String errorCode_ = "";

    static {
        cm cmVar = new cm();
        DEFAULT_INSTANCE = cmVar;
        com.google.v.du.registerDefaultInstance(cm.class, cmVar);
    }

    private cm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.bitField0_ &= -2;
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -3;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -33;
        this.errorCode_ = getDefaultInstance().getErrorCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalCode() {
        this.bitField0_ &= -5;
        this.internalCode_ = getDefaultInstance().getInternalCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameters() {
        this.parameters_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.bitField0_ &= -9;
        this.request_ = getDefaultInstance().getRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServer() {
        this.bitField0_ &= -17;
        this.server_ = getDefaultInstance().getServer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserErrorMessage() {
        this.userErrorMessage_ = null;
        this.bitField0_ &= -129;
    }

    public static cm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParameters(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.parameters_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.parameters_ = amVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserErrorMessage(co coVar) {
        Objects.requireNonNull(coVar);
        co coVar2 = this.userErrorMessage_;
        if (coVar2 != null && coVar2 != co.getDefaultInstance()) {
            cn cnVarNewBuilder = co.newBuilder(coVar2);
            cnVarNewBuilder.mergeFrom((cn) coVar);
            coVar = cnVarNewBuilder.buildPartial();
        }
        this.userErrorMessage_ = coVar;
        this.bitField0_ |= 128;
    }

    public static cl newBuilder() {
        return (cl) DEFAULT_INSTANCE.createBuilder();
    }

    public static cm parseDelimitedFrom(InputStream inputStream) {
        return (cm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cm parseFrom(com.google.v.v vVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i2) {
        this.bitField0_ |= 1;
        this.code_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.errorCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCodeBytes(com.google.v.v vVar) {
        this.errorCode_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.internalCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalCodeBytes(com.google.v.v vVar) {
        this.internalCode_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.parameters_ = amVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.request_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestBytes(com.google.v.v vVar) {
        this.request_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.server_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerBytes(com.google.v.v vVar) {
        this.server_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserErrorMessage(co coVar) {
        Objects.requireNonNull(coVar);
        this.userErrorMessage_ = coVar;
        this.bitField0_ |= 128;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001❵❼\b\u0000\u0000\u0000❵င\u0000❶ဈ\u0001❷ဈ\u0002❸ဉ\u0007❹ဈ\u0003❺ဈ\u0004❻ဈ\u0005❼ဉ\u0006", new Object[]{"bitField0_", "code_", "description_", "internalCode_", "userErrorMessage_", "request_", "server_", "errorCode_", "parameters_"});
        }
        if (iOrdinal == 3) {
            return new cm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCode() {
        return this.code_;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public String getErrorCode() {
        return this.errorCode_;
    }

    public com.google.v.v getErrorCodeBytes() {
        return com.google.v.v.s(this.errorCode_);
    }

    public String getInternalCode() {
        return this.internalCode_;
    }

    public com.google.v.v getInternalCodeBytes() {
        return com.google.v.v.s(this.internalCode_);
    }

    public i.b.am getParameters() {
        i.b.am amVar = this.parameters_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public String getRequest() {
        return this.request_;
    }

    public com.google.v.v getRequestBytes() {
        return com.google.v.v.s(this.request_);
    }

    public String getServer() {
        return this.server_;
    }

    public com.google.v.v getServerBytes() {
        return com.google.v.v.s(this.server_);
    }

    public co getUserErrorMessage() {
        co coVar = this.userErrorMessage_;
        return coVar == null ? co.getDefaultInstance() : coVar;
    }

    public boolean hasCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasInternalCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasParameters() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRequest() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasServer() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUserErrorMessage() {
        return (this.bitField0_ & 128) != 0;
    }

    public static cl newBuilder(cm cmVar) {
        return (cl) DEFAULT_INSTANCE.createBuilder(cmVar);
    }

    public static cm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cm parseFrom(com.google.v.z zVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cm parseFrom(InputStream inputStream) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cm parseFrom(ByteBuffer byteBuffer) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cm parseFrom(byte[] bArr) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

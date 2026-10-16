package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oi extends com.google.v.du<oi, of> implements com.google.v.fj {
    public static final int ALERT_INFO_FIELD_NUMBER = 4;
    public static final int BACKEND_CANCEL_FIELD_NUMBER = 6;
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final oi DEFAULT_INSTANCE;
    public static final int FAILED_TO_INITIATE_CONVERSATION_FIELD_NUMBER = 8;
    public static final int FAILURE_REASON_FIELD_NUMBER = 5;
    public static final int MODE_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<oi> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean failedToInitiateConversation_;
    private int mode_;
    private Object result_;
    private boolean success_;
    private int resultCase_ = 0;
    private String ugcContextId_ = "";
    private String conversationId_ = "";

    static {
        oi oiVar = new oi();
        DEFAULT_INSTANCE = oiVar;
        com.google.v.du.registerDefaultInstance(oi.class, oiVar);
    }

    private oi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertInfo() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackendCancel() {
        if (this.resultCase_ == 6) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.bitField0_ &= -2;
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToInitiateConversation() {
        this.bitField0_ &= -5;
        this.failedToInitiateConversation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -3;
        this.success_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    public static oi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertInfo(oe oeVar) {
        Objects.requireNonNull(oeVar);
        if (this.resultCase_ == 4 && this.result_ != oe.getDefaultInstance()) {
            od odVarNewBuilder = oe.newBuilder((oe) this.result_);
            odVarNewBuilder.mergeFrom((od) oeVar);
            oeVar = odVarNewBuilder.buildPartial();
        }
        this.result_ = oeVar;
        this.resultCase_ = 4;
    }

    public static of newBuilder() {
        return (of) DEFAULT_INSTANCE.createBuilder();
    }

    public static oi parseDelimitedFrom(InputStream inputStream) {
        return (oi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oi parseFrom(com.google.v.v vVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertInfo(oe oeVar) {
        Objects.requireNonNull(oeVar);
        this.result_ = oeVar;
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackendCancel(boolean z) {
        this.resultCase_ = 6;
        this.result_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.conversationId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToInitiateConversation(boolean z) {
        this.bitField0_ |= 4;
        this.failedToInitiateConversation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(og ogVar) {
        this.result_ = Integer.valueOf(ogVar.getNumber());
        this.resultCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonValue(int i2) {
        this.resultCase_ = 5;
        this.result_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(os osVar) {
        this.mode_ = osVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 2;
        this.success_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဇ\u0001\u0004<\u0000\u0005?\u0000\u0006:\u0000\u0007\f\bဇ\u0002", new Object[]{"result_", "resultCase_", "bitField0_", "ugcContextId_", "conversationId_", "success_", oe.class, "mode_", "failedToInitiateConversation_"});
        }
        if (iOrdinal == 3) {
            return new oi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new of(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public oe getAlertInfo() {
        return this.resultCase_ == 4 ? (oe) this.result_ : oe.getDefaultInstance();
    }

    @Deprecated
    public boolean getBackendCancel() {
        if (this.resultCase_ == 6) {
            return ((Boolean) this.result_).booleanValue();
        }
        return false;
    }

    public String getConversationId() {
        return this.conversationId_;
    }

    public com.google.v.v getConversationIdBytes() {
        return com.google.v.v.s(this.conversationId_);
    }

    public boolean getFailedToInitiateConversation() {
        return this.failedToInitiateConversation_;
    }

    public og getFailureReason() {
        og ogVar;
        if (this.resultCase_ != 5) {
            return og.FAILURE_REASON_UNSPECIFIED;
        }
        switch (((Integer) this.result_).intValue()) {
            case 0:
                ogVar = og.FAILURE_REASON_UNSPECIFIED;
                break;
            case 1:
                ogVar = og.CLIENT_ERROR;
                break;
            case 2:
                ogVar = og.BACKEND_ERROR;
                break;
            case 3:
                ogVar = og.BACKEND_CANCELLED_PER_USER_MESSAGE;
                break;
            case 4:
                ogVar = og.USER_SELECTED_REPORT_MANUALLY;
                break;
            case 5:
                ogVar = og.USER_EXPANDED_MENU;
                break;
            case 6:
                ogVar = og.USER_DISMISSED;
                break;
            case 7:
                ogVar = og.NO_RESPONSE_FROM_SERVER;
                break;
            case 8:
                ogVar = og.SPEECH_TO_TEXT_FAILURE;
                break;
            case 9:
                ogVar = og.TEXT_TO_SPEECH_FAILURE;
                break;
            case 10:
                ogVar = og.NO_SPEECH_RECOGNIZED;
                break;
            case 11:
                ogVar = og.SOUND_MUTED;
                break;
            case 12:
                ogVar = og.PERMISSION_DENIED;
                break;
            case 13:
                ogVar = og.RECORDING_INPUT_BUSY;
                break;
            case 14:
                ogVar = og.MAX_LIMIT_MESSAGES;
                break;
            case 15:
                ogVar = og.EMPTY_TEXT_FAILURE;
                break;
            default:
                ogVar = null;
                break;
        }
        return ogVar == null ? og.UNRECOGNIZED : ogVar;
    }

    public int getFailureReasonValue() {
        if (this.resultCase_ == 5) {
            return ((Integer) this.result_).intValue();
        }
        return 0;
    }

    public os getMode() {
        os osVarA = os.a(this.mode_);
        return osVarA == null ? os.UNRECOGNIZED : osVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public oh getResultCase() {
        int i2 = this.resultCase_;
        if (i2 == 0) {
            return oh.f55184d;
        }
        if (i2 == 4) {
            return oh.f55181a;
        }
        if (i2 == 5) {
            return oh.f55182b;
        }
        if (i2 != 6) {
            return null;
        }
        return oh.f55183c;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public boolean hasAlertInfo() {
        return this.resultCase_ == 4;
    }

    @Deprecated
    public boolean hasBackendCancel() {
        return this.resultCase_ == 6;
    }

    public boolean hasConversationId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFailedToInitiateConversation() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFailureReason() {
        return this.resultCase_ == 5;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 2) != 0;
    }

    public static of newBuilder(oi oiVar) {
        return (of) DEFAULT_INSTANCE.createBuilder(oiVar);
    }

    public static oi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oi parseFrom(com.google.v.z zVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oi parseFrom(InputStream inputStream) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oi parseFrom(ByteBuffer byteBuffer) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oi parseFrom(byte[] bArr) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

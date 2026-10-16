package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mi extends com.google.v.du<mi, mg> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final mi DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int ERROR_REASON_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<mi> PARSER;
    private int bitField0_;
    private mp conversationInfo_;
    private String errorMessage_ = "";
    private int errorReason_;

    static {
        mi miVar = new mi();
        DEFAULT_INSTANCE = miVar;
        com.google.v.du.registerDefaultInstance(mi.class, miVar);
    }

    private mi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.bitField0_ &= -3;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorReason() {
        this.errorReason_ = 0;
    }

    public static mi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        mp mpVar2 = this.conversationInfo_;
        if (mpVar2 != null && mpVar2 != mp.getDefaultInstance()) {
            mn mnVarNewBuilder = mp.newBuilder(mpVar2);
            mnVarNewBuilder.mergeFrom((mn) mpVar);
            mpVar = mnVarNewBuilder.buildPartial();
        }
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    public static mg newBuilder() {
        return (mg) DEFAULT_INSTANCE.createBuilder();
    }

    public static mi parseDelimitedFrom(InputStream inputStream) {
        return (mi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mi parseFrom(com.google.v.v vVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorMessage_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorReason(mh mhVar) {
        this.errorReason_ = mhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorReasonValue(int i2) {
        this.errorReason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ለ\u0001", new Object[]{"bitField0_", "conversationInfo_", "errorReason_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new mi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public mp getConversationInfo() {
        mp mpVar = this.conversationInfo_;
        return mpVar == null ? mp.getDefaultInstance() : mpVar;
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public com.google.v.v getErrorMessageBytes() {
        return com.google.v.v.s(this.errorMessage_);
    }

    public mh getErrorReason() {
        mh mhVar;
        switch (this.errorReason_) {
            case 0:
                mhVar = mh.ERROR_REASON_UNSPECIFIED;
                break;
            case 1:
                mhVar = mh.AGENT_ERROR;
                break;
            case 2:
                mhVar = mh.RECORDER_ERROR;
                break;
            case 3:
                mhVar = mh.AUDIO_SESSION_ERROR;
                break;
            case 4:
                mhVar = mh.SOUND_MUTED;
                break;
            case 5:
                mhVar = mh.UNKNOWN_ERROR;
                break;
            case 6:
                mhVar = mh.AUDIO_SESSION_START_ERROR;
                break;
            case 7:
                mhVar = mh.AUDIO_SESSION_RECOVER_ERROR;
                break;
            case 8:
                mhVar = mh.LOST_AUDIO_FOCUS;
                break;
            case 9:
                mhVar = mh.AUDIO_PLAYER_ERROR;
                break;
            default:
                mhVar = null;
                break;
        }
        return mhVar == null ? mh.UNRECOGNIZED : mhVar;
    }

    public int getErrorReasonValue() {
        return this.errorReason_;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 2) != 0;
    }

    public static mg newBuilder(mi miVar) {
        return (mg) DEFAULT_INSTANCE.createBuilder(miVar);
    }

    public static mi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mi parseFrom(com.google.v.z zVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mi parseFrom(InputStream inputStream) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mi parseFrom(ByteBuffer byteBuffer) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mi parseFrom(byte[] bArr) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

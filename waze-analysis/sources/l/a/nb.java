package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class nb extends com.google.v.du<nb, mz> implements com.google.v.fj {
    public static final int AUDIO_FIELD_NUMBER = 2;
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 6;
    private static final nb DEFAULT_INSTANCE;
    public static final int END_CONVERSATION_FIELD_NUMBER = 3;
    public static final int FUNCTION_CALL_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<nb> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 4;
    private int bitField0_;
    private mp conversationInfo_;
    private int responseCase_ = 0;
    private Object response_;

    static {
        nb nbVar = new nb();
        DEFAULT_INSTANCE = nbVar;
        com.google.v.du.registerDefaultInstance(nb.class, nbVar);
    }

    private nb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        if (this.responseCase_ == 2) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        if (this.responseCase_ == 6) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndConversation() {
        if (this.responseCase_ == 3) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionCall() {
        if (this.responseCase_ == 5) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        if (this.responseCase_ == 4) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    public static nb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(fx fxVar) {
        Objects.requireNonNull(fxVar);
        if (this.responseCase_ == 2 && this.response_ != fx.getDefaultInstance()) {
            fw fwVarNewBuilder = fx.newBuilder((fx) this.response_);
            fwVarNewBuilder.mergeFrom((fw) fxVar);
            fxVar = fwVarNewBuilder.buildPartial();
        }
        this.response_ = fxVar;
        this.responseCase_ = 2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndConversation(uw uwVar) {
        Objects.requireNonNull(uwVar);
        if (this.responseCase_ == 3 && this.response_ != uw.getDefaultInstance()) {
            uv uvVarNewBuilder = uw.newBuilder((uw) this.response_);
            uvVarNewBuilder.mergeFrom((uv) uwVar);
            uwVar = uvVarNewBuilder.buildPartial();
        }
        this.response_ = uwVar;
        this.responseCase_ = 3;
    }

    public static mz newBuilder() {
        return (mz) DEFAULT_INSTANCE.createBuilder();
    }

    public static nb parseDelimitedFrom(InputStream inputStream) {
        return (nb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nb parseFrom(com.google.v.v vVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(fx fxVar) {
        Objects.requireNonNull(fxVar);
        this.response_ = fxVar;
        this.responseCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(String str) {
        Objects.requireNonNull(str);
        this.responseCase_ = 6;
        this.response_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.response_ = vVar.u();
        this.responseCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndConversation(uw uwVar) {
        Objects.requireNonNull(uwVar);
        this.response_ = uwVar;
        this.responseCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionCall(md mdVar) {
        this.response_ = Integer.valueOf(mdVar.getNumber());
        this.responseCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionCallValue(int i2) {
        this.responseCase_ = 5;
        this.response_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.responseCase_ = 4;
        this.response_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.response_ = vVar.u();
        this.responseCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004Ȼ\u0000\u0005?\u0000\u0006Ȼ\u0000", new Object[]{"response_", "responseCase_", "bitField0_", "conversationInfo_", fx.class, uw.class});
        }
        if (iOrdinal == 3) {
            return new nb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fx getAudio() {
        return this.responseCase_ == 2 ? (fx) this.response_ : fx.getDefaultInstance();
    }

    public mp getConversationInfo() {
        mp mpVar = this.conversationInfo_;
        return mpVar == null ? mp.getDefaultInstance() : mpVar;
    }

    public String getData() {
        return this.responseCase_ == 6 ? (String) this.response_ : "";
    }

    public com.google.v.v getDataBytes() {
        return com.google.v.v.s(this.responseCase_ == 6 ? (String) this.response_ : "");
    }

    public uw getEndConversation() {
        return this.responseCase_ == 3 ? (uw) this.response_ : uw.getDefaultInstance();
    }

    public md getFunctionCall() {
        if (this.responseCase_ != 5) {
            return md.CONVERSATION_CLIENT_FUNCTION_UNSPECIFIED;
        }
        md mdVarA = md.a(((Integer) this.response_).intValue());
        return mdVarA == null ? md.UNRECOGNIZED : mdVarA;
    }

    public int getFunctionCallValue() {
        if (this.responseCase_ == 5) {
            return ((Integer) this.response_).intValue();
        }
        return 0;
    }

    public na getResponseCase() {
        int i2 = this.responseCase_;
        if (i2 == 0) {
            return na.f55129f;
        }
        if (i2 == 2) {
            return na.f55124a;
        }
        if (i2 == 3) {
            return na.f55125b;
        }
        if (i2 == 4) {
            return na.f55126c;
        }
        if (i2 == 5) {
            return na.f55127d;
        }
        if (i2 != 6) {
            return null;
        }
        return na.f55128e;
    }

    public String getText() {
        return this.responseCase_ == 4 ? (String) this.response_ : "";
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.responseCase_ == 4 ? (String) this.response_ : "");
    }

    public boolean hasAudio() {
        return this.responseCase_ == 2;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasData() {
        return this.responseCase_ == 6;
    }

    public boolean hasEndConversation() {
        return this.responseCase_ == 3;
    }

    public boolean hasFunctionCall() {
        return this.responseCase_ == 5;
    }

    public boolean hasText() {
        return this.responseCase_ == 4;
    }

    public static mz newBuilder(nb nbVar) {
        return (mz) DEFAULT_INSTANCE.createBuilder(nbVar);
    }

    public static nb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nb parseFrom(com.google.v.z zVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nb parseFrom(InputStream inputStream) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nb parseFrom(ByteBuffer byteBuffer) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nb parseFrom(byte[] bArr) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

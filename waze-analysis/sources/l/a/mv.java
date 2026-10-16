package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mv extends com.google.v.du<mv, mt> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final mv DEFAULT_INSTANCE;
    public static final int FUNCTION_RESPONSE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<mv> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private mp conversationInfo_;
    private int functionResponse_;
    private int responseType_;

    static {
        mv mvVar = new mv();
        DEFAULT_INSTANCE = mvVar;
        com.google.v.du.registerDefaultInstance(mv.class, mvVar);
    }

    private mv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionResponse() {
        this.bitField0_ &= -3;
        this.functionResponse_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseType() {
        this.responseType_ = 0;
    }

    public static mv getDefaultInstance() {
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

    public static mt newBuilder() {
        return (mt) DEFAULT_INSTANCE.createBuilder();
    }

    public static mv parseDelimitedFrom(InputStream inputStream) {
        return (mv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mv parseFrom(com.google.v.v vVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionResponse(md mdVar) {
        this.functionResponse_ = mdVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionResponseValue(int i2) {
        this.bitField0_ |= 2;
        this.functionResponse_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseType(mu muVar) {
        this.responseType_ = muVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeValue(int i2) {
        this.responseType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဌ\u0001", new Object[]{"bitField0_", "conversationInfo_", "responseType_", "functionResponse_"});
        }
        if (iOrdinal == 3) {
            return new mv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mv.class) {
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

    public md getFunctionResponse() {
        md mdVarA = md.a(this.functionResponse_);
        return mdVarA == null ? md.UNRECOGNIZED : mdVarA;
    }

    public int getFunctionResponseValue() {
        return this.functionResponse_;
    }

    public mu getResponseType() {
        int i2 = this.responseType_;
        mu muVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : mu.FIRST_TIME_EXPERIENCE : mu.FUNCTION_RESPONSE : mu.AUDIO : mu.RESPONSE_TYPE_UNSPECIFIED;
        return muVar == null ? mu.UNRECOGNIZED : muVar;
    }

    public int getResponseTypeValue() {
        return this.responseType_;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFunctionResponse() {
        return (this.bitField0_ & 2) != 0;
    }

    public static mt newBuilder(mv mvVar) {
        return (mt) DEFAULT_INSTANCE.createBuilder(mvVar);
    }

    public static mv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mv parseFrom(com.google.v.z zVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mv parseFrom(InputStream inputStream) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mv parseFrom(ByteBuffer byteBuffer) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mv parseFrom(byte[] bArr) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

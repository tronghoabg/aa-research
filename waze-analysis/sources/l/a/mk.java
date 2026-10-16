package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mk extends com.google.v.du<mk, mj> implements com.google.v.fj {
    public static final int CLIENT_FUNCTION_FIELD_NUMBER = 2;
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final mk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<mk> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int clientFunction_;
    private mp conversationInfo_;
    private boolean success_;

    static {
        mk mkVar = new mk();
        DEFAULT_INSTANCE = mkVar;
        com.google.v.du.registerDefaultInstance(mk.class, mkVar);
    }

    private mk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientFunction() {
        this.clientFunction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -3;
        this.success_ = false;
    }

    public static mk getDefaultInstance() {
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

    public static mj newBuilder() {
        return (mj) DEFAULT_INSTANCE.createBuilder();
    }

    public static mk parseDelimitedFrom(InputStream inputStream) {
        return (mk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mk parseFrom(com.google.v.v vVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientFunction(md mdVar) {
        this.clientFunction_ = mdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientFunctionValue(int i2) {
        this.clientFunction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 2;
        this.success_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဇ\u0001", new Object[]{"bitField0_", "conversationInfo_", "clientFunction_", "success_"});
        }
        if (iOrdinal == 3) {
            return new mk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public md getClientFunction() {
        md mdVarA = md.a(this.clientFunction_);
        return mdVarA == null ? md.UNRECOGNIZED : mdVarA;
    }

    public int getClientFunctionValue() {
        return this.clientFunction_;
    }

    public mp getConversationInfo() {
        mp mpVar = this.conversationInfo_;
        return mpVar == null ? mp.getDefaultInstance() : mpVar;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 2) != 0;
    }

    public static mj newBuilder(mk mkVar) {
        return (mj) DEFAULT_INSTANCE.createBuilder(mkVar);
    }

    public static mk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mk parseFrom(com.google.v.z zVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mk parseFrom(InputStream inputStream) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mk parseFrom(ByteBuffer byteBuffer) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mk parseFrom(byte[] bArr) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

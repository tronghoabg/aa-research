package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mm extends com.google.v.du<mm, ml> implements com.google.v.fj {
    public static final int CLIENT_FUNCTION_FIELD_NUMBER = 2;
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final mm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<mm> PARSER;
    private int bitField0_;
    private int clientFunction_;
    private mp conversationInfo_;

    static {
        mm mmVar = new mm();
        DEFAULT_INSTANCE = mmVar;
        com.google.v.du.registerDefaultInstance(mm.class, mmVar);
    }

    private mm() {
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

    public static mm getDefaultInstance() {
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

    public static ml newBuilder() {
        return (ml) DEFAULT_INSTANCE.createBuilder();
    }

    public static mm parseDelimitedFrom(InputStream inputStream) {
        return (mm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mm parseFrom(com.google.v.v vVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mm> parser() {
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "conversationInfo_", "clientFunction_"});
        }
        if (iOrdinal == 3) {
            return new mm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ml(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mm.class) {
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

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ml newBuilder(mm mmVar) {
        return (ml) DEFAULT_INSTANCE.createBuilder(mmVar);
    }

    public static mm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mm parseFrom(com.google.v.z zVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mm parseFrom(InputStream inputStream) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mm parseFrom(ByteBuffer byteBuffer) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mm parseFrom(byte[] bArr) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class nl extends com.google.v.du<nl, nk> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final nl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nl> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private mp conversationInfo_;
    private boolean success_;

    static {
        nl nlVar = new nl();
        DEFAULT_INSTANCE = nlVar;
        com.google.v.du.registerDefaultInstance(nl.class, nlVar);
    }

    private nl() {
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

    public static nl getDefaultInstance() {
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

    public static nk newBuilder() {
        return (nk) DEFAULT_INSTANCE.createBuilder();
    }

    public static nl parseDelimitedFrom(InputStream inputStream) {
        return (nl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nl parseFrom(com.google.v.v vVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "conversationInfo_", "success_"});
        }
        if (iOrdinal == 3) {
            return new nl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nl.class) {
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

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 2) != 0;
    }

    public static nk newBuilder(nl nlVar) {
        return (nk) DEFAULT_INSTANCE.createBuilder(nlVar);
    }

    public static nl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nl parseFrom(com.google.v.z zVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nl parseFrom(InputStream inputStream) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nl parseFrom(ByteBuffer byteBuffer) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nl parseFrom(byte[] bArr) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mf extends com.google.v.du<mf, me> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final mf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<mf> PARSER;
    private int bitField0_;
    private mp conversationInfo_;

    static {
        mf mfVar = new mf();
        DEFAULT_INSTANCE = mfVar;
        com.google.v.du.registerDefaultInstance(mf.class, mfVar);
    }

    private mf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static mf getDefaultInstance() {
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

    public static me newBuilder() {
        return (me) DEFAULT_INSTANCE.createBuilder();
    }

    public static mf parseDelimitedFrom(InputStream inputStream) {
        return (mf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mf parseFrom(com.google.v.v vVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "conversationInfo_"});
        }
        if (iOrdinal == 3) {
            return new mf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new me(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mf.class) {
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

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static me newBuilder(mf mfVar) {
        return (me) DEFAULT_INSTANCE.createBuilder(mfVar);
    }

    public static mf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mf parseFrom(com.google.v.z zVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mf parseFrom(InputStream inputStream) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mf parseFrom(ByteBuffer byteBuffer) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mf parseFrom(byte[] bArr) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

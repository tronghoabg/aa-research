package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class nj extends com.google.v.du<nj, ni> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final nj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nj> PARSER;
    private int bitField0_;
    private mp conversationInfo_;

    static {
        nj njVar = new nj();
        DEFAULT_INSTANCE = njVar;
        com.google.v.du.registerDefaultInstance(nj.class, njVar);
    }

    private nj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static nj getDefaultInstance() {
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

    public static ni newBuilder() {
        return (ni) DEFAULT_INSTANCE.createBuilder();
    }

    public static nj parseDelimitedFrom(InputStream inputStream) {
        return (nj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nj parseFrom(com.google.v.v vVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nj> parser() {
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
            return new nj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ni(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nj.class) {
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

    public static ni newBuilder(nj njVar) {
        return (ni) DEFAULT_INSTANCE.createBuilder(njVar);
    }

    public static nj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nj parseFrom(com.google.v.z zVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nj parseFrom(InputStream inputStream) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nj parseFrom(ByteBuffer byteBuffer) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nj parseFrom(byte[] bArr) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ms extends com.google.v.du<ms, mq> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final ms DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ms> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private mp conversationInfo_;
    private int reason_;

    static {
        ms msVar = new ms();
        DEFAULT_INSTANCE = msVar;
        com.google.v.du.registerDefaultInstance(ms.class, msVar);
    }

    private ms() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static ms getDefaultInstance() {
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

    public static mq newBuilder() {
        return (mq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ms parseDelimitedFrom(InputStream inputStream) {
        return (ms) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ms parseFrom(com.google.v.v vVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ms> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(mr mrVar) {
        this.reason_ = mrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "conversationInfo_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new ms();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ms> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ms.class) {
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

    @Deprecated
    public mr getReason() {
        int i2 = this.reason_;
        mr mrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : mr.INTERRUPTED_BY_CLIENT : mr.INTERRUPTED_BY_USER : mr.INTERRUPTION_REASON_UNSPECIFIED;
        return mrVar == null ? mr.UNRECOGNIZED : mrVar;
    }

    @Deprecated
    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mq newBuilder(ms msVar) {
        return (mq) DEFAULT_INSTANCE.createBuilder(msVar);
    }

    public static ms parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ms) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ms parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ms parseFrom(com.google.v.z zVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ms parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ms parseFrom(InputStream inputStream) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ms parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ms parseFrom(ByteBuffer byteBuffer) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ms parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ms parseFrom(byte[] bArr) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ms parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

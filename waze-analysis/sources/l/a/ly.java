package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ly extends com.google.v.du<ly, lx> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final ly DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ly> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private mp conversationInfo_;
    private boolean success_;

    static {
        ly lyVar = new ly();
        DEFAULT_INSTANCE = lyVar;
        com.google.v.du.registerDefaultInstance(ly.class, lyVar);
    }

    private ly() {
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

    public static ly getDefaultInstance() {
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

    public static lx newBuilder() {
        return (lx) DEFAULT_INSTANCE.createBuilder();
    }

    public static ly parseDelimitedFrom(InputStream inputStream) {
        return (ly) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ly parseFrom(com.google.v.v vVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ly> parser() {
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
            return new ly();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ly> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ly.class) {
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

    public static lx newBuilder(ly lyVar) {
        return (lx) DEFAULT_INSTANCE.createBuilder(lyVar);
    }

    public static ly parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ly) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ly parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ly parseFrom(com.google.v.z zVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ly parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ly parseFrom(InputStream inputStream) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ly parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ly parseFrom(ByteBuffer byteBuffer) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ly parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ly parseFrom(byte[] bArr) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ly parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

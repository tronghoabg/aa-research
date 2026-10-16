package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class my extends com.google.v.du<my, mx> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 2;
    private static final my DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<my> PARSER;
    private int action_;
    private int bitField0_;
    private mp conversationInfo_;

    static {
        my myVar = new my();
        DEFAULT_INSTANCE = myVar;
        com.google.v.du.registerDefaultInstance(my.class, myVar);
    }

    private my() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static my getDefaultInstance() {
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

    public static mx newBuilder() {
        return (mx) DEFAULT_INSTANCE.createBuilder();
    }

    public static my parseDelimitedFrom(InputStream inputStream) {
        return (my) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static my parseFrom(com.google.v.v vVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<my> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(mw mwVar) {
        this.action_ = mwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "action_", "conversationInfo_"});
        }
        if (iOrdinal == 3) {
            return new my();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<my> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (my.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public mw getAction() {
        int i2 = this.action_;
        mw mwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : mw.DISLIKE : mw.LIKE : mw.ACTION_UNSPECIFIED;
        return mwVar == null ? mw.UNRECOGNIZED : mwVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public mp getConversationInfo() {
        mp mpVar = this.conversationInfo_;
        return mpVar == null ? mp.getDefaultInstance() : mpVar;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mx newBuilder(my myVar) {
        return (mx) DEFAULT_INSTANCE.createBuilder(myVar);
    }

    public static my parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (my) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static my parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static my parseFrom(com.google.v.z zVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static my parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static my parseFrom(InputStream inputStream) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static my parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static my parseFrom(ByteBuffer byteBuffer) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static my parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static my parseFrom(byte[] bArr) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static my parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

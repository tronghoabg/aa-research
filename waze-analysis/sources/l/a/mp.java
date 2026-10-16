package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mp extends com.google.v.du<mp, mn> implements com.google.v.fj {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final mp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<mp> PARSER = null;
    public static final int SERVICE_FIELD_NUMBER = 1;
    private String conversationId_ = "";
    private int service_;

    static {
        mp mpVar = new mp();
        DEFAULT_INSTANCE = mpVar;
        com.google.v.du.registerDefaultInstance(mp.class, mpVar);
    }

    private mp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearService() {
        this.service_ = 0;
    }

    public static mp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static mn newBuilder() {
        return (mn) DEFAULT_INSTANCE.createBuilder();
    }

    public static mp parseDelimitedFrom(InputStream inputStream) {
        return (mp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mp parseFrom(com.google.v.v vVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.conversationId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setService(mo moVar) {
        this.service_ = moVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceValue(int i2) {
        this.service_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"service_", "conversationId_"});
        }
        if (iOrdinal == 3) {
            return new mp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConversationId() {
        return this.conversationId_;
    }

    public com.google.v.v getConversationIdBytes() {
        return com.google.v.v.s(this.conversationId_);
    }

    public mo getService() {
        int i2 = this.service_;
        mo moVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : mo.SEARCH_AGENT : mo.COMPANINIO : mo.REPORTING : mo.SERVICE_NAME_UNSPECIFIED;
        return moVar == null ? mo.UNRECOGNIZED : moVar;
    }

    public int getServiceValue() {
        return this.service_;
    }

    public static mn newBuilder(mp mpVar) {
        return (mn) DEFAULT_INSTANCE.createBuilder(mpVar);
    }

    public static mp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mp parseFrom(com.google.v.z zVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mp parseFrom(InputStream inputStream) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mp parseFrom(ByteBuffer byteBuffer) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mp parseFrom(byte[] bArr) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

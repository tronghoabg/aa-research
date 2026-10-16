package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class or extends com.google.v.du<or, oq> implements com.google.v.fj {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final or DEFAULT_INSTANCE;
    public static final int LANGUAGE_LOCALE_FIELD_NUMBER = 7;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    public static final int MESSAGE_NUMBER_FIELD_NUMBER = 4;
    public static final int MODE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<or> PARSER = null;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 1;
    public static final int USER_GENDER_FIELD_NUMBER = 6;
    private int bitField0_;
    private long messageNumber_;
    private int mode_;
    private int userGender_;
    private String ugcContextId_ = "";
    private String conversationId_ = "";
    private String message_ = "";
    private String languageLocale_ = "";

    static {
        or orVar = new or();
        DEFAULT_INSTANCE = orVar;
        com.google.v.du.registerDefaultInstance(or.class, orVar);
    }

    private or() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.bitField0_ &= -2;
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageLocale() {
        this.languageLocale_ = getDefaultInstance().getLanguageLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageNumber() {
        this.bitField0_ &= -3;
        this.messageNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGender() {
        this.userGender_ = 0;
    }

    public static or getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oq newBuilder() {
        return (oq) DEFAULT_INSTANCE.createBuilder();
    }

    public static or parseDelimitedFrom(InputStream inputStream) {
        return (or) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static or parseFrom(com.google.v.v vVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<or> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.conversationId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageLocale(String str) {
        Objects.requireNonNull(str);
        this.languageLocale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageLocaleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.languageLocale_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.message_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageNumber(long j2) {
        this.bitField0_ |= 2;
        this.messageNumber_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(os osVar) {
        this.mode_ = osVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGender(yk ykVar) {
        this.userGender_ = ykVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGenderValue(int i2) {
        this.userGender_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004ဂ\u0001\u0005\f\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "ugcContextId_", "conversationId_", "message_", "messageNumber_", "mode_", "userGender_", "languageLocale_"});
        }
        if (iOrdinal == 3) {
            return new or();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<or> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (or.class) {
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

    public String getLanguageLocale() {
        return this.languageLocale_;
    }

    public com.google.v.v getLanguageLocaleBytes() {
        return com.google.v.v.s(this.languageLocale_);
    }

    public String getMessage() {
        return this.message_;
    }

    public com.google.v.v getMessageBytes() {
        return com.google.v.v.s(this.message_);
    }

    public long getMessageNumber() {
        return this.messageNumber_;
    }

    public os getMode() {
        os osVarA = os.a(this.mode_);
        return osVarA == null ? os.UNRECOGNIZED : osVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public yk getUserGender() {
        yk ykVarA = yk.a(this.userGender_);
        return ykVarA == null ? yk.UNRECOGNIZED : ykVarA;
    }

    public int getUserGenderValue() {
        return this.userGender_;
    }

    public boolean hasConversationId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMessageNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public static oq newBuilder(or orVar) {
        return (oq) DEFAULT_INSTANCE.createBuilder(orVar);
    }

    public static or parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (or) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static or parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static or parseFrom(com.google.v.z zVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static or parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static or parseFrom(InputStream inputStream) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static or parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static or parseFrom(ByteBuffer byteBuffer) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static or parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static or parseFrom(byte[] bArr) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static or parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

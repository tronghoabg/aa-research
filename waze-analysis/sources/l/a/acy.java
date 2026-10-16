package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acy extends com.google.v.du<acy, acx> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final acy DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    public static final int MESSAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<acy> PARSER;
    private int action_;
    private String messageTitle_ = "";
    private String messageId_ = "";

    static {
        acy acyVar = new acy();
        DEFAULT_INSTANCE = acyVar;
        com.google.v.du.registerDefaultInstance(acy.class, acyVar);
    }

    private acy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageTitle() {
        this.messageTitle_ = getDefaultInstance().getMessageTitle();
    }

    public static acy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acx newBuilder() {
        return (acx) DEFAULT_INSTANCE.createBuilder();
    }

    public static acy parseDelimitedFrom(InputStream inputStream) {
        return (acy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acy parseFrom(com.google.v.v vVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<acy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(acw acwVar) {
        this.action_ = acwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        Objects.requireNonNull(str);
        this.messageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.messageId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageTitle(String str) {
        Objects.requireNonNull(str);
        this.messageTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageTitleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.messageTitle_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"messageTitle_", "action_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new acy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<acy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (acy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public acw getAction() {
        acw acwVar;
        switch (this.action_) {
            case 0:
                acwVar = acw.ACTION_UNSPECIFIED;
                break;
            case 1:
                acwVar = acw.CLOSE;
                break;
            case 2:
                acwVar = acw.BACK;
                break;
            case 3:
                acwVar = acw.MESSAGE;
                break;
            case 4:
                acwVar = acw.CHAT;
                break;
            case 5:
                acwVar = acw.DELETE;
                break;
            case 6:
                acwVar = acw.DELETE_ALL;
                break;
            case 7:
                acwVar = acw.READ;
                break;
            case 8:
                acwVar = acw.READ_ALL;
                break;
            case 9:
                acwVar = acw.SELECT;
                break;
            case 10:
                acwVar = acw.SELECT_ALL;
                break;
            case 11:
                acwVar = acw.SELECT_NONE;
                break;
            default:
                acwVar = null;
                break;
        }
        return acwVar == null ? acw.UNRECOGNIZED : acwVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getMessageId() {
        return this.messageId_;
    }

    public com.google.v.v getMessageIdBytes() {
        return com.google.v.v.s(this.messageId_);
    }

    public String getMessageTitle() {
        return this.messageTitle_;
    }

    public com.google.v.v getMessageTitleBytes() {
        return com.google.v.v.s(this.messageTitle_);
    }

    public static acx newBuilder(acy acyVar) {
        return (acx) DEFAULT_INSTANCE.createBuilder(acyVar);
    }

    public static acy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static acy parseFrom(com.google.v.z zVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static acy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static acy parseFrom(InputStream inputStream) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acy parseFrom(ByteBuffer byteBuffer) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static acy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static acy parseFrom(byte[] bArr) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static acy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (acy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

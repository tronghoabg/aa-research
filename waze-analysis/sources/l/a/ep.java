package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ep extends com.google.v.du<ep, eo> implements eq {
    private static final ep DEFAULT_INSTANCE;
    public static final int FILE_URI_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ep> PARSER = null;
    public static final int PROMPT_TYPE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String fileUri_ = "";
    private String promptType_ = "";

    static {
        ep epVar = new ep();
        DEFAULT_INSTANCE = epVar;
        com.google.v.du.registerDefaultInstance(ep.class, epVar);
    }

    private ep() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileUri() {
        this.fileUri_ = getDefaultInstance().getFileUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptType() {
        this.promptType_ = getDefaultInstance().getPromptType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static ep getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eo newBuilder() {
        return (eo) DEFAULT_INSTANCE.createBuilder();
    }

    public static ep parseDelimitedFrom(InputStream inputStream) {
        return (ep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ep parseFrom(com.google.v.v vVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ep> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileUri(String str) {
        Objects.requireNonNull(str);
        this.fileUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileUriBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.fileUri_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptType(String str) {
        Objects.requireNonNull(str);
        this.promptType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.promptType_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.text_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "fileUri_", "promptType_"});
        }
        if (iOrdinal == 3) {
            return new ep();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ep> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ep.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFileUri() {
        return this.fileUri_;
    }

    public com.google.v.v getFileUriBytes() {
        return com.google.v.v.s(this.fileUri_);
    }

    public String getPromptType() {
        return this.promptType_;
    }

    public com.google.v.v getPromptTypeBytes() {
        return com.google.v.v.s(this.promptType_);
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public static eo newBuilder(ep epVar) {
        return (eo) DEFAULT_INSTANCE.createBuilder(epVar);
    }

    public static ep parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ep parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ep parseFrom(com.google.v.z zVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ep parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ep parseFrom(InputStream inputStream) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ep parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ep parseFrom(ByteBuffer byteBuffer) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ep parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ep parseFrom(byte[] bArr) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ep parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

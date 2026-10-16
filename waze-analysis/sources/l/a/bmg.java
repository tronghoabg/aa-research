package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmg extends com.google.v.du<bmg, bme> implements com.google.v.fj {
    private static final bmg DEFAULT_INSTANCE;
    public static final int DOWNLOAD_REQUEST_RESULT_FIELD_NUMBER = 3;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int PARSED_TEXT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bmg> PARSER = null;
    public static final int URL_FIELD_NUMBER = 5;
    public static final int VOICE_ID_FIELD_NUMBER = 2;
    private int downloadRequestResult_;
    private String parsedText_ = "";
    private String voiceId_ = "";
    private String errorDescription_ = "";
    private String url_ = "";

    static {
        bmg bmgVar = new bmg();
        DEFAULT_INSTANCE = bmgVar;
        com.google.v.du.registerDefaultInstance(bmg.class, bmgVar);
    }

    private bmg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadRequestResult() {
        this.downloadRequestResult_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorDescription() {
        this.errorDescription_ = getDefaultInstance().getErrorDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParsedText() {
        this.parsedText_ = getDefaultInstance().getParsedText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = getDefaultInstance().getVoiceId();
    }

    public static bmg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bme newBuilder() {
        return (bme) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmg parseDelimitedFrom(InputStream inputStream) {
        return (bmg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmg parseFrom(com.google.v.v vVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadRequestResult(bmf bmfVar) {
        this.downloadRequestResult_ = bmfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadRequestResultValue(int i2) {
        this.downloadRequestResult_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDescription(String str) {
        Objects.requireNonNull(str);
        this.errorDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDescriptionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorDescription_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParsedText(String str) {
        Objects.requireNonNull(str);
        this.parsedText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParsedTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.parsedText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceId(String str) {
        Objects.requireNonNull(str);
        this.voiceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.voiceId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ", new Object[]{"parsedText_", "voiceId_", "downloadRequestResult_", "errorDescription_", "url_"});
        }
        if (iOrdinal == 3) {
            return new bmg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bme(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bmf getDownloadRequestResult() {
        int i2 = this.downloadRequestResult_;
        bmf bmfVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bmf.DOWNLOAD_ERROR : bmf.VOICES_SERVER_ERROR : bmf.SUCCESS : bmf.TTS_DOWNLOAD_REQUEST_RESULT_UNSPECIFIED;
        return bmfVar == null ? bmf.UNRECOGNIZED : bmfVar;
    }

    public int getDownloadRequestResultValue() {
        return this.downloadRequestResult_;
    }

    public String getErrorDescription() {
        return this.errorDescription_;
    }

    public com.google.v.v getErrorDescriptionBytes() {
        return com.google.v.v.s(this.errorDescription_);
    }

    public String getParsedText() {
        return this.parsedText_;
    }

    public com.google.v.v getParsedTextBytes() {
        return com.google.v.v.s(this.parsedText_);
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public String getVoiceId() {
        return this.voiceId_;
    }

    public com.google.v.v getVoiceIdBytes() {
        return com.google.v.v.s(this.voiceId_);
    }

    public static bme newBuilder(bmg bmgVar) {
        return (bme) DEFAULT_INSTANCE.createBuilder(bmgVar);
    }

    public static bmg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmg parseFrom(com.google.v.z zVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmg parseFrom(InputStream inputStream) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmg parseFrom(ByteBuffer byteBuffer) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmg parseFrom(byte[] bArr) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

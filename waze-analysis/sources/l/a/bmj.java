package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmj extends com.google.v.du<bmj, bmh> implements com.google.v.fj {
    private static final bmj DEFAULT_INSTANCE;
    public static final int PARSED_TEXT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bmj> PARSER = null;
    public static final int TTS_SOURCE_FIELD_NUMBER = 3;
    public static final int VOICE_ID_FIELD_NUMBER = 2;
    private int ttsSource_;
    private String parsedText_ = "";
    private String voiceId_ = "";

    static {
        bmj bmjVar = new bmj();
        DEFAULT_INSTANCE = bmjVar;
        com.google.v.du.registerDefaultInstance(bmj.class, bmjVar);
    }

    private bmj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParsedText() {
        this.parsedText_ = getDefaultInstance().getParsedText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsSource() {
        this.ttsSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = getDefaultInstance().getVoiceId();
    }

    public static bmj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bmh newBuilder() {
        return (bmh) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmj parseDelimitedFrom(InputStream inputStream) {
        return (bmj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmj parseFrom(com.google.v.v vVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setTtsSource(bmi bmiVar) {
        this.ttsSource_ = bmiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsSourceValue(int i2) {
        this.ttsSource_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"parsedText_", "voiceId_", "ttsSource_"});
        }
        if (iOrdinal == 3) {
            return new bmj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getParsedText() {
        return this.parsedText_;
    }

    public com.google.v.v getParsedTextBytes() {
        return com.google.v.v.s(this.parsedText_);
    }

    public bmi getTtsSource() {
        int i2 = this.ttsSource_;
        bmi bmiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bmi.DOWNLOAD : bmi.CACHE : bmi.TTS_SOURCE_UNSPECIFIED;
        return bmiVar == null ? bmi.UNRECOGNIZED : bmiVar;
    }

    public int getTtsSourceValue() {
        return this.ttsSource_;
    }

    public String getVoiceId() {
        return this.voiceId_;
    }

    public com.google.v.v getVoiceIdBytes() {
        return com.google.v.v.s(this.voiceId_);
    }

    public static bmh newBuilder(bmj bmjVar) {
        return (bmh) DEFAULT_INSTANCE.createBuilder(bmjVar);
    }

    public static bmj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmj parseFrom(com.google.v.z zVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmj parseFrom(InputStream inputStream) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmj parseFrom(ByteBuffer byteBuffer) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmj parseFrom(byte[] bArr) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

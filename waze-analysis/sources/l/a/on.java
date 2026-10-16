package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class on extends com.google.v.du<on, ol> implements com.google.v.fj {
    public static final int COMPONENT_TYPE_FIELD_NUMBER = 5;
    private static final on DEFAULT_INSTANCE;
    public static final int IS_TTS_LANGUAGE_SUPPORTED_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<on> PARSER = null;
    public static final int TTS_EXPECTED_LANGUAGE_FIELD_NUMBER = 3;
    public static final int WAZE_APP_LANGUAGE_FIELD_NUMBER = 1;
    public static final int WAZE_VOICE_GUIDANCE_LANGUAGE_FIELD_NUMBER = 2;
    private int componentType_;
    private boolean isTtsLanguageSupported_;
    private String wazeAppLanguage_ = "";
    private String wazeVoiceGuidanceLanguage_ = "";
    private String ttsExpectedLanguage_ = "";

    static {
        on onVar = new on();
        DEFAULT_INSTANCE = onVar;
        com.google.v.du.registerDefaultInstance(on.class, onVar);
    }

    private on() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComponentType() {
        this.componentType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTtsLanguageSupported() {
        this.isTtsLanguageSupported_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsExpectedLanguage() {
        this.ttsExpectedLanguage_ = getDefaultInstance().getTtsExpectedLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAppLanguage() {
        this.wazeAppLanguage_ = getDefaultInstance().getWazeAppLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeVoiceGuidanceLanguage() {
        this.wazeVoiceGuidanceLanguage_ = getDefaultInstance().getWazeVoiceGuidanceLanguage();
    }

    public static on getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ol newBuilder() {
        return (ol) DEFAULT_INSTANCE.createBuilder();
    }

    public static on parseDelimitedFrom(InputStream inputStream) {
        return (on) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static on parseFrom(com.google.v.v vVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<on> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponentType(om omVar) {
        this.componentType_ = omVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponentTypeValue(int i2) {
        this.componentType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTtsLanguageSupported(boolean z) {
        this.isTtsLanguageSupported_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsExpectedLanguage(String str) {
        Objects.requireNonNull(str);
        this.ttsExpectedLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsExpectedLanguageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ttsExpectedLanguage_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAppLanguage(String str) {
        Objects.requireNonNull(str);
        this.wazeAppLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAppLanguageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.wazeAppLanguage_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeVoiceGuidanceLanguage(String str) {
        Objects.requireNonNull(str);
        this.wazeVoiceGuidanceLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeVoiceGuidanceLanguageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.wazeVoiceGuidanceLanguage_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f", new Object[]{"wazeAppLanguage_", "wazeVoiceGuidanceLanguage_", "ttsExpectedLanguage_", "isTtsLanguageSupported_", "componentType_"});
        }
        if (iOrdinal == 3) {
            return new on();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ol(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<on> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (on.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public om getComponentType() {
        int i2 = this.componentType_;
        om omVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : om.TTS_COMPONENT : om.STT_COMPONENT : om.COMPONENT_TYPE_UNSPECIFIED;
        return omVar == null ? om.UNRECOGNIZED : omVar;
    }

    public int getComponentTypeValue() {
        return this.componentType_;
    }

    public boolean getIsTtsLanguageSupported() {
        return this.isTtsLanguageSupported_;
    }

    public String getTtsExpectedLanguage() {
        return this.ttsExpectedLanguage_;
    }

    public com.google.v.v getTtsExpectedLanguageBytes() {
        return com.google.v.v.s(this.ttsExpectedLanguage_);
    }

    public String getWazeAppLanguage() {
        return this.wazeAppLanguage_;
    }

    public com.google.v.v getWazeAppLanguageBytes() {
        return com.google.v.v.s(this.wazeAppLanguage_);
    }

    public String getWazeVoiceGuidanceLanguage() {
        return this.wazeVoiceGuidanceLanguage_;
    }

    public com.google.v.v getWazeVoiceGuidanceLanguageBytes() {
        return com.google.v.v.s(this.wazeVoiceGuidanceLanguage_);
    }

    public static ol newBuilder(on onVar) {
        return (ol) DEFAULT_INSTANCE.createBuilder(onVar);
    }

    public static on parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (on) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static on parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static on parseFrom(com.google.v.z zVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static on parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static on parseFrom(InputStream inputStream) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static on parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static on parseFrom(ByteBuffer byteBuffer) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static on parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static on parseFrom(byte[] bArr) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static on parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

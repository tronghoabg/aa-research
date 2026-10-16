package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pi extends com.google.v.du<pi, ph> implements com.google.v.fj {
    private static final pi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pi> PARSER = null;
    public static final int VOICE_ID_FIELD_NUMBER = 1;
    public static final int VOICE_NAME_FIELD_NUMBER = 2;
    private String voiceId_ = "";
    private String voiceName_ = "";

    static {
        pi piVar = new pi();
        DEFAULT_INSTANCE = piVar;
        com.google.v.du.registerDefaultInstance(pi.class, piVar);
    }

    private pi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = getDefaultInstance().getVoiceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceName() {
        this.voiceName_ = getDefaultInstance().getVoiceName();
    }

    public static pi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ph newBuilder() {
        return (ph) DEFAULT_INSTANCE.createBuilder();
    }

    public static pi parseDelimitedFrom(InputStream inputStream) {
        return (pi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pi parseFrom(com.google.v.v vVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceName(String str) {
        Objects.requireNonNull(str);
        this.voiceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.voiceName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"voiceId_", "voiceName_"});
        }
        if (iOrdinal == 3) {
            return new pi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ph(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getVoiceId() {
        return this.voiceId_;
    }

    public com.google.v.v getVoiceIdBytes() {
        return com.google.v.v.s(this.voiceId_);
    }

    public String getVoiceName() {
        return this.voiceName_;
    }

    public com.google.v.v getVoiceNameBytes() {
        return com.google.v.v.s(this.voiceName_);
    }

    public static ph newBuilder(pi piVar) {
        return (ph) DEFAULT_INSTANCE.createBuilder(piVar);
    }

    public static pi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pi parseFrom(com.google.v.z zVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pi parseFrom(InputStream inputStream) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pi parseFrom(ByteBuffer byteBuffer) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pi parseFrom(byte[] bArr) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

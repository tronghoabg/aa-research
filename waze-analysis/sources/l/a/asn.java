package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asn extends com.google.v.du<asn, asm> implements com.google.v.fj {
    public static final int AUDIO_FILE_PATH_FIELD_NUMBER = 1;
    private static final asn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asn> PARSER;
    private String audioFilePath_ = "";

    static {
        asn asnVar = new asn();
        DEFAULT_INSTANCE = asnVar;
        com.google.v.du.registerDefaultInstance(asn.class, asnVar);
    }

    private asn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioFilePath() {
        this.audioFilePath_ = getDefaultInstance().getAudioFilePath();
    }

    public static asn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static asm newBuilder() {
        return (asm) DEFAULT_INSTANCE.createBuilder();
    }

    public static asn parseDelimitedFrom(InputStream inputStream) {
        return (asn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asn parseFrom(com.google.v.v vVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFilePath(String str) {
        Objects.requireNonNull(str);
        this.audioFilePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFilePathBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.audioFilePath_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"audioFilePath_"});
        }
        if (iOrdinal == 3) {
            return new asn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAudioFilePath() {
        return this.audioFilePath_;
    }

    public com.google.v.v getAudioFilePathBytes() {
        return com.google.v.v.s(this.audioFilePath_);
    }

    public static asm newBuilder(asn asnVar) {
        return (asm) DEFAULT_INSTANCE.createBuilder(asnVar);
    }

    public static asn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asn parseFrom(com.google.v.z zVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asn parseFrom(InputStream inputStream) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asn parseFrom(ByteBuffer byteBuffer) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asn parseFrom(byte[] bArr) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

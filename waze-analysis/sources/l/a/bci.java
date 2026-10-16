package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bci extends com.google.v.du<bci, bch> implements com.google.v.fj {
    private static final bci DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bci> PARSER = null;
    public static final int USER_CUSTOM_VOICE_ID_FIELD_NUMBER = 1;
    private String userCustomVoiceId_ = "";

    static {
        bci bciVar = new bci();
        DEFAULT_INSTANCE = bciVar;
        com.google.v.du.registerDefaultInstance(bci.class, bciVar);
    }

    private bci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCustomVoiceId() {
        this.userCustomVoiceId_ = getDefaultInstance().getUserCustomVoiceId();
    }

    public static bci getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bch newBuilder() {
        return (bch) DEFAULT_INSTANCE.createBuilder();
    }

    public static bci parseDelimitedFrom(InputStream inputStream) {
        return (bci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bci parseFrom(com.google.v.v vVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bci> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCustomVoiceId(String str) {
        Objects.requireNonNull(str);
        this.userCustomVoiceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCustomVoiceIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.userCustomVoiceId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"userCustomVoiceId_"});
        }
        if (iOrdinal == 3) {
            return new bci();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bch(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bci> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bci.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getUserCustomVoiceId() {
        return this.userCustomVoiceId_;
    }

    public com.google.v.v getUserCustomVoiceIdBytes() {
        return com.google.v.v.s(this.userCustomVoiceId_);
    }

    public static bch newBuilder(bci bciVar) {
        return (bch) DEFAULT_INSTANCE.createBuilder(bciVar);
    }

    public static bci parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bci parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bci parseFrom(com.google.v.z zVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bci parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bci parseFrom(InputStream inputStream) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bci parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bci parseFrom(ByteBuffer byteBuffer) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bci parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bci parseFrom(byte[] bArr) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bci parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

package l.a;

import androidx.media3.datasource.cache.ContentMetadata;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqf extends com.google.v.du<bqf, bqe> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CUSTOM_FIELD_NUMBER = 2;
    private static final bqf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqf> PARSER = null;
    public static final int VOICE_ID_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private boolean custom_;
    private String voiceId_ = "";

    static {
        bqf bqfVar = new bqf();
        DEFAULT_INSTANCE = bqfVar;
        com.google.v.du.registerDefaultInstance(bqf.class, bqfVar);
    }

    private bqf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustom() {
        this.bitField0_ &= -2;
        this.custom_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = getDefaultInstance().getVoiceId();
    }

    public static bqf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqe newBuilder() {
        return (bqe) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqf parseDelimitedFrom(InputStream inputStream) {
        return (bqf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqf parseFrom(com.google.v.v vVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bqd bqdVar) {
        this.action_ = bqdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustom(boolean z) {
        this.bitField0_ |= 1;
        this.custom_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003Ȉ", new Object[]{"bitField0_", "action_", ContentMetadata.KEY_CUSTOM_PREFIX, "voiceId_"});
        }
        if (iOrdinal == 3) {
            return new bqf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bqd getAction() {
        bqd bqdVar;
        switch (this.action_) {
            case 0:
                bqdVar = bqd.ACTION_UNSPECIFIED;
                break;
            case 1:
                bqdVar = bqd.CUSTOM_VOICE_DOWNLOAD;
                break;
            case 2:
                bqdVar = bqd.CUSTOM_VOICE_EDIT;
                break;
            case 3:
                bqdVar = bqd.CUSTOM_VOICE_INFO;
                break;
            case 4:
                bqdVar = bqd.CUSTOM_VOICE_SHARE;
                break;
            case 5:
                bqdVar = bqd.RECORD_NEW_VOICE;
                break;
            case 6:
                bqdVar = bqd.SET_VOICE;
                break;
            default:
                bqdVar = null;
                break;
        }
        return bqdVar == null ? bqd.UNRECOGNIZED : bqdVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getCustom() {
        return this.custom_;
    }

    public String getVoiceId() {
        return this.voiceId_;
    }

    public com.google.v.v getVoiceIdBytes() {
        return com.google.v.v.s(this.voiceId_);
    }

    public boolean hasCustom() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bqe newBuilder(bqf bqfVar) {
        return (bqe) DEFAULT_INSTANCE.createBuilder(bqfVar);
    }

    public static bqf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqf parseFrom(com.google.v.z zVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqf parseFrom(InputStream inputStream) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqf parseFrom(ByteBuffer byteBuffer) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqf parseFrom(byte[] bArr) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

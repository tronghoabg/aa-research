package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfk extends com.google.v.du<bfk, bfi> implements com.google.v.fj {
    private static final bfk DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bfk> PARSER = null;
    public static final int SOUND_TYPE_FIELD_NUMBER = 4;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int TEXT_PLAYED_FIELD_NUMBER = 3;
    private int bitField0_;
    private int soundType_;
    private boolean success_;
    private String failureReason_ = "";
    private String textPlayed_ = "";

    static {
        bfk bfkVar = new bfk();
        DEFAULT_INSTANCE = bfkVar;
        com.google.v.du.registerDefaultInstance(bfk.class, bfkVar);
    }

    private bfk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.bitField0_ &= -3;
        this.failureReason_ = getDefaultInstance().getFailureReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundType() {
        this.soundType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextPlayed() {
        this.textPlayed_ = getDefaultInstance().getTextPlayed();
    }

    public static bfk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfi newBuilder() {
        return (bfi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfk parseDelimitedFrom(InputStream inputStream) {
        return (bfk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfk parseFrom(com.google.v.v vVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.failureReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.failureReason_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundType(bfj bfjVar) {
        this.soundType_ = bfjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundTypeValue(int i2) {
        this.soundType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextPlayed(String str) {
        Objects.requireNonNull(str);
        this.textPlayed_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextPlayedBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.textPlayed_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ለ\u0001\u0003Ȉ\u0004\f", new Object[]{"bitField0_", "success_", "failureReason_", "textPlayed_", "soundType_"});
        }
        if (iOrdinal == 3) {
            return new bfk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bfi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFailureReason() {
        return this.failureReason_;
    }

    public com.google.v.v getFailureReasonBytes() {
        return com.google.v.v.s(this.failureReason_);
    }

    public bfj getSoundType() {
        int i2 = this.soundType_;
        bfj bfjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bfj.OTHER_SOUNDS : bfj.NOTIFICATIONS : bfj.GUIDANCE_ANNOUCEMENTS : bfj.SOUND_TYPE_UNSPECIFIED;
        return bfjVar == null ? bfj.UNRECOGNIZED : bfjVar;
    }

    public int getSoundTypeValue() {
        return this.soundType_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public String getTextPlayed() {
        return this.textPlayed_;
    }

    public com.google.v.v getTextPlayedBytes() {
        return com.google.v.v.s(this.textPlayed_);
    }

    public boolean hasFailureReason() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bfi newBuilder(bfk bfkVar) {
        return (bfi) DEFAULT_INSTANCE.createBuilder(bfkVar);
    }

    public static bfk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfk parseFrom(com.google.v.z zVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfk parseFrom(InputStream inputStream) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfk parseFrom(ByteBuffer byteBuffer) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfk parseFrom(byte[] bArr) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

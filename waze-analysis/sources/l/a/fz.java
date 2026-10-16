package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fz extends com.google.v.du<fz, fy> implements com.google.v.fj {
    public static final int AUDIO_DEVICE_NAME_FIELD_NUMBER = 1;
    public static final int AUDIO_DEVICE_TYPE_FIELD_NUMBER = 2;
    private static final fz DEFAULT_INSTANCE;
    public static final int DETECTION_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<fz> PARSER = null;
    public static final int WAKEUP_SESSION_ID_FIELD_NUMBER = 4;
    private String audioDeviceName_ = "";
    private String audioDeviceType_ = "";
    private int bitField0_;
    private long detectionTimestampMs_;
    private long wakeupSessionId_;

    static {
        fz fzVar = new fz();
        DEFAULT_INSTANCE = fzVar;
        com.google.v.du.registerDefaultInstance(fz.class, fzVar);
    }

    private fz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioDeviceName() {
        this.audioDeviceName_ = getDefaultInstance().getAudioDeviceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioDeviceType() {
        this.audioDeviceType_ = getDefaultInstance().getAudioDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetectionTimestampMs() {
        this.bitField0_ &= -2;
        this.detectionTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWakeupSessionId() {
        this.bitField0_ &= -3;
        this.wakeupSessionId_ = 0L;
    }

    public static fz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fy newBuilder() {
        return (fy) DEFAULT_INSTANCE.createBuilder();
    }

    public static fz parseDelimitedFrom(InputStream inputStream) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(com.google.v.v vVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioDeviceName(String str) {
        Objects.requireNonNull(str);
        this.audioDeviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioDeviceNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.audioDeviceName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioDeviceType(String str) {
        Objects.requireNonNull(str);
        this.audioDeviceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioDeviceTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.audioDeviceType_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetectionTimestampMs(long j2) {
        this.bitField0_ |= 1;
        this.detectionTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeupSessionId(long j2) {
        this.bitField0_ |= 2;
        this.wakeupSessionId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဂ\u0000\u0004ဂ\u0001", new Object[]{"bitField0_", "audioDeviceName_", "audioDeviceType_", "detectionTimestampMs_", "wakeupSessionId_"});
        }
        if (iOrdinal == 3) {
            return new fz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAudioDeviceName() {
        return this.audioDeviceName_;
    }

    public com.google.v.v getAudioDeviceNameBytes() {
        return com.google.v.v.s(this.audioDeviceName_);
    }

    public String getAudioDeviceType() {
        return this.audioDeviceType_;
    }

    public com.google.v.v getAudioDeviceTypeBytes() {
        return com.google.v.v.s(this.audioDeviceType_);
    }

    public long getDetectionTimestampMs() {
        return this.detectionTimestampMs_;
    }

    public long getWakeupSessionId() {
        return this.wakeupSessionId_;
    }

    public boolean hasDetectionTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWakeupSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static fy newBuilder(fz fzVar) {
        return (fy) DEFAULT_INSTANCE.createBuilder(fzVar);
    }

    public static fz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fz parseFrom(com.google.v.z zVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fz parseFrom(InputStream inputStream) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(ByteBuffer byteBuffer) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fz parseFrom(byte[] bArr) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

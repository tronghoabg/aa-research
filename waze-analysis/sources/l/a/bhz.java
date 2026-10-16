package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhz extends com.google.v.du<bhz, bhx> implements com.google.v.fj {
    private static final bhz DEFAULT_INSTANCE;
    public static final int DEVICE_VOLUME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bhz> PARSER = null;
    public static final int TEXT_TYPE_FIELD_NUMBER = 2;
    public static final int VOICE_INSTRUCTIONS_SOUND_FIELD_NUMBER = 3;
    private int bitField0_;
    private double deviceVolume_;
    private int textType_;
    private int voiceInstructionsSound_;

    static {
        bhz bhzVar = new bhz();
        DEFAULT_INSTANCE = bhzVar;
        com.google.v.du.registerDefaultInstance(bhz.class, bhzVar);
    }

    private bhz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceVolume() {
        this.bitField0_ &= -2;
        this.deviceVolume_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextType() {
        this.textType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructionsSound() {
        this.voiceInstructionsSound_ = 0;
    }

    public static bhz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bhx newBuilder() {
        return (bhx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhz parseDelimitedFrom(InputStream inputStream) {
        return (bhz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhz parseFrom(com.google.v.v vVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceVolume(double d2) {
        this.bitField0_ |= 1;
        this.deviceVolume_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextType(bhy bhyVar) {
        this.textType_ = bhyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextTypeValue(int i2) {
        this.textType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsSound(bql bqlVar) {
        this.voiceInstructionsSound_ = bqlVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsSoundValue(int i2) {
        this.voiceInstructionsSound_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "deviceVolume_", "textType_", "voiceInstructionsSound_"});
        }
        if (iOrdinal == 3) {
            return new bhz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getDeviceVolume() {
        return this.deviceVolume_;
    }

    public bhy getTextType() {
        bhy bhyVar;
        switch (this.textType_) {
            case 0:
                bhyVar = bhy.TEXT_TYPE_UNSPECIFIED;
                break;
            case 1:
                bhyVar = bhy.NAVIGATION_INSTRUCTION;
                break;
            case 2:
            default:
                bhyVar = null;
                break;
            case 3:
                bhyVar = bhy.TRAFFIC_BAR_UPDATE;
                break;
            case 4:
                bhyVar = bhy.GUARDIAN_PROMPT;
                break;
            case 5:
                bhyVar = bhy.CHILD_REMINDER;
                break;
            case 6:
                bhyVar = bhy.ALERT;
                break;
            case 7:
                bhyVar = bhy.APP_TEXT;
                break;
            case 8:
                bhyVar = bhy.TTS_REQUEST;
                break;
        }
        return bhyVar == null ? bhy.UNRECOGNIZED : bhyVar;
    }

    public int getTextTypeValue() {
        return this.textType_;
    }

    public bql getVoiceInstructionsSound() {
        bql bqlVarA = bql.a(this.voiceInstructionsSound_);
        return bqlVarA == null ? bql.UNRECOGNIZED : bqlVarA;
    }

    public int getVoiceInstructionsSoundValue() {
        return this.voiceInstructionsSound_;
    }

    public boolean hasDeviceVolume() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bhx newBuilder(bhz bhzVar) {
        return (bhx) DEFAULT_INSTANCE.createBuilder(bhzVar);
    }

    public static bhz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhz parseFrom(com.google.v.z zVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhz parseFrom(InputStream inputStream) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhz parseFrom(ByteBuffer byteBuffer) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhz parseFrom(byte[] bArr) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

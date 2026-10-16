package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pa extends com.google.v.du<pa, oz> implements com.google.v.fj {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAR_ID_FIELD_NUMBER = 2;
    private static final pa DEFAULT_INSTANCE;
    public static final int MOOD_ID_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<pa> PARSER = null;
    public static final int VOICE_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private long campaignId_;
    private String carId_ = "";
    private String moodId_ = "";
    private String voiceId_ = "";

    static {
        pa paVar = new pa();
        DEFAULT_INSTANCE = paVar;
        com.google.v.du.registerDefaultInstance(pa.class, paVar);
    }

    private pa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -2;
        this.campaignId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarId() {
        this.carId_ = getDefaultInstance().getCarId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodId() {
        this.moodId_ = getDefaultInstance().getMoodId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = getDefaultInstance().getVoiceId();
    }

    public static pa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oz newBuilder() {
        return (oz) DEFAULT_INSTANCE.createBuilder();
    }

    public static pa parseDelimitedFrom(InputStream inputStream) {
        return (pa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pa parseFrom(com.google.v.v vVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(long j2) {
        this.bitField0_ |= 1;
        this.campaignId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarId(String str) {
        Objects.requireNonNull(str);
        this.carId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.carId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodId(String str) {
        Objects.requireNonNull(str);
        this.moodId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.moodId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "campaignId_", "carId_", "moodId_", "voiceId_"});
        }
        if (iOrdinal == 3) {
            return new pa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCampaignId() {
        return this.campaignId_;
    }

    public String getCarId() {
        return this.carId_;
    }

    public com.google.v.v getCarIdBytes() {
        return com.google.v.v.s(this.carId_);
    }

    public String getMoodId() {
        return this.moodId_;
    }

    public com.google.v.v getMoodIdBytes() {
        return com.google.v.v.s(this.moodId_);
    }

    public String getVoiceId() {
        return this.voiceId_;
    }

    public com.google.v.v getVoiceIdBytes() {
        return com.google.v.v.s(this.voiceId_);
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static oz newBuilder(pa paVar) {
        return (oz) DEFAULT_INSTANCE.createBuilder(paVar);
    }

    public static pa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pa parseFrom(com.google.v.z zVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pa parseFrom(InputStream inputStream) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pa parseFrom(ByteBuffer byteBuffer) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pa parseFrom(byte[] bArr) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

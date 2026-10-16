package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oy extends com.google.v.du<oy, ow> implements com.google.v.fj {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAR_DOWNLOADED_FIELD_NUMBER = 4;
    private static final oy DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 3;
    public static final int MOOD_DOWNLOADED_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<oy> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    public static final int VOICE_DOWNLOADED_FIELD_NUMBER = 6;
    private int bitField0_;
    private long campaignId_;
    private boolean carDownloaded_;
    private int failureReason_;
    private boolean moodDownloaded_;
    private boolean success_;
    private boolean voiceDownloaded_;

    static {
        oy oyVar = new oy();
        DEFAULT_INSTANCE = oyVar;
        com.google.v.du.registerDefaultInstance(oy.class, oyVar);
    }

    private oy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -2;
        this.campaignId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarDownloaded() {
        this.bitField0_ &= -5;
        this.carDownloaded_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.failureReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodDownloaded() {
        this.bitField0_ &= -9;
        this.moodDownloaded_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -3;
        this.success_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceDownloaded() {
        this.bitField0_ &= -17;
        this.voiceDownloaded_ = false;
    }

    public static oy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ow newBuilder() {
        return (ow) DEFAULT_INSTANCE.createBuilder();
    }

    public static oy parseDelimitedFrom(InputStream inputStream) {
        return (oy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oy parseFrom(com.google.v.v vVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(long j2) {
        this.bitField0_ |= 1;
        this.campaignId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarDownloaded(boolean z) {
        this.bitField0_ |= 4;
        this.carDownloaded_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(ox oxVar) {
        this.failureReason_ = oxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonValue(int i2) {
        this.failureReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodDownloaded(boolean z) {
        this.bitField0_ |= 8;
        this.moodDownloaded_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 2;
        this.success_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceDownloaded(boolean z) {
        this.bitField0_ |= 16;
        this.voiceDownloaded_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003\f\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "campaignId_", "success_", "failureReason_", "carDownloaded_", "moodDownloaded_", "voiceDownloaded_"});
        }
        if (iOrdinal == 3) {
            return new oy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ow(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oy.class) {
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

    public boolean getCarDownloaded() {
        return this.carDownloaded_;
    }

    public ox getFailureReason() {
        int i2 = this.failureReason_;
        ox oxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ox.SELECTION_ERROR : ox.DOWNLOAD_ERROR : ox.FAILURE_REASON_UNSPECIFIED;
        return oxVar == null ? ox.UNRECOGNIZED : oxVar;
    }

    public int getFailureReasonValue() {
        return this.failureReason_;
    }

    public boolean getMoodDownloaded() {
        return this.moodDownloaded_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean getVoiceDownloaded() {
        return this.voiceDownloaded_;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCarDownloaded() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMoodDownloaded() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVoiceDownloaded() {
        return (this.bitField0_ & 16) != 0;
    }

    public static ow newBuilder(oy oyVar) {
        return (ow) DEFAULT_INSTANCE.createBuilder(oyVar);
    }

    public static oy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oy parseFrom(com.google.v.z zVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oy parseFrom(InputStream inputStream) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oy parseFrom(ByteBuffer byteBuffer) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oy parseFrom(byte[] bArr) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}

package com.waze.sound;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class SoundConfigNativeManager extends eo implements em {
    public static final int $stable = 8;
    private final h.f voiceInfraStatSendingEnabled$delegate = h.g.a(new gv(this, 1));
    private final h.f startAnnouncementExtraTimeInSeconds$delegate = h.g.a(new en(0));
    private final h.f startAnnouncementMaxDownloadTimeInSeconds$delegate = h.g.a(new en(2));

    private final native void initNativeLayerNTV();

    @Override // com.waze.sound.em
    public boolean getFinishByDistanceFullWeightEnabled() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_VOICES_FINISH_BY_DISTANCE_FULL_WEIGHT_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.sound.em
    public long getGenerateInstructionVoiceAssetsRequestTimeoutMillis() {
        Long lB = ConfigValues.CONFIG_VALUE_VOICES_GENERATE_INSTRUCTION_VOICE_ASSET_REQUEST_TIMEOUT_MILLIS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.sound.em
    public long getGenerateNotificationVoiceAssetRequestTimeoutMillis() {
        Long lB = ConfigValues.CONFIG_VALUE_VOICES_GENERATE_NOTIFICATION_VOICE_ASSET_REQUEST_TIMEOUT_MILLIS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    public final native boolean getIsVoiceInfraStatSendingEnabledNTV();

    @Override // com.waze.sound.em
    public long getNumVoiceServerRetryAttempts() {
        Long lB = ConfigValues.CONFIG_VALUE_VOICES_GENERATE_INSTRUCTION_VOICE_ASSET_REQUEST_NUM_RETRY_ATTEMPTS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.sound.em
    public long getStartAnnouncementExtraTimeInSeconds() {
        Object value = this.startAnnouncementExtraTimeInSeconds$delegate.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.sound.em
    public long getStartAnnouncementMaxDownloadTimeInSeconds() {
        Object value = this.startAnnouncementMaxDownloadTimeInSeconds$delegate.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.sound.em
    public boolean getVoiceInfraStatSendingEnabled() {
        return ((Boolean) this.voiceInfraStatSendingEnabled$delegate.getValue()).booleanValue();
    }

    public final void initialize() {
        initNativeLayerNTV();
    }
}

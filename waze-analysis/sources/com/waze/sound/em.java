package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface em {
    boolean getFinishByDistanceFullWeightEnabled();

    long getGenerateInstructionVoiceAssetsRequestTimeoutMillis();

    long getGenerateNotificationVoiceAssetRequestTimeoutMillis();

    long getNumVoiceServerRetryAttempts();

    long getStartAnnouncementExtraTimeInSeconds();

    long getStartAnnouncementMaxDownloadTimeInSeconds();

    boolean getVoiceInfraStatSendingEnabled();
}

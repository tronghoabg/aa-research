package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ResourceDownloadType {
    RES_DOWNLOAD_IMAGE(0),
    RES_DOWNLOAD_SOUND(1),
    RES_DOWNLOAD_LANG(3),
    RES_DOWNLOAD_LANG_TTS(7),
    RES_DOWNLOAD_AD_IMAGE(8),
    RES_DOWNLOAD_LANG_ASR(10),
    RES_DOWNLOAD_ENCOURAGEMENT(12),
    RES_DOWNLOAD_VOICES(13);

    private final int value;

    ResourceDownloadType(int i2) {
        this.value = i2;
    }

    public int getValue() {
        return this.value;
    }
}

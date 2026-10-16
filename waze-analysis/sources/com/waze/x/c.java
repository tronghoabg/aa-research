package com.waze.x;

import androidx.media3.exoplayer.upstream.CmcdData;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c {
    ACTION(CmcdData.OBJECT_TYPE_AUDIO_ONLY),
    SHARE_DRIVE("sd"),
    TICKER_ONLY("ticker_only"),
    POPUP_MESSAGE("popup_message"),
    MIN_VERSION("min_version"),
    NO_LOGIN("nl"),
    OPEN_BROWSER_UNENCODED("tu"),
    ADVIL_ACTION("button", null),
    MEDIA_URL("media_url", null);


    /* renamed from: k, reason: collision with root package name */
    private final String f45534k;

    c(String str, byte[] bArr) {
        this.f45534k = str;
    }

    public final String a() {
        return this.f45534k;
    }

    c(String str) {
        this(str, null);
    }
}

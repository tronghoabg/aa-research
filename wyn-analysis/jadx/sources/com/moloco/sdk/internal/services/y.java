package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f29738a;

    public y(Context context) {
        AudioManager audioManager;
        try {
            audioManager = (AudioManager) Y0.e.getSystemService(context.getApplicationContext(), AudioManager.class);
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e7, false, 8, null);
            audioManager = null;
        }
        this.f29738a = audioManager;
    }
}

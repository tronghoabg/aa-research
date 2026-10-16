package com.google.android.material.k;

import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    final float f6650a = -1.0f;

    @Override // com.google.android.material.k.f
    public final void a(ab abVar, float f2, float f3) {
        float f4 = f3 * f2;
        abVar.f(f4, 180.0f, 90.0f);
        double d2 = f4;
        abVar.c((float) (Math.sin(Math.toRadians(90.0d)) * d2), (float) (Math.sin(Math.toRadians(AudioStats.AUDIO_AMPLITUDE_NONE)) * d2));
    }
}

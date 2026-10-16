package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzvf implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public zzvf(zzvi zzviVar) {
        Objects.requireNonNull(zzviVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}

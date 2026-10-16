package com.google.android.gms.internal.ads;

import A7.O0;
import android.media.MediaCodec;

/* loaded from: classes3.dex */
final class zzit {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = O0.e();

    public final /* synthetic */ void zza(int i5, int i10) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i5, i10);
        this.zza.setPattern(pattern);
    }
}

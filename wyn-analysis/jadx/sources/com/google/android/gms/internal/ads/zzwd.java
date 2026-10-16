package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes3.dex */
final class zzwd implements zzwb {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzwd(boolean z2, boolean z10, boolean z11) {
        int i5 = 1;
        if (!z2 && !z10 && !z11) {
            i5 = 0;
        }
        this.zza = i5;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final MediaCodecInfo zzb(int i5) {
        zzf();
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}

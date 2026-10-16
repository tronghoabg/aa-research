package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes3.dex */
final class zzwc implements zzwb {
    private zzwc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final MediaCodecInfo zzb(int i5) {
        return MediaCodecList.getCodecInfoAt(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public /* synthetic */ zzwc(byte[] bArr) {
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzwk implements zzvn {
    private final MediaCodec zza;

    public zzwk(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzb(int i5, int i10, int i11, long j8, int i12) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i5, 0, i11, j8, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzc(int i5, int i10, zziu zziuVar, long j8, int i11) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i5, 0, zziuVar.zzb(), j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzd(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzg() {
    }
}

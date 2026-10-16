package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzsy extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzta zza;

    public zzsy(zzta zztaVar) {
        Objects.requireNonNull(zztaVar);
        this.zza = zztaVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i5) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsx.zza);
        zzegVarZzu.zzf();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsv.zza);
        zzegVarZzu.zzf();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsw.zza);
        zzegVarZzu.zzf();
    }
}

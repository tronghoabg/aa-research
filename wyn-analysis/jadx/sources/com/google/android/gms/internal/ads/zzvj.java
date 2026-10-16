package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class zzvj {
    public final zzvp zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzvi zzf;

    private zzvj(zzvp zzvpVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzvi zzviVar) {
        this.zza = zzvpVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzviVar;
    }

    public static zzvj zza(zzvp zzvpVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzvi zzviVar) {
        return new zzvj(zzvpVar, mediaFormat, zzvVar, null, null, zzviVar);
    }

    public static zzvj zzb(zzvp zzvpVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzvj(zzvpVar, mediaFormat, zzvVar, surface, null, null);
    }
}

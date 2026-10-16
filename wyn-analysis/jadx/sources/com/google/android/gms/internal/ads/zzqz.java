package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;

/* loaded from: classes3.dex */
public final class zzqz {
    private final zzv zza;
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzqz(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzqz zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzqz zzb(AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzqz zzc(int i5) {
        this.zzd = i5;
        return this;
    }

    public final zzqz zzd(int i5) {
        this.zze = i5;
        return this;
    }

    public final zzqz zze(int i5) {
        this.zzf = -1;
        return this;
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ int zzj() {
        return this.zze;
    }

    public final /* synthetic */ int zzk() {
        return this.zzf;
    }
}

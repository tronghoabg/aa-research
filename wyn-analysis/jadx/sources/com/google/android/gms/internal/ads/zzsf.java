package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzsf extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzsf(int i5, zzv zzvVar, boolean z2) {
        super(N0.a.d(i5, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i5).length() + 25)));
        this.zzb = z2;
        this.zza = i5;
        this.zzc = zzvVar;
    }
}

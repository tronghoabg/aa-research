package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzqw extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqw(int i5, boolean z2) {
        super(N0.a.d(i5, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i5).length() + 26)));
        this.zzb = z2;
        this.zza = i5;
    }
}

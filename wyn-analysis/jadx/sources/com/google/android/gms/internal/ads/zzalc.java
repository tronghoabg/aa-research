package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzalc implements zzahh {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzalc(int i5, long j8, int i10) {
        this.zza = i5;
        this.zzb = j8;
        this.zzc = i10;
    }

    public final String toString() {
        String strZzA = zzfm.zzA(this.zza);
        int length = strZzA.length();
        long j8 = this.zzb;
        int length2 = String.valueOf(j8).length();
        int i5 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i5).length() + 1);
        N0.a.r(sb2, "AtomSizeTooSmall{type=", strZzA, ", size=");
        sb2.append(j8);
        sb2.append(", minHeaderSize=");
        sb2.append(i5);
        sb2.append("}");
        return sb2.toString();
    }
}

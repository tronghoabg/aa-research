package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzcl {
    public static final zzcl zza = new zzcl(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcl(int i5, int i10, int i11) {
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzfm.zzE(i11) ? zzfm.zzI(i11) * i10 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i10 = this.zzc;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i11).length() + 1);
        N0.a.l(i5, i10, "AudioFormat[sampleRate=", ", channelCount=", sb2);
        return AbstractC0279p0.o(sb2, ", encoding=", i11, "]");
    }
}

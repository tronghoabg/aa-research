package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzafo implements zzahd {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzafo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i5 = length - 1;
            this.zzf = jArr2[i5] + jArr3[i5];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i5);
        sb2.append(", sizes=");
        sb2.append(string);
        AbstractC3256n.p(sb2, ", offsets=", string2, ", timeUs=", string3);
        return M6.t(sb2, ", durationsUs=", string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        long[] jArr = this.zze;
        int iZzo = zzfm.zzo(jArr, j8, true, true);
        long j10 = jArr[iZzo];
        long[] jArr2 = this.zzc;
        zzahe zzaheVar = new zzahe(j10, jArr2[iZzo]);
        if (zzaheVar.zzb >= j8 || iZzo == this.zza - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i5 = iZzo + 1;
        return new zzahb(zzaheVar, new zzahe(jArr[i5], jArr2[i5]));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}

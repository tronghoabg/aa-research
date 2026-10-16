package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcjx implements zzhr {
    private final zzhr zza;
    private final long zzb;
    private final zzhr zzc;
    private long zzd;
    private Uri zze;

    public zzcjx(zzhr zzhrVar, int i5, zzhr zzhrVar2) {
        this.zza = zzhrVar;
        this.zzb = i5;
        this.zzc = zzhrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        int i11;
        long j8 = this.zzd;
        long j10 = this.zzb;
        if (j8 < j10) {
            int iZza = this.zza.zza(bArr, i5, (int) Math.min(i10, j10 - j8));
            long j11 = this.zzd + iZza;
            this.zzd = j11;
            i11 = iZza;
            j8 = j11;
        } else {
            i11 = 0;
        }
        if (j8 < j10) {
            return i11;
        }
        int iZza2 = this.zzc.zza(bArr, i5 + i11, i10 - i11);
        int i12 = i11 + iZza2;
        this.zzd += iZza2;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        Uri uri;
        zzhv zzhvVar2;
        Uri uri2 = zzhvVar.zza;
        this.zze = uri2;
        long j8 = zzhvVar.zze;
        long j10 = this.zzb;
        zzhv zzhvVar3 = null;
        if (j8 >= j10) {
            uri = uri2;
            zzhvVar2 = null;
        } else {
            long j11 = zzhvVar.zzf;
            long jMin = j10 - j8;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            uri = uri2;
            zzhvVar2 = new zzhv(uri, j8, jMin, null);
        }
        long j12 = zzhvVar.zzf;
        if (j12 == -1 || j8 + j12 > j10) {
            zzhvVar3 = new zzhv(uri, Math.max(j10, j8), j12 != -1 ? Math.min(j12, (j8 + j12) - j10) : -1L, null);
        }
        long jZzb = zzhvVar2 != null ? this.zza.zzb(zzhvVar2) : 0L;
        long jZzb2 = zzhvVar3 != null ? this.zzc.zzb(zzhvVar3) : 0L;
        this.zzd = j8;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Map zzj() {
        return zzgww.zza();
    }
}

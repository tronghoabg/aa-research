package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* loaded from: classes3.dex */
final class zzamu implements zzahd {
    final /* synthetic */ zzamv zza;

    public /* synthetic */ zzamu(zzamv zzamvVar, byte[] bArr) {
        Objects.requireNonNull(zzamvVar);
        this.zza = zzamvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        zzamv zzamvVar = this.zza;
        return zzamvVar.zzf().zzh(zzamvVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzamv zzamvVar = this.zza;
        long jZzd = zzamvVar.zzd() + BigInteger.valueOf(zzamvVar.zzf().zzi(j8)).multiply(BigInteger.valueOf(zzamvVar.zze() - zzamvVar.zzd())).divide(BigInteger.valueOf(zzamvVar.zzg())).longValue();
        String str = zzfm.zza;
        zzahe zzaheVar = new zzahe(j8, Math.max(zzamvVar.zzd(), Math.min(jZzd - 30000, zzamvVar.zze() - 1)));
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}

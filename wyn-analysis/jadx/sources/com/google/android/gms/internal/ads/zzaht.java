package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzaht implements zzahd {
    final /* synthetic */ zzahv zza;
    private final long zzb;

    public zzaht(zzahv zzahvVar, long j8) {
        Objects.requireNonNull(zzahvVar);
        this.zza = zzahvVar;
        this.zzb = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzahv zzahvVar = this.zza;
        zzahb zzahbVarZzg = zzahvVar.zzh()[0].zzg(j8);
        for (int i5 = 1; i5 < zzahvVar.zzh().length; i5++) {
            zzahb zzahbVarZzg2 = zzahvVar.zzh()[i5].zzg(j8);
            if (zzahbVarZzg2.zza.zzc < zzahbVarZzg.zza.zzc) {
                zzahbVarZzg = zzahbVarZzg2;
            }
        }
        return zzahbVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}

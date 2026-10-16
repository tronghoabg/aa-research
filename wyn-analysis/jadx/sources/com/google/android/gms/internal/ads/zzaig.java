package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzaig extends zzafm {
    public zzaig(final zzagn zzagnVar, int i5, long j8, long j10) {
        long j11;
        Objects.requireNonNull(zzagnVar);
        zzafj zzafjVar = new zzafj() { // from class: com.google.android.gms.internal.ads.zzaie
            @Override // com.google.android.gms.internal.ads.zzafj
            public final /* synthetic */ long zza(long j12) {
                return zzagnVar.zzb(j12);
            }
        };
        zzaif zzaifVar = new zzaif(zzagnVar, i5, null);
        long jZza = zzagnVar.zza();
        long j12 = zzagnVar.zzj;
        int i10 = zzagnVar.zzd;
        if (i10 > 0) {
            j11 = ((i10 + zzagnVar.zzc) / 2) + 1;
        } else {
            int i11 = zzagnVar.zza;
            long j13 = 4096;
            if (i11 == zzagnVar.zzb && i11 > 0) {
                j13 = i11;
            }
            j11 = 64 + (((j13 * zzagnVar.zzg) * zzagnVar.zzh) / 8);
        }
        super(zzafjVar, zzaifVar, jZza, 0L, j12, j8, j10, j11, Math.max(6, zzagnVar.zzc));
    }
}

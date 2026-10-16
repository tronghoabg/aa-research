package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes4.dex */
final class zzkl implements zzkm {
    private static <E> zzkc<E> zzc(Object obj, long j8) {
        return (zzkc) zzml.zze(obj, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final <L> List<L> zza(Object obj, long j8) {
        zzkc zzkcVarZzc = zzc(obj, j8);
        if (zzkcVarZzc.zzc()) {
            return zzkcVarZzc;
        }
        int size = zzkcVarZzc.size();
        zzkc zzkcVarZza = zzkcVarZzc.zza(size == 0 ? 10 : size << 1);
        zzml.zza(obj, j8, zzkcVarZza);
        return zzkcVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzb(Object obj, long j8) {
        zzc(obj, j8).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final <E> void zza(Object obj, Object obj2, long j8) {
        zzkc zzkcVarZzc = zzc(obj, j8);
        zzkc zzkcVarZzc2 = zzc(obj2, j8);
        int size = zzkcVarZzc.size();
        int size2 = zzkcVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkcVarZzc.zzc()) {
                zzkcVarZzc = zzkcVarZzc.zza(size2 + size);
            }
            zzkcVarZzc.addAll(zzkcVarZzc2);
        }
        if (size > 0) {
            zzkcVarZzc2 = zzkcVarZzc;
        }
        zzml.zza(obj, j8, zzkcVarZzc2);
    }
}

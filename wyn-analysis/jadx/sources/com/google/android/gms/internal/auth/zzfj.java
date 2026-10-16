package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzfj extends zzfl {
    public /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void zza(Object obj, long j8) {
        ((zzez) zzhj.zzf(obj, j8)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void zzb(Object obj, Object obj2, long j8) {
        zzez zzezVarZzd = (zzez) zzhj.zzf(obj, j8);
        zzez zzezVar = (zzez) zzhj.zzf(obj2, j8);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        zzhj.zzp(obj, j8, zzezVar);
    }

    private zzfj() {
        super(null);
    }
}

package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzfo implements zzfv {
    private final zzfv[] zza;

    public zzfo(zzfv... zzfvVarArr) {
        this.zza = zzfvVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        zzfv[] zzfvVarArr = this.zza;
        for (int i5 = 0; i5 < 2; i5++) {
            zzfv zzfvVar = zzfvVarArr[i5];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        zzfv[] zzfvVarArr = this.zza;
        for (int i5 = 0; i5 < 2; i5++) {
            if (zzfvVarArr[i5].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
final class zzrg implements zzro {
    private final zzro[] zza;

    public zzrg(zzro... zzroVarArr) {
        this.zza = zzroVarArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final zzrn zzb(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            zzro zzroVar = this.zza[i5];
            if (zzroVar.zzc(cls)) {
                return zzroVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final boolean zzc(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.zza[i5].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

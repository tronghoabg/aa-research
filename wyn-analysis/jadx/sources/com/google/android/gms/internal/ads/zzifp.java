package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzifp implements zzifx {
    private final zzifx[] zza;

    public zzifp(zzifx... zzifxVarArr) {
        this.zza = zzifxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean zzb(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.zza[i5].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifw zzc(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            zzifx zzifxVar = this.zza[i5];
            if (zzifxVar.zzb(cls)) {
                return zzifxVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfen implements zzfcs {
    public zzfen(zzcez zzcezVar, zzhcp zzhcpVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        final p8.p pVarZza = zzhcf.zza(null);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgU)).booleanValue()) {
            pVarZza = zzhcf.zza(null);
        }
        final p8.p pVarZza2 = zzhcf.zza(null);
        return zzhcf.zzo(pVarZza, pVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfem
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfeo((String) pVarZza.get(), (String) pVarZza2.get());
            }
        }, zzcfy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 47;
    }
}

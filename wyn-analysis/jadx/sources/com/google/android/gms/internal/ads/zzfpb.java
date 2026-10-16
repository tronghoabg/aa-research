package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfpb {
    final /* synthetic */ zzfpk zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfpb(zzfpk zzfpkVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfpkVar);
        this.zza = zzfpkVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfpj zza(Callable callable) {
        List list = this.zzc;
        zzhce zzhceVarZzp = zzhcf.zzp(list);
        p8.p pVarZza = zzhceVarZzp.zza(zzfpa.zza, zzcfy.zzh);
        zzfpk zzfpkVar = this.zza;
        return new zzfpj(zzfpkVar, this.zzb, null, pVarZza, list, zzhceVarZzp.zza(callable, zzfpkVar.zze()), null);
    }
}

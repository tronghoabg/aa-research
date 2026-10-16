package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfpd {
    public static final zzfpj zza(p8.p pVar, Object obj, zzfpk zzfpkVar) {
        return new zzfpj(zzfpkVar, obj, null, zzfpk.zza, Collections.EMPTY_LIST, pVar, null);
    }

    public static final zzfpj zzb(Callable callable, Object obj, zzfpk zzfpkVar) {
        return zzc(callable, zzfpkVar.zze(), obj, zzfpkVar);
    }

    public static final zzfpj zzc(Callable callable, zzhcp zzhcpVar, Object obj, zzfpk zzfpkVar) {
        return new zzfpj(zzfpkVar, obj, null, zzfpk.zza, Collections.EMPTY_LIST, zzhcpVar.zzc(callable), null);
    }

    public static final zzfpj zzd(final zzfoy zzfoyVar, zzhcp zzhcpVar, Object obj, zzfpk zzfpkVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfoyVar.zza();
                return null;
            }
        }, zzhcpVar, obj, zzfpkVar);
    }
}

package com.google.android.gms.internal.ads;

import Va.M6;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzguk implements Serializable, zzguj {
    final zzguj zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgup zzd = new zzgup();

    public zzguk(zzguj zzgujVar) {
        this.zza = zzgujVar;
    }

    public final String toString() {
        Object objT;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objT = M6.t(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objT = this.zza;
        }
        String string = objT.toString();
        return M6.t(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
final class zzgul implements zzguj {
    private final zzgup zza = new zzgup();
    private volatile zzguj zzb;
    private Object zzc;

    public zzgul(zzguj zzgujVar) {
        this.zzb = zzgujVar;
    }

    public final String toString() {
        Object objT = this.zzb;
        if (objT == null) {
            String strValueOf = String.valueOf(this.zzc);
            objT = M6.t(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String string = objT.toString();
        return M6.t(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                try {
                    if (this.zzb != null) {
                        Object objZza = this.zzb.zza();
                        this.zzc = objZza;
                        this.zzb = null;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}

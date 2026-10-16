package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgwt.zzi());
    private final zzgwt zzb;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgwt.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgwt zza() {
        return this.zzb;
    }

    public final boolean zzb(int i5) {
        int i10 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zzb;
            if (i10 >= zzgwtVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgwtVar.get(i10);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i5) {
                return true;
            }
            i10++;
        }
    }
}

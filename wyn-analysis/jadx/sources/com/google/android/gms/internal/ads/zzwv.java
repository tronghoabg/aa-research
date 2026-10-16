package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzwv implements zzzf {
    private final zzgwt zza;
    private long zzb;

    public zzwv(List list, List list2) {
        int i5 = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        zzgtr.zza(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzgwqVar.zzf(new zzwu((zzzf) list.get(i10), (List) list2.get(i10)));
        }
        this.zza = zzgwqVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                break;
            }
            zzwu zzwuVar = (zzwu) zzgwtVar.get(i5);
            long jZzb = zzwuVar.zzb();
            if ((zzwuVar.zza().contains(1) || zzwuVar.zza().contains(2) || zzwuVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i5++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j8 = this.zzb;
        return j8 != -9223372036854775807L ? j8 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                break;
            }
            long jZzc = ((zzwu) zzgwtVar.get(i5)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i5++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        boolean zZzd;
        boolean z2 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i5 = 0;
            zZzd = false;
            while (true) {
                zzgwt zzgwtVar = this.zza;
                if (i5 >= zzgwtVar.size()) {
                    break;
                }
                long jZzc2 = ((zzwu) zzgwtVar.get(i5)).zzc();
                boolean z10 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzmcVar.zza;
                if (jZzc2 == jZzc || z10) {
                    zZzd |= ((zzwu) zzgwtVar.get(i5)).zzd(zzmcVar);
                }
                i5++;
            }
            z2 |= zZzd;
        } while (zZzd);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        int i5 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                return false;
            }
            if (((zzwu) zzgwtVar.get(i5)).zze()) {
                return true;
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j8) {
        int i5 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                return;
            }
            ((zzwu) zzgwtVar.get(i5)).zzf(j8);
            i5++;
        }
    }
}

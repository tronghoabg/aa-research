package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzbg extends zzay {
    public zzbg() {
        this.zza.add(zzbv.AND);
        this.zza.add(zzbv.NOT);
        this.zza.add(zzbv.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i5 = zzbj.zza[zzg.zza(str).ordinal()];
        if (i5 == 1) {
            zzg.zza(zzbv.AND, 2, list);
            zzaq zzaqVarZza = zzhVar.zza(list.get(0));
            return !zzaqVarZza.zzd().booleanValue() ? zzaqVarZza : zzhVar.zza(list.get(1));
        }
        if (i5 == 2) {
            zzg.zza(zzbv.NOT, 1, list);
            return new zzag(Boolean.valueOf(!zzhVar.zza(list.get(0)).zzd().booleanValue()));
        }
        if (i5 != 3) {
            return zza(str);
        }
        zzg.zza(zzbv.OR, 2, list);
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(0));
        return zzaqVarZza2.zzd().booleanValue() ? zzaqVarZza2 : zzhVar.zza(list.get(1));
    }
}

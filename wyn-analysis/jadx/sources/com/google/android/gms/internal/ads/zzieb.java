package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzieb extends zziea {
    @Override // com.google.android.gms.internal.ads.zziea
    public final void zza(Object obj) {
        ((zziel) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziea
    public final void zzb(zzihs zzihsVar, Map.Entry entry) throws IOException {
        zziem zziemVar = (zziem) entry.getKey();
        if (!zziemVar.zzc) {
            zzihq zzihqVar = zzihq.zza;
            switch (zziemVar.zzb.ordinal()) {
                case 0:
                    zzihsVar.zzf(zziemVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzihsVar.zze(zziemVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzihsVar.zzc(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzihsVar.zzh(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzihsVar.zzi(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzihsVar.zzj(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzihsVar.zzk(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzihsVar.zzl(zziemVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzihsVar.zzm(zziemVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzihsVar.zzs(zziemVar.zza, entry.getValue(), zzigj.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzihsVar.zzr(zziemVar.zza, entry.getValue(), zzigj.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzihsVar.zzn(zziemVar.zza, (zzidl) entry.getValue());
                    break;
                case 12:
                    zzihsVar.zzo(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzihsVar.zzi(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzihsVar.zzb(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzihsVar.zzd(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzihsVar.zzp(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzihsVar.zzq(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzihq zzihqVar2 = zzihq.zza;
        switch (zziemVar.zzb.ordinal()) {
            case 0:
                zzigs.zza(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 1:
                zzigs.zzb(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 2:
                zzigs.zzc(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 3:
                zzigs.zzd(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 4:
                zzigs.zzh(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 5:
                zzigs.zzf(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 6:
                zzigs.zzk(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 7:
                zzigs.zzn(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 8:
                zzigs.zzo(zziemVar.zza, (List) entry.getValue(), zzihsVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzigs.zzr(zziemVar.zza, (List) entry.getValue(), zzihsVar, zzigj.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzigs.zzq(zziemVar.zza, (List) entry.getValue(), zzihsVar, zzigj.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzigs.zzp(zziemVar.zza, (List) entry.getValue(), zzihsVar);
                break;
            case 12:
                zzigs.zzi(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 13:
                zzigs.zzh(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 14:
                zzigs.zzl(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 15:
                zzigs.zzg(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 16:
                zzigs.zzj(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case 17:
                zzigs.zze(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
        }
    }
}

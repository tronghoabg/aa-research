package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbiy {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbkh.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbku.zza);
        zzc(arrayList, zzbku.zzb);
        zzc(arrayList, zzbku.zzc);
        zzc(arrayList, zzbku.zzd);
        zzc(arrayList, zzbku.zze);
        zzc(arrayList, zzbku.zzu);
        zzc(arrayList, zzbku.zzf);
        zzc(arrayList, zzbku.zzm);
        zzc(arrayList, zzbku.zzn);
        zzc(arrayList, zzbku.zzo);
        zzc(arrayList, zzbku.zzp);
        zzc(arrayList, zzbku.zzq);
        zzc(arrayList, zzbku.zzr);
        zzc(arrayList, zzbku.zzs);
        zzc(arrayList, zzbku.zzt);
        zzc(arrayList, zzbku.zzg);
        zzc(arrayList, zzbku.zzh);
        zzc(arrayList, zzbku.zzi);
        zzc(arrayList, zzbku.zzj);
        zzc(arrayList, zzbku.zzk);
        zzc(arrayList, zzbku.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzblj.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbkh zzbkhVar) {
        String str = (String) zzbkhVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}

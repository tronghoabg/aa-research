package com.google.android.gms.internal.play_billing;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class zzdm extends zzdq {
    private static final Class zza = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private zzdm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zza(Object obj, long j8) {
        Object objUnmodifiableList;
        List list = (List) zzfp.zzf(obj, j8);
        if (list instanceof zzdk) {
            objUnmodifiableList = ((zzdk) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzek) && (list instanceof zzcz)) {
                zzcz zzczVar = (zzcz) list;
                if (zzczVar.zzc()) {
                    zzczVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        zzfp.zzs(obj, j8, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zzb(Object obj, Object obj2, long j8) {
        zzdj zzdjVar;
        List list = (List) zzfp.zzf(obj2, j8);
        int size = list.size();
        List listZzd = (List) zzfp.zzf(obj, j8);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzdk ? new zzdj(size) : ((listZzd instanceof zzek) && (listZzd instanceof zzcz)) ? ((zzcz) listZzd).zzd(size) : new ArrayList(size);
            zzfp.zzs(obj, j8, listZzd);
        } else {
            if (zza.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzfp.zzs(obj, j8, arrayList);
                zzdjVar = arrayList;
            } else if (listZzd instanceof zzfk) {
                zzdj zzdjVar2 = new zzdj(listZzd.size() + size);
                zzdjVar2.addAll(zzdjVar2.size(), (zzfk) listZzd);
                zzfp.zzs(obj, j8, zzdjVar2);
                zzdjVar = zzdjVar2;
            } else if ((listZzd instanceof zzek) && (listZzd instanceof zzcz)) {
                zzcz zzczVar = (zzcz) listZzd;
                if (!zzczVar.zzc()) {
                    listZzd = zzczVar.zzd(listZzd.size() + size);
                    zzfp.zzs(obj, j8, listZzd);
                }
            }
            listZzd = zzdjVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzfp.zzs(obj, j8, list);
    }

    public /* synthetic */ zzdm(zzdl zzdlVar) {
        super(null);
    }
}

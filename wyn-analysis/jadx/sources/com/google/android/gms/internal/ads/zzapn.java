package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzapn implements zzann {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzapn(List list) {
        this.zza = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzapd zzapdVar = (zzapd) list.get(i5);
            long[] jArr = this.zzb;
            int i10 = i5 + i5;
            jArr[i10] = zzapdVar.zzb;
            jArr[i10 + 1] = zzapdVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final long zzb(int i5) {
        zzgtr.zza(i5 >= 0);
        long[] jArr = this.zzc;
        zzgtr.zza(i5 < jArr.length);
        return jArr[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final List zzc(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            List list = this.zza;
            if (i5 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i10 = i5 + i5;
            if (jArr[i10] <= j8 && j8 < jArr[i10 + 1]) {
                zzapd zzapdVar = (zzapd) list.get(i5);
                zzcy zzcyVar = zzapdVar.zza;
                if (zzcyVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzapdVar);
                } else {
                    arrayList.add(zzcyVar);
                }
            }
            i5++;
        }
        Collections.sort(arrayList2, zzapm.zza);
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zzcx zzcxVarZza = ((zzapd) arrayList2.get(i11)).zza.zza();
            zzcxVarZza.zzf((-1) - i11, 1);
            arrayList.add(zzcxVarZza.zzr());
        }
        return arrayList;
    }
}

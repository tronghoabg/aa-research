package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzafp {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzafo zzafoVar) {
        long[] jArr = zzafoVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzafoVar);
        }
    }

    public final zzafo zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzafo zzafoVar : this.zza.values()) {
            arrayList.add(zzafoVar.zzb);
            arrayList2.add(zzafoVar.zzc);
            arrayList3.add(zzafoVar.zzd);
            arrayList4.add(zzafoVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int i5 = (int) length;
        zzgtr.zze(length == ((long) i5), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i5];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i10, length2);
            i10 += length2;
        }
        return new zzafo(iArr3, zzhat.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzhat.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzhat.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public final int zzc() {
        return this.zza.size();
    }
}

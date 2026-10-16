package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
final class zzakk implements zzahd {
    private final zzafo zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzakk(SparseArray sparseArray, long j8, int i5, long j10, long j11) {
        int i10;
        this.zzb = sparseArray;
        this.zzc = j8;
        this.zzd = i5;
        List list = (List) sparseArray.get(i5);
        zzafo zzafoVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                zzakj zzakjVar = (zzakj) list.get(i12);
                jArrCopyOf3[i12] = zzakjVar.zza();
                jArrCopyOf[i12] = zzakjVar.zzb();
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
                jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArrCopyOf3[i14] >= j8) {
                i14--;
            }
            iArrCopyOf[i14] = (int) ((j10 + j11) - jArrCopyOf[i14]);
            jArrCopyOf2[i14] = j8 - jArrCopyOf3[i14];
            if (i14 < i10) {
                zzeh.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
            }
            zzafoVar = new zzafo(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzafoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzafo zzafoVar = this.zza;
        if (zzafoVar != null) {
            return zzafoVar.zzc(j8);
        }
        zzahe zzaheVar = zzahe.zza;
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class zzant implements zzagd {
    private final zzagd zzb;
    private final zzanq zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzant(zzagd zzagdVar, zzanq zzanqVar) {
        this.zzb = zzagdVar;
        this.zzc = zzanqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final zzahm zzs(int i5, int i10) {
        if (i10 != 3 && i10 != 5) {
            this.zze = true;
        }
        if (i10 != 3) {
            return this.zzb.zzs(i5, i10);
        }
        SparseArray sparseArray = this.zzd;
        zzanv zzanvVar = (zzanv) sparseArray.get(i5);
        if (zzanvVar != null) {
            return zzanvVar;
        }
        zzanv zzanvVar2 = new zzanv(this.zzb.zzs(i5, 3), this.zzc);
        sparseArray.put(i5, zzanvVar2);
        return zzanvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i5 >= sparseArray.size()) {
                return;
            }
            ((zzanv) sparseArray.valueAt(i5)).zzf(true);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzw(zzahd zzahdVar) {
        this.zzb.zzw(zzahdVar);
    }
}

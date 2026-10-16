package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class zzzj {
    private int zza;
    private final SparseArray zzb;
    private final zzdu zzc;

    public zzzj() {
        this(zzzi.zza);
    }

    public final Object zza(int i5) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i10 = this.zza;
            if (i10 <= 0 || i5 >= this.zzb.keyAt(i10)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i11 = this.zza;
            sparseArray = this.zzb;
            if (i11 >= sparseArray.size() - 1 || i5 < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final void zzb(int i5, Object obj) {
        if (this.zza == -1) {
            zzgtr.zzi(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzgtr.zza(i5 >= iKeyAt);
            if (iKeyAt == i5) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i5, obj);
    }

    public final Object zzc() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzd(int i5) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i10 >= sparseArray.size() - 1) {
                return;
            }
            int i11 = i10 + 1;
            if (i5 < sparseArray.keyAt(i11)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i10));
            sparseArray.removeAt(i10);
            int i12 = this.zza;
            if (i12 > 0) {
                this.zza = i12 - 1;
            }
            i10 = i11;
        }
    }

    public final void zze() {
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i5 >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i5));
                i5++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzzj(zzdu zzduVar) {
        this.zzb = new SparseArray();
        this.zzc = zzduVar;
        this.zza = -1;
    }
}

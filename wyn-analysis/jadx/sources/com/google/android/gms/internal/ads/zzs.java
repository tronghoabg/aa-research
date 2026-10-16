package com.google.android.gms.internal.ads;

import android.os.Build;
import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.zza.equals(zzsVar.zza);
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        if (sparseBooleanArray.size() != zzsVar.zza.size()) {
            return false;
        }
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            if (zzc(i5) != zzsVar.zzc(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.zza.hashCode();
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            size = (size * 31) + zzc(i5);
        }
        return size;
    }

    public final boolean zza(int i5) {
        return this.zza.get(i5);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i5) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgtr.zzm(i5, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i5);
    }
}

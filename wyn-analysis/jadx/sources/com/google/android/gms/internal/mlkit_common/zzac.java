package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzac extends zzz {
    public zzac() {
        super(4);
    }

    public final zzac zzb(Object obj) {
        obj.getClass();
        int i5 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i5) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i5));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr2[i10] = obj;
        return this;
    }

    public final zzaf zzc() {
        this.zzc = true;
        return zzaf.zzg(this.zza, this.zzb);
    }
}

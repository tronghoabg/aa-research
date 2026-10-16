package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i5 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i5 + i5;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i10));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.zzb = i11 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.zzb, this.zza, this);
        zzag zzagVar2 = this.zzc;
        if (zzagVar2 == null) {
            return zzaqVarZzg;
        }
        throw zzagVar2.zza();
    }
}

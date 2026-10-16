package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgwv {
    Object[] zza;
    int zzb;
    zzgwu zzc;

    public zzgwv() {
        this(4);
    }

    private final void zze(int i5) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i5 + i5;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzgwo.zze(length, i10));
        }
    }

    private final zzgww zzf(boolean z2) {
        zzgwu zzgwuVar;
        zzgwu zzgwuVar2;
        if (z2 && (zzgwuVar2 = this.zzc) != null) {
            throw zzgwuVar2.zza();
        }
        zzgyt zzgytVarZzk = zzgyt.zzk(this.zzb, this.zza, this);
        if (!z2 || (zzgwuVar = this.zzc) == null) {
            return zzgytVarZzk;
        }
        throw zzgwuVar.zza();
    }

    public final zzgwv zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgvp.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        int i10 = i5 + i5;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i5 + 1;
        return this;
    }

    public final zzgwv zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgww zzc() {
        return zzf(true);
    }

    public final zzgww zzd() {
        return zzf(false);
    }

    public zzgwv(int i5) {
        this.zza = new Object[i5 + i5];
        this.zzb = 0;
    }
}

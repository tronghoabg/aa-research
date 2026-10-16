package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
class zzgwn extends zzgwo {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzgwn(int i5) {
        zzgvp.zzb(i5, "initialCapacity");
        this.zza = new Object[i5];
        this.zzb = 0;
    }

    private final void zzf(int i5) {
        int length = this.zza.length;
        int iZze = zzgwo.zze(length, this.zzb + i5);
        if (iZze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    public final zzgwn zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr[i5] = obj;
        return this;
    }

    public final void zzb(Object[] objArr, int i5) {
        zzgym.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzgwo zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgwp) {
                this.zzb = ((zzgwp) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwo
    public /* bridge */ /* synthetic */ zzgwo zzd(Object obj) {
        throw null;
    }
}

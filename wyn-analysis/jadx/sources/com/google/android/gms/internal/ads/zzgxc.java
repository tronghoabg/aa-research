package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzgxc extends zzgwn {
    Object[] zzd;
    private int zze;

    public zzgxc() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgwn, com.google.android.gms.internal.ads.zzgwo
    public final /* bridge */ /* synthetic */ zzgwo zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgxc zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzo = zzgxd.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzo <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgwm.zza(iHashCode);
                while (true) {
                    int i5 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i5];
                    if (obj2 == null) {
                        objArr2[i5] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i5 + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzgxc zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgxd zzh() {
        zzgxd zzgxdVarZzw;
        int i5 = this.zzb;
        if (i5 == 0) {
            return zzgyu.zza;
        }
        if (i5 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgze(obj);
        }
        if (this.zzd == null || zzgxd.zzo(i5) != this.zzd.length) {
            zzgxdVarZzw = zzgxd.zzw(this.zzb, this.zza);
            this.zzb = zzgxdVarZzw.size();
        } else {
            int i10 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgxd.zzx(i10, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            zzgxdVarZzw = new zzgyu(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgxdVarZzw;
    }

    public zzgxc(int i5, boolean z2) {
        super(i5);
        this.zzd = new Object[zzgxd.zzo(i5)];
    }
}

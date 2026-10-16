package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class zzgxd<E> extends zzgwp<E> implements Set<E>, j$.util.Set {
    private transient zzgwt zza;

    public static zzgxd zzh() {
        return zzgyu.zza;
    }

    public static zzgxd zzi(Object obj) {
        return new zzgze(obj);
    }

    public static zzgxd zzj(Object obj, Object obj2) {
        return zzw(2, obj, obj2);
    }

    public static zzgxd zzk(Object obj, Object obj2, Object obj3) {
        return zzw(3, obj, obj2, obj3);
    }

    public static zzgxd zzl(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzw(4, obj, obj2, obj3, obj4);
    }

    public static zzgxd zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzw(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgxd zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i5 = length + 6;
        Object[] objArr2 = new Object[i5];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzw(i5, objArr2);
    }

    public static int zzo(int i5) {
        int iMax = Math.max(i5, 2);
        if (iMax >= 751619276) {
            zzgtr.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgxd zzp(Collection collection) {
        if ((collection instanceof zzgxd) && !(collection instanceof SortedSet)) {
            zzgxd zzgxdVar = (zzgxd) collection;
            if (!zzgxdVar.zzf()) {
                return zzgxdVar;
            }
        }
        Object[] array = collection.toArray();
        return zzw(array.length, array);
    }

    public static zzgxd zzq(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzw(length, (Object[]) objArr.clone()) : new zzgze(objArr[0]) : zzgyu.zza;
    }

    public static zzgxc zzt(int i5) {
        zzgvp.zzb(i5, "expectedSize");
        return new zzgxc(i5, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgxd zzw(int i5, Object... objArr) {
        if (i5 == 0) {
            return zzgyu.zza;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgze(obj);
        }
        int iZzo = zzo(i5);
        Object[] objArr2 = new Object[iZzo];
        int i10 = iZzo - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            Object obj2 = objArr[i13];
            zzgym.zzb(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iZza = zzgwm.zza(iHashCode);
            while (true) {
                int i14 = iZza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i12, i5, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgze(obj4);
        }
        if (zzo(i12) < iZzo / 2) {
            return zzw(i12, objArr);
        }
        if (zzx(i12, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzgyu(objArr, i11, objArr2, i10, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzx(int i5, int i10) {
        return i5 < (i10 >> 1) + (i10 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgxd) && zzr() && ((zzgxd) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgzd.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgzd.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgzh iterator();

    @Override // com.google.android.gms.internal.ads.zzgwp
    public zzgwt zze() {
        zzgwt zzgwtVar = this.zza;
        if (zzgwtVar != null) {
            return zzgwtVar;
        }
        zzgwt zzgwtVarZzs = zzs();
        this.zza = zzgwtVarZzs;
        return zzgwtVarZzs;
    }

    public boolean zzr() {
        return false;
    }

    public zzgwt zzs() {
        Object[] array = toArray();
        int i5 = zzgwt.zzd;
        return zzgwt.zzt(array, array.length);
    }
}

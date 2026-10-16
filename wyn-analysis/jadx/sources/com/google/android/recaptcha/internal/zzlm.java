package com.google.android.recaptcha.internal;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzlm extends zzii implements RandomAccess, zzky, zzmf {
    private static final zzlm zza = new zzlm(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzlm() {
        this(new long[10], 0, true);
    }

    public static zzlm zzf() {
        return zza;
    }

    private final String zzh(int i5) {
        return v.e(i5, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i5));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i5));
        }
        int i11 = i5 + 1;
        long[] jArr = this.zzb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i5, jArr, i11, i10 - i5);
        } else {
            long[] jArr2 = new long[M6.C(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            System.arraycopy(this.zzb, i5, jArr2, i11, this.zzc - i5);
            this.zzb = jArr2;
        }
        this.zzb[i5] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzlm)) {
            return super.addAll(collection);
        }
        zzlm zzlmVar = (zzlm) collection;
        int i5 = zzlmVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        long[] jArr = this.zzb;
        if (i11 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zzlmVar.zzb, 0, this.zzb, this.zzc, zzlmVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlm)) {
            return super.equals(obj);
        }
        zzlm zzlmVar = (zzlm) obj;
        if (this.zzc != zzlmVar.zzc) {
            return false;
        }
        long[] jArr = zzlmVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (this.zzb[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzi(i5);
        return Long.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long j8 = this.zzb[i10];
            byte[] bArr = zzla.zzb;
            i5 = (i5 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i5 = this.zzc;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zzb[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzi(i5);
        long[] jArr = this.zzb;
        long j8 = jArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zza();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i10, jArr, i5, this.zzc - i10);
        this.zzc -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzi(i5);
        long[] jArr = this.zzb;
        long j8 = jArr[i5];
        jArr[i5] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    public final /* bridge */ /* synthetic */ zzkz zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzlm(Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i5) {
        zzi(i5);
        return this.zzb[i5];
    }

    public final void zzg(long j8) {
        zza();
        int i5 = this.zzc;
        long[] jArr = this.zzb;
        if (i5 == jArr.length) {
            long[] jArr2 = new long[M6.C(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = j8;
    }

    private zzlm(long[] jArr, int i5, boolean z2) {
        super(z2);
        this.zzb = jArr;
        this.zzc = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}

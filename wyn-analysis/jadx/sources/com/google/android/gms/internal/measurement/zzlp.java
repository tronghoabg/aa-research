package com.google.android.gms.internal.measurement;

import R8.v;
import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzlp<E> extends zzie<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzlp<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzlp<>(objArr, 0, false);
    }

    public zzlp() {
        this(zza, 0, true);
    }

    private static int zzc(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    public static <E> zzlp<E> zzd() {
        return (zzlp<E>) zzb;
    }

    private final void zze(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzd(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final void add(int i5, E e7) {
        int i10;
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzd(i5));
        }
        E[] eArr = this.zzc;
        if (i10 < eArr.length) {
            System.arraycopy(eArr, i5, eArr, i5 + 1, i10 - i5);
        } else {
            E[] eArr2 = (E[]) new Object[zzc(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i5);
            System.arraycopy(this.zzc, i5, eArr2, i5 + 1, this.zzd - i5);
            this.zzc = eArr2;
        }
        this.zzc[i5] = e7;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i5) {
        zze(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final E remove(int i5) {
        zza();
        zze(i5);
        E[] eArr = this.zzc;
        E e7 = eArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(eArr, i5 + 1, eArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final E set(int i5, E e7) {
        zza();
        zze(i5);
        E[] eArr = this.zzc;
        E e10 = eArr[i5];
        eArr[i5] = e7;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc zza(int i5) {
        if (i5 >= this.zzd) {
            return new zzlp(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzb(int i5) {
        E[] eArr = this.zzc;
        if (i5 <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.zzc = (E[]) new Object[Math.max(i5, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i5) {
            length = zzc(length);
        }
        this.zzc = (E[]) Arrays.copyOf(this.zzc, length);
    }

    private zzlp(E[] eArr, int i5, boolean z2) {
        super(z2);
        this.zzc = eArr;
        this.zzd = i5;
    }

    private final String zzd(int i5) {
        return v.e(i5, this.zzd, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        zza();
        int i5 = this.zzd;
        E[] eArr = this.zzc;
        if (i5 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzc(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        eArr2[i10] = e7;
        ((AbstractList) this).modCount++;
        return true;
    }
}

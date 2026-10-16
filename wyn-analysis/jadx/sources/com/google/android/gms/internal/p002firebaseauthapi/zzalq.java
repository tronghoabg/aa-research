package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzalq<E> extends zzaij<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzalq<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzalq<>(objArr, 0, false);
    }

    public zzalq() {
        this(zza, 0, true);
    }

    private static int zzb(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    private final String zzc(int i5) {
        return v.e(i5, this.zzd, "Index:", ", Size:");
    }

    public static <E> zzalq<E> zzd() {
        return (zzalq<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final void add(int i5, E e7) {
        int i10;
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i5));
        }
        E[] eArr = this.zzc;
        if (i10 < eArr.length) {
            System.arraycopy(eArr, i5, eArr, i5 + 1, i10 - i5);
        } else {
            E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
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
        zzd(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final E remove(int i5) {
        zza();
        zzd(i5);
        E[] eArr = this.zzc;
        E e7 = eArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(eArr, i5 + 1, eArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final E set(int i5, E e7) {
        zza();
        zzd(i5);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakc
    public final /* synthetic */ zzakc zza(int i5) {
        if (i5 >= this.zzd) {
            return new zzalq(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzalq(E[] eArr, int i5, boolean z2) {
        super(z2);
        this.zzc = eArr;
        this.zzd = i5;
    }

    private final void zzd(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i5));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        zza();
        int i5 = this.zzd;
        E[] eArr = this.zzc;
        if (i5 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        eArr2[i10] = e7;
        ((AbstractList) this).modCount++;
        return true;
    }
}

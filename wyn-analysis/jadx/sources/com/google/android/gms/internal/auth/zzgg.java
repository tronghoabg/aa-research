package com.google.android.gms.internal.auth;

import R8.v;
import Va.M6;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzgg extends zzdr implements RandomAccess {
    private static final zzgg zza = new zzgg(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzgg() {
        this(new Object[10], 0, true);
    }

    public static zzgg zze() {
        return zza;
    }

    private final String zzf(int i5) {
        return v.e(i5, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
        Object[] objArr = this.zzb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i5, objArr, i5 + 1, i10 - i5);
        } else {
            Object[] objArr2 = new Object[M6.C(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i5);
            System.arraycopy(this.zzb, i5, objArr2, i5 + 1, this.zzc - i5);
            this.zzb = objArr2;
        }
        this.zzb[i5] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        zzg(i5);
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zza();
        zzg(i5);
        Object[] objArr = this.zzb;
        Object obj = objArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zza();
        zzg(i5);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzgg(Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzgg(Object[] objArr, int i5, boolean z2) {
        super(z2);
        this.zzb = objArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i5 = this.zzc;
        Object[] objArr = this.zzb;
        if (i5 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

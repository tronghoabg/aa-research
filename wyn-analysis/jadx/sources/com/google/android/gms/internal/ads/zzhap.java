package com.google.android.gms.internal.ads;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
final class zzhap extends AbstractList implements RandomAccess, Serializable, List {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzhap(int[] iArr, int i5, int i10) {
        this.zza = iArr;
        this.zzb = i5;
        this.zzc = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzhaq.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhap)) {
            return super.equals(obj);
        }
        zzhap zzhapVar = (zzhap) obj;
        int i5 = this.zzc;
        int i10 = this.zzb;
        int i11 = zzhapVar.zzc;
        int i12 = zzhapVar.zzb;
        int i13 = i5 - i10;
        if (i11 - i12 != i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zza[i10 + i14] != zzhapVar.zza[i12 + i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        int i10 = this.zzc;
        int i11 = this.zzb;
        zzgtr.zzm(i5, i10 - i11, "index");
        return Integer.valueOf(this.zza[i11 + i5]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = this.zzb; i10 < this.zzc; i10++) {
            i5 = (i5 * 31) + this.zza[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i5 = this.zzb;
        int iZzi = zzhaq.zzi(iArr, iIntValue, i5, this.zzc);
        if (iZzi >= 0) {
            return iZzi - i5;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i5 = this.zzb;
            int i10 = this.zzc - 1;
            while (true) {
                if (i10 < i5) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == iIntValue) {
                    break;
                }
                i10--;
            }
            if (i10 >= 0) {
                return i10 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        int i10 = this.zzc;
        int i11 = this.zzb;
        Integer num = (Integer) obj;
        zzgtr.zzm(i5, i10 - i11, "index");
        int[] iArr = this.zza;
        int i12 = i11 + i5;
        int i13 = iArr[i12];
        num.getClass();
        iArr[i12] = num.intValue();
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i5, int i10) {
        int i11 = this.zzc;
        int i12 = this.zzb;
        zzgtr.zzo(i5, i10, i11 - i12);
        return i5 == i10 ? Collections.EMPTY_LIST : new zzhap(this.zza, i5 + i12, i12 + i10);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i5 = this.zzc;
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder((i5 - i10) * 5);
        sb2.append('[');
        int[] iArr = this.zza;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= i5) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public abstract class zzal<E> extends zzak<E> implements List<E>, RandomAccess, j$.util.List {
    private static final zzbb<Object> zza = new zzan(zzat.zza, 0);

    public static <E> zzal<E> zzb(Object[] objArr, int i5) {
        return i5 == 0 ? (zzal<E>) zzat.zza : new zzat(objArr, i5);
    }

    public static <E> zzao<E> zzg() {
        return new zzao<>();
    }

    public static <E> zzal<E> zzh() {
        return (zzal<E>) zzat.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i5, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i5, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzy.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i5 = 0; i5 < size; i5++) {
                        if (zzr.zza(get(i5), list.get(i5))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e7 = get(i10);
                        i10++;
                        if (!zzr.zza(e7, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i5 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i5 = ~(~(get(i10).hashCode() + (i5 * 31)));
        }
        return i5;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (obj.equals(get(i5))) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzbb) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i5, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public int zza(Object[] objArr, int i5) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i5 + i10] = get(i10);
        }
        return i5 + size;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    @Deprecated
    public final zzal<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzbc<E> iterator() {
        return (zzbb) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i5) {
        zzy.zzb(i5, size());
        return isEmpty() ? zza : new zzan(this, i5);
    }

    public static <E> zzal<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzal<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC3256n.g(i5, "at index "));
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzal<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzak) {
            zzal<E> zzalVarZzc = ((zzak) collection).zzc();
            if (!zzalVarZzc.zze()) {
                return zzalVarZzc;
            }
            Object[] array = zzalVarZzc.toArray();
            return zzb(array, array.length);
        }
        return zzb(collection.toArray());
    }

    public static <E> zzal<E> zza(E e7, E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return zzb(e7, e10, e11, e12, e13, e14, e15, e16);
    }

    @Override // java.util.List
    /* renamed from: zza */
    public zzal<E> subList(int i5, int i10) {
        zzy.zza(i5, i10, size());
        int i11 = i10 - i5;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return (zzal<E>) zzat.zza;
        }
        return new zzaq(this, i5, i11);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aah<E> extends defpackage.aat<E> implements java.util.Set<E>, defpackage.afhh {
    public final defpackage.aaq a;

    public aah(defpackage.aaq aaqVar) {
        super(aaqVar);
        this.a = aaqVar;
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.a.f(e);
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        defpackage.aaq aaqVar = this.a;
        int i = aaqVar.g;
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            aaqVar.d(it.next());
        }
        return i != aaqVar.g;
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.c();
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new defpackage.aaj(this, 1);
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.g(obj);
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        defpackage.aaq aaqVar = this.a;
        int i = aaqVar.g;
        java.util.Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            int iHashCode = next != null ? next.hashCode() : 0;
            int i4 = aaqVar.f;
            int i5 = iHashCode * (-862048943);
            int i6 = i5 ^ (i5 << 16);
            int i7 = (i6 >>> 7) & i4;
            while (true) {
                long[] jArr = aaqVar.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                int i10 = i2;
                int i11 = i3;
                long j = (((-i9) >> 63) & (jArr[i8 + i2] << (64 - i9))) | (jArr[i8] >>> i9);
                long j2 = (((long) (i6 & 127)) * 72340172838076673L) ^ j;
                for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                    iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i7) & i4;
                    if (defpackage.afga.f(aaqVar.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                }
                if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 = i11 + 8;
                i7 = (i7 + i3) & i4;
                i2 = i10;
            }
            if (iNumberOfTrailingZeros >= 0) {
                aaqVar.e(iNumberOfTrailingZeros);
            }
        }
        return i != aaqVar.g;
    }

    @Override // defpackage.aat, java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aak<E> extends defpackage.aay<E> implements java.util.Set<E>, defpackage.afhh {
    public final defpackage.aaw a;

    public aak(defpackage.aaw aawVar) {
        super(aawVar);
        this.a = aawVar;
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.a.j(e);
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        return this.a.k(collection);
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new defpackage.aaj(this, 0);
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.l(obj);
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.aaw aawVar = this.a;
        int i = aawVar.d;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            aawVar.e(it.next());
        }
        return i != aawVar.d;
    }

    @Override // defpackage.aay, java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i;
        collection.getClass();
        defpackage.aaw aawVar = this.a;
        java.lang.Object[] objArr = aawVar.b;
        int i2 = aawVar.d;
        long[] jArr = aawVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!defpackage.afga.bh(collection, objArr[i6])) {
                                aawVar.i(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != aawVar.d;
    }
}

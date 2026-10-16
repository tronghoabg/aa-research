package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class aad<E> extends aar<E> implements Set<E>, afgh {
    public final aap a;

    public aad(aap aapVar) {
        super(aapVar);
        this.a = aapVar;
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.a.j(e);
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        return this.a.k(collection);
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new aac(this, 0);
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.l(obj);
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        aap aapVar = this.a;
        int i = aapVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aapVar.e(it.next());
        }
        return i != aapVar.d;
    }

    @Override // defpackage.aar, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        aap aapVar = this.a;
        Object[] objArr = aapVar.b;
        int i2 = aapVar.d;
        long[] jArr = aapVar.a;
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
                            if (!woy.cn(collection, objArr[i6])) {
                                aapVar.i(i6);
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
        return i2 != aapVar.d;
    }
}

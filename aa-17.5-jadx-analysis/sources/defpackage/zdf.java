package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public final class zdf extends AbstractList implements RandomAccess, Serializable, List {
    private final zdg a;

    public zdf(zdg zdgVar) {
        this.a = zdgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj instanceof zdf) {
            return this.a.equals(((zdf) obj).a);
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) obj;
        if (size() != list.size()) {
            return false;
        }
        zdg zdgVar = this.a;
        zdg zdgVar2 = zdg.a;
        int i = zdgVar.c;
        for (Object obj2 : list) {
            if (obj2 instanceof Integer) {
                int i2 = i + 1;
                if (zdgVar.b[i] == ((Integer) obj2).intValue()) {
                    i = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(this.a.a(i));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            zdg zdgVar = this.a;
            int iIntValue = ((Integer) obj).intValue();
            int i = zdgVar.c;
            for (int i2 = i; i2 < zdgVar.d; i2++) {
                if (zdgVar.b[i2] == iIntValue) {
                    return i2 - i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            zdg zdgVar = this.a;
            int iIntValue = ((Integer) obj).intValue();
            int i = zdgVar.d - 1;
            while (true) {
                int i2 = zdgVar.c;
                if (i < i2) {
                    break;
                }
                if (zdgVar.b[i] == iIntValue) {
                    return i - i2;
                }
                i--;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        zdg zdgVar = this.a;
        return Spliterators.spliterator(zdgVar.b, zdgVar.c, zdgVar.d, 1040);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        zdg zdgVar;
        zdg zdgVar2 = this.a;
        woy.Y(i, i2, zdgVar2.b());
        if (i == i2) {
            zdgVar = zdg.a;
        } else {
            int[] iArr = zdgVar2.b;
            int i3 = zdgVar2.c;
            zdgVar = new zdg(iArr, i + i3, i3 + i2);
        }
        return new zdf(zdgVar);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }
}

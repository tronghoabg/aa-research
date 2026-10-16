package defpackage;

import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final class aexh<K> extends aerl<K> implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353131L;
    protected transient Object[] a;
    public int b;

    static {
        Collector.CC.of(new aetn(4), new mac(7), new rib(9), new Collector.Characteristics[0]);
    }

    public aexh(byte[] bArr) {
        this.a = new Object[2];
    }

    private final void o(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr != aett.b) {
            i = (int) Math.max(Math.min(length + (length >> 1), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        Object[] objArr2 = new Object[i];
        System.arraycopy(this.a, 0, objArr2, 0, this.b);
        this.a = objArr2;
    }

    private static final Object[] p(Object[] objArr, int i) {
        return i == 0 ? aett.a : Arrays.copyOf(objArr, i, Object[].class);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.b];
        this.a = objArr;
        for (int i = 0; i < this.b; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    @Override // defpackage.aerl, java.util.List
    public final void add(int i, K k) {
        i(i);
        o(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            Object[] objArr = this.a;
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        this.a[i] = k;
        this.b++;
    }

    @Override // defpackage.aerl, java.util.List
    public final boolean addAll(int i, Collection<? extends K> collection) {
        if (collection instanceof aexm) {
            return l(i, (aexm) collection);
        }
        i(i);
        int size = collection.size();
        if (size == 0) {
            return false;
        }
        o(this.b + size);
        Object[] objArr = this.a;
        System.arraycopy(objArr, i, objArr, i + size, this.b - i);
        Iterator<? extends K> it = collection.iterator();
        this.b += size;
        while (size != 0) {
            size--;
            this.a[i] = it.next();
            i++;
        }
        return true;
    }

    @Override // defpackage.aerl, defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aetr(this, 2);
    }

    @Override // defpackage.aerl
    /* renamed from: c */
    public final aexm subList(int i, int i2) {
        if (i == 0) {
            if (i2 == this.b) {
                return this;
            }
            i = 0;
        }
        i(i);
        i(i2);
        if (i <= i2) {
            return new aexg(this, i, i2);
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aerl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    @Override // defpackage.aerl, defpackage.aexm
    /* renamed from: d */
    public final aeui listIterator(int i) {
        i(i);
        return new aexd(this, i, 0);
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final void e(int i, Object[] objArr, int i2, int i3) {
        aett.a(objArr, i2, i3);
        System.arraycopy(this.a, i, objArr, i2, i3);
    }

    @Override // defpackage.aerl, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof aexh)) {
            return obj instanceof aexg ? ((aexg) obj).equals(this) : super.equals(obj);
        }
        aexh<K> aexhVar = (aexh) obj;
        if (aexhVar == this) {
            return true;
        }
        int i = this.b;
        int i2 = aexhVar.b;
        if (i != i2) {
            return false;
        }
        Object[] objArr = this.a;
        Object[] objArr2 = aexhVar.a;
        if (objArr == objArr2 && i == i2) {
            return true;
        }
        while (i != 0) {
            i--;
            if (objArr[i] != objArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final void f(int i, int i2) {
        adqs.r(this.b, i, i2);
        Object[] objArr = this.a;
        System.arraycopy(objArr, i2, objArr, i, this.b - i2);
        int i3 = i2 - i;
        this.b -= i3;
        while (i3 != 0) {
            i3--;
            this.a[this.b + i3] = null;
        }
    }

    @Override // defpackage.aerl, defpackage.aerf, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super K> consumer) {
        Object[] objArr = this.a;
        for (int i = 0; i < this.b; i++) {
            consumer.accept(objArr[i]);
        }
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final void g(int i, Object[] objArr, int i2) {
        i(i);
        aett.a(objArr, 0, i2);
        int i3 = i + i2;
        int i4 = this.b;
        if (i3 > i4) {
            throw new IndexOutOfBoundsException(a.bB(i4, i3, "End index (", ") is greater than list size (", ")"));
        }
        System.arraycopy(objArr, 0, this.a, i, i2);
    }

    @Override // java.util.List
    public final K get(int i) {
        int i2 = this.b;
        if (i < i2) {
            return (K) this.a[i];
        }
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
    }

    @Override // defpackage.aerl, java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.a;
        for (int i = 0; i < this.b; i++) {
            if (obj == objArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final boolean l(int i, aexm aexmVar) {
        i(i);
        int size = aexmVar.size();
        if (size == 0) {
            return false;
        }
        o(this.b + size);
        Object[] objArr = this.a;
        System.arraycopy(objArr, i, objArr, i + size, this.b - i);
        aexmVar.e(0, this.a, i, size);
        this.b += size;
        return true;
    }

    @Override // defpackage.aerl, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (obj == objArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.aerl, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final aexh clone() {
        if (getClass() == aexh.class) {
            aexh aexhVar = new aexh(p(this.a, this.b));
            aexhVar.b = this.b;
            return aexhVar;
        }
        try {
            aexh aexhVar2 = (aexh) super.clone();
            aexhVar2.a = p(this.a, this.b);
            return aexhVar2;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // defpackage.aerl, java.util.List
    public final K remove(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        Object[] objArr = this.a;
        K k = (K) objArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        if (i != i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        }
        objArr[this.b] = null;
        return k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(objArr[i2])) {
                objArr[i3] = objArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(objArr, i3, i, (Object) null);
        boolean z = this.b != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aerf, java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate<? super K> predicate) {
        int i;
        Object[] objArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!predicate.test(objArr[i2])) {
                objArr[i3] = objArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(objArr, i3, i, (Object) null);
        boolean z = this.b != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aerl, java.util.List
    public final K set(int i, K k) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        Object[] objArr = this.a;
        K k2 = (K) objArr[i];
        objArr[i] = k;
        return k2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aerl, j$.util.List
    public final void sort(Comparator<? super K> comparator) {
        Object[] objArr = this.a;
        int i = this.b;
        if (comparator == null) {
            Arrays.sort(objArr, 0, i);
        } else {
            Arrays.sort(objArr, 0, i, comparator);
        }
    }

    @Override // defpackage.aerl, defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aetr(this, 2);
    }

    @Override // defpackage.aerl, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aerl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        int i = this.b;
        if (tArr == null) {
            tArr = (T[]) new Object[i];
        } else if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.b));
        }
        System.arraycopy(this.a, 0, tArr, 0, this.b);
        int length = tArr.length;
        int i2 = this.b;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public aexh() {
        this.a = aett.b;
    }

    protected aexh(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.aerl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        o(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = k;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // defpackage.aerl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = this.b;
        return i == 0 ? aett.a : Arrays.copyOf(this.a, i, Object[].class);
    }
}

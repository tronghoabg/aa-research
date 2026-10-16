package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes.dex */
public abstract class yhc<E> extends ygr<E> implements NavigableSet<E>, SortedSet<E>, ymr {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient yhc b;

    public yhc(Comparator comparator) {
        this.a = comparator;
    }

    static ylz F(Comparator comparator) {
        if (yli.a.equals(comparator)) {
            return ylz.c;
        }
        int i = yfq.d;
        return new ylz(yls.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static yhc w(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return F(comparator);
        }
        yrm.B(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new ylz(yfq.l(objArr, i2), comparator);
    }

    public abstract yhc A(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final yhc subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        woy.N(this.a.compare(obj, obj2) <= 0);
        return C(obj, z, obj2, z2);
    }

    public abstract yhc C(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final yhc tailSet(Object obj, boolean z) {
        obj.getClass();
        return E(obj, z);
    }

    public abstract yhc E(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public abstract yno descendingIterator();

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return yrm.au(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.ymr
    public final Comparator comparator() {
        return this.a;
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract yno iterator();

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return yrm.ai(headSet(obj, true).descendingIterator());
    }

    public final E getFirst() {
        return (E) first();
    }

    public final E getLast() {
        return (E) last();
    }

    final int h(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return yrm.au(tailSet(obj, false));
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return yrm.ai(headSet(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return new yhb(this.a, toArray());
    }

    public abstract yhc x();

    @Override // java.util.NavigableSet
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final yhc descendingSet() {
        yhc yhcVar = this.b;
        if (yhcVar != null) {
            return yhcVar;
        }
        yhc yhcVarX = x();
        this.b = yhcVarX;
        yhcVarX.b = this;
        return yhcVarX;
    }

    @Override // java.util.NavigableSet
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final yhc headSet(Object obj, boolean z) {
        obj.getClass();
        return A(obj, z);
    }
}

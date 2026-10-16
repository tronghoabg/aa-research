package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
class aejh implements Serializable, Collection, aejf {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aejf a;

    protected aejh(aejf aejfVar) {
        this.a = aejfVar;
    }

    @Deprecated
    public static boolean f() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aejr iterator() {
        return new aejw(new aekc((aeke) this.a));
    }

    @Override // java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return f();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends Integer> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection, java.lang.Iterable, j$.lang.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aekm spliterator() {
        return new aekd((aeke) this.a);
    }

    @Override // defpackage.aejf
    public boolean c(int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aejf, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // defpackage.aejf
    public boolean d(aejf aejfVar) {
        throw null;
    }

    @Override // defpackage.aejf
    public final boolean e(int i) {
        return this.a.e(i);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // defpackage.aejf
    public boolean g(int i) {
        throw null;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aejf
    public final boolean i(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.aejf
    public final int[] k() {
        throw null;
    }

    @Override // j$.util.Collection
    @Deprecated
    public final Stream<Integer> parallelStream() {
        return Collection.CC.$default$parallelStream(this.a);
    }

    @Override // java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return adzo.r(this, predicate);
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return ((aeke) this.a).g;
    }

    @Override // j$.util.Collection
    @Deprecated
    public final Stream<Integer> stream() {
        return Collection.CC.$default$stream(this.a);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.a.toArray();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.a.toArray(tArr);
    }
}

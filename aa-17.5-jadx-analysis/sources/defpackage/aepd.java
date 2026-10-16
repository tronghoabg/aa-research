package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
class aepd implements Serializable, Collection, aepb {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aepb a;

    protected aepd(aepb aepbVar) {
        aepbVar.getClass();
        this.a = aepbVar;
    }

    @Deprecated
    public static boolean d() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aepm iterator() {
        return new aepq(this.a.iterator());
    }

    @Override // java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return d();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends Long> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection, java.lang.Iterable, j$.lang.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aeqd spliterator() {
        return this.a.spliterator();
    }

    @Override // defpackage.aepb
    public boolean c(long j) {
        throw null;
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aepb, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // defpackage.aepb
    public final boolean e(long j) {
        return this.a.e(j);
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

    @Override // defpackage.aepb
    public boolean g(long j) {
        throw null;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aepb
    public final boolean i(LongPredicate longPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.aepb
    public long[] k() {
        throw null;
    }

    @Override // j$.util.Collection
    @Deprecated
    public final Stream<Long> parallelStream() {
        return this.a.parallelStream();
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
        return adqq.at(this, predicate);
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // j$.util.Collection
    @Deprecated
    public final Stream<Long> stream() {
        return this.a.stream();
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

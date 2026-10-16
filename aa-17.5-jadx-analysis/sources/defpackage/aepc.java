package defpackage;

import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class aepc extends aeld {
    protected aepc() {
    }

    @Override // defpackage.aeld, defpackage.aepb
    /* renamed from: a */
    public /* bridge */ /* synthetic */ aepm m() {
        throw null;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return aeqj.a;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // defpackage.aeld
    public final boolean d(aepb aepbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return false;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aeld
    public final boolean f(aepb aepbVar) {
        return aepbVar.isEmpty();
    }

    @Override // defpackage.aeld
    public final boolean h(aepb aepbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean i(LongPredicate longPredicate) {
        longPredicate.getClass();
        return false;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public /* synthetic */ Iterator m() {
        return aepr.a;
    }

    @Override // defpackage.aeld
    public final boolean j(aepb aepbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final long[] k() {
        throw null;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeld, java.util.Collection, j$.util.Collection
    @Deprecated
    public final boolean removeIf(Predicate<? super Long> predicate) {
        predicate.getClass();
        return false;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return aeqj.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return aett.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // defpackage.aeld, java.lang.Iterable, j$.util.Collection, j$.lang.a
    @Deprecated
    public final void forEach(Consumer<? super Long> consumer) {
    }
}

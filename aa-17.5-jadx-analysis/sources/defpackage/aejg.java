package defpackage;

import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class aejg extends aegj {
    protected aejg() {
    }

    @Override // defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public /* bridge */ /* synthetic */ aejr iterator() {
        throw null;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return aekt.a;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean d(aejf aejfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
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

    @Override // defpackage.aegj
    public final boolean f(aejf aejfVar) {
        return aejfVar.isEmpty();
    }

    @Override // defpackage.aegj
    public final boolean h(aejf aejfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean i(IntPredicate intPredicate) {
        intPredicate.getClass();
        return false;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public /* synthetic */ Iterator m() {
        return aejx.a;
    }

    @Override // defpackage.aegj
    public final boolean j(aejf aejfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final int[] k() {
        throw null;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, java.util.Collection, j$.util.Collection
    @Deprecated
    public final boolean removeIf(Predicate<? super Integer> predicate) {
        predicate.getClass();
        return false;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return aekt.a;
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

    @Override // defpackage.aegj, java.lang.Iterable, j$.util.Collection, j$.lang.a
    @Deprecated
    public final void forEach(Consumer<? super Integer> consumer) {
    }
}

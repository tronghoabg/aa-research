package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final class aekh extends aegr implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public final /* synthetic */ aejr iterator() {
        return new aejv();
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aekr();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean d(aejf aejfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        return i == 0;
    }

    @Override // defpackage.aegj, java.lang.Iterable, j$.util.Collection, j$.lang.a
    @Deprecated
    public final void forEach(Consumer<? super Integer> consumer) {
        consumer.accept(0);
    }

    @Override // defpackage.aegj
    public final boolean h(aejf aejfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean i(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return new aejv();
    }

    @Override // defpackage.aegj
    public final boolean j(aejf aejfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegr
    public final boolean l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, java.util.Collection, j$.util.Collection
    @Deprecated
    public final boolean removeIf(Predicate<? super Integer> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aekr();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final Object[] toArray() {
        return new Object[]{0};
    }

    public final Object clone() {
        return this;
    }
}

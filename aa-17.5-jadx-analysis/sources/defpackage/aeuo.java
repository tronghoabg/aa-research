package defpackage;

import j$.util.Objects;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final class aeuo<K> extends aeqw<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final Object a;

    protected aeuo(Object obj) {
        this.a = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeux(this.a);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aeui iterator() {
        return new aeuc(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Objects.equals(obj, this.a);
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super K> consumer) {
        consumer.accept(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqq, java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate<? super K> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return new Object[]{this.a};
    }

    public final Object clone() {
        return this;
    }
}

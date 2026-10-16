package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zcq<E> extends yef<E> {
    final List a;

    public zcq(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.yef, defpackage.yec
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        e.getClass();
        return this.a.add(e);
    }

    @Override // defpackage.yef, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.a.addAll(i, zeb.p(collection));
    }

    @Override // defpackage.yef
    protected final List c() {
        return this.a;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yef, java.util.List
    public final ListIterator listIterator() {
        return new zcr(this.a.listIterator());
    }

    @Override // defpackage.yef, java.util.List
    public final E set(int i, E e) {
        e.getClass();
        return (E) this.a.set(i, e);
    }

    @Override // defpackage.yef, java.util.List
    public final List subList(int i, int i2) {
        return new zcq(this.a.subList(i, i2));
    }

    @Override // defpackage.yef, java.util.List
    public final void add(int i, E e) {
        e.getClass();
        this.a.add(i, e);
    }

    @Override // defpackage.yec, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(zeb.p(collection));
    }

    @Override // defpackage.yef, java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new zcr(this.a.listIterator(i));
    }
}

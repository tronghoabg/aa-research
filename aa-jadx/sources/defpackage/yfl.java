package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfl<E> extends defpackage.yfi<E> implements java.util.List<E> {
    protected yfl() {
    }

    @Override // defpackage.yfi
    protected /* bridge */ /* synthetic */ java.util.Collection a() {
        throw null;
    }

    @Override // java.util.List
    public void add(int i, E e) {
        c().add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends E> collection) {
        return c().addAll(i, collection);
    }

    protected abstract java.util.List c();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        return (E) c().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return c().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return c().lastIndexOf(obj);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return c().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        return (E) c().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return (E) c().set(i, e);
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return c().subList(i, i2);
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int i) {
        return c().listIterator(i);
    }
}

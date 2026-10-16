package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zdw<E> extends defpackage.yfl<E> {
    final java.util.List a;

    public zdw(java.util.List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.yfl, defpackage.yfi
    protected final /* synthetic */ java.util.Collection a() {
        return this.a;
    }

    @Override // defpackage.yfi, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        e.getClass();
        return this.a.add(e);
    }

    @Override // defpackage.yfl, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        return this.a.addAll(i, defpackage.ytn.j(collection));
    }

    @Override // defpackage.yfl
    protected final java.util.List c() {
        return this.a;
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.a;
    }

    @Override // defpackage.yfl, java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.zdx(this.a.listIterator());
    }

    @Override // defpackage.yfl, java.util.List
    public final E set(int i, E e) {
        e.getClass();
        return (E) this.a.set(i, e);
    }

    @Override // defpackage.yfl, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new defpackage.zdw(this.a.subList(i, i2));
    }

    @Override // defpackage.yfl, java.util.List
    public final void add(int i, E e) {
        e.getClass();
        this.a.add(i, e);
    }

    @Override // defpackage.yfi, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        return this.a.addAll(defpackage.ytn.j(collection));
    }

    @Override // defpackage.yfl, java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        return new defpackage.zdx(this.a.listIterator(i));
    }
}

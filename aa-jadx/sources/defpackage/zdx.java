package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zdx<E> extends defpackage.yfm<E> {
    private final java.util.ListIterator a;

    public zdx(java.util.ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.yfm, defpackage.yfk
    protected final /* synthetic */ java.util.Iterator a() {
        return this.a;
    }

    @Override // defpackage.yfm, java.util.ListIterator
    public final void add(E e) {
        e.getClass();
        this.a.add(e);
    }

    @Override // defpackage.yfm
    protected final java.util.ListIterator c() {
        return this.a;
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.a;
    }

    @Override // defpackage.yfm, java.util.ListIterator
    public final void set(E e) {
        e.getClass();
        this.a.set(e);
    }
}

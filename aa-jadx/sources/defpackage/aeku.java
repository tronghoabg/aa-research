package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeku implements java.io.Serializable, java.lang.Cloneable, j$.util.Iterator, defpackage.aelb {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeku() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aekx.a;
    }

    @Override // defpackage.aekd
    public final int a() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        d((java.lang.Integer) obj);
    }

    @Override // defpackage.aelb
    public final /* synthetic */ java.lang.Integer b() {
        throw null;
    }

    @Override // defpackage.aelb
    public final /* synthetic */ void c(int i) {
        defpackage.aefc.U();
    }

    public final java.lang.Object clone() {
        return defpackage.aekx.a;
    }

    @Override // defpackage.aelb
    public final /* synthetic */ void d(java.lang.Integer num) {
        defpackage.aefc.Q(this, num);
    }

    @Override // defpackage.aelb
    public final /* synthetic */ void e(int i) {
        defpackage.aefc.W();
    }

    @Override // defpackage.aelb
    public final /* synthetic */ void f(java.lang.Integer num) {
        defpackage.aefc.S(this, num);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) intConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final boolean hasPrevious() {
        return false;
    }

    @Override // defpackage.aelb, java.util.ListIterator, java.util.Iterator, defpackage.aekr, j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ java.lang.Integer next() {
        return defpackage.aefc.Y(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // defpackage.aekr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final /* synthetic */ java.lang.Object previous() {
        return defpackage.aeao.l(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // defpackage.aelb, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        defpackage.aefc.V();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        f((java.lang.Integer) obj);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(java.util.function.IntConsumer intConsumer) {
    }

    @Override // j$.util.Iterator, java.util.Iterator
    @java.lang.Deprecated
    public final void forEachRemaining(java.util.function.Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return defpackage.aefc.Y(this);
    }
}

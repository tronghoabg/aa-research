package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeqp implements java.io.Serializable, java.lang.Cloneable, j$.util.Iterator, defpackage.aeqt {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeqp() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aeqr.a;
    }

    @Override // defpackage.aepz
    public final long a() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        d((java.lang.Long) obj);
    }

    @Override // defpackage.aeqt
    public final /* synthetic */ java.lang.Long b() {
        throw null;
    }

    @Override // defpackage.aeqt
    public final /* synthetic */ void c(long j) {
        defpackage.adrq.ab();
    }

    public final java.lang.Object clone() {
        return defpackage.aeqr.a;
    }

    @Override // defpackage.aeqt
    public final /* synthetic */ void d(java.lang.Long l) {
        defpackage.adrq.X(this, l);
    }

    @Override // defpackage.aeqt
    public final /* synthetic */ void e(long j) {
        defpackage.adrq.ac();
    }

    @Override // defpackage.aeqt
    public final /* synthetic */ void f(java.lang.Long l) {
        defpackage.adrq.Z(this, l);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        defpackage.a$$ExternalSyntheticApiModelOutline2.m41m((java.lang.Object) longConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final boolean hasPrevious() {
        return false;
    }

    @Override // defpackage.aeqt, java.util.ListIterator, java.util.Iterator, defpackage.aeqm, j$.util.PrimitiveIterator.OfLong
    public final /* synthetic */ java.lang.Long next() {
        return defpackage.adrq.ad(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // defpackage.aeqm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final /* synthetic */ java.lang.Object previous() {
        return defpackage.adrq.ak(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // defpackage.aeqt, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        f((java.lang.Long) obj);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(java.util.function.LongConsumer longConsumer) {
    }

    @Override // j$.util.Iterator, java.util.Iterator
    @java.lang.Deprecated
    public final void forEachRemaining(java.util.function.Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return defpackage.adrq.ad(this);
    }
}

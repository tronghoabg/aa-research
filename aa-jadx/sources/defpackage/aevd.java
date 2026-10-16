package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aevd<K> implements j$.util.Iterator<K>, defpackage.aeuy {
    protected final defpackage.aeuy a;

    public aevd(defpackage.aeuy aeuyVar) {
        this.a = aeuyVar;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.EL.forEachRemaining(this.a, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        return this.a.next();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahpx<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> iterator;

    public ahpx(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public java.util.Map.Entry<K, java.lang.Object> next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.iterator.next();
        return next.getValue() instanceof defpackage.ahpy ? new defpackage.ahpw(next) : next;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }
}

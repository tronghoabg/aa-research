package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abpm implements java.util.Iterator {
    private final java.util.Iterator a;

    public abpm(java.util.Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
        return entry.getValue() instanceof defpackage.abpn ? new defpackage.abpl(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}

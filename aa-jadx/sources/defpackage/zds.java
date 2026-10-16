package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zds implements java.util.Iterator {
    final /* synthetic */ java.util.Iterator a;

    public zds(java.util.Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return (java.util.Collection) ((java.util.Map.Entry) this.a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}

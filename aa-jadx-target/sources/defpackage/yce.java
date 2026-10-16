package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yce implements java.util.Iterator {
    java.util.Map.Entry a;
    final /* synthetic */ java.util.Iterator b;
    final /* synthetic */ defpackage.ycf c;

    public yce(defpackage.ycf ycfVar, java.util.Iterator it) {
        this.b = it;
        this.c = ycfVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.ysr.bk(this.a != null, "no calls to next() since the last call to remove()");
        java.util.Collection collection = (java.util.Collection) this.a.getValue();
        this.b.remove();
        this.c.a.b -= collection.size();
        collection.clear();
        this.a = null;
    }
}

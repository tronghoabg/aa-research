package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yhn extends defpackage.yot {
    final java.util.Iterator a;
    java.lang.Object b = null;
    java.util.Iterator c = defpackage.yiw.a;
    final /* synthetic */ defpackage.yhs d;

    public yhn(defpackage.yhs yhsVar) {
        this.d = yhsVar;
        this.a = yhsVar.map.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (!this.c.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((defpackage.ygm) entry.getValue()).iterator();
        }
        java.lang.Object obj = this.b;
        obj.getClass();
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, this.c.next());
    }
}

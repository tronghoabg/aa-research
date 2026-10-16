package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class ycd<T> implements java.util.Iterator<T> {
    final java.util.Iterator a;
    java.lang.Object b = null;
    java.util.Collection c = null;
    java.util.Iterator d = defpackage.yiy.INSTANCE;
    final /* synthetic */ defpackage.ycs e;

    public ycd(defpackage.ycs ycsVar) {
        this.e = ycsVar;
        this.a = ycsVar.a.entrySet().iterator();
    }

    public abstract java.lang.Object a(java.lang.Object obj, java.lang.Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.d.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
            this.b = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return (T) a(this.b, this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        java.util.Collection collection = this.c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        this.e.b--;
    }
}

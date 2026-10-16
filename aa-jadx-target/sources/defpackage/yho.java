package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yho extends defpackage.yot {
    final java.util.Iterator a;
    java.util.Iterator b = defpackage.yiw.a;
    final /* synthetic */ defpackage.yhs c;

    public yho(defpackage.yhs yhsVar) {
        this.c = yhsVar;
        this.a = yhsVar.map.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.b.hasNext()) {
            this.b = ((defpackage.ygm) this.a.next()).iterator();
        }
        return this.b.next();
    }
}

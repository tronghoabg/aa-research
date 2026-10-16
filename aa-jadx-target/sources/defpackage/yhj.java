package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yhj extends defpackage.yot {
    final defpackage.yot a;
    final /* synthetic */ defpackage.yhm b;

    public yhj(defpackage.yhm yhmVar) {
        this.b = yhmVar;
        this.a = yhmVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return ((java.util.Map.Entry) this.a.next()).getValue();
    }
}

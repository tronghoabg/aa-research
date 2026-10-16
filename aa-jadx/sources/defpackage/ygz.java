package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ygz extends defpackage.yot {
    final /* synthetic */ defpackage.yot a;

    public ygz(defpackage.yot yotVar) {
        this.a = yotVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return ((java.util.Map.Entry) this.a.next()).getKey();
    }
}

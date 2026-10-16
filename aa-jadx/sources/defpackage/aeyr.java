package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeyr implements j$.util.Iterator, defpackage.aezu {
    protected aeyr() {
    }

    @Override // defpackage.aezu
    public /* synthetic */ java.lang.Short a() {
        throw null;
    }

    @Override // defpackage.aezu
    public /* synthetic */ void b(defpackage.aezs aezsVar) {
        throw null;
    }

    @Override // j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        b((defpackage.aezs) obj);
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Object next() {
        return a();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.adrs.V(this, consumer);
    }
}

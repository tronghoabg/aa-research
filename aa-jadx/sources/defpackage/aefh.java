package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aefh implements j$.util.Iterator, defpackage.aegl {
    protected aefh() {
    }

    @Override // defpackage.aegl
    public /* synthetic */ java.lang.Byte a() {
        throw null;
    }

    @Override // defpackage.aegl
    public /* synthetic */ void b(defpackage.aegj aegjVar) {
        throw null;
    }

    @Override // j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        b((defpackage.aegj) obj);
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Object next() {
        return a();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.aefc.l(this, consumer);
    }
}

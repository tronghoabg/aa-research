package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afci<T> implements java.lang.Iterable<defpackage.afch<? extends T>>, defpackage.afhc {
    private final defpackage.afer a;

    public afci(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<defpackage.afch<T>> iterator() {
        return new defpackage.afcj((java.util.Iterator) this.a.invoke());
    }
}

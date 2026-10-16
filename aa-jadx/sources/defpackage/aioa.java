package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aioa<T> implements java.lang.Iterable<T>, defpackage.afhc {
    private aioa() {
    }

    public abstract T get(int i);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int i, T t);

    public /* synthetic */ aioa(defpackage.affu affuVar) {
        this();
    }
}

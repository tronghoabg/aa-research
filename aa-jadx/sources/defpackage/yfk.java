package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfk<T> extends defpackage.yfr implements java.util.Iterator<T> {
    protected yfk() {
    }

    protected abstract java.util.Iterator a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a().hasNext();
    }

    public T next() {
        return (T) a().next();
    }

    public void remove() {
        a().remove();
    }
}

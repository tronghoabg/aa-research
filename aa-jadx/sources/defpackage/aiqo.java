package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiqo<T> implements java.util.Iterator<T> {
    private static final defpackage.aiqo INSTANCE = new defpackage.aiqo();

    private aiqo() {
    }

    public static <T> defpackage.aiqo<T> getInstance() {
        return INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.IllegalStateException();
    }
}

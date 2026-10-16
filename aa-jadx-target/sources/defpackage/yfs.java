package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yfs<E> extends defpackage.yfi<E> implements java.util.Queue<E> {
    protected yfs() {
    }

    @Override // defpackage.yfi
    protected /* bridge */ /* synthetic */ java.util.Collection a() {
        throw null;
    }

    protected abstract java.util.Queue c();

    @Override // java.util.Queue
    public final java.lang.Object element() {
        return c().element();
    }

    public boolean offer(java.lang.Object obj) {
        return c().offer(obj);
    }

    @Override // java.util.Queue
    public final java.lang.Object peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public final java.lang.Object poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public final java.lang.Object remove() {
        return c().remove();
    }
}

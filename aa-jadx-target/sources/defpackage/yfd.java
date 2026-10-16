package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yfd<E> extends defpackage.yfs<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final int a;
    private final java.util.Queue b;

    public yfd(int i) {
        defpackage.ysr.ba(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new java.util.ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.yfs, defpackage.yfi
    protected final /* synthetic */ java.util.Collection a() {
        return this.b;
    }

    @Override // defpackage.yfi, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        e.getClass();
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (size() == i) {
            this.b.remove();
        }
        this.b.add(e);
        return true;
    }

    @Override // defpackage.yfi, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        int size = collection.size();
        int i = this.a;
        if (size < i) {
            return defpackage.ysr.ad(this, collection.iterator());
        }
        clear();
        return defpackage.ysr.ar(this, defpackage.ysr.al(collection, size - i));
    }

    @Override // defpackage.yfs
    protected final java.util.Queue c() {
        return this.b;
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yfs, java.util.Queue
    public final boolean offer(java.lang.Object obj) {
        add(obj);
        return true;
    }
}

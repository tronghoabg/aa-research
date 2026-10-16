package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* loaded from: classes.dex */
public final class ydx<E> extends yem<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;
    private final Queue b;

    public ydx(int i) {
        woy.Q(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.yem, defpackage.yec
    protected final /* synthetic */ Collection a() {
        return this.b;
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Queue
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

    @Override // defpackage.yec, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        int i = this.a;
        if (size < i) {
            return yrm.ad(this, collection.iterator());
        }
        clear();
        return yrm.ar(this, yrm.al(collection, size - i));
    }

    @Override // defpackage.yem
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yem, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}

package l8;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class s0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f40159a;

    public s0(Iterator it) {
        it.getClass();
        this.f40159a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40159a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f40159a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40159a.remove();
    }
}

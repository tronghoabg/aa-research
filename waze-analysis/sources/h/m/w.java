package h.m;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f48215a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f48216b;

    w(v vVar) {
        this.f48215a = vVar;
        this.f48216b = vVar.f48213b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48216b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f48215a.f48214c.invoke(this.f48216b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

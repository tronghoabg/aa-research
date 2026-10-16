package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class aa implements Iterator, h.g.b.a.a {
    public abstract double a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

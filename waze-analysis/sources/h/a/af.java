package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class af implements Iterator, h.g.b.a.a {
    public abstract float a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

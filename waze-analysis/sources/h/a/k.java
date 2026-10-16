package h.a;

import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f48011a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f48012b;

    k(Iterator it, int i2) {
        this.f48012b = i2;
        this.f48011a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f48012b;
        Iterator it = this.f48011a;
        return i2 != 0 ? it.hasNext() : it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f48012b;
        Iterator it = this.f48011a;
        return i2 != 0 ? ((Map.Entry) it.next()).getKey() : ((Map.Entry) it.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f48012b == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

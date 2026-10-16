package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class abqo implements Iterator, afgc {
    final /* synthetic */ Iterator a;
    private final /* synthetic */ Iterator b;

    public abqo(Iterator it) {
        this.a = it;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new abqq((Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

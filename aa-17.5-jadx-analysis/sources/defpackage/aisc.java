package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class aisc implements Iterator, afgc {
    final /* synthetic */ aisd a;
    private final Iterator b;

    public aisc(aisd aisdVar) {
        this.a = aisdVar;
        this.b = aisdVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.invoke(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ainz implements Iterator, afgc {
    private boolean notVisited = true;
    final /* synthetic */ aioa this$0;

    public ainz(aioa aioaVar) {
        this.this$0 = aioaVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.notVisited;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.notVisited) {
            throw new NoSuchElementException();
        }
        this.notVisited = false;
        return this.this$0.getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

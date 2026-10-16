package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeud<K> implements Iterator<K>, aety {
    protected final aety a;

    public aeud(aety aetyVar) {
        this.a = aetyVar;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Iterator.EL.forEachRemaining(this.a, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        return this.a.next();
    }
}

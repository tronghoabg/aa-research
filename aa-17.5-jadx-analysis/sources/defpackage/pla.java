package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pla implements Iterator {
    final Iterator a;

    public pla(aesu aesuVar) {
        this.a = aesuVar.d().d();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ogz next() {
        aetg next = ((aesp) this.a).next();
        return new ogz(next.getKey(), next.getValue());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

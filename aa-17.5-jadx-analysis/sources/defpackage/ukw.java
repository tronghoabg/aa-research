package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ukw implements Iterator {
    private final List a;
    private int b = 0;

    public ukw(List list) {
        this.a = list;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ukd next() {
        int i = this.b;
        this.b = i + 1;
        return (ukd) this.a.get(i);
    }

    public final ukd b() {
        return (ukd) this.a.get(this.b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove() not supported");
    }
}

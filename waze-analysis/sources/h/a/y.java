package h.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f48023a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f48024b;

    /* renamed from: c, reason: collision with root package name */
    private int f48025c;

    public y(char c2, char c3) {
        this.f48023a = c3;
        int iA = h.g.b.x.a(c2, c3);
        this.f48024b = iA <= 0;
        this.f48025c = iA > 0 ? c3 : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48024b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.f48025c;
        if (i2 != this.f48023a) {
            this.f48025c = i2 + 1;
        } else {
            if (!this.f48024b) {
                throw new NoSuchElementException();
            }
            this.f48024b = false;
        }
        return Character.valueOf((char) i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public y() {
        throw null;
    }
}

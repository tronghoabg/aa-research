package h.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class d implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f48002a;

    /* renamed from: b, reason: collision with root package name */
    private int f48003b;

    public d(g gVar) {
        this.f48002a = gVar;
    }

    protected final int a() {
        return this.f48003b;
    }

    protected final void b(int i2) {
        this.f48003b = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48003b < this.f48002a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        g gVar = this.f48002a;
        int i2 = this.f48003b;
        this.f48003b = i2 + 1;
        return gVar.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

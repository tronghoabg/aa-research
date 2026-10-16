package h.a;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends d implements ListIterator, h.g.b.a.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f48004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, int i2) {
        super(gVar);
        this.f48004b = gVar;
        c.b(i2, gVar.size());
        b(i2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return a() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return a();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        g gVar = this.f48004b;
        b(a() - 1);
        return gVar.get(a());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return a() - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

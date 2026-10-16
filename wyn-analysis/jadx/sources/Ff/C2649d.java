package ff;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: ff.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2649d extends Uf.h implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2651f f35420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2649d(AbstractC2651f abstractC2651f, int i5) {
        super(abstractC2651f, 5);
        this.f35420d = abstractC2651f;
        C2648c c2648c = AbstractC2651f.Companion;
        int size = abstractC2651f.size();
        c2648c.getClass();
        C2648c.c(i5, size);
        this.f12827b = i5;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12827b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12827b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f12827b - 1;
        this.f12827b = i5;
        return this.f35420d.get(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12827b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

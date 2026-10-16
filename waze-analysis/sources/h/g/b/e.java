package h.g.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e<T> implements Iterator<T>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f48115a;

    /* renamed from: b, reason: collision with root package name */
    private int f48116b;

    public e(Object[] objArr) {
        x.f(objArr, "array");
        this.f48115a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48116b < this.f48115a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            Object[] objArr = this.f48115a;
            int i2 = this.f48116b;
            this.f48116b = i2 + 1;
            return (T) objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f48116b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package h.a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class as<T> extends g<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f47987a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47988b;

    /* renamed from: c, reason: collision with root package name */
    private int f47989c;

    /* renamed from: d, reason: collision with root package name */
    private int f47990d;

    public as(Object[] objArr, int i2) {
        h.g.b.x.f(objArr, "buffer");
        this.f47987a = objArr;
        if (i2 < 0) {
            throw new IllegalArgumentException("ring buffer filled size should not be negative but it is " + i2);
        }
        int length = objArr.length;
        if (i2 <= length) {
            this.f47988b = length;
            this.f47990d = i2;
        } else {
            throw new IllegalArgumentException("ring buffer filled size: " + i2 + " cannot be larger than the buffer size: " + length);
        }
    }

    public final void c(Object obj) {
        if (e()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f47987a[(this.f47989c + size()) % this.f47988b] = obj;
        this.f47990d = size() + 1;
    }

    public final void d(int i2) {
        if (i2 > size()) {
            throw new IllegalArgumentException("n shouldn't be greater than the buffer size: n = " + i2 + ", size = " + size());
        }
        int i3 = this.f47989c;
        int i4 = this.f47988b;
        int i5 = (i3 + i2) % i4;
        Object[] objArr = this.f47987a;
        if (i3 > i5) {
            c.j(objArr, null, i3, i4);
            c.j(objArr, null, 0, i5);
        } else {
            c.j(objArr, null, i3, i5);
        }
        this.f47989c = i5;
        this.f47990d = size() - i2;
    }

    public final boolean e() {
        return size() == this.f47988b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final as g() {
        Object[] array;
        int i2 = this.f47988b;
        int i3 = h.k.n.i(i2 + (i2 >> 1) + 1, 2);
        if (this.f47989c == 0) {
            array = Arrays.copyOf(this.f47987a, i3);
            h.g.b.x.e(array, "copyOf(...)");
        } else {
            array = toArray(new Object[i3]);
        }
        return new as(array, size());
    }

    @Override // h.a.g, java.util.List
    public final T get(int i2) {
        c.a(i2, size());
        return (T) this.f47987a[(this.f47989c + i2) % this.f47988b];
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f47990d;
    }

    @Override // h.a.g, h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new ar(this);
    }

    @Override // h.a.a, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        h.g.b.x.f(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            h.g.b.x.e(tArr, "copyOf(...)");
        }
        int size = size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = this.f47989c; i3 < size && i4 < this.f47988b; i4++) {
            tArr[i3] = this.f47987a[i4];
            i3++;
        }
        while (i3 < size) {
            tArr[i3] = this.f47987a[i2];
            i3++;
            i2++;
        }
        i.aS(size, tArr);
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.a.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

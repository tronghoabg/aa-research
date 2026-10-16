package h;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f48297a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f48298b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f48299c;

    public t(byte[] bArr, int i2) {
        this.f48298b = i2;
        h.g.b.x.f(bArr, "array");
        this.f48299c = bArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f48298b;
        if (i2 == 0) {
            return this.f48297a < ((int[]) this.f48299c).length;
        }
        if (i2 == 1) {
            return this.f48297a < ((byte[]) this.f48299c).length;
        }
        int i3 = this.f48297a;
        return i2 != 2 ? i3 < ((short[]) this.f48299c).length : i3 < ((long[]) this.f48299c).length;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i2 = this.f48298b;
        if (i2 == 0) {
            int i3 = this.f48297a;
            int[] iArr = (int[]) this.f48299c;
            if (i3 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(i3));
            }
            this.f48297a = i3 + 1;
            return s.b(iArr[i3]);
        }
        if (i2 == 1) {
            int i4 = this.f48297a;
            byte[] bArr = (byte[]) this.f48299c;
            if (i4 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(i4));
            }
            this.f48297a = i4 + 1;
            return q.c(bArr[i4]);
        }
        int i5 = this.f48297a;
        if (i2 != 2) {
            short[] sArr = (short[]) this.f48299c;
            if (i5 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(i5));
            }
            this.f48297a = i5 + 1;
            return y.b(sArr[i5]);
        }
        long[] jArr = (long[]) this.f48299c;
        if (i5 >= jArr.length) {
            throw new NoSuchElementException(String.valueOf(i5));
        }
        this.f48297a = i5 + 1;
        return v.b(jArr[i5]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f48298b;
        if (i2 == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i2 == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i2 == 2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public t(int[] iArr, int i2) {
        this.f48298b = i2;
        h.g.b.x.f(iArr, "array");
        this.f48299c = iArr;
    }

    public t(long[] jArr, int i2) {
        this.f48298b = i2;
        h.g.b.x.f(jArr, "array");
        this.f48299c = jArr;
    }

    public t(short[] sArr, int i2) {
        this.f48298b = i2;
        h.g.b.x.f(sArr, "array");
        this.f48299c = sArr;
    }
}

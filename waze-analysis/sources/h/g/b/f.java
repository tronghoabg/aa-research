package h.g.b;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.a.ak {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f48117a;

    /* renamed from: b, reason: collision with root package name */
    private int f48118b;

    public f(long[] jArr) {
        x.f(jArr, "array");
        this.f48117a = jArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48118b < this.f48117a.length;
    }

    @Override // h.a.ak
    public final long nextLong() {
        try {
            long[] jArr = this.f48117a;
            int i2 = this.f48118b;
            this.f48118b = i2 + 1;
            return jArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f48118b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}

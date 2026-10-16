package h.g.b;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.a.aa {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f48109a;

    /* renamed from: b, reason: collision with root package name */
    private int f48110b;

    public b(double[] dArr) {
        x.f(dArr, "array");
        this.f48109a = dArr;
    }

    @Override // h.a.aa
    public final double a() {
        try {
            double[] dArr = this.f48109a;
            int i2 = this.f48110b;
            this.f48110b = i2 + 1;
            return dArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f48110b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48110b < this.f48109a.length;
    }
}

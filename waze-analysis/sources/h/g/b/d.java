package h.g.b;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.a.aj {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f48113a;

    /* renamed from: b, reason: collision with root package name */
    private int f48114b;

    public d(int[] iArr) {
        x.f(iArr, "array");
        this.f48113a = iArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48114b < this.f48113a.length;
    }

    @Override // h.a.aj
    public final int nextInt() {
        try {
            int[] iArr = this.f48113a;
            int i2 = this.f48114b;
            this.f48114b = i2 + 1;
            return iArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f48114b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}

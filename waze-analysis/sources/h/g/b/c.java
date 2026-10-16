package h.g.b;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.a.af {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f48111a;

    /* renamed from: b, reason: collision with root package name */
    private int f48112b;

    public c(float[] fArr) {
        x.f(fArr, "array");
        this.f48111a = fArr;
    }

    @Override // h.a.af
    public final float a() {
        try {
            float[] fArr = this.f48111a;
            int i2 = this.f48112b;
            this.f48112b = i2 + 1;
            return fArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f48112b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48112b < this.f48111a.length;
    }
}

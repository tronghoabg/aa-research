package od;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41581a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41583c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f41584d;

    public H1(float f10, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f41584d = atomicInteger;
        this.f41583c = (int) (f11 * 1000.0f);
        int i5 = (int) (f10 * 1000.0f);
        this.f41581a = i5;
        this.f41582b = i5 / 2;
        atomicInteger.set(i5);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i5;
        int i10;
        do {
            atomicInteger = this.f41584d;
            i5 = atomicInteger.get();
            if (i5 == 0) {
                return false;
            }
            i10 = i5 - 1000;
        } while (!atomicInteger.compareAndSet(i5, Math.max(i10, 0)));
        return i10 > this.f41582b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        return this.f41581a == h12.f41581a && this.f41583c == h12.f41583c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41581a), Integer.valueOf(this.f41583c)});
    }
}

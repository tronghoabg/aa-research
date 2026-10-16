package e.a.d;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ix {

    /* renamed from: a, reason: collision with root package name */
    final int f47190a;

    /* renamed from: b, reason: collision with root package name */
    final int f47191b;

    /* renamed from: c, reason: collision with root package name */
    final int f47192c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicInteger f47193d;

    ix(float f2, float f3) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f47193d = atomicInteger;
        this.f47192c = (int) (f3 * 1000.0f);
        int i2 = (int) (f2 * 1000.0f);
        this.f47190a = i2;
        this.f47191b = i2 / 2;
        atomicInteger.set(i2);
    }

    final boolean a() {
        return this.f47193d.get() > this.f47191b;
    }

    final boolean b() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = this.f47193d;
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return false;
            }
            i3 = i2 - 1000;
        } while (!atomicInteger.compareAndSet(i2, Math.max(i3, 0)));
        return i3 > this.f47191b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix)) {
            return false;
        }
        ix ixVar = (ix) obj;
        return this.f47190a == ixVar.f47190a && this.f47192c == ixVar.f47192c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f47190a), Integer.valueOf(this.f47192c));
    }
}

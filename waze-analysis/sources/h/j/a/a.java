package h.j.a;

import h.g.b.x;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends h.j.a {
    @Override // h.j.f
    public final int bI(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // h.j.a
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        x.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // h.j.f
    public final long g() {
        return ThreadLocalRandom.current().nextLong(50L, 100L);
    }
}

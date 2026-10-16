package yf;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.AbstractC3340k;
import xf.AbstractC4513a;

/* renamed from: yf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4595a extends AbstractC4513a {
    @Override // xf.AbstractC4516d
    public final int c() {
        return ThreadLocalRandom.current().nextInt(1, 99999999);
    }

    @Override // xf.AbstractC4516d
    public final long e(long j8) {
        return ThreadLocalRandom.current().nextLong(j8);
    }

    @Override // xf.AbstractC4516d
    public final long f(long j8, long j10) {
        return ThreadLocalRandom.current().nextLong(j8, j10);
    }

    @Override // xf.AbstractC4513a
    public final Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC3340k.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}

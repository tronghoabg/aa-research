package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* loaded from: classes3.dex */
public final class afgt extends afgn {
    @Override // defpackage.afgn
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // defpackage.afgs
    public final long f() {
        return ThreadLocalRandom.current().nextLong(3000L);
    }

    @Override // defpackage.afgs
    public final long hv() {
        return ThreadLocalRandom.current().nextLong(0L, 3000L);
    }
}

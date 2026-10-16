package defpackage;

import j$.time.Instant;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zeo {
    public static final /* synthetic */ int a = 0;

    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        a(Long.MAX_VALUE);
        a(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    public static Instant a(long j) {
        return Instant.ofEpochSecond(zeb.r(j, 1000000L, RoundingMode.FLOOR), zeb.q(j, 1000000) * 1000);
    }

    public static void b(long j) {
        Instant.ofEpochSecond(zeb.r(j, 1000000000L, RoundingMode.FLOOR), zeb.q(j, 1000000000));
    }
}

package j$.util.concurrent;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class DesugarTimeUnit {
    public static long convert(TimeUnit timeUnit, Duration duration) {
        return timeUnit.convert(duration.toNanos(), TimeUnit.NANOSECONDS);
    }
}

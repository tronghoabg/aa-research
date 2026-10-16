package j$.time;

import j$.util.Objects;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class Clock {
    public static final /* synthetic */ int a = 0;

    static {
        System.currentTimeMillis();
    }

    public static Clock system(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return zoneId == ZoneOffset.UTC ? a.c : new a(zoneId);
    }

    public static Clock systemUTC() {
        return a.c;
    }

    public abstract ZoneId a();

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();
}

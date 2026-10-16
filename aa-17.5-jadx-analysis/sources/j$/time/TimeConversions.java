package j$.time;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class TimeConversions {
    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return java.time.Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static java.time.LocalTime convert(LocalTime localTime) {
        if (localTime == null) {
            return null;
        }
        return java.time.LocalTime.ofNanoOfDay(localTime.P());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.getSeconds(), duration.getNano());
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.ofSeconds(duration.getSeconds(), duration.getNano());
    }

    public static java.time.LocalDate convert(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return java.time.LocalDate.of(localDate.a, localDate.b, localDate.getDayOfMonth());
    }
}

package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final java.lang.String mZoneShortName;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        MAX_ZONE_OFFSET_SECONDS = 64800L;
    }

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static androidx.car.app.model.DateTimeWithZone create(long j, int i, java.lang.String str) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (java.lang.Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            throw new java.lang.IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        str.getClass();
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new androidx.car.app.model.DateTimeWithZone(j, i, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.DateTimeWithZone)) {
            return false;
        }
        androidx.car.app.model.DateTimeWithZone dateTimeWithZone = (androidx.car.app.model.DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && j$.util.Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public java.lang.String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Long.valueOf(this.mTimeSinceEpochMillis), java.lang.Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public java.lang.String toString() {
        return "[time since epoch (ms): " + this.mTimeSinceEpochMillis + "( " + new java.util.Date(this.mTimeSinceEpochMillis) + ")  zone offset (s): " + this.mZoneOffsetSeconds + ", zone: " + this.mZoneShortName + "]";
    }

    private DateTimeWithZone(long j, int i, java.lang.String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static androidx.car.app.model.DateTimeWithZone create(long j, java.util.TimeZone timeZone) {
        if (j >= 0) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            timeZone.getClass();
            return create(j, (int) (((long) timeZone.getOffset(j)) / 1000), timeZone.getDisplayName(false, 0));
        }
        throw new java.lang.IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    public static androidx.car.app.model.DateTimeWithZone create(j$.time.ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        j$.time.LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        j$.time.ZoneId zone = zonedDateTime.getZone();
        j$.time.ZoneOffset offset = zone.getRules().getOffset(localDateTime);
        return create(java.util.concurrent.TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(j$.time.format.TextStyle.SHORT, java.util.Locale.getDefault()));
    }
}

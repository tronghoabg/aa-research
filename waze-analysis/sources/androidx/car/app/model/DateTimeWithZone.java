package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.TextStyle;
import j$.util.Objects;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    /* compiled from: WazeSource */
    final class Api26Impl {
        private Api26Impl() {
        }

        public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
            LocalDateTime localDateTime = ((ZonedDateTime) Objects.requireNonNull(zonedDateTime)).toLocalDateTime();
            ZoneId zone = zonedDateTime.getZone();
            ZoneOffset offset = zone.getRules().getOffset(localDateTime);
            return DateTimeWithZone.create(TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        MAX_ZONE_OFFSET_SECONDS = 64800L;
    }

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j2, int i2, String str) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (Math.abs(i2) > MAX_ZONE_OFFSET_SECONDS) {
            throw new IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (((String) Objects.requireNonNull(str)).isEmpty()) {
            throw new IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new DateTimeWithZone(j2, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public String toString() {
        return "[time since epoch (ms): " + this.mTimeSinceEpochMillis + "( " + new Date(this.mTimeSinceEpochMillis) + ")  zone offset (s): " + this.mZoneOffsetSeconds + ", zone: " + this.mZoneShortName + "]";
    }

    private DateTimeWithZone(long j2, int i2, String str) {
        this.mTimeSinceEpochMillis = j2;
        this.mZoneOffsetSeconds = i2;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j2, TimeZone timeZone) {
        if (j2 >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return create(j2, (int) (((TimeZone) Objects.requireNonNull(timeZone)).getOffset(j2) / 1000), timeZone.getDisplayName(false, 0));
        }
        throw new IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        return Api26Impl.create(zonedDateTime);
    }
}

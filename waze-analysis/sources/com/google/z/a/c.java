package com.google.z.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c implements eg {
    DEFAULT_FORMAT(0),
    DATE(1),
    TIMESTAMP_SECONDS(2),
    TIMESTAMP_MILLIS(3),
    TIMESTAMP_MICROS(4),
    TIMESTAMP_NANOS(5),
    TIMESTAMP_PICOS(20),
    TIMESTAMP(21),
    DATE_DECIMAL(6),
    TIME_MICROS(7),
    DATETIME_MICROS(8),
    ST_GEOGRAPHY_ENCODED(9),
    NUMERIC(10),
    BIGNUMERIC(11),
    JSON(12),
    INTERVAL(14),
    TOKENLIST(15),
    RANGE_DATES_ENCODED(16),
    RANGE_DATETIMES_ENCODED(17),
    RANGE_TIMESTAMPS_ENCODED(18),
    UUID(19),
    __FieldFormat_Type__switch_must_have_a_default__(-1);

    private static final eh w = new b(0);
    private final int y;

    c(int i2) {
        this.y = i2;
    }

    public static eh a() {
        return w;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.y;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }
}

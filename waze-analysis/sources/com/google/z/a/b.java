package com.google.z.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b implements eh {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13437a;

    b(int i2) {
        this.f13437a = i2;
    }

    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        int i3 = this.f13437a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i2 == 0) {
                    return e.DEFAULT_TABLE_TYPE;
                }
                if (i2 == 1) {
                    return e.SQL_TABLE;
                }
                if (i2 != 2) {
                    return null;
                }
                return e.VALUE_TABLE;
            }
            if (i2 == -1) {
                return a.__FieldFormat_Encoding__switch_must_have_a_default__;
            }
            if (i2 == 0) {
                return a.DEFAULT_ENCODING;
            }
            if (i2 != 1) {
                return null;
            }
            return a.DATE_DECIMAL;
        }
        switch (i2) {
            case -1:
                return c.__FieldFormat_Type__switch_must_have_a_default__;
            case 0:
                return c.DEFAULT_FORMAT;
            case 1:
                return c.DATE;
            case 2:
                return c.TIMESTAMP_SECONDS;
            case 3:
                return c.TIMESTAMP_MILLIS;
            case 4:
                return c.TIMESTAMP_MICROS;
            case 5:
                return c.TIMESTAMP_NANOS;
            case 6:
                return c.DATE_DECIMAL;
            case 7:
                return c.TIME_MICROS;
            case 8:
                return c.DATETIME_MICROS;
            case 9:
                return c.ST_GEOGRAPHY_ENCODED;
            case 10:
                return c.NUMERIC;
            case 11:
                return c.BIGNUMERIC;
            case 12:
                return c.JSON;
            case 13:
            default:
                return null;
            case 14:
                return c.INTERVAL;
            case 15:
                return c.TOKENLIST;
            case 16:
                return c.RANGE_DATES_ENCODED;
            case 17:
                return c.RANGE_DATETIMES_ENCODED;
            case 18:
                return c.RANGE_TIMESTAMPS_ENCODED;
            case 19:
                return c.UUID;
            case 20:
                return c.TIMESTAMP_PICOS;
            case 21:
                return c.TIMESTAMP;
        }
    }
}

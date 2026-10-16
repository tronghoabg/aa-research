package com.waze.sharedui;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final ch f39059a;

    public l(ch chVar) {
        x.f(chVar, "userProfileFlow");
        this.f39059a = chVar;
    }

    public final String a() {
        ch chVar = this.f39059a;
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        long userId = ((UserProfile) chVar.d()).getUserId() % 672;
        int monthValue = zonedDateTimeNow.getMonthValue();
        int year = zonedDateTimeNow.getYear();
        int i2 = monthValue != 12 ? 3 * ((monthValue / 3) + 1) : 3;
        if (monthValue == 12) {
            year++;
        }
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(year, i2, ((int) (userId / 24)) + 1, (int) (userId % 24), 0, 0, 0, ZoneId.of("UTC"));
        if (zonedDateTimeOf.minusMonths(3L).compareTo((ChronoZonedDateTime) zonedDateTimeNow) > 0) {
            zonedDateTimeOf = zonedDateTimeOf.minusMonths(3L);
        }
        return String.valueOf(zonedDateTimeOf.toEpochSecond());
    }
}

package com.google.android.apps.auto.components.calendar.model;

import defpackage.yfq;
import defpackage.yrm;

/* renamed from: com.google.android.apps.auto.components.calendar.model.$AutoValue_CalendarReminder, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C$AutoValue_CalendarReminder extends CalendarReminder {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final yfq i;
    public final boolean j;

    public C$AutoValue_CalendarReminder(long j, long j2, long j3, String str, long j4, long j5, long j6, String str2, yfq yfqVar, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.d = str;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        if (str2 == null) {
            throw new NullPointerException("Null location");
        }
        this.h = str2;
        if (yfqVar == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.i = yfqVar;
        this.j = z;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final long a() {
        return this.e;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final long b() {
        return this.c;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final long c() {
        return this.g;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final long d() {
        return this.b;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CalendarReminder) {
            CalendarReminder calendarReminder = (CalendarReminder) obj;
            if (this.a == calendarReminder.f() && this.b == calendarReminder.d() && this.c == calendarReminder.b() && this.d.equals(calendarReminder.i()) && this.e == calendarReminder.a() && this.f == calendarReminder.e() && this.g == calendarReminder.c() && this.h.equals(calendarReminder.h()) && yrm.W(this.i, calendarReminder.g()) && this.j == calendarReminder.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final long f() {
        return this.a;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final yfq g() {
        return this.i;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        String str = this.d;
        long j3 = this.b;
        int iHashCode = ((((int) (j ^ (j >>> 32))) ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003)) * 1000003) ^ str.hashCode();
        String str2 = this.h;
        long j4 = this.g;
        long j5 = this.f;
        long j6 = this.e;
        return (true != this.j ? 1237 : 1231) ^ (((((((((((iHashCode * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ str2.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003);
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final String i() {
        return this.d;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarReminder
    public final boolean j() {
        return this.j;
    }

    public final String toString() {
        return "CalendarReminder{id=" + this.a + ", eventId=" + this.b + ", calendarId=" + this.c + ", title=" + this.d + ", alarmTime=" + this.e + ", eventStartTime=" + this.f + ", eventEndTime=" + this.g + ", location=" + this.h + ", phoneNumbers=" + this.i.toString() + ", isWorkData=" + this.j + "}";
    }
}

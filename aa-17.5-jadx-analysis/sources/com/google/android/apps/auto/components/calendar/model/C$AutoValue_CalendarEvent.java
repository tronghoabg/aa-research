package com.google.android.apps.auto.components.calendar.model;

import defpackage.yfq;
import defpackage.yrm;

/* renamed from: com.google.android.apps.auto.components.calendar.model.$AutoValue_CalendarEvent, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C$AutoValue_CalendarEvent extends CalendarEvent {
    public final long a;
    public final long b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;
    public final int h;
    public final yfq i;
    public final boolean j;

    public C$AutoValue_CalendarEvent(long j, long j2, String str, long j3, long j4, boolean z, String str2, int i, yfq yfqVar, boolean z2) {
        this.a = j;
        this.b = j2;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.c = str;
        this.d = j3;
        this.e = j4;
        this.f = z;
        if (str2 == null) {
            throw new NullPointerException("Null location");
        }
        this.g = str2;
        this.h = i;
        if (yfqVar == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.i = yfqVar;
        this.j = z2;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final int a() {
        return this.h;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final long b() {
        return this.b;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final long c() {
        return this.e;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final long d() {
        return this.a;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CalendarEvent) {
            CalendarEvent calendarEvent = (CalendarEvent) obj;
            if (this.a == calendarEvent.d() && this.b == calendarEvent.b() && this.c.equals(calendarEvent.h()) && this.d == calendarEvent.e() && this.e == calendarEvent.c() && this.f == calendarEvent.i() && this.g.equals(calendarEvent.g()) && this.h == calendarEvent.a() && yrm.W(this.i, calendarEvent.f()) && this.j == calendarEvent.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final yfq f() {
        return this.i;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        int iHashCode = ((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
        int i = true != this.f ? 1237 : 1231;
        long j3 = this.d;
        long j4 = this.e;
        return (((((((((((((iHashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final boolean i() {
        return this.f;
    }

    @Override // com.google.android.apps.auto.components.calendar.model.CalendarEvent
    public final boolean j() {
        return this.j;
    }

    public final String toString() {
        return "CalendarEvent{id=" + this.a + ", calendarId=" + this.b + ", title=" + this.c + ", startTime=" + this.d + ", endTime=" + this.e + ", isAllDay=" + this.f + ", location=" + this.g + ", color=" + this.h + ", phoneNumbers=" + this.i.toString() + ", isWorkData=" + this.j + "}";
    }
}

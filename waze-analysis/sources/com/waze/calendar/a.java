package com.waze.calendar;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18744a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18745b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18746c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18747d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18748e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18749f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18750g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18751h;

    public a(String str, long j2, long j3, boolean z, String str2, String str3, String str4) {
        x.f(str, "calendarId");
        this.f18744a = str;
        this.f18745b = j2;
        this.f18746c = j3;
        this.f18747d = false;
        this.f18748e = z;
        this.f18749f = str2;
        this.f18750g = str3;
        this.f18751h = str4;
    }

    public final long a() {
        return this.f18746c;
    }

    public final long b() {
        return this.f18745b;
    }

    public final String c() {
        return this.f18744a;
    }

    public final String d() {
        return this.f18750g;
    }

    public final String e() {
        return this.f18749f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!x.n(this.f18744a, aVar.f18744a) || this.f18745b != aVar.f18745b || this.f18746c != aVar.f18746c) {
            return false;
        }
        boolean z = aVar.f18747d;
        return this.f18748e == aVar.f18748e && x.n(this.f18749f, aVar.f18749f) && x.n(this.f18750g, aVar.f18750g) && x.n(this.f18751h, aVar.f18751h);
    }

    public final String f() {
        return this.f18751h;
    }

    public final boolean g() {
        return this.f18748e;
    }

    public final int hashCode() {
        int iHashCode = this.f18744a.hashCode() * 31;
        String str = this.f18749f;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f18745b;
        long j3 = this.f18746c;
        int iB = (((((((((iHashCode + a.a.b(j2)) * 31) + a.a.b(j3)) * 31) + a.a.a(false)) * 31) + a.a.a(this.f18748e)) * 31) + iHashCode2) * 31;
        String str2 = this.f18750g;
        return ((iB + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f18751h.hashCode();
    }

    public final String toString() {
        return "CalendarEventData(calendarId=" + this.f18744a + ", startTime=" + this.f18745b + ", endTime=" + this.f18746c + ", isAllDay=false, isRecurring=" + this.f18748e + ", locationStr=" + this.f18749f + ", displayName=" + this.f18750g + ", organizerMail=" + this.f18751h + ")";
    }
}

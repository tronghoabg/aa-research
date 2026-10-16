package com.waze.reports_v2.presentation.a;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.ad f34673a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34674b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34675c;

    /* renamed from: d, reason: collision with root package name */
    private final Bitmap f34676d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34677e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.reports_v2.b.ae f34678f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f34679g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f34680h;

    public at(com.waze.reports_v2.b.ad adVar, int i2, int i3, Bitmap bitmap, String str, com.waze.reports_v2.b.ae aeVar, Integer num, Integer num2) {
        h.g.b.x.f(adVar, "legacyMenu");
        this.f34673a = adVar;
        this.f34674b = i2;
        this.f34675c = i3;
        this.f34676d = bitmap;
        this.f34677e = str;
        this.f34678f = aeVar;
        this.f34679g = num;
        this.f34680h = num2;
    }

    public final int a() {
        return this.f34674b;
    }

    public final int b() {
        return this.f34675c;
    }

    public final Bitmap c() {
        return this.f34676d;
    }

    public final com.waze.reports_v2.b.ad d() {
        return this.f34673a;
    }

    public final com.waze.reports_v2.b.ae e() {
        return this.f34678f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return this.f34673a == atVar.f34673a && this.f34674b == atVar.f34674b && this.f34675c == atVar.f34675c && h.g.b.x.n(this.f34676d, atVar.f34676d) && h.g.b.x.n(this.f34677e, atVar.f34677e) && this.f34678f == atVar.f34678f && h.g.b.x.n(this.f34679g, atVar.f34679g) && h.g.b.x.n(this.f34680h, atVar.f34680h);
    }

    public final Integer f() {
        return this.f34680h;
    }

    public final Integer g() {
        return this.f34679g;
    }

    public final String h() {
        return this.f34677e;
    }

    public final int hashCode() {
        int iHashCode = this.f34673a.hashCode() * 31;
        Bitmap bitmap = this.f34676d;
        int iHashCode2 = (((((iHashCode + this.f34674b) * 31) + this.f34675c) * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str = this.f34677e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.reports_v2.b.ae aeVar = this.f34678f;
        int iHashCode4 = (iHashCode3 + (aeVar == null ? 0 : aeVar.hashCode())) * 31;
        Integer num = this.f34679g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f34680h;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LaterButton(legacyMenu=" + this.f34673a + ", backgroundColorRes=" + this.f34674b + ", imageRes=" + this.f34675c + ", takenPictureBitmap=" + this.f34676d + ", comment=" + this.f34677e + ", legacyMenuSubType=" + this.f34678f + ", subSelected=" + this.f34679g + ", duration=" + this.f34680h + ")";
    }
}

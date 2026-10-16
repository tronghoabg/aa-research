package com.waze.push;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f33419a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f33420b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f33421c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33422d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33423e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33424f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33425g;

    public b(int i2, String str, String str2) {
        x.f(str, "contentTitle");
        this.f33419a = R.drawable.notification;
        this.f33420b = null;
        this.f33421c = null;
        this.f33422d = i2;
        this.f33423e = str;
        this.f33424f = str2;
        this.f33425g = 4;
    }

    public final String a() {
        return this.f33424f;
    }

    public final String b() {
        return this.f33423e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = bVar.f33419a;
        Bitmap bitmap = bVar.f33420b;
        if (!x.n(null, null)) {
            return false;
        }
        PendingIntent pendingIntent = bVar.f33421c;
        if (!x.n(null, null) || this.f33422d != bVar.f33422d || !x.n(this.f33423e, bVar.f33423e) || !x.n(this.f33424f, bVar.f33424f)) {
            return false;
        }
        int i3 = bVar.f33425g;
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((this.f33422d - 954516551) * 31) + this.f33423e.hashCode();
        String str = this.f33424f;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + 4;
    }

    public final String toString() {
        return "NotificationExtenderData(smallIcon=2131232487, largeIcon=null, contentIntent=null, color=" + this.f33422d + ", contentTitle=" + this.f33423e + ", contentText=" + this.f33424f + ", importance=4)";
    }
}

package com.waze.nav_connect.a;

import android.app.PendingIntent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f30749a;

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f30750b;

    public q(String str, PendingIntent pendingIntent) {
        x.f(str, "token");
        this.f30749a = str;
        this.f30750b = pendingIntent;
    }

    public final PendingIntent a() {
        return this.f30750b;
    }

    public final String b() {
        return this.f30749a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return x.n(this.f30749a, qVar.f30749a) && x.n(this.f30750b, qVar.f30750b);
    }

    public final int hashCode() {
        int iHashCode = this.f30749a.hashCode() * 31;
        PendingIntent pendingIntent = this.f30750b;
        return iHashCode + (pendingIntent == null ? 0 : pendingIntent.hashCode());
    }

    public final String toString() {
        return "PendingIntentInfo(token=" + this.f30749a + ", pendingIntent=" + this.f30750b + ")";
    }
}

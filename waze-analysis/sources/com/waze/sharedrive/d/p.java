package com.waze.sharedrive.d;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    private final String f38254a;

    /* renamed from: b, reason: collision with root package name */
    private final o f38255b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38256c;

    public p(String str, o oVar, boolean z) {
        h.g.b.x.f(str, "token");
        h.g.b.x.f(oVar, NotificationCompat.CATEGORY_STATUS);
        this.f38254a = str;
        this.f38255b = oVar;
        this.f38256c = z;
    }

    public static /* synthetic */ p d(p pVar, o oVar, boolean z, int i2) {
        String str = (i2 & 1) != 0 ? pVar.f38254a : null;
        if ((i2 & 2) != 0) {
            oVar = pVar.f38255b;
        }
        if ((i2 & 4) != 0) {
            z = pVar.f38256c;
        }
        h.g.b.x.f(str, "token");
        h.g.b.x.f(oVar, NotificationCompat.CATEGORY_STATUS);
        return new p(str, oVar, z);
    }

    public final o a() {
        return this.f38255b;
    }

    public final String b() {
        return this.f38254a;
    }

    public final boolean c() {
        return this.f38256c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.g.b.x.n(this.f38254a, pVar.f38254a) && h.g.b.x.n(this.f38255b, pVar.f38255b) && this.f38256c == pVar.f38256c;
    }

    public final int hashCode() {
        return (((this.f38254a.hashCode() * 31) + this.f38255b.hashCode()) * 31) + a.a.a(this.f38256c);
    }

    public final String toString() {
        return "Joining(token=" + this.f38254a + ", status=" + this.f38255b + ", shareLocation=" + this.f38256c + ")";
    }
}

package com.waze.sharedrive.g;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f38714a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f38715b;

    /* renamed from: c, reason: collision with root package name */
    private final j f38716c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38717d;

    public k(String str, ah ahVar, j jVar, boolean z) {
        h.g.b.x.f(jVar, NotificationCompat.CATEGORY_STATUS);
        this.f38714a = str;
        this.f38715b = ahVar;
        this.f38716c = jVar;
        this.f38717d = z;
    }

    public final j a() {
        return this.f38716c;
    }

    public final ah b() {
        return this.f38715b;
    }

    public final String c() {
        return this.f38714a;
    }

    public final boolean d() {
        return this.f38717d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f38714a, kVar.f38714a) && h.g.b.x.n(this.f38715b, kVar.f38715b) && h.g.b.x.n(this.f38716c, kVar.f38716c) && this.f38717d == kVar.f38717d;
    }

    public final int hashCode() {
        String str = this.f38714a;
        int iHashCode = str == null ? 0 : str.hashCode();
        ah ahVar = this.f38715b;
        return (((((iHashCode * 31) + (ahVar != null ? ahVar.hashCode() : 0)) * 31) + this.f38716c.hashCode()) * 31) + a.a.a(this.f38717d);
    }

    public final String toString() {
        return "CreateSharePreviewState(destination=" + this.f38714a + ", participant=" + this.f38715b + ", status=" + this.f38716c + ", isRegistered=" + this.f38717d + ")";
    }

    public k() {
        this(null, null, h.f38710a, false);
    }
}

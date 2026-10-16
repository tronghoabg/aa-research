package com.waze.sharedrive.g;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f38731a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f38732b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38733c;

    /* renamed from: d, reason: collision with root package name */
    private final s f38734d;

    public t(String str, ai aiVar, boolean z, s sVar) {
        h.g.b.x.f(aiVar, "participants");
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_STATUS);
        this.f38731a = str;
        this.f38732b = aiVar;
        this.f38733c = z;
        this.f38734d = sVar;
    }

    public final s a() {
        return this.f38734d;
    }

    public final ai b() {
        return this.f38732b;
    }

    public final String c() {
        return this.f38731a;
    }

    public final boolean d() {
        return this.f38733c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f38731a, tVar.f38731a) && h.g.b.x.n(this.f38732b, tVar.f38732b) && this.f38733c == tVar.f38733c && h.g.b.x.n(this.f38734d, tVar.f38734d);
    }

    public final int hashCode() {
        String str = this.f38731a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f38732b.hashCode()) * 31) + a.a.a(this.f38733c)) * 31) + this.f38734d.hashCode();
    }

    public final String toString() {
        return "JoinSharePreviewUIState(destination=" + this.f38731a + ", participants=" + this.f38732b + ", shareLocation=" + this.f38733c + ", status=" + this.f38734d + ")";
    }
}

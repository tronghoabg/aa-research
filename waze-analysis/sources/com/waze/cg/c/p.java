package com.waze.cg.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final String f22334a;

    /* renamed from: b, reason: collision with root package name */
    private final o f22335b;

    /* renamed from: c, reason: collision with root package name */
    private final o f22336c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22337d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22338e;

    /* renamed from: f, reason: collision with root package name */
    private final n f22339f;

    /* renamed from: g, reason: collision with root package name */
    private final String f22340g;

    public p(String str, o oVar, o oVar2, String str2, String str3, n nVar, String str4) {
        x.f(str, "eventId");
        x.f(oVar, "homeTeam");
        x.f(oVar2, "awayTeam");
        x.f(str2, "homeScore");
        x.f(str3, "awayScore");
        x.f(nVar, NotificationCompat.CATEGORY_EVENT);
        x.f(str4, "eventMatchClock");
        this.f22334a = str;
        this.f22335b = oVar;
        this.f22336c = oVar2;
        this.f22337d = str2;
        this.f22338e = str3;
        this.f22339f = nVar;
        this.f22340g = str4;
    }

    public final n a() {
        return this.f22339f;
    }

    public final o b() {
        return this.f22336c;
    }

    public final o c() {
        return this.f22335b;
    }

    public final String d() {
        return this.f22338e;
    }

    public final String e() {
        return this.f22334a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return x.n(this.f22334a, pVar.f22334a) && x.n(this.f22335b, pVar.f22335b) && x.n(this.f22336c, pVar.f22336c) && x.n(this.f22337d, pVar.f22337d) && x.n(this.f22338e, pVar.f22338e) && x.n(this.f22339f, pVar.f22339f) && x.n(this.f22340g, pVar.f22340g);
    }

    public final String f() {
        return this.f22340g;
    }

    public final String g() {
        return this.f22337d;
    }

    public final int hashCode() {
        return (((((((((((this.f22334a.hashCode() * 31) + this.f22335b.hashCode()) * 31) + this.f22336c.hashCode()) * 31) + this.f22337d.hashCode()) * 31) + this.f22338e.hashCode()) * 31) + this.f22339f.hashCode()) * 31) + this.f22340g.hashCode();
    }

    public final String toString() {
        return "WazeToGoalUiState(eventId=" + this.f22334a + ", homeTeam=" + this.f22335b + ", awayTeam=" + this.f22336c + ", homeScore=" + this.f22337d + ", awayScore=" + this.f22338e + ", event=" + this.f22339f + ", eventMatchClock=" + this.f22340g + ")";
    }
}

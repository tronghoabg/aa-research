package com.waze.location.a;

import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final l f25172a;

    /* renamed from: b, reason: collision with root package name */
    private final Instant f25173b;

    /* renamed from: c, reason: collision with root package name */
    private final Instant f25174c;

    public a(l lVar, Instant instant, Instant instant2) {
        h.g.b.x.f(lVar, "issue");
        h.g.b.x.f(instant, "detectionTime");
        this.f25172a = lVar;
        this.f25173b = instant;
        this.f25174c = instant2;
    }

    public static final a d(l lVar, Instant instant, Instant instant2) {
        h.g.b.x.f(lVar, "issue");
        h.g.b.x.f(instant, "detectionTime");
        return new a(lVar, instant, instant2);
    }

    public final l a() {
        return this.f25172a;
    }

    public final Instant b() {
        return this.f25173b;
    }

    public final Instant c() {
        return this.f25174c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f25172a, aVar.f25172a) && h.g.b.x.n(this.f25173b, aVar.f25173b) && h.g.b.x.n(this.f25174c, aVar.f25174c);
    }

    public final int hashCode() {
        int iHashCode = (this.f25172a.hashCode() * 31) + this.f25173b.hashCode();
        Instant instant = this.f25174c;
        return (iHashCode * 31) + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        return "ActiveIssue(issue=" + this.f25172a + ", detectionTime=" + this.f25173b + ", lastStatReportedTime=" + this.f25174c + ")";
    }
}

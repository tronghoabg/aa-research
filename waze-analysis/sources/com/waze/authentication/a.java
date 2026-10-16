package com.waze.authentication;

import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15678a;

    /* renamed from: b, reason: collision with root package name */
    private final Instant f15679b;

    public a(String str, Instant instant) {
        h.g.b.x.f(str, "token");
        h.g.b.x.f(instant, "expiresAt");
        this.f15678a = str;
        this.f15679b = instant;
    }

    public final Instant a() {
        return this.f15679b;
    }

    public final String b() {
        return this.f15678a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f15678a, aVar.f15678a) && h.g.b.x.n(this.f15679b, aVar.f15679b);
    }

    public final int hashCode() {
        return (this.f15678a.hashCode() * 31) + this.f15679b.hashCode();
    }

    public final String toString() {
        return "AuthAccessToken(token=" + this.f15678a + ", expiresAt=" + this.f15679b + ")";
    }
}

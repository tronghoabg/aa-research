package com.google.firebase.sessions.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f10888a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f10889b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f10890c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f10891d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f10892e;

    public h(Boolean bool, Double d2, Integer num, Integer num2, Long l2) {
        this.f10888a = bool;
        this.f10889b = d2;
        this.f10890c = num;
        this.f10891d = num2;
        this.f10892e = l2;
    }

    public final Boolean a() {
        return this.f10888a;
    }

    public final Double b() {
        return this.f10889b;
    }

    public final Integer c() {
        return this.f10891d;
    }

    public final Integer d() {
        return this.f10890c;
    }

    public final Long e() {
        return this.f10892e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f10888a, hVar.f10888a) && x.n(this.f10889b, hVar.f10889b) && x.n(this.f10890c, hVar.f10890c) && x.n(this.f10891d, hVar.f10891d) && x.n(this.f10892e, hVar.f10892e);
    }

    public final int hashCode() {
        Boolean bool = this.f10888a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Double d2 = this.f10889b;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        int i2 = iHashCode * 31;
        Integer num = this.f10890c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10891d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.f10892e;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f10888a + ", sessionSamplingRate=" + this.f10889b + ", sessionRestartTimeout=" + this.f10890c + ", cacheDuration=" + this.f10891d + ", cacheUpdatedTime=" + this.f10892e + ")";
    }
}

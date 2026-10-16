package com.waze.sharedui.f;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f38931a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f38932b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f38933c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38934d;

    /* renamed from: e, reason: collision with root package name */
    private final g f38935e;

    /* renamed from: f, reason: collision with root package name */
    private final q f38936f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38937g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f38938h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f38939i;

    public r(int i2, Integer num, Integer num2, int i3, g gVar, q qVar, int i4, Integer num3, Integer num4) {
        this.f38931a = i2;
        this.f38932b = num;
        this.f38933c = num2;
        this.f38934d = i3;
        this.f38935e = gVar;
        this.f38936f = qVar;
        this.f38937g = i4;
        this.f38938h = num3;
        this.f38939i = num4;
    }

    public final int a() {
        return this.f38931a;
    }

    public final int b() {
        return this.f38937g;
    }

    public final int c() {
        return this.f38934d;
    }

    public final g d() {
        return this.f38935e;
    }

    public final q e() {
        return this.f38936f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f38931a == rVar.f38931a && x.n(this.f38932b, rVar.f38932b) && x.n(this.f38933c, rVar.f38933c) && this.f38934d == rVar.f38934d && this.f38935e == rVar.f38935e && this.f38936f == rVar.f38936f && this.f38937g == rVar.f38937g && x.n(this.f38938h, rVar.f38938h) && x.n(this.f38939i, rVar.f38939i);
    }

    public final Integer f() {
        return this.f38939i;
    }

    public final Integer g() {
        return this.f38933c;
    }

    public final Integer h() {
        return this.f38938h;
    }

    public final int hashCode() {
        Integer num = this.f38932b;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i2 = this.f38931a;
        Integer num2 = this.f38933c;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i3 = (i2 * 31) + iHashCode;
        int i4 = this.f38934d;
        g gVar = this.f38935e;
        int iHashCode3 = ((((((i3 * 31) + iHashCode2) * 31) + i4) * 31) + (gVar == null ? 0 : gVar.hashCode())) * 31;
        q qVar = this.f38936f;
        int iHashCode4 = (((iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31) + this.f38937g) * 31;
        Integer num3 = this.f38938h;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f38939i;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final Integer i() {
        return this.f38932b;
    }

    public final String toString() {
        return "TransactionStats(queueLatencyMs=" + this.f38931a + ", serverProcessingLatencyMs=" + this.f38932b + ", networkLatencyMs=" + this.f38933c + ", retries=" + this.f38934d + ", priority=" + this.f38935e + ", queueId=" + this.f38936f + ", requestSizeBytes=" + this.f38937g + ", responseSizeBytes=" + this.f38938h + ", integrityTokenGenerationLatencyMs=" + this.f38939i + ")";
    }
}

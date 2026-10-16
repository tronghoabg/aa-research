package com.waze.shared_infra.i;

import androidx.autofill.HintConstants;
import h.g.b.x;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f37895a;

    /* renamed from: b, reason: collision with root package name */
    private final Instant f37896b;

    /* renamed from: c, reason: collision with root package name */
    private final Instant f37897c;

    public j(String str, Instant instant, Instant instant2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(instant, "startTime");
        this.f37895a = str;
        this.f37896b = instant;
        this.f37897c = instant2;
    }

    public final Instant a() {
        return this.f37897c;
    }

    public final Instant b() {
        return this.f37896b;
    }

    public final String c() {
        return this.f37895a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return x.n(this.f37895a, jVar.f37895a) && x.n(this.f37896b, jVar.f37896b) && x.n(this.f37897c, jVar.f37897c);
    }

    public final int hashCode() {
        int iHashCode = (this.f37895a.hashCode() * 31) + this.f37896b.hashCode();
        Instant instant = this.f37897c;
        return (iHashCode * 31) + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        return "PerformanceTrace(name=" + this.f37895a + ", startTime=" + this.f37896b + ", endTime=" + this.f37897c + ")";
    }
}

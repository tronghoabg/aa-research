package com.waze.bl.c.b;

import com.waze.reports_v2.b.at;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17015a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17016b;

    /* renamed from: c, reason: collision with root package name */
    private final at f17017c = at.I;

    public h(boolean z, int i2) {
        this.f17015a = z;
        this.f17016b = i2;
    }

    public final int a() {
        return this.f17016b;
    }

    public final at b() {
        return this.f17017c;
    }

    @Override // com.waze.bl.c.b.j, com.waze.t.b.cb
    public final boolean e() {
        return this.f17015a;
    }

    @Override // com.waze.bl.c.b.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17015a == hVar.f17015a && this.f17016b == hVar.f17016b;
    }

    @Override // com.waze.bl.c.b.j
    public final int hashCode() {
        return (a.a.a(this.f17015a) * 31) + this.f17016b;
    }

    public final String toString() {
        return "ReportClosureResult(success=" + this.f17015a + ", pointsAwarded=" + this.f17016b + ")";
    }
}

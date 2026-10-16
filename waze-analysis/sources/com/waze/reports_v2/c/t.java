package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f34536a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34537b;

    public t(com.waze.reports_v2.b.at atVar, int i2) {
        super(null);
        this.f34536a = atVar;
        this.f34537b = i2;
    }

    public final int a() {
        return this.f34537b;
    }

    public final com.waze.reports_v2.b.at b() {
        return this.f34536a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f34536a == tVar.f34536a && this.f34537b == tVar.f34537b;
    }

    public final int hashCode() {
        com.waze.reports_v2.b.at atVar = this.f34536a;
        return ((atVar == null ? 0 : atVar.hashCode()) * 31) + this.f34537b;
    }

    public final String toString() {
        return "AlertReported(reportedType=" + this.f34536a + ", pointsAwarded=" + this.f34537b + ")";
    }
}

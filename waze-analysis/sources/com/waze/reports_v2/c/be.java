package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f34234a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34235b;

    public be(com.waze.reports_v2.b.at atVar, int i2) {
        super(null);
        this.f34234a = atVar;
        this.f34235b = i2;
    }

    public final int a() {
        return this.f34235b;
    }

    public final com.waze.reports_v2.b.at b() {
        return this.f34234a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return this.f34234a == beVar.f34234a && this.f34235b == beVar.f34235b;
    }

    public final int hashCode() {
        com.waze.reports_v2.b.at atVar = this.f34234a;
        return ((atVar == null ? 0 : atVar.hashCode()) * 31) + this.f34235b;
    }

    public final String toString() {
        return "Success(reportedType=" + this.f34234a + ", pointsAwarded=" + this.f34235b + ")";
    }
}

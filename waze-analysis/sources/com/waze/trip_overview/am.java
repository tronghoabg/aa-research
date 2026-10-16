package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final int f41001a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41002b;

    public am(int i2, String str) {
        this.f41001a = i2;
        this.f41002b = str;
    }

    public final int a() {
        return this.f41001a;
    }

    public final String b() {
        return this.f41002b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f41001a == amVar.f41001a && h.g.b.x.n(this.f41002b, amVar.f41002b);
    }

    public final int hashCode() {
        String str = this.f41002b;
        return (this.f41001a * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HOVData(minPassengers=" + this.f41001a + ", requiredPermit=" + this.f41002b + ")";
    }
}

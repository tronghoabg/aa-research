package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ci implements cl {

    /* renamed from: a, reason: collision with root package name */
    private final String f38495a;

    public ci(String str) {
        h.g.b.x.f(str, "eta");
        this.f38495a = str;
    }

    public final String a() {
        return this.f38495a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci) && h.g.b.x.n(this.f38495a, ((ci) obj).f38495a);
    }

    public final int hashCode() {
        return this.f38495a.hashCode();
    }

    public final String toString() {
        return "Driver(eta=" + this.f38495a + ")";
    }
}

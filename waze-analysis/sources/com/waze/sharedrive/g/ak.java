package com.waze.sharedrive.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak implements am {

    /* renamed from: a, reason: collision with root package name */
    private final String f38630a;

    public ak(String str) {
        h.g.b.x.f(str, "eta");
        this.f38630a = str;
    }

    public final String a() {
        return this.f38630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f38630a, ((ak) obj).f38630a);
    }

    public final int hashCode() {
        return this.f38630a.hashCode();
    }

    public final String toString() {
        return "Driver(eta=" + this.f38630a + ")";
    }
}

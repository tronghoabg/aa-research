package com.waze.sharedrive;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f38760a;

    public j(Throwable th) {
        h.g.b.x.f(th, "throwable");
        this.f38760a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f38760a, ((j) obj).f38760a);
    }

    public final int hashCode() {
        return this.f38760a.hashCode();
    }

    public final String toString() {
        return "Unknown(throwable=" + this.f38760a + ")";
    }
}

package com.waze.sharedrive;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38777a;

    public z(Object obj) {
        super(null);
        this.f38777a = obj;
    }

    public final Object a() {
        return this.f38777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && h.g.b.x.n(this.f38777a, ((z) obj).f38777a);
    }

    public final int hashCode() {
        return this.f38777a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f38777a + ")";
    }
}

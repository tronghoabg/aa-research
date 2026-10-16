package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj extends al {

    /* renamed from: a, reason: collision with root package name */
    private final String f40999a;

    public aj(String str) {
        super(null);
        this.f40999a = str;
    }

    public final String a() {
        return this.f40999a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && h.g.b.x.n(this.f40999a, ((aj) obj).f40999a);
    }

    public final int hashCode() {
        String str = this.f40999a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "RouteNotAllowed(optionalErrorMessage=" + this.f40999a + ")";
    }
}

package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final String f35080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(null);
        h.g.b.x.f(str, "prompt");
        this.f35080a = str;
    }

    public final String a() {
        return this.f35080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f35080a, ((x) obj).f35080a);
    }

    public final int hashCode() {
        return this.f35080a.hashCode();
    }

    public final String toString() {
        return "RequestFollowup(prompt=" + this.f35080a + ")";
    }
}

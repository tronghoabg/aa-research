package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends y {

    /* renamed from: a, reason: collision with root package name */
    private final String f34545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(null);
        h.g.b.x.f(str, "responsePrompt");
        this.f34545a = str;
    }

    public final String a() {
        return this.f34545a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f34545a, ((x) obj).f34545a);
    }

    public final int hashCode() {
        return this.f34545a.hashCode();
    }

    public final String toString() {
        return "FollowupRequired(responsePrompt=" + this.f34545a + ")";
    }
}

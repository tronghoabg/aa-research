package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f34101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(null);
        h.g.b.x.f(str, "description");
        this.f34101a = str;
    }

    public final String a() {
        return this.f34101a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f34101a, ((h) obj).f34101a);
    }

    public final int hashCode() {
        return this.f34101a.hashCode();
    }

    public final String toString() {
        return "MapIssueAdditionalData(description=" + this.f34101a + ")";
    }
}

package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as extends com.waze.main_screen.u.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(String str) {
        super(null, null);
        h.g.b.x.f(str, "url");
        this.f25840a = str;
    }

    public final String a() {
        return this.f25840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && h.g.b.x.n(this.f25840a, ((as) obj).f25840a);
    }

    public final int hashCode() {
        return this.f25840a.hashCode();
    }

    public final String toString() {
        return "OpenReportAnIssueScreen(url=" + this.f25840a + ")";
    }
}

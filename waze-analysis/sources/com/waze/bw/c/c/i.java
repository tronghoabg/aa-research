package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f17850a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(null, null);
        h.g.b.x.f(str, "url");
        this.f17850a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f17850a, ((i) obj).f17850a);
    }

    public final String g() {
        return this.f17850a;
    }

    public final int hashCode() {
        return this.f17850a.hashCode();
    }

    public final String toString() {
        return "OpenNavigationHistoryScreen(url=" + this.f17850a + ")";
    }
}

package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ap extends com.waze.main_screen.u.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(String str) {
        super(null, null);
        h.g.b.x.f(str, "url");
        this.f25837a = str;
    }

    public final String a() {
        return this.f25837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && h.g.b.x.n(this.f25837a, ((ap) obj).f25837a);
    }

    public final int hashCode() {
        return this.f25837a.hashCode();
    }

    public final String toString() {
        return "OpenInternalWebBrowser(url=" + this.f25837a + ")";
    }
}

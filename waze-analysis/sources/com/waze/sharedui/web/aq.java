package com.waze.sharedui.web;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f39329a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39330b;

    /* renamed from: c, reason: collision with root package name */
    private final ao f39331c;

    /* renamed from: d, reason: collision with root package name */
    private final ap f39332d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39333e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39334f;

    public aq(String str, ao aoVar, boolean z, boolean z2) {
        h.g.b.x.f(str, "url");
        h.g.b.x.f(aoVar, "headerState");
        this.f39329a = str;
        this.f39330b = false;
        this.f39331c = aoVar;
        this.f39332d = null;
        this.f39333e = z;
        this.f39334f = z2;
    }

    public static /* synthetic */ aq e(aq aqVar, boolean z, boolean z2, int i2) {
        String str = (i2 & 1) != 0 ? aqVar.f39329a : null;
        if ((i2 & 2) != 0) {
            boolean z3 = aqVar.f39330b;
        }
        ao aoVar = (i2 & 4) != 0 ? aqVar.f39331c : null;
        if ((i2 & 8) != 0) {
            ap apVar = aqVar.f39332d;
        }
        if ((i2 & 16) != 0) {
            z = aqVar.f39333e;
        }
        if ((i2 & 32) != 0) {
            z2 = aqVar.f39334f;
        }
        h.g.b.x.f(str, "url");
        h.g.b.x.f(aoVar, "headerState");
        return new aq(str, aoVar, z, z2);
    }

    public final ao a() {
        return this.f39331c;
    }

    public final String b() {
        return this.f39329a;
    }

    public final boolean c() {
        return this.f39334f;
    }

    public final boolean d() {
        return this.f39333e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        if (!h.g.b.x.n(this.f39329a, aqVar.f39329a)) {
            return false;
        }
        boolean z = aqVar.f39330b;
        if (!h.g.b.x.n(this.f39331c, aqVar.f39331c)) {
            return false;
        }
        ap apVar = aqVar.f39332d;
        return h.g.b.x.n(null, null) && this.f39333e == aqVar.f39333e && this.f39334f == aqVar.f39334f;
    }

    public final int hashCode() {
        return (((((((this.f39329a.hashCode() * 31) + a.a.a(false)) * 31) + this.f39331c.hashCode()) * 961) + a.a.a(this.f39333e)) * 31) + a.a.a(this.f39334f);
    }

    public final String toString() {
        return "WebPageUiState(url=" + this.f39329a + ", loading=false, headerState=" + this.f39331c + ", snackBarState=null, hasPendingBack=" + this.f39333e + ", clearWebView=" + this.f39334f + ")";
    }

    public /* synthetic */ aq(String str, ao aoVar, boolean z, int i2) {
        this(str, aoVar, z & ((i2 & 16) == 0), false);
    }
}

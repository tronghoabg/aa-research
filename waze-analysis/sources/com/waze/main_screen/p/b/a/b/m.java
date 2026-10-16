package com.waze.main_screen.p.b.a.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27132a;

    /* renamed from: b, reason: collision with root package name */
    private final e f27133b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27134c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27135d;

    /* renamed from: e, reason: collision with root package name */
    private final k f27136e;

    /* renamed from: f, reason: collision with root package name */
    private final f f27137f;

    public /* synthetic */ m(byte[] bArr) {
        e eVar = e.f27098a;
        k kVar = k.f27118a;
        f fVar = f.f27101a;
        x.f(eVar, "background");
        x.f(kVar, "style");
        x.f(fVar, "bottomConnection");
        this.f27132a = true;
        this.f27133b = eVar;
        this.f27134c = false;
        this.f27135d = true;
        this.f27136e = kVar;
        this.f27137f = fVar;
    }

    public final e a() {
        return this.f27133b;
    }

    public final f b() {
        return this.f27137f;
    }

    public final k c() {
        return this.f27136e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        boolean z = mVar.f27132a;
        if (this.f27133b != mVar.f27133b) {
            return false;
        }
        boolean z2 = mVar.f27134c;
        boolean z3 = mVar.f27135d;
        return this.f27136e == mVar.f27136e && this.f27137f == mVar.f27137f;
    }

    public final int hashCode() {
        return (((((((((a.a.a(true) * 31) + this.f27133b.hashCode()) * 31) + a.a.a(false)) * 31) + a.a.a(true)) * 31) + this.f27136e.hashCode()) * 31) + this.f27137f.hashCode();
    }

    public final String toString() {
        return "CompatExternalState(isAllowedShowingSubviews=true, background=" + this.f27133b + ", isNavlistButtonVisible=false, isBottomShadowVisible=true, style=" + this.f27136e + ", bottomConnection=" + this.f27137f + ")";
    }

    public m() {
        this(null);
    }
}

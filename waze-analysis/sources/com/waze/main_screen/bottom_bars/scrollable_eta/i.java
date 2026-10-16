package com.waze.main_screen.bottom_bars.scrollable_eta;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25974a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25975b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25976c;

    public i(boolean z, boolean z2, boolean z3) {
        this.f25974a = z;
        this.f25975b = z2;
        this.f25976c = z3;
    }

    public final boolean a() {
        return this.f25975b;
    }

    public final boolean b() {
        return this.f25974a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f25974a == iVar.f25974a && this.f25975b == iVar.f25975b && this.f25976c == iVar.f25976c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f25974a) * 31) + a.a.a(this.f25975b)) * 31) + a.a.a(this.f25976c);
    }

    public final String toString() {
        return "EtaScreenNavData(shownAgain=" + this.f25974a + ", delayed=" + this.f25975b + ", dontShowRoutePreview=" + this.f25976c + ")";
    }
}

package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36331a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36332b;

    public da(boolean z, boolean z2) {
        this.f36331a = z;
        this.f36332b = z2;
    }

    public final boolean a() {
        return this.f36332b;
    }

    public final boolean b() {
        return this.f36331a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return this.f36331a == daVar.f36331a && this.f36332b == daVar.f36332b;
    }

    public final int hashCode() {
        return (a.a.a(this.f36331a) * 31) + a.a.a(this.f36332b);
    }

    public final String toString() {
        return "OverlayUpdateProperties(showSearchInArea=" + this.f36331a + ", showRecenter=" + this.f36332b + ")";
    }
}

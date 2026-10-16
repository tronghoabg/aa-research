package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cu implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final String f28168a;

    public cu(String str) {
        h.g.b.x.f(str, "adId");
        this.f28168a = str;
    }

    public final String a() {
        return this.f28168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu) && h.g.b.x.n(this.f28168a, ((cu) obj).f28168a);
    }

    public final int hashCode() {
        return this.f28168a.hashCode();
    }

    public final String toString() {
        return "AdClicked(adId=" + this.f28168a + ")";
    }
}

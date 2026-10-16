package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u extends com.waze.install.ah {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f28369a;

    public u(Boolean bool) {
        super(null);
        this.f28369a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && h.g.b.x.n(this.f28369a, ((u) obj).f28369a);
    }

    public final int hashCode() {
        return this.f28369a.hashCode();
    }

    public final String toString() {
        return "DarkOverlayStateChanged(isDarkOverlayShown=" + this.f28369a + ")";
    }
}

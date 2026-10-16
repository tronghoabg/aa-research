package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends com.waze.ui.d.s {

    /* renamed from: a, reason: collision with root package name */
    private final an f43712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(an anVar) {
        super(null);
        h.g.b.x.f(anVar, "variant");
        this.f43712a = anVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f43712a == ((v) obj).f43712a;
    }

    public final int hashCode() {
        return this.f43712a.hashCode();
    }

    public final an l() {
        return this.f43712a;
    }

    public final String toString() {
        return "FteHint(variant=" + this.f43712a + ")";
    }
}

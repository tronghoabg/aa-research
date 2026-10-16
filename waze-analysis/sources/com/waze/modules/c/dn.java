package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dn extends com.waze.aj.b {

    /* renamed from: a, reason: collision with root package name */
    private final dp f30102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(dp dpVar) {
        super(null, null);
        h.g.b.x.f(dpVar, "indication");
        this.f30102a = dpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn) && this.f30102a == ((dn) obj).f30102a;
    }

    public final dp f() {
        return this.f30102a;
    }

    public final int hashCode() {
        return this.f30102a.hashCode();
    }

    public final String toString() {
        return "Indication(indication=" + this.f30102a + ")";
    }
}

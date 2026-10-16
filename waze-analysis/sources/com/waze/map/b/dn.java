package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z.a.d.ai f28212a;

    public dn(com.waze.z.a.d.ai aiVar) {
        h.g.b.x.f(aiVar, "showActiveRoute");
        this.f28212a = aiVar;
    }

    public final com.waze.z.a.d.ai a() {
        return this.f28212a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn) && h.g.b.x.n(this.f28212a, ((dn) obj).f28212a);
    }

    public final int hashCode() {
        return this.f28212a.hashCode();
    }

    public final String toString() {
        return "NavigationContent(showActiveRoute=" + this.f28212a + ")";
    }

    public dn() {
        this((byte[]) null);
    }

    public /* synthetic */ dn(byte[] bArr) {
        this(bv.f28115a);
    }
}

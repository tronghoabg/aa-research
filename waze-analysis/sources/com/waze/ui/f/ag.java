package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final z f42279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(z zVar) {
        super(null);
        h.g.b.x.f(zVar, "reason");
        this.f42279a = zVar;
    }

    public final z a() {
        return this.f42279a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && h.g.b.x.n(this.f42279a, ((ag) obj).f42279a);
    }

    public final int hashCode() {
        return this.f42279a.hashCode();
    }

    public final String toString() {
        return "Paused(reason=" + this.f42279a + ")";
    }
}

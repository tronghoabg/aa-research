package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    private final dd f28743a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28744b;

    public dc(dd ddVar, boolean z) {
        h.g.b.x.f(ddVar, "variant");
        this.f28743a = ddVar;
        this.f28744b = z;
    }

    public static /* synthetic */ dc c(dc dcVar, boolean z) {
        dd ddVar = dcVar.f28743a;
        h.g.b.x.f(ddVar, "variant");
        return new dc(ddVar, z);
    }

    public final dd a() {
        return this.f28743a;
    }

    public final boolean b() {
        return this.f28744b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return this.f28743a == dcVar.f28743a && this.f28744b == dcVar.f28744b;
    }

    public final int hashCode() {
        return (this.f28743a.hashCode() * 31) + a.a.a(this.f28744b);
    }

    public final String toString() {
        return "Schema(variant=" + this.f28743a + ", isDark=" + this.f28744b + ")";
    }
}

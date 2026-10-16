package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final ag f27999a;

    /* renamed from: b, reason: collision with root package name */
    private final float f28000b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28001c;

    public ah(ag agVar, float f2, boolean z) {
        h.g.b.x.f(agVar, "mode");
        this.f27999a = agVar;
        this.f28000b = f2;
        this.f28001c = z;
    }

    public final float a() {
        return this.f28000b;
    }

    public final ag b() {
        return this.f27999a;
    }

    public final boolean c() {
        return this.f28001c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f27999a == ahVar.f27999a && Float.compare(this.f28000b, ahVar.f28000b) == 0 && this.f28001c == ahVar.f28001c;
    }

    public final int hashCode() {
        return (((this.f27999a.hashCode() * 31) + Float.floatToIntBits(this.f28000b)) * 31) + a.a.a(this.f28001c);
    }

    public final String toString() {
        return "MapOrientation(mode=" + this.f27999a + ", degrees=" + this.f28000b + ", clockwise=" + this.f28001c + ")";
    }
}

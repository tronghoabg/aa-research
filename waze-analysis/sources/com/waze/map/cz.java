package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cz extends com.waze.map.canvas.m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28722a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28723b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28724c;

    public /* synthetic */ cz(boolean z, boolean z2, int i2) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 & ((i2 & 2) == 0), false);
    }

    public final boolean a() {
        return this.f28724c;
    }

    public final boolean b() {
        return this.f28723b;
    }

    public final boolean c() {
        return this.f28722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return this.f28722a == czVar.f28722a && this.f28723b == czVar.f28723b && this.f28724c == czVar.f28724c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f28722a) * 31) + a.a.a(this.f28723b)) * 31) + a.a.a(this.f28724c);
    }

    public final String toString() {
        return "Presenting(mapContentSync=" + this.f28722a + ", mapBoundsSync=" + this.f28723b + ", gotAckFromMap=" + this.f28724c + ")";
    }

    public cz(boolean z, boolean z2, boolean z3) {
        this.f28722a = z;
        this.f28723b = z2;
        this.f28724c = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cz() {
        boolean z = false;
        this(z, z, 7);
    }
}

package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fn {

    /* renamed from: a, reason: collision with root package name */
    private final fo f40025a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40026b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40027c;

    public fn(fo foVar, boolean z, int i2) {
        h.g.b.x.f(foVar, "playingState");
        this.f40025a = foVar;
        this.f40026b = z;
        this.f40027c = i2;
    }

    public static /* synthetic */ fn d(fn fnVar, fo foVar, boolean z, int i2, int i3) {
        if ((i3 & 1) != 0) {
            foVar = fnVar.f40025a;
        }
        if ((i3 & 2) != 0) {
            z = fnVar.f40026b;
        }
        if ((i3 & 4) != 0) {
            i2 = fnVar.f40027c;
        }
        h.g.b.x.f(foVar, "playingState");
        return new fn(foVar, z, i2);
    }

    public final int a() {
        return this.f40027c;
    }

    public final fo b() {
        return this.f40025a;
    }

    public final boolean c() {
        return this.f40026b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        return this.f40025a == fnVar.f40025a && this.f40026b == fnVar.f40026b && this.f40027c == fnVar.f40027c;
    }

    public final int hashCode() {
        return (((this.f40025a.hashCode() * 31) + a.a.a(this.f40026b)) * 31) + this.f40027c;
    }

    public final String toString() {
        return "PlayerState(playingState=" + this.f40025a + ", isMuted=" + this.f40026b + ", volume=" + this.f40027c + ")";
    }
}

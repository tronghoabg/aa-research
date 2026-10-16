package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ff {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40004a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40005b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40006c;

    public ff(boolean z, boolean z2, boolean z3) {
        this.f40004a = z;
        this.f40005b = z2;
        this.f40006c = z3;
    }

    public static /* synthetic */ ff d(ff ffVar, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = ffVar.f40004a;
        }
        if ((i2 & 2) != 0) {
            z2 = ffVar.f40005b;
        }
        if ((i2 & 4) != 0) {
            z3 = ffVar.f40006c;
        }
        return new ff(z, z2, z3);
    }

    public final boolean a() {
        return this.f40004a;
    }

    public final boolean b() {
        return this.f40005b;
    }

    public final boolean c() {
        return this.f40006c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return this.f40004a == ffVar.f40004a && this.f40005b == ffVar.f40005b && this.f40006c == ffVar.f40006c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f40004a) * 31) + a.a.a(this.f40005b)) * 31) + a.a.a(this.f40006c);
    }

    public final String toString() {
        return "State(routeSoundToSpeaker=" + this.f40004a + ", isCarConnected=" + this.f40005b + ", isInACall=" + this.f40006c + ")";
    }
}

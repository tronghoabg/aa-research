package com.waze.settings.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f37006a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37007b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37008c;

    public d(int i2, int i3, int i4) {
        this.f37006a = i2;
        this.f37007b = i3;
        this.f37008c = i4;
    }

    public final int a() {
        return this.f37007b;
    }

    public final int b() {
        return this.f37006a;
    }

    public final int c() {
        return this.f37008c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f37006a == dVar.f37006a && this.f37007b == dVar.f37007b && this.f37008c == dVar.f37008c;
    }

    public final int hashCode() {
        return (((this.f37006a * 31) + this.f37007b) * 31) + this.f37008c;
    }

    public final String toString() {
        return "GasTypeIcons(unselectedIcon=" + this.f37006a + ", selectedIcon=" + this.f37007b + ", viewIcon=" + this.f37008c + ")";
    }
}

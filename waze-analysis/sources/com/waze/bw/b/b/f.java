package com.waze.bw.b.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f17749a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17750b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17751c;

    public f(int i2, boolean z, boolean z2) {
        this.f17749a = i2;
        this.f17750b = z;
        this.f17751c = z2;
    }

    public final int a() {
        return this.f17749a;
    }

    public final boolean b() {
        return this.f17750b;
    }

    public final boolean c() {
        return this.f17751c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17749a == fVar.f17749a && this.f17750b == fVar.f17750b && this.f17751c == fVar.f17751c;
    }

    public final int hashCode() {
        return (((this.f17749a * 31) + a.a.a(this.f17750b)) * 31) + a.a.a(this.f17751c);
    }

    public final String toString() {
        return "FavoritesCarouselInfo(favoriteChipsCount=" + this.f17749a + ", isHomeSet=" + this.f17750b + ", isWorkSet=" + this.f17751c + ")";
    }
}

package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26651a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26652b;

    public d(int i2, boolean z) {
        this.f26651a = i2;
        this.f26652b = z;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26651a;
    }

    public final boolean b() {
        return this.f26652b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f26651a == dVar.f26651a && this.f26652b == dVar.f26652b;
    }

    public final int hashCode() {
        return (this.f26651a * 31) + a.a.a(this.f26652b);
    }

    public final String toString() {
        return "Insight(top=" + this.f26651a + ", fullWidth=" + this.f26652b + ")";
    }
}

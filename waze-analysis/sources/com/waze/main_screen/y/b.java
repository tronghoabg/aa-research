package com.waze.main_screen.y;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27871a;

    public b(boolean z) {
        this.f27871a = z;
    }

    public final boolean a() {
        return this.f27871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f27871a == ((b) obj).f27871a;
    }

    public final int hashCode() {
        return a.a.a(this.f27871a);
    }

    public final String toString() {
        return "AlternateRoutesV2(safeRoutesEnabled=" + this.f27871a + ")";
    }

    public b() {
        this(false);
    }
}

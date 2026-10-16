package com.waze.ui.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    private final int f41739a;

    public f(int i2) {
        super(null);
        this.f41739a = i2;
    }

    public final int a() {
        return this.f41739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f41739a == ((f) obj).f41739a;
    }

    public final int hashCode() {
        return this.f41739a;
    }

    public final String toString() {
        return "Accidents(count=" + this.f41739a + ")";
    }
}

package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26655a;

    public g(int i2) {
        this.f26655a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26655a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f26655a == ((g) obj).f26655a;
    }

    public final int hashCode() {
        return this.f26655a;
    }

    public final String toString() {
        return "VehicleTypePill(top=" + this.f26655a + ")";
    }
}

package com.waze.ui.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    private final int f41740a;

    public g(int i2) {
        super(null);
        this.f41740a = i2;
    }

    public final int a() {
        return this.f41740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f41740a == ((g) obj).f41740a;
    }

    public final int hashCode() {
        return this.f41740a;
    }

    public final String toString() {
        return "Hazards(count=" + this.f41740a + ")";
    }
}

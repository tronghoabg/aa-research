package com.waze.ui.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final int f41741a;

    public h(int i2) {
        super(null);
        this.f41741a = i2;
    }

    public final int a() {
        return this.f41741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f41741a == ((h) obj).f41741a;
    }

    public final int hashCode() {
        return this.f41741a;
    }

    public final String toString() {
        return "Police(count=" + this.f41741a + ")";
    }
}

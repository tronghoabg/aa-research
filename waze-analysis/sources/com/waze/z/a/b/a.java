package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f45715a;

    public a(int i2) {
        this.f45715a = i2;
    }

    public final int a() {
        return this.f45715a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f45715a == ((a) obj).f45715a;
    }

    public final int hashCode() {
        return this.f45715a;
    }

    public final String toString() {
        return "CollapsedAnchorPoint(heightPx=" + this.f45715a + ")";
    }
}

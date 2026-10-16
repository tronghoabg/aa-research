package com.waze.bl.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    private final int f17030a;

    public i(int i2) {
        this.f17030a = i2;
    }

    public final int a() {
        return this.f17030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f17030a == ((i) obj).f17030a;
    }

    public final int hashCode() {
        return this.f17030a;
    }

    public final String toString() {
        return "Success(pointsAwarded=" + this.f17030a + ")";
    }
}

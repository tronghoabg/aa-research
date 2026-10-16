package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28134a;

    public cb(boolean z) {
        this.f28134a = z;
    }

    public final boolean a() {
        return this.f28134a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb) && this.f28134a == ((cb) obj).f28134a;
    }

    public final int hashCode() {
        return a.a.a(this.f28134a);
    }

    public final String toString() {
        return "CameraFeatures(handleTouches=" + this.f28134a + ")";
    }
}

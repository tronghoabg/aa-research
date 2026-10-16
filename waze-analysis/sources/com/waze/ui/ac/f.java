package com.waze.ui.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f41761a;

    public f(int i2) {
        this.f41761a = i2;
    }

    public final int a() {
        return this.f41761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f41761a == ((f) obj).f41761a;
    }

    public final int hashCode() {
        return this.f41761a;
    }

    public final String toString() {
        return "Resource(resId=" + this.f41761a + ")";
    }
}

package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    private final int f42736a;

    public v(int i2) {
        this.f42736a = i2;
    }

    public final int a() {
        return this.f42736a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f42736a == ((v) obj).f42736a;
    }

    public final int hashCode() {
        return this.f42736a;
    }

    public final String toString() {
        return "Lottie(lottieResId=" + this.f42736a + ")";
    }
}

package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    private final int f42735a;

    public u(int i2) {
        this.f42735a = i2;
    }

    public final int a() {
        return this.f42735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f42735a == ((u) obj).f42735a;
    }

    public final int hashCode() {
        return this.f42735a;
    }

    public final String toString() {
        return "Image(resId=" + this.f42735a + ")";
    }
}

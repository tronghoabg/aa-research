package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw extends az {

    /* renamed from: a, reason: collision with root package name */
    private final long f42024a;

    public aw(long j2) {
        super(null);
        this.f42024a = j2;
    }

    public final long a() {
        return this.f42024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && this.f42024a == ((aw) obj).f42024a;
    }

    public final int hashCode() {
        return a.a.b(this.f42024a);
    }

    public final String toString() {
        return "Hours(hours=" + this.f42024a + ")";
    }
}

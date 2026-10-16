package com.waze.ui.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43814a;

    public f(boolean z) {
        super(null);
        this.f43814a = z;
    }

    public final boolean a() {
        return this.f43814a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f43814a == ((f) obj).f43814a;
    }

    public final int hashCode() {
        return a.a.a(this.f43814a);
    }

    public final String toString() {
        return "Supported(isEnabled=" + this.f43814a + ")";
    }
}

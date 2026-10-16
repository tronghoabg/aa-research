package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15776a;

    public x(boolean z) {
        this.f15776a = z;
    }

    public final boolean a() {
        return this.f15776a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f15776a == ((x) obj).f15776a;
    }

    public final int hashCode() {
        return a.a.a(this.f15776a);
    }

    public final String toString() {
        return "TokenOptions(force=" + this.f15776a + ")";
    }
}

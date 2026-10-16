package com.waze.shared_infra.coordinators;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37835a;

    public p(boolean z) {
        this.f37835a = z;
    }

    public final boolean a() {
        return this.f37835a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f37835a == ((p) obj).f37835a;
    }

    public final int hashCode() {
        return a.a.a(this.f37835a);
    }

    public final String toString() {
        return "WazeCoordinatorConfig(allowMultipleSubCoordinators=" + this.f37835a + ")";
    }
}

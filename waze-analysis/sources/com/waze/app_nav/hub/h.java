package com.waze.app_nav.hub;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final Class f15343a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15344b;

    public h(Class cls) {
        h.g.b.x.f(cls, "clazz");
        this.f15343a = cls;
        this.f15344b = "UnmanagedActivity(" + cls.getCanonicalName() + ")";
    }

    @Override // com.waze.app_nav.hub.j
    public final e b() {
        throw new RuntimeException("Unmanaged Activity");
    }

    @Override // com.waze.app_nav.hub.j
    public final String c() {
        return this.f15344b;
    }

    @Override // com.waze.app_nav.hub.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f15343a, ((h) obj).f15343a);
    }

    @Override // com.waze.app_nav.hub.j
    public final int hashCode() {
        return this.f15343a.hashCode();
    }

    @Override // com.waze.app_nav.hub.j
    public final String toString() {
        return "UnmanagedActivity(clazz=" + this.f15343a + ")";
    }
}

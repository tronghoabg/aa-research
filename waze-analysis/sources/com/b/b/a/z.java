package com.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    final com.b.b.d.v f2618a;

    /* renamed from: b, reason: collision with root package name */
    final x f2619b;

    /* renamed from: c, reason: collision with root package name */
    final Class f2620c;

    z(com.b.b.d.v vVar, x xVar, Class cls) {
        this.f2620c = cls;
        this.f2618a = vVar;
        this.f2619b = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f2618a.equals(((z) obj).f2618a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2618a.hashCode();
    }
}

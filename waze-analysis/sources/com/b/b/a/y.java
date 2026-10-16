package com.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    final com.b.b.d.v f2615a;

    /* renamed from: b, reason: collision with root package name */
    final b f2616b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f2617c;

    y(com.b.b.d.v vVar, b bVar, Class cls) {
        this.f2617c = cls;
        this.f2615a = vVar;
        this.f2616b = bVar;
    }

    public final void a(com.b.b.c.c cVar) {
        try {
            this.f2616b.f(new t(cVar.a(this.f2617c), 0));
        } catch (Exception e2) {
            this.f2616b.e(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f2615a.equals(((y) obj).f2615a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2615a.hashCode();
    }
}

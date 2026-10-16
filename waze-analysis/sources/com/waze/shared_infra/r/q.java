package com.waze.shared_infra.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final p f37992a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37993b;

    public q(p pVar, boolean z) {
        h.g.b.x.f(pVar, "appType");
        this.f37992a = pVar;
        this.f37993b = z;
    }

    public final p a() {
        return this.f37992a;
    }

    public final boolean b() {
        return this.f37993b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f37992a == qVar.f37992a && this.f37993b == qVar.f37993b;
    }

    public final int hashCode() {
        return (this.f37992a.hashCode() * 31) + a.a.a(this.f37993b);
    }

    public final String toString() {
        return "LoggedInFromAnotherDevice(appType=" + this.f37992a + ", isLoggedInCurrentSession=" + this.f37993b + ")";
    }

    private q() {
        throw null;
    }
}

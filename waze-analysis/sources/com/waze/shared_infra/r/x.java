package com.waze.shared_infra.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.waze.shared_infra.h.b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38000a;

    public x(boolean z) {
        super(null);
        this.f38000a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f38000a == ((x) obj).f38000a;
    }

    public final int hashCode() {
        return a.a.a(this.f38000a);
    }

    @Override // com.waze.shared_infra.h.b
    public final boolean i() {
        return this.f38000a;
    }

    public final String toString() {
        return "USER_CHANGED(loggedIn=" + this.f38000a + ")";
    }
}

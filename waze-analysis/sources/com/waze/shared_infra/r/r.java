package com.waze.shared_infra.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.shared_infra.h.b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37994a;

    public r(boolean z) {
        super(null);
        this.f37994a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f37994a == ((r) obj).f37994a;
    }

    public final int hashCode() {
        return a.a.a(this.f37994a);
    }

    @Override // com.waze.shared_infra.h.b
    public final boolean i() {
        return this.f37994a;
    }

    public final String toString() {
        return "CREDENTIALS_CHANGED(loggedIn=" + this.f37994a + ")";
    }
}

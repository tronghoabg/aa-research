package com.waze.shared_infra.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends com.waze.shared_infra.h.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f37997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar) {
        super(null);
        h.g.b.x.f(qVar, "error");
        this.f37997a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && h.g.b.x.n(this.f37997a, ((u) obj).f37997a);
    }

    public final int hashCode() {
        return this.f37997a.hashCode();
    }

    public final q j() {
        return this.f37997a;
    }

    public final String toString() {
        return "LoginFailed(error=" + this.f37997a + ")";
    }
}

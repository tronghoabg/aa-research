package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends y {

    /* renamed from: a, reason: collision with root package name */
    private final u f34542a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar) {
        super(null);
        h.g.b.x.f(uVar, "reason");
        this.f34542a = uVar;
    }

    public final u a() {
        return this.f34542a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f34542a == ((v) obj).f34542a;
    }

    public final int hashCode() {
        return this.f34542a.hashCode();
    }

    public final String toString() {
        return "Cancelled(reason=" + this.f34542a + ")";
    }
}

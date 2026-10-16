package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final String f15763a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(null);
        h.g.b.x.f(str, "token");
        this.f15763a = str;
    }

    public final String a() {
        return this.f15763a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f15763a, ((j) obj).f15763a);
    }

    public final int hashCode() {
        return this.f15763a.hashCode();
    }

    public final String toString() {
        return "LoginToken(token=" + this.f15763a + ")";
    }
}

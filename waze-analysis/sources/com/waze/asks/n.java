package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f15627a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "uniqueId");
        h.g.b.x.f(str2, "providerId");
        this.f15627a = str;
        this.f15628b = str2;
    }

    public final String a() {
        return this.f15628b;
    }

    public final String b() {
        return this.f15627a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f15627a, nVar.f15627a) && h.g.b.x.n(this.f15628b, nVar.f15628b);
    }

    public final int hashCode() {
        return (this.f15627a.hashCode() * 31) + this.f15628b.hashCode();
    }

    public final String toString() {
        return "Alert(uniqueId=" + this.f15627a + ", providerId=" + this.f15628b + ")";
    }
}

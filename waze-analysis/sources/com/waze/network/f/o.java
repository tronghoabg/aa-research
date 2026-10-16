package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final int f32325a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32326b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.authentication.v f32327c;

    public o(int i2, String str, com.waze.authentication.v vVar) {
        h.g.b.x.f(str, "errorMessage");
        this.f32325a = i2;
        this.f32326b = str;
        this.f32327c = vVar;
    }

    public final int a() {
        return this.f32325a;
    }

    public final com.waze.authentication.v b() {
        return this.f32327c;
    }

    public final String c() {
        return this.f32326b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f32325a == oVar.f32325a && h.g.b.x.n(this.f32326b, oVar.f32326b) && h.g.b.x.n(this.f32327c, oVar.f32327c);
    }

    public final int hashCode() {
        int iHashCode = (this.f32325a * 31) + this.f32326b.hashCode();
        com.waze.authentication.v vVar = this.f32327c;
        return (iHashCode * 31) + (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        return "Fail(networkErrorCode=" + this.f32325a + ", errorMessage=" + this.f32326b + ", authenticationError=" + this.f32327c + ")";
    }

    public /* synthetic */ o(int i2, String str) {
        this(i2, str, null);
    }
}

package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f40785a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40786b;

    public n(int i2, boolean z) {
        this.f40785a = i2;
        this.f40786b = z;
    }

    public static /* synthetic */ n c(n nVar) {
        return new n(nVar.f40785a, true);
    }

    public final int a() {
        return this.f40785a;
    }

    public final boolean b() {
        return this.f40786b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f40785a == nVar.f40785a && this.f40786b == nVar.f40786b;
    }

    public final int hashCode() {
        return (this.f40785a * 31) + a.a.a(this.f40786b);
    }

    public final String toString() {
        return "ResponseStream(id=" + this.f40785a + ", includesUserFacingResponse=" + this.f40786b + ")";
    }
}

package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44551a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44552b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44553c;

    /* renamed from: d, reason: collision with root package name */
    private final n f44554d;

    public p(boolean z, boolean z2, n nVar) {
        h.g.b.x.f(nVar, "exitCode");
        this.f44551a = z;
        this.f44552b = z2;
        this.f44553c = false;
        this.f44554d = nVar;
    }

    public static /* synthetic */ p c(p pVar, boolean z, boolean z2, n nVar, int i2) {
        if ((i2 & 1) != 0) {
            z = pVar.f44551a;
        }
        if ((i2 & 2) != 0) {
            z2 = pVar.f44552b;
        }
        boolean z3 = pVar.f44553c;
        h.g.b.x.f(nVar, "exitCode");
        return new p(z, z2, nVar);
    }

    public final n a() {
        return this.f44554d;
    }

    public final boolean b() {
        return this.f44551a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f44551a != pVar.f44551a || this.f44552b != pVar.f44552b) {
            return false;
        }
        boolean z = pVar.f44553c;
        return this.f44554d == pVar.f44554d;
    }

    public final int hashCode() {
        return (((((a.a.a(this.f44551a) * 31) + a.a.a(this.f44552b)) * 31) + a.a.a(false)) * 31) + this.f44554d.hashCode();
    }

    public final String toString() {
        return "UidStatus(uidRunning=" + this.f44551a + ", authenticatedThisSession=" + this.f44552b + ", authenticatingExistingProfile=false, exitCode=" + this.f44554d + ")";
    }
}

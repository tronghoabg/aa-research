package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18685a;

    /* renamed from: b, reason: collision with root package name */
    private final q f18686b;

    public r(boolean z, q qVar) {
        this.f18685a = z;
        this.f18686b = qVar;
    }

    public final q a() {
        return this.f18686b;
    }

    public final boolean b() {
        return this.f18685a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f18685a == rVar.f18685a && h.g.b.x.n(this.f18686b, rVar.f18686b);
    }

    public final int hashCode() {
        q qVar = this.f18686b;
        return (a.a.a(this.f18685a) * 31) + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "AlternateRoutesLoadingState(visible=" + this.f18685a + ", loadingState=" + this.f18686b + ")";
    }

    public r() {
        this(null);
    }

    public /* synthetic */ r(byte[] bArr) {
        this(false, null);
    }
}

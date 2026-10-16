package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ba extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final String f45797a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45798b;

    public ba(String str, boolean z) {
        h.g.b.x.f(str, "errorText");
        this.f45797a = str;
        this.f45798b = z;
    }

    public final String a() {
        return this.f45797a;
    }

    public final boolean b() {
        return this.f45798b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return h.g.b.x.n(this.f45797a, baVar.f45797a) && this.f45798b == baVar.f45798b;
    }

    public final int hashCode() {
        return (this.f45797a.hashCode() * 31) + a.a.a(this.f45798b);
    }

    public final String toString() {
        return "Error(errorText=" + this.f45797a + ", textOnly=" + this.f45798b + ")";
    }

    public ba() {
        this((String) null, 3);
    }

    public /* synthetic */ ba(String str, int i2) {
        this(1 == (i2 & 1) ? "" : str, false);
    }
}

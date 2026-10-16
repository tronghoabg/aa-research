package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c f14569a = new c(true, true);

    /* renamed from: b, reason: collision with root package name */
    private static final c f14570b = new c(false, false);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14571c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14572d;

    public c(boolean z, boolean z2) {
        this.f14571c = z;
        this.f14572d = z2;
    }

    public final boolean c() {
        return this.f14571c;
    }

    public final boolean d() {
        return this.f14572d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14571c == cVar.f14571c && this.f14572d == cVar.f14572d;
    }

    public final int hashCode() {
        return (a.a.a(this.f14571c) * 31) + a.a.a(this.f14572d);
    }

    public final String toString() {
        return "ButtonType(isPrimary=" + this.f14571c + ", isPrimaryColor=" + this.f14572d + ")";
    }
}

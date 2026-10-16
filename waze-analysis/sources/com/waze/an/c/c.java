package com.waze.an.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f14766a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14767b;

    public c(int i2, String str) {
        h.g.b.x.f(str, "text");
        this.f14766a = i2;
        this.f14767b = str;
    }

    public final int a() {
        return this.f14766a;
    }

    public final String b() {
        return this.f14767b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14766a == cVar.f14766a && h.g.b.x.n(this.f14767b, cVar.f14767b);
    }

    public final int hashCode() {
        return (this.f14766a * 31) + this.f14767b.hashCode();
    }

    public final String toString() {
        return "Silent(animationResId=" + this.f14766a + ", text=" + this.f14767b + ")";
    }
}

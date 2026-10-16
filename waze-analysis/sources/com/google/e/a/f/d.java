package com.google.e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8493a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8494b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8495c;

    /* synthetic */ d(int i2, int i3, c cVar) {
        this.f8493a = i2;
        this.f8494b = i3;
        this.f8495c = cVar;
    }

    public static g j() {
        return new g(null);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8495c != c.f8491d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f8493a == this.f8493a && dVar.h() == h() && dVar.f8495c == this.f8495c;
    }

    public final int f() {
        return this.f8494b;
    }

    public final int g() {
        return this.f8493a;
    }

    public final int h() {
        c cVar = this.f8495c;
        if (cVar == c.f8491d) {
            return this.f8494b;
        }
        if (cVar == c.f8488a || cVar == c.f8489b || cVar == c.f8490c) {
            return this.f8494b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Objects.hash(d.class, Integer.valueOf(this.f8493a), Integer.valueOf(this.f8494b), this.f8495c);
    }

    public final c i() {
        return this.f8495c;
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f8495c) + ", " + this.f8494b + "-byte tags, and " + this.f8493a + "-byte key)";
    }
}

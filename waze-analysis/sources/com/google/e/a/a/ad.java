package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final ac f8169a;

    private ad(ac acVar) {
        this.f8169a = acVar;
    }

    public static ad g(ac acVar) {
        return new ad(acVar);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8169a != ac.f8167c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ad) && ((ad) obj).f8169a == this.f8169a;
    }

    public final ac f() {
        return this.f8169a;
    }

    public final int hashCode() {
        return Objects.hash(ad.class, this.f8169a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f8169a.toString() + ")";
    }
}

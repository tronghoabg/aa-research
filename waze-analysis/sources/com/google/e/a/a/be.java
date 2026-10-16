package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class be extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final bd f8262a;

    private be(bd bdVar) {
        this.f8262a = bdVar;
    }

    public static be g(bd bdVar) {
        return new be(bdVar);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8262a != bd.f8260c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof be) && ((be) obj).f8262a == this.f8262a;
    }

    public final bd f() {
        return this.f8262a;
    }

    public final int hashCode() {
        return Objects.hash(be.class, this.f8262a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f8262a.toString() + ")";
    }
}

package com.google.e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8526a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8527b;

    /* renamed from: c, reason: collision with root package name */
    private final m f8528c;

    /* renamed from: d, reason: collision with root package name */
    private final l f8529d;

    /* synthetic */ n(int i2, int i3, m mVar, l lVar) {
        this.f8526a = i2;
        this.f8527b = i3;
        this.f8528c = mVar;
        this.f8529d = lVar;
    }

    public static k i() {
        return new k();
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8528c != m.f8524d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f8526a == this.f8526a && nVar.h() == h() && nVar.f8528c == this.f8528c && nVar.f8529d == this.f8529d;
    }

    public final int f() {
        return this.f8527b;
    }

    public final int g() {
        return this.f8526a;
    }

    public final int h() {
        m mVar = this.f8528c;
        if (mVar == m.f8524d) {
            return this.f8527b;
        }
        if (mVar == m.f8521a || mVar == m.f8522b || mVar == m.f8523c) {
            return this.f8527b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Objects.hash(n.class, Integer.valueOf(this.f8526a), Integer.valueOf(this.f8527b), this.f8528c, this.f8529d);
    }

    public final l j() {
        return this.f8529d;
    }

    public final m k() {
        return this.f8528c;
    }

    public final String toString() {
        l lVar = this.f8529d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f8528c) + ", hashType: " + String.valueOf(lVar) + ", " + this.f8527b + "-byte tags, and " + this.f8526a + "-byte key)";
    }
}

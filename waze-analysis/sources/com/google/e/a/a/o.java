package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8312a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8313b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8314c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final n f8315d;

    /* synthetic */ o(int i2, int i3, n nVar) {
        this.f8312a = i2;
        this.f8313b = i3;
        this.f8315d = nVar;
    }

    public static am i() {
        return new am((char[]) null);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8315d != n.f8310c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f8312a == this.f8312a && oVar.f8313b == this.f8313b) {
            int i2 = oVar.f8314c;
            if (oVar.f8315d == this.f8315d) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f8313b;
    }

    public final int g() {
        return this.f8312a;
    }

    public final n h() {
        return this.f8315d;
    }

    public final int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f8312a), Integer.valueOf(this.f8313b), 16, this.f8315d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f8315d) + ", " + this.f8313b + "-byte IV, 16-byte tag, and " + this.f8312a + "-byte key)";
    }
}

package com.google.e.a.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8388a;

    /* renamed from: b, reason: collision with root package name */
    private final f f8389b;

    /* synthetic */ g(int i2, f fVar) {
        this.f8388a = i2;
        this.f8389b = fVar;
    }

    public static e g() {
        return new e();
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8389b != f.f8386c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f8388a == this.f8388a && gVar.f8389b == this.f8389b;
    }

    public final int f() {
        return this.f8388a;
    }

    public final f h() {
        return this.f8389b;
    }

    public final int hashCode() {
        return Objects.hash(g.class, Integer.valueOf(this.f8388a), this.f8389b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.f8389b) + ", " + this.f8388a + "-byte key)";
    }
}

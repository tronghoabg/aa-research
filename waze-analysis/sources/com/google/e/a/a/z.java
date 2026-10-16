package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8352a;

    /* renamed from: b, reason: collision with root package name */
    private final y f8353b;

    /* synthetic */ z(int i2, y yVar) {
        this.f8352a = i2;
        this.f8353b = yVar;
    }

    public static x g() {
        return new x();
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8353b != y.f8350c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.f8352a == this.f8352a && zVar.f8353b == this.f8353b;
    }

    public final int f() {
        return this.f8352a;
    }

    public final y h() {
        return this.f8353b;
    }

    public final int hashCode() {
        return Objects.hash(z.class, Integer.valueOf(this.f8352a), this.f8353b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f8353b) + ", " + this.f8352a + "-byte key)";
    }
}

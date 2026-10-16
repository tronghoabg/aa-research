package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8330a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8331b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f8332c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final s f8333d;

    /* synthetic */ t(int i2, s sVar) {
        this.f8330a = i2;
        this.f8333d = sVar;
    }

    public static am h() {
        return new am((byte[]) null);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8333d != s.f8328c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (tVar.f8330a == this.f8330a) {
            int i2 = tVar.f8331b;
            int i3 = tVar.f8332c;
            if (tVar.f8333d == this.f8333d) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f8330a;
    }

    public final s g() {
        return this.f8333d;
    }

    public final int hashCode() {
        return Objects.hash(t.class, Integer.valueOf(this.f8330a), 12, 16, this.f8333d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f8333d) + ", 12-byte IV, 16-byte tag, and " + this.f8330a + "-byte key)";
    }
}

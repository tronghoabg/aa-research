package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j extends g {

    /* renamed from: a, reason: collision with root package name */
    private final char f7238a;

    j(char c2) {
        this.f7238a = c2;
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return c2 != this.f7238a;
    }

    @Override // com.google.d.b.g, com.google.d.b.p
    public final p b() {
        return new h(this.f7238a);
    }

    public final String toString() {
        return "CharMatcher.isNot('" + p.k(this.f7238a) + "')";
    }
}

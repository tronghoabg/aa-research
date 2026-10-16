package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    private final char f7235a;

    h(char c2) {
        this.f7235a = c2;
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return c2 == this.f7235a;
    }

    @Override // com.google.d.b.g, com.google.d.b.p
    public final p b() {
        return new j(this.f7235a);
    }

    public final String toString() {
        return "CharMatcher.is('" + p.k(this.f7235a) + "')";
    }
}

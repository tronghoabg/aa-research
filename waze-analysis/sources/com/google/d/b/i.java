package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i extends g {

    /* renamed from: a, reason: collision with root package name */
    private final char f7236a;

    /* renamed from: b, reason: collision with root package name */
    private final char f7237b;

    i(char c2, char c3) {
        this.f7236a = c2;
        this.f7237b = c3;
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return c2 == this.f7236a || c2 == this.f7237b;
    }

    public final String toString() {
        char c2 = this.f7237b;
        return "CharMatcher.anyOf(\"" + p.k(this.f7236a) + p.k(c2) + "\")";
    }
}

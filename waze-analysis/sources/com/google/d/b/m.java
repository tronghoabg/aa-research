package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    final p f7241a;

    m(p pVar) {
        this.f7241a = pVar;
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return !this.f7241a.a(c2);
    }

    @Override // com.google.d.b.p
    public final p b() {
        return this.f7241a;
    }

    public final String toString() {
        return this.f7241a.toString().concat(".negate()");
    }
}

package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends p {

    /* renamed from: a, reason: collision with root package name */
    final p f7230a;

    /* renamed from: b, reason: collision with root package name */
    final p f7231b;

    c(p pVar, p pVar2) {
        this.f7230a = pVar;
        this.f7231b = pVar2;
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return this.f7230a.a(c2) && this.f7231b.a(c2);
    }

    public final String toString() {
        p pVar = this.f7231b;
        return this.f7230a.toString() + ".and(" + pVar.toString() + ")";
    }
}

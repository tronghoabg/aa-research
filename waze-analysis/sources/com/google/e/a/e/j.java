package com.google.e.a.e;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.e.a.f f8446a;

    public j(com.google.android.libraries.e.a.f fVar) {
        this.f8446a = fVar;
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return !this.f8446a.e().equals(com.google.e.a.s.f8785d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        com.google.android.libraries.e.a.f fVar = ((j) obj).f8446a;
        com.google.android.libraries.e.a.f fVar2 = this.f8446a;
        return fVar2.e().equals(fVar.e()) && fVar2.g().equals(fVar.g()) && fVar2.f().equals(fVar.f());
    }

    public final com.google.android.libraries.e.a.f f() {
        return this.f8446a;
    }

    public final int hashCode() {
        com.google.android.libraries.e.a.f fVar = this.f8446a;
        return Objects.hash(fVar.g(), fVar.f(), fVar.e());
    }

    public final String toString() {
        com.google.android.libraries.e.a.f fVar = this.f8446a;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", fVar.g(), fVar.e());
    }
}

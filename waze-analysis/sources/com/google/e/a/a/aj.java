package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f8190a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f8191b;

    private aj(String str, ai aiVar) {
        this.f8190a = str;
        this.f8191b = aiVar;
    }

    public static aj g(String str, ai aiVar) {
        return new aj(str, aiVar);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8191b != ai.f8188b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return ajVar.f8190a.equals(this.f8190a) && ajVar.f8191b.equals(this.f8191b);
    }

    public final ai f() {
        return this.f8191b;
    }

    public final String h() {
        return this.f8190a;
    }

    public final int hashCode() {
        return Objects.hash(aj.class, this.f8190a, this.f8191b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f8190a + ", variant: " + this.f8191b.toString() + ")";
    }
}

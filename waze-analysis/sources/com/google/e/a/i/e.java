package com.google.e.a.i;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8617a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f8618b;

    /* renamed from: c, reason: collision with root package name */
    private final d f8619c;

    /* renamed from: d, reason: collision with root package name */
    private final d f8620d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f8621e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f8622f;

    /* synthetic */ e(Integer num, Integer num2, d dVar, d dVar2, Integer num3, Integer num4) {
        this.f8617a = num;
        this.f8618b = num2;
        this.f8619c = dVar;
        this.f8620d = dVar2;
        this.f8621e = num3;
        this.f8622f = num4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.i() == i() && eVar.g() == g() && eVar.f8619c == this.f8619c && eVar.f8620d == this.f8620d && eVar.h() == h() && eVar.f() == f();
    }

    public final int f() {
        return this.f8622f.intValue();
    }

    public final int g() {
        return this.f8618b.intValue();
    }

    public final int h() {
        return this.f8621e.intValue();
    }

    public final int hashCode() {
        return Objects.hash(e.class, this.f8617a, this.f8618b, this.f8619c, this.f8620d, this.f8621e, this.f8622f);
    }

    public final int i() {
        return this.f8617a.intValue();
    }

    public final d j() {
        return this.f8619c;
    }

    public final d k() {
        return this.f8620d;
    }

    public final String toString() {
        d dVar = this.f8619c;
        return "AesCtrHmacStreaming Parameters (IKM size: " + this.f8617a + ", " + this.f8618b + "-byte AES key, " + String.valueOf(dVar) + " for HKDF, " + String.valueOf(dVar) + " for HMAC, " + this.f8621e + "-byte tags, " + this.f8622f + "-byte ciphertexts)";
    }
}

package com.google.e.a.i;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8638a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f8639b;

    /* renamed from: c, reason: collision with root package name */
    private final i f8640c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8641d;

    /* synthetic */ j(Integer num, Integer num2, i iVar, Integer num3) {
        this.f8638a = num;
        this.f8639b = num2;
        this.f8640c = iVar;
        this.f8641d = num3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.h() == h() && jVar.g() == g() && jVar.f8640c == this.f8640c && jVar.f() == f();
    }

    public final int f() {
        return this.f8641d.intValue();
    }

    public final int g() {
        return this.f8639b.intValue();
    }

    public final int h() {
        return this.f8638a.intValue();
    }

    public final int hashCode() {
        return Objects.hash(j.class, this.f8638a, this.f8639b, this.f8640c, this.f8641d);
    }

    public final i i() {
        return this.f8640c;
    }

    public final String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.f8638a + ", " + this.f8639b + "-byte AES GCM key, " + String.valueOf(this.f8640c) + " for HKDF " + this.f8641d + "-byte ciphertexts)";
    }
}

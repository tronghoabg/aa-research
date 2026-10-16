package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8293a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8294b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8295c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8296d;

    /* renamed from: e, reason: collision with root package name */
    private final i f8297e;

    /* renamed from: f, reason: collision with root package name */
    private final h f8298f;

    /* synthetic */ j(int i2, int i3, int i4, int i5, i iVar, h hVar) {
        this.f8293a = i2;
        this.f8294b = i3;
        this.f8295c = i4;
        this.f8296d = i5;
        this.f8297e = iVar;
        this.f8298f = hVar;
    }

    public static g j() {
        return new g();
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8297e != i.f8291c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f8293a == this.f8293a && jVar.f8294b == this.f8294b && jVar.f8295c == this.f8295c && jVar.f8296d == this.f8296d && jVar.f8297e == this.f8297e && jVar.f8298f == this.f8298f;
    }

    public final int f() {
        return this.f8293a;
    }

    public final int g() {
        return this.f8294b;
    }

    public final int h() {
        return this.f8295c;
    }

    public final int hashCode() {
        return Objects.hash(j.class, Integer.valueOf(this.f8293a), Integer.valueOf(this.f8294b), Integer.valueOf(this.f8295c), Integer.valueOf(this.f8296d), this.f8297e, this.f8298f);
    }

    public final int i() {
        return this.f8296d;
    }

    public final h k() {
        return this.f8298f;
    }

    public final i l() {
        return this.f8297e;
    }

    public final String toString() {
        h hVar = this.f8298f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f8297e) + ", hashType: " + String.valueOf(hVar) + ", " + this.f8295c + "-byte IV, and " + this.f8296d + "-byte tags, and " + this.f8293a + "-byte AES key, and " + this.f8294b + "-byte HMAC key)";
    }
}

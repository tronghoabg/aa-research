package com.google.e.a.a;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ba extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final az f8247a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8248b;

    private ba(az azVar, int i2) {
        this.f8247a = azVar;
        this.f8248b = i2;
    }

    public static ba h(az azVar, int i2) throws GeneralSecurityException {
        if (i2 < 8 || i2 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new ba(azVar, i2);
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8247a != az.f8243b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return baVar.f8247a == this.f8247a && baVar.f8248b == this.f8248b;
    }

    public final int f() {
        return this.f8248b;
    }

    public final az g() {
        return this.f8247a;
    }

    public final int hashCode() {
        return Objects.hash(ba.class, this.f8247a, Integer.valueOf(this.f8248b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f8247a.toString() + "salt_size_bytes: " + this.f8248b + ")";
    }
}

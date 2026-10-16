package com.google.e.a.g;

import j$.util.Objects;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8545a;

    private b(int i2) {
        this.f8545a = i2;
    }

    public static b g(int i2) throws InvalidAlgorithmParameterException {
        if (i2 == 16 || i2 == 32) {
            return new b(i2);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i2 * 8)));
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f8545a == this.f8545a;
    }

    public final int f() {
        return this.f8545a;
    }

    public final int hashCode() {
        return Objects.hash(b.class, Integer.valueOf(this.f8545a));
    }

    public final String toString() {
        return "AesCmac PRF Parameters (" + this.f8545a + "-byte key)";
    }
}

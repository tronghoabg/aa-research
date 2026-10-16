package com.google.e.a.c;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8382a = null;

    /* renamed from: b, reason: collision with root package name */
    private f f8383b = f.f8386c;

    /* synthetic */ e() {
    }

    public final g a() throws GeneralSecurityException {
        Integer num = this.f8382a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8383b != null) {
            return new g(num.intValue(), this.f8383b);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void b(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 32 && i2 != 48 && i2 != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i2)));
        }
        this.f8382a = Integer.valueOf(i2);
    }

    public final void c(f fVar) {
        this.f8383b = fVar;
    }
}

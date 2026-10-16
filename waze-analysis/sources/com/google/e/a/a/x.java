package com.google.e.a.a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8346a = null;

    /* renamed from: b, reason: collision with root package name */
    private y f8347b = y.f8350c;

    /* synthetic */ x() {
    }

    public final z a() throws GeneralSecurityException {
        Integer num = this.f8346a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8347b != null) {
            return new z(num.intValue(), this.f8347b);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void b(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f8346a = Integer.valueOf(i2);
    }

    public final void c(y yVar) {
        this.f8347b = yVar;
    }
}

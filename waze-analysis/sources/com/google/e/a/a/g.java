package com.google.e.a.a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8277a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8278b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8279c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f8280d = null;

    /* renamed from: e, reason: collision with root package name */
    private h f8281e = null;

    /* renamed from: f, reason: collision with root package name */
    private i f8282f = i.f8291c;

    /* synthetic */ g() {
    }

    public final j a() throws GeneralSecurityException {
        if (this.f8277a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f8278b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f8279c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f8280d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f8281e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f8282f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        h hVar = this.f8281e;
        if (hVar == h.f8283a) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (hVar == h.f8284b) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (hVar == h.f8285c) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (hVar == h.f8286d) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (hVar != h.f8287e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new j(this.f8277a.intValue(), this.f8278b.intValue(), this.f8279c.intValue(), this.f8280d.intValue(), this.f8282f, this.f8281e);
    }

    public final void b(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f8277a = Integer.valueOf(i2);
    }

    public final void c(h hVar) {
        this.f8281e = hVar;
    }

    public final void d(int i2) throws InvalidAlgorithmParameterException {
        if (i2 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i2)));
        }
        this.f8278b = Integer.valueOf(i2);
    }

    public final void e(int i2) throws GeneralSecurityException {
        if (i2 < 12 || i2 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i2)));
        }
        this.f8279c = Integer.valueOf(i2);
    }

    public final void f(int i2) throws GeneralSecurityException {
        if (i2 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i2)));
        }
        this.f8280d = Integer.valueOf(i2);
    }

    public final void g(i iVar) {
        this.f8282f = iVar;
    }
}

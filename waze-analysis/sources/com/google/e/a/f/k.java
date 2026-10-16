package com.google.e.a.f;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8511a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8512b = null;

    /* renamed from: c, reason: collision with root package name */
    private l f8513c = null;

    /* renamed from: d, reason: collision with root package name */
    private m f8514d = m.f8524d;

    /* synthetic */ k() {
    }

    public final n a() throws GeneralSecurityException {
        Integer num = this.f8511a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f8512b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f8513c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f8514d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f8511a));
        }
        Integer num2 = this.f8512b;
        int iIntValue = num2.intValue();
        l lVar = this.f8513c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (lVar == l.f8515a) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (lVar == l.f8516b) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (lVar == l.f8517c) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (lVar == l.f8518d) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (lVar != l.f8519e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new n(this.f8511a.intValue(), this.f8512b.intValue(), this.f8514d, this.f8513c);
    }

    public final void b(l lVar) {
        this.f8513c = lVar;
    }

    public final void c(int i2) {
        this.f8511a = Integer.valueOf(i2);
    }

    public final void d(int i2) {
        this.f8512b = Integer.valueOf(i2);
    }

    public final void e(m mVar) {
        this.f8514d = mVar;
    }
}

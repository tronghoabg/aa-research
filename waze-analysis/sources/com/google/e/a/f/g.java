package com.google.e.a.f;

import com.google.e.a.e.w;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private Object f8497a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8498b;

    /* renamed from: c, reason: collision with root package name */
    private Object f8499c;

    /* synthetic */ g(byte[] bArr) {
        this.f8497a = null;
        this.f8499c = null;
        this.f8498b = c.f8491d;
    }

    public final h a() throws GeneralSecurityException {
        Object obj;
        com.google.e.a.k.a aVarA;
        Object obj2 = this.f8497a;
        if (obj2 == null || (obj = this.f8499c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((n) obj2).g() != ((com.google.android.libraries.phenotype.client.stable.p) obj).d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((com.google.d.m.a.a.b) obj2).c() && this.f8498b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((com.google.d.m.a.a.b) this.f8497a).c() && this.f8498b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (((n) this.f8497a).k() == m.f8524d) {
            aVarA = w.f8463a;
        } else if (((n) this.f8497a).k() == m.f8523c || ((n) this.f8497a).k() == m.f8522b) {
            aVarA = w.a(((Integer) this.f8498b).intValue());
        } else {
            if (((n) this.f8497a).k() != m.f8521a) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(((n) this.f8497a).k()))));
            }
            aVarA = w.b(((Integer) this.f8498b).intValue());
        }
        return new h((n) this.f8497a, (com.google.android.libraries.phenotype.client.stable.p) this.f8499c, aVarA, (Integer) this.f8498b);
    }

    public final void b(Integer num) {
        this.f8498b = num;
    }

    public final void c(n nVar) {
        this.f8497a = nVar;
    }

    public final void d(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8499c = pVar;
    }

    public final d e() {
        Object obj = this.f8497a;
        if (obj == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f8499c == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f8498b != null) {
            return new d(((Integer) obj).intValue(), ((Integer) this.f8499c).intValue(), (c) this.f8498b);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final void f(int i2) {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
        this.f8497a = Integer.valueOf(i2);
    }

    public final void g(int i2) {
        if (i2 >= 10 && i2 <= 16) {
            this.f8499c = Integer.valueOf(i2);
        } else {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i2);
        }
    }

    public final void h(c cVar) {
        this.f8498b = cVar;
    }

    public final a i() throws GeneralSecurityException {
        Object obj;
        com.google.e.a.k.a aVarA;
        Object obj2 = this.f8498b;
        if (obj2 == null || (obj = this.f8497a) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((d) obj2).g() != ((com.google.android.libraries.phenotype.client.stable.p) obj).d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((com.google.d.m.a.a.b) obj2).c() && this.f8499c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((com.google.d.m.a.a.b) this.f8498b).c() && this.f8499c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (((d) this.f8498b).i() == c.f8491d) {
            aVarA = w.f8463a;
        } else if (((d) this.f8498b).i() == c.f8490c || ((d) this.f8498b).i() == c.f8489b) {
            aVarA = w.a(((Integer) this.f8499c).intValue());
        } else {
            if (((d) this.f8498b).i() != c.f8488a) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(((d) this.f8498b).i()))));
            }
            aVarA = w.b(((Integer) this.f8499c).intValue());
        }
        return new a((d) this.f8498b, (com.google.android.libraries.phenotype.client.stable.p) this.f8497a, aVarA, (Integer) this.f8499c);
    }

    public final void j(Integer num) {
        this.f8499c = num;
    }

    public final void k(d dVar) {
        this.f8498b = dVar;
    }

    public final void l(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8497a = pVar;
    }

    /* synthetic */ g() {
        this.f8497a = null;
        this.f8499c = null;
        this.f8498b = null;
    }

    /* synthetic */ g(byte[] bArr, byte[] bArr2) {
        this.f8498b = null;
        this.f8497a = null;
        this.f8499c = null;
    }
}

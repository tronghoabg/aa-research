package com.google.e.a.a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private Object f8199a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8200b;

    /* renamed from: c, reason: collision with root package name */
    private Object f8201c;

    /* renamed from: d, reason: collision with root package name */
    private Object f8202d;

    /* synthetic */ am(byte[] bArr) {
        this.f8199a = null;
        this.f8201c = null;
        this.f8200b = null;
        this.f8202d = s.f8328c;
    }

    public final ap a() throws GeneralSecurityException {
        if (this.f8199a == null) {
            this.f8199a = ao.f8211b;
        }
        if (this.f8200b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (this.f8201c == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        Object obj = this.f8202d;
        if (obj == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (((com.google.d.m.a.a.b) obj).c()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        Object obj2 = this.f8201c;
        Object obj3 = this.f8202d;
        if ((obj2.equals(an.f8203a) && (obj3 instanceof t)) || ((obj2.equals(an.f8205c) && (obj3 instanceof ad)) || ((obj2.equals(an.f8204b) && (obj3 instanceof be)) || ((obj2.equals(an.f8206d) && (obj3 instanceof j)) || ((obj2.equals(an.f8207e) && (obj3 instanceof o)) || (obj2.equals(an.f8208f) && (obj3 instanceof z))))))) {
            return new ap((ao) this.f8199a, (String) this.f8200b, (an) this.f8201c, (com.google.d.m.a.a.b) this.f8202d);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + ((an) this.f8201c).toString() + " when new keys are picked according to " + String.valueOf(this.f8202d) + ".");
    }

    public final void b(an anVar) {
        this.f8201c = anVar;
    }

    public final void c(String str) {
        this.f8200b = str;
    }

    public final void d(ao aoVar) {
        this.f8199a = aoVar;
    }

    public final t e() throws GeneralSecurityException {
        Object obj = this.f8199a;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8202d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f8201c == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f8200b == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = ((Integer) obj).intValue();
        ((Integer) this.f8201c).intValue();
        ((Integer) this.f8200b).intValue();
        return new t(iIntValue, (s) this.f8202d);
    }

    public final void f() {
        this.f8201c = 12;
    }

    public final void g(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f8199a = Integer.valueOf(i2);
    }

    public final void h() {
        this.f8200b = 16;
    }

    public final void i(s sVar) {
        this.f8202d = sVar;
    }

    public final o j() throws GeneralSecurityException {
        Object obj = this.f8200b;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8201c == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f8199a == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f8202d == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) this.f8201c).intValue();
        ((Integer) this.f8202d).intValue();
        return new o(iIntValue, iIntValue2, (n) this.f8199a);
    }

    public final void k(int i2) throws GeneralSecurityException {
        if (i2 != 12 && i2 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i2)));
        }
        this.f8201c = Integer.valueOf(i2);
    }

    public final void l(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f8200b = Integer.valueOf(i2);
    }

    public final void m() {
        this.f8202d = 16;
    }

    public final void n(n nVar) {
        this.f8199a = nVar;
    }

    public final d o() throws GeneralSecurityException {
        com.google.e.a.k.a aVarB;
        Object obj = this.f8199a;
        if (obj == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Object obj2 = this.f8201c;
        if (obj2 == null || this.f8200b == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        j jVar = (j) obj;
        if (jVar.f() != ((com.google.android.libraries.phenotype.client.stable.p) obj2).d()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (jVar.g() != ((com.google.android.libraries.phenotype.client.stable.p) this.f8200b).d()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (((com.google.d.m.a.a.b) this.f8199a).c() && this.f8202d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((com.google.d.m.a.a.b) this.f8199a).c() && this.f8202d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (((j) this.f8199a).l() == i.f8291c) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else if (((j) this.f8199a).l() == i.f8290b) {
            aVarB = com.google.e.a.e.w.a(((Integer) this.f8202d).intValue());
        } else {
            if (((j) this.f8199a).l() != i.f8289a) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(((j) this.f8199a).l()))));
            }
            aVarB = com.google.e.a.e.w.b(((Integer) this.f8202d).intValue());
        }
        com.google.e.a.k.a aVar = aVarB;
        Object obj3 = this.f8199a;
        Object obj4 = this.f8201c;
        com.google.android.libraries.phenotype.client.stable.p pVar = (com.google.android.libraries.phenotype.client.stable.p) obj4;
        return new d((j) obj3, pVar, (com.google.android.libraries.phenotype.client.stable.p) this.f8200b, aVar, (Integer) this.f8202d);
    }

    public final void p(Integer num) {
        this.f8202d = num;
    }

    public final void q(j jVar) {
        this.f8199a = jVar;
    }

    public final void r(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8201c = pVar;
    }

    public final void s(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8200b = pVar;
    }

    public final void t(com.google.d.m.a.a.b bVar) {
        this.f8202d = bVar;
    }

    /* synthetic */ am(byte[] bArr, byte[] bArr2) {
        this.f8199a = null;
        this.f8201c = null;
        this.f8200b = null;
        this.f8202d = null;
    }

    /* synthetic */ am(char[] cArr) {
        this.f8200b = null;
        this.f8201c = null;
        this.f8202d = null;
        this.f8199a = n.f8310c;
    }
}

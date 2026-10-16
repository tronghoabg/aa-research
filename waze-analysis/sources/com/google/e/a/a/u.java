package com.google.e.a.a;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    private com.google.d.m.a.a.b f8336c = null;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.libraries.phenotype.client.stable.p f8335b = null;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8334a = null;

    /* synthetic */ u() {
    }

    public final v a() throws GeneralSecurityException {
        com.google.android.libraries.phenotype.client.stable.p pVar;
        com.google.e.a.k.a aVarB;
        com.google.d.m.a.a.b bVar = this.f8336c;
        if (bVar == null || (pVar = this.f8335b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((z) bVar).f() != pVar.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bVar.c() && this.f8334a == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f8336c.c() && this.f8334a != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (((z) this.f8336c).h() == y.f8350c) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else if (((z) this.f8336c).h() == y.f8349b) {
            aVarB = com.google.e.a.e.w.a(this.f8334a.intValue());
        } else {
            if (((z) this.f8336c).h() != y.f8348a) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(((z) this.f8336c).h()))));
            }
            aVarB = com.google.e.a.e.w.b(this.f8334a.intValue());
        }
        return new v((z) this.f8336c, this.f8335b, aVarB, this.f8334a);
    }

    public final void b(Integer num) {
        this.f8334a = num;
    }

    public final void c(z zVar) {
        this.f8336c = zVar;
    }

    public final void d(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8335b = pVar;
    }

    public final p e() throws GeneralSecurityException {
        com.google.android.libraries.phenotype.client.stable.p pVar;
        com.google.e.a.k.a aVarB;
        com.google.d.m.a.a.b bVar = this.f8336c;
        if (bVar == null || (pVar = this.f8335b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((t) bVar).f() != pVar.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bVar.c() && this.f8334a == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f8336c.c() && this.f8334a != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (((t) this.f8336c).g() == s.f8328c) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else if (((t) this.f8336c).g() == s.f8327b) {
            aVarB = com.google.e.a.e.w.a(this.f8334a.intValue());
        } else {
            if (((t) this.f8336c).g() != s.f8326a) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(((t) this.f8336c).g()))));
            }
            aVarB = com.google.e.a.e.w.b(this.f8334a.intValue());
        }
        return new p((t) this.f8336c, this.f8335b, aVarB, this.f8334a);
    }

    public final void f(Integer num) {
        this.f8334a = num;
    }

    public final void g(t tVar) {
        this.f8336c = tVar;
    }

    public final k h() throws GeneralSecurityException {
        com.google.android.libraries.phenotype.client.stable.p pVar;
        com.google.e.a.k.a aVarB;
        com.google.d.m.a.a.b bVar = this.f8336c;
        if (bVar == null || (pVar = this.f8335b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((o) bVar).g() != pVar.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bVar.c() && this.f8334a == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f8336c.c() && this.f8334a != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (((o) this.f8336c).h() == n.f8310c) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else if (((o) this.f8336c).h() == n.f8309b) {
            aVarB = com.google.e.a.e.w.a(this.f8334a.intValue());
        } else {
            if (((o) this.f8336c).h() != n.f8308a) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(((o) this.f8336c).h()))));
            }
            aVarB = com.google.e.a.e.w.b(this.f8334a.intValue());
        }
        return new k((o) this.f8336c, this.f8335b, aVarB, this.f8334a);
    }

    public final void i(Integer num) {
        this.f8334a = num;
    }

    public final void j(o oVar) {
        this.f8336c = oVar;
    }

    public final void k(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8335b = pVar;
    }

    public final void l(com.google.android.libraries.phenotype.client.stable.p pVar) {
        this.f8335b = pVar;
    }
}

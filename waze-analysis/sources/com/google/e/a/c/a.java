package com.google.e.a.c;

import com.google.android.libraries.phenotype.client.stable.p;
import com.google.e.a.e.w;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private g f8359a = null;

    /* renamed from: c, reason: collision with root package name */
    private p f8361c = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8360b = null;

    /* synthetic */ a() {
    }

    public final b a() throws GeneralSecurityException {
        p pVar;
        com.google.e.a.k.a aVarB;
        g gVar = this.f8359a;
        if (gVar == null || (pVar = this.f8361c) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (gVar.f() != pVar.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (gVar.c() && this.f8360b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f8359a.c() && this.f8360b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f8359a.h() == f.f8386c) {
            aVarB = w.f8463a;
        } else if (this.f8359a.h() == f.f8385b) {
            aVarB = w.a(this.f8360b.intValue());
        } else {
            if (this.f8359a.h() != f.f8384a) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.f8359a.h()))));
            }
            aVarB = w.b(this.f8360b.intValue());
        }
        return new b(this.f8359a, this.f8361c, aVarB, this.f8360b);
    }

    public final void b(Integer num) {
        this.f8360b = num;
    }

    public final void c(g gVar) {
        this.f8359a = gVar;
    }

    public final void d(p pVar) {
        this.f8361c = pVar;
    }
}

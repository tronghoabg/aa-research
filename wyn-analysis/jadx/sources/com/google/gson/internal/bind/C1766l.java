package com.google.gson.internal.bind;

import A.AbstractC0213f;
import java.io.IOException;
import la.InterfaceC3449A;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1766l extends la.z {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3449A f27471b = d(la.x.f40211b);

    /* renamed from: a, reason: collision with root package name */
    public final la.x f27472a;

    public C1766l(la.x xVar) {
        this.f27472a = xVar;
    }

    public static InterfaceC3449A d(la.x xVar) {
        final C1766l c1766l = new C1766l(xVar);
        return new InterfaceC3449A() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // la.InterfaceC3449A
            public final la.z create(la.l lVar, C3883a c3883a) {
                if (c3883a.f44183a == Number.class) {
                    return this.f27394a;
                }
                return null;
            }
        };
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        int iE0 = c3962a.e0();
        int iF = AbstractC0213f.f(iE0);
        if (iF == 5 || iF == 6) {
            return this.f27472a.a(c3962a);
        }
        if (iF == 8) {
            c3962a.a0();
            return null;
        }
        throw new la.p("Expecting number, got: " + pd.f.s(iE0) + "; at path " + c3962a.y(), 13);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.X((Number) obj);
    }
}

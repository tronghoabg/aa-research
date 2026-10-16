package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import p7.AbstractC3772b;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1770p extends la.z {

    /* renamed from: a, reason: collision with root package name */
    public final r f27485a;

    public AbstractC1770p(r rVar) {
        this.f27485a = rVar;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        Object objD = d();
        Map map = this.f27485a.f27488a;
        try {
            c3962a.b();
            while (c3962a.D()) {
                C1769o c1769o = (C1769o) map.get(c3962a.Y());
                if (c1769o == null) {
                    c3962a.k0();
                } else {
                    f(objD, c3962a, c1769o);
                }
            }
            c3962a.o();
            return e(objD);
        } catch (IllegalAccessException e7) {
            AbstractC3772b abstractC3772b = pa.c.f43447a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalStateException e10) {
            throw new la.p(e10, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c3963b.z();
            return;
        }
        c3963b.d();
        try {
            Iterator it = this.f27485a.f27489b.iterator();
            while (it.hasNext()) {
                ((C1769o) it.next()).a(c3963b, obj);
            }
            c3963b.o();
        } catch (IllegalAccessException e7) {
            AbstractC3772b abstractC3772b = pa.c.f43447a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, C3962a c3962a, C1769o c1769o);
}

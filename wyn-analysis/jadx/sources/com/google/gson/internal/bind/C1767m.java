package com.google.gson.internal.bind;

import A.AbstractC0213f;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import la.InterfaceC3449A;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1767m extends la.z {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC3449A f27473c = new ObjectTypeAdapter$1(la.x.f40210a);

    /* renamed from: a, reason: collision with root package name */
    public final la.l f27474a;

    /* renamed from: b, reason: collision with root package name */
    public final la.x f27475b;

    public C1767m(la.l lVar, la.x xVar) {
        this.f27474a = lVar;
        this.f27475b = xVar;
    }

    public static InterfaceC3449A d(la.x xVar) {
        return xVar == la.x.f40210a ? f27473c : new ObjectTypeAdapter$1(xVar);
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iE0 = c3962a.e0();
        int iF = AbstractC0213f.f(iE0);
        if (iF == 0) {
            c3962a.a();
            arrayList = new ArrayList();
        } else if (iF != 2) {
            arrayList = null;
        } else {
            c3962a.b();
            arrayList = new na.l(true);
        }
        if (arrayList == null) {
            return e(c3962a, iE0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c3962a.D()) {
                String strY = arrayList instanceof Map ? c3962a.Y() : null;
                int iE02 = c3962a.e0();
                int iF2 = AbstractC0213f.f(iE02);
                if (iF2 == 0) {
                    c3962a.a();
                    arrayList2 = new ArrayList();
                } else if (iF2 != 2) {
                    arrayList2 = null;
                } else {
                    c3962a.b();
                    arrayList2 = new na.l(true);
                }
                boolean z2 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(c3962a, iE02);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strY, arrayList2);
                }
                if (z2) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c3962a.i();
                } else {
                    c3962a.o();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        if (obj == null) {
            c3963b.z();
            return;
        }
        Class<?> cls = obj.getClass();
        la.l lVar = this.f27474a;
        lVar.getClass();
        la.z zVarC = lVar.c(new C3883a(cls));
        if (!(zVarC instanceof C1767m)) {
            zVarC.c(c3963b, obj);
        } else {
            c3963b.d();
            c3963b.o();
        }
    }

    public final Serializable e(C3962a c3962a, int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF == 5) {
            return c3962a.c0();
        }
        if (iF == 6) {
            return this.f27475b.a(c3962a);
        }
        if (iF == 7) {
            return Boolean.valueOf(c3962a.Q());
        }
        if (iF != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(pd.f.s(i5)));
        }
        c3962a.a0();
        return null;
    }
}

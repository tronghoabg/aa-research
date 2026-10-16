package com.google.gson.internal.bind;

import A.AbstractC0213f;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1760f extends la.z {

    /* renamed from: a, reason: collision with root package name */
    public static final C1760f f27455a = new C1760f();

    private C1760f() {
    }

    public static la.o d(C3962a c3962a, int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF == 5) {
            return new la.s(c3962a.c0());
        }
        if (iF == 6) {
            return new la.s(new na.h(c3962a.c0()));
        }
        if (iF == 7) {
            return new la.s(Boolean.valueOf(c3962a.Q()));
        }
        if (iF != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(pd.f.s(i5)));
        }
        c3962a.a0();
        return la.q.f40207a;
    }

    public static void e(C3963b c3963b, la.o oVar) throws IOException {
        if (oVar == null || (oVar instanceof la.q)) {
            c3963b.z();
            return;
        }
        boolean z2 = oVar instanceof la.s;
        if (z2) {
            if (!z2) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            la.s sVar = (la.s) oVar;
            Serializable serializable = sVar.f40209a;
            if (serializable instanceof Number) {
                c3963b.X(sVar.f());
                return;
            } else if (serializable instanceof Boolean) {
                c3963b.Z(sVar.a());
                return;
            } else {
                c3963b.Y(sVar.c());
                return;
            }
        }
        boolean z10 = oVar instanceof la.m;
        if (z10) {
            c3963b.b();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            Iterator it = ((la.m) oVar).f40206a.iterator();
            while (it.hasNext()) {
                e(c3963b, (la.o) it.next());
            }
            c3963b.i();
            return;
        }
        if (!(oVar instanceof la.r)) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        c3963b.d();
        Iterator it2 = ((na.j) oVar.b().f40208a.entrySet()).iterator();
        while (((hb.F) it2).hasNext()) {
            na.k kVarB = ((na.i) it2).b();
            c3963b.w((String) kVarB.getKey());
            e(c3963b, (la.o) kVarB.getValue());
        }
        c3963b.o();
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        la.o mVar;
        la.o mVar2;
        if (c3962a instanceof C1762h) {
            C1762h c1762h = (C1762h) c3962a;
            int iE0 = c1762h.e0();
            if (iE0 != 5 && iE0 != 2 && iE0 != 4 && iE0 != 10) {
                la.o oVar = (la.o) c1762h.r0();
                c1762h.k0();
                return oVar;
            }
            throw new IllegalStateException("Unexpected " + pd.f.s(iE0) + " when reading a JsonElement.");
        }
        int iE02 = c3962a.e0();
        int iF = AbstractC0213f.f(iE02);
        if (iF == 0) {
            c3962a.a();
            mVar = new la.m();
        } else if (iF != 2) {
            mVar = null;
        } else {
            c3962a.b();
            mVar = new la.r();
        }
        if (mVar == null) {
            return d(c3962a, iE02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c3962a.D()) {
                String strY = mVar instanceof la.r ? c3962a.Y() : null;
                int iE03 = c3962a.e0();
                int iF2 = AbstractC0213f.f(iE03);
                if (iF2 == 0) {
                    c3962a.a();
                    mVar2 = new la.m();
                } else if (iF2 != 2) {
                    mVar2 = null;
                } else {
                    c3962a.b();
                    mVar2 = new la.r();
                }
                boolean z2 = mVar2 != null;
                if (mVar2 == null) {
                    mVar2 = d(c3962a, iE03);
                }
                if (mVar instanceof la.m) {
                    ((la.m) mVar).f40206a.add(mVar2);
                } else {
                    la.r rVar = (la.r) mVar;
                    rVar.getClass();
                    rVar.f40208a.put(strY, mVar2);
                }
                if (z2) {
                    arrayDeque.addLast(mVar);
                    mVar = mVar2;
                }
            } else {
                if (mVar instanceof la.m) {
                    c3962a.i();
                } else {
                    c3962a.o();
                }
                if (arrayDeque.isEmpty()) {
                    return mVar;
                }
                mVar = (la.o) arrayDeque.removeLast();
            }
        }
    }

    @Override // la.z
    public final /* bridge */ /* synthetic */ void c(C3963b c3963b, Object obj) throws IOException {
        e(c3963b, (la.o) obj);
    }
}

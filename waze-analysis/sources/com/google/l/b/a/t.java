package com.google.l.b.a;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.l.v f12309a = new s(1);

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.d f12310b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12311c;

    /* synthetic */ t(com.google.l.d dVar, int i2) {
        this.f12310b = dVar;
        this.f12311c = i2;
    }

    public static com.google.l.v a(int i2) {
        return i2 == 1 ? f12309a : new s(0);
    }

    private final Object c(com.google.l.d.b bVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 5) {
            return bVar.h();
        }
        if (i3 == 6) {
            return com.google.h.a.a.a.a.b.b(this.f12311c, bVar);
        }
        if (i3 == 7) {
            return Boolean.valueOf(bVar.q());
        }
        if (i3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(com.waze.c.c.e.c(i2)));
        }
        bVar.m();
        return null;
    }

    private static final Object f(com.google.l.d.b bVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 0) {
            bVar.i();
            return new ArrayList();
        }
        if (i3 != 2) {
            return null;
        }
        bVar.j();
        return new com.google.l.b.v();
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) throws IOException {
        int iR = bVar.r();
        Object objF = f(bVar, iR);
        if (objF == null) {
            return c(bVar, iR);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bVar.p()) {
                String strG = objF instanceof Map ? bVar.g() : null;
                int iR2 = bVar.r();
                Object objF2 = f(bVar, iR2);
                Object objC = objF2 == null ? c(bVar, iR2) : objF2;
                if (objF instanceof List) {
                    ((List) objF).add(objC);
                } else {
                    ((Map) objF).put(strG, objC);
                }
                if (objF2 != null) {
                    arrayDeque.addLast(objF);
                    objF = objC;
                }
            } else {
                if (objF instanceof List) {
                    bVar.k();
                } else {
                    bVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return objF;
                }
                objF = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.g();
            return;
        }
        com.google.l.u uVarB = this.f12310b.b(obj.getClass());
        if (!(uVarB instanceof t)) {
            uVarB.d(cVar, obj);
        } else {
            cVar.c();
            cVar.e();
        }
    }
}

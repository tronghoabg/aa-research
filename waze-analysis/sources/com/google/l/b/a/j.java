package com.google.l.b.a;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    public static final j f12288a = new j();

    public static final com.google.l.i c(com.google.l.d.b bVar) throws IOException {
        if (bVar instanceof l) {
            return ((l) bVar).d();
        }
        int iR = bVar.r();
        com.google.l.i iVarG = g(bVar, iR);
        if (iVarG == null) {
            return f(bVar, iR);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bVar.p()) {
                String strG = iVarG instanceof com.google.l.l ? bVar.g() : null;
                int iR2 = bVar.r();
                com.google.l.i iVarG2 = g(bVar, iR2);
                com.google.l.i iVarF = iVarG2 == null ? f(bVar, iR2) : iVarG2;
                if (iVarG instanceof com.google.l.g) {
                    ((com.google.l.g) iVarG).d(iVarF);
                } else {
                    ((com.google.l.l) iVarG).d(strG, iVarF);
                }
                if (iVarG2 != null) {
                    arrayDeque.addLast(iVarG);
                    iVarG = iVarF;
                }
            } else {
                if (iVarG instanceof com.google.l.g) {
                    bVar.k();
                } else {
                    bVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return iVarG;
                }
                iVarG = (com.google.l.i) arrayDeque.removeLast();
            }
        }
    }

    private static final com.google.l.i f(com.google.l.d.b bVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 5) {
            return new com.google.l.n(bVar.h());
        }
        if (i3 == 6) {
            return new com.google.l.n(new com.google.l.b.n(bVar.h()));
        }
        if (i3 == 7) {
            return new com.google.l.n(Boolean.valueOf(bVar.q()));
        }
        if (i3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(com.waze.c.c.e.c(i2)));
        }
        bVar.m();
        return com.google.l.k.f12459a;
    }

    private static final com.google.l.i g(com.google.l.d.b bVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 0) {
            bVar.i();
            return new com.google.l.g();
        }
        if (i3 != 2) {
            return null;
        }
        bVar.j();
        return new com.google.l.l();
    }

    @Override // com.google.l.u
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void d(com.google.l.d.c cVar, com.google.l.i iVar) {
        if (iVar == null || (iVar instanceof com.google.l.k)) {
            cVar.g();
            return;
        }
        if (iVar instanceof com.google.l.n) {
            com.google.l.n nVarF = iVar.f();
            if (nVarF.k()) {
                cVar.k(nVarF.d());
                return;
            } else if (nVarF.j()) {
                cVar.m(nVarF.i());
                return;
            } else {
                cVar.l(nVarF.c());
                return;
            }
        }
        if (iVar instanceof com.google.l.g) {
            cVar.b();
            Iterator<com.google.l.i> it = iVar.e().iterator();
            while (it.hasNext()) {
                d(cVar, it.next());
            }
            cVar.d();
            return;
        }
        boolean z = iVar instanceof com.google.l.l;
        if (!z) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(iVar.getClass()))));
        }
        cVar.c();
        if (!z) {
            throw new IllegalStateException("Not a JSON Object: ".concat(iVar.toString()));
        }
        for (Map.Entry entry : ((com.google.l.l) iVar).b()) {
            cVar.f((String) entry.getKey());
            d(cVar, (com.google.l.i) entry.getValue());
        }
        cVar.e();
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) {
        return c(bVar);
    }
}

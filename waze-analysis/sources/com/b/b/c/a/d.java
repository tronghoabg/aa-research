package com.b.b.c.a;

import android.support.v4.app.bd;
import com.b.b.d.i;
import com.b.b.d.v;
import com.b.b.d.w;
import com.google.l.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2626a;

    public d() {
        this.f2626a = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static d b() {
        e eVar = new e();
        eVar.d(i.class, new c(0));
        eVar.d(byte[].class, new c(1));
        return new d(eVar.a());
    }

    public final com.b.b.c.a a(String str) throws com.b.b.c.b {
        try {
            Object obj = this.f2626a;
            return new a((com.google.l.d) obj, (com.google.l.i) ((com.google.l.d) obj).f(str, com.google.l.i.class));
        } catch (RuntimeException e2) {
            throw new com.b.b.c.b(e2);
        }
    }

    public final String c(Object obj) {
        return ((com.google.l.d) this.f2626a).h(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void d(com.b.b.b bVar) {
        this.f2626a.add(bVar);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.Set] */
    public final void e(bd bdVar) {
        int iP = bdVar.p();
        if (iP == 2) {
            for (com.b.b.b bVar : this.f2626a) {
                bdVar.q(1);
                bVar.i(bdVar.r(2));
            }
            return;
        }
        if (iP == 3) {
            Iterator it = this.f2626a.iterator();
            while (it.hasNext()) {
                ((com.b.b.b) it.next()).a(bdVar.r(1), bdVar.s(2));
            }
            return;
        }
        if (iP == 6) {
            for (com.b.b.b bVar2 : this.f2626a) {
                bdVar.r(1);
                bVar2.f(bdVar.s(2));
            }
            return;
        }
        if (iP == 8) {
            for (com.b.b.b bVar3 : this.f2626a) {
                int iQ = bdVar.q(1);
                if (iQ == 32) {
                    bVar3.c(v.b(bdVar.q(2)), bdVar.r(3), bdVar.s(4));
                } else if (iQ == 34) {
                    bdVar.q(2);
                    bdVar.r(3);
                    bdVar.s(4);
                    bVar3.h();
                } else if (iQ == 48) {
                    bVar3.b(v.b(bdVar.q(2)), bdVar.r(3), bdVar.s(4));
                }
            }
            return;
        }
        if (iP == 33) {
            Iterator it2 = this.f2626a.iterator();
            while (it2.hasNext()) {
                ((com.b.b.b) it2.next()).d(v.b(bdVar.q(1)), w.a(bdVar.q(2)));
            }
            return;
        }
        if (iP == 36) {
            for (com.b.b.b bVar4 : this.f2626a) {
                w wVarA = w.a(bdVar.q(1));
                bdVar.q(2);
                bVar4.e(wVarA, bdVar.r(5));
            }
            return;
        }
        if (iP != 50) {
            return;
        }
        for (com.b.b.b bVar5 : this.f2626a) {
            v vVarB = v.b(bdVar.q(1));
            bdVar.r(2);
            com.b.b.c.c cVarR = bdVar.r(3);
            bdVar.r(4);
            bVar5.g(vVarB, cVarR);
        }
    }

    private d(com.google.l.d dVar) {
        this.f2626a = dVar;
    }
}

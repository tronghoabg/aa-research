package com.bumptech.glide.load.c.e;

import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.au;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.q;
import com.google.android.gms.f.x;
import com.google.android.gms.l.a.h;
import com.google.android.gms.l.o;
import com.google.android.gms.l.p;
import com.google.android.gms.l.v;
import com.google.android.gms.o.t;
import com.google.android.gms.o.w;
import com.google.android.libraries.e.b.j;
import com.google.d.b.an;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3451a;

    public e() {
        this.f3451a = new ArrayList();
    }

    private static bm i(t tVar) {
        return bd.e(com.google.android.libraries.b.c.a(tVar), i.class, new j(1), cf.y());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized c a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return f.b();
        }
        for (d dVar : this.f3451a) {
            if (dVar.a(cls, cls2)) {
                return dVar.f3450c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + String.valueOf(cls) + " to " + String.valueOf(cls2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (d dVar : this.f3451a) {
            if (dVar.a(cls, cls2)) {
                Class cls3 = dVar.f3449b;
                if (!arrayList.contains(cls3)) {
                    arrayList.add(cls3);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(Class cls, Class cls2, c cVar) {
        this.f3451a.add(new d(cls, cls2, cVar));
    }

    public final bm d(String str) {
        an.B(str);
        return i(((v) this.f3451a).a(str));
    }

    public final bm e(com.google.android.libraries.phenotype.client.a.f fVar) {
        an.B(fVar);
        com.google.android.gms.common.api.internal.bm bmVarB = bn.b();
        bmVarB.c(new p(fVar, 2));
        bmVarB.e(com.google.android.gms.l.e.f5602a);
        bmVarB.d();
        bn bnVarB = bmVarB.b();
        Object obj = this.f3451a;
        return i(((q) obj).o(bnVarB).c(cf.y(), new com.google.android.gms.l.q(obj, fVar, 0)));
    }

    public final bm f(final String str, final String str2) {
        an.B(str);
        an.B(str2);
        com.google.android.gms.common.api.internal.bm bmVarB = bn.b();
        bmVarB.c(new bf() { // from class: com.google.android.gms.l.m
            @Override // com.google.android.gms.common.api.internal.bf
            public final void a(Object obj, Object obj2) {
                int i2 = v.f5645a;
                ((com.google.android.gms.l.a.g) ((com.google.android.gms.l.a.h) obj).y()).e(new u((w) obj2), str, str2);
            }
        });
        return i(((q) this.f3451a).o(bmVarB.b()).b(cf.y(), new x(2)));
    }

    public final bm g() {
        com.google.android.gms.common.api.internal.bm bmVarB = bn.b();
        Object obj = this.f3451a;
        bmVarB.c(new p(obj, 1));
        bmVarB.e(com.google.android.gms.l.e.f5610i);
        bmVarB.d();
        return i(((q) obj).o(bmVarB.b()));
    }

    public final bm h(com.google.android.libraries.phenotype.client.stable.w wVar) {
        final String str;
        String simpleName = h.class.getSimpleName();
        Object obj = this.f3451a;
        q qVar = (q) obj;
        final au auVarK = qVar.k(wVar, simpleName);
        String strA = com.google.android.gms.common.util.e.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(h.class);
        }
        final v vVar = (v) obj;
        bf bfVar = new bf() { // from class: com.google.android.gms.l.n
            @Override // com.google.android.gms.common.api.internal.bf
            public final void a(Object obj2, Object obj3) {
                ((com.google.android.gms.l.a.g) ((com.google.android.gms.l.a.h) obj2).y()).d(str, new t(vVar, auVarK));
            }
        };
        o oVar = new o();
        com.google.android.gms.common.api.internal.bd bdVarA = be.a();
        bdVarA.h(auVarK);
        bdVarA.d(bfVar);
        bdVarA.g(oVar);
        bdVarA.f(com.google.android.gms.l.e.f5605d);
        bdVarA.e();
        return i(qVar.p(bdVarA.a()));
    }

    public e(v vVar) {
        this.f3451a = vVar;
    }
}

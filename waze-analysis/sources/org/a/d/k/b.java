package org.a.d.k;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.places.o;
import e.a.dw;
import h.a.i;
import h.ab;
import h.g.b.x;
import h.l.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.a.d.d.f;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.i.a f56417a;

    /* renamed from: b, reason: collision with root package name */
    private final String f56418b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56419c;

    /* renamed from: d, reason: collision with root package name */
    private final org.a.d.a f56420d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f56421e;

    /* renamed from: f, reason: collision with root package name */
    private Object f56422f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f56423g;

    /* renamed from: h, reason: collision with root package name */
    private final ThreadLocal f56424h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f56425i;

    public b(org.a.d.i.a aVar, String str, boolean z, org.a.d.a aVar2) {
        x.f(aVar, "scopeQualifier");
        x.f(str, TtmlNode.ATTR_ID);
        x.f(aVar2, "_koin");
        this.f56417a = aVar;
        this.f56418b = str;
        this.f56419c = z;
        this.f56420d = aVar2;
        this.f56421e = new ArrayList();
        this.f56423g = new ArrayList();
        this.f56424h = new ThreadLocal();
    }

    static final ab d(b bVar) {
        org.a.d.a aVar = bVar.f56420d;
        aVar.n().c("|- (-) Scope - id:'" + bVar.f56418b + "'");
        ArrayList arrayList = bVar.f56423g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.a.b.b.b) it.next()).a(bVar);
        }
        arrayList.clear();
        bVar.f56422f = null;
        bVar.f56425i = true;
        aVar.a().e(bVar);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193 A[PHI: r4
  0x0193: PHI (r4v7 java.lang.Object) = (r4v6 java.lang.Object), (r4v10 java.lang.Object) binds: [B:30:0x00c4, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(org.a.d.i.a r10, h.l.c r11, h.g.a.a r12) throws org.a.d.d.f, org.a.d.d.a {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.d.k.b.o(org.a.d.i.a, h.l.c, h.g.a.a):java.lang.Object");
    }

    public final Object a(c cVar, org.a.d.i.a aVar, h.g.a.a aVar2) {
        String str;
        x.f(cVar, "clazz");
        o oVarN = this.f56420d.n();
        org.a.d.f.a aVar3 = org.a.d.f.a.f56394a;
        if (!oVarN.g(aVar3)) {
            return o(aVar, cVar, aVar2);
        }
        if (aVar != null) {
            str = " with qualifier '" + aVar + "'";
        } else {
            str = "";
        }
        o.h(aVar3, "|- '" + org.a.e.a.a(cVar) + "'" + str + " ...");
        long jNanoTime = System.nanoTime();
        Object objO = o(aVar, cVar, aVar2);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        o.h(aVar3, "|- '" + org.a.e.a.a(cVar) + "' in " + (jNanoTime2 / 1000000.0d) + " ms");
        return objO;
    }

    public final Object b(c cVar, org.a.d.i.a aVar, h.g.a.a aVar2) {
        x.f(cVar, "clazz");
        try {
            return a(cVar, aVar, aVar2);
        } catch (org.a.d.d.a unused) {
            this.f56420d.n().c("* Scope closed - no instance found for " + org.a.e.a.a(cVar) + " on scope " + this);
            return null;
        } catch (f unused2) {
            this.f56420d.n().c("* No instance found for type '" + org.a.e.a.a(cVar) + "' on scope '" + this + "'");
            return null;
        }
    }

    public final String c() {
        return this.f56418b;
    }

    public final org.a.d.a e() {
        return this.f56420d;
    }

    public final org.a.d.a f() {
        return this.f56420d;
    }

    public final org.a.d.i.a g() {
        return this.f56417a;
    }

    public final void h() {
        dw.g(this, new h.g.a.a() { // from class: org.a.d.k.a
            @Override // h.g.a.a
            public final Object invoke() {
                return b.d(this.f56416a);
            }
        });
    }

    public final void i(b... bVarArr) {
        x.f(bVarArr, "scopes");
        if (this.f56419c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        i.aF(this.f56421e, bVarArr);
    }

    public final void j(Object obj) {
        this.f56422f = obj;
    }

    public final boolean k() {
        return !this.f56425i;
    }

    public final void l(org.a.b.b.b bVar) {
        x.f(bVar, "callback");
        this.f56423g.add(bVar);
    }

    public final o n() {
        return this.f56420d.n();
    }

    public final String toString() {
        return "['" + this.f56418b + "']";
    }
}

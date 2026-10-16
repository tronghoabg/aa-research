package com.airbnb.lottie.a.a;

import android.graphics.Path;
import com.airbnb.lottie.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class s implements n, com.airbnb.lottie.a.b.a, l {

    /* renamed from: b, reason: collision with root package name */
    private final String f1852b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1853c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s f1854d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.s f1855e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1856f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1851a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final c f1857g = new c();

    public s(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.p pVar) {
        this.f1852b = pVar.c();
        this.f1853c = pVar.d();
        this.f1854d = sVar;
        com.airbnb.lottie.a.b.s sVarA = pVar.b().a();
        this.f1855e = sVarA;
        bVar.l(sVarA);
        sVarA.i(this);
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        if (obj == x.P) {
            this.f1855e.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1856f = false;
        this.f1854d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.airbnb.lottie.a.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r7 >= r1) goto L38
            java.lang.Object r1 = r6.get(r7)
            com.airbnb.lottie.a.a.d r1 = (com.airbnb.lottie.a.a.d) r1
            boolean r2 = r1 instanceof com.airbnb.lottie.a.a.u
            if (r2 == 0) goto L25
            r2 = r1
            com.airbnb.lottie.a.a.u r2 = (com.airbnb.lottie.a.a.u) r2
            int r3 = r2.i()
            r4 = 1
            if (r3 != r4) goto L25
            com.airbnb.lottie.a.a.c r1 = r5.f1857g
            r1.a(r2)
            r2.e(r5)
            goto L35
        L25:
            boolean r2 = r1 instanceof com.airbnb.lottie.a.a.r
            if (r2 == 0) goto L35
            if (r0 != 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L30:
            com.airbnb.lottie.a.a.r r1 = (com.airbnb.lottie.a.a.r) r1
            r0.add(r1)
        L35:
            int r7 = r7 + 1
            goto L2
        L38:
            com.airbnb.lottie.a.b.s r5 = r5.f1855e
            r5.o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.s.f(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1852b;
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        if (this.f1856f && !this.f1855e.n()) {
            return this.f1851a;
        }
        Path path = this.f1851a;
        path.reset();
        if (this.f1853c) {
            this.f1856f = true;
            return path;
        }
        Path path2 = (Path) this.f1855e.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f1857g.b(path);
        this.f1856f = true;
        return path;
    }
}

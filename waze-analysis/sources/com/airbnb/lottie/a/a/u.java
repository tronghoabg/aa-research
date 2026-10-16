package com.airbnb.lottie.a.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class u implements d, com.airbnb.lottie.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1863a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1864b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1865c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1866d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1867e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1868f;

    public u(com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.r rVar) {
        this.f1863a = rVar.e();
        this.f1868f = rVar.f();
        com.airbnb.lottie.a.b.f fVarA = rVar.d().a();
        this.f1865c = fVarA;
        com.airbnb.lottie.a.b.f fVarA2 = rVar.b().a();
        this.f1866d = fVarA2;
        com.airbnb.lottie.a.b.f fVarA3 = rVar.c().a();
        this.f1867e = fVarA3;
        bVar.l(fVarA);
        bVar.l(fVarA2);
        bVar.l(fVarA3);
        fVarA.i(this);
        fVarA2.i(this);
        fVarA3.i(this);
    }

    public final com.airbnb.lottie.a.b.f a() {
        return this.f1866d;
    }

    public final com.airbnb.lottie.a.b.f b() {
        return this.f1867e;
    }

    public final com.airbnb.lottie.a.b.f c() {
        return this.f1865c;
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        int i2 = 0;
        while (true) {
            List list = this.f1864b;
            if (i2 >= list.size()) {
                return;
            }
            ((com.airbnb.lottie.a.b.a) list.get(i2)).d();
            i2++;
        }
    }

    final void e(com.airbnb.lottie.a.b.a aVar) {
        this.f1864b.add(aVar);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        throw null;
    }

    public final boolean h() {
        return this.f1863a;
    }

    final int i() {
        return this.f1868f;
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
    }
}

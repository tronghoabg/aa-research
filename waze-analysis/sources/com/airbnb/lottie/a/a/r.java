package com.airbnb.lottie.a.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class r implements com.airbnb.lottie.a.b.a, d {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.s f1848a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1849b;

    /* renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.d.b.m f1850c;

    public r(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.l lVar) {
        this.f1848a = sVar;
        com.airbnb.lottie.a.b.f fVarA = lVar.b().a();
        this.f1849b = fVarA;
        bVar.l(fVarA);
        fVarA.i(this);
    }

    private static int c(int i2, int i3) {
        int i4 = i2 / i3;
        if ((i2 ^ i3) < 0 && i4 * i3 != i2) {
            i4--;
        }
        return i2 - (i4 * i3);
    }

    public final com.airbnb.lottie.a.b.f a() {
        return this.f1849b;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.airbnb.lottie.d.b.m b(com.airbnb.lottie.d.b.m r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.r.b(com.airbnb.lottie.d.b.m):com.airbnb.lottie.d.b.m");
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1848a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        throw null;
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
    }
}

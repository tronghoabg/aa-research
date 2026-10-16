package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1261t extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1261t f15636c = new C1261t(C1262u.f15638a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC3340k.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        C1260s builder = (C1260s) obj;
        AbstractC3340k.e(builder, "builder");
        double dC = aVar.C(this.f15601b, i5);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f15632a;
        int i10 = builder.f15633b;
        builder.f15633b = i10 + 1;
        dArr[i10] = dC;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC3340k.e(dArr, "<this>");
        C1260s c1260s = new C1260s();
        c1260s.f15632a = dArr;
        c1260s.f15633b = dArr.length;
        c1260s.b(10);
        return c1260s;
    }

    @Override // Wf.g0
    public final Object j() {
        return new double[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        double[] content = (double[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.D(this.f15601b, i10, content[i10]);
        }
    }
}

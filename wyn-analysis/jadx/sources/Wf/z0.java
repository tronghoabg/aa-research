package Wf;

import ef.C2540x;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class z0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f15663c = new z0(A0.f15524a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        long[] collectionSize = ((C2540x) obj).f34689a;
        AbstractC3340k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        y0 builder = (y0) obj;
        AbstractC3340k.e(builder, "builder");
        long jK = aVar.v(this.f15601b, i5).k();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f15659a;
        int i10 = builder.f15660b;
        builder.f15660b = i10 + 1;
        jArr[i10] = jK;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        long[] toBuilder = ((C2540x) obj).f34689a;
        AbstractC3340k.e(toBuilder, "$this$toBuilder");
        y0 y0Var = new y0();
        y0Var.f15659a = toBuilder;
        y0Var.f15660b = toBuilder.length;
        y0Var.b(10);
        return y0Var;
    }

    @Override // Wf.g0
    public final Object j() {
        return new C2540x(new long[0]);
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        long[] jArr = ((C2540x) obj).f34689a;
        AbstractC3340k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.v(this.f15601b, i10).o(jArr[i10]);
        }
    }
}

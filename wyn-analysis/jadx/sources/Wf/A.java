package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class A extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final A f15523c = new A(B.f15526a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC3340k.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        C1267z builder = (C1267z) obj;
        AbstractC3340k.e(builder, "builder");
        float fR = aVar.r(this.f15601b, i5);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f15661a;
        int i10 = builder.f15662b;
        builder.f15662b = i10 + 1;
        fArr[i10] = fR;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC3340k.e(fArr, "<this>");
        C1267z c1267z = new C1267z();
        c1267z.f15661a = fArr;
        c1267z.f15662b = fArr.length;
        c1267z.b(10);
        return c1267z;
    }

    @Override // Wf.g0
    public final Object j() {
        return new float[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        float[] content = (float[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.s(this.f15601b, i10, content[i10]);
        }
    }
}

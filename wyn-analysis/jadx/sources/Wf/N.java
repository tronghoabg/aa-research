package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class N extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final N f15555c = new N(O.f15556a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC3340k.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        M builder = (M) obj;
        AbstractC3340k.e(builder, "builder");
        long jF = aVar.f(this.f15601b, i5);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f15553a;
        int i10 = builder.f15554b;
        builder.f15554b = i10 + 1;
        jArr[i10] = jF;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC3340k.e(jArr, "<this>");
        M m10 = new M();
        m10.f15553a = jArr;
        m10.f15554b = jArr.length;
        m10.b(10);
        return m10;
    }

    @Override // Wf.g0
    public final Object j() {
        return new long[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        long[] content = (long[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.E(this.f15601b, i10, content[i10]);
        }
    }
}

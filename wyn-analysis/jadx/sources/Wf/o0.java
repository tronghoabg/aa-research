package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class o0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f15622c = new o0(p0.f15623a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC3340k.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        n0 builder = (n0) obj;
        AbstractC3340k.e(builder, "builder");
        short sJ = aVar.j(this.f15601b, i5);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f15618a;
        int i10 = builder.f15619b;
        builder.f15619b = i10 + 1;
        sArr[i10] = sJ;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC3340k.e(sArr, "<this>");
        n0 n0Var = new n0();
        n0Var.f15618a = sArr;
        n0Var.f15619b = sArr.length;
        n0Var.b(10);
        return n0Var;
    }

    @Override // Wf.g0
    public final Object j() {
        return new short[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        short[] content = (short[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.h(this.f15601b, i10, content[i10]);
        }
    }
}

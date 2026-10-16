package Wf;

import ef.C2513A;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class C0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f15530c = new C0(D0.f15534a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        short[] collectionSize = ((C2513A) obj).f34652a;
        AbstractC3340k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        B0 builder = (B0) obj;
        AbstractC3340k.e(builder, "builder");
        short sP = aVar.v(this.f15601b, i5).p();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f15528a;
        int i10 = builder.f15529b;
        builder.f15529b = i10 + 1;
        sArr[i10] = sP;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        short[] toBuilder = ((C2513A) obj).f34652a;
        AbstractC3340k.e(toBuilder, "$this$toBuilder");
        B0 b02 = new B0();
        b02.f15528a = toBuilder;
        b02.f15529b = toBuilder.length;
        b02.b(10);
        return b02;
    }

    @Override // Wf.g0
    public final Object j() {
        return new C2513A(new short[0]);
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        short[] sArr = ((C2513A) obj).f34652a;
        AbstractC3340k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.v(this.f15601b, i10).q(sArr[i10]);
        }
    }
}

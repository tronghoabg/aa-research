package Wf;

import ef.C2538v;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class w0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f15651c = new w0(x0.f15655a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        int[] collectionSize = ((C2538v) obj).f34687a;
        AbstractC3340k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        v0 builder = (v0) obj;
        AbstractC3340k.e(builder, "builder");
        int iH = aVar.v(this.f15601b, i5).h();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f15644a;
        int i10 = builder.f15645b;
        builder.f15645b = i10 + 1;
        iArr[i10] = iH;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        int[] toBuilder = ((C2538v) obj).f34687a;
        AbstractC3340k.e(toBuilder, "$this$toBuilder");
        v0 v0Var = new v0();
        v0Var.f15644a = toBuilder;
        v0Var.f15645b = toBuilder.length;
        v0Var.b(10);
        return v0Var;
    }

    @Override // Wf.g0
    public final Object j() {
        return new C2538v(new int[0]);
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        int[] iArr = ((C2538v) obj).f34687a;
        AbstractC3340k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.v(this.f15601b, i10).C(iArr[i10]);
        }
    }
}

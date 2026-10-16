package Wf;

import ef.C2536t;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class t0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f15637c = new t0(u0.f15640a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        byte[] collectionSize = ((C2536t) obj).f34685a;
        AbstractC3340k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        s0 builder = (s0) obj;
        AbstractC3340k.e(builder, "builder");
        byte bE = aVar.v(this.f15601b, i5).E();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f15634a;
        int i10 = builder.f15635b;
        builder.f15635b = i10 + 1;
        bArr[i10] = bE;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        byte[] toBuilder = ((C2536t) obj).f34685a;
        AbstractC3340k.e(toBuilder, "$this$toBuilder");
        s0 s0Var = new s0();
        s0Var.f15634a = toBuilder;
        s0Var.f15635b = toBuilder.length;
        s0Var.b(10);
        return s0Var;
    }

    @Override // Wf.g0
    public final Object j() {
        return new C2536t(new byte[0]);
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        byte[] bArr = ((C2536t) obj).f34685a;
        AbstractC3340k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.v(this.f15601b, i10).g(bArr[i10]);
        }
    }
}

package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class I extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final I f15548c = new I(J.f15549a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC3340k.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        H builder = (H) obj;
        AbstractC3340k.e(builder, "builder");
        int i10 = aVar.i(this.f15601b, i5);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f15546a;
        int i11 = builder.f15547b;
        builder.f15547b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC3340k.e(iArr, "<this>");
        H h10 = new H();
        h10.f15546a = iArr;
        h10.f15547b = iArr.length;
        h10.b(10);
        return h10;
    }

    @Override // Wf.g0
    public final Object j() {
        return new int[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        int[] content = (int[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.t(i10, content[i10], this.f15601b);
        }
    }
}

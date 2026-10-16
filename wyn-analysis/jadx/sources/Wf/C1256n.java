package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1256n extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1256n f15617c = new C1256n(C1257o.f15620a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC3340k.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        C1255m builder = (C1255m) obj;
        AbstractC3340k.e(builder, "builder");
        char cX = aVar.x(this.f15601b, i5);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f15615a;
        int i10 = builder.f15616b;
        builder.f15616b = i10 + 1;
        cArr[i10] = cX;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC3340k.e(cArr, "<this>");
        C1255m c1255m = new C1255m();
        c1255m.f15615a = cArr;
        c1255m.f15616b = cArr.length;
        c1255m.b(10);
        return c1255m;
    }

    @Override // Wf.g0
    public final Object j() {
        return new char[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        char[] content = (char[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.z(this.f15601b, i10, content[i10]);
        }
    }
}

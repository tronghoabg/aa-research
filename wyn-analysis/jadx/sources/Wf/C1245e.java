package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1245e extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1245e f15595c = new C1245e(C1247f.f15596a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC3340k.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        C1243d builder = (C1243d) obj;
        AbstractC3340k.e(builder, "builder");
        boolean zY = aVar.y(this.f15601b, i5);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f15583a;
        int i10 = builder.f15584b;
        builder.f15584b = i10 + 1;
        zArr[i10] = zY;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC3340k.e(zArr, "<this>");
        C1243d c1243d = new C1243d();
        c1243d.f15583a = zArr;
        c1243d.f15584b = zArr.length;
        c1243d.b(10);
        return c1243d;
    }

    @Override // Wf.g0
    public final Object j() {
        return new boolean[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        boolean[] content = (boolean[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.x(this.f15601b, i10, content[i10]);
        }
    }
}

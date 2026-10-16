package Wf;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1250h extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1250h f15602c = new C1250h(C1251i.f15605a);

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC3340k.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // Wf.r, Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        C1249g builder = (C1249g) obj;
        AbstractC3340k.e(builder, "builder");
        byte bN = aVar.n(this.f15601b, i5);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f15599a;
        int i10 = builder.f15600b;
        builder.f15600b = i10 + 1;
        bArr[i10] = bN;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC3340k.e(bArr, "<this>");
        C1249g c1249g = new C1249g();
        c1249g.f15599a = bArr;
        c1249g.f15600b = bArr.length;
        c1249g.b(10);
        return c1249g;
    }

    @Override // Wf.g0
    public final Object j() {
        return new byte[0];
    }

    @Override // Wf.g0
    public final void k(Vf.b encoder, Object obj, int i5) {
        byte[] content = (byte[]) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(content, "content");
        for (int i10 = 0; i10 < i5; i10++) {
            encoder.j(this.f15601b, i10, content[i10]);
        }
    }
}

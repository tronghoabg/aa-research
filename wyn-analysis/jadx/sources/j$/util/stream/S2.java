package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class S2 extends G2 {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f38088d;

    /* renamed from: e, reason: collision with root package name */
    private int f38089e;

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38088d = new Object[(int) j8];
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        int i5 = 0;
        Arrays.sort(this.f38088d, 0, this.f38089e, this.f37994b);
        long j8 = this.f38089e;
        InterfaceC3011r2 interfaceC3011r2 = this.f38260a;
        interfaceC3011r2.l(j8);
        if (!this.f37995c) {
            while (i5 < this.f38089e) {
                interfaceC3011r2.accept((InterfaceC3011r2) this.f38088d[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f38089e && !interfaceC3011r2.n()) {
                interfaceC3011r2.accept((InterfaceC3011r2) this.f38088d[i5]);
                i5++;
            }
        }
        interfaceC3011r2.k();
        this.f38088d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f38088d;
        int i5 = this.f38089e;
        this.f38089e = i5 + 1;
        objArr[i5] = obj;
    }
}

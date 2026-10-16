package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private double[] f38060c;

    /* renamed from: d, reason: collision with root package name */
    private int f38061d;

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38060c = new double[(int) j8];
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        int i5 = 0;
        Arrays.sort(this.f38060c, 0, this.f38061d);
        long j8 = this.f38061d;
        InterfaceC3011r2 interfaceC3011r2 = this.f38245a;
        interfaceC3011r2.l(j8);
        if (!this.f37973b) {
            while (i5 < this.f38061d) {
                interfaceC3011r2.accept(this.f38060c[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f38061d && !interfaceC3011r2.n()) {
                interfaceC3011r2.accept(this.f38060c[i5]);
                i5++;
            }
        }
        interfaceC3011r2.k();
        this.f38060c = null;
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        double[] dArr = this.f38060c;
        int i5 = this.f38061d;
        this.f38061d = i5 + 1;
        dArr[i5] = d3;
    }
}

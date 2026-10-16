package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class H2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private V2 f38001c;

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        V2 v2;
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j8 <= 0) {
            v2 = new V2();
        } else {
            v2 = new V2((int) j8);
        }
        this.f38001c = v2;
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        double[] dArr = (double[]) this.f38001c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC3011r2 interfaceC3011r2 = this.f38245a;
        interfaceC3011r2.l(length);
        int i5 = 0;
        if (!this.f37973b) {
            int length2 = dArr.length;
            while (i5 < length2) {
                interfaceC3011r2.accept(dArr[i5]);
                i5++;
            }
        } else {
            int length3 = dArr.length;
            while (i5 < length3) {
                double d3 = dArr[i5];
                if (interfaceC3011r2.n()) {
                    break;
                }
                interfaceC3011r2.accept(d3);
                i5++;
            }
        }
        interfaceC3011r2.k();
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        this.f38001c.accept(d3);
    }
}

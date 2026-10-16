package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class I2 extends E2 {

    /* renamed from: c, reason: collision with root package name */
    private X2 f38008c;

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        X2 x22;
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j8 <= 0) {
            x22 = new X2();
        } else {
            x22 = new X2((int) j8);
        }
        this.f38008c = x22;
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        int[] iArr = (int[]) this.f38008c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC3011r2 interfaceC3011r2 = this.f38253a;
        interfaceC3011r2.l(length);
        int i5 = 0;
        if (!this.f37978b) {
            int length2 = iArr.length;
            while (i5 < length2) {
                interfaceC3011r2.accept(iArr[i5]);
                i5++;
            }
        } else {
            int length3 = iArr.length;
            while (i5 < length3) {
                int i10 = iArr[i5];
                if (interfaceC3011r2.n()) {
                    break;
                }
                interfaceC3011r2.accept(i10);
                i5++;
            }
        }
        interfaceC3011r2.k();
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        this.f38008c.accept(i5);
    }
}

package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class J2 extends F2 {

    /* renamed from: c, reason: collision with root package name */
    private Z2 f38020c;

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        Z2 z2;
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j8 <= 0) {
            z2 = new Z2();
        } else {
            z2 = new Z2((int) j8);
        }
        this.f38020c = z2;
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        long[] jArr = (long[]) this.f38020c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC3011r2 interfaceC3011r2 = this.f38258a;
        interfaceC3011r2.l(length);
        int i5 = 0;
        if (!this.f37988b) {
            int length2 = jArr.length;
            while (i5 < length2) {
                interfaceC3011r2.accept(jArr[i5]);
                i5++;
            }
        } else {
            int length3 = jArr.length;
            while (i5 < length3) {
                long j8 = jArr[i5];
                if (interfaceC3011r2.n()) {
                    break;
                }
                interfaceC3011r2.accept(j8);
                i5++;
            }
        }
        interfaceC3011r2.k();
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f38020c.accept(j8);
    }
}

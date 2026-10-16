package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class R2 extends F2 {

    /* renamed from: c, reason: collision with root package name */
    private long[] f38075c;

    /* renamed from: d, reason: collision with root package name */
    private int f38076d;

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38075c = new long[(int) j8];
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        int i5 = 0;
        Arrays.sort(this.f38075c, 0, this.f38076d);
        long j8 = this.f38076d;
        InterfaceC3011r2 interfaceC3011r2 = this.f38258a;
        interfaceC3011r2.l(j8);
        if (!this.f37988b) {
            while (i5 < this.f38076d) {
                interfaceC3011r2.accept(this.f38075c[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f38076d && !interfaceC3011r2.n()) {
                interfaceC3011r2.accept(this.f38075c[i5]);
                i5++;
            }
        }
        interfaceC3011r2.k();
        this.f38075c = null;
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long[] jArr = this.f38075c;
        int i5 = this.f38076d;
        this.f38076d = i5 + 1;
        jArr[i5] = j8;
    }
}

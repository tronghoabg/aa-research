package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: c, reason: collision with root package name */
    private int[] f38066c;

    /* renamed from: d, reason: collision with root package name */
    private int f38067d;

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38066c = new int[(int) j8];
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void k() {
        int i5 = 0;
        Arrays.sort(this.f38066c, 0, this.f38067d);
        long j8 = this.f38067d;
        InterfaceC3011r2 interfaceC3011r2 = this.f38253a;
        interfaceC3011r2.l(j8);
        if (!this.f37978b) {
            while (i5 < this.f38067d) {
                interfaceC3011r2.accept(this.f38066c[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f38067d && !interfaceC3011r2.n()) {
                interfaceC3011r2.accept(this.f38066c[i5]);
                i5++;
            }
        }
        interfaceC3011r2.k();
        this.f38066c = null;
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        int[] iArr = this.f38066c;
        int i10 = this.f38067d;
        this.f38067d = i10 + 1;
        iArr[i10] = i5;
    }
}

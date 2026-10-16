package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class i3 extends f3 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        z2 z2Var = (z2) this.a;
        z2Var.p(this.e);
        if (this.c) {
            while (i < this.e && !z2Var.s()) {
                z2Var.accept((z2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                z2Var.accept((z2) this.d[i]);
                i++;
            }
        }
        z2Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            j$.time.g.a("Stream size exceeds max array size");
        }
    }
}

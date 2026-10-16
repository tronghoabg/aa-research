package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r6 extends f6 {

    /* renamed from: c, reason: collision with root package name */
    public double[] f50597c;

    /* renamed from: d, reason: collision with root package name */
    public int f50598d;

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        double[] dArr = this.f50597c;
        int i2 = this.f50598d;
        this.f50598d = i2 + 1;
        dArr[i2] = d2;
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void end() {
        int i2 = 0;
        Arrays.sort(this.f50597c, 0, this.f50598d);
        long j2 = this.f50598d;
        t5 t5Var = this.f50521a;
        t5Var.l(j2);
        if (this.f50402b) {
            while (i2 < this.f50598d && !t5Var.o()) {
                t5Var.accept(this.f50597c[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f50598d) {
                t5Var.accept(this.f50597c[i2]);
                i2++;
            }
        }
        t5Var.end();
        this.f50597c = null;
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50597c = new double[(int) j2];
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

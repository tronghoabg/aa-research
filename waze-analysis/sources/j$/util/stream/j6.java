package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j6 extends f6 {

    /* renamed from: c, reason: collision with root package name */
    public x6 f50470c;

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50470c.accept(d2);
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void end() {
        double[] dArr = (double[]) this.f50470c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        t5 t5Var = this.f50521a;
        t5Var.l(length);
        int i2 = 0;
        if (this.f50402b) {
            int length2 = dArr.length;
            while (i2 < length2) {
                double d2 = dArr[i2];
                if (t5Var.o()) {
                    break;
                }
                t5Var.accept(d2);
                i2++;
            }
        } else {
            int length3 = dArr.length;
            while (i2 < length3) {
                t5Var.accept(dArr[i2]);
                i2++;
            }
        }
        t5Var.end();
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50470c = j2 > 0 ? new x6((int) j2) : new x6();
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

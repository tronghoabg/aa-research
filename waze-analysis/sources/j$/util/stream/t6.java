package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class t6 extends h6 {

    /* renamed from: c, reason: collision with root package name */
    public long[] f50619c;

    /* renamed from: d, reason: collision with root package name */
    public int f50620d;

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        long[] jArr = this.f50619c;
        int i2 = this.f50620d;
        this.f50620d = i2 + 1;
        jArr[i2] = j2;
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void end() {
        int i2 = 0;
        Arrays.sort(this.f50619c, 0, this.f50620d);
        long j2 = this.f50620d;
        t5 t5Var = this.f50558a;
        t5Var.l(j2);
        if (this.f50434b) {
            while (i2 < this.f50620d && !t5Var.o()) {
                t5Var.accept(this.f50619c[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f50620d) {
                t5Var.accept(this.f50619c[i2]);
                i2++;
            }
        }
        t5Var.end();
        this.f50619c = null;
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50619c = new long[(int) j2];
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

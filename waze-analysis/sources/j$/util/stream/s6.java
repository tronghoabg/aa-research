package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s6 extends g6 {

    /* renamed from: c, reason: collision with root package name */
    public int[] f50608c;

    /* renamed from: d, reason: collision with root package name */
    public int f50609d;

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        int[] iArr = this.f50608c;
        int i3 = this.f50609d;
        this.f50609d = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void end() {
        int i2 = 0;
        Arrays.sort(this.f50608c, 0, this.f50609d);
        long j2 = this.f50609d;
        t5 t5Var = this.f50539a;
        t5Var.l(j2);
        if (this.f50417b) {
            while (i2 < this.f50609d && !t5Var.o()) {
                t5Var.accept(this.f50608c[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f50609d) {
                t5Var.accept(this.f50608c[i2]);
                i2++;
            }
        }
        t5Var.end();
        this.f50608c = null;
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50608c = new int[(int) j2];
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

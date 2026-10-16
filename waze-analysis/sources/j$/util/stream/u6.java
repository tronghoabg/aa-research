package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u6 extends i6 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f50637d;

    /* renamed from: e, reason: collision with root package name */
    public int f50638e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f50637d;
        int i2 = this.f50638e;
        this.f50638e = i2 + 1;
        objArr[i2] = obj;
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void end() {
        int i2 = 0;
        Arrays.sort(this.f50637d, 0, this.f50638e, this.f50453b);
        long j2 = this.f50638e;
        t5 t5Var = this.f50576a;
        t5Var.l(j2);
        if (this.f50454c) {
            while (i2 < this.f50638e && !t5Var.o()) {
                t5Var.accept((t5) this.f50637d[i2]);
                i2++;
            }
        } else {
            while (i2 < this.f50638e) {
                t5Var.accept((t5) this.f50637d[i2]);
                i2++;
            }
        }
        t5Var.end();
        this.f50637d = null;
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50637d = new Object[(int) j2];
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class l6 extends h6 {

    /* renamed from: c, reason: collision with root package name */
    public b7 f50496c;

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        this.f50496c.accept(j2);
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void end() {
        long[] jArr = (long[]) this.f50496c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        t5 t5Var = this.f50558a;
        t5Var.l(length);
        int i2 = 0;
        if (this.f50434b) {
            int length2 = jArr.length;
            while (i2 < length2) {
                long j2 = jArr[i2];
                if (t5Var.o()) {
                    break;
                }
                t5Var.accept(j2);
                i2++;
            }
        } else {
            int length3 = jArr.length;
            while (i2 < length3) {
                t5Var.accept(jArr[i2]);
                i2++;
            }
        }
        t5Var.end();
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50496c = j2 > 0 ? new b7((int) j2) : new b7();
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

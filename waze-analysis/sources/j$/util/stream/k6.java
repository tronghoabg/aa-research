package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k6 extends g6 {

    /* renamed from: c, reason: collision with root package name */
    public z6 f50489c;

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        this.f50489c.accept(i2);
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void end() {
        int[] iArr = (int[]) this.f50489c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        t5 t5Var = this.f50539a;
        t5Var.l(length);
        int i2 = 0;
        if (this.f50417b) {
            int length2 = iArr.length;
            while (i2 < length2) {
                int i3 = iArr[i2];
                if (t5Var.o()) {
                    break;
                }
                t5Var.accept(i3);
                i2++;
            }
        } else {
            int length3 = iArr.length;
            while (i2 < length3) {
                t5Var.accept(iArr[i2]);
                i2++;
            }
        }
        t5Var.end();
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50489c = j2 > 0 ? new z6((int) j2) : new z6();
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}

package e.a.f.a.a;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    e[] f47506a = new e[8];

    /* renamed from: b, reason: collision with root package name */
    int f47507b;

    /* renamed from: c, reason: collision with root package name */
    private final k.h f47508c;

    /* renamed from: d, reason: collision with root package name */
    private int f47509d;

    /* renamed from: e, reason: collision with root package name */
    private int f47510e;

    g(k.h hVar) {
        this.f47509d = r0.length - 1;
        this.f47508c = hVar;
    }

    private final void d(e eVar) {
        int i2;
        int i3 = eVar.f47497h;
        if (i3 > 4096) {
            Arrays.fill(this.f47506a, (Object) null);
            this.f47509d = this.f47506a.length - 1;
            this.f47507b = 0;
            this.f47510e = 0;
            return;
        }
        int i4 = (this.f47510e + i3) - 4096;
        if (i4 > 0) {
            int length = this.f47506a.length - 1;
            int i5 = 0;
            while (true) {
                i2 = this.f47509d;
                if (length < i2 || i4 <= 0) {
                    break;
                }
                int i6 = this.f47506a[length].f47497h;
                i4 -= i6;
                this.f47510e -= i6;
                this.f47507b--;
                i5++;
                length--;
            }
            e[] eVarArr = this.f47506a;
            int i7 = i2 + 1;
            System.arraycopy(eVarArr, i7, eVarArr, i7 + i5, this.f47507b);
            this.f47509d += i5;
        }
        int i8 = this.f47507b + 1;
        e[] eVarArr2 = this.f47506a;
        int length2 = eVarArr2.length;
        if (i8 > length2) {
            e[] eVarArr3 = new e[length2 + length2];
            System.arraycopy(eVarArr2, 0, eVarArr3, length2, length2);
            this.f47509d = this.f47506a.length - 1;
            this.f47506a = eVarArr3;
            eVarArr2 = eVarArr3;
        }
        int i9 = this.f47509d;
        this.f47509d = i9 - 1;
        eVarArr2[i9] = eVar;
        this.f47507b++;
        this.f47510e += i3;
    }

    final void a(k.k kVar) throws IOException {
        c(kVar.d(), 127, 0);
        this.f47508c.Z(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b(java.util.List r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.a.a.g.b(java.util.List):void");
    }

    final void c(int i2, int i3, int i4) throws IOException {
        k.h hVar = this.f47508c;
        if (i2 < i3) {
            hVar.ae(i2 | i4);
            return;
        }
        hVar.ae(i4 | i3);
        int i5 = i2 - i3;
        if (i5 > 268435455) {
            throw new IOException("Varint would overflow reader");
        }
        while (i5 >= 128) {
            hVar.ae(128 | (i5 & 127));
            i5 >>>= 7;
        }
        hVar.ae(i5);
    }
}

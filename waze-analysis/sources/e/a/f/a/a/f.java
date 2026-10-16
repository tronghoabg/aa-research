package e.a.f.a.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.am;
import k.y;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f {

    /* renamed from: b, reason: collision with root package name */
    int f47499b;

    /* renamed from: f, reason: collision with root package name */
    private final k.j f47503f;

    /* renamed from: e, reason: collision with root package name */
    private final List f47502e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    e[] f47498a = new e[8];

    /* renamed from: c, reason: collision with root package name */
    int f47500c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f47501d = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f47504g = 4096;

    /* renamed from: h, reason: collision with root package name */
    private int f47505h = 4096;

    f(am amVar) {
        this.f47499b = r0.length - 1;
        this.f47503f = y.c(amVar);
    }

    private final int f(int i2) {
        return this.f47499b + 1 + i2;
    }

    private final int g() {
        return this.f47503f.c() & 255;
    }

    private final k.k h(int i2) throws IOException {
        if (m(i2)) {
            return h.f47512b[i2].f47495f;
        }
        int length = h.f47512b.length;
        int iF = f(i2 - 61);
        if (iF >= 0) {
            e[] eVarArr = this.f47498a;
            if (iF < eVarArr.length) {
                return eVarArr[iF].f47495f;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    private final void i() {
        int i2 = this.f47505h;
        int i3 = this.f47501d;
        if (i2 < i3) {
            if (i2 == 0) {
                j();
            } else {
                k(i3 - i2);
            }
        }
    }

    private final void j() {
        Arrays.fill(this.f47498a, (Object) null);
        this.f47499b = this.f47498a.length - 1;
        this.f47500c = 0;
        this.f47501d = 0;
    }

    private final void k(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f47498a.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f47499b;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                int i5 = this.f47498a[length].f47497h;
                i2 -= i5;
                this.f47501d -= i5;
                this.f47500c--;
                i4++;
                length--;
            }
            e[] eVarArr = this.f47498a;
            int i6 = i3 + 1;
            System.arraycopy(eVarArr, i6, eVarArr, i6 + i4, this.f47500c);
            this.f47499b += i4;
        }
    }

    private final void l(e eVar) {
        this.f47502e.add(eVar);
        int i2 = eVar.f47497h;
        int i3 = this.f47505h;
        if (i2 > i3) {
            j();
            return;
        }
        k((this.f47501d + i2) - i3);
        int i4 = this.f47500c + 1;
        e[] eVarArr = this.f47498a;
        int length = eVarArr.length;
        if (i4 > length) {
            e[] eVarArr2 = new e[length + length];
            System.arraycopy(eVarArr, 0, eVarArr2, length, length);
            this.f47499b = this.f47498a.length - 1;
            this.f47498a = eVarArr2;
            eVarArr = eVarArr2;
        }
        int i5 = this.f47499b;
        this.f47499b = i5 - 1;
        eVarArr[i5] = eVar;
        this.f47500c++;
        this.f47501d += i2;
    }

    private static final boolean m(int i2) {
        if (i2 < 0) {
            return false;
        }
        int length = h.f47512b.length;
        return i2 <= 60;
    }

    final int a(int i2, int i3) throws IOException {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        do {
            int iG = g();
            if ((iG & 128) == 0) {
                return i3 + (iG << i5);
            }
            i3 += (iG & 127) << i5;
            i5 += 7;
        } while (i5 < 28);
        throw new IOException("Varint overflowed");
    }

    public final List b() {
        List list = this.f47502e;
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        return arrayList;
    }

    final k.k c() {
        int iG = g();
        int i2 = iG & 128;
        long jA = a(iG, 127);
        k.j jVar = this.f47503f;
        return i2 == 128 ? k.k.j(o.a().b(jVar.U(jA))) : jVar.H(jA);
    }

    final void d(int i2) {
        this.f47504g = i2;
        this.f47505h = i2;
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        throw new java.io.IOException("Header index too large " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.a.a.f.e():void");
    }
}

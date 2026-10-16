package okhttp3.internal.f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k.am;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public c[] f56160a;

    /* renamed from: b, reason: collision with root package name */
    public int f56161b;

    /* renamed from: c, reason: collision with root package name */
    public int f56162c;

    /* renamed from: d, reason: collision with root package name */
    private int f56163d;

    /* renamed from: e, reason: collision with root package name */
    private final List f56164e;

    /* renamed from: f, reason: collision with root package name */
    private final k.j f56165f;

    /* renamed from: g, reason: collision with root package name */
    private int f56166g;

    public d(am amVar) {
        h.g.b.x.f(amVar, "source");
        this.f56163d = 4096;
        this.f56164e = new ArrayList();
        this.f56165f = k.y.c(amVar);
        this.f56160a = new c[8];
        this.f56166g = r2.length - 1;
    }

    private final int e(int i2) {
        return this.f56166g + 1 + i2;
    }

    private final int f() {
        return okhttp3.internal.b.B(this.f56165f.c());
    }

    private final k.k g(int i2) throws IOException {
        if (k(i2)) {
            int i3 = f.f56175a;
            return f.c()[i2].f56157g;
        }
        int i4 = f.f56175a;
        int length = f.c().length;
        int iE = e(i2 - 61);
        if (iE >= 0) {
            c[] cVarArr = this.f56160a;
            if (iE < cVarArr.length) {
                c cVar = cVarArr[iE];
                h.g.b.x.c(cVar);
                return cVar.f56157g;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    private final void h() {
        c[] cVarArr = this.f56160a;
        h.a.c.j(cVarArr, null, 0, cVarArr.length);
        this.f56166g = this.f56160a.length - 1;
        this.f56161b = 0;
        this.f56162c = 0;
    }

    private final void i(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f56160a.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f56166g;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                c cVar = this.f56160a[length];
                h.g.b.x.c(cVar);
                int i5 = cVar.f56159i;
                i2 -= i5;
                this.f56162c -= i5;
                this.f56161b--;
                i4++;
                length--;
            }
            c[] cVarArr = this.f56160a;
            int i6 = i3 + 1;
            System.arraycopy(cVarArr, i6, cVarArr, i6 + i4, this.f56161b);
            this.f56166g += i4;
        }
    }

    private final void j(c cVar) {
        this.f56164e.add(cVar);
        int i2 = cVar.f56159i;
        int i3 = this.f56163d;
        if (i2 > i3) {
            h();
            return;
        }
        i((this.f56162c + i2) - i3);
        int i4 = this.f56161b + 1;
        c[] cVarArr = this.f56160a;
        int length = cVarArr.length;
        if (i4 > length) {
            c[] cVarArr2 = new c[length + length];
            System.arraycopy(cVarArr, 0, cVarArr2, length, length);
            this.f56166g = this.f56160a.length - 1;
            this.f56160a = cVarArr2;
            cVarArr = cVarArr2;
        }
        int i5 = this.f56166g;
        this.f56166g = i5 - 1;
        cVarArr[i5] = cVar;
        this.f56161b++;
        this.f56162c += i2;
    }

    private static final boolean k(int i2) {
        if (i2 < 0) {
            return false;
        }
        int i3 = f.f56175a;
        int length = f.c().length;
        return i2 <= 60;
    }

    public final int a(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            int iF = f();
            if ((iF & 128) == 0) {
                return i3 + (iF << i5);
            }
            i3 += (iF & 127) << i5;
            i5 += 7;
        }
    }

    public final List b() {
        List list = this.f56164e;
        List listAo = h.a.i.ao(list);
        list.clear();
        return listAo;
    }

    public final k.k c() {
        int iF = f();
        int i2 = iF & 128;
        long jA = a(iF, 127);
        if (i2 != 128) {
            return this.f56165f.H(jA);
        }
        k.h hVar = new k.h();
        k.j jVar = this.f56165f;
        int i3 = ag.f56133a;
        ag.a(jVar, jA, hVar);
        return hVar.G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        throw new java.io.IOException("Header index too large " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.d.d():void");
    }
}

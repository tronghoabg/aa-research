package okhttp3.internal.f;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f56167a;

    /* renamed from: b, reason: collision with root package name */
    public c[] f56168b;

    /* renamed from: c, reason: collision with root package name */
    public int f56169c;

    /* renamed from: d, reason: collision with root package name */
    public int f56170d;

    /* renamed from: e, reason: collision with root package name */
    private final k.h f56171e;

    /* renamed from: f, reason: collision with root package name */
    private int f56172f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f56173g;

    /* renamed from: h, reason: collision with root package name */
    private int f56174h;

    public e(k.h hVar) {
        h.g.b.x.f(hVar, "out");
        this.f56171e = hVar;
        this.f56172f = Integer.MAX_VALUE;
        this.f56167a = 4096;
        this.f56168b = new c[8];
        this.f56174h = r2.length - 1;
    }

    private final void e() {
        c[] cVarArr = this.f56168b;
        h.a.c.j(cVarArr, null, 0, cVarArr.length);
        this.f56174h = this.f56168b.length - 1;
        this.f56169c = 0;
        this.f56170d = 0;
    }

    private final void f(c cVar) {
        int i2 = cVar.f56159i;
        int i3 = this.f56167a;
        if (i2 > i3) {
            e();
            return;
        }
        g((this.f56170d + i2) - i3);
        int i4 = this.f56169c + 1;
        c[] cVarArr = this.f56168b;
        int length = cVarArr.length;
        if (i4 > length) {
            c[] cVarArr2 = new c[length + length];
            System.arraycopy(cVarArr, 0, cVarArr2, length, length);
            this.f56174h = this.f56168b.length - 1;
            this.f56168b = cVarArr2;
            cVarArr = cVarArr2;
        }
        int i5 = this.f56174h;
        this.f56174h = i5 - 1;
        cVarArr[i5] = cVar;
        this.f56169c++;
        this.f56170d += i2;
    }

    private final void g(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f56168b.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f56174h;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                c cVar = this.f56168b[length];
                h.g.b.x.c(cVar);
                i2 -= cVar.f56159i;
                int i5 = this.f56170d;
                c cVar2 = this.f56168b[length];
                h.g.b.x.c(cVar2);
                this.f56170d = i5 - cVar2.f56159i;
                this.f56169c--;
                i4++;
                length--;
            }
            c[] cVarArr = this.f56168b;
            int i6 = i3 + 1;
            System.arraycopy(cVarArr, i6, cVarArr, i6 + i4, this.f56169c);
            c[] cVarArr2 = this.f56168b;
            int i7 = this.f56174h + 1;
            Arrays.fill(cVarArr2, i7, i7 + i4, (Object) null);
            this.f56174h += i4;
        }
    }

    public final void a(int i2) {
        int iMin = Math.min(i2, 16384);
        int i3 = this.f56167a;
        if (i3 == iMin) {
            return;
        }
        if (iMin < i3) {
            this.f56172f = Math.min(this.f56172f, iMin);
        }
        this.f56173g = true;
        this.f56167a = iMin;
        int i4 = this.f56170d;
        if (iMin < i4) {
            if (iMin == 0) {
                e();
            } else {
                g(i4 - iMin);
            }
        }
    }

    public final void b(k.k kVar) {
        h.g.b.x.f(kVar, "data");
        int i2 = ag.f56133a;
        if (ag.c(kVar) >= kVar.d()) {
            d(kVar.d(), 127, 0);
            this.f56171e.Z(kVar);
            return;
        }
        k.h hVar = new k.h();
        ag.b(kVar, hVar);
        k.k kVarG = hVar.G();
        d(kVarG.d(), 127, 128);
        this.f56171e.Z(kVarG);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.e.c(java.util.List):void");
    }

    public final void d(int i2, int i3, int i4) {
        k.h hVar = this.f56171e;
        if (i2 < i3) {
            hVar.ae(i2 | i4);
            return;
        }
        hVar.ae(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            hVar.ae(128 | (i5 & 127));
            i5 >>>= 7;
        }
        hVar.ae(i5);
    }
}

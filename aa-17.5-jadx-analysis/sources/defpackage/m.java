package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {
    private static int h = 1000;
    public k[] c;
    public final lah g;
    int a = 0;
    public final l b = new l();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private n[] l = new n[h];
    private int m = 0;
    private k[] n = new k[32];

    public m() {
        this.c = null;
        this.c = new k[32];
        q();
        this.g = new lah((char[]) null);
    }

    public static final int n(Object obj) {
        n nVar = ((o) obj).f;
        if (nVar != null) {
            return (int) (nVar.d + 0.5f);
        }
        return 0;
    }

    public static k o(m mVar, n nVar, n nVar2, int i, float f, n nVar3, n nVar4, int i2) {
        k kVarA = mVar.a();
        kVarA.d(nVar, nVar2, i, f, nVar3, nVar4, i2);
        n nVarB = mVar.b();
        n nVarB2 = mVar.b();
        nVarB.c = 4;
        nVarB2.c = 4;
        kVarA.c(nVarB, nVarB2);
        return kVarA;
    }

    private final void p() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (k[]) Arrays.copyOf(this.c, i2);
        lah lahVar = this.g;
        lahVar.b = (n[]) Arrays.copyOf((Object[]) lahVar.b, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void q() {
        int i = 0;
        while (true) {
            k[] kVarArr = this.c;
            if (i >= kVarArr.length) {
                return;
            }
            k kVar = kVarArr[i];
            if (kVar != null) {
                ((imr) this.g.c).i(kVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final n r(int i) {
        n nVar = (n) ((imr) this.g.a).h();
        if (nVar == null) {
            nVar = new n(i);
        } else {
            nVar.b();
            nVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (n[]) Arrays.copyOf(this.l, i4);
        }
        n[] nVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        nVarArr[i5] = nVar;
        return nVar;
    }

    public final k a() {
        lah lahVar = this.g;
        k kVar = (k) ((imr) lahVar.c).h();
        if (kVar == null) {
            return new k(lahVar);
        }
        kVar.a = null;
        j jVar = kVar.d;
        jVar.e = -1;
        jVar.f = -1;
        jVar.g = false;
        jVar.a = 0;
        kVar.b = BitmapDescriptorFactory.HUE_RED;
        kVar.e = false;
        return kVar;
    }

    public final n b() {
        if (this.e + 1 >= this.j) {
            p();
        }
        n nVarR = r(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        nVarR.a = i;
        ((n[]) this.g.b)[i] = nVarR;
        return nVarR;
    }

    public final n c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            p();
        }
        o oVar = (o) obj;
        n nVar = oVar.f;
        if (nVar == null) {
            oVar.e();
            nVar = oVar.f;
        }
        int i = nVar.a;
        if (i != -1) {
            if (i <= this.a && ((n[]) this.g.b)[i] != null) {
                return nVar;
            }
            if (i != -1) {
                nVar.b();
            }
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        nVar.a = i2;
        nVar.h = 1;
        ((n[]) this.g.b)[i2] = nVar;
        return nVar;
    }

    public final n d() {
        if (this.e + 1 >= this.j) {
            p();
        }
        n nVarR = r(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        nVarR.a = i;
        ((n[]) this.g.b)[i] = nVarR;
        return nVarR;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.k r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.e(k):void");
    }

    public final void f(n nVar, int i) {
        int i2 = nVar.b;
        if (i2 != -1) {
            k kVar = this.c[i2];
            if (kVar.e) {
                kVar.b = i;
                return;
            }
            k kVarA = a();
            kVarA.g(nVar, i);
            e(kVarA);
            return;
        }
        float f = i;
        k kVarA2 = a();
        kVarA2.a = nVar;
        nVar.d = f;
        kVarA2.b = f;
        kVarA2.e = true;
        e(kVarA2);
    }

    public final void g(n nVar, n nVar2, int i, int i2) {
        k kVarA = a();
        n nVarD = d();
        nVarD.c = i2;
        kVarA.i(nVar, nVar2, nVarD, i);
        e(kVarA);
    }

    public final void h(n nVar, n nVar2, int i, int i2) {
        k kVarA = a();
        n nVarD = d();
        nVarD.c = i2;
        kVarA.j(nVar, nVar2, nVarD, i);
        e(kVarA);
    }

    public final void i(k kVar, int i) {
        kVar.d.f(b(), i);
    }

    public final void j() {
        lah lahVar;
        int i = 0;
        while (true) {
            lahVar = this.g;
            n[] nVarArr = (n[]) lahVar.b;
            if (i >= nVarArr.length) {
                break;
            }
            n nVar = nVarArr[i];
            if (nVar != null) {
                nVar.b();
            }
            i++;
        }
        Object obj = lahVar.a;
        n[] nVarArr2 = this.l;
        int i2 = this.m;
        int length = nVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            n nVar2 = nVarArr2[i3];
            imr imrVar = (imr) obj;
            int i4 = imrVar.a;
            if (i4 < 256) {
                ((Object[]) imrVar.b)[i4] = nVar2;
                imrVar.a = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[]) lahVar.b, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        q();
        this.f = 0;
    }

    public final void k(n nVar, n nVar2, int i, float f, n nVar3, n nVar4, int i2) {
        k kVarA = a();
        kVarA.d(nVar, nVar2, i, f, nVar3, nVar4, i2);
        n nVarB = b();
        n nVarB2 = b();
        nVarB.c = 4;
        nVarB2.c = 4;
        kVarA.c(nVarB, nVarB2);
        e(kVarA);
    }

    public final void l(n nVar, n nVar2, int i, int i2) {
        k kVarA = a();
        kVarA.h(nVar, nVar2, i);
        n nVarB = b();
        n nVarB2 = b();
        nVarB.c = i2;
        nVarB2.c = i2;
        kVarA.c(nVarB, nVarB2);
        e(kVarA);
    }

    public final void m(l lVar) throws Exception {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            k kVar = this.c[i];
            if (kVar.a.h != 1 && kVar.b < BitmapDescriptorFactory.HUE_RED) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        k kVar2 = this.c[i5];
                        if (kVar2.a.h != 1 && kVar2.b < BitmapDescriptorFactory.HUE_RED) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                n nVar = ((n[]) this.g.b)[i6];
                                float fA = kVar2.d.a(nVar);
                                if (fA > BitmapDescriptorFactory.HUE_RED) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = nVar.e[i7] / fA;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    k kVar3 = this.c[i2];
                    kVar3.a.b = -1;
                    kVar3.a(((n[]) this.g.b)[i3]);
                    kVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(kVar3);
                    }
                    lVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            k kVar4 = this.c[i9];
            if (kVar4.a.h != 1 && kVar4.b < BitmapDescriptorFactory.HUE_RED) {
                return;
            }
        }
    }
}

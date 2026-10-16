package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axp {
    public final int a;
    public final java.util.List b;
    public final boolean c;
    public final int d;
    public final java.lang.Object e;
    public final defpackage.azi f;
    public final long g;
    public int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public boolean o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public final int[] r;
    private final defpackage.cft s;
    private final defpackage.dlz t;
    private final int u;
    private final int v;
    private final long w;
    private int x;
    private final defpackage.cfy y;

    public axp(int i, java.util.List list, boolean z, defpackage.cft cftVar, defpackage.cfy cfyVar, defpackage.dlz dlzVar, int i2, int i3, int i4, long j, java.lang.Object obj, defpackage.azi aziVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.s = cftVar;
        this.y = cfyVar;
        this.t = dlzVar;
        this.u = i2;
        this.d = i3;
        this.v = i4;
        this.w = j;
        this.e = obj;
        this.f = aziVar;
        this.g = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            defpackage.cux cuxVar = (defpackage.cux) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? cuxVar.b : cuxVar.a;
            iMax = java.lang.Math.max(iMax, !z2 ? cuxVar.b : cuxVar.a);
        }
        this.i = i5;
        this.n = iMax;
        int size2 = this.b.size();
        this.r = new int[size2 + size2];
        if (this.c) {
            this.m = this.v;
            this.k = i5;
            this.j = iMax;
            this.l = 0;
            return;
        }
        this.m = 0;
        this.k = iMax;
        this.j = i5;
        this.l = this.v;
    }

    private final int f(long j) {
        return this.c ? (int) (j & 4294967295L) : (int) (j >> 32);
    }

    public final int a() {
        int i;
        int i2;
        if (this.c) {
            i = this.k;
            i2 = this.m;
        } else {
            i = this.j;
            i2 = this.l;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final long b(int i) {
        if (i == 0) {
            if (this.b.size() == 0) {
                boolean z = this.c;
                int i2 = this.h;
                return z ? ((long) i2) & 4294967295L : ((long) i2) << 32;
            }
            i = 0;
        }
        int[] iArr = this.r;
        int i3 = i + i;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    public final void c() {
        this.o = true;
    }

    public final void d(defpackage.cuw cuwVar, boolean z) {
        if (this.p == Integer.MIN_VALUE) {
            defpackage.asq.c("position() should be called first");
        }
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            defpackage.cux cuxVar = (defpackage.cux) list.get(i2);
            int i3 = this.x;
            boolean z2 = this.c;
            int i4 = i3 - (z2 ? cuxVar.b : cuxVar.a);
            int i5 = this.q;
            long jB = b(i2);
            defpackage.azf azfVarB = this.f.b(this.e, i2);
            defpackage.cmq cmqVar = null;
            if (azfVarB != null) {
                if (z) {
                    azfVarB.j = jB;
                } else {
                    long j = azfVarB.j;
                    if (j != 9223372034707292159L) {
                        jB = j;
                    }
                    long jD = defpackage.dlw.d(jB, azfVarB.a());
                    if (((f(jB) <= i4 && f(jD) <= i4) || (f(jB) >= i5 && f(jD) >= i5)) && azfVarB.j()) {
                        ahoc.d(azfVarB.a, (defpackage.afdo) null, i, new defpackage.adh(azfVarB, (defpackage.afdk) null, 14, (byte[]) null), 3);
                    }
                    jB = jD;
                }
                cmqVar = azfVarB.k;
            }
            long jD2 = defpackage.dlw.d(jB, this.w);
            if (!z && azfVarB != null) {
                azfVarB.i = jD2;
            }
            if (!z2) {
                defpackage.cmq cmqVar2 = cmqVar;
                if (cmqVar2 == null) {
                    cuwVar.z(cuxVar, jD2, defpackage.cuy.a);
                } else if (cuwVar.o() == defpackage.dlz.a || cuwVar.n() == 0) {
                    cuwVar.q(cuxVar);
                    cuxVar.y(defpackage.dlw.d(jD2, cuxVar.e), 0.0f, cmqVar2);
                } else {
                    int iN = cuwVar.n() - cuxVar.a;
                    cuwVar.q(cuxVar);
                    cuxVar.y(defpackage.dlw.d((((long) ((int) (jD2 & 4294967295L))) & 4294967295L) | (((long) (iN - ((int) (jD2 >> 32)))) << 32), cuxVar.e), 0.0f, cmqVar2);
                }
            } else if (cmqVar != null) {
                cuwVar.v(cuxVar, jD2, cmqVar, 0.0f);
            } else {
                cuwVar.u(cuxVar, jD2, 0.0f, defpackage.cuy.a);
            }
            i2++;
            i = 0;
        }
    }

    public final void e(int i, int i2, int i3) {
        int i4;
        this.h = i;
        boolean z = this.c;
        this.p = true != z ? i2 : i3;
        java.util.List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            defpackage.cux cuxVar = (defpackage.cux) list.get(i5);
            int i6 = i5 + i5;
            int[] iArr = this.r;
            if (z) {
                defpackage.cft cftVar = this.s;
                if (cftVar == null) {
                    defpackage.asq.a("null horizontalAlignment when isVertical == true");
                    throw new defpackage.afap();
                }
                iArr[i6] = cftVar.a(cuxVar.a, i2, this.t);
                iArr[i6 + 1] = i;
                i4 = cuxVar.b;
            } else {
                int i7 = i6 + 1;
                iArr[i6] = i;
                defpackage.cfy cfyVar = this.y;
                if (cfyVar == null) {
                    defpackage.asq.a("null verticalAlignment when isVertical == false");
                    throw new defpackage.afap();
                }
                iArr[i7] = cfyVar.a(cuxVar.b, i3);
                i4 = cuxVar.a;
            }
            i += i4;
        }
        this.x = -this.u;
        this.q = this.p + this.d;
    }
}

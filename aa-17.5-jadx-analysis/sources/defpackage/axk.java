package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class axk {
    public final int a;
    public final List b;
    public final boolean c;
    public final int d;
    public final Object e;
    public final azd f;
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
    private final cfm s;
    private final dlr t;
    private final int u;
    private final int v;
    private final long w;
    private int x;
    private final cfr y;

    public axk(int i, List list, boolean z, cfm cfmVar, cfr cfrVar, dlr dlrVar, int i2, int i3, int i4, long j, Object obj, azd azdVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.s = cfmVar;
        this.y = cfrVar;
        this.t = dlrVar;
        this.u = i2;
        this.d = i3;
        this.v = i4;
        this.w = j;
        this.e = obj;
        this.f = azdVar;
        this.g = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            cuo cuoVar = (cuo) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? cuoVar.b : cuoVar.a;
            iMax = Math.max(iMax, !z2 ? cuoVar.b : cuoVar.a);
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
                return z ? i2 & 4294967295L : i2 << 32;
            }
            i = 0;
        }
        int[] iArr = this.r;
        int i3 = i + i;
        return (iArr[i3 + 1] & 4294967295L) | (iArr[i3] << 32);
    }

    public final void c() {
        this.o = true;
    }

    public final void d(cun cunVar, boolean z) {
        int i;
        if (this.p == Integer.MIN_VALUE) {
            asl.c("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            cuo cuoVar = (cuo) list.get(i3);
            int i4 = this.x;
            boolean z2 = this.c;
            int i5 = i4 - (z2 ? cuoVar.b : cuoVar.a);
            int i6 = this.q;
            long jB = b(i3);
            aza azaVarB = this.f.b(this.e, i3);
            cmi cmiVar = null;
            if (azaVarB != null) {
                if (z) {
                    azaVarB.j = jB;
                } else {
                    long j = azaVarB.j;
                    if (j != 9223372034707292159L) {
                        jB = j;
                    }
                    long jD = dlo.d(jB, azaVarB.a());
                    if (((f(jB) <= i5 && f(jD) <= i5) || (f(jB) >= i6 && f(jD) >= i6)) && azaVarB.j()) {
                        ahnc.d(azaVarB.a, null, i2, new ada(azaVarB, (afck) null, 14, (byte[]) null), 3);
                    }
                    jB = jD;
                }
                cmiVar = azaVarB.k;
            }
            long jD2 = dlo.d(jB, this.w);
            if (!z && azaVarB != null) {
                azaVarB.i = jD2;
            }
            if (z2) {
                if (cmiVar != null) {
                    cunVar.v(cuoVar, jD2, cmiVar, BitmapDescriptorFactory.HUE_RED);
                } else {
                    cunVar.u(cuoVar, jD2, BitmapDescriptorFactory.HUE_RED, cup.a);
                }
                i = i3;
            } else {
                cmi cmiVar2 = cmiVar;
                if (cmiVar2 == null) {
                    i = i3;
                    cunVar.z(cuoVar, jD2, cup.a);
                } else if (cunVar.o() == dlr.a || cunVar.n() == 0) {
                    i = i3;
                    cunVar.q(cuoVar);
                    cuoVar.y(dlo.d(jD2, cuoVar.e), BitmapDescriptorFactory.HUE_RED, cmiVar2);
                } else {
                    int iN = cunVar.n() - cuoVar.a;
                    cunVar.q(cuoVar);
                    i = i3;
                    cuoVar.y(dlo.d((((int) (jD2 & 4294967295L)) & 4294967295L) | ((iN - ((int) (jD2 >> 32))) << 32), cuoVar.e), BitmapDescriptorFactory.HUE_RED, cmiVar2);
                }
            }
            i3 = i + 1;
            i2 = 0;
        }
    }

    public final void e(int i, int i2, int i3) {
        int i4;
        this.h = i;
        boolean z = this.c;
        this.p = true != z ? i2 : i3;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            cuo cuoVar = (cuo) list.get(i5);
            int i6 = i5 + i5;
            int[] iArr = this.r;
            if (z) {
                cfm cfmVar = this.s;
                if (cfmVar == null) {
                    asl.a("null horizontalAlignment when isVertical == true");
                    throw new aezp();
                }
                iArr[i6] = cfmVar.a(cuoVar.a, i2, this.t);
                iArr[i6 + 1] = i;
                i4 = cuoVar.b;
            } else {
                int i7 = i6 + 1;
                iArr[i6] = i;
                cfr cfrVar = this.y;
                if (cfrVar == null) {
                    asl.a("null verticalAlignment when isVertical == false");
                    throw new aezp();
                }
                iArr[i7] = cfrVar.a(cuoVar.b, i3);
                i4 = cuoVar.a;
            }
            i += i4;
        }
        this.x = -this.u;
        this.q = this.p + this.d;
    }
}

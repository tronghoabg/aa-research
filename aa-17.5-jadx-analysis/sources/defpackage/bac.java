package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class bac implements ayh {
    public float a;
    public int b;
    public boolean c;
    public int[] d;
    public int[] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int[] k;
    public boolean l;
    public int m;
    public final zh n;
    public final zh o;
    public final izj p;
    private int q;
    private final zj r;
    private final zc s;

    public bac(izj izjVar) {
        this.p = izjVar;
        zh zhVar = zi.a;
        this.n = new zh(6);
        int[] iArr = zk.a;
        this.r = new zj(6);
        int i = zd.a;
        this.s = new zc(6);
        this.o = new zh(6);
        this.b = -1;
        Integer num = 1;
        int iMax = Math.max(1, num.intValue());
        this.q = iMax;
        int[] iArr2 = new int[iMax];
        for (int i2 = 0; i2 < iMax; i2++) {
            iArr2[i2] = Integer.MAX_VALUE;
        }
        this.d = iArr2;
        int i3 = this.q;
        int[] iArr3 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr3[i4] = Integer.MIN_VALUE;
        }
        this.e = iArr3;
        int i5 = this.q;
        this.f = new int[i5];
        this.g = new int[i5];
        this.h = new int[i5];
        this.i = new int[i5];
        this.j = new int[i5];
        this.k = new int[i5];
    }

    private final int k(epk epkVar, int i, boolean z, int i2) {
        List list;
        List list2;
        zh zhVar = this.o;
        if (zhVar.b(i2)) {
            Object objA = zhVar.a(i2);
            objA.getClass();
            return ((ayi) objA).b;
        }
        zh zhVar2 = this.n;
        int i3 = 0;
        if (zhVar2.b(i2)) {
            if (z && (list2 = (List) zhVar2.a(i2)) != null) {
                int size = list2.size();
                while (i3 < size) {
                    ((azs) list2.get(i3)).b();
                    i3++;
                }
            }
            return -1;
        }
        zhVar2.g(i2, epkVar.o(i2, new bad(this, epkVar, i, i2, 1)));
        if (z && (list = (List) zhVar2.a(i2)) != null) {
            int size2 = list.size();
            while (i3 < size2) {
                ((azs) list.get(i3)).b();
                i3++;
            }
        }
        return -1;
    }

    @Override // defpackage.ayh
    public final void a() {
        int i;
        Integer num = 1;
        int iMax = Math.max(1, num.intValue());
        this.q = iMax;
        int[] iArr = this.d;
        int length = iArr.length;
        if (length != iMax) {
            int[] iArr2 = new int[iMax];
            for (int i2 = 0; i2 < iMax; i2++) {
                iArr2[i2] = Integer.MAX_VALUE;
            }
            this.d = iArr2;
            int[] iArr3 = new int[iMax];
            for (int i3 = 0; i3 < iMax; i3++) {
                iArr3[i3] = Integer.MIN_VALUE;
            }
            this.e = iArr3;
            this.f = new int[iMax];
            this.g = new int[iMax];
            this.h = new int[iMax];
            this.i = new int[iMax];
            this.j = new int[iMax];
            this.k = new int[iMax];
        } else {
            iArr.getClass();
            Arrays.fill(iArr, 0, length, Alert.DURATION_SHOW_INDEFINITELY);
            int[] iArr4 = this.e;
            int length2 = iArr4.length;
            iArr4.getClass();
            Arrays.fill(iArr4, 0, length2, Integer.MIN_VALUE);
            int[] iArr5 = this.f;
            int length3 = iArr5.length;
            iArr5.getClass();
            Arrays.fill(iArr5, 0, length3, 0);
            int[] iArr6 = this.g;
            int length4 = iArr6.length;
            iArr6.getClass();
            Arrays.fill(iArr6, 0, length4, 0);
        }
        this.l = false;
        this.s.b();
        this.o.f();
        zh zhVar = this.n;
        long[] jArr = zhVar.a;
        int length5 = jArr.length - 2;
        if (length5 < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length5;
                int i6 = 0;
                while (true) {
                    i = 8 - ((~i5) >>> 31);
                    if (i6 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i7 = (i4 << 3) + i6;
                        int i8 = zhVar.b[i7];
                        List list = (List) zhVar.c[i7];
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ((azs) list.get(i9)).a();
                        }
                        zhVar.e(i7);
                    }
                    j >>= 8;
                    i6++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i4 == length5) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final int b() {
        return this.d.length;
    }

    public final ayi c(int i, int i2, Object obj) {
        ayi ayiVar = (ayi) this.o.a(i);
        if (ayiVar == null) {
            return new ayi(obj, i2);
        }
        ayiVar.b = i2;
        ayiVar.a = obj;
        return ayiVar;
    }

    public final void d() {
        Integer num = 1;
        if (this.q != Math.max(1, num.intValue())) {
            a();
            this.l = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bac.e(int, int):void");
    }

    public final void f() {
        int iB = b();
        for (int i = 0; i < iB; i++) {
            vs.i(a.bp(i, "perLaneCacheWindowStartSpace lane="), this.f[i]);
            vs.i(a.bp(i, "perLaneCacheWindowEndSpace lane="), this.g[i]);
            vs.i(a.bp(i, "perLaneCacheWindowStartIndex lane="), this.d[i]);
            vs.i(a.bp(i, "perLaneCacheWindowEndItemIndex lane="), this.e[i]);
        }
    }

    public final void g(int i, int i2, int i3) {
        b();
        this.e[i] = i2;
        int[] iArr = this.g;
        iArr[i] = iArr[i] - i3;
    }

    public final void h(int i, int i2, int i3) {
        b();
        this.d[i] = i2;
        int[] iArr = this.f;
        iArr[i] = iArr[i] - i3;
    }

    public final void i(epk epkVar, int i, int i2, int i3) {
        int i4;
        bac bacVar;
        this.o.g(i2, c(i2, i3, ayi.c));
        if (i2 > this.e[i]) {
            g(i, i2, i3);
        } else if (i2 < this.d[i]) {
            h(i, i2, i3);
        }
        afft afftVar = new afft();
        int i5 = -1;
        afftVar.a = -1;
        if (Math.signum(this.a) > BitmapDescriptorFactory.HUE_RED) {
            while (true) {
                int iG = awx.g(this.f);
                afftVar.a = iG;
                if (iG == -1) {
                    break;
                }
                int[] iArr = this.f;
                if (iArr[iG] > 0) {
                    int i6 = this.d[iG];
                    if (i6 > 0) {
                        i5 = (-1) + i6;
                        break;
                    }
                    iArr[iG] = 0;
                } else {
                    break;
                }
            }
        } else {
            while (true) {
                int iG2 = awx.g(this.g);
                afftVar.a = iG2;
                if (iG2 == -1) {
                    break;
                }
                int[] iArr2 = this.g;
                if (iArr2[iG2] <= 0) {
                    break;
                }
                int i7 = this.e[iG2] + 1;
                if (i7 != -1 && i7 < this.m) {
                    i4 = i7;
                    break;
                }
                iArr2[iG2] = 0;
            }
        }
        i4 = i5;
        if (i4 >= 0) {
            bacVar = this;
            this.n.g(i4, epkVar.o(i4, new bdx(bacVar, epkVar, afftVar, i4, 1)));
        } else {
            bacVar = this;
        }
        bacVar.f();
    }

    public final void j(epk epkVar, int i, float f, boolean z) {
        float fSignum = Math.signum(f);
        float fSignum2 = Math.signum(this.a);
        if (z) {
            epkVar.k(this.i);
            epkVar.l(this.k);
            int iB = b();
            for (int i2 = 0; i2 < iB; i2++) {
                int i3 = i - this.k[i2];
                if (fSignum != fSignum2 || this.l) {
                    this.e[i2] = this.i[i2];
                    this.g[i2] = i3;
                } else {
                    int[] iArr = this.g;
                    int iK = iArr[i2] + afgi.k(Math.abs(f));
                    if (iK <= i3) {
                        i3 = iK;
                    }
                    iArr[i2] = i3;
                }
            }
            while (true) {
                int iG = awx.g(this.g);
                if (iG == -1) {
                    return;
                }
                int[] iArr2 = this.g;
                if (iArr2[iG] <= 0) {
                    return;
                }
                int i4 = this.e[iG];
                if (i4 == -1 || i4 >= this.m - 1) {
                    iArr2[iG] = 0;
                } else {
                    int i5 = i4 + 1;
                    int iK2 = k(epkVar, iG, i5 == this.i[iG] + 1 && f != BitmapDescriptorFactory.HUE_RED && Math.abs(f) >= ((float) this.k[iG]), i5);
                    if (iK2 == -1) {
                        return;
                    } else {
                        g(iG, i5, iK2);
                    }
                }
            }
        } else {
            epkVar.j(this.h);
            epkVar.m(this.j);
            int iB2 = b();
            for (int i6 = 0; i6 < iB2; i6++) {
                int i7 = i - this.j[i6];
                if (fSignum != fSignum2 || this.l) {
                    this.f[i6] = i7;
                    this.d[i6] = this.h[i6];
                } else {
                    int[] iArr3 = this.f;
                    int iK3 = iArr3[i6] + afgi.k(Math.abs(f));
                    if (iK3 <= i7) {
                        i7 = iK3;
                    }
                    iArr3[i6] = i7;
                }
            }
            while (true) {
                int iG2 = awx.g(this.f);
                if (iG2 == -1) {
                    return;
                }
                int[] iArr4 = this.f;
                if (iArr4[iG2] <= 0) {
                    return;
                }
                int i8 = this.d[iG2];
                if (i8 <= 0) {
                    iArr4[iG2] = 0;
                } else {
                    int i9 = i8 - 1;
                    int iK4 = k(epkVar, iG2, i9 == this.h[iG2] + (-1) && f != BitmapDescriptorFactory.HUE_RED && Math.abs(f) >= ((float) this.j[iG2]), i9);
                    if (iK4 == -1) {
                        return;
                    } else {
                        h(iG2, i9, iK4);
                    }
                }
            }
        }
    }
}

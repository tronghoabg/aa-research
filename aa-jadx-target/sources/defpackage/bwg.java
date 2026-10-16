package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bwg {
    public final java.util.List a;
    public final int b;
    public int c;
    public final java.util.List d;
    public final defpackage.afar e;
    public final defpackage.zo f;

    public bwg(java.util.List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            defpackage.bxi.a("Invalid start index");
        }
        this.d = new java.util.ArrayList();
        defpackage.zo zoVar = new defpackage.zo(6);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.bzj bzjVar = (defpackage.bzj) this.a.get(i3);
            zoVar.g(bzjVar.c, new defpackage.srs(i3, i2, bzjVar.d));
            i2 += bzjVar.d;
        }
        this.f = zoVar;
        this.e = defpackage.afga.cB(1, new defpackage.bwf(this, 0));
    }

    public final int a(defpackage.bzj bzjVar) {
        defpackage.srs srsVar = (defpackage.srs) this.f.a(bzjVar.c);
        if (srsVar != null) {
            return srsVar.b;
        }
        return -1;
    }

    public final int b(defpackage.bzj bzjVar) {
        defpackage.srs srsVar = (defpackage.srs) this.f.a(bzjVar.c);
        return srsVar != null ? srsVar.a : bzjVar.d;
    }

    public final void c(defpackage.bzj bzjVar, int i) {
        this.f.g(bzjVar.c, new defpackage.srs(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        defpackage.zo zoVar = this.f;
        defpackage.srs srsVar = (defpackage.srs) zoVar.a(i);
        if (srsVar == null) {
            return false;
        }
        int i5 = srsVar.b;
        int i6 = i2 - srsVar.a;
        srsVar.a = i2;
        if (i6 == 0) {
            return true;
        }
        java.lang.Object[] objArr = zoVar.c;
        long[] jArr = zoVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = i7 - length;
                int i9 = 0;
                while (true) {
                    i3 = 8 - ((~i8) >>> 31);
                    if (i9 >= i3) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        defpackage.srs srsVar2 = (defpackage.srs) objArr[(i7 << 3) + i9];
                        if (srsVar2.b >= i5 && !defpackage.afga.f(srsVar2, srsVar) && (i4 = srsVar2.b + i6) >= 0) {
                            srsVar2.b = i4;
                        }
                    }
                    j >>= 8;
                    i9++;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final void e(defpackage.bzj bzjVar) {
        this.d.add(bzjVar);
    }
}

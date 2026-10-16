package defpackage;

/* loaded from: classes.dex */
public final class dbs extends erm {
    public final zh a;

    public dbs() {
        zh zhVar = zi.a;
        this.a = new zh(6);
    }

    @Override // defpackage.erm
    protected final void d() {
        int i;
        zh zhVar = this.a;
        int[] iArr = zhVar.b;
        Object[] objArr = zhVar.c;
        long[] jArr = zhVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        int i6 = iArr[i5];
                        aag aagVar = (aag) objArr[i5];
                        Object[] objArr2 = aagVar.a;
                        int i7 = aagVar.b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            dbr dbrVar = (dbr) objArr2[i8];
                            dbrVar.a(null);
                            cdg cdgVar = dbrVar.a.a;
                            cdgVar.b = true;
                            cdgVar.a = false;
                            cdgVar.b();
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}

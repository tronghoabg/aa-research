package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dca extends defpackage.ers {
    public final defpackage.zo a;

    public dca() {
        defpackage.zo zoVar = defpackage.zp.a;
        this.a = new defpackage.zo(6);
    }

    @Override // defpackage.ers
    protected final void d() {
        int i;
        defpackage.zo zoVar = this.a;
        int[] iArr = zoVar.b;
        java.lang.Object[] objArr = zoVar.c;
        long[] jArr = zoVar.a;
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
                        defpackage.aan aanVar = (defpackage.aan) objArr[i5];
                        java.lang.Object[] objArr2 = aanVar.a;
                        int i7 = aanVar.b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            defpackage.dbz dbzVar = (defpackage.dbz) objArr2[i8];
                            dbzVar.a(null);
                            defpackage.cdm cdmVar = dbzVar.a.a;
                            cdmVar.b = true;
                            cdmVar.a = false;
                            cdmVar.b();
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

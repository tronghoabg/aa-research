package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class esm extends defpackage.ers {
    public final defpackage.aau a;

    public esm() {
        long[] jArr = defpackage.aav.a;
        this.a = new defpackage.aau(6);
    }

    public final void a(java.lang.Object obj) {
        defpackage.esl eslVar = (defpackage.esl) this.a.i(obj);
        if (eslVar != null) {
            eslVar.b.a();
        }
    }

    @Override // defpackage.ers
    public final void d() {
        defpackage.aau aauVar;
        int i;
        defpackage.aau aauVar2 = this.a;
        if (aauVar2.d()) {
            aauVar = defpackage.aav.b;
            aauVar.getClass();
        } else {
            defpackage.aau aauVar3 = new defpackage.aau(aauVar2.e);
            aauVar3.l(aauVar2);
            aauVar = aauVar3;
        }
        java.lang.Object[] objArr = aauVar.c;
        long[] jArr = aauVar.a;
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
                        defpackage.esl eslVar = (defpackage.esl) objArr[(i2 << 3) + i4];
                        eslVar.a();
                        a(eslVar.a);
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

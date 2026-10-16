package defpackage;

/* loaded from: classes2.dex */
public final class esg extends erm {
    public final aan a;

    public esg() {
        long[] jArr = aao.a;
        this.a = new aan(6);
    }

    public final void a(Object obj) {
        esf esfVar = (esf) this.a.i(obj);
        if (esfVar != null) {
            esfVar.b.a();
        }
    }

    @Override // defpackage.erm
    public final void d() {
        aan aanVar;
        int i;
        aan aanVar2 = this.a;
        if (aanVar2.d()) {
            aanVar = aao.b;
            aanVar.getClass();
        } else {
            aan aanVar3 = new aan(aanVar2.e);
            aanVar3.l(aanVar2);
            aanVar = aanVar3;
        }
        Object[] objArr = aanVar.c;
        long[] jArr = aanVar.a;
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
                        esf esfVar = (esf) objArr[(i2 << 3) + i4];
                        esfVar.a();
                        a(esfVar.a);
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

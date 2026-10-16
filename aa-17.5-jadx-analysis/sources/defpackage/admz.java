package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class admz implements adnb {
    final int a;
    final adnb[] b;
    private final int c;

    private admz(int i, adnb[] adnbVarArr, int i2) {
        this.a = i;
        this.b = adnbVarArr;
        this.c = i2;
    }

    static adnb b(adnb adnbVar, int i, adnb adnbVar2, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = (i2 >>> i3) & 31;
        int i6 = 1 << i4;
        int i7 = 1 << i5;
        if (i6 == i7) {
            adnb adnbVarB = b(adnbVar, i, adnbVar2, i2, i3 + 5);
            return new admz(i6, new adnb[]{adnbVarB}, ((admz) adnbVarB).c);
        }
        adnb adnbVar3 = i4 > i5 ? adnbVar : adnbVar2;
        if (i4 > i5) {
            adnbVar = adnbVar2;
        }
        return new admz(i6 | i7, new adnb[]{adnbVar, adnbVar3}, adnbVar.a() + adnbVar3.a());
    }

    private final int e(int i) {
        return Integer.bitCount(this.a & (i - 1));
    }

    @Override // defpackage.adnb
    public final int a() {
        return this.c;
    }

    @Override // defpackage.adnb
    public final adnb c(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int i4 = 1 << ((i >>> i2) & 31);
        int iE = e(i4);
        int i5 = i3 & i4;
        adnb[] adnbVarArr = this.b;
        if (i5 != 0) {
            adnb[] adnbVarArr2 = (adnb[]) Arrays.copyOf(adnbVarArr, adnbVarArr.length);
            adnb adnbVarC = adnbVarArr[iE].c(obj, obj2, i, i2 + 5);
            adnbVarArr2[iE] = adnbVarC;
            return new admz(i3, adnbVarArr2, (this.c + adnbVarC.a()) - adnbVarArr[iE].a());
        }
        int i6 = i3 | i4;
        int length = adnbVarArr.length;
        adnb[] adnbVarArr3 = new adnb[length + 1];
        System.arraycopy(adnbVarArr, 0, adnbVarArr3, 0, iE);
        adnbVarArr3[iE] = new adna(obj, obj2, 0);
        System.arraycopy(adnbVarArr, iE, adnbVarArr3, iE + 1, length - iE);
        return new admz(i6, adnbVarArr3, this.c + 1);
    }

    @Override // defpackage.adnb
    public final Object d(Object obj, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        if ((this.a & i3) == 0) {
            return null;
        }
        return this.b[e(i3)].d(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (adnb adnbVar : this.b) {
            sb.append(adnbVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}

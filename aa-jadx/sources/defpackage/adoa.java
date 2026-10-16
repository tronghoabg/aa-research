package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adoa implements defpackage.adoc {
    final int a;
    final defpackage.adoc[] b;
    private final int c;

    private adoa(int i, defpackage.adoc[] adocVarArr, int i2) {
        this.a = i;
        this.b = adocVarArr;
        this.c = i2;
    }

    static defpackage.adoc b(defpackage.adoc adocVar, int i, defpackage.adoc adocVar2, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = (i2 >>> i3) & 31;
        int i6 = 1 << i4;
        int i7 = 1 << i5;
        if (i6 == i7) {
            defpackage.adoc adocVarB = b(adocVar, i, adocVar2, i2, i3 + 5);
            return new defpackage.adoa(i6, new defpackage.adoc[]{adocVarB}, ((defpackage.adoa) adocVarB).c);
        }
        defpackage.adoc adocVar3 = i4 > i5 ? adocVar : adocVar2;
        if (i4 > i5) {
            adocVar = adocVar2;
        }
        return new defpackage.adoa(i6 | i7, new defpackage.adoc[]{adocVar, adocVar3}, adocVar.a() + adocVar3.a());
    }

    private final int e(int i) {
        return java.lang.Integer.bitCount(this.a & (i - 1));
    }

    @Override // defpackage.adoc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.adoc
    public final defpackage.adoc c(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        int i3 = this.a;
        int i4 = 1 << ((i >>> i2) & 31);
        int iE = e(i4);
        int i5 = i3 & i4;
        defpackage.adoc[] adocVarArr = this.b;
        if (i5 != 0) {
            defpackage.adoc[] adocVarArr2 = (defpackage.adoc[]) java.util.Arrays.copyOf(adocVarArr, adocVarArr.length);
            defpackage.adoc adocVarC = adocVarArr[iE].c(obj, obj2, i, i2 + 5);
            adocVarArr2[iE] = adocVarC;
            return new defpackage.adoa(i3, adocVarArr2, (this.c + adocVarC.a()) - adocVarArr[iE].a());
        }
        int i6 = i3 | i4;
        int length = adocVarArr.length;
        defpackage.adoc[] adocVarArr3 = new defpackage.adoc[length + 1];
        java.lang.System.arraycopy(adocVarArr, 0, adocVarArr3, 0, iE);
        adocVarArr3[iE] = new defpackage.adob(obj, obj2, 0);
        java.lang.System.arraycopy(adocVarArr, iE, adocVarArr3, iE + 1, length - iE);
        return new defpackage.adoa(i6, adocVarArr3, this.c + 1);
    }

    @Override // defpackage.adoc
    public final java.lang.Object d(java.lang.Object obj, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        if ((this.a & i3) == 0) {
            return null;
        }
        return this.b[e(i3)].d(obj, i, i2 + 5);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompressedIndex(");
        sb.append(java.lang.String.format("bitmap=%s ", java.lang.Integer.toBinaryString(this.a)));
        for (defpackage.adoc adocVar : this.b) {
            sb.append(adocVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class l {
    public final java.util.ArrayList a = new java.util.ArrayList();

    public final void a(defpackage.m mVar) {
        float f;
        float f2;
        float f3;
        java.util.ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= mVar.e) {
                break;
            }
            defpackage.n nVar = ((defpackage.n[]) mVar.g.b)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                nVar.e[i2] = 0.0f;
            }
            nVar.e[nVar.c] = 1.0f;
            if (nVar.h == 4) {
                arrayList.add(nVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            defpackage.n nVar2 = (defpackage.n) arrayList.get(i3);
            int i4 = nVar2.b;
            if (i4 != -1) {
                defpackage.j jVar = mVar.c[i4].d;
                int i5 = jVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    defpackage.n nVarD = jVar.d(i6);
                    if (nVarD == null) {
                        f3 = f;
                    } else {
                        float fB = jVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = nVarD.e;
                            fArr[i7] = fArr[i7] + (nVar2.e[i7] * fB);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(nVarD)) {
                            arrayList.add(nVarD);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    nVar2.e[i8] = f2;
                }
            } else {
                f2 = f;
            }
            i3++;
            f = f2;
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        java.lang.String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            defpackage.n nVar = (defpackage.n) arrayList.get(i);
            java.util.Objects.toString(nVar);
            java.lang.String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = nVar.e;
                if (i2 < 6) {
                    strConcat2 = (strConcat2 + fArr[i2]).concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}

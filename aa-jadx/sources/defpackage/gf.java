package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gf {
    private final java.util.List a;
    private final int[] b;
    private final int[] c;
    private final defpackage.ge d;
    private final int e;
    private final int f;

    public gf(defpackage.ge geVar, java.util.List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        java.util.Arrays.fill(iArr, 0);
        java.util.Arrays.fill(iArr2, 0);
        this.d = geVar;
        int iB = geVar.b();
        this.e = iB;
        int iA = geVar.a();
        this.f = iA;
        defpackage.xvn xvnVar = list.isEmpty() ? null : (defpackage.xvn) list.get(0);
        if (xvnVar == null || xvnVar.b != 0 || xvnVar.c != 0) {
            list.add(0, new defpackage.xvn(0, 0, 0, null, null));
        }
        list.add(new defpackage.xvn(iB, iA, 0, null, null));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.xvn xvnVar2 = (defpackage.xvn) it.next();
            for (int i = 0; i < xvnVar2.a; i++) {
                int i2 = xvnVar2.b + i;
                int i3 = xvnVar2.c + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int iA2 = 0;
        for (defpackage.xvn xvnVar3 : this.a) {
            while (iA2 < xvnVar3.b) {
                if (this.b[iA2] == 0) {
                    int size = this.a.size();
                    int iB2 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        defpackage.xvn xvnVar4 = (defpackage.xvn) this.a.get(i5);
                        while (iB2 < xvnVar4.c) {
                            if (this.c[iB2] == 0 && this.d.d(iA2, iB2)) {
                                int i6 = true != this.d.c(iA2, iB2) ? 4 : 8;
                                this.b[iA2] = (iB2 << 4) | i6;
                                this.c[iB2] = i6 | (iA2 << 4);
                                break;
                            }
                            iB2++;
                        }
                        iB2 = xvnVar4.b();
                    }
                }
                iA2++;
            }
            iA2 = xvnVar3.a();
        }
    }

    private static defpackage.gh b(java.util.Collection collection, int i, boolean z) {
        defpackage.gh ghVar;
        java.util.Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                ghVar = null;
                break;
            }
            ghVar = (defpackage.gh) it.next();
            if (ghVar.a == i && ghVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            defpackage.gh ghVar2 = (defpackage.gh) it.next();
            if (z) {
                ghVar2.b--;
            } else {
                ghVar2.b++;
            }
        }
        return ghVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    public final void a(defpackage.gk gkVar) {
        int i;
        int i2;
        int i3;
        defpackage.gd gdVar = new defpackage.gd(gkVar);
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.List list = this.a;
        int i4 = this.f;
        int i5 = this.e;
        int i6 = i5;
        for (int size = list.size() - 1; size >= 0; size--) {
            defpackage.xvn xvnVar = (defpackage.xvn) list.get(size);
            int iA = xvnVar.a();
            int iB = xvnVar.b();
            while (true) {
                if (i6 <= iA) {
                    break;
                }
                int i7 = i6 - 1;
                int i8 = this.b[i7];
                if ((i8 & 12) != 0) {
                    int i9 = i8 >> 4;
                    defpackage.gh ghVarB = b(arrayDeque, i9, false);
                    if (ghVarB != null) {
                        int i10 = (i5 - ghVarB.b) - 1;
                        gdVar.d(i7, i10);
                        if ((i8 & 4) != 0) {
                            this.d.e(i7, i9);
                            gdVar.e(i10);
                        }
                    } else {
                        arrayDeque.add(new defpackage.gh(i7, (i5 - i7) - 1, true));
                    }
                } else {
                    if (gdVar.b != 2 || (i3 = gdVar.c) < i7 || i3 > i6) {
                        gdVar.c();
                        gdVar.c = i7;
                        gdVar.d = 1;
                        gdVar.b = 2;
                    } else {
                        gdVar.d++;
                        gdVar.c = i7;
                    }
                    i5--;
                }
                i6 = i7;
            }
            while (i4 > iB) {
                i4--;
                int i11 = this.c[i4];
                if ((i11 & 12) != 0) {
                    int i12 = i11 >> 4;
                    defpackage.gh ghVarB2 = b(arrayDeque, i12, true);
                    if (ghVarB2 == null) {
                        arrayDeque.add(new defpackage.gh(i4, i5 - i6, false));
                    } else {
                        gdVar.d((i5 - ghVarB2.b) - 1, i6);
                        if ((i11 & 4) != 0) {
                            this.d.e(i12, i4);
                            gdVar.e(i6);
                        }
                    }
                } else {
                    if (gdVar.b != 1 || i6 < (i2 = gdVar.c)) {
                        gdVar.c();
                        gdVar.c = i6;
                        gdVar.d = 1;
                        gdVar.b = 1;
                    } else {
                        int i13 = gdVar.d;
                        if (i6 <= i2 + i13) {
                            gdVar.d = i13 + 1;
                            gdVar.c = java.lang.Math.min(i6, i2);
                        } else {
                            gdVar.c();
                            gdVar.c = i6;
                            gdVar.d = 1;
                            gdVar.b = 1;
                        }
                    }
                    i5++;
                }
            }
            i6 = xvnVar.b;
            i4 = xvnVar.c;
            int i14 = i4;
            int i15 = i6;
            for (i = 0; i < xvnVar.a; i++) {
                if ((this.b[i15] & 15) == 2) {
                    this.d.e(i15, i14);
                    gdVar.e(i15);
                }
                i15++;
                i14++;
            }
        }
        gdVar.c();
    }
}

package android.support.v7.widget;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends defpackage.mc implements defpackage.mm {
    private int[] J;
    defpackage.nc[] a;
    public defpackage.lr b;
    defpackage.lr c;
    private int i;
    private int j;
    private int k;
    private final defpackage.ld l;
    private java.util.BitSet m;
    private boolean o;
    private boolean p;
    private android.support.v7.widget.StaggeredGridLayoutManager.SavedState q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    defpackage.sd h = new defpackage.sd(null);
    private int n = 2;
    private final android.graphics.Rect G = new android.graphics.Rect();
    private final defpackage.na H = new defpackage.na(this);
    private boolean I = true;
    private final java.lang.Runnable K = new defpackage.ku(this, 6);

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        defpackage.mb mbVarAB = aB(context, attributeSet, i, i2);
        int i3 = mbVarAB.a;
        if (i3 != 0 && i3 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        W(null);
        if (i3 != this.j) {
            this.j = i3;
            defpackage.lr lrVar = this.b;
            this.b = this.c;
            this.c = lrVar;
            aV();
        }
        int i4 = mbVarAB.b;
        W(null);
        if (i4 != this.i) {
            this.h.a();
            aV();
            this.i = i4;
            this.m = new java.util.BitSet(i4);
            this.a = new defpackage.nc[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new defpackage.nc(this, i5);
            }
            aV();
        }
        J(mbVarAB.c);
        this.l = new defpackage.ld();
        this.b = defpackage.lr.p(this, this.j);
        this.c = defpackage.lr.p(this, 1 - this.j);
    }

    private final int N(int i) {
        if (av() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int Q(defpackage.mo moVar) {
        if (av() == 0) {
            return 0;
        }
        return defpackage.ca.m(moVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    private final int R(defpackage.mo moVar) {
        if (av() == 0) {
            return 0;
        }
        return defpackage.ca.n(moVar, this.b, s(!this.I), m(!this.I), this, this.I, this.e);
    }

    private final int S(defpackage.mo moVar) {
        if (av() == 0) {
            return 0;
        }
        return defpackage.ca.o(moVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    private final int T(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.j != 1 && M()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.j != 1 && M()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.j == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.j == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    private final int V(defpackage.mh mhVar, defpackage.ld ldVar, defpackage.mo moVar) {
        int i;
        defpackage.nc ncVar;
        ?? r8;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        this.m.set(0, this.i, true);
        defpackage.ld ldVar2 = this.l;
        int i7 = ldVar2.i ? ldVar.e == 1 ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : Integer.MIN_VALUE : ldVar.e == 1 ? ldVar.g + ldVar.b : ldVar.f - ldVar.b;
        int i8 = ldVar.e;
        for (int i9 = 0; i9 < this.i; i9++) {
            if (!this.a[i9].a.isEmpty()) {
                bG(this.a[i9], i8, i7);
            }
        }
        boolean z = this.e;
        defpackage.lr lrVar = this.b;
        int iF2 = z ? lrVar.f() : lrVar.j();
        boolean z2 = false;
        while (ldVar.a(moVar) && (ldVar2.i || !this.m.isEmpty())) {
            android.view.View viewN = mhVar.n(ldVar.c);
            ldVar.c += ldVar.d;
            defpackage.nb nbVar = (defpackage.nb) viewN.getLayoutParams();
            int iEX = nbVar.eX();
            java.lang.Object obj = this.h.b;
            if (obj != null) {
                int[] iArr = (int[]) obj;
                if (iEX >= iArr.length) {
                    i = -1;
                } else {
                    i = iArr[iEX];
                }
            } else {
                i = -1;
            }
            int i10 = i == -1 ? i6 : i5;
            if (i10 != 0) {
                boolean z3 = nbVar.b;
                boolean zBH = bH(ldVar.e);
                int i11 = this.i;
                if (zBH) {
                    i4 = i11 - 1;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i2 = i6;
                    i3 = i11;
                    i4 = i5;
                }
                int i12 = ldVar.e;
                defpackage.lr lrVar2 = this.b;
                defpackage.nc ncVar2 = null;
                if (i12 == i6) {
                    int iJ2 = lrVar2.j();
                    int i13 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                    while (i4 != i3) {
                        defpackage.nc ncVar3 = this.a[i4];
                        int iD = ncVar3.d(iJ2);
                        int i14 = iD < i13 ? iD : i13;
                        if (iD < i13) {
                            ncVar2 = ncVar3;
                        }
                        i4 += i2;
                        i13 = i14;
                    }
                } else {
                    int iF3 = lrVar2.f();
                    int i15 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        defpackage.nc ncVar4 = this.a[i4];
                        int iF4 = ncVar4.f(iF3);
                        int i16 = iF4 > i15 ? iF4 : i15;
                        if (iF4 > i15) {
                            ncVar2 = ncVar4;
                        }
                        i4 += i2;
                        i15 = i16;
                    }
                }
                ncVar = ncVar2;
                defpackage.sd sdVar = this.h;
                sdVar.b(iEX);
                ((int[]) sdVar.b)[iEX] = ncVar.e;
            } else {
                ncVar = this.a[i];
            }
            nbVar.a = ncVar;
            if (ldVar.e == 1) {
                r8 = 0;
                super.aF(viewN, -1, false);
            } else {
                r8 = 0;
                super.aF(viewN, 0, false);
            }
            boolean z4 = nbVar.b;
            if (this.j == 1) {
                bI(viewN, aw(this.k, this.A, r8, nbVar.width, r8), aw(this.D, this.B, getPaddingTop() + getPaddingBottom(), nbVar.height, true));
            } else {
                bI(viewN, aw(this.C, this.A, getPaddingLeft() + getPaddingRight(), nbVar.width, true), aw(this.k, this.B, 0, nbVar.height, false));
            }
            if (ldVar.e == 1) {
                boolean z5 = nbVar.b;
                iB = ncVar.d(iF2);
                iF = this.b.b(viewN) + iB;
                if (i10 != 0) {
                    boolean z6 = nbVar.b;
                }
            } else {
                boolean z7 = nbVar.b;
                iF = ncVar.f(iF2);
                iB = iF - this.b.b(viewN);
                if (i10 != 0) {
                    boolean z8 = nbVar.b;
                }
            }
            boolean z9 = nbVar.b;
            if (ldVar.e == 1) {
                defpackage.nc ncVar5 = nbVar.a;
                defpackage.nb nbVarN = defpackage.nc.n(viewN);
                nbVarN.a = ncVar5;
                java.util.ArrayList arrayList = ncVar5.a;
                arrayList.add(viewN);
                ncVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ncVar5.b = Integer.MIN_VALUE;
                }
                if (nbVarN.eZ() || nbVarN.eY()) {
                    ncVar5.d += ncVar5.f.b.b(viewN);
                }
            } else {
                defpackage.nc ncVar6 = nbVar.a;
                defpackage.nb nbVarN2 = defpackage.nc.n(viewN);
                nbVarN2.a = ncVar6;
                java.util.ArrayList arrayList2 = ncVar6.a;
                arrayList2.add(0, viewN);
                ncVar6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ncVar6.c = Integer.MIN_VALUE;
                }
                if (nbVarN2.eZ() || nbVarN2.eY()) {
                    ncVar6.d += ncVar6.f.b.b(viewN);
                }
            }
            if (M() && this.j == 1) {
                boolean z10 = nbVar.b;
                iB2 = this.c.f() - (((this.i - 1) - ncVar.e) * this.k);
                iJ = iB2 - this.c.b(viewN);
            } else {
                boolean z11 = nbVar.b;
                iJ = this.c.j() + (ncVar.e * this.k);
                iB2 = this.c.b(viewN) + iJ;
            }
            if (this.j == 1) {
                br(viewN, iJ, iB, iB2, iF);
            } else {
                br(viewN, iB, iJ, iF, iB2);
            }
            boolean z12 = nbVar.b;
            bG(ncVar, ldVar2.e, i7);
            al(mhVar, ldVar2);
            if (ldVar2.h && viewN.hasFocusable()) {
                boolean z13 = nbVar.b;
                this.m.set(ncVar.e, false);
                i5 = 0;
                i6 = 1;
                z2 = true;
            } else {
                i6 = 1;
                z2 = true;
                i5 = 0;
            }
        }
        if (!z2) {
            al(mhVar, ldVar2);
        }
        int i17 = ldVar2.e;
        defpackage.lr lrVar3 = this.b;
        int iJ3 = i17 == -1 ? this.b.j() - Y(lrVar3.j()) : X(lrVar3.f()) - this.b.f();
        if (iJ3 > 0) {
            return java.lang.Math.min(ldVar.b, iJ3);
        }
        return 0;
    }

    private final int X(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int Y(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final android.view.View aa(android.view.View view, int i, defpackage.mh mhVar, defpackage.mo moVar) {
        defpackage.nc ncVar;
        android.view.View viewG;
        at();
        int iT = T(i);
        if (iT == Integer.MIN_VALUE) {
            return null;
        }
        if (view != null) {
            defpackage.nb nbVar = (defpackage.nb) view.getLayoutParams();
            boolean z = nbVar.b;
            ncVar = nbVar.a;
        } else {
            ncVar = null;
        }
        int i2 = iT == 1 ? i() : c();
        bF(i2, moVar);
        bE(iT);
        defpackage.ld ldVar = this.l;
        ldVar.c = ldVar.d + i2;
        ldVar.b = (int) (this.b.k() * 0.33333334f);
        ldVar.h = true;
        ldVar.a = false;
        V(mhVar, ldVar, moVar);
        this.o = this.e;
        if (view != null && (viewG = ncVar.g(i2, iT)) != null && viewG != view) {
            return viewG;
        }
        if (bH(iT)) {
            for (int i3 = this.i - 1; i3 >= 0; i3--) {
                android.view.View viewG2 = this.a[i3].g(i2, iT);
                if (viewG2 != null && viewG2 != view) {
                    return viewG2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.i; i4++) {
                android.view.View viewG3 = this.a[i4].g(i2, iT);
                if (viewG3 != null && viewG3 != view) {
                    return viewG3;
                }
            }
        }
        boolean z2 = (this.d ^ true) == (iT == -1);
        if (view != null) {
            android.view.View viewU = U(z2 ? ncVar.a() : ncVar.b());
            if (viewU != null && viewU != view) {
                return viewU;
            }
        }
        if (bH(iT)) {
            for (int i5 = this.i - 1; i5 >= 0; i5--) {
                if (view == null || i5 != ncVar.e) {
                    defpackage.nc[] ncVarArr = this.a;
                    android.view.View viewU2 = U(z2 ? ncVarArr[i5].a() : ncVarArr[i5].b());
                    if (viewU2 != null && viewU2 != view) {
                        return viewU2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.i; i6++) {
                if (view == null || i6 != ncVar.e) {
                    defpackage.nc[] ncVarArr2 = this.a;
                    android.view.View viewU3 = U(z2 ? ncVarArr2[i6].a() : ncVarArr2[i6].b());
                    if (viewU3 != null && viewU3 != view) {
                        return viewU3;
                    }
                }
            }
        }
        return null;
    }

    private final void ac(defpackage.mh mhVar, defpackage.mo moVar, boolean z) {
        int iF;
        int i;
        int iX = X(Integer.MIN_VALUE);
        if (iX != Integer.MIN_VALUE && (iF = this.b.f() - iX) > 0) {
            int i2 = -l(-iF, mhVar, moVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ae(defpackage.mh mhVar, defpackage.mo moVar, boolean z) {
        int iJ;
        int iY = Y(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        if (iY != Integer.MAX_VALUE && (iJ = iY - this.b.j()) > 0) {
            int iL = iJ - l(iJ, mhVar, moVar);
            if (!z || iL <= 0) {
                return;
            }
            this.b.n(-iL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[LOOP:0: B:22:0x0037->B:26:0x0046, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067 A[LOOP:1: B:31:0x0058->B:35:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x004a A[EDGE_INSN: B:60:0x004a->B:28:0x004a BREAK  A[LOOP:0: B:22:0x0037->B:26:0x0046], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x006b A[EDGE_INSN: B:61:0x006b->B:37:0x006b BREAK  A[LOOP:1: B:31:0x0058->B:35:0x0067], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    private final void af(int i, int i2, int i3) {
        int i4;
        int i5;
        defpackage.sd sdVar;
        java.lang.Object obj;
        int i6;
        ?? r5;
        int size;
        android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size2;
        int i7;
        int i8;
        int i9 = this.e ? i() : c();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            sdVar = this.h;
            obj = sdVar.b;
            if (obj != null && i5 < ((int[]) obj).length) {
                r5 = sdVar.a;
                if (r5 == 0) {
                    i8 = -1;
                } else {
                    size = r5.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sdVar.a.get(size);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        sdVar.a.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size2 = sdVar.a.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            i7 = -1;
                            break;
                        } else if (((android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sdVar.a.get(i7)).a >= i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sdVar.a.get(i7);
                        sdVar.a.remove(i7);
                        i8 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a;
                    } else {
                        i8 = -1;
                    }
                }
                if (i8 == -1) {
                    int[] iArr = (int[]) sdVar.b;
                    java.util.Arrays.fill(iArr, i5, iArr.length, -1);
                    int length = ((int[]) sdVar.b).length;
                } else {
                    java.util.Arrays.fill((int[]) sdVar.b, i5, java.lang.Math.min(i8 + 1, ((int[]) sdVar.b).length), -1);
                }
            }
            if (i3 != 1) {
                this.h.c(i, i2);
            } else if (i3 != 2) {
                this.h.d(i, i2);
            } else if (i3 == 8) {
                this.h.d(i, 1);
                this.h.c(i2, 1);
            }
            if (i4 <= i9) {
                return;
            }
            if (this.e) {
                i6 = c();
            } else {
                i6 = i();
            }
            if (i5 <= i6) {
                aV();
            }
        }
        i4 = i + i2;
        i5 = i;
        sdVar = this.h;
        obj = sdVar.b;
        if (obj != null) {
            r5 = sdVar.a;
            if (r5 == 0) {
                i8 = -1;
            } else {
                size = r5.size() - 1;
                while (true) {
                    if (size >= 0) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sdVar.a.get(size);
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    sdVar.a.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size2 = sdVar.a.size();
                i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        i7 = -1;
                        break;
                    } else {
                        if (((android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sdVar.a.get(i7)).a >= i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sdVar.a.get(i7);
                    sdVar.a.remove(i7);
                    i8 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.a;
                } else {
                    i8 = -1;
                }
            }
            if (i8 == -1) {
                int[] iArr2 = (int[]) sdVar.b;
                java.util.Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) sdVar.b).length;
            } else {
                java.util.Arrays.fill((int[]) sdVar.b, i5, java.lang.Math.min(i8 + 1, ((int[]) sdVar.b).length), -1);
            }
        }
        if (i3 != 1) {
            this.h.c(i, i2);
        } else if (i3 != 2) {
            this.h.d(i, i2);
        } else if (i3 == 8) {
            this.h.d(i, 1);
            this.h.c(i2, 1);
        }
        if (i4 <= i9) {
            return;
        }
        if (this.e) {
            i6 = c();
        } else {
            i6 = i();
        }
        if (i5 <= i6) {
            aV();
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:234:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:246:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01e9 A[SYNTHETIC] */
    private final void aj(defpackage.mh mhVar, defpackage.mo moVar, boolean z) {
        boolean z2;
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState;
        defpackage.nc[] ncVarArr;
        int iAv;
        int i;
        int iBl;
        int iBl2;
        int iAv2;
        int i2;
        defpackage.na naVar = this.H;
        if (!(this.q == null && this.f == -1) && moVar.a() == 0) {
            aQ(mhVar);
            naVar.a();
            return;
        }
        boolean z3 = (naVar.e && this.f == -1 && this.q == null) ? false : true;
        if (z3) {
            naVar.a();
            android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState2 = this.q;
            if (savedState2 != null) {
                int i3 = savedState2.c;
                if (i3 > 0) {
                    if (i3 == this.i) {
                        for (int i4 = 0; i4 < this.i; i4++) {
                            this.a[i4].j();
                            android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState3 = this.q;
                            int iF = savedState3.d[i4];
                            if (iF != Integer.MIN_VALUE) {
                                boolean z4 = savedState3.i;
                                defpackage.lr lrVar = this.b;
                                iF += z4 ? lrVar.f() : lrVar.j();
                            }
                            this.a[i4].l(iF);
                        }
                    } else {
                        savedState2.b();
                        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState4 = this.q;
                        savedState4.a = savedState4.b;
                    }
                }
                android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState5 = this.q;
                this.p = savedState5.j;
                J(savedState5.h);
                at();
                android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState6 = this.q;
                int i5 = savedState6.a;
                if (i5 != -1) {
                    this.f = i5;
                    naVar.c = savedState6.i;
                } else {
                    naVar.c = this.e;
                }
                if (savedState6.e > 1) {
                    defpackage.sd sdVar = this.h;
                    sdVar.b = savedState6.f;
                    sdVar.a = savedState6.g;
                }
            } else {
                at();
                naVar.c = this.e;
            }
            if (moVar.g || (i2 = this.f) == -1) {
                if (this.o) {
                    int iA = moVar.a();
                    iAv2 = av() - 1;
                    while (true) {
                        if (iAv2 < 0) {
                            iBl2 = 0;
                            break;
                        }
                        iBl2 = bl(aD(iAv2));
                        if (iBl2 < 0 && iBl2 < iA) {
                            break;
                        } else {
                            iAv2--;
                        }
                    }
                } else {
                    int iA2 = moVar.a();
                    iAv = av();
                    i = 0;
                    while (true) {
                        if (i >= iAv) {
                            iBl2 = 0;
                            break;
                        }
                        iBl = bl(aD(i));
                        if (iBl < 0 && iBl < iA2) {
                            iBl2 = iBl;
                            break;
                        }
                        i++;
                    }
                }
                naVar.a = iBl2;
                naVar.b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= moVar.a()) {
                this.f = -1;
                this.g = Integer.MIN_VALUE;
                if (this.o) {
                    int iA3 = moVar.a();
                    iAv2 = av() - 1;
                    while (true) {
                        if (iAv2 < 0) {
                            iBl2 = 0;
                            break;
                        } else {
                            iBl2 = bl(aD(iAv2));
                            if (iBl2 < 0) {
                            }
                            iAv2--;
                        }
                    }
                } else {
                    int iA4 = moVar.a();
                    iAv = av();
                    i = 0;
                    while (true) {
                        if (i >= iAv) {
                            iBl2 = 0;
                            break;
                        } else {
                            iBl = bl(aD(i));
                            if (iBl < 0) {
                            }
                            i++;
                        }
                    }
                }
                naVar.a = iBl2;
                naVar.b = Integer.MIN_VALUE;
            } else {
                android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState7 = this.q;
                if (savedState7 == null || savedState7.a == -1 || savedState7.c <= 0) {
                    android.view.View viewU = U(this.f);
                    if (viewU != null) {
                        naVar.a = this.e ? i() : c();
                        if (this.g != Integer.MIN_VALUE) {
                            boolean z5 = naVar.c;
                            defpackage.lr lrVar2 = this.b;
                            if (z5) {
                                naVar.b = (lrVar2.f() - this.g) - this.b.a(viewU);
                            } else {
                                naVar.b = (lrVar2.j() + this.g) - this.b.d(viewU);
                            }
                        } else if (this.b.b(viewU) > this.b.k()) {
                            boolean z6 = naVar.c;
                            defpackage.lr lrVar3 = this.b;
                            naVar.b = z6 ? lrVar3.f() : lrVar3.j();
                        } else {
                            int iD = this.b.d(viewU) - this.b.j();
                            if (iD < 0) {
                                naVar.b = -iD;
                            } else {
                                int iF2 = this.b.f() - this.b.a(viewU);
                                if (iF2 < 0) {
                                    naVar.b = iF2;
                                } else {
                                    naVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f;
                        naVar.a = i6;
                        int i7 = this.g;
                        if (i7 == Integer.MIN_VALUE) {
                            boolean z7 = N(i6) == 1;
                            naVar.c = z7;
                            naVar.b = z7 ? naVar.g.b.f() : naVar.g.b.j();
                        } else if (naVar.c) {
                            naVar.b = naVar.g.b.f() - i7;
                        } else {
                            naVar.b = naVar.g.b.j() + i7;
                        }
                        naVar.d = true;
                    }
                } else {
                    naVar.b = Integer.MIN_VALUE;
                    naVar.a = this.f;
                }
            }
            naVar.e = true;
        }
        if (this.q == null && this.f == -1 && (naVar.c != this.o || M() != this.p)) {
            this.h.a();
            naVar.d = true;
        }
        if (av() > 0 && ((savedState = this.q) == null || savedState.c <= 0)) {
            if (naVar.d) {
                for (int i8 = 0; i8 < this.i; i8++) {
                    this.a[i8].j();
                    int i9 = naVar.b;
                    if (i9 != Integer.MIN_VALUE) {
                        this.a[i8].l(i9);
                    }
                }
            } else if (z3 || naVar.f == null) {
                int i10 = 0;
                while (true) {
                    int i11 = this.i;
                    ncVarArr = this.a;
                    if (i10 >= i11) {
                        break;
                    }
                    defpackage.nc ncVar = ncVarArr[i10];
                    boolean z8 = this.e;
                    int i12 = naVar.b;
                    int iD2 = z8 ? ncVar.d(Integer.MIN_VALUE) : ncVar.f(Integer.MIN_VALUE);
                    ncVar.j();
                    if (iD2 != Integer.MIN_VALUE && ((!z8 || iD2 >= ncVar.f.b.f()) && (z8 || iD2 <= ncVar.f.b.j()))) {
                        if (i12 != Integer.MIN_VALUE) {
                            iD2 += i12;
                        }
                        ncVar.c = iD2;
                        ncVar.b = iD2;
                    }
                    i10++;
                }
                int length = ncVarArr.length;
                int[] iArr = naVar.f;
                if (iArr == null || iArr.length < length) {
                    naVar.f = new int[naVar.g.a.length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    naVar.f[i13] = ncVarArr[i13].f(Integer.MIN_VALUE);
                }
            } else {
                for (int i14 = 0; i14 < this.i; i14++) {
                    defpackage.nc ncVar2 = this.a[i14];
                    ncVar2.j();
                    ncVar2.l(naVar.f[i14]);
                }
            }
        }
        aH(mhVar);
        defpackage.ld ldVar = this.l;
        ldVar.a = false;
        K(this.c.k());
        bF(naVar.a, moVar);
        if (naVar.c) {
            bE(-1);
            V(mhVar, ldVar, moVar);
            bE(1);
            ldVar.c = naVar.a + ldVar.d;
            V(mhVar, ldVar, moVar);
        } else {
            bE(1);
            V(mhVar, ldVar, moVar);
            bE(-1);
            ldVar.c = naVar.a + ldVar.d;
            V(mhVar, ldVar, moVar);
        }
        if (this.c.h() != 1073741824) {
            int iAv3 = av();
            float fMax = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            for (int i15 = 0; i15 < iAv3; i15++) {
                android.view.View viewAD = aD(i15);
                float fB = this.c.b(viewAD);
                if (fB >= fMax) {
                    fMax = java.lang.Math.max(fMax, fB);
                }
            }
            int i16 = this.k;
            int iRound = java.lang.Math.round(fMax * this.i);
            if (this.c.h() == Integer.MIN_VALUE) {
                iRound = java.lang.Math.min(iRound, this.c.k());
            }
            K(iRound);
            if (this.k != i16) {
                for (int i17 = 0; i17 < iAv3; i17++) {
                    android.view.View viewAD2 = aD(i17);
                    defpackage.nb nbVar = (defpackage.nb) viewAD2.getLayoutParams();
                    boolean z9 = nbVar.b;
                    if (M() && this.j == 1) {
                        int i18 = -((this.i - 1) - nbVar.a.e);
                        viewAD2.offsetLeftAndRight((this.k * i18) - (i18 * i16));
                    } else {
                        int i19 = nbVar.a.e;
                        int i20 = this.j;
                        int i21 = (this.k * i19) - (i19 * i16);
                        if (i20 == 1) {
                            viewAD2.offsetLeftAndRight(i21);
                        } else {
                            viewAD2.offsetTopAndBottom(i21);
                        }
                    }
                }
            }
        }
        if (av() > 0) {
            if (this.e) {
                ac(mhVar, moVar, true);
                ae(mhVar, moVar, false);
            } else {
                ae(mhVar, moVar, true);
                ac(mhVar, moVar, false);
            }
        }
        if (z && !moVar.g && this.n != 0 && av() > 0 && t() != null) {
            by(this.K);
            z2 = L();
        }
        if (moVar.g) {
            naVar.a();
        }
        this.o = naVar.c;
        this.p = M();
        if (z2) {
            naVar.a();
            aj(mhVar, moVar, false);
        }
    }

    private final void al(defpackage.mh mhVar, defpackage.ld ldVar) {
        int iMin;
        if (!ldVar.a || ldVar.i) {
            return;
        }
        if (ldVar.b == 0) {
            if (ldVar.e == -1) {
                ap(mhVar, ldVar.g);
                return;
            } else {
                aq(mhVar, ldVar.f);
                return;
            }
        }
        int i = 1;
        if (ldVar.e == -1) {
            int i2 = ldVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            ap(mhVar, i3 < 0 ? ldVar.g : ldVar.g - java.lang.Math.min(i3, ldVar.b));
            return;
        }
        int i4 = ldVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - ldVar.g;
        if (i5 < 0) {
            iMin = ldVar.f;
        } else {
            iMin = java.lang.Math.min(i5, ldVar.b) + ldVar.f;
        }
        aq(mhVar, iMin);
    }

    private final void ap(defpackage.mh mhVar, int i) {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            }
            android.view.View viewAD = aD(iAv);
            if (this.b.d(viewAD) < i || this.b.m(viewAD) < i) {
                return;
            }
            defpackage.nb nbVar = (defpackage.nb) viewAD.getLayoutParams();
            boolean z = nbVar.b;
            if (nbVar.a.a.size() == 1) {
                return;
            }
            defpackage.nc ncVar = nbVar.a;
            java.util.ArrayList arrayList = ncVar.a;
            int size = arrayList.size();
            android.view.View view = (android.view.View) arrayList.remove(size - 1);
            defpackage.nb nbVarN = defpackage.nc.n(view);
            nbVarN.a = null;
            if (nbVarN.eZ() || nbVarN.eY()) {
                ncVar.d -= ncVar.f.b.b(view);
            }
            if (size == 1) {
                ncVar.b = Integer.MIN_VALUE;
            }
            ncVar.c = Integer.MIN_VALUE;
            aS(viewAD, mhVar);
        }
    }

    private final void aq(defpackage.mh mhVar, int i) {
        while (av() > 0) {
            android.view.View viewAD = aD(0);
            if (this.b.a(viewAD) > i || this.b.l(viewAD) > i) {
                return;
            }
            defpackage.nb nbVar = (defpackage.nb) viewAD.getLayoutParams();
            boolean z = nbVar.b;
            if (nbVar.a.a.size() == 1) {
                return;
            }
            defpackage.nc ncVar = nbVar.a;
            java.util.ArrayList arrayList = ncVar.a;
            android.view.View view = (android.view.View) arrayList.remove(0);
            defpackage.nb nbVarN = defpackage.nc.n(view);
            nbVarN.a = null;
            if (arrayList.size() == 0) {
                ncVar.c = Integer.MIN_VALUE;
            }
            if (nbVarN.eZ() || nbVarN.eY()) {
                ncVar.d -= ncVar.f.b.b(view);
            }
            ncVar.b = Integer.MIN_VALUE;
            aS(viewAD, mhVar);
        }
    }

    private final void at() {
        this.e = (this.j == 1 || !M()) ? this.d : !this.d;
    }

    private final void bE(int i) {
        defpackage.ld ldVar = this.l;
        ldVar.e = i;
        ldVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bF(int i, defpackage.mo moVar) {
        int iK;
        int iK2;
        int i2;
        defpackage.ld ldVar = this.l;
        boolean z = false;
        ldVar.b = 0;
        ldVar.c = i;
        if (!be() || (i2 = moVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            boolean z2 = this.e;
            boolean z3 = i2 < i;
            defpackage.lr lrVar = this.b;
            if (z2 == z3) {
                iK = lrVar.k();
                iK2 = 0;
            } else {
                iK2 = lrVar.k();
                iK = 0;
            }
        }
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.i) {
            ldVar.g = this.b.e() + iK;
            ldVar.f = -iK2;
        } else {
            ldVar.f = this.b.j() - iK2;
            ldVar.g = this.b.f() + iK;
        }
        ldVar.h = false;
        ldVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        ldVar.i = z;
    }

    private final void bG(defpackage.nc ncVar, int i, int i2) {
        int i3 = ncVar.d;
        if (i == -1) {
            if (ncVar.e() + i3 <= i2) {
                this.m.set(ncVar.e, false);
            }
        } else if (ncVar.c() - i3 >= i2) {
            this.m.set(ncVar.e, false);
        }
    }

    private final boolean bH(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        boolean z2 = this.e;
        if (i2 == 0) {
            return z != z2;
        }
        return (z == z2) == M();
    }

    private final void bI(android.view.View view, int i, int i2) {
        android.graphics.Rect rect = this.G;
        aG(view, rect);
        defpackage.nb nbVar = (defpackage.nb) view.getLayoutParams();
        int iBJ = bJ(i, nbVar.leftMargin + rect.left, nbVar.rightMargin + rect.right);
        int iBJ2 = bJ(i2, nbVar.topMargin + rect.top, nbVar.bottomMargin + rect.bottom);
        if (bg(view, iBJ, iBJ2, nbVar)) {
            view.measure(iBJ, iBJ2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    private static final int bJ(int i, int i2, int i3) {
        int mode;
        if (i2 != 0) {
            mode = android.view.View.MeasureSpec.getMode(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    mode = 1073741824;
                }
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        if (i3 != 0) {
            i2 = 0;
            mode = android.view.View.MeasureSpec.getMode(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    mode = 1073741824;
                }
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    @Override // defpackage.mc
    public final void A(int i, int i2) {
        af(i, i2, 8);
    }

    @Override // defpackage.mc
    public final void B(int i, int i2) {
        af(i, i2, 2);
    }

    @Override // defpackage.mc
    public final void C(int i, int i2) {
        af(i, i2, 4);
    }

    @Override // defpackage.mc
    public final int D(defpackage.mo moVar) {
        return Q(moVar);
    }

    @Override // defpackage.mc
    public final int E(defpackage.mo moVar) {
        return R(moVar);
    }

    @Override // defpackage.mc
    public final int F(defpackage.mo moVar) {
        return S(moVar);
    }

    @Override // defpackage.mc
    public final int G(defpackage.mo moVar) {
        return Q(moVar);
    }

    @Override // defpackage.mc
    public final int H(defpackage.mo moVar) {
        return R(moVar);
    }

    @Override // defpackage.mc
    public final int I(defpackage.mo moVar) {
        return S(moVar);
    }

    public final void J(boolean z) {
        W(null);
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.d = z;
        aV();
    }

    final void K(int i) {
        this.k = i / this.i;
        this.c.h();
    }

    public final boolean L() {
        int iC;
        if (av() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || t() == null) {
            return false;
        }
        this.h.a();
        aW();
        aV();
        return true;
    }

    final boolean M() {
        return ay() == 1;
    }

    @Override // defpackage.mm
    public final android.graphics.PointF O(int i) {
        int iN = N(i);
        android.graphics.PointF pointF = new android.graphics.PointF();
        if (iN == 0) {
            return null;
        }
        float f = iN;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            return pointF;
        }
        pointF.x = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        pointF.y = f;
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.mc
    public final android.os.Parcelable P() {
        int iF;
        int iJ;
        java.lang.Object obj;
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = this.q;
        if (savedState != null) {
            return new android.support.v7.widget.StaggeredGridLayoutManager.SavedState(savedState);
        }
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState2 = new android.support.v7.widget.StaggeredGridLayoutManager.SavedState();
        savedState2.h = this.d;
        savedState2.i = this.o;
        savedState2.j = this.p;
        defpackage.sd sdVar = this.h;
        if (sdVar == null || (obj = sdVar.b) == null) {
            savedState2.e = 0;
        } else {
            savedState2.f = (int[]) obj;
            savedState2.e = savedState2.f.length;
            savedState2.g = sdVar.a;
        }
        if (av() <= 0) {
            savedState2.a = -1;
            savedState2.b = -1;
            savedState2.c = 0;
            return savedState2;
        }
        savedState2.a = this.o ? i() : c();
        android.view.View viewM = this.e ? m(true) : s(true);
        savedState2.b = viewM != null ? bl(viewM) : -1;
        int i = this.i;
        savedState2.c = i;
        savedState2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            boolean z = this.o;
            defpackage.nc[] ncVarArr = this.a;
            if (z) {
                iF = ncVarArr[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = ncVarArr[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            savedState2.d[i2] = iF;
        }
        return savedState2;
    }

    @Override // defpackage.mc
    public final void W(java.lang.String str) {
        if (this.q == null) {
            super.W(str);
        }
    }

    @Override // defpackage.mc
    public final void Z(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (av() > 0) {
            android.view.View viewS = s(false);
            android.view.View viewM = m(false);
            if (viewS == null || viewM == null) {
                return;
            }
            int iBl = bl(viewS);
            int iBl2 = bl(viewM);
            if (iBl < iBl2) {
                accessibilityEvent.setFromIndex(iBl);
                accessibilityEvent.setToIndex(iBl2);
            } else {
                accessibilityEvent.setFromIndex(iBl2);
                accessibilityEvent.setToIndex(iBl);
            }
        }
    }

    @Override // defpackage.mc
    public final void aK(int i) {
        super.aK(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.mc
    public final void aL(int i) {
        super.aL(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.mc
    public final void aO(int i) {
        if (i == 0) {
            L();
        }
    }

    @Override // defpackage.mc
    public final void ab(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.support.v7.widget.StaggeredGridLayoutManager.SavedState) {
            android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = (android.support.v7.widget.StaggeredGridLayoutManager.SavedState) parcelable;
            this.q = savedState;
            if (this.f != -1) {
                savedState.a();
                this.q.b();
            }
            aV();
        }
    }

    @Override // defpackage.mc
    public final void ad(int i) {
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aV();
    }

    @Override // defpackage.mc
    public final boolean ag() {
        return this.j == 0;
    }

    @Override // defpackage.mc
    public final boolean ah() {
        return this.j == 1;
    }

    @Override // defpackage.mc
    public final boolean ai() {
        return this.n != 0;
    }

    @Override // defpackage.mc
    public final boolean ak() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    @Override // defpackage.mc
    public final void an(int i, int i2, defpackage.mo moVar, defpackage.kz kzVar) {
        int iD;
        if (1 == this.j) {
            i = i2;
        }
        if (av() == 0 || i == 0) {
            return;
        }
        x(i, moVar);
        int[] iArr = this.J;
        if (iArr != null) {
            if (iArr.length < this.i) {
                this.J = new int[this.i];
            }
        } else {
            this.J = new int[this.i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.i; i4++) {
            defpackage.ld ldVar = this.l;
            if (ldVar.d == -1) {
                int i5 = ldVar.f;
                iD = i5 - this.a[i4].f(i5);
            } else {
                iD = this.a[i4].d(ldVar.g) - ldVar.g;
            }
            if (iD >= 0) {
                this.J[i3] = iD;
                i3++;
            }
        }
        java.util.Arrays.sort(this.J, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            defpackage.ld ldVar2 = this.l;
            if (!ldVar2.a(moVar)) {
                return;
            }
            kzVar.a(ldVar2.c, this.J[i6]);
            ldVar2.c += ldVar2.d;
        }
    }

    @Override // defpackage.mc
    public final void ar(android.support.v7.widget.RecyclerView recyclerView) {
        by(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.mc
    public final void as(android.support.v7.widget.RecyclerView recyclerView, int i) {
        defpackage.mn mnVar = new defpackage.mn(recyclerView.getContext());
        mnVar.b = i;
        bc(mnVar);
    }

    @Override // defpackage.mc
    public final void bt() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (av() == 0) {
            return 0;
        }
        return bl(aD(0));
    }

    @Override // defpackage.mc
    public final int d(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        return l(i, mhVar, moVar);
    }

    @Override // defpackage.mc
    public final int e(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        return l(i, mhVar, moVar);
    }

    @Override // defpackage.mc
    public final defpackage.md f() {
        return this.j == 0 ? new defpackage.nb(-2, -1) : new defpackage.nb(-1, -2);
    }

    @Override // defpackage.mc
    public final int fa(defpackage.mh mhVar, defpackage.mo moVar) {
        if (this.j == 1) {
            return java.lang.Math.min(this.i, moVar.a());
        }
        return -1;
    }

    @Override // defpackage.mc
    public final int fb(defpackage.mh mhVar, defpackage.mo moVar) {
        if (this.j == 0) {
            return java.lang.Math.min(this.i, moVar.a());
        }
        return -1;
    }

    @Override // defpackage.mc
    public final defpackage.md fc(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.nb((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.nb(layoutParams);
    }

    @Override // defpackage.mc
    public final android.view.View fd(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        int iT;
        android.view.View viewAD;
        at();
        if (av() == 0 || (iT = T(i)) == Integer.MIN_VALUE) {
            return null;
        }
        int i2 = 1;
        int iAv = 0;
        int iAv2 = -1;
        int iA = (iT == -1) ^ this.e ? moVar.a() - 1 : 0;
        if (U(iA) != null) {
            as(this.s, iA);
        } else {
            this.f = iA;
            aj(mhVar, moVar, true);
        }
        boolean z = this.e;
        if (iT != -1) {
            if (z) {
                iAv = av() - 1;
                i2 = -1;
            } else {
                iAv2 = av();
            }
            while (true) {
                if (iAv != iAv2) {
                    viewAD = aD(iAv);
                    if (viewAD != null && viewAD.hasFocusable()) {
                        break;
                    }
                    iAv += i2;
                } else {
                    viewAD = null;
                    break;
                }
            }
        } else {
            if (z) {
                iAv2 = av();
            } else {
                iAv = av() - 1;
                i2 = -1;
            }
            while (true) {
                if (iAv != iAv2) {
                    viewAD = aD(iAv);
                    if (viewAD != null && viewAD.hasFocusable()) {
                        break;
                    }
                    iAv += i2;
                } else {
                    viewAD = null;
                    break;
                }
            }
        }
        return (viewAD == null || !viewAD.hasFocusable()) ? aa(null, i, mhVar, moVar) : viewAD;
    }

    @Override // defpackage.mc
    public final android.view.View fe(android.view.View view, int i, defpackage.mh mhVar, defpackage.mo moVar) {
        android.view.View viewAC;
        if (av() == 0 || (viewAC = aC(view)) == null) {
            return null;
        }
        return aa(viewAC, i, mhVar, moVar);
    }

    @Override // defpackage.mc
    public final void ff(defpackage.mh mhVar, defpackage.mo moVar, defpackage.edn ednVar) {
        super.ff(mhVar, moVar, ednVar);
        ednVar.r("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.mc
    public final void fg(defpackage.mh mhVar, defpackage.mo moVar, android.view.View view, defpackage.edn ednVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof defpackage.nb)) {
            super.aN(view, ednVar);
            return;
        }
        defpackage.nb nbVar = (defpackage.nb) layoutParams;
        if (this.j == 0) {
            int iD = nbVar.d();
            boolean z = nbVar.b;
            ednVar.u(defpackage.erh.J(iD, 1, -1, -1, false));
        } else {
            int iD2 = nbVar.d();
            boolean z2 = nbVar.b;
            ednVar.u(defpackage.erh.J(-1, -1, iD2, 1, false));
        }
    }

    @Override // defpackage.mc
    public final void fh(android.graphics.Rect rect, int i, int i2) {
        int iAu;
        int iAu2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            iAu2 = au(i2, rect.height() + paddingTop, az());
            iAu = au(i, (this.k * this.i) + paddingLeft, aA());
        } else {
            iAu = au(i, rect.width() + paddingLeft, aA());
            iAu2 = au(i2, (this.k * this.i) + paddingTop, az());
        }
        aZ(iAu, iAu2);
    }

    @Override // defpackage.mc
    public final boolean fj() {
        return this.q == null;
    }

    @Override // defpackage.mc
    public final void fk() {
        this.h.a();
        aV();
    }

    @Override // defpackage.mc
    public final defpackage.md h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.nb(context, attributeSet);
    }

    final int i() {
        int iAv = av();
        if (iAv == 0) {
            return 0;
        }
        return bl(aD(iAv - 1));
    }

    final int l(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        if (av() == 0 || i == 0) {
            return 0;
        }
        x(i, moVar);
        defpackage.ld ldVar = this.l;
        int iV = V(mhVar, ldVar, moVar);
        if (ldVar.b >= iV) {
            i = i < 0 ? -iV : iV;
        }
        this.b.n(-i);
        this.o = this.e;
        ldVar.b = 0;
        al(mhVar, ldVar);
        return i;
    }

    final android.view.View m(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        android.view.View view = null;
        for (int iAv = av() - 1; iAv >= 0; iAv--) {
            android.view.View viewAD = aD(iAv);
            int iD = this.b.d(viewAD);
            int iA = this.b.a(viewAD);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAD;
                }
                if (view == null) {
                    view = viewAD;
                }
            }
        }
        return view;
    }

    @Override // defpackage.mc
    public final void p(defpackage.mh mhVar, defpackage.mo moVar) {
        aj(mhVar, moVar, true);
    }

    @Override // defpackage.mc
    public final void q(defpackage.mo moVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    final android.view.View s(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAv = av();
        android.view.View view = null;
        for (int i = 0; i < iAv; i++) {
            android.view.View viewAD = aD(i);
            int iD = this.b.d(viewAD);
            if (this.b.a(viewAD) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAD;
                }
                if (view == null) {
                    view = viewAD;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x002e A[SYNTHETIC] */
    final android.view.View t() {
        boolean z;
        boolean z2;
        int iAv = av();
        int i = iAv - 1;
        java.util.BitSet bitSet = new java.util.BitSet(this.i);
        bitSet.set(0, this.i, true);
        byte b = (this.j == 1 && M()) ? (byte) 1 : (byte) -1;
        if (this.e) {
            iAv = -1;
        } else {
            i = 0;
        }
        int i2 = i < iAv ? 1 : -1;
        while (i != iAv) {
            android.view.View viewAD = aD(i);
            defpackage.nb nbVar = (defpackage.nb) viewAD.getLayoutParams();
            if (bitSet.get(nbVar.a.e)) {
                defpackage.nc ncVar = nbVar.a;
                if (this.e) {
                    if (ncVar.c() < this.b.f()) {
                        java.util.ArrayList arrayList = ncVar.a;
                        boolean z3 = defpackage.nc.n((android.view.View) arrayList.get(arrayList.size() - 1)).b;
                        return viewAD;
                    }
                } else if (ncVar.e() > this.b.j()) {
                    boolean z4 = defpackage.nc.n((android.view.View) ncVar.a.get(0)).b;
                    return viewAD;
                }
                bitSet.clear(nbVar.a.e);
            }
            boolean z5 = nbVar.b;
            i += i2;
            if (i != iAv) {
                android.view.View viewAD2 = aD(i);
                boolean z6 = this.e;
                defpackage.lr lrVar = this.b;
                if (z6) {
                    int iA = lrVar.a(viewAD);
                    int iA2 = this.b.a(viewAD2);
                    if (iA >= iA2) {
                        if (iA == iA2) {
                            if (nbVar.a.e - ((defpackage.nb) viewAD2.getLayoutParams()).a.e >= 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (b >= 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z == z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewAD;
                }
                int iD = lrVar.d(viewAD);
                int iD2 = this.b.d(viewAD2);
                if (iD <= iD2) {
                    if (iD != iD2) {
                        continue;
                    } else {
                        if (nbVar.a.e - ((defpackage.nb) viewAD2.getLayoutParams()).a.e >= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (b >= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z == z2) {
                        }
                    }
                }
                return viewAD;
            }
        }
        return null;
    }

    @Override // defpackage.mc
    public final boolean u(defpackage.md mdVar) {
        return mdVar instanceof defpackage.nb;
    }

    final void x(int i, defpackage.mo moVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        defpackage.ld ldVar = this.l;
        ldVar.a = true;
        bF(iC, moVar);
        bE(i2);
        ldVar.c = iC + ldVar.d;
        ldVar.b = java.lang.Math.abs(i);
    }

    @Override // defpackage.mc
    public final void y(int i, int i2) {
        af(i, i2, 1);
    }

    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v7.widget.StaggeredGridLayoutManager.SavedState> CREATOR = new defpackage.x(17);
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        java.util.List g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState(android.os.Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int i = parcel.readInt();
            this.c = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.e = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        final void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public SavedState(android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        public SavedState() {
        }
    }
}

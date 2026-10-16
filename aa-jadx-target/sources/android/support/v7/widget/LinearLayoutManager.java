package android.support.v7.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class LinearLayoutManager extends defpackage.mc implements defpackage.mm {
    private defpackage.lh a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final boolean e;
    private final defpackage.lg f;
    private final int g;
    private final int[] h;
    int k;
    defpackage.lr l;
    boolean m;
    int n;
    int o;
    android.support.v7.widget.LinearLayoutManager.SavedState p;
    final defpackage.lf q;

    public LinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new defpackage.lf();
        this.f = new defpackage.lg();
        this.g = 2;
        this.h = new int[2];
        mb mbVarAB = aB(context, attributeSet, i, i2);
        ae(mbVarAB.a);
        af(mbVarAB.c);
        t(mbVarAB.d);
    }

    private final int bE(defpackage.mo moVar) {
        if (av() == 0) {
            return 0;
        }
        Y();
        defpackage.lr lrVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return defpackage.ca.o(moVar, lrVar, aq(z2), ap(z2), this, z);
    }

    private final int bF(int i, defpackage.mh mhVar, defpackage.mo moVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -N(-iF2, mhVar, moVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int bG(int i, defpackage.mh mhVar, defpackage.mo moVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -N(iJ2, mhVar, moVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final android.view.View bH() {
        return S(0, av());
    }

    private final android.view.View bI() {
        return S(av() - 1, -1);
    }

    private final android.view.View bJ() {
        return aD(this.m ? 0 : av() - 1);
    }

    private final android.view.View bK() {
        return aD(this.m ? av() - 1 : 0);
    }

    private final void bL(defpackage.mh mhVar, defpackage.lh lhVar) {
        if (!lhVar.a || lhVar.m) {
            return;
        }
        int i = lhVar.g;
        int i2 = lhVar.i;
        if (lhVar.f == -1) {
            int iAv = av();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < iAv; i3++) {
                        android.view.View viewAD = aD(i3);
                        if (this.l.d(viewAD) < iE || this.l.m(viewAD) < iE) {
                            bM(mhVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAv - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    android.view.View viewAD2 = aD(i5);
                    if (this.l.d(viewAD2) < iE || this.l.m(viewAD2) < iE) {
                        bM(mhVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAv2 = av();
            if (!this.m) {
                for (int i7 = 0; i7 < iAv2; i7++) {
                    android.view.View viewAD3 = aD(i7);
                    if (this.l.a(viewAD3) > i6 || this.l.l(viewAD3) > i6) {
                        bM(mhVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAv2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                android.view.View viewAD4 = aD(i9);
                if (this.l.a(viewAD4) > i6 || this.l.l(viewAD4) > i6) {
                    bM(mhVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bM(defpackage.mh mhVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aT(i, mhVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aT(i2, mhVar);
                }
            }
        }
    }

    private final void bN(int i, int i2, boolean z, defpackage.mo moVar) {
        int iJ;
        this.a.m = al();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        X(moVar, iArr);
        int iMax = java.lang.Math.max(0, iArr[0]);
        int iMax2 = java.lang.Math.max(0, iArr[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        defpackage.lh lhVar = this.a;
        lhVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        lhVar.i = iMax;
        if (i == 1) {
            lhVar.h = i3 + this.l.g();
            android.view.View viewBJ = bJ();
            defpackage.lh lhVar2 = this.a;
            lhVar2.e = true == this.m ? -1 : 1;
            int iEX = ((defpackage.md) viewBJ.getLayoutParams()).eX();
            defpackage.lh lhVar3 = this.a;
            lhVar2.d = iEX + lhVar3.e;
            lhVar3.b = this.l.a(viewBJ);
            iJ = this.l.a(viewBJ) - this.l.f();
        } else {
            android.view.View viewBK = bK();
            this.a.h += this.l.j();
            defpackage.lh lhVar4 = this.a;
            lhVar4.e = true != this.m ? -1 : 1;
            int iEX2 = ((defpackage.md) viewBK.getLayoutParams()).eX();
            defpackage.lh lhVar5 = this.a;
            lhVar4.d = iEX2 + lhVar5.e;
            lhVar5.b = this.l.d(viewBK);
            iJ = (-this.l.d(viewBK)) + this.l.j();
        }
        defpackage.lh lhVar6 = this.a;
        lhVar6.c = i2;
        if (z) {
            lhVar6.c = i2 - iJ;
        }
        lhVar6.g = iJ;
    }

    private final void bO(defpackage.lf lfVar) {
        bP(lfVar.b, lfVar.c);
    }

    private final void bP(int i, int i2) {
        this.a.c = this.l.f() - i2;
        defpackage.lh lhVar = this.a;
        lhVar.e = true != this.m ? 1 : -1;
        lhVar.d = i;
        lhVar.f = 1;
        lhVar.b = i2;
        lhVar.g = Integer.MIN_VALUE;
    }

    private final void bQ(defpackage.lf lfVar) {
        bR(lfVar.b, lfVar.c);
    }

    private final void bR(int i, int i2) {
        this.a.c = i2 - this.l.j();
        defpackage.lh lhVar = this.a;
        lhVar.d = i;
        lhVar.e = true != this.m ? -1 : 1;
        lhVar.f = -1;
        lhVar.b = i2;
        lhVar.g = Integer.MIN_VALUE;
    }

    private final int c(defpackage.mo moVar) {
        if (av() == 0) {
            return 0;
        }
        Y();
        defpackage.lr lrVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return defpackage.ca.m(moVar, lrVar, aq(z2), ap(z2), this, z);
    }

    private final int s(defpackage.mo moVar) {
        if (av() == 0) {
            return 0;
        }
        Y();
        defpackage.lr lrVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return defpackage.ca.n(moVar, lrVar, aq(z2), ap(z2), this, z, this.m);
    }

    @Override // defpackage.mc
    public final int D(defpackage.mo moVar) {
        return c(moVar);
    }

    @Override // defpackage.mc
    public final int E(defpackage.mo moVar) {
        return s(moVar);
    }

    @Override // defpackage.mc
    public final int F(defpackage.mo moVar) {
        return bE(moVar);
    }

    @Override // defpackage.mc
    public final int G(defpackage.mo moVar) {
        return c(moVar);
    }

    @Override // defpackage.mc
    public final int H(defpackage.mo moVar) {
        return s(moVar);
    }

    @Override // defpackage.mc
    public final int I(defpackage.mo moVar) {
        return bE(moVar);
    }

    final int J(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && aj()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && aj()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int K(defpackage.mh mhVar, defpackage.lh lhVar, defpackage.mo moVar, boolean z) {
        int i = lhVar.c;
        int i2 = lhVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                lhVar.g = i2 + i;
            }
            bL(mhVar, lhVar);
        }
        int i3 = lhVar.c + lhVar.h;
        defpackage.lg lgVar = this.f;
        while (true) {
            if ((!lhVar.m && i3 <= 0) || !lhVar.c(moVar)) {
                break;
            }
            lgVar.a = 0;
            lgVar.b = false;
            lgVar.c = false;
            lgVar.d = false;
            l(mhVar, moVar, lhVar, lgVar);
            if (!lgVar.b) {
                int i4 = lhVar.b;
                int i5 = lgVar.a;
                lhVar.b = i4 + (lhVar.f * i5);
                if (!lgVar.c || lhVar.l != null || !moVar.g) {
                    lhVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = lhVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    lhVar.g = i7;
                    int i8 = lhVar.c;
                    if (i8 < 0) {
                        lhVar.g = i7 + i8;
                    }
                    bL(mhVar, lhVar);
                }
                if (z && lgVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - lhVar.c;
    }

    public final int L() {
        android.view.View viewT = T(0, av(), false, true);
        if (viewT == null) {
            return -1;
        }
        return ((defpackage.md) viewT.getLayoutParams()).eX();
    }

    public final int M() {
        android.view.View viewT = T(av() - 1, -1, false, true);
        if (viewT == null) {
            return -1;
        }
        return ((defpackage.md) viewT.getLayoutParams()).eX();
    }

    final int N(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        if (av() != 0 && i != 0) {
            Y();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = java.lang.Math.abs(i);
            bN(i2, iAbs, true, moVar);
            defpackage.lh lhVar = this.a;
            int iK = lhVar.g + K(mhVar, lhVar, moVar, false);
            if (iK >= 0) {
                if (iAbs > iK) {
                    i = i2 * iK;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.mm
    public final android.graphics.PointF O(int i) {
        if (av() == 0) {
            return null;
        }
        float f = (i < bl(aD(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new android.graphics.PointF(f, 0.0f) : new android.graphics.PointF(0.0f, f);
    }

    @Override // defpackage.mc
    public final android.os.Parcelable P() {
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            return new android.support.v7.widget.LinearLayoutManager.SavedState(savedState);
        }
        android.support.v7.widget.LinearLayoutManager.SavedState savedState2 = new android.support.v7.widget.LinearLayoutManager.SavedState();
        if (av() <= 0) {
            savedState2.a();
            return savedState2;
        }
        Y();
        boolean z = this.b ^ this.m;
        savedState2.c = z;
        if (z) {
            android.view.View viewBJ = bJ();
            savedState2.b = this.l.f() - this.l.a(viewBJ);
            savedState2.a = bl(viewBJ);
            return savedState2;
        }
        android.view.View viewBK = bK();
        savedState2.a = bl(viewBK);
        savedState2.b = this.l.d(viewBK) - this.l.j();
        return savedState2;
    }

    final android.view.View Q() {
        int i;
        int iAv;
        int iAv2;
        if (this.m) {
            iAv2 = av();
            i = 1;
            iAv = 0;
        } else {
            i = -1;
            iAv = av() - 1;
            iAv2 = -1;
        }
        while (iAv != iAv2) {
            android.view.View viewAD = aD(iAv);
            if (viewAD != null && viewAD.hasFocusable()) {
                return viewAD;
            }
            iAv += i;
        }
        return null;
    }

    final android.view.View R() {
        int iAv;
        int i;
        int iAv2;
        if (this.m) {
            iAv = -1;
            iAv2 = av() - 1;
            i = -1;
        } else {
            iAv = av();
            i = 1;
            iAv2 = 0;
        }
        while (iAv2 != iAv) {
            android.view.View viewAD = aD(iAv2);
            if (viewAD != null && viewAD.hasFocusable()) {
                return viewAD;
            }
            iAv2 += i;
        }
        return null;
    }

    final android.view.View S(int i, int i2) {
        Y();
        if (i2 <= i && i2 >= i) {
            return aD(i);
        }
        int iD = this.l.d(aD(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.E.G(i, i2, i4, i3) : this.F.G(i, i2, i4, i3);
    }

    public final android.view.View T(int i, int i2, boolean z, boolean z2) {
        Y();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.E.G(i, i2, i4, i5) : this.F.G(i, i2, i4, i5);
    }

    @Override // defpackage.mc
    public final android.view.View U(int i) {
        int iAv = av();
        if (iAv == 0) {
            return null;
        }
        int iBl = i - bl(aD(0));
        if (iBl >= 0 && iBl < iAv) {
            android.view.View viewAD = aD(iBl);
            if (bl(viewAD) == i) {
                return viewAD;
            }
        }
        return super.U(i);
    }

    public final android.view.View V(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        int iJ;
        android.view.View viewBH;
        ac();
        if (av() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Y();
        bN(iJ, (int) (this.l.k() * 0.33333334f), false, moVar);
        defpackage.lh lhVar = this.a;
        lhVar.g = Integer.MIN_VALUE;
        lhVar.a = false;
        K(mhVar, lhVar, moVar, true);
        boolean z = this.m;
        if (iJ == -1) {
            viewBH = z ? bI() : bH();
            iJ = -1;
        } else {
            viewBH = z ? bH() : bI();
        }
        android.view.View viewBK = iJ == -1 ? bK() : bJ();
        if (!viewBK.hasFocusable()) {
            return viewBH;
        }
        if (viewBH == null) {
            return null;
        }
        return viewBK;
    }

    @Override // defpackage.mc
    public final void W(java.lang.String str) {
        if (this.p == null) {
            super.W(str);
        }
    }

    protected void X(defpackage.mo moVar, int[] iArr) {
        int iK = moVar.a != -1 ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void Y() {
        if (this.a == null) {
            this.a = new defpackage.lh();
        }
    }

    @Override // defpackage.mc
    public final void Z(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (av() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(M());
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0211  */
    /* JADX WARN: Code duplicated, block: B:119:0x0217  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v55 */
    public final void aa(defpackage.mh mhVar, defpackage.mo moVar) {
        int iA;
        android.view.View viewAE;
        boolean z;
        boolean z2;
        android.view.View viewI;
        defpackage.md mdVar;
        int i;
        int i2;
        int i3;
        ?? r7;
        int i4;
        int i5;
        int iBF;
        int i6;
        android.view.View viewU;
        int iD;
        int iF;
        int i7 = -1;
        if (!(this.p == null && this.n == -1) && moVar.a() == 0) {
            aQ(mhVar);
            return;
        }
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null && savedState.b()) {
            this.n = savedState.a;
        }
        Y();
        boolean z3 = false;
        this.a.a = false;
        ac();
        android.view.View viewAE2 = aE();
        defpackage.lf lfVar = this.q;
        boolean z4 = true;
        if (!lfVar.e || this.n != -1 || this.p != null) {
            lfVar.d();
            lfVar.d = this.m ^ this.d;
            if (moVar.g || (i = this.n) == -1) {
                if (av() != 0) {
                    viewAE = aE();
                    if (viewAE != null) {
                        mdVar = (defpackage.md) viewAE.getLayoutParams();
                        if (!mdVar.eZ() || mdVar.eX() < 0 || mdVar.eX() >= moVar.a()) {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2 || (viewI = i(mhVar, moVar, lfVar.d, z2)) == null) {
                                lfVar.a();
                                if (this.d) {
                                    iA = moVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                lfVar.b = iA;
                            } else {
                                lfVar.b(viewI, ((defpackage.md) viewI.getLayoutParams()).eX());
                                if (!moVar.g && fj()) {
                                    int iD2 = this.l.d(viewI);
                                    int iA2 = this.l.a(viewI);
                                    int iJ = this.l.j();
                                    int iF2 = this.l.f();
                                    boolean z5 = iA2 <= iJ && iD2 < iJ;
                                    boolean z6 = iD2 >= iF2 && iA2 > iF2;
                                    if (z5 || z6) {
                                        if (true == lfVar.d) {
                                            iJ = iF2;
                                        }
                                        lfVar.c = iJ;
                                    }
                                }
                            }
                        } else {
                            lfVar.c(viewAE, ((defpackage.md) viewAE.getLayoutParams()).eX());
                        }
                    } else {
                        z = this.b;
                        z2 = this.d;
                        if (z == z2) {
                            lfVar.a();
                            if (this.d) {
                                iA = moVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            lfVar.b = iA;
                        } else {
                            lfVar.a();
                            if (this.d) {
                                iA = moVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            lfVar.b = iA;
                        }
                    }
                } else {
                    lfVar.a();
                    if (this.d) {
                        iA = moVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    lfVar.b = iA;
                }
            } else if (i < 0 || i >= moVar.a()) {
                this.n = -1;
                this.o = Integer.MIN_VALUE;
                if (av() != 0) {
                    viewAE = aE();
                    if (viewAE != null) {
                        mdVar = (defpackage.md) viewAE.getLayoutParams();
                        if (mdVar.eZ()) {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2) {
                                lfVar.a();
                                if (this.d) {
                                    iA = moVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                lfVar.b = iA;
                            } else {
                                lfVar.a();
                                if (this.d) {
                                    iA = moVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                lfVar.b = iA;
                            }
                        } else {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2) {
                                lfVar.a();
                                if (this.d) {
                                    iA = moVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                lfVar.b = iA;
                            } else {
                                lfVar.a();
                                if (this.d) {
                                    iA = moVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                lfVar.b = iA;
                            }
                        }
                    } else {
                        z = this.b;
                        z2 = this.d;
                        if (z == z2) {
                            lfVar.a();
                            if (this.d) {
                                iA = moVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            lfVar.b = iA;
                        } else {
                            lfVar.a();
                            if (this.d) {
                                iA = moVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            lfVar.b = iA;
                        }
                    }
                } else {
                    lfVar.a();
                    if (this.d) {
                        iA = moVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    lfVar.b = iA;
                }
            } else {
                int i8 = this.n;
                lfVar.b = i8;
                android.support.v7.widget.LinearLayoutManager.SavedState savedState2 = this.p;
                if (savedState2 != null && savedState2.b()) {
                    boolean z7 = savedState2.c;
                    lfVar.d = z7;
                    defpackage.lr lrVar = this.l;
                    if (z7) {
                        lfVar.c = lrVar.f() - this.p.b;
                    } else {
                        lfVar.c = lrVar.j() + this.p.b;
                    }
                } else if (this.o == Integer.MIN_VALUE) {
                    android.view.View viewU2 = U(i8);
                    if (viewU2 == null) {
                        if (av() > 0) {
                            lfVar.d = (this.n < ((defpackage.md) aD(0).getLayoutParams()).eX()) == this.m;
                        }
                        lfVar.a();
                    } else if (this.l.b(viewU2) > this.l.k()) {
                        lfVar.a();
                    } else {
                        int iD3 = this.l.d(viewU2) - this.l.j();
                        defpackage.lr lrVar2 = this.l;
                        if (iD3 < 0) {
                            lfVar.c = lrVar2.j();
                            lfVar.d = false;
                        } else if (lrVar2.f() - this.l.a(viewU2) < 0) {
                            lfVar.c = this.l.f();
                            lfVar.d = true;
                        } else {
                            boolean z8 = lfVar.d;
                            defpackage.lr lrVar3 = this.l;
                            lfVar.c = z8 ? lrVar3.a(viewU2) + this.l.o() : lrVar3.d(viewU2);
                        }
                    }
                } else {
                    boolean z9 = this.m;
                    lfVar.d = z9;
                    defpackage.lr lrVar4 = this.l;
                    if (z9) {
                        lfVar.c = lrVar4.f() - this.o;
                    } else {
                        lfVar.c = lrVar4.j() + this.o;
                    }
                }
            }
            lfVar.e = true;
        } else if (viewAE2 != null && (this.l.d(viewAE2) >= this.l.f() || this.l.a(viewAE2) <= this.l.j())) {
            lfVar.c(viewAE2, ((defpackage.md) viewAE2.getLayoutParams()).eX());
        }
        defpackage.lh lhVar = this.a;
        lhVar.f = lhVar.k >= 0 ? 1 : -1;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        X(moVar, iArr);
        int iMax = java.lang.Math.max(0, iArr[0]) + this.l.j();
        int iMax2 = java.lang.Math.max(0, iArr[1]) + this.l.g();
        if (moVar.g && (i6 = this.n) != -1 && this.o != Integer.MIN_VALUE && (viewU = U(i6)) != null) {
            boolean z10 = this.m;
            defpackage.lr lrVar5 = this.l;
            if (z10) {
                iF = lrVar5.f() - this.l.a(viewU);
                iD = this.o;
            } else {
                iD = lrVar5.d(viewU) - this.l.j();
                iF = this.o;
            }
            int i9 = iF - iD;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        boolean z11 = lfVar.d;
        boolean z12 = this.m;
        if (!z11 ? true != z12 : true == z12) {
            i7 = 1;
        }
        m(mhVar, moVar, lfVar, i7);
        aH(mhVar);
        this.a.m = al();
        defpackage.lh lhVar2 = this.a;
        lhVar2.j = moVar.g;
        lhVar2.i = 0;
        if (lfVar.d) {
            bQ(lfVar);
            defpackage.lh lhVar3 = this.a;
            lhVar3.h = iMax;
            K(mhVar, lhVar3, moVar, false);
            defpackage.lh lhVar4 = this.a;
            i3 = lhVar4.b;
            int i10 = lhVar4.d;
            int i11 = lhVar4.c;
            if (i11 > 0) {
                iMax2 += i11;
            }
            bO(lfVar);
            defpackage.lh lhVar5 = this.a;
            lhVar5.h = iMax2;
            lhVar5.d += lhVar5.e;
            K(mhVar, lhVar5, moVar, false);
            defpackage.lh lhVar6 = this.a;
            i2 = lhVar6.b;
            int i12 = lhVar6.c;
            if (i12 > 0) {
                bR(i10, i3);
                defpackage.lh lhVar7 = this.a;
                lhVar7.h = i12;
                K(mhVar, lhVar7, moVar, false);
                i3 = this.a.b;
            }
        } else {
            bO(lfVar);
            defpackage.lh lhVar8 = this.a;
            lhVar8.h = iMax2;
            K(mhVar, lhVar8, moVar, false);
            defpackage.lh lhVar9 = this.a;
            i2 = lhVar9.b;
            int i13 = lhVar9.d;
            int i14 = lhVar9.c;
            if (i14 > 0) {
                iMax += i14;
            }
            bQ(lfVar);
            defpackage.lh lhVar10 = this.a;
            lhVar10.h = iMax;
            lhVar10.d += lhVar10.e;
            K(mhVar, lhVar10, moVar, false);
            defpackage.lh lhVar11 = this.a;
            i3 = lhVar11.b;
            int i15 = lhVar11.c;
            if (i15 > 0) {
                bP(i13, i2);
                defpackage.lh lhVar12 = this.a;
                lhVar12.h = i15;
                K(mhVar, lhVar12, moVar, false);
                i2 = this.a.b;
            }
        }
        if (av() > 0) {
            if (this.m ^ this.d) {
                int iBF2 = bF(i2, mhVar, moVar, true);
                i4 = i3 + iBF2;
                i5 = i2 + iBF2;
                iBF = bG(i4, mhVar, moVar, false);
            } else {
                int iBG = bG(i3, mhVar, moVar, true);
                i4 = i3 + iBG;
                i5 = i2 + iBG;
                iBF = bF(i5, mhVar, moVar, false);
            }
            i3 = i4 + iBF;
            i2 = i5 + iBF;
        }
        if (moVar.k && av() != 0 && !moVar.g && fj()) {
            java.util.List list = mhVar.d;
            int size = list.size();
            int iEX = ((defpackage.md) aD(0).getLayoutParams()).eX();
            int i16 = 0;
            int iB = 0;
            int iB2 = 0;
            while (i16 < size) {
                defpackage.mr mrVar = (defpackage.mr) list.get(i16);
                if (!mrVar.v()) {
                    boolean z13 = mrVar.c() >= iEX ? z3 : z4;
                    boolean z14 = this.m;
                    defpackage.lr lrVar6 = this.l;
                    if (z13 != z14) {
                        iB += lrVar6.b(mrVar.a);
                    } else {
                        iB2 += lrVar6.b(mrVar.a);
                    }
                }
                i16++;
                z3 = false;
                z4 = true;
            }
            this.a.l = list;
            if (iB > 0) {
                bR(((defpackage.md) bK().getLayoutParams()).eX(), i3);
                defpackage.lh lhVar13 = this.a;
                lhVar13.h = iB;
                r7 = 0;
                lhVar13.c = 0;
                lhVar13.b(null);
                K(mhVar, this.a, moVar, false);
            } else {
                r7 = 0;
            }
            if (iB2 > 0) {
                bP(((defpackage.md) bJ().getLayoutParams()).eX(), i2);
                defpackage.lh lhVar14 = this.a;
                lhVar14.h = iB2;
                lhVar14.c = r7;
                lhVar14.b(null);
                K(mhVar, this.a, moVar, r7);
            }
            this.a.l = null;
        }
        if (moVar.g) {
            lfVar.d();
        } else {
            defpackage.lr lrVar7 = this.l;
            lrVar7.b = lrVar7.k();
        }
        this.b = this.d;
    }

    @Override // defpackage.mc
    public final void ab(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.support.v7.widget.LinearLayoutManager.SavedState) {
            android.support.v7.widget.LinearLayoutManager.SavedState savedState = (android.support.v7.widget.LinearLayoutManager.SavedState) parcelable;
            this.p = savedState;
            if (this.n != -1) {
                savedState.a();
            }
            aV();
        }
    }

    final void ac() {
        this.m = (this.k == 1 || !aj()) ? this.c : !this.c;
    }

    @Override // defpackage.mc
    public final void ad(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    public final void ae(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "invalid orientation:"));
        }
        W(null);
        if (i != this.k || this.l == null) {
            defpackage.lq lqVar = i != 0 ? new defpackage.lq(this) : new lp(this);
            this.l = lqVar;
            this.q.a = lqVar;
            this.k = i;
            aV();
        }
    }

    public final void af(boolean z) {
        W(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aV();
    }

    @Override // defpackage.mc
    public final boolean ag() {
        return this.k == 0;
    }

    @Override // defpackage.mc
    public final boolean ah() {
        return this.k == 1;
    }

    @Override // defpackage.mc
    public final boolean ai() {
        return true;
    }

    protected final boolean aj() {
        return ay() == 1;
    }

    @Override // defpackage.mc
    public final boolean ak() {
        return this.c;
    }

    final boolean al() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.mc
    public final boolean am() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iAv = av();
            for (int i = 0; i < iAv; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = aD(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mc
    public final void an(int i, int i2, defpackage.mo moVar, defpackage.kz kzVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (av() == 0 || i == 0) {
            return;
        }
        Y();
        bN(i > 0 ? 1 : -1, java.lang.Math.abs(i), true, moVar);
        x(moVar, this.a, kzVar);
    }

    @Override // defpackage.mc
    public final void ao(int i, defpackage.kz kzVar) {
        boolean z;
        int i2;
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState == null || !savedState.b()) {
            ac();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
            i2 = savedState.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            kzVar.a(i2, 0);
            i2 += i3;
        }
    }

    final android.view.View ap(boolean z) {
        return this.m ? T(0, av(), z, true) : T(av() - 1, -1, z, true);
    }

    final android.view.View aq(boolean z) {
        return this.m ? T(av() - 1, -1, z, true) : T(0, av(), z, true);
    }

    @Override // defpackage.mc
    public void as(android.support.v7.widget.RecyclerView recyclerView, int i) {
        mn mnVar = new mn(recyclerView.getContext());
        mnVar.b = i;
        bc(mnVar);
    }

    public final void at(int i) {
        this.n = i;
        this.o = 0;
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    @Override // defpackage.mc
    public int d(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        if (this.k == 1) {
            return 0;
        }
        return N(i, mhVar, moVar);
    }

    @Override // defpackage.mc
    public int e(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        if (this.k == 0) {
            return 0;
        }
        return N(i, mhVar, moVar);
    }

    @Override // defpackage.mc
    public defpackage.md f() {
        return new defpackage.md(-2, -2);
    }

    @Override // defpackage.mc
    public android.view.View fd(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        int iJ;
        ac();
        if (av() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Y();
        int iA = (iJ == -1) ^ this.m ? moVar.a() - 1 : 0;
        if (U(iA) != null) {
            as(this.s, iA);
        } else {
            this.n = iA;
            aa(mhVar, moVar);
        }
        android.view.View viewQ = iJ == -1 ? Q() : R();
        return (viewQ == null || !viewQ.hasFocusable()) ? V(i, mhVar, moVar) : viewQ;
    }

    @Override // defpackage.mc
    public android.view.View fe(android.view.View view, int i, defpackage.mh mhVar, defpackage.mo moVar) {
        return V(i, mhVar, moVar);
    }

    @Override // defpackage.mc
    public void ff(defpackage.mh mhVar, defpackage.mo moVar, edn ednVar) {
        super.ff(mhVar, moVar, ednVar);
        defpackage.lw lwVar = this.s.m;
        if (lwVar == null || lwVar.a() <= 0) {
            return;
        }
        ednVar.h(defpackage.edm.j);
    }

    @Override // defpackage.mc
    public boolean fi(int i, android.os.Bundle bundle) {
        int iMin;
        if (super.fi(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                android.support.v7.widget.RecyclerView recyclerView = this.s;
                iMin = java.lang.Math.min(i2, fb(recyclerView.e, recyclerView.N) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                android.support.v7.widget.RecyclerView recyclerView2 = this.s;
                iMin = java.lang.Math.min(i3, fa(recyclerView2.e, recyclerView2.N) - 1);
            }
            if (iMin >= 0) {
                at(iMin);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mc
    public boolean fj() {
        return this.p == null && this.b == this.d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    public android.view.View i(defpackage.mh mhVar, defpackage.mo moVar, boolean z, boolean z2) {
        int i;
        int i2;
        int iAv;
        Y();
        int iAv2 = av();
        if (z2) {
            i = -1;
            iAv = av() - 1;
            i2 = -1;
        } else {
            i = iAv2;
            i2 = 1;
            iAv = 0;
        }
        int iA = moVar.a();
        int iJ = this.l.j();
        int iF = this.l.f();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        while (iAv != i) {
            android.view.View viewAD = aD(iAv);
            int iEX = ((defpackage.md) viewAD.getLayoutParams()).eX();
            int iD = this.l.d(viewAD);
            int iA2 = this.l.a(viewAD);
            if (iEX >= 0 && iEX < iA) {
                if (!((defpackage.md) viewAD.getLayoutParams()).eZ()) {
                    boolean z3 = iA2 <= iJ && iD < iJ;
                    boolean z4 = iD >= iF && iA2 > iF;
                    if (!z3 && !z4) {
                        return viewAD;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewAD;
                        } else if (view == null) {
                            view = viewAD;
                        }
                    } else if (z3) {
                        view2 = viewAD;
                    } else if (view == null) {
                        view = viewAD;
                    }
                } else if (view3 == null) {
                    view3 = viewAD;
                }
            }
            iAv += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public void l(defpackage.mh mhVar, defpackage.mo moVar, defpackage.lh lhVar, defpackage.lg lgVar) {
        int paddingTop;
        int i;
        int iC;
        int i2;
        int iC2;
        android.view.View viewA = lhVar.a(mhVar);
        if (viewA == null) {
            lgVar.b = true;
            return;
        }
        defpackage.md mdVar = (defpackage.md) viewA.getLayoutParams();
        java.util.List list = lhVar.l;
        boolean z = this.m;
        if (list == null) {
            if (z == (lhVar.f == -1)) {
                super.aF(viewA, -1, false);
            } else {
                super.aF(viewA, 0, false);
            }
        } else {
            if (z == (lhVar.f == -1)) {
                super.aF(viewA, -1, true);
            } else {
                super.aF(viewA, 0, true);
            }
        }
        bs(viewA);
        lgVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (aj()) {
                iC = this.C - getPaddingRight();
                iC2 = iC - this.l.c(viewA);
            } else {
                int paddingLeft = getPaddingLeft();
                iC = this.l.c(viewA) + paddingLeft;
                iC2 = paddingLeft;
            }
            if (lhVar.f == -1) {
                i2 = lhVar.b;
                paddingTop = i2 - lgVar.a;
            } else {
                paddingTop = lhVar.b;
                i2 = lgVar.a + paddingTop;
            }
        } else {
            paddingTop = getPaddingTop();
            int iC3 = this.l.c(viewA) + paddingTop;
            if (lhVar.f == -1) {
                iC = lhVar.b;
                i = iC - lgVar.a;
            } else {
                i = lhVar.b;
                iC = lgVar.a + i;
            }
            int i3 = i;
            i2 = iC3;
            iC2 = i3;
        }
        br(viewA, iC2, paddingTop, iC, i2);
        if (mdVar.eZ() || mdVar.eY()) {
            lgVar.c = true;
        }
        lgVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.mc
    public void p(defpackage.mh mhVar, defpackage.mo moVar) {
        aa(mhVar, moVar);
    }

    @Override // defpackage.mc
    public void q(defpackage.mo moVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void t(boolean z) {
        W(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aV();
    }

    public void x(defpackage.mo moVar, defpackage.lh lhVar, defpackage.kz kzVar) {
        int i = lhVar.d;
        if (i < 0 || i >= moVar.a()) {
            return;
        }
        kzVar.a(i, java.lang.Math.max(0, lhVar.g));
    }

    @Override // defpackage.mc
    public final void ar(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new defpackage.lf();
        this.f = new defpackage.lg();
        this.g = 2;
        this.h = new int[2];
        ae(i);
        af(false);
    }

    public void m(defpackage.mh mhVar, defpackage.mo moVar, defpackage.lf lfVar, int i) {
    }
}

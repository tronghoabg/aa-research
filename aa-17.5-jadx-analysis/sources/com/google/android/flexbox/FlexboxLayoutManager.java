package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.ajnt;
import defpackage.khy;
import defpackage.lo;
import defpackage.lp;
import defpackage.lq;
import defpackage.ly;
import defpackage.lz;
import defpackage.ma;
import defpackage.me;
import defpackage.mj;
import defpackage.mk;
import defpackage.ml;
import defpackage.qdv;
import defpackage.qdw;
import defpackage.qdy;
import defpackage.qdz;
import defpackage.roc;
import defpackage.ul;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends lz implements qdv, mj {
    private static final Rect h = new Rect();
    private final Context K;
    private View L;
    public int a;
    public int b;
    public boolean c;
    public lq e;
    public lq f;
    private int i;
    private boolean k;
    private me l;
    private ml m;
    private qdz n;
    private SavedState p;
    private final int j = -1;
    public List d = new ArrayList();
    public final ul g = new ul(this);
    private final qdy o = new qdy(this);
    private int q = -1;
    private int G = Integer.MIN_VALUE;
    private int H = Integer.MIN_VALUE;
    private int I = Integer.MIN_VALUE;
    private final SparseArray J = new SparseArray();
    private int M = -1;
    private final ajnt N = new ajnt((char[]) null);

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        ly lyVarAB = aB(context, attributeSet, i, i2);
        int i3 = lyVarAB.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (lyVarAB.c) {
                    M(3);
                } else {
                    M(2);
                }
            }
        } else if (lyVarAB.c) {
            M(1);
        } else {
            M(0);
        }
        if (this.b != 1) {
            aP();
            al();
            this.b = 1;
            this.e = null;
            this.f = null;
            aV();
        }
        if (this.i != 4) {
            aP();
            al();
            this.i = 4;
            aV();
        }
        this.K = context;
    }

    private final int N(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        int iA = mlVar.a();
        aq();
        View viewAa = aa(iA);
        View viewAe = ae(iA);
        if (mlVar.a() == 0 || viewAa == null || viewAe == null) {
            return 0;
        }
        return Math.min(this.e.k(), this.e.a(viewAe) - this.e.d(viewAa));
    }

    private final int Q(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        int iA = mlVar.a();
        View viewAa = aa(iA);
        View viewAe = ae(iA);
        if (mlVar.a() == 0 || viewAa == null || viewAe == null) {
            return 0;
        }
        int iBl = bl(viewAa);
        int iBl2 = bl(viewAe);
        int iA2 = this.e.a(viewAe) - this.e.d(viewAa);
        ul ulVar = this.g;
        int iAbs = Math.abs(iA2);
        int i = ((int[]) ulVar.e)[iBl];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[iBl2] - i) + 1))) + (this.e.j() - this.e.d(viewAa)));
    }

    private final int R(ml mlVar) {
        if (av() != 0) {
            int iA = mlVar.a();
            View viewAa = aa(iA);
            View viewAe = ae(iA);
            if (mlVar.a() != 0 && viewAa != null && viewAe != null) {
                View viewBK = bK(0, av());
                int iBl = viewBK == null ? -1 : bl(viewBK);
                return (int) ((Math.abs(this.e.a(viewAe) - this.e.d(viewAa)) / ((L() - iBl) + 1)) * mlVar.a());
            }
        }
        return 0;
    }

    private final int S(me meVar, ml mlVar, qdz qdzVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9 = qdzVar.f;
        if (i9 != Integer.MIN_VALUE) {
            int i10 = qdzVar.a;
            if (i10 < 0) {
                qdzVar.f = i9 + i10;
            }
            at(meVar, qdzVar);
        }
        int i11 = qdzVar.a;
        boolean zK = K();
        int i12 = i11;
        int i13 = 0;
        while (true) {
            if (i12 <= 0 && !this.n.b) {
                break;
            }
            List list = this.d;
            int i14 = qdzVar.d;
            if (i14 < 0 || i14 >= mlVar.a() || (i = qdzVar.c) < 0 || i >= list.size()) {
                break;
            }
            qdw qdwVar = (qdw) this.d.get(qdzVar.c);
            qdzVar.d = qdwVar.o;
            int i15 = 1;
            if (K()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i16 = this.C;
                int i17 = qdzVar.e;
                if (qdzVar.i == -1) {
                    i17 -= qdwVar.g;
                }
                int i18 = qdzVar.d;
                int i19 = i16 - paddingRight;
                float f2 = this.o.d;
                float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i20 = qdwVar.h;
                float measuredWidth = i19 - f2;
                float measuredWidth2 = paddingLeft - f2;
                int i21 = i18;
                int i22 = 0;
                while (i21 < i18 + i20) {
                    View viewS = s(i21);
                    int i23 = i11;
                    if (qdzVar.i == i15) {
                        aG(viewS, h);
                        super.aF(viewS, -1, false);
                    } else {
                        aG(viewS, h);
                        int i24 = i22;
                        super.aF(viewS, i24, false);
                        i22 = i24 + 1;
                    }
                    int i25 = i20;
                    ul ulVar = this.g;
                    int i26 = i17;
                    long j = ((long[]) ulVar.c)[i21];
                    int i27 = (int) j;
                    int iO = ul.o(j);
                    if (bJ(viewS, i27, iO, (LayoutParams) viewS.getLayoutParams())) {
                        viewS.measure(i27, iO);
                    }
                    float fBk = measuredWidth2 + r4.leftMargin + bk(viewS);
                    float fBm = measuredWidth - (r4.rightMargin + bm(viewS));
                    int iBn = i26 + bn(viewS);
                    if (this.c) {
                        i8 = i21;
                        f = fBm;
                        ulVar.k(viewS, qdwVar, Math.round(fBm) - viewS.getMeasuredWidth(), iBn, Math.round(fBm), iBn + viewS.getMeasuredHeight());
                    } else {
                        f = fBm;
                        i8 = i21;
                        ulVar.k(viewS, qdwVar, Math.round(fBk), iBn, Math.round(fBk) + viewS.getMeasuredWidth(), iBn + viewS.getMeasuredHeight());
                    }
                    measuredWidth2 = fBk + viewS.getMeasuredWidth() + r4.rightMargin + bm(viewS) + fMax;
                    measuredWidth = f - (((viewS.getMeasuredWidth() + r4.leftMargin) + bk(viewS)) + fMax);
                    i21 = i8 + 1;
                    i11 = i23;
                    i17 = i26;
                    i20 = i25;
                    i15 = 1;
                }
                i2 = i11;
                qdzVar.c += this.n.i;
                i5 = qdwVar.g;
                z = zK;
            } else {
                i2 = i11;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i28 = this.D;
                int i29 = qdzVar.e;
                if (qdzVar.i == -1) {
                    int i30 = qdwVar.g;
                    i4 = i29 + i30;
                    i3 = i29 - i30;
                } else {
                    i3 = i29;
                    i4 = i3;
                }
                int i31 = qdzVar.d;
                int i32 = i28 - paddingBottom;
                float f3 = this.o.d;
                float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i33 = qdwVar.h;
                float measuredHeight = i32 - f3;
                float f4 = paddingTop - f3;
                int i34 = i31;
                int i35 = 0;
                while (i34 < i31 + i33) {
                    int i36 = i31;
                    View viewS2 = s(i34);
                    int i37 = i33;
                    ul ulVar2 = this.g;
                    float f5 = f4;
                    boolean z2 = zK;
                    long j2 = ((long[]) ulVar2.c)[i34];
                    int i38 = (int) j2;
                    int iO2 = ul.o(j2);
                    if (bJ(viewS2, i38, iO2, (LayoutParams) viewS2.getLayoutParams())) {
                        viewS2.measure(i38, iO2);
                    }
                    float fBn = f5 + r5.topMargin + bn(viewS2);
                    float fBh = measuredHeight - (r5.rightMargin + bh(viewS2));
                    if (qdzVar.i == 1) {
                        aG(viewS2, h);
                        super.aF(viewS2, -1, false);
                    } else {
                        aG(viewS2, h);
                        super.aF(viewS2, i35, false);
                        i35++;
                    }
                    int i39 = i35;
                    int iBk = i3 + bk(viewS2);
                    int iBm = i4 - bm(viewS2);
                    boolean z3 = this.c;
                    boolean z4 = this.k;
                    if (!z3) {
                        i6 = i36;
                        i7 = i37;
                        if (z4) {
                            ulVar2.l(viewS2, qdwVar, false, iBk, Math.round(fBh) - viewS2.getMeasuredHeight(), iBk + viewS2.getMeasuredWidth(), Math.round(fBh));
                        } else {
                            ulVar2.l(viewS2, qdwVar, false, iBk, Math.round(fBn), iBk + viewS2.getMeasuredWidth(), Math.round(fBn) + viewS2.getMeasuredHeight());
                        }
                    } else if (z4) {
                        i7 = i37;
                        i6 = i36;
                        ulVar2.l(viewS2, qdwVar, true, iBm - viewS2.getMeasuredWidth(), Math.round(fBh) - viewS2.getMeasuredHeight(), iBm, Math.round(fBh));
                    } else {
                        i6 = i36;
                        i7 = i37;
                        ulVar2.l(viewS2, qdwVar, true, iBm - viewS2.getMeasuredWidth(), Math.round(fBn), iBm, Math.round(fBn) + viewS2.getMeasuredHeight());
                    }
                    float measuredHeight2 = fBn + viewS2.getMeasuredHeight() + r5.topMargin + bh(viewS2) + fMax2;
                    measuredHeight = fBh - (((viewS2.getMeasuredHeight() + r5.bottomMargin) + bn(viewS2)) + fMax2);
                    i34++;
                    i31 = i6;
                    zK = z2;
                    i35 = i39;
                    i33 = i7;
                    f4 = measuredHeight2;
                }
                z = zK;
                qdzVar.c += this.n.i;
                i5 = qdwVar.g;
            }
            i13 += i5;
            if (z || !this.c) {
                qdzVar.e += qdwVar.g * qdzVar.i;
            } else {
                qdzVar.e -= qdwVar.g * qdzVar.i;
            }
            i12 -= qdwVar.g;
            i11 = i2;
            zK = z;
        }
        int i40 = i11;
        int i41 = qdzVar.a - i13;
        qdzVar.a = i41;
        int i42 = qdzVar.f;
        if (i42 != Integer.MIN_VALUE) {
            int i43 = i42 + i13;
            qdzVar.f = i43;
            if (i41 < 0) {
                qdzVar.f = i43 + i41;
            }
            at(meVar, qdzVar);
        }
        return i40 - qdzVar.a;
    }

    private final int T(int i, me meVar, ml mlVar, boolean z) {
        int iX;
        int iF;
        if (K() || !this.c) {
            int iF2 = this.e.f() - i;
            if (iF2 <= 0) {
                return 0;
            }
            iX = -X(-iF2, meVar, mlVar);
        } else {
            int iJ = i - this.e.j();
            if (iJ <= 0) {
                return 0;
            }
            iX = X(iJ, meVar, mlVar);
        }
        int i2 = i + iX;
        if (!z || (iF = this.e.f() - i2) <= 0) {
            return iX;
        }
        this.e.n(iF);
        return iF + iX;
    }

    private final int V(int i, me meVar, ml mlVar, boolean z) {
        int iX;
        int iJ;
        if (K() || !this.c) {
            int iJ2 = i - this.e.j();
            if (iJ2 <= 0) {
                return 0;
            }
            iX = -X(iJ2, meVar, mlVar);
        } else {
            int iF = this.e.f() - i;
            if (iF <= 0) {
                return 0;
            }
            iX = X(-iF, meVar, mlVar);
        }
        int i2 = i + iX;
        if (!z || (iJ = i2 - this.e.j()) <= 0) {
            return iX;
        }
        this.e.n(-iJ);
        return iX - iJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int X(int r20, defpackage.me r21, defpackage.ml r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.X(int, me, ml):int");
    }

    private final int Y(int i) {
        if (av() == 0 || i == 0) {
            return 0;
        }
        aq();
        boolean zK = K();
        View view = this.L;
        int width = zK ? view.getWidth() : view.getHeight();
        int i2 = zK ? this.C : this.D;
        if (ay() == 1) {
            int iAbs = Math.abs(i);
            qdy qdyVar = this.o;
            if (i < 0) {
                return -Math.min((i2 + qdyVar.d) - width, iAbs);
            }
            int i3 = qdyVar.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            qdy qdyVar2 = this.o;
            if (i > 0) {
                return Math.min((i2 - qdyVar2.d) - width, i);
            }
            int i4 = qdyVar2.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    private final View aa(int i) {
        View viewAj = aj(0, av(), i);
        if (viewAj == null) {
            return null;
        }
        ul ulVar = this.g;
        int i2 = ((int[]) ulVar.e)[bl(viewAj)];
        if (i2 != -1) {
            return ac(viewAj, (qdw) this.d.get(i2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View ac(android.view.View r6, defpackage.qdw r7) {
        /*
            r5 = this;
            boolean r0 = r5.K()
            int r7 = r7.h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3e
            android.view.View r2 = r5.aD(r1)
            if (r2 == 0) goto L3b
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L3b
            boolean r3 = r5.c
            if (r3 == 0) goto L2c
            if (r0 != 0) goto L2c
            lq r3 = r5.e
            int r3 = r3.a(r6)
            lq r4 = r5.e
            int r4 = r4.a(r2)
            if (r3 >= r4) goto L3b
            goto L3a
        L2c:
            lq r3 = r5.e
            int r3 = r3.d(r6)
            lq r4 = r5.e
            int r4 = r4.d(r2)
            if (r3 <= r4) goto L3b
        L3a:
            r6 = r2
        L3b:
            int r1 = r1 + 1
            goto L7
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.ac(android.view.View, qdw):android.view.View");
    }

    private final View ae(int i) {
        View viewAj = aj(av() - 1, -1, i);
        if (viewAj == null) {
            return null;
        }
        return af(viewAj, (qdw) this.d.get(((int[]) this.g.e)[bl(viewAj)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View af(android.view.View r6, defpackage.qdw r7) {
        /*
            r5 = this;
            boolean r0 = r5.K()
            int r1 = r5.av()
            int r1 = r1 + (-2)
            int r2 = r5.av()
            int r7 = r7.h
            int r2 = r2 - r7
        L11:
            int r7 = r2 + (-1)
            if (r1 <= r7) goto L4a
            android.view.View r7 = r5.aD(r1)
            if (r7 == 0) goto L47
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 == r4) goto L47
            boolean r3 = r5.c
            if (r3 == 0) goto L38
            if (r0 != 0) goto L38
            lq r3 = r5.e
            int r3 = r3.d(r6)
            lq r4 = r5.e
            int r4 = r4.d(r7)
            if (r3 <= r4) goto L47
            goto L46
        L38:
            lq r3 = r5.e
            int r3 = r3.a(r6)
            lq r4 = r5.e
            int r4 = r4.a(r7)
            if (r3 >= r4) goto L47
        L46:
            r6 = r7
        L47:
            int r1 = r1 + (-1)
            goto L11
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.af(android.view.View, qdw):android.view.View");
    }

    private final View aj(int i, int i2, int i3) {
        int iBl;
        aq();
        ap();
        int iJ = this.e.j();
        int iF = this.e.f();
        View view = null;
        int i4 = i;
        View view2 = null;
        while (i4 != i2) {
            View viewAD = aD(i4);
            if (viewAD != null && (iBl = bl(viewAD)) >= 0 && iBl < i3) {
                if (((ma) viewAD.getLayoutParams()).fR()) {
                    if (view2 == null) {
                        view2 = viewAD;
                    }
                } else {
                    if (this.e.d(viewAD) >= iJ && this.e.a(viewAD) <= iF) {
                        return viewAD;
                    }
                    if (view == null) {
                        view = viewAD;
                    }
                }
            }
            i4 += i2 > i ? 1 : -1;
        }
        return view != null ? view : view2;
    }

    private final void al() {
        this.d.clear();
        qdy qdyVar = this.o;
        qdyVar.b();
        qdyVar.d = 0;
    }

    private final void ap() {
        if (this.n == null) {
            this.n = new qdz();
        }
    }

    private final void aq() {
        if (this.e != null) {
            return;
        }
        boolean zK = K();
        int i = this.b;
        if (zK) {
            if (i == 0) {
                this.e = new lo(this);
                this.f = new lp(this);
                return;
            } else {
                this.e = new lp(this);
                this.f = new lo(this);
                return;
            }
        }
        if (i == 0) {
            this.e = new lp(this);
            this.f = new lo(this);
        } else {
            this.e = new lo(this);
            this.f = new lp(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void at(defpackage.me r12, defpackage.qdz r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.at(me, qdz):void");
    }

    private final void bE(me meVar, int i, int i2) {
        while (i2 >= i) {
            aT(i2, meVar);
            i2--;
        }
    }

    private final void bF() {
        int i = K() ? this.B : this.A;
        qdz qdzVar = this.n;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        qdzVar.b = z;
    }

    private final void bG(int i) {
        if (i >= L()) {
            return;
        }
        int iAv = av();
        ul ulVar = this.g;
        ulVar.i(iAv);
        ulVar.j(iAv);
        ulVar.h(iAv);
        if (i < ((int[]) ulVar.e).length) {
            this.M = i;
            View viewAD = aD(0);
            if (viewAD != null) {
                this.q = bl(viewAD);
                if (K() || !this.c) {
                    this.G = this.e.d(viewAD) - this.e.j();
                } else {
                    this.G = this.e.a(viewAD) + this.e.g();
                }
            }
        }
    }

    private final void bH(qdy qdyVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            bF();
        } else {
            this.n.b = false;
        }
        if (K() || !this.c) {
            this.n.a = this.e.f() - qdyVar.c;
        } else {
            this.n.a = qdyVar.c - getPaddingRight();
        }
        qdz qdzVar = this.n;
        qdzVar.d = qdyVar.a;
        qdzVar.h = 1;
        qdz qdzVar2 = this.n;
        qdzVar2.i = 1;
        qdzVar2.e = qdyVar.c;
        qdzVar2.f = Integer.MIN_VALUE;
        qdzVar2.c = qdyVar.b;
        if (!z || this.d.size() <= 1 || (i = qdyVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        qdw qdwVar = (qdw) this.d.get(qdyVar.b);
        qdz qdzVar3 = this.n;
        qdzVar3.c++;
        qdzVar3.d += qdwVar.h;
    }

    private final void bI(qdy qdyVar, boolean z, boolean z2) {
        if (z2) {
            bF();
        } else {
            this.n.b = false;
        }
        if (K() || !this.c) {
            this.n.a = qdyVar.c - this.e.j();
        } else {
            this.n.a = (this.L.getWidth() - qdyVar.c) - this.e.j();
        }
        qdz qdzVar = this.n;
        qdzVar.d = qdyVar.a;
        qdzVar.h = 1;
        qdz qdzVar2 = this.n;
        qdzVar2.i = -1;
        qdzVar2.e = qdyVar.c;
        qdzVar2.f = Integer.MIN_VALUE;
        qdzVar2.c = qdyVar.b;
        if (!z || qdyVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = qdyVar.b;
        if (size > i) {
            qdw qdwVar = (qdw) this.d.get(i);
            r2.c--;
            this.n.d -= qdwVar.h;
        }
    }

    private final boolean bJ(View view, int i, int i2, ma maVar) {
        return (!view.isLayoutRequested() && this.w && roc.ab(view.getWidth(), i, maVar.width) && roc.ab(view.getHeight(), i2, maVar.height)) ? false : true;
    }

    private final View bK(int i, int i2) {
        int i3 = i;
        while (i3 != i2) {
            View viewAD = aD(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.C - getPaddingRight();
            int paddingBottom = this.D - getPaddingBottom();
            int iBB = bB(viewAD) - ((ma) viewAD.getLayoutParams()).leftMargin;
            int iBD = bD(viewAD) - ((ma) viewAD.getLayoutParams()).topMargin;
            int iBC = bC(viewAD) + ((ma) viewAD.getLayoutParams()).rightMargin;
            int iBA = bA(viewAD) + ((ma) viewAD.getLayoutParams()).bottomMargin;
            int i4 = 1;
            boolean z = iBB >= paddingRight || iBC >= paddingLeft;
            boolean z2 = iBD >= paddingBottom || iBA >= paddingTop;
            if (z && z2) {
                return viewAD;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    @Override // defpackage.lz
    public final void A(int i, int i2) {
        bG(Math.min(i, i2));
    }

    @Override // defpackage.lz
    public final void B(int i, int i2) {
        bG(i);
    }

    @Override // defpackage.lz
    public final void C(int i, int i2) {
        bv(i);
        bG(i);
    }

    @Override // defpackage.lz
    public final int D(ml mlVar) {
        return N(mlVar);
    }

    @Override // defpackage.lz
    public final int E(ml mlVar) {
        return Q(mlVar);
    }

    @Override // defpackage.lz
    public final int F(ml mlVar) {
        return R(mlVar);
    }

    @Override // defpackage.lz
    public final int G(ml mlVar) {
        return N(mlVar);
    }

    @Override // defpackage.lz
    public final int H(ml mlVar) {
        return Q(mlVar);
    }

    @Override // defpackage.lz
    public final int I(ml mlVar) {
        return R(mlVar);
    }

    @Override // defpackage.qdv
    public final void J(int i, View view) {
        this.J.put(i, view);
    }

    @Override // defpackage.qdv
    public final boolean K() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final int L() {
        View viewBK = bK(av() - 1, -1);
        if (viewBK == null) {
            return -1;
        }
        return bl(viewBK);
    }

    public final void M(int i) {
        if (this.a != i) {
            aP();
            this.a = i;
            this.e = null;
            this.f = null;
            al();
            aV();
        }
    }

    @Override // defpackage.mj
    public final PointF O(int i) {
        View viewAD;
        if (av() == 0 || (viewAD = aD(0)) == null) {
            return null;
        }
        float f = i < bl(viewAD) ? -1 : 1;
        return K() ? new PointF(BitmapDescriptorFactory.HUE_RED, f) : new PointF(f, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.lz
    public final Parcelable P() {
        SavedState savedState = this.p;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (av() <= 0) {
            savedState2.a();
            return savedState2;
        }
        View viewAD = aD(0);
        savedState2.a = bl(viewAD);
        savedState2.b = this.e.d(viewAD) - this.e.j();
        return savedState2;
    }

    @Override // defpackage.qdv
    public final int a() {
        return 5;
    }

    @Override // defpackage.lz
    public final void aM(RecyclerView recyclerView) {
        this.L = (View) recyclerView.getParent();
    }

    @Override // defpackage.lz
    public final void ab(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p = (SavedState) parcelable;
            aV();
        }
    }

    @Override // defpackage.lz
    public final void ad(int i) {
        this.q = i;
        this.G = Integer.MIN_VALUE;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    @Override // defpackage.lz
    public final boolean ag() {
        if (this.b == 0) {
            return K();
        }
        if (!K()) {
            return true;
        }
        int i = this.C;
        View view = this.L;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // defpackage.lz
    public final boolean ah() {
        if (this.b == 0) {
            return !K();
        }
        if (!K()) {
            int i = this.D;
            View view = this.L;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lz
    public final boolean ai() {
        return true;
    }

    @Override // defpackage.lz
    public final void as(RecyclerView recyclerView, int i) {
        mk mkVar = new mk(recyclerView.getContext());
        mkVar.b = i;
        bc(mkVar);
    }

    @Override // defpackage.qdv
    public final int b() {
        return this.i;
    }

    @Override // defpackage.lz
    public final void bt() {
        aP();
    }

    @Override // defpackage.lz
    public final void bv(int i) {
        bG(i);
    }

    @Override // defpackage.qdv
    public final int c(int i, int i2, int i3) {
        return aw(this.D, this.B, i2, i3, ah());
    }

    @Override // defpackage.lz
    public final int d(int i, me meVar, ml mlVar) {
        if (!K() || this.b == 0) {
            int iX = X(i, meVar, mlVar);
            this.J.clear();
            return iX;
        }
        int iY = Y(i);
        this.o.d += iY;
        this.f.n(-iY);
        return iY;
    }

    @Override // defpackage.lz
    public final int e(int i, me meVar, ml mlVar) {
        if (K() || (this.b == 0 && !K())) {
            int iX = X(i, meVar, mlVar);
            this.J.clear();
            return iX;
        }
        int iY = Y(i);
        this.o.d += iY;
        this.f.n(-iY);
        return iY;
    }

    @Override // defpackage.lz
    public final ma f() {
        return new LayoutParams();
    }

    @Override // defpackage.qdv
    public final int g(int i, int i2, int i3) {
        return aw(this.C, this.A, i2, i3, ag());
    }

    @Override // defpackage.lz
    public final ma h(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // defpackage.qdv
    public final int i(View view) {
        int iBk;
        int iBm;
        if (K()) {
            iBk = bn(view);
            iBm = bh(view);
        } else {
            iBk = bk(view);
            iBm = bm(view);
        }
        return iBk + iBm;
    }

    @Override // defpackage.qdv
    public final int j(View view, int i, int i2) {
        int iBn;
        int iBh;
        if (K()) {
            iBn = bk(view);
            iBh = bm(view);
        } else {
            iBn = bn(view);
            iBh = bh(view);
        }
        return iBn + iBh;
    }

    @Override // defpackage.qdv
    public final int k() {
        return this.a;
    }

    @Override // defpackage.qdv
    public final int l() {
        return this.m.a();
    }

    @Override // defpackage.qdv
    public final int m() {
        return this.b;
    }

    @Override // defpackage.qdv
    public final int n() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((qdw) this.d.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.qdv
    public final int o() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016c  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.me r18, defpackage.ml r19) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.p(me, ml):void");
    }

    @Override // defpackage.lz
    public final void q(ml mlVar) {
        this.p = null;
        this.q = -1;
        this.G = Integer.MIN_VALUE;
        this.M = -1;
        this.o.b();
        this.J.clear();
    }

    @Override // defpackage.qdv
    public final int r() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((qdw) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.qdv
    public final View s(int i) {
        View view = (View) this.J.get(i);
        return view != null ? view : this.l.n(i);
    }

    @Override // defpackage.qdv
    public final View t(int i) {
        return s(i);
    }

    @Override // defpackage.lz
    public final boolean u(ma maVar) {
        return maVar instanceof LayoutParams;
    }

    @Override // defpackage.qdv
    public final List v() {
        return this.d;
    }

    @Override // defpackage.qdv
    public final void w(View view, int i, int i2, qdw qdwVar) {
        aG(view, h);
        if (K()) {
            int iBk = bk(view) + bm(view);
            qdwVar.e += iBk;
            qdwVar.f += iBk;
        } else {
            int iBn = bn(view) + bh(view);
            qdwVar.e += iBn;
            qdwVar.f += iBn;
        }
    }

    @Override // defpackage.lz
    public final void y(int i, int i2) {
        bG(i);
    }

    @Override // defpackage.qdv
    public final void z(List list) {
        this.d = list;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new khy(17);
        public int a;
        public int b;

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        public final void a() {
            this.a = -1;
        }

        public final boolean b(int i) {
            int i2 = this.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
        }

        public SavedState() {
        }
    }

    @Override // defpackage.lz
    public final void ar(RecyclerView recyclerView) {
    }

    @Override // defpackage.qdv
    public final void x(qdw qdwVar) {
    }

    public static class LayoutParams extends ma implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new khy(16);
        private float a;
        private float b;
        private int g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = BitmapDescriptorFactory.HUE_RED;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void p(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void q(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = BitmapDescriptorFactory.HUE_RED;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        public LayoutParams() {
            super(-2, -2);
            this.a = BitmapDescriptorFactory.HUE_RED;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }
    }
}

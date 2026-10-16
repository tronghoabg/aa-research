package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.edf;
import defpackage.edg;
import defpackage.erb;
import defpackage.kx;
import defpackage.la;
import defpackage.ld;
import defpackage.le;
import defpackage.lf;
import defpackage.lt;
import defpackage.ma;
import defpackage.me;
import defpackage.ml;
import defpackage.roc;
import defpackage.rz;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    final Rect g;
    int h;
    int i;
    final rz j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.j = new rz((byte[]) null);
        this.g = new Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        s(aB(context, attributeSet, i, i2).b);
    }

    private final int bE(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.s;
            return bG(recyclerView.e, recyclerView.N, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bH(recyclerView2.e, recyclerView2.N, i);
    }

    private final int bF(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.s;
            return bG(recyclerView.e, recyclerView.N, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bH(recyclerView2.e, recyclerView2.N, i);
    }

    private final int bG(me meVar, ml mlVar, int i) {
        if (mlVar.g) {
            int iA = meVar.a(i);
            if (iA == -1) {
                Log.w("GridLayoutManager", a.bp(i, "Cannot find span size for pre layout position. "));
                return 0;
            }
            i = iA;
        }
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        return i3 > i2 ? i5 + 1 : i5;
    }

    private final int bH(me meVar, ml mlVar, int i) {
        if (!mlVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = meVar.a(i);
        if (iA != -1) {
            return iA % this.b;
        }
        Log.w("GridLayoutManager", a.bp(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bI(me meVar, ml mlVar, int i) {
        if (!mlVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (meVar.a(i) == -1) {
            Log.w("GridLayoutManager", a.bp(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        }
        return 1;
    }

    private final View bJ(View view, int i, me meVar, ml mlVar) {
        int i2;
        int i3;
        int iAv;
        int i4;
        int iAv2;
        int i5;
        View view2 = view;
        me meVar2 = meVar;
        ml mlVar2 = mlVar;
        if (view2 != null) {
            la laVar = (la) view2.getLayoutParams();
            i3 = laVar.a;
            i2 = laVar.b + i3;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (super.V(i, meVar2, mlVar2) == null) {
            return null;
        }
        int i6 = -1;
        if ((J(i) == 1) != this.m) {
            iAv2 = av() - 1;
            iAv = -1;
            i4 = -1;
        } else {
            iAv = av();
            i4 = 1;
            iAv2 = 0;
        }
        boolean z = this.k == 1 && aj();
        int iBG = bG(meVar2, mlVar2, iAv2);
        View view3 = null;
        View view4 = null;
        int i7 = -1;
        int iMin = 0;
        int iMin2 = 0;
        while (iAv2 != iAv) {
            int iBG2 = bG(meVar2, mlVar2, iAv2);
            View viewAD = aD(iAv2);
            if (viewAD == view2) {
                break;
            }
            if (viewAD.hasFocusable() && iBG2 != iBG) {
                if (view3 != null) {
                    break;
                }
                i5 = iAv2;
                view3 = null;
            } else {
                la laVar2 = (la) viewAD.getLayoutParams();
                int i8 = laVar2.a;
                i5 = iAv2;
                int i9 = laVar2.b + i8;
                if (view != null && viewAD.hasFocusable() && i8 == i3 && i9 == i2) {
                    return viewAD;
                }
                if (viewAD.hasFocusable() && view3 == null) {
                    view3 = null;
                } else if (viewAD.hasFocusable() || view4 != null) {
                    if (view != null) {
                        int iMin3 = Math.min(i9, i2) - Math.max(i8, i3);
                        if (viewAD.hasFocusable()) {
                            if (iMin3 <= iMin) {
                                if (iMin3 == iMin) {
                                    if (z == (i8 > i6)) {
                                    }
                                }
                            }
                        } else if (view3 == null && bp(viewAD)) {
                            if (iMin3 <= iMin2) {
                                if (iMin3 == iMin2) {
                                    if (z == (i8 > i7)) {
                                    }
                                }
                            }
                        }
                    } else if (viewAD.hasFocusable()) {
                        if (z == (i8 > i6)) {
                        }
                    } else if (view3 == null && bp(viewAD)) {
                        if (z == (i8 > i7)) {
                        }
                    }
                }
                if (viewAD.hasFocusable()) {
                    int i10 = laVar2.a;
                    iMin = Math.min(i9, i2) - Math.max(i8, i3);
                    view3 = viewAD;
                    i6 = i10;
                } else {
                    int i11 = laVar2.a;
                    iMin2 = Math.min(i9, i2) - Math.max(i8, i3);
                    view4 = viewAD;
                    i7 = i11;
                }
            }
            iAv2 = i5 + i4;
            view2 = view;
            meVar2 = meVar;
            mlVar2 = mlVar;
        }
        return view3 != null ? view3 : view4;
    }

    private final Set bK(int i) {
        return bM(bE(i), i);
    }

    private final Set bL(int i) {
        return bM(bF(i), i);
    }

    private final Set bM(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int iBI = bI(recyclerView.e, recyclerView.N, i2);
        for (int i3 = i; i3 < i + iBI; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bN(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bO() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bP(View view, int i, boolean z) {
        int iAw;
        int iAw2;
        la laVar = (la) view.getLayoutParams();
        Rect rect = laVar.d;
        int i2 = rect.top + rect.bottom + laVar.topMargin + laVar.bottomMargin;
        int i3 = rect.left + rect.right + laVar.leftMargin + laVar.rightMargin;
        int iC = c(laVar.a, laVar.b);
        if (this.k == 1) {
            iAw2 = aw(iC, i, i3, laVar.width, false);
            iAw = aw(this.l.k(), this.B, i2, laVar.height, true);
        } else {
            int iAw3 = aw(iC, i, i2, laVar.height, false);
            int iAw4 = aw(this.l.k(), this.A, i3, laVar.width, true);
            iAw = iAw3;
            iAw2 = iAw4;
        }
        bQ(view, iAw2, iAw, z);
    }

    private final void bQ(View view, int i, int i2, boolean z) {
        boolean zBg;
        ma maVar = (ma) view.getLayoutParams();
        if (z) {
            zBg = true;
            if (this.w && roc.ab(view.getMeasuredWidth(), i, maVar.width) && roc.ab(view.getMeasuredHeight(), i2, maVar.height)) {
                zBg = false;
            }
        } else {
            zBg = bg(view, i, i2, maVar);
        }
        if (zBg) {
            view.measure(i, i2);
        }
    }

    private final void bR() {
        int paddingBottom;
        int paddingTop;
        if (this.k == 1) {
            paddingBottom = this.C - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.D - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        bN(paddingBottom - paddingTop);
    }

    @Override // defpackage.lz
    public final void A(int i, int i2) {
        rz rzVar = this.j;
        rzVar.c();
        rzVar.b();
    }

    @Override // defpackage.lz
    public final void B(int i, int i2) {
        rz rzVar = this.j;
        rzVar.c();
        rzVar.b();
    }

    @Override // defpackage.lz
    public final void C(int i, int i2) {
        rz rzVar = this.j;
        rzVar.c();
        rzVar.b();
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !aj()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final int d(int i, me meVar, ml mlVar) {
        bR();
        bO();
        return super.d(i, meVar, mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final int e(int i, me meVar, ml mlVar) {
        bR();
        bO();
        return super.e(i, meVar, mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final ma f() {
        return this.k == 0 ? new la(-2, -1) : new la(-1, -2);
    }

    @Override // defpackage.lz
    public final int fS(me meVar, ml mlVar) {
        if (this.k == 1) {
            return Math.min(this.b, ax());
        }
        if (mlVar.a() <= 0) {
            return 0;
        }
        return bG(meVar, mlVar, mlVar.a() - 1) + 1;
    }

    @Override // defpackage.lz
    public final int fT(me meVar, ml mlVar) {
        if (this.k == 0) {
            return Math.min(this.b, ax());
        }
        if (mlVar.a() <= 0) {
            return 0;
        }
        return bG(meVar, mlVar, mlVar.a() - 1) + 1;
    }

    @Override // defpackage.lz
    public final ma fU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new la((ViewGroup.MarginLayoutParams) layoutParams) : new la(layoutParams);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public View fV(int i, me meVar, ml mlVar) {
        int iJ;
        ac();
        if (av() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Y();
        int iA = (iJ == -1) ^ this.m ? mlVar.a() - 1 : 0;
        if (U(iA) != null) {
            as(this.s, iA);
        } else {
            this.n = iA;
            p(meVar, mlVar);
        }
        View viewQ = iJ == -1 ? Q() : R();
        return (viewQ == null || !viewQ.hasFocusable()) ? bJ(null, i, meVar, mlVar) : viewQ;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final View fW(View view, int i, me meVar, ml mlVar) {
        View viewAC = aC(view);
        if (viewAC == null) {
            return null;
        }
        return bJ(viewAC, i, meVar, mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final void fX(me meVar, ml mlVar, edg edgVar) {
        super.fX(meVar, mlVar, edgVar);
        edgVar.r(GridView.class.getName());
        lt ltVar = this.s.m;
        if (ltVar == null || ltVar.a() <= 1) {
            return;
        }
        edgVar.h(edf.o);
    }

    @Override // defpackage.lz
    public final void fY(me meVar, ml mlVar, View view, edg edgVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof la)) {
            super.aN(view, edgVar);
            return;
        }
        la laVar = (la) layoutParams;
        int iBG = bG(meVar, mlVar, laVar.fP());
        if (this.k == 0) {
            edgVar.u(erb.y(laVar.a, laVar.b, iBG, 1, false));
        } else {
            edgVar.u(erb.y(iBG, 1, laVar.a, laVar.b, false));
        }
    }

    @Override // defpackage.lz
    public final void fZ(Rect rect, int i, int i2) {
        int iAu;
        int iAu2;
        if (this.c == null) {
            super.fZ(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.k == 1) {
            iAu2 = au(i2, rect.height() + paddingTop, az());
            iAu = au(i, this.c[r7.length - 1] + paddingLeft, aA());
        } else {
            iAu = au(i, rect.width() + paddingLeft, aA());
            iAu2 = au(i2, this.c[r5.length - 1] + paddingTop, az());
        }
        aZ(iAu, iAu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259 A[EDGE_INSN: B:195:0x0259->B:153:0x0259 BREAK  A[LOOP:2: B:117:0x019c->B:126:0x01c6, LOOP_LABEL: LOOP:2: B:117:0x019c->B:126:0x01c6], EDGE_INSN: B:201:0x0259->B:153:0x0259 BREAK  A[LOOP:5: B:135:0x01fe->B:146:0x022d, LOOP_LABEL: LOOP:5: B:135:0x01fe->B:146:0x022d]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0268  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ga(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.ga(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final boolean gb() {
        return this.p == null && !this.a;
    }

    @Override // defpackage.lz
    public final void gc() {
        rz rzVar = this.j;
        rzVar.c();
        rzVar.b();
    }

    @Override // defpackage.lz
    public final ma h(Context context, AttributeSet attributeSet) {
        return new la(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(me meVar, ml mlVar, boolean z, boolean z2) {
        int i;
        int iAv;
        int i2;
        int iAv2 = av();
        if (z2) {
            i = -1;
            iAv = av() - 1;
            i2 = -1;
        } else {
            i = iAv2;
            iAv = 0;
            i2 = 1;
        }
        int iA = mlVar.a();
        Y();
        int iJ = this.l.j();
        int iF = this.l.f();
        View view = null;
        View view2 = null;
        while (iAv != i) {
            View viewAD = aD(iAv);
            int iBl = bl(viewAD);
            if (iBl >= 0 && iBl < iA && bH(meVar, mlVar, iBl) == 0) {
                if (((ma) viewAD.getLayoutParams()).fR()) {
                    if (view2 == null) {
                        view2 = viewAD;
                    }
                } else {
                    if (this.l.d(viewAD) < iF && this.l.a(viewAD) >= iJ) {
                        return viewAD;
                    }
                    if (view == null) {
                        view = viewAD;
                    }
                }
            }
            iAv += i2;
        }
        return view != null ? view : view2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(me meVar, ml mlVar, lf lfVar, le leVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int iC2;
        int paddingLeft;
        int i4;
        int iAw;
        int iAw2;
        boolean z;
        View viewA;
        int i5 = this.l.i();
        int i6 = av() > 0 ? this.c[this.b] : 0;
        boolean z2 = i5 != 1073741824;
        if (z2) {
            bR();
        }
        int i7 = lfVar.e;
        int iBH = this.b;
        if (i7 != 1) {
            iBH = bH(meVar, mlVar, lfVar.d) + bI(meVar, mlVar, lfVar.d);
        }
        int i8 = 0;
        while (i8 < this.b && lfVar.c(mlVar) && iBH > 0) {
            int i9 = lfVar.d;
            int iBI = bI(meVar, mlVar, i9);
            if (iBI > this.b) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iBI + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBH -= iBI;
            if (iBH < 0 || (viewA = lfVar.a(meVar)) == null) {
                break;
            }
            this.d[i8] = viewA;
            i8++;
        }
        if (i8 == 0) {
            leVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = 1;
            i2 = i8;
            i = 0;
        } else {
            i = i8 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i10 = 0;
        while (i != i2) {
            View view = this.d[i];
            la laVar = (la) view.getLayoutParams();
            int iBI2 = bI(meVar, mlVar, bl(view));
            laVar.b = iBI2;
            laVar.a = i10;
            i10 += iBI2;
            i += i3;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.d[i12];
            if (lfVar.l != null) {
                z = false;
                if (i7 == 1) {
                    super.aF(view2, -1, true);
                } else {
                    super.aF(view2, 0, true);
                }
            } else if (i7 == 1) {
                z = false;
                super.aF(view2, -1, false);
            } else {
                z = false;
                super.aF(view2, 0, false);
            }
            aG(view2, this.g);
            bP(view2, i5, z);
            int iB = this.l.b(view2);
            if (iB > i11) {
                i11 = iB;
            }
            float fC = this.l.c(view2) / ((la) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            bN(Math.max(Math.round(f * this.b), i6));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.d[i13];
                bP(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i11) {
                    i11 = iB2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.d[i14];
            if (this.l.b(view4) != i11) {
                la laVar2 = (la) view4.getLayoutParams();
                Rect rect = laVar2.d;
                int i15 = rect.top + rect.bottom + laVar2.topMargin + laVar2.bottomMargin;
                int i16 = rect.left + rect.right + laVar2.leftMargin + laVar2.rightMargin;
                int iC3 = c(laVar2.a, laVar2.b);
                if (this.k == 1) {
                    iAw2 = aw(iC3, 1073741824, i16, laVar2.width, false);
                    iAw = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iAw = aw(iC3, 1073741824, i15, laVar2.height, false);
                    iAw2 = iMakeMeasureSpec;
                }
                bQ(view4, iAw2, iAw, true);
            }
        }
        leVar.a = i11;
        if (this.k == 1) {
            if (lfVar.f == -1) {
                int i17 = lfVar.b;
                i4 = i17 - i11;
                iC2 = i17;
            } else {
                i4 = lfVar.b;
                iC2 = i4 + i11;
            }
            paddingLeft = 0;
            iC = 0;
        } else {
            if (lfVar.f == -1) {
                int i18 = lfVar.b;
                paddingLeft = i18 - i11;
                iC2 = 0;
                iC = i18;
            } else {
                int i19 = lfVar.b;
                iC = i19 + i11;
                iC2 = 0;
                paddingLeft = i19;
            }
            i4 = iC2;
        }
        int i20 = 0;
        while (true) {
            View[] viewArr = this.d;
            if (i20 >= i8) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i20];
            la laVar3 = (la) view5.getLayoutParams();
            if (this.k != 1) {
                int paddingTop = getPaddingTop() + this.c[laVar3.a];
                i4 = paddingTop;
                iC2 = this.l.c(view5) + paddingTop;
            } else if (aj()) {
                int paddingLeft2 = getPaddingLeft() + this.c[this.b - laVar3.a];
                iC = paddingLeft2;
                paddingLeft = paddingLeft2 - this.l.c(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.c[laVar3.a];
                iC = this.l.c(view5) + paddingLeft;
            }
            br(view5, paddingLeft, i4, iC, iC2);
            if (laVar3.fR() || laVar3.fQ()) {
                leVar.c = true;
            }
            leVar.d = view5.hasFocusable() | leVar.d;
            i20++;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void m(me meVar, ml mlVar, ld ldVar, int i) {
        bR();
        if (mlVar.a() > 0 && !mlVar.g) {
            int iBH = bH(meVar, mlVar, ldVar.b);
            if (i == 1) {
                while (iBH > 0) {
                    int i2 = ldVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ldVar.b = i3;
                    iBH = bH(meVar, mlVar, i3);
                }
            } else {
                int iA = mlVar.a() - 1;
                int i4 = ldVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBH2 = bH(meVar, mlVar, i5);
                    if (iBH2 <= iBH) {
                        break;
                    }
                    i4 = i5;
                    iBH = iBH2;
                }
                ldVar.b = i4;
            }
        }
        bO();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final void p(me meVar, ml mlVar) {
        if (mlVar.g) {
            int iAv = av();
            for (int i = 0; i < iAv; i++) {
                la laVar = (la) aD(i).getLayoutParams();
                int iFP = laVar.fP();
                this.e.put(iFP, laVar.b);
                this.f.put(iFP, laVar.a);
            }
        }
        super.aa(meVar, mlVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final void q(ml mlVar) {
        View viewU;
        super.q(mlVar);
        this.a = false;
        int i = this.H;
        if (i == -1 || (viewU = U(i)) == null) {
            return;
        }
        viewU.sendAccessibilityEvent(67108864);
        this.H = -1;
    }

    public final void s(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException(a.bp(i, "Span count should be at least 1. Provided "));
        }
        this.b = i;
        this.j.c();
        aV();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void t(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.t(false);
    }

    @Override // defpackage.lz
    public final boolean u(ma maVar) {
        return maVar instanceof la;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void x(ml mlVar, lf lfVar, kx kxVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && lfVar.c(mlVar) && i > 0; i2++) {
            kxVar.a(lfVar.d, Math.max(0, lfVar.g));
            i--;
            lfVar.d += lfVar.e;
        }
    }

    @Override // defpackage.lz
    public final void y(int i, int i2) {
        rz rzVar = this.j;
        rzVar.c();
        rzVar.b();
    }

    public GridLayoutManager(int i) {
        super(1);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.j = new rz((byte[]) null);
        this.g = new Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        s(i);
    }
}

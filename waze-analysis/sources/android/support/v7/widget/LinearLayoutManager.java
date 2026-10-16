package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class LinearLayoutManager extends en implements ez {

    /* renamed from: a, reason: collision with root package name */
    private de f924a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f925b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f926c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f927d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f928e;

    /* renamed from: f, reason: collision with root package name */
    private final dd f929f;

    /* renamed from: g, reason: collision with root package name */
    private int f930g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f931h;

    /* renamed from: k, reason: collision with root package name */
    int f932k;

    /* renamed from: l, reason: collision with root package name */
    dv f933l;
    boolean m;
    int n;
    int o;
    dg p;
    final dc q;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f932k = 1;
        this.f926c = false;
        this.m = false;
        this.f927d = false;
        this.f928e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new dc();
        this.f929f = new dd();
        this.f930g = 2;
        this.f931h = new int[2];
        em emVarAG = aG(context, attributeSet, i2, i3);
        ac(emVarAG.f1406a);
        ad(emVarAG.f1408c);
        v(emVarAG.f1409d);
    }

    private final int bC(int i2, et etVar, fb fbVar, boolean z) {
        int iJ;
        int iJ2 = i2 - this.f933l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i3 = -O(iJ2, etVar, fbVar);
        int i4 = i2 + i3;
        if (!z || (iJ = i4 - this.f933l.j()) <= 0) {
            return i3;
        }
        this.f933l.n(-iJ);
        return i3 - iJ;
    }

    private final View bD() {
        return R(0, as());
    }

    private final View bE() {
        return R(as() - 1, -1);
    }

    private final View bF() {
        return aI(this.m ? 0 : as() - 1);
    }

    private final View bG() {
        return aI(this.m ? as() - 1 : 0);
    }

    private final void bH(et etVar, de deVar) {
        if (!deVar.f1329a || deVar.m) {
            return;
        }
        int i2 = deVar.f1335g;
        int i3 = deVar.f1337i;
        if (deVar.f1334f == -1) {
            int iAs = as();
            if (i2 >= 0) {
                int iE = (this.f933l.e() - i2) + i3;
                if (this.m) {
                    for (int i4 = 0; i4 < iAs; i4++) {
                        View viewAI = aI(i4);
                        if (this.f933l.d(viewAI) < iE || this.f933l.m(viewAI) < iE) {
                            bI(etVar, 0, i4);
                            return;
                        }
                    }
                    return;
                }
                int i5 = iAs - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View viewAI2 = aI(i6);
                    if (this.f933l.d(viewAI2) < iE || this.f933l.m(viewAI2) < iE) {
                        bI(etVar, i5, i6);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i2 >= 0) {
            int i7 = i2 - i3;
            int iAs2 = as();
            if (!this.m) {
                for (int i8 = 0; i8 < iAs2; i8++) {
                    View viewAI3 = aI(i8);
                    if (this.f933l.a(viewAI3) > i7 || this.f933l.l(viewAI3) > i7) {
                        bI(etVar, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = iAs2 - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View viewAI4 = aI(i10);
                if (this.f933l.a(viewAI4) > i7 || this.f933l.l(viewAI4) > i7) {
                    bI(etVar, i9, i10);
                    return;
                }
            }
        }
    }

    private final void bI(et etVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                aY(i2, etVar);
                i2--;
            }
        } else {
            while (true) {
                i3--;
                if (i3 < i2) {
                    return;
                } else {
                    aY(i3, etVar);
                }
            }
        }
    }

    private final void bJ() {
        this.m = (this.f932k == 1 || !ah()) ? this.f926c : !this.f926c;
    }

    private final void bK(int i2, int i3, boolean z, fb fbVar) {
        int iJ;
        this.f924a.m = aj();
        this.f924a.f1334f = i2;
        int[] iArr = this.f931h;
        iArr[0] = 0;
        iArr[1] = 0;
        U(fbVar, iArr);
        int iMax = Math.max(0, this.f931h[0]);
        int iMax2 = Math.max(0, this.f931h[1]);
        int i4 = i2 == 1 ? iMax2 : iMax;
        de deVar = this.f924a;
        deVar.f1336h = i4;
        if (i2 != 1) {
            iMax = iMax2;
        }
        deVar.f1337i = iMax;
        if (i2 == 1) {
            deVar.f1336h = i4 + this.f933l.g();
            View viewBF = bF();
            de deVar2 = this.f924a;
            deVar2.f1333e = true == this.m ? -1 : 1;
            int iBu = bu(viewBF);
            de deVar3 = this.f924a;
            deVar2.f1332d = iBu + deVar3.f1333e;
            deVar3.f1330b = this.f933l.a(viewBF);
            iJ = this.f933l.a(viewBF) - this.f933l.f();
        } else {
            View viewBG = bG();
            this.f924a.f1336h += this.f933l.j();
            de deVar4 = this.f924a;
            deVar4.f1333e = true != this.m ? -1 : 1;
            int iBu2 = bu(viewBG);
            de deVar5 = this.f924a;
            deVar4.f1332d = iBu2 + deVar5.f1333e;
            deVar5.f1330b = this.f933l.d(viewBG);
            iJ = (-this.f933l.d(viewBG)) + this.f933l.j();
        }
        de deVar6 = this.f924a;
        deVar6.f1331c = i3;
        if (z) {
            deVar6.f1331c = i3 - iJ;
        }
        deVar6.f1335g = iJ;
    }

    private final void bL(dc dcVar) {
        bM(dcVar.f1321b, dcVar.f1322c);
    }

    private final void bM(int i2, int i3) {
        this.f924a.f1331c = this.f933l.f() - i3;
        de deVar = this.f924a;
        deVar.f1333e = true != this.m ? 1 : -1;
        deVar.f1332d = i2;
        deVar.f1334f = 1;
        deVar.f1330b = i3;
        deVar.f1335g = Integer.MIN_VALUE;
    }

    private final void bN(dc dcVar) {
        bO(dcVar.f1321b, dcVar.f1322c);
    }

    private final void bO(int i2, int i3) {
        this.f924a.f1331c = i3 - this.f933l.j();
        de deVar = this.f924a;
        deVar.f1332d = i2;
        deVar.f1333e = true != this.m ? -1 : 1;
        deVar.f1334f = -1;
        deVar.f1330b = i3;
        deVar.f1335g = Integer.MIN_VALUE;
    }

    private final int c(fb fbVar) {
        if (as() == 0) {
            return 0;
        }
        X();
        return ed.c(fbVar, this.f933l, am(!this.f928e), al(!this.f928e), this, this.f928e);
    }

    private final int d(fb fbVar) {
        if (as() == 0) {
            return 0;
        }
        X();
        return ed.d(fbVar, this.f933l, am(!this.f928e), al(!this.f928e), this, this.f928e, this.m);
    }

    private final int t(fb fbVar) {
        if (as() == 0) {
            return 0;
        }
        X();
        return ed.e(fbVar, this.f933l, am(!this.f928e), al(!this.f928e), this, this.f928e);
    }

    private final int u(int i2, et etVar, fb fbVar, boolean z) {
        int iF;
        int iF2 = this.f933l.f() - i2;
        if (iF2 <= 0) {
            return 0;
        }
        int i3 = -O(-iF2, etVar, fbVar);
        int i4 = i2 + i3;
        if (!z || (iF = this.f933l.f() - i4) <= 0) {
            return i3;
        }
        this.f933l.n(iF);
        return iF + i3;
    }

    @Override // android.support.v7.widget.en
    public final int E(fb fbVar) {
        return c(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int F(fb fbVar) {
        return d(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int G(fb fbVar) {
        return t(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int H(fb fbVar) {
        return c(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int I(fb fbVar) {
        return d(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int J(fb fbVar) {
        return t(fbVar);
    }

    final int K(int i2) {
        int i3 = -1;
        int i4 = 1;
        if (i2 == 1) {
            return (this.f932k != 1 && ah()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.f932k != 1 && ah()) ? -1 : 1;
        }
        if (i2 == 17) {
            i4 = 0;
        } else if (i2 != 33) {
            if (i2 != 66) {
                return (i2 == 130 && this.f932k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i3 = 1;
            i4 = 0;
        }
        if (this.f932k == i4) {
            return i3;
        }
        return Integer.MIN_VALUE;
    }

    final int L(et etVar, de deVar, fb fbVar, boolean z) {
        int i2 = deVar.f1331c;
        int i3 = deVar.f1335g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                deVar.f1335g = i3 + i2;
            }
            bH(etVar, deVar);
        }
        int i4 = deVar.f1331c + deVar.f1336h;
        dd ddVar = this.f929f;
        while (true) {
            if ((!deVar.m && i4 <= 0) || !deVar.d(fbVar)) {
                break;
            }
            ddVar.f1325a = 0;
            ddVar.f1326b = false;
            ddVar.f1327c = false;
            ddVar.f1328d = false;
            m(etVar, fbVar, deVar, ddVar);
            if (!ddVar.f1326b) {
                int i5 = deVar.f1330b;
                int i6 = ddVar.f1325a;
                deVar.f1330b = i5 + (deVar.f1334f * i6);
                if (!ddVar.f1327c || deVar.f1340l != null || !fbVar.f1463g) {
                    deVar.f1331c -= i6;
                    i4 -= i6;
                }
                int i7 = deVar.f1335g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    deVar.f1335g = i8;
                    int i9 = deVar.f1331c;
                    if (i9 < 0) {
                        deVar.f1335g = i8 + i9;
                    }
                    bH(etVar, deVar);
                }
                if (z && ddVar.f1328d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - deVar.f1331c;
    }

    public final int M() {
        View viewAn = an(0, as(), false);
        if (viewAn == null) {
            return -1;
        }
        return bu(viewAn);
    }

    public final int N() {
        View viewAn = an(as() - 1, -1, false);
        if (viewAn == null) {
            return -1;
        }
        return bu(viewAn);
    }

    final int O(int i2, et etVar, fb fbVar) {
        if (as() != 0 && i2 != 0) {
            X();
            this.f924a.f1329a = true;
            int i3 = i2 > 0 ? 1 : -1;
            int iAbs = Math.abs(i2);
            bK(i3, iAbs, true, fbVar);
            de deVar = this.f924a;
            int iL = deVar.f1335g + L(etVar, deVar, fbVar, false);
            if (iL >= 0) {
                if (iAbs > iL) {
                    i2 = i3 * iL;
                }
                this.f933l.n(-i2);
                this.f924a.f1339k = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.ez
    public final PointF P(int i2) {
        if (as() == 0) {
            return null;
        }
        float f2 = (i2 < bu(aI(0))) != this.m ? -1 : 1;
        return this.f932k == 0 ? new PointF(f2, 0.0f) : new PointF(0.0f, f2);
    }

    @Override // android.support.v7.widget.en
    public final Parcelable Q() {
        dg dgVar = this.p;
        if (dgVar != null) {
            return new dg(dgVar);
        }
        dg dgVar2 = new dg();
        if (as() <= 0) {
            dgVar2.a();
            return dgVar2;
        }
        X();
        boolean z = this.f925b ^ this.m;
        dgVar2.f1344c = z;
        if (z) {
            View viewBF = bF();
            dgVar2.f1343b = this.f933l.f() - this.f933l.a(viewBF);
            dgVar2.f1342a = bu(viewBF);
            return dgVar2;
        }
        View viewBG = bG();
        dgVar2.f1342a = bu(viewBG);
        dgVar2.f1343b = this.f933l.d(viewBG) - this.f933l.j();
        return dgVar2;
    }

    final View R(int i2, int i3) {
        X();
        if (i3 <= i2 && i3 >= i2) {
            return aI(i2);
        }
        int iD = this.f933l.d(aI(i2));
        int iJ = this.f933l.j();
        int i4 = iD < iJ ? 16388 : 4097;
        int i5 = iD < iJ ? 16644 : 4161;
        return this.f932k == 0 ? this.t.a(i2, i3, i5, i4) : this.u.a(i2, i3, i5, i4);
    }

    @Override // android.support.v7.widget.en
    public final View S(int i2) {
        int iAs = as();
        if (iAs == 0) {
            return null;
        }
        int iBu = i2 - bu(aI(0));
        if (iBu >= 0 && iBu < iAs) {
            View viewAI = aI(iBu);
            if (bu(viewAI) == i2) {
                return viewAI;
            }
        }
        return super.S(i2);
    }

    @Override // android.support.v7.widget.en
    public final void T(String str) {
        if (this.p == null) {
            super.T(str);
        }
    }

    protected void U(fb fbVar, int[] iArr) {
        int iK = fbVar.f1457a != -1 ? this.f933l.k() : 0;
        int i2 = this.f924a.f1334f;
        int i3 = i2 == -1 ? 0 : iK;
        if (i2 != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i3;
    }

    @Override // android.support.v7.widget.en
    public final void V(int i2, int i3, fb fbVar, el elVar) {
        if (1 == this.f932k) {
            i2 = i3;
        }
        if (as() == 0 || i2 == 0) {
            return;
        }
        X();
        bK(i2 > 0 ? 1 : -1, Math.abs(i2), true, fbVar);
        l(fbVar, this.f924a, elVar);
    }

    @Override // android.support.v7.widget.en
    public final void W(int i2, el elVar) {
        boolean z;
        int i3;
        dg dgVar = this.p;
        if (dgVar == null || !dgVar.b()) {
            bJ();
            z = this.m;
            i3 = this.n;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            z = dgVar.f1344c;
            i3 = dgVar.f1342a;
        }
        int i4 = true != z ? 1 : -1;
        for (int i5 = 0; i5 < this.f930g && i3 >= 0 && i3 < i2; i5++) {
            elVar.a(i3, 0);
            i3 += i4;
        }
    }

    final void X() {
        if (this.f924a == null) {
            this.f924a = new de();
        }
    }

    @Override // android.support.v7.widget.en
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            accessibilityEvent.setFromIndex(M());
            accessibilityEvent.setToIndex(N());
        }
    }

    @Override // android.support.v7.widget.en
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof dg) {
            dg dgVar = (dg) parcelable;
            this.p = dgVar;
            if (this.n != -1) {
                dgVar.a();
            }
            ba();
        }
    }

    @Override // android.support.v7.widget.en
    public final void aa(int i2) {
        this.n = i2;
        this.o = Integer.MIN_VALUE;
        dg dgVar = this.p;
        if (dgVar != null) {
            dgVar.a();
        }
        ba();
    }

    public final void ab(int i2, int i3) {
        this.n = i2;
        this.o = i3;
        dg dgVar = this.p;
        if (dgVar != null) {
            dgVar.a();
        }
        ba();
    }

    public final void ac(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        T(null);
        if (i2 != this.f932k || this.f933l == null) {
            dv dvVarP = dv.p(this, i2);
            this.f933l = dvVarP;
            this.q.f1320a = dvVarP;
            this.f932k = i2;
            ba();
        }
    }

    public final void ad(boolean z) {
        T(null);
        if (z == this.f926c) {
            return;
        }
        this.f926c = z;
        ba();
    }

    @Override // android.support.v7.widget.en
    public final boolean ae() {
        return this.f932k == 0;
    }

    @Override // android.support.v7.widget.en
    public final boolean af() {
        return this.f932k == 1;
    }

    @Override // android.support.v7.widget.en
    public final boolean ag() {
        return true;
    }

    protected final boolean ah() {
        return ax() == 1;
    }

    @Override // android.support.v7.widget.en
    public final boolean ai() {
        return this.f926c;
    }

    final boolean aj() {
        return this.f933l.h() == 0 && this.f933l.e() == 0;
    }

    @Override // android.support.v7.widget.en
    final boolean ak() {
        if (av() != 1073741824 && aF() != 1073741824) {
            int iAs = as();
            for (int i2 = 0; i2 < iAs; i2++) {
                ViewGroup.LayoutParams layoutParams = aI(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    final View al(boolean z) {
        return this.m ? an(0, as(), z) : an(as() - 1, -1, z);
    }

    final View am(boolean z) {
        return this.m ? an(as() - 1, -1, z) : an(0, as(), z);
    }

    final View an(int i2, int i3, boolean z) {
        X();
        int i4 = this.f932k;
        int i5 = true != z ? 320 : 24579;
        return i4 == 0 ? this.t.a(i2, i3, i5, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT) : this.u.a(i2, i3, i5, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT);
    }

    public final void ap(View view, View view2) {
        T("Cannot drop a view during a scroll or layout calculation");
        X();
        bJ();
        int iBu = bu(view);
        int iBu2 = bu(view2);
        boolean z = this.m;
        char c2 = iBu < iBu2 ? (char) 1 : (char) 65535;
        if (z) {
            dv dvVar = this.f933l;
            if (c2 == 1) {
                ab(iBu2, dvVar.f() - (this.f933l.d(view2) + this.f933l.b(view)));
                return;
            } else {
                ab(iBu2, dvVar.f() - this.f933l.a(view2));
                return;
            }
        }
        dv dvVar2 = this.f933l;
        if (c2 == 65535) {
            ab(iBu2, dvVar2.d(view2));
        } else {
            ab(iBu2, dvVar2.a(view2) - this.f933l.b(view));
        }
    }

    @Override // android.support.v7.widget.en
    public void aq(RecyclerView recyclerView, int i2) {
        fa faVar = new fa(recyclerView.getContext());
        faVar.h(i2);
        bh(faVar);
    }

    @Override // android.support.v7.widget.en
    public int e(int i2, et etVar, fb fbVar) {
        if (this.f932k == 1) {
            return 0;
        }
        return O(i2, etVar, fbVar);
    }

    @Override // android.support.v7.widget.en
    public int f(int i2, et etVar, fb fbVar) {
        if (this.f932k == 0) {
            return 0;
        }
        return O(i2, etVar, fbVar);
    }

    @Override // android.support.v7.widget.en
    public eo g() {
        return new eo(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View j(android.support.v7.widget.et r17, android.support.v7.widget.fb r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.X()
            int r1 = r0.as()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.as()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            android.support.v7.widget.dv r7 = r0.f933l
            int r7 = r7.j()
            android.support.v7.widget.dv r8 = r0.f933l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.aI(r1)
            int r13 = bu(r12)
            android.support.v7.widget.dv r14 = r0.f933l
            int r14 = r14.d(r12)
            android.support.v7.widget.dv r15 = r0.f933l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.support.v7.widget.eo r13 = (android.support.v7.widget.eo) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r2
            goto L5c
        L5b:
            r13 = r3
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r2
            goto L63
        L62:
            r14 = r3
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.j(android.support.v7.widget.et, android.support.v7.widget.fb, boolean, boolean):android.view.View");
    }

    @Override // android.support.v7.widget.en
    public View k(View view, int i2, et etVar, fb fbVar) {
        int iK;
        View viewBD;
        bJ();
        if (as() == 0 || (iK = K(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        X();
        bK(iK, (int) (this.f933l.k() * 0.33333334f), false, fbVar);
        de deVar = this.f924a;
        deVar.f1335g = Integer.MIN_VALUE;
        deVar.f1329a = false;
        L(etVar, deVar, fbVar, true);
        boolean z = this.m;
        if (iK == -1) {
            viewBD = z ? bE() : bD();
            iK = -1;
        } else {
            viewBD = z ? bD() : bE();
        }
        View viewBG = iK == -1 ? bG() : bF();
        if (!viewBG.hasFocusable()) {
            return viewBD;
        }
        if (viewBD == null) {
            return null;
        }
        return viewBG;
    }

    void l(fb fbVar, de deVar, el elVar) {
        int i2 = deVar.f1332d;
        if (i2 < 0 || i2 >= fbVar.a()) {
            return;
        }
        elVar.a(i2, Math.max(0, deVar.f1335g));
    }

    void m(et etVar, fb fbVar, de deVar, dd ddVar) {
        int iAD;
        int i2;
        int iC;
        int i3;
        int iC2;
        View viewA = deVar.a(etVar);
        if (viewA == null) {
            ddVar.f1326b = true;
            return;
        }
        eo eoVar = (eo) viewA.getLayoutParams();
        List list = deVar.f1340l;
        boolean z = this.m;
        if (list == null) {
            if (z == (deVar.f1334f == -1)) {
                aM(viewA);
            } else {
                aN(viewA, 0);
            }
        } else {
            if (z == (deVar.f1334f == -1)) {
                aK(viewA);
            } else {
                aL(viewA, 0);
            }
        }
        bx(viewA);
        ddVar.f1325a = this.f933l.b(viewA);
        if (this.f932k == 1) {
            if (ah()) {
                iC = aE() - aC();
                iC2 = iC - this.f933l.c(viewA);
            } else {
                int iAB = aB();
                iC = this.f933l.c(viewA) + iAB;
                iC2 = iAB;
            }
            if (deVar.f1334f == -1) {
                i3 = deVar.f1330b;
                iAD = i3 - ddVar.f1325a;
            } else {
                iAD = deVar.f1330b;
                i3 = ddVar.f1325a + iAD;
            }
        } else {
            iAD = aD();
            int iC3 = this.f933l.c(viewA) + iAD;
            if (deVar.f1334f == -1) {
                iC = deVar.f1330b;
                i2 = iC - ddVar.f1325a;
            } else {
                i2 = deVar.f1330b;
                iC = ddVar.f1325a + i2;
            }
            int i4 = i2;
            i3 = iC3;
            iC2 = i4;
        }
        bw(viewA, iC2, iAD, iC, i3);
        if (eoVar.c() || eoVar.b()) {
            ddVar.f1327c = true;
        }
        ddVar.f1328d = viewA.hasFocusable();
    }

    @Override // android.support.v7.widget.en
    public void o(et etVar, fb fbVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.o(etVar, fbVar, accessibilityNodeInfoCompat);
        eb ebVar = this.s.m;
        if (ebVar == null || ebVar.getItemCount() <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_TO_POSITION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // android.support.v7.widget.en
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.support.v7.widget.et r17, android.support.v7.widget.fb r18) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.q(android.support.v7.widget.et, android.support.v7.widget.fb):void");
    }

    @Override // android.support.v7.widget.en
    public void r(fb fbVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void v(boolean z) {
        T(null);
        if (this.f927d == z) {
            return;
        }
        this.f927d = z;
        ba();
    }

    @Override // android.support.v7.widget.en
    boolean x(int i2, Bundle bundle) {
        int iMin;
        if (super.x(i2, bundle)) {
            return true;
        }
        if (i2 == 16908343 && bundle != null) {
            if (this.f932k == 1) {
                int i3 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                iMin = Math.min(i3, b(recyclerView.f937d, recyclerView.E) - 1);
            } else {
                int i4 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
                if (i4 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                iMin = Math.min(i4, a(recyclerView2.f937d, recyclerView2.E) - 1);
            }
            if (iMin >= 0) {
                ab(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.en
    public boolean y() {
        return this.p == null && this.f925b == this.f927d;
    }

    @Override // android.support.v7.widget.en
    public final void ao(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i2) {
        this.f932k = 1;
        this.f926c = false;
        this.m = false;
        this.f927d = false;
        this.f928e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new dc();
        this.f929f = new dd();
        this.f930g = 2;
        this.f931h = new int[2];
        ac(i2);
        ad(false);
    }

    public LinearLayoutManager() {
        this(1);
    }

    void n(et etVar, fb fbVar, dc dcVar, int i2) {
    }
}

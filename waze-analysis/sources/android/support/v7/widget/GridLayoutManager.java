package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set A = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int B;

    /* renamed from: a, reason: collision with root package name */
    boolean f914a;

    /* renamed from: b, reason: collision with root package name */
    int f915b;

    /* renamed from: c, reason: collision with root package name */
    int[] f916c;

    /* renamed from: d, reason: collision with root package name */
    View[] f917d;

    /* renamed from: e, reason: collision with root package name */
    final SparseIntArray f918e;

    /* renamed from: f, reason: collision with root package name */
    final SparseIntArray f919f;

    /* renamed from: g, reason: collision with root package name */
    cy f920g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f921h;

    /* renamed from: i, reason: collision with root package name */
    int f922i;

    /* renamed from: j, reason: collision with root package name */
    int f923j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f914a = false;
        this.f915b = -1;
        this.f918e = new SparseIntArray();
        this.f919f = new SparseIntArray();
        this.f920g = new cw();
        this.f921h = new Rect();
        this.B = -1;
        this.f922i = -1;
        this.f923j = -1;
        t(aG(context, attributeSet, i2, i3).f1407b);
    }

    private final int bC(int i2) {
        if (this.f932k == 0) {
            RecyclerView recyclerView = this.s;
            return bE(recyclerView.f937d, recyclerView.E, i2);
        }
        RecyclerView recyclerView2 = this.s;
        return bF(recyclerView2.f937d, recyclerView2.E, i2);
    }

    private final int bD(int i2) {
        if (this.f932k == 1) {
            RecyclerView recyclerView = this.s;
            return bE(recyclerView.f937d, recyclerView.E, i2);
        }
        RecyclerView recyclerView2 = this.s;
        return bF(recyclerView2.f937d, recyclerView2.E, i2);
    }

    private final int bE(et etVar, fb fbVar, int i2) {
        if (!fbVar.f1463g) {
            return this.f920g.c(i2, this.f915b);
        }
        int iA = etVar.a(i2);
        if (iA != -1) {
            return this.f920g.c(iA, this.f915b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private final int bF(et etVar, fb fbVar, int i2) {
        if (!fbVar.f1463g) {
            return this.f920g.a(i2, this.f915b);
        }
        int i3 = this.f919f.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iA = etVar.a(i2);
        if (iA != -1) {
            return this.f920g.a(iA, this.f915b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private final int bG(et etVar, fb fbVar, int i2) {
        if (!fbVar.f1463g) {
            return this.f920g.b(i2);
        }
        int i3 = this.f918e.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iA = etVar.a(i2);
        if (iA != -1) {
            return this.f920g.b(iA);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private final Set bH(int i2) {
        return bJ(bC(i2), i2);
    }

    private final Set bI(int i2) {
        return bJ(bD(i2), i2);
    }

    private final Set bJ(int i2, int i3) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int iBG = bG(recyclerView.f937d, recyclerView.E, i3);
        for (int i4 = i2; i4 < i2 + iBG; i4++) {
            hashSet.add(Integer.valueOf(i4));
        }
        return hashSet;
    }

    private final void bK(int i2) {
        int i3;
        int length;
        int[] iArr = this.f916c;
        int i4 = this.f915b;
        int i5 = i4 + 1;
        if (iArr == null || (length = iArr.length) != i5 || iArr[length - 1] != i2) {
            iArr = new int[i5];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i2 / i4;
        int i8 = i2 % i4;
        int i9 = 0;
        for (int i10 = 1; i10 <= i4; i10++) {
            i6 += i8;
            if (i6 <= 0 || i4 - i6 >= i8) {
                i3 = i7;
            } else {
                i3 = i7 + 1;
                i6 -= i4;
            }
            i9 += i3;
            iArr[i10] = i9;
        }
        this.f916c = iArr;
    }

    private final void bL() {
        View[] viewArr = this.f917d;
        if (viewArr != null) {
            if (viewArr.length == this.f915b) {
                return;
            }
        }
        this.f917d = new View[this.f915b];
    }

    private final void bM(View view, int i2, boolean z) {
        int iAt;
        int iAt2;
        cx cxVar = (cx) view.getLayoutParams();
        Rect rect = cxVar.f1419d;
        int i3 = rect.top + rect.bottom + cxVar.topMargin + cxVar.bottomMargin;
        int i4 = rect.left + rect.right + cxVar.leftMargin + cxVar.rightMargin;
        int iC = c(cxVar.f1294a, cxVar.f1295b);
        if (this.f932k == 1) {
            iAt2 = at(iC, i2, i4, cxVar.width, false);
            iAt = at(this.f933l.k(), av(), i3, cxVar.height, true);
        } else {
            int iAt3 = at(iC, i2, i3, cxVar.height, false);
            int iAt4 = at(this.f933l.k(), aF(), i4, cxVar.width, true);
            iAt = iAt3;
            iAt2 = iAt4;
        }
        bN(view, iAt2, iAt, z);
    }

    private final void bN(View view, int i2, int i3, boolean z) {
        eo eoVar = (eo) view.getLayoutParams();
        if (z ? bm(view, i2, i3, eoVar) : bl(view, i2, i3, eoVar)) {
            view.measure(i2, i3);
        }
    }

    private final void bO() {
        int iAu;
        int iAD;
        if (this.f932k == 1) {
            iAu = aE() - aC();
            iAD = aB();
        } else {
            iAu = au() - aA();
            iAD = aD();
        }
        bK(iAu - iAD);
    }

    @Override // android.support.v7.widget.en
    public final void A() {
        this.f920g.e();
        this.f920g.d();
    }

    @Override // android.support.v7.widget.en
    public final void B(int i2, int i3) {
        this.f920g.e();
        this.f920g.d();
    }

    @Override // android.support.v7.widget.en
    public final void C(int i2, int i3) {
        this.f920g.e();
        this.f920g.d();
    }

    @Override // android.support.v7.widget.en
    public final void D(int i2, int i3) {
        this.f920g.e();
        this.f920g.d();
    }

    @Override // android.support.v7.widget.en
    public final int a(et etVar, fb fbVar) {
        if (this.f932k == 1) {
            return Math.min(this.f915b, aw());
        }
        if (fbVar.a() <= 0) {
            return 0;
        }
        return bE(etVar, fbVar, fbVar.a() - 1) + 1;
    }

    @Override // android.support.v7.widget.en
    public final int b(et etVar, fb fbVar) {
        if (this.f932k == 0) {
            return Math.min(this.f915b, aw());
        }
        if (fbVar.a() <= 0) {
            return 0;
        }
        return bE(etVar, fbVar, fbVar.a() - 1) + 1;
    }

    final int c(int i2, int i3) {
        if (this.f932k != 1 || !ah()) {
            int[] iArr = this.f916c;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f916c;
        int i4 = this.f915b - i2;
        return iArr2[i4] - iArr2[i4 - i3];
    }

    public final int d() {
        return this.f915b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final int e(int i2, et etVar, fb fbVar) {
        bO();
        bL();
        return super.e(i2, etVar, fbVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final int f(int i2, et etVar, fb fbVar) {
        bO();
        bL();
        return super.f(i2, etVar, fbVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final eo g() {
        return this.f932k == 0 ? new cx(-2, -1) : new cx(-1, -2);
    }

    @Override // android.support.v7.widget.en
    public final eo h(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new cx((ViewGroup.MarginLayoutParams) layoutParams) : new cx(layoutParams);
    }

    @Override // android.support.v7.widget.en
    public final eo i(Context context, AttributeSet attributeSet) {
        return new cx(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    final View j(et etVar, fb fbVar, boolean z, boolean z2) {
        int i2;
        int iAs;
        int i3;
        int iAs2 = as();
        if (z2) {
            i2 = -1;
            iAs = as() - 1;
            i3 = -1;
        } else {
            i2 = iAs2;
            iAs = 0;
            i3 = 1;
        }
        int iA = fbVar.a();
        X();
        int iJ = this.f933l.j();
        int iF = this.f933l.f();
        View view = null;
        View view2 = null;
        while (iAs != i2) {
            View viewAI = aI(iAs);
            int iBu = bu(viewAI);
            if (iBu >= 0 && iBu < iA && bF(etVar, fbVar, iBu) == 0) {
                if (((eo) viewAI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewAI;
                    }
                } else {
                    if (this.f933l.d(viewAI) < iF && this.f933l.a(viewAI) >= iJ) {
                        return viewAI;
                    }
                    if (view == null) {
                        view = viewAI;
                    }
                }
            }
            iAs += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View k(android.view.View r23, int r24, android.support.v7.widget.et r25, android.support.v7.widget.fb r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.k(android.view.View, int, android.support.v7.widget.et, android.support.v7.widget.fb):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    final void l(fb fbVar, de deVar, el elVar) {
        int iB = this.f915b;
        for (int i2 = 0; i2 < this.f915b && deVar.d(fbVar) && iB > 0; i2++) {
            int i3 = deVar.f1332d;
            elVar.a(i3, Math.max(0, deVar.f1335g));
            iB -= this.f920g.b(i3);
            deVar.f1332d += deVar.f1333e;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    final void m(et etVar, fb fbVar, de deVar, dd ddVar) {
        int i2;
        int i3;
        int i4;
        int iC;
        int iC2;
        int iAB;
        int i5;
        int iAt;
        int iAt2;
        boolean z;
        View viewA;
        int i6 = this.f933l.i();
        int i7 = as() > 0 ? this.f916c[this.f915b] : 0;
        boolean z2 = i6 != 1073741824;
        if (z2) {
            bO();
        }
        int i8 = deVar.f1333e;
        int iBF = this.f915b;
        if (i8 != 1) {
            iBF = bF(etVar, fbVar, deVar.f1332d) + bG(etVar, fbVar, deVar.f1332d);
        }
        int i9 = 0;
        while (i9 < this.f915b && deVar.d(fbVar) && iBF > 0) {
            int i10 = deVar.f1332d;
            int iBG = bG(etVar, fbVar, i10);
            if (iBG > this.f915b) {
                throw new IllegalArgumentException("Item at position " + i10 + " requires " + iBG + " spans but GridLayoutManager has only " + this.f915b + " spans.");
            }
            iBF -= iBG;
            if (iBF < 0 || (viewA = deVar.a(etVar)) == null) {
                break;
            }
            this.f917d[i9] = viewA;
            i9++;
        }
        if (i9 == 0) {
            ddVar.f1326b = true;
            return;
        }
        if (i8 == 1) {
            i4 = 1;
            i3 = i9;
            i2 = 0;
        } else {
            i2 = i9 - 1;
            i3 = -1;
            i4 = -1;
        }
        int i11 = 0;
        while (i2 != i3) {
            View view = this.f917d[i2];
            cx cxVar = (cx) view.getLayoutParams();
            int iBG2 = bG(etVar, fbVar, bu(view));
            cxVar.f1295b = iBG2;
            cxVar.f1294a = i11;
            i11 += iBG2;
            i2 += i4;
        }
        float f2 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            View view2 = this.f917d[i13];
            if (deVar.f1340l != null) {
                z = false;
                if (i8 == 1) {
                    aK(view2);
                } else {
                    aL(view2, 0);
                }
            } else if (i8 == 1) {
                aM(view2);
                z = false;
            } else {
                z = false;
                aN(view2, 0);
            }
            aO(view2, this.f921h);
            bM(view2, i6, z);
            int iB = this.f933l.b(view2);
            if (iB > i12) {
                i12 = iB;
            }
            float fC = this.f933l.c(view2) / ((cx) view2.getLayoutParams()).f1295b;
            if (fC > f2) {
                f2 = fC;
            }
        }
        if (z2) {
            bK(Math.max(Math.round(f2 * this.f915b), i7));
            i12 = 0;
            for (int i14 = 0; i14 < i9; i14++) {
                View view3 = this.f917d[i14];
                bM(view3, 1073741824, true);
                int iB2 = this.f933l.b(view3);
                if (iB2 > i12) {
                    i12 = iB2;
                }
            }
        }
        for (int i15 = 0; i15 < i9; i15++) {
            View view4 = this.f917d[i15];
            if (this.f933l.b(view4) != i12) {
                cx cxVar2 = (cx) view4.getLayoutParams();
                Rect rect = cxVar2.f1419d;
                int i16 = rect.top + rect.bottom + cxVar2.topMargin + cxVar2.bottomMargin;
                int i17 = rect.left + rect.right + cxVar2.leftMargin + cxVar2.rightMargin;
                int iC3 = c(cxVar2.f1294a, cxVar2.f1295b);
                if (this.f932k == 1) {
                    iAt2 = at(iC3, 1073741824, i17, cxVar2.width, false);
                    iAt = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    iAt = at(iC3, 1073741824, i16, cxVar2.height, false);
                    iAt2 = iMakeMeasureSpec;
                }
                bN(view4, iAt2, iAt, true);
            }
        }
        ddVar.f1325a = i12;
        if (this.f932k == 1) {
            if (deVar.f1334f == -1) {
                int i18 = deVar.f1330b;
                i5 = i18 - i12;
                iC2 = i18;
            } else {
                i5 = deVar.f1330b;
                iC2 = i5 + i12;
            }
            iAB = 0;
            iC = 0;
        } else {
            if (deVar.f1334f == -1) {
                int i19 = deVar.f1330b;
                iAB = i19 - i12;
                iC2 = 0;
                iC = i19;
            } else {
                int i20 = deVar.f1330b;
                iC = i20 + i12;
                iC2 = 0;
                iAB = i20;
            }
            i5 = iC2;
        }
        int i21 = 0;
        while (true) {
            View[] viewArr = this.f917d;
            if (i21 >= i9) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i21];
            cx cxVar3 = (cx) view5.getLayoutParams();
            if (this.f932k != 1) {
                int iAD = aD() + this.f916c[cxVar3.f1294a];
                i5 = iAD;
                iC2 = this.f933l.c(view5) + iAD;
            } else if (ah()) {
                int iAB2 = aB() + this.f916c[this.f915b - cxVar3.f1294a];
                iC = iAB2;
                iAB = iAB2 - this.f933l.c(view5);
            } else {
                iAB = aB() + this.f916c[cxVar3.f1294a];
                iC = this.f933l.c(view5) + iAB;
            }
            bw(view5, iAB, i5, iC, iC2);
            if (cxVar3.c() || cxVar3.b()) {
                ddVar.f1327c = true;
            }
            ddVar.f1328d = view5.hasFocusable() | ddVar.f1328d;
            i21++;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    final void n(et etVar, fb fbVar, dc dcVar, int i2) {
        bO();
        if (fbVar.a() > 0 && !fbVar.f1463g) {
            int iBF = bF(etVar, fbVar, dcVar.f1321b);
            if (i2 == 1) {
                while (iBF > 0) {
                    int i3 = dcVar.f1321b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    dcVar.f1321b = i4;
                    iBF = bF(etVar, fbVar, i4);
                }
            } else {
                int iA = fbVar.a() - 1;
                int i5 = dcVar.f1321b;
                while (i5 < iA) {
                    int i6 = i5 + 1;
                    int iBF2 = bF(etVar, fbVar, i6);
                    if (iBF2 <= iBF) {
                        break;
                    }
                    i5 = i6;
                    iBF = iBF2;
                }
                dcVar.f1321b = i5;
            }
        }
        bL();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final void o(et etVar, fb fbVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.o(etVar, fbVar, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
        eb ebVar = this.s.m;
        if (ebVar == null || ebVar.getItemCount() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION);
    }

    @Override // android.support.v7.widget.en
    public final void p(et etVar, fb fbVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof cx)) {
            super.aT(view, accessibilityNodeInfoCompat);
            return;
        }
        cx cxVar = (cx) layoutParams;
        int iBE = bE(etVar, fbVar, cxVar.a());
        if (this.f932k == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(cxVar.f1294a, cxVar.f1295b, iBE, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(iBE, 1, cxVar.f1294a, cxVar.f1295b, false, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final void q(et etVar, fb fbVar) {
        if (fbVar.f1463g) {
            int iAs = as();
            for (int i2 = 0; i2 < iAs; i2++) {
                cx cxVar = (cx) aI(i2).getLayoutParams();
                int iA = cxVar.a();
                this.f918e.put(iA, cxVar.f1295b);
                this.f919f.put(iA, cxVar.f1294a);
            }
        }
        super.q(etVar, fbVar);
        this.f918e.clear();
        this.f919f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final void r(fb fbVar) {
        View viewS;
        super.r(fbVar);
        this.f914a = false;
        int i2 = this.B;
        if (i2 == -1 || (viewS = S(i2)) == null) {
            return;
        }
        viewS.sendAccessibilityEvent(67108864);
        this.B = -1;
    }

    @Override // android.support.v7.widget.en
    public final void s(Rect rect, int i2, int i3) {
        int iAr;
        int iAr2;
        if (this.f916c == null) {
            super.s(rect, i2, i3);
        }
        int iAB = aB() + aC();
        int iAD = aD() + aA();
        if (this.f932k == 1) {
            iAr2 = ar(i3, rect.height() + iAD, ay());
            iAr = ar(i2, this.f916c[r7.length - 1] + iAB, az());
        } else {
            iAr = ar(i2, rect.width() + iAB, az());
            iAr2 = ar(i3, this.f916c[r5.length - 1] + iAD, ay());
        }
        be(iAr, iAr2);
    }

    public final void t(int i2) {
        if (i2 == this.f915b) {
            return;
        }
        this.f914a = true;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
        this.f915b = i2;
        this.f920g.e();
        ba();
    }

    public final void u(cy cyVar) {
        this.f920g = cyVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void v(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.v(false);
    }

    @Override // android.support.v7.widget.en
    public final boolean w(eo eoVar) {
        return eoVar instanceof cx;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025c A[EDGE_INSN: B:195:0x025c->B:153:0x025c BREAK  A[LOOP:2: B:117:0x019f->B:126:0x01c9, LOOP_LABEL: LOOP:2: B:117:0x019f->B:126:0x01c9], EDGE_INSN: B:201:0x025c->B:153:0x025c BREAK  A[LOOP:5: B:135:0x0201->B:146:0x0230, LOOP_LABEL: LOOP:5: B:135:0x0201->B:146:0x0230]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026b  */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean x(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.x(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final boolean y() {
        return this.p == null && !this.f914a;
    }

    @Override // android.support.v7.widget.en
    public final void z(int i2, int i3) {
        this.f920g.e();
        this.f920g.d();
    }

    public GridLayoutManager(int i2) {
        super(1);
        this.f914a = false;
        this.f915b = -1;
        this.f918e = new SparseIntArray();
        this.f919f = new SparseIntArray();
        this.f920g = new cw();
        this.f921h = new Rect();
        this.B = -1;
        this.f922i = -1;
        this.f923j = -1;
        t(i2);
    }

    public GridLayoutManager(int i2, byte[] bArr) {
        this.f914a = false;
        this.f915b = -1;
        this.f918e = new SparseIntArray();
        this.f919f = new SparseIntArray();
        this.f920g = new cw();
        this.f921h = new Rect();
        this.B = -1;
        this.f922i = -1;
        this.f923j = -1;
        t(i2);
    }
}

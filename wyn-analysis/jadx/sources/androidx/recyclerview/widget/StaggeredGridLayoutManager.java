package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends V implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18787a;

    /* renamed from: b, reason: collision with root package name */
    public final v0[] f18788b;

    /* renamed from: c, reason: collision with root package name */
    public final B f18789c;

    /* renamed from: d, reason: collision with root package name */
    public final B f18790d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18791e;

    /* renamed from: f, reason: collision with root package name */
    public int f18792f;

    /* renamed from: g, reason: collision with root package name */
    public final C1482u f18793g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18794h;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f18796j;

    /* renamed from: m, reason: collision with root package name */
    public final Y2.B f18798m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18799n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18800o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18801p;

    /* renamed from: q, reason: collision with root package name */
    public u0 f18802q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f18803r;

    /* renamed from: s, reason: collision with root package name */
    public final r0 f18804s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18805t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f18806u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC1474l f18807v;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18795i = false;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f18797l = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        this.f18787a = -1;
        this.f18794h = false;
        Y2.B b5 = new Y2.B(3, (char) 0);
        this.f18798m = b5;
        this.f18799n = 2;
        this.f18803r = new Rect();
        this.f18804s = new r0(this);
        this.f18805t = true;
        this.f18807v = new RunnableC1474l(this, 1);
        U properties = V.getProperties(context, attributeSet, i5, i10);
        int i11 = properties.f18808a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f18791e) {
            this.f18791e = i11;
            B b10 = this.f18789c;
            this.f18789c = this.f18790d;
            this.f18790d = b10;
            requestLayout();
        }
        int i12 = properties.f18809b;
        assertNotInLayoutOrScroll(null);
        if (i12 != this.f18787a) {
            b5.j();
            requestLayout();
            this.f18787a = i12;
            this.f18796j = new BitSet(this.f18787a);
            this.f18788b = new v0[this.f18787a];
            for (int i13 = 0; i13 < this.f18787a; i13++) {
                this.f18788b[i13] = new v0(this, i13);
            }
            requestLayout();
        }
        boolean z2 = properties.f18810c;
        assertNotInLayoutOrScroll(null);
        u0 u0Var = this.f18802q;
        if (u0Var != null && u0Var.f19006h != z2) {
            u0Var.f19006h = z2;
        }
        this.f18794h = z2;
        requestLayout();
        C1482u c1482u = new C1482u();
        c1482u.f18990a = true;
        c1482u.f18995f = 0;
        c1482u.f18996g = 0;
        this.f18793g = c1482u;
        this.f18789c = B.a(this, this.f18791e);
        this.f18790d = B.a(this, 1 - this.f18791e);
    }

    public static int D(int i5, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i5)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - i10) - i11), mode) : i5;
    }

    public final void A(int i5) {
        C1482u c1482u = this.f18793g;
        c1482u.f18994e = i5;
        c1482u.f18993d = this.f18795i != (i5 == -1) ? -1 : 1;
    }

    public final void B(int i5, j0 j0Var) {
        int iL;
        int iL2;
        int i10;
        C1482u c1482u = this.f18793g;
        boolean z2 = false;
        c1482u.f18991b = 0;
        c1482u.f18992c = i5;
        if (!isSmoothScrolling() || (i10 = j0Var.f18894a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f18795i == (i10 < i5)) {
                iL = this.f18789c.l();
                iL2 = 0;
            } else {
                iL2 = this.f18789c.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            c1482u.f18995f = this.f18789c.k() - iL2;
            c1482u.f18996g = this.f18789c.g() + iL;
        } else {
            c1482u.f18996g = this.f18789c.f() + iL;
            c1482u.f18995f = -iL2;
        }
        c1482u.f18997h = false;
        c1482u.f18990a = true;
        if (this.f18789c.i() == 0 && this.f18789c.f() == 0) {
            z2 = true;
        }
        c1482u.f18998i = z2;
    }

    public final void C(v0 v0Var, int i5, int i10) {
        int i11 = v0Var.f19017d;
        int i12 = v0Var.f19018e;
        if (i5 != -1) {
            int i13 = v0Var.f19016c;
            if (i13 == Integer.MIN_VALUE) {
                v0Var.a();
                i13 = v0Var.f19016c;
            }
            if (i13 - i11 >= i10) {
                this.f18796j.set(i12, false);
                return;
            }
            return;
        }
        int i14 = v0Var.f19015b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) v0Var.f19014a.get(0);
            s0 s0Var = (s0) view.getLayoutParams();
            v0Var.f19015b = v0Var.f19019f.f18789c.e(view);
            s0Var.getClass();
            i14 = v0Var.f19015b;
        }
        if (i14 + i11 <= i10) {
            this.f18796j.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f18802q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean canScrollHorizontally() {
        return this.f18791e == 0;
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean canScrollVertically() {
        return this.f18791e == 1;
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean checkLayoutParams(W w2) {
        return w2 instanceof s0;
    }

    @Override // androidx.recyclerview.widget.V
    public final void collectAdjacentPrefetchPositions(int i5, int i10, j0 j0Var, T t10) {
        C1482u c1482u;
        int iF;
        int iH;
        if (this.f18791e != 0) {
            i5 = i10;
        }
        if (getChildCount() == 0 || i5 == 0) {
            return;
        }
        v(i5, j0Var);
        int[] iArr = this.f18806u;
        if (iArr == null || iArr.length < this.f18787a) {
            this.f18806u = new int[this.f18787a];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f18787a;
            c1482u = this.f18793g;
            if (i11 >= i13) {
                break;
            }
            if (c1482u.f18993d == -1) {
                iF = c1482u.f18995f;
                iH = this.f18788b[i11].h(iF);
            } else {
                iF = this.f18788b[i11].f(c1482u.f18996g);
                iH = c1482u.f18996g;
            }
            int i14 = iF - iH;
            if (i14 >= 0) {
                this.f18806u[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.f18806u, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = c1482u.f18992c;
            if (i16 < 0 || i16 >= j0Var.b()) {
                return;
            }
            ((C1479q) t10).a(c1482u.f18992c, this.f18806u[i15]);
            c1482u.f18992c += c1482u.f18993d;
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeHorizontalScrollExtent(j0 j0Var) {
        return e(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeHorizontalScrollOffset(j0 j0Var) {
        return f(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeHorizontalScrollRange(j0 j0Var) {
        return g(j0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f18795i
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f18795i
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f18791e
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeVerticalScrollExtent(j0 j0Var) {
        return e(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeVerticalScrollOffset(j0 j0Var) {
        return f(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeVerticalScrollRange(j0 j0Var) {
        return g(j0Var);
    }

    public final boolean d() {
        int iM;
        if (getChildCount() != 0 && this.f18799n != 0 && isAttachedToWindow()) {
            if (this.f18795i) {
                iM = n();
                m();
            } else {
                iM = m();
                n();
            }
            Y2.B b5 = this.f18798m;
            if (iM == 0 && r() != null) {
                b5.j();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(j0 j0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        B b5 = this.f18789c;
        boolean z2 = !this.f18805t;
        return android.support.v4.media.session.b.X(j0Var, b5, j(z2), i(z2), this, this.f18805t);
    }

    public final int f(j0 j0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        B b5 = this.f18789c;
        boolean z2 = !this.f18805t;
        return android.support.v4.media.session.b.Y(j0Var, b5, j(z2), i(z2), this, this.f18805t, this.f18795i);
    }

    public final int g(j0 j0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        B b5 = this.f18789c;
        boolean z2 = !this.f18805t;
        return android.support.v4.media.session.b.Z(j0Var, b5, j(z2), i(z2), this, this.f18805t);
    }

    @Override // androidx.recyclerview.widget.V
    public final W generateDefaultLayoutParams() {
        return this.f18791e == 0 ? new s0(-2, -1) : new s0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.V
    public final W generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new s0(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int h(c0 c0Var, C1482u c1482u, j0 j0Var) {
        v0 v0Var;
        ?? r32;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i5;
        int i10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i11 = 0;
        int i12 = 1;
        staggeredGridLayoutManager.f18796j.set(0, staggeredGridLayoutManager.f18787a, true);
        C1482u c1482u2 = staggeredGridLayoutManager.f18793g;
        int i13 = c1482u2.f18998i ? c1482u.f18994e == 1 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : Integer.MIN_VALUE : c1482u.f18994e == 1 ? c1482u.f18996g + c1482u.f18991b : c1482u.f18995f - c1482u.f18991b;
        int i14 = c1482u.f18994e;
        for (int i15 = 0; i15 < staggeredGridLayoutManager.f18787a; i15++) {
            if (!staggeredGridLayoutManager.f18788b[i15].f19014a.isEmpty()) {
                staggeredGridLayoutManager.C(staggeredGridLayoutManager.f18788b[i15], i14, i13);
            }
        }
        int iG = staggeredGridLayoutManager.f18795i ? staggeredGridLayoutManager.f18789c.g() : staggeredGridLayoutManager.f18789c.k();
        boolean z2 = false;
        while (true) {
            int i16 = c1482u.f18992c;
            int i17 = -1;
            if (((i16 < 0 || i16 >= j0Var.b()) ? i11 : i12) == 0 || (!c1482u2.f18998i && staggeredGridLayoutManager.f18796j.isEmpty())) {
                break;
            }
            View view = c0Var.j(c1482u.f18992c, Long.MAX_VALUE).itemView;
            c1482u.f18992c += c1482u.f18993d;
            s0 s0Var = (s0) view.getLayoutParams();
            int layoutPosition = s0Var.f18812a.getLayoutPosition();
            Y2.B b5 = staggeredGridLayoutManager.f18798m;
            int[] iArr = (int[]) b5.f16383b;
            int i18 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i18 == -1) {
                if (staggeredGridLayoutManager.u(c1482u.f18994e)) {
                    i5 = staggeredGridLayoutManager.f18787a - i12;
                    i10 = -1;
                } else {
                    i17 = staggeredGridLayoutManager.f18787a;
                    i5 = i11;
                    i10 = i12;
                }
                v0 v0Var2 = null;
                if (c1482u.f18994e == i12) {
                    int iK2 = staggeredGridLayoutManager.f18789c.k();
                    int i19 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    while (i5 != i17) {
                        v0 v0Var3 = staggeredGridLayoutManager.f18788b[i5];
                        int i20 = i10;
                        int iF = v0Var3.f(iK2);
                        if (iF < i19) {
                            v0Var2 = v0Var3;
                            i19 = iF;
                        }
                        i5 += i20;
                        i10 = i20;
                    }
                } else {
                    int i21 = i10;
                    int iG2 = staggeredGridLayoutManager.f18789c.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i5 != i17) {
                        v0 v0Var4 = staggeredGridLayoutManager.f18788b[i5];
                        int iH2 = v0Var4.h(iG2);
                        if (iH2 > i22) {
                            v0Var2 = v0Var4;
                            i22 = iH2;
                        }
                        i5 += i21;
                    }
                }
                v0Var = v0Var2;
                b5.o(layoutPosition);
                ((int[]) b5.f16383b)[layoutPosition] = v0Var.f19018e;
            } else {
                v0Var = staggeredGridLayoutManager.f18788b[i18];
            }
            v0 v0Var5 = v0Var;
            s0Var.f18983e = v0Var5;
            if (c1482u.f18994e == 1) {
                staggeredGridLayoutManager.addView(view);
                r32 = 0;
            } else {
                r32 = 0;
                staggeredGridLayoutManager.addView(view, 0);
            }
            if (staggeredGridLayoutManager.f18791e == 1) {
                staggeredGridLayoutManager.s(view, V.getChildMeasureSpec(staggeredGridLayoutManager.f18792f, staggeredGridLayoutManager.getWidthMode(), r32, ((ViewGroup.MarginLayoutParams) s0Var).width, r32), V.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) s0Var).height, true));
            } else {
                staggeredGridLayoutManager.s(view, V.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) s0Var).width, true), V.getChildMeasureSpec(staggeredGridLayoutManager.f18792f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) s0Var).height, false));
            }
            if (c1482u.f18994e == 1) {
                iC = v0Var5.f(iG);
                iH = staggeredGridLayoutManager.f18789c.c(view) + iC;
            } else {
                iH = v0Var5.h(iG);
                iC = iH - staggeredGridLayoutManager.f18789c.c(view);
            }
            if (c1482u.f18994e == 1) {
                v0 v0Var6 = s0Var.f18983e;
                v0Var6.getClass();
                s0 s0Var2 = (s0) view.getLayoutParams();
                s0Var2.f18983e = v0Var6;
                ArrayList arrayList = v0Var6.f19014a;
                arrayList.add(view);
                v0Var6.f19016c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    v0Var6.f19015b = Integer.MIN_VALUE;
                }
                if (s0Var2.f18812a.isRemoved() || s0Var2.f18812a.isUpdated()) {
                    v0Var6.f19017d = v0Var6.f19019f.f18789c.c(view) + v0Var6.f19017d;
                }
            } else {
                v0 v0Var7 = s0Var.f18983e;
                v0Var7.getClass();
                s0 s0Var3 = (s0) view.getLayoutParams();
                s0Var3.f18983e = v0Var7;
                ArrayList arrayList2 = v0Var7.f19014a;
                arrayList2.add(0, view);
                v0Var7.f19015b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    v0Var7.f19016c = Integer.MIN_VALUE;
                }
                if (s0Var3.f18812a.isRemoved() || s0Var3.f18812a.isUpdated()) {
                    v0Var7.f19017d = v0Var7.f19019f.f18789c.c(view) + v0Var7.f19017d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f18791e == 1) {
                iC2 = staggeredGridLayoutManager.f18790d.g() - (((staggeredGridLayoutManager.f18787a - 1) - v0Var5.f19018e) * staggeredGridLayoutManager.f18792f);
                iK = iC2 - staggeredGridLayoutManager.f18790d.c(view);
            } else {
                iK = staggeredGridLayoutManager.f18790d.k() + (v0Var5.f19018e * staggeredGridLayoutManager.f18792f);
                iC2 = staggeredGridLayoutManager.f18790d.c(view) + iK;
            }
            int i23 = iK;
            int i24 = iC2;
            if (staggeredGridLayoutManager.f18791e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i23, iC, i24, iH);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, iC, i23, iH, i24);
            }
            staggeredGridLayoutManager.C(v0Var5, c1482u2.f18994e, i13);
            staggeredGridLayoutManager.w(c0Var, c1482u2);
            if (c1482u2.f18997h && view.hasFocusable()) {
                staggeredGridLayoutManager.f18796j.set(v0Var5.f19018e, false);
            }
            z2 = true;
            i12 = 1;
            i11 = 0;
        }
        if (!z2) {
            staggeredGridLayoutManager.w(c0Var, c1482u2);
        }
        int iK3 = c1482u2.f18994e == -1 ? staggeredGridLayoutManager.f18789c.k() - staggeredGridLayoutManager.p(staggeredGridLayoutManager.f18789c.k()) : staggeredGridLayoutManager.o(staggeredGridLayoutManager.f18789c.g()) - staggeredGridLayoutManager.f18789c.g();
        if (iK3 > 0) {
            return Math.min(c1482u.f18991b, iK3);
        }
        return 0;
    }

    public final View i(boolean z2) {
        int iK = this.f18789c.k();
        int iG = this.f18789c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f18789c.e(childAt);
            int iB = this.f18789c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z2) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean isAutoMeasureEnabled() {
        return this.f18799n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final View j(boolean z2) {
        int iK = this.f18789c.k();
        int iG = this.f18789c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int iE = this.f18789c.e(childAt);
            if (this.f18789c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z2) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void k(c0 c0Var, j0 j0Var, boolean z2) {
        int iG;
        int iO = o(Integer.MIN_VALUE);
        if (iO != Integer.MIN_VALUE && (iG = this.f18789c.g() - iO) > 0) {
            int i5 = iG - (-scrollBy(-iG, c0Var, j0Var));
            if (!z2 || i5 <= 0) {
                return;
            }
            this.f18789c.o(i5);
        }
    }

    public final void l(c0 c0Var, j0 j0Var, boolean z2) {
        int iK;
        int iP = p(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (iP != Integer.MAX_VALUE && (iK = iP - this.f18789c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, c0Var, j0Var);
            if (!z2 || iScrollBy <= 0) {
                return;
            }
            this.f18789c.o(-iScrollBy);
        }
    }

    public final int m() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int n() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int o(int i5) {
        int iF = this.f18788b[0].f(i5);
        for (int i10 = 1; i10 < this.f18787a; i10++) {
            int iF2 = this.f18788b[i10].f(i5);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.V
    public final void offsetChildrenHorizontal(int i5) {
        super.offsetChildrenHorizontal(i5);
        for (int i10 = 0; i10 < this.f18787a; i10++) {
            v0 v0Var = this.f18788b[i10];
            int i11 = v0Var.f19015b;
            if (i11 != Integer.MIN_VALUE) {
                v0Var.f19015b = i11 + i5;
            }
            int i12 = v0Var.f19016c;
            if (i12 != Integer.MIN_VALUE) {
                v0Var.f19016c = i12 + i5;
            }
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void offsetChildrenVertical(int i5) {
        super.offsetChildrenVertical(i5);
        for (int i10 = 0; i10 < this.f18787a; i10++) {
            v0 v0Var = this.f18788b[i10];
            int i11 = v0Var.f19015b;
            if (i11 != Integer.MIN_VALUE) {
                v0Var.f19015b = i11 + i5;
            }
            int i12 = v0Var.f19016c;
            if (i12 != Integer.MIN_VALUE) {
                v0Var.f19016c = i12 + i5;
            }
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void onAdapterChanged(I i5, I i10) {
        this.f18798m.j();
        for (int i11 = 0; i11 < this.f18787a; i11++) {
            this.f18788b[i11].b();
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void onDetachedFromWindow(RecyclerView recyclerView, c0 c0Var) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f18807v);
        for (int i5 = 0; i5 < this.f18787a; i5++) {
            this.f18788b[i5].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.c0 r11, androidx.recyclerview.widget.j0 r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.c0, androidx.recyclerview.widget.j0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.V
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewJ = j(false);
            View viewI = i(false);
            if (viewJ == null || viewI == null) {
                return;
            }
            int position = getPosition(viewJ);
            int position2 = getPosition(viewI);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsAdded(RecyclerView recyclerView, int i5, int i10) {
        q(i5, i10, 1);
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f18798m.j();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsMoved(RecyclerView recyclerView, int i5, int i10, int i11) {
        q(i5, i10, 8);
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsRemoved(RecyclerView recyclerView, int i5, int i10) {
        q(i5, i10, 2);
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsUpdated(RecyclerView recyclerView, int i5, int i10, Object obj) {
        q(i5, i10, 4);
    }

    @Override // androidx.recyclerview.widget.V
    public final void onLayoutChildren(c0 c0Var, j0 j0Var) {
        t(c0Var, j0Var, true);
    }

    @Override // androidx.recyclerview.widget.V
    public final void onLayoutCompleted(j0 j0Var) {
        this.k = -1;
        this.f18797l = Integer.MIN_VALUE;
        this.f18802q = null;
        this.f18804s.a();
    }

    @Override // androidx.recyclerview.widget.V
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof u0) {
            u0 u0Var = (u0) parcelable;
            this.f18802q = u0Var;
            if (this.k != -1) {
                u0Var.f19002d = null;
                u0Var.f19001c = 0;
                u0Var.f18999a = -1;
                u0Var.f19000b = -1;
                u0Var.f19002d = null;
                u0Var.f19001c = 0;
                u0Var.f19003e = 0;
                u0Var.f19004f = null;
                u0Var.f19005g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final Parcelable onSaveInstanceState() {
        int iH;
        int iK;
        int[] iArr;
        u0 u0Var = this.f18802q;
        if (u0Var != null) {
            u0 u0Var2 = new u0();
            u0Var2.f19001c = u0Var.f19001c;
            u0Var2.f18999a = u0Var.f18999a;
            u0Var2.f19000b = u0Var.f19000b;
            u0Var2.f19002d = u0Var.f19002d;
            u0Var2.f19003e = u0Var.f19003e;
            u0Var2.f19004f = u0Var.f19004f;
            u0Var2.f19006h = u0Var.f19006h;
            u0Var2.f19007i = u0Var.f19007i;
            u0Var2.f19008j = u0Var.f19008j;
            u0Var2.f19005g = u0Var.f19005g;
            return u0Var2;
        }
        u0 u0Var3 = new u0();
        u0Var3.f19006h = this.f18794h;
        u0Var3.f19007i = this.f18800o;
        u0Var3.f19008j = this.f18801p;
        Y2.B b5 = this.f18798m;
        if (b5 == null || (iArr = (int[]) b5.f16383b) == null) {
            u0Var3.f19003e = 0;
        } else {
            u0Var3.f19004f = iArr;
            u0Var3.f19003e = iArr.length;
            u0Var3.f19005g = (ArrayList) b5.f16384c;
        }
        if (getChildCount() <= 0) {
            u0Var3.f18999a = -1;
            u0Var3.f19000b = -1;
            u0Var3.f19001c = 0;
            return u0Var3;
        }
        u0Var3.f18999a = this.f18800o ? n() : m();
        View viewI = this.f18795i ? i(true) : j(true);
        u0Var3.f19000b = viewI != null ? getPosition(viewI) : -1;
        int i5 = this.f18787a;
        u0Var3.f19001c = i5;
        u0Var3.f19002d = new int[i5];
        for (int i10 = 0; i10 < this.f18787a; i10++) {
            if (this.f18800o) {
                iH = this.f18788b[i10].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f18789c.g();
                    iH -= iK;
                }
            } else {
                iH = this.f18788b[i10].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f18789c.k();
                    iH -= iK;
                }
            }
            u0Var3.f19002d[i10] = iH;
        }
        return u0Var3;
    }

    @Override // androidx.recyclerview.widget.V
    public final void onScrollStateChanged(int i5) {
        if (i5 == 0) {
            d();
        }
    }

    public final int p(int i5) {
        int iH = this.f18788b[0].h(i5);
        for (int i10 = 1; i10 < this.f18787a; i10++) {
            int iH2 = this.f18788b[i10].h(i5);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View r() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r():android.view.View");
    }

    public final void s(View view, int i5, int i10) {
        Rect rect = this.f18803r;
        calculateItemDecorationsForChild(view, rect);
        s0 s0Var = (s0) view.getLayoutParams();
        int iD = D(i5, ((ViewGroup.MarginLayoutParams) s0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) s0Var).rightMargin + rect.right);
        int iD2 = D(i10, ((ViewGroup.MarginLayoutParams) s0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) s0Var).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iD, iD2, s0Var)) {
            view.measure(iD, iD2);
        }
    }

    public final int scrollBy(int i5, c0 c0Var, j0 j0Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        v(i5, j0Var);
        C1482u c1482u = this.f18793g;
        int iH = h(c0Var, c1482u, j0Var);
        if (c1482u.f18991b >= iH) {
            i5 = i5 < 0 ? -iH : iH;
        }
        this.f18789c.o(-i5);
        this.f18800o = this.f18795i;
        c1482u.f18991b = 0;
        w(c0Var, c1482u);
        return i5;
    }

    @Override // androidx.recyclerview.widget.V
    public final int scrollHorizontallyBy(int i5, c0 c0Var, j0 j0Var) {
        return scrollBy(i5, c0Var, j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final void scrollToPosition(int i5) {
        u0 u0Var = this.f18802q;
        if (u0Var != null && u0Var.f18999a != i5) {
            u0Var.f19002d = null;
            u0Var.f19001c = 0;
            u0Var.f18999a = -1;
            u0Var.f19000b = -1;
        }
        this.k = i5;
        this.f18797l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.V
    public final int scrollVerticallyBy(int i5, c0 c0Var, j0 j0Var) {
        return scrollBy(i5, c0Var, j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final void setMeasuredDimension(Rect rect, int i5, int i10) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f18791e == 1) {
            iChooseSize2 = V.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = V.chooseSize(i5, (this.f18792f * this.f18787a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = V.chooseSize(i5, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = V.chooseSize(i10, (this.f18792f * this.f18787a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.V
    public final void smoothScrollToPosition(RecyclerView recyclerView, j0 j0Var, int i5) {
        C1487z c1487z = new C1487z(recyclerView.getContext());
        c1487z.setTargetPosition(i5);
        startSmoothScroll(c1487z);
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean supportsPredictiveItemAnimations() {
        return this.f18802q == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.recyclerview.widget.c0 r17, androidx.recyclerview.widget.j0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.t(androidx.recyclerview.widget.c0, androidx.recyclerview.widget.j0, boolean):void");
    }

    public final boolean u(int i5) {
        if (this.f18791e == 0) {
            return (i5 == -1) != this.f18795i;
        }
        return ((i5 == -1) == this.f18795i) == isLayoutRTL();
    }

    public final void v(int i5, j0 j0Var) {
        int iM;
        int i10;
        if (i5 > 0) {
            iM = n();
            i10 = 1;
        } else {
            iM = m();
            i10 = -1;
        }
        C1482u c1482u = this.f18793g;
        c1482u.f18990a = true;
        B(iM, j0Var);
        A(i10);
        c1482u.f18992c = iM + c1482u.f18993d;
        c1482u.f18991b = Math.abs(i5);
    }

    public final void w(c0 c0Var, C1482u c1482u) {
        if (!c1482u.f18990a || c1482u.f18998i) {
            return;
        }
        if (c1482u.f18991b == 0) {
            if (c1482u.f18994e == -1) {
                x(c1482u.f18996g, c0Var);
                return;
            } else {
                y(c1482u.f18995f, c0Var);
                return;
            }
        }
        int i5 = 1;
        if (c1482u.f18994e == -1) {
            int i10 = c1482u.f18995f;
            int iH = this.f18788b[0].h(i10);
            while (i5 < this.f18787a) {
                int iH2 = this.f18788b[i5].h(i10);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i5++;
            }
            int i11 = i10 - iH;
            x(i11 < 0 ? c1482u.f18996g : c1482u.f18996g - Math.min(i11, c1482u.f18991b), c0Var);
            return;
        }
        int i12 = c1482u.f18996g;
        int iF = this.f18788b[0].f(i12);
        while (i5 < this.f18787a) {
            int iF2 = this.f18788b[i5].f(i12);
            if (iF2 < iF) {
                iF = iF2;
            }
            i5++;
        }
        int i13 = iF - c1482u.f18996g;
        y(i13 < 0 ? c1482u.f18995f : Math.min(i13, c1482u.f18991b) + c1482u.f18995f, c0Var);
    }

    public final void x(int i5, c0 c0Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f18789c.e(childAt) < i5 || this.f18789c.n(childAt) < i5) {
                return;
            }
            s0 s0Var = (s0) childAt.getLayoutParams();
            s0Var.getClass();
            if (s0Var.f18983e.f19014a.size() == 1) {
                return;
            }
            v0 v0Var = s0Var.f18983e;
            ArrayList arrayList = v0Var.f19014a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            s0 s0Var2 = (s0) view.getLayoutParams();
            s0Var2.f18983e = null;
            if (s0Var2.f18812a.isRemoved() || s0Var2.f18812a.isUpdated()) {
                v0Var.f19017d -= v0Var.f19019f.f18789c.c(view);
            }
            if (size == 1) {
                v0Var.f19015b = Integer.MIN_VALUE;
            }
            v0Var.f19016c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c0Var);
        }
    }

    public final void y(int i5, c0 c0Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f18789c.b(childAt) > i5 || this.f18789c.m(childAt) > i5) {
                return;
            }
            s0 s0Var = (s0) childAt.getLayoutParams();
            s0Var.getClass();
            if (s0Var.f18983e.f19014a.size() == 1) {
                return;
            }
            v0 v0Var = s0Var.f18983e;
            ArrayList arrayList = v0Var.f19014a;
            View view = (View) arrayList.remove(0);
            s0 s0Var2 = (s0) view.getLayoutParams();
            s0Var2.f18983e = null;
            if (arrayList.size() == 0) {
                v0Var.f19016c = Integer.MIN_VALUE;
            }
            if (s0Var2.f18812a.isRemoved() || s0Var2.f18812a.isUpdated()) {
                v0Var.f19017d -= v0Var.f19019f.f18789c.c(view);
            }
            v0Var.f19015b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c0Var);
        }
    }

    public final void z() {
        if (this.f18791e == 1 || !isLayoutRTL()) {
            this.f18795i = this.f18794h;
        } else {
            this.f18795i = !this.f18794h;
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new s0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new s0(layoutParams);
    }
}

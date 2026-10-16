package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.ajnt;
import defpackage.ebm;
import defpackage.khy;
import defpackage.qdv;
import defpackage.qdw;
import defpackage.qdx;
import defpackage.qea;
import defpackage.ul;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements qdv {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private List o;
    private ajnt p;
    private ul q;

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.q = new ul(this);
        this.o = new ArrayList();
        this.p = new ajnt((char[]) null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qea.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 4);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 5);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            e(drawable);
            f(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            e(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            f(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.A(boolean, boolean, int, int, int, int):void");
    }

    private final void B(int i, int i2, int i3, int i4) {
        int iR;
        int iN;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            iR = r() + getPaddingTop() + getPaddingBottom();
            iN = n();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(a.bp(i, "Invalid flex direction: "));
            }
            iR = n();
            iN = r() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < iN) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = iN;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(iN, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(a.bp(mode, "Unknown width mode is set: "));
            }
            if (size < iN) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < iR) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = iR;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(iR, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(a.bp(mode2, "Unknown height mode is set: "));
            }
            if (size2 < iR) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private final void C() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean D(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewD = d(i - i3);
            if (viewD != null && viewD.getVisibility() != 8) {
                return K() ? (this.j & 2) != 0 : (this.i & 2) != 0;
            }
        }
        return K() ? (this.j & 1) != 0 : (this.i & 1) != 0;
    }

    private final boolean E(int i) {
        if (i >= 0 && i < this.o.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((qdw) this.o.get(i2)).a() > 0) {
                    return K() ? (this.i & 2) != 0 : (this.j & 2) != 0;
                }
            }
            if (K()) {
                return (this.i & 1) != 0;
            }
            if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean F(int i) {
        if (i >= 0 && i < this.o.size()) {
            for (int i2 = i + 1; i2 < this.o.size(); i2++) {
                if (((qdw) this.o.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (K()) {
                return (this.i & 4) != 0;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private final void h(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            qdw qdwVar = (qdw) this.o.get(i);
            for (int i2 = 0; i2 < qdwVar.h; i2++) {
                int i3 = qdwVar.o + i2;
                View viewD = d(i3);
                if (viewD != null && viewD.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                    if (D(i3, i2)) {
                        u(canvas, z ? viewD.getRight() + layoutParams.rightMargin : (viewD.getLeft() - layoutParams.leftMargin) - this.l, qdwVar.b, qdwVar.g);
                    }
                    if (i2 == qdwVar.h - 1 && (this.j & 4) > 0) {
                        u(canvas, z ? (viewD.getLeft() - layoutParams.leftMargin) - this.l : viewD.getRight() + layoutParams.rightMargin, qdwVar.b, qdwVar.g);
                    }
                }
            }
            if (E(i)) {
                q(canvas, paddingLeft, z2 ? qdwVar.d : qdwVar.b - this.k, iMax);
            }
            if (F(i) && (this.i & 4) > 0) {
                q(canvas, paddingLeft, z2 ? qdwVar.b - this.k : qdwVar.d, iMax);
            }
        }
    }

    private final void p(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            qdw qdwVar = (qdw) this.o.get(i);
            for (int i2 = 0; i2 < qdwVar.h; i2++) {
                int i3 = qdwVar.o + i2;
                View viewD = d(i3);
                if (viewD != null && viewD.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                    if (D(i3, i2)) {
                        q(canvas, qdwVar.a, z2 ? viewD.getBottom() + layoutParams.bottomMargin : (viewD.getTop() - layoutParams.topMargin) - this.k, qdwVar.g);
                    }
                    if (i2 == qdwVar.h - 1 && (this.i & 4) > 0) {
                        q(canvas, qdwVar.a, z2 ? (viewD.getTop() - layoutParams.topMargin) - this.k : viewD.getBottom() + layoutParams.bottomMargin, qdwVar.g);
                    }
                }
            }
            if (E(i)) {
                u(canvas, z ? qdwVar.c : qdwVar.a - this.l, paddingTop, iMax);
            }
            if (F(i) && (this.j & 4) > 0) {
                u(canvas, z ? qdwVar.a - this.l : qdwVar.c, paddingTop, iMax);
            }
        }
    }

    private final void q(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    private final void u(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.y(boolean, int, int, int, int):void");
    }

    @Override // defpackage.qdv
    public final boolean K() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // defpackage.qdv
    public final int a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qdv] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        ul ulVar = this.q;
        ?? r2 = ulVar.b;
        int iL = r2.l();
        List listD = ulVar.d(iL);
        qdx qdxVar = new qdx();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            qdxVar.b = 1;
        } else {
            qdxVar.b = ((FlexItem) layoutParams).n();
        }
        if (i == -1 || i == iL || i >= r2.l()) {
            qdxVar.a = iL;
        } else {
            qdxVar.a = i;
            for (int i2 = i; i2 < iL; i2++) {
                ((qdx) listD.get(i2)).a++;
            }
        }
        listD.add(qdxVar);
        this.m = ul.p(iL + 1, listD, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.qdv
    public final int b() {
        return this.d;
    }

    @Override // defpackage.qdv
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void e(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        this.k = drawable.getIntrinsicHeight();
        C();
        requestLayout();
    }

    public final void f(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        this.l = drawable.getIntrinsicWidth();
        C();
        requestLayout();
    }

    @Override // defpackage.qdv
    public final int g(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // defpackage.qdv
    public final int i(View view) {
        return 0;
    }

    @Override // defpackage.qdv
    public final int j(View view, int i, int i2) {
        int i3;
        int i4;
        if (K()) {
            i3 = D(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = D(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // defpackage.qdv
    public final int k() {
        return this.a;
    }

    @Override // defpackage.qdv
    public final int l() {
        return getChildCount();
    }

    @Override // defpackage.qdv
    public final int m() {
        return this.b;
    }

    @Override // defpackage.qdv
    public final int n() {
        Iterator it = this.o.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((qdw) it.next()).e);
        }
        return iMax;
    }

    @Override // defpackage.qdv
    public final int o() {
        return this.f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int[] iArr = ebm.a;
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (i == 0) {
            h(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            h(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection != 1;
            boolean z2 = layoutDirection == 1;
            if (this.b != 2) {
                z = z2;
            }
            p(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z3 = layoutDirection != 1;
        boolean z4 = layoutDirection == 1;
        if (this.b != 2) {
            z3 = z4;
        }
        p(canvas, z3, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        FlexboxLayout flexboxLayout;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        FlexboxLayout flexboxLayout2;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = ebm.a;
        int layoutDirection = getLayoutDirection();
        int i13 = this.a;
        if (i13 == 0) {
            if (layoutDirection == 1) {
                z2 = true;
                flexboxLayout = this;
                i5 = i;
                i8 = i2;
                i7 = i4;
                i6 = i3;
            } else {
                z2 = false;
                flexboxLayout = this;
                i5 = i;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            flexboxLayout.y(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                A(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, false, i, i2, i3, i4);
                return;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException(a.bp(i13, "Invalid flex direction is set: "));
                }
                A(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, true, i, i2, i3, i4);
                return;
            }
        }
        if (layoutDirection != 1) {
            z3 = true;
            flexboxLayout2 = this;
            i9 = i;
            i12 = i2;
            i11 = i4;
            i10 = i3;
        } else {
            z3 = false;
            flexboxLayout2 = this;
            i9 = i;
            i10 = i3;
            i11 = i4;
            i12 = i2;
        }
        flexboxLayout2.y(z3, i9, i12, i10, i11);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qdv] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qdv] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        ?? r2 = this.q.b;
        int iL = r2.l();
        if (sparseIntArray.size() != iL) {
            ul ulVar = this.q;
            SparseIntArray sparseIntArray2 = this.n;
            int iL2 = ulVar.b.l();
            this.m = ul.p(iL2, ulVar.d(iL2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < iL; i3++) {
            View viewS = r2.s(i3);
            if (viewS != null && ((FlexItem) viewS.getLayoutParams()).n() != sparseIntArray.get(i3)) {
                ul ulVar2 = this.q;
                SparseIntArray sparseIntArray22 = this.n;
                int iL22 = ulVar2.b.l();
                this.m = ul.p(iL22, ulVar2.d(iL22), sparseIntArray22);
                break;
            }
        }
        int i4 = this.a;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalStateException(a.bp(i4, "Invalid value for the flex direction is set: "));
            }
            this.o.clear();
            this.p.i();
            this.q.q(this.p, i2, i, Alert.DURATION_SHOW_INDEFINITELY, 0, -1, null);
            this.o = this.p.b;
            this.q.g(i, i2, 0);
            this.q.f(i, i2, getPaddingLeft() + getPaddingRight());
            this.q.m(0);
            B(this.a, i, i2, this.p.a);
            return;
        }
        this.o.clear();
        this.p.i();
        this.q.q(this.p, i, i2, Alert.DURATION_SHOW_INDEFINITELY, 0, -1, null);
        this.o = this.p.b;
        this.q.g(i, i2, 0);
        if (this.d == 3) {
            for (qdw qdwVar : this.o) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < qdwVar.h; i5++) {
                    View viewD = d(qdwVar.o + i5);
                    if (viewD != null && viewD.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                        iMax = this.b != 2 ? Math.max(iMax, viewD.getMeasuredHeight() + Math.max(qdwVar.l - viewD.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin) : Math.max(iMax, viewD.getMeasuredHeight() + layoutParams.topMargin + Math.max((qdwVar.l - viewD.getMeasuredHeight()) + viewD.getBaseline(), layoutParams.bottomMargin));
                    }
                }
                qdwVar.g = iMax;
            }
        }
        this.q.f(i, i2, getPaddingTop() + getPaddingBottom());
        this.q.m(0);
        B(this.a, i, i2, this.p.a);
    }

    @Override // defpackage.qdv
    public final int r() {
        int size = this.o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            qdw qdwVar = (qdw) this.o.get(i2);
            if (E(i2)) {
                i += K() ? this.k : this.l;
            }
            if (F(i2)) {
                i += K() ? this.k : this.l;
            }
            i += qdwVar.g;
        }
        return i;
    }

    @Override // defpackage.qdv
    public final View s(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.qdv
    public final View t(int i) {
        return d(i);
    }

    @Override // defpackage.qdv
    public final List v() {
        return this.o;
    }

    @Override // defpackage.qdv
    public final void w(View view, int i, int i2, qdw qdwVar) {
        int i3;
        int i4;
        if (D(i, i2)) {
            if (K()) {
                i3 = qdwVar.e;
                i4 = this.l;
            } else {
                i3 = qdwVar.e;
                i4 = this.k;
            }
            qdwVar.e = i3 + i4;
            qdwVar.f += i4;
        }
    }

    @Override // defpackage.qdv
    public final void x(qdw qdwVar) {
        int i;
        int i2;
        if (K()) {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = qdwVar.e;
            i2 = this.l;
        } else {
            if ((this.i & 4) <= 0) {
                return;
            }
            i = qdwVar.e;
            i2 = this.k;
        }
        qdwVar.e = i + i2;
        qdwVar.f += i2;
    }

    @Override // defpackage.qdv
    public final void z(List list) {
        this.o = list;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.qdv
    public final void J(int i, View view) {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new khy(15);
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = BitmapDescriptorFactory.HUE_RED;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.d;
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
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void p(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void q(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.j;
        }

        public final void s() {
            this.j = false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = BitmapDescriptorFactory.HUE_RED;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qea.b);
            this.a = typedArrayObtainStyledAttributes.getInt(8, 1);
            this.b = typedArrayObtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED);
            this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(0, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.j = typedArrayObtainStyledAttributes.getBoolean(9, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = BitmapDescriptorFactory.HUE_RED;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = BitmapDescriptorFactory.HUE_RED;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = BitmapDescriptorFactory.HUE_RED;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}

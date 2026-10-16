package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import i.AbstractC2820a;

/* renamed from: q.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3848y0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f43943a;

    /* renamed from: b, reason: collision with root package name */
    public int f43944b;

    /* renamed from: c, reason: collision with root package name */
    public int f43945c;

    /* renamed from: d, reason: collision with root package name */
    public int f43946d;

    /* renamed from: e, reason: collision with root package name */
    public int f43947e;

    /* renamed from: f, reason: collision with root package name */
    public int f43948f;

    /* renamed from: g, reason: collision with root package name */
    public float f43949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43950h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f43951i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f43952j;
    public Drawable k;

    /* renamed from: l, reason: collision with root package name */
    public int f43953l;

    /* renamed from: m, reason: collision with root package name */
    public int f43954m;

    /* renamed from: n, reason: collision with root package name */
    public int f43955n;

    /* renamed from: o, reason: collision with root package name */
    public int f43956o;

    public AbstractC3848y0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f43943a = true;
        this.f43944b = -1;
        this.f43945c = 0;
        this.f43947e = 8388659;
        int[] iArr = AbstractC2820a.f36450n;
        md.J jS = md.J.s(context, attributeSet, iArr, i5, 0);
        k1.S.l(this, context, iArr, attributeSet, (TypedArray) jS.f40581b, i5);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f43949g = typedArray.getFloat(4, -1.0f);
        this.f43944b = typedArray.getInt(3, -1);
        this.f43950h = typedArray.getBoolean(7, false);
        setDividerDrawable(jS.n(5));
        this.f43955n = typedArray.getInt(8, 0);
        this.f43956o = typedArray.getDimensionPixelSize(6, 0);
        jS.v();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3846x0;
    }

    public final void f(Canvas canvas, int i5) {
        this.k.setBounds(getPaddingLeft() + this.f43956o, i5, (getWidth() - getPaddingRight()) - this.f43956o, this.f43954m + i5);
        this.k.draw(canvas);
    }

    public final void g(Canvas canvas, int i5) {
        this.k.setBounds(i5, getPaddingTop() + this.f43956o, this.f43953l + i5, (getHeight() - getPaddingBottom()) - this.f43956o);
        this.k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i5;
        if (this.f43944b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f43944b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f43944b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f43945c;
        if (this.f43946d == 1 && (i5 = this.f43947e & 112) != 48) {
            if (i5 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f43948f) / 2;
            } else if (i5 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f43948f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C3846x0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f43944b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.f43956o;
    }

    public int getDividerWidth() {
        return this.f43953l;
    }

    public int getGravity() {
        return this.f43947e;
    }

    public int getOrientation() {
        return this.f43946d;
    }

    public int getShowDividers() {
        return this.f43955n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f43949g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C3846x0 generateDefaultLayoutParams() {
        int i5 = this.f43946d;
        if (i5 == 0) {
            return new C3846x0(-2, -2);
        }
        if (i5 == 1) {
            return new C3846x0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3846x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C3846x0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3846x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3846x0(layoutParams);
    }

    public final boolean k(int i5) {
        if (i5 == 0) {
            return (this.f43955n & 1) != 0;
        }
        if (i5 == getChildCount()) {
            return (this.f43955n & 4) != 0;
        }
        if ((this.f43955n & 2) != 0) {
            for (int i10 = i5 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i5;
        if (this.k == null) {
            return;
        }
        int i10 = 0;
        if (this.f43946d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && k(i10)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C3846x0) childAt.getLayoutParams())).topMargin) - this.f43954m);
                }
                i10++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f43954m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C3846x0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = v1.a(this);
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i10)) {
                C3846x0 c3846x0 = (C3846x0) childAt3.getLayoutParams();
                g(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) c3846x0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c3846x0).leftMargin) - this.f43953l);
            }
            i10++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C3846x0 c3846x02 = (C3846x0) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c3846x02).leftMargin;
                    i5 = this.f43953l;
                    right = left - i5;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c3846x02).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i5 = this.f43953l;
                right = left - i5;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC3848y0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC3848y0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f43943a = z2;
    }

    public void setBaselineAlignedChildIndex(int i5) {
        if (i5 >= 0 && i5 < getChildCount()) {
            this.f43944b = i5;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.f43953l = drawable.getIntrinsicWidth();
            this.f43954m = drawable.getIntrinsicHeight();
        } else {
            this.f43953l = 0;
            this.f43954m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i5) {
        this.f43956o = i5;
    }

    public void setGravity(int i5) {
        if (this.f43947e != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f43947e = i5;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i5) {
        int i10 = i5 & 8388615;
        int i11 = this.f43947e;
        if ((8388615 & i11) != i10) {
            this.f43947e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f43950h = z2;
    }

    public void setOrientation(int i5) {
        if (this.f43946d != i5) {
            this.f43946d = i5;
            requestLayout();
        }
    }

    public void setShowDividers(int i5) {
        if (i5 != this.f43955n) {
            requestLayout();
        }
        this.f43955n = i5;
    }

    public void setVerticalGravity(int i5) {
        int i10 = i5 & 112;
        int i11 = this.f43947e;
        if ((i11 & 112) != i10) {
            this.f43947e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f43949g = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class db extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1308a;

    /* renamed from: b, reason: collision with root package name */
    private int f1309b;

    /* renamed from: c, reason: collision with root package name */
    private int f1310c;

    /* renamed from: d, reason: collision with root package name */
    private int f1311d;

    /* renamed from: e, reason: collision with root package name */
    private int f1312e;

    /* renamed from: f, reason: collision with root package name */
    private int f1313f;

    /* renamed from: g, reason: collision with root package name */
    private float f1314g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1315h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f1316i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f1317j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f1318k;

    /* renamed from: l, reason: collision with root package name */
    private int f1319l;
    private int m;
    private int n;
    private int o;

    public db(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1308a = true;
        this.f1309b = -1;
        this.f1310c = 0;
        this.f1312e = 8388659;
        int[] iArr = android.support.v7.a.a.n;
        gc gcVarN = gc.n(context, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, gcVarN.h(), i2, 0);
        int iC = gcVarN.c(1, -1);
        if (iC >= 0) {
            A(iC);
        }
        int iC2 = gcVarN.c(0, -1);
        if (iC2 >= 0 && this.f1312e != iC2) {
            iC2 = (8388615 & iC2) == 0 ? iC2 | GravityCompat.START : iC2;
            this.f1312e = (iC2 & 112) == 0 ? iC2 | 48 : iC2;
            requestLayout();
        }
        if (!gcVarN.r(2, true)) {
            C();
        }
        this.f1314g = gcVarN.v();
        this.f1309b = gcVarN.c(3, -1);
        this.f1315h = gcVarN.r(7, false);
        Drawable drawableJ = gcVarN.j(5);
        if (drawableJ != this.f1318k) {
            this.f1318k = drawableJ;
            if (drawableJ != null) {
                this.f1319l = drawableJ.getIntrinsicWidth();
                this.m = drawableJ.getIntrinsicHeight();
            } else {
                this.f1319l = 0;
                this.m = 0;
            }
            setWillNotDraw(drawableJ == null);
            requestLayout();
        }
        this.n = gcVarN.c(8, 0);
        this.o = gcVarN.b(6, 0);
        gcVarN.q();
    }

    private static void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    public final void A(int i2) {
        if (this.f1311d != i2) {
            this.f1311d = i2;
            requestLayout();
        }
    }

    protected final boolean B(int i2) {
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        int childCount = getChildCount();
        int i3 = this.n;
        if (i2 == childCount) {
            return (i3 & 4) != 0;
        }
        if ((i3 & 2) != 0) {
            do {
                i2--;
                if (i2 >= 0) {
                }
            } while (getChildAt(i2).getVisibility() == 8);
            return true;
        }
        return false;
    }

    public final void C() {
        this.f1308a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: bn, reason: merged with bridge method [inline-methods] */
    public da generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof da ? new da((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new da((ViewGroup.MarginLayoutParams) layoutParams) : new da(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof da;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public da generateDefaultLayoutParams() {
        int i2 = this.f1311d;
        if (i2 == 0) {
            return new da(-2);
        }
        if (i2 == 1) {
            return new da(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public da generateLayoutParams(AttributeSet attributeSet) {
        return new da(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i2;
        if (this.f1309b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1309b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1309b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1310c;
        if (this.f1311d == 1 && (i2 = this.f1312e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1313f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1313f;
            }
        }
        return bottom + ((da) childAt.getLayoutParams()).topMargin + baseline;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f1318k == null) {
            return;
        }
        int i3 = 0;
        if (this.f1311d == 1) {
            int childCount = getChildCount();
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && B(i3)) {
                    y(canvas, (childAt.getTop() - ((da) childAt.getLayoutParams()).topMargin) - this.m);
                }
                i3++;
            }
            if (B(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                y(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.m : childAt2.getBottom() + ((da) childAt2.getLayoutParams()).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zC = android.support.v4.app.dc.c(this);
        while (i3 < childCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && B(i3)) {
                da daVar = (da) childAt3.getLayoutParams();
                z(canvas, zC ? childAt3.getRight() + daVar.rightMargin : (childAt3.getLeft() - daVar.leftMargin) - this.f1319l);
            }
            i3++;
        }
        if (B(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                da daVar2 = (da) childAt4.getLayoutParams();
                if (zC) {
                    left = childAt4.getLeft() - daVar2.leftMargin;
                    i2 = this.f1319l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + daVar2.rightMargin;
                }
            } else if (zC) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f1319l;
                right = left - i2;
            }
            z(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.db.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.db.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final int v() {
        return this.f1319l;
    }

    public final int w() {
        return this.f1312e;
    }

    public final Drawable x() {
        return this.f1318k;
    }

    final void y(Canvas canvas, int i2) {
        this.f1318k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.f1318k.draw(canvas);
    }

    final void z(Canvas canvas, int i2) {
        this.f1318k.setBounds(i2, getPaddingTop() + this.o, this.f1319l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.f1318k.draw(canvas);
    }

    public db(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public db(Context context) {
        this(context, null);
    }
}

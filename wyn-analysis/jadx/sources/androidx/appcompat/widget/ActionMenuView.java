package androidx.appcompat.widget;

import a2.C1323c;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.ads.nativead.l;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import p.j;
import p.k;
import p.m;
import p.z;
import q.AbstractC3848y0;
import q.C3808e;
import q.C3814h;
import q.C3816i;
import q.C3820k;
import q.C3846x0;
import q.InterfaceC3818j;
import q.InterfaceC3822l;
import q.v1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC3848y0 implements j, z {

    /* renamed from: p, reason: collision with root package name */
    public k f17840p;

    /* renamed from: q, reason: collision with root package name */
    public Context f17841q;

    /* renamed from: r, reason: collision with root package name */
    public int f17842r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17843s;

    /* renamed from: t, reason: collision with root package name */
    public C3816i f17844t;

    /* renamed from: u, reason: collision with root package name */
    public C1323c f17845u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17846v;

    /* renamed from: w, reason: collision with root package name */
    public int f17847w;

    /* renamed from: x, reason: collision with root package name */
    public final int f17848x;

    /* renamed from: y, reason: collision with root package name */
    public final int f17849y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC3822l f17850z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f17848x = (int) (56.0f * f10);
        this.f17849y = (int) (f10 * 4.0f);
        this.f17841q = context;
        this.f17842r = 0;
    }

    public static C3820k l() {
        C3820k c3820k = new C3820k(-2, -2);
        c3820k.f43815a = false;
        ((LinearLayout.LayoutParams) c3820k).gravity = 16;
        return c3820k;
    }

    public static C3820k m(ViewGroup.LayoutParams layoutParams) {
        C3820k c3820k;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof C3820k) {
            C3820k c3820k2 = (C3820k) layoutParams;
            c3820k = new C3820k(c3820k2);
            c3820k.f43815a = c3820k2.f43815a;
        } else {
            c3820k = new C3820k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c3820k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c3820k).gravity = 16;
        }
        return c3820k;
    }

    @Override // p.j
    public final boolean a(m mVar) {
        return this.f17840p.q(mVar, null, 0);
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3820k;
    }

    @Override // p.z
    public final void d(k kVar) {
        this.f17840p = kVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f17840p == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.f17840p = kVar;
            kVar.f43043e = new l(this, 15);
            C3816i c3816i = new C3816i(context);
            this.f17844t = c3816i;
            c3816i.f43800l = true;
            c3816i.f43801m = true;
            c3816i.f43794e = new ae.b();
            this.f17840p.b(c3816i, this.f17841q);
            C3816i c3816i2 = this.f17844t;
            c3816i2.f43797h = this;
            this.f17840p = c3816i2.f43792c;
        }
        return this.f17840p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C3816i c3816i = this.f17844t;
        C3814h c3814h = c3816i.f43798i;
        if (c3814h != null) {
            return c3814h.getDrawable();
        }
        if (c3816i.k) {
            return c3816i.f43799j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f17842r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // q.AbstractC3848y0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3846x0 generateDefaultLayoutParams() {
        return l();
    }

    @Override // q.AbstractC3848y0
    /* renamed from: i */
    public final C3846x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C3820k(getContext(), attributeSet);
    }

    @Override // q.AbstractC3848y0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3846x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i5) {
        boolean zA = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof InterfaceC3818j)) {
            zA = ((InterfaceC3818j) childAt).a();
        }
        return (i5 <= 0 || !(childAt2 instanceof InterfaceC3818j)) ? zA : ((InterfaceC3818j) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3816i c3816i = this.f17844t;
        if (c3816i != null) {
            c3816i.d();
            if (this.f17844t.j()) {
                this.f17844t.i();
                this.f17844t.k();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3816i c3816i = this.f17844t;
        if (c3816i != null) {
            c3816i.i();
            C3808e c3808e = c3816i.f43808t;
            if (c3808e == null || !c3808e.b()) {
                return;
            }
            c3808e.f43114i.dismiss();
        }
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f17846v) {
            super.onLayout(z2, i5, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i5;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean zA = v1.a(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C3820k c3820k = (C3820k) childAt.getLayoutParams();
                if (c3820k.f43815a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c3820k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c3820k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c3820k).leftMargin) + ((LinearLayout.LayoutParams) c3820k).rightMargin;
                    n(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                C3820k c3820k2 = (C3820k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c3820k2.f43815a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) c3820k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c3820k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            C3820k c3820k3 = (C3820k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c3820k3.f43815a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) c3820k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c3820k3).rightMargin + iMax + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // q.AbstractC3848y0, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        k kVar;
        boolean z2 = this.f17846v;
        boolean z10 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.f17846v = z10;
        if (z2 != z10) {
            this.f17847w = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.f17846v && (kVar = this.f17840p) != null && size != this.f17847w) {
            this.f17847w = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f17846v || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                C3820k c3820k = (C3820k) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) c3820k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c3820k).leftMargin = 0;
            }
            super.onMeasure(i5, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i5);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f17848x;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z11 = false;
        int i23 = 0;
        long j8 = 0;
        while (true) {
            i11 = this.f17849y;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z12) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                C3820k c3820k2 = (C3820k) childAt.getLayoutParams();
                c3820k2.f43820f = false;
                c3820k2.f43817c = 0;
                c3820k2.f43816b = 0;
                c3820k2.f43818d = false;
                ((LinearLayout.LayoutParams) c3820k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c3820k2).rightMargin = 0;
                c3820k2.f43819e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c3820k2.f43815a ? 1 : i18;
                C3820k c3820k3 = (C3820k) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i26 <= 0 || (z13 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z14 && i14 < 2) {
                        i14 = 2;
                    }
                }
                c3820k3.f43818d = !c3820k3.f43815a && z14;
                c3820k3.f43816b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (c3820k2.f43818d) {
                    i23++;
                }
                if (c3820k2.f43815a) {
                    z11 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j8 |= 1 << i22;
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z15 = z11 && i21 == 2;
        int i31 = i29;
        boolean z16 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = f.API_PRIORITY_OTHER;
            long j10 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                boolean z17 = z15;
                C3820k c3820k4 = (C3820k) getChildAt(i34).getLayoutParams();
                int i35 = iMax;
                if (c3820k4.f43818d) {
                    int i36 = c3820k4.f43816b;
                    if (i36 < i32) {
                        j10 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                iMax = i35;
                z15 = z17;
            }
            boolean z18 = z15;
            i12 = iMax;
            j8 |= j10;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                C3820k c3820k5 = (C3820k) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j11 = 1 << i38;
                if ((j10 & j11) != 0) {
                    if (z18 && c3820k5.f43819e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c3820k5.f43816b += r11;
                    c3820k5.f43820f = r11;
                    i31--;
                } else if (c3820k5.f43816b == i37) {
                    j8 |= j11;
                }
                i38++;
                z11 = z19;
            }
            iMax = i12;
            z15 = z18;
            z16 = true;
        }
        i12 = iMax;
        boolean z20 = !z11 && i21 == 1;
        if (i31 > 0 && j8 != 0 && (i31 < i21 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j8);
            if (!z20) {
                if ((j8 & 1) != 0 && !((C3820k) getChildAt(0).getLayoutParams()).f43819e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j8 & (1 << i39)) != 0 && !((C3820k) getChildAt(i39).getLayoutParams()).f43819e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j8 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C3820k c3820k6 = (C3820k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c3820k6.f43817c = i40;
                        c3820k6.f43820f = true;
                        if (i41 == 0 && !c3820k6.f43819e) {
                            ((LinearLayout.LayoutParams) c3820k6).leftMargin = (-i40) / 2;
                        }
                        z21 = true;
                    } else if (c3820k6.f43815a) {
                        c3820k6.f43817c = i40;
                        c3820k6.f43820f = true;
                        ((LinearLayout.LayoutParams) c3820k6).rightMargin = (-i40) / 2;
                        z21 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) c3820k6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c3820k6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                C3820k c3820k7 = (C3820k) childAt4.getLayoutParams();
                if (c3820k7.f43820f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c3820k7.f43816b * i30) + c3820k7.f43817c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f17844t.f43805q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC3822l interfaceC3822l) {
        this.f17850z = interfaceC3822l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C3816i c3816i = this.f17844t;
        C3814h c3814h = c3816i.f43798i;
        if (c3814h != null) {
            c3814h.setImageDrawable(drawable);
        } else {
            c3816i.k = true;
            c3816i.f43799j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f17843s = z2;
    }

    public void setPopupTheme(int i5) {
        if (this.f17842r != i5) {
            this.f17842r = i5;
            if (i5 == 0) {
                this.f17841q = getContext();
            } else {
                this.f17841q = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setPresenter(C3816i c3816i) {
        this.f17844t = c3816i;
        c3816i.f43797h = this;
        this.f17840p = c3816i.f43792c;
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3820k(getContext(), attributeSet);
    }
}

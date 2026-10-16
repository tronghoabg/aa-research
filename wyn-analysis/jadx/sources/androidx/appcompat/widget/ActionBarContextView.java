package androidx.appcompat.widget;

import F6.f;
import Fe.g;
import Yf.B;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import i.AbstractC2820a;
import java.util.WeakHashMap;
import k1.S;
import k1.X;
import o.AbstractC3620a;
import p.k;
import p.z;
import q.C3808e;
import q.C3816i;
import q.v1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final B f17794a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17795b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f17796c;

    /* renamed from: d, reason: collision with root package name */
    public C3816i f17797d;

    /* renamed from: e, reason: collision with root package name */
    public int f17798e;

    /* renamed from: f, reason: collision with root package name */
    public X f17799f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17800g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17801h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f17802i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f17803j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f17804l;

    /* renamed from: m, reason: collision with root package name */
    public View f17805m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f17806n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f17807o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f17808p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17809q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17810r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17811s;

    /* renamed from: t, reason: collision with root package name */
    public final int f17812t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f17794a = new B(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f17795b = context;
        } else {
            this.f17795b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36441d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : g.B(context, resourceId);
        WeakHashMap weakHashMap = S.f38779a;
        setBackground(drawable);
        this.f17809q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f17810r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f17798e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f17812t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i5, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i10);
        return Math.max(0, i5 - view.getMeasuredWidth());
    }

    public static int g(View view, boolean z2, int i5, int i10, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z2) {
            view.layout(i5 - measuredWidth, i12, i5, measuredHeight + i12);
        } else {
            view.layout(i5, i12, i5 + measuredWidth, measuredHeight + i12);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC3620a abstractC3620a) {
        View view = this.k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f17812t, (ViewGroup) this, false);
            this.k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.k);
        }
        View viewFindViewById = this.k.findViewById(R.id.action_mode_close_button);
        this.f17804l = viewFindViewById;
        viewFindViewById.setOnClickListener(new f(abstractC3620a, 4));
        k kVarC = abstractC3620a.c();
        C3816i c3816i = this.f17797d;
        if (c3816i != null) {
            c3816i.i();
            C3808e c3808e = c3816i.f43808t;
            if (c3808e != null && c3808e.b()) {
                c3808e.f43114i.dismiss();
            }
        }
        C3816i c3816i2 = new C3816i(getContext());
        this.f17797d = c3816i2;
        c3816i2.f43800l = true;
        c3816i2.f43801m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        kVarC.b(this.f17797d, this.f17795b);
        C3816i c3816i3 = this.f17797d;
        z zVar = c3816i3.f43797h;
        if (zVar == null) {
            z zVar2 = (z) c3816i3.f43793d.inflate(c3816i3.f43795f, (ViewGroup) this, false);
            c3816i3.f43797h = zVar2;
            zVar2.d(c3816i3.f43792c);
            c3816i3.d();
        }
        z zVar3 = c3816i3.f43797h;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c3816i3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f17796c = actionMenuView;
        WeakHashMap weakHashMap = S.f38779a;
        actionMenuView.setBackground(null);
        addView(this.f17796c, layoutParams);
    }

    public final void d() {
        if (this.f17806n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f17806n = linearLayout;
            this.f17807o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f17808p = (TextView) this.f17806n.findViewById(R.id.action_bar_subtitle);
            int i5 = this.f17809q;
            if (i5 != 0) {
                this.f17807o.setTextAppearance(getContext(), i5);
            }
            int i10 = this.f17810r;
            if (i10 != 0) {
                this.f17808p.setTextAppearance(getContext(), i10);
            }
        }
        this.f17807o.setText(this.f17802i);
        this.f17808p.setText(this.f17803j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f17802i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f17803j);
        this.f17808p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f17806n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f17806n.getParent() == null) {
            addView(this.f17806n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f17805m = null;
        this.f17796c = null;
        this.f17797d = null;
        View view = this.f17804l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f17799f != null ? this.f17794a.f16807b : getVisibility();
    }

    public int getContentHeight() {
        return this.f17798e;
    }

    public CharSequence getSubtitle() {
        return this.f17803j;
    }

    public CharSequence getTitle() {
        return this.f17802i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i5) {
        if (i5 != getVisibility()) {
            X x5 = this.f17799f;
            if (x5 != null) {
                x5.b();
            }
            super.setVisibility(i5);
        }
    }

    public final X i(int i5, long j8) {
        X x5 = this.f17799f;
        if (x5 != null) {
            x5.b();
        }
        B b5 = this.f17794a;
        if (i5 != 0) {
            X xA = S.a(this);
            xA.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            xA.c(j8);
            ((ActionBarContextView) b5.f16809d).f17799f = xA;
            b5.f16807b = i5;
            xA.d(b5);
            return xA;
        }
        if (getVisibility() != 0) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        X xA2 = S.a(this);
        xA2.a(1.0f);
        xA2.c(j8);
        ((ActionBarContextView) b5.f16809d).f17799f = xA2;
        b5.f16807b = i5;
        xA2.d(b5);
        return xA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC2820a.f36438a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C3816i c3816i = this.f17797d;
        if (c3816i != null) {
            Configuration configuration2 = c3816i.f43791b.getResources().getConfiguration();
            int i5 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            c3816i.f43804p = (configuration2.smallestScreenWidthDp > 600 || i5 > 600 || (i5 > 960 && i10 > 720) || (i5 > 720 && i10 > 960)) ? 5 : (i5 >= 500 || (i5 > 640 && i10 > 480) || (i5 > 480 && i10 > 640)) ? 4 : i5 >= 360 ? 3 : 2;
            k kVar = c3816i.f43792c;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3816i c3816i = this.f17797d;
        if (c3816i != null) {
            c3816i.i();
            C3808e c3808e = this.f17797d.f43808t;
            if (c3808e == null || !c3808e.b()) {
                return;
            }
            c3808e.f43114i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f17801h = false;
        }
        if (!this.f17801h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f17801h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f17801h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        boolean zA = v1.a(this);
        int paddingRight = zA ? (i11 - i5) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i13 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = zA ? paddingRight - i13 : paddingRight + i13;
            int iG = g(this.k, zA, i15, paddingTop, paddingTop2) + i15;
            paddingRight = zA ? iG - i14 : iG + i14;
        }
        LinearLayout linearLayout = this.f17806n;
        if (linearLayout != null && this.f17805m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f17806n, zA, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f17805m;
        if (view2 != null) {
            g(view2, zA, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i11 - i5) - getPaddingRight();
        ActionMenuView actionMenuView = this.f17796c;
        if (actionMenuView != null) {
            g(actionMenuView, !zA, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i5);
        int size2 = this.f17798e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f17796c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f17796c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f17806n;
        if (linearLayout != null && this.f17805m == null) {
            if (this.f17811s) {
                this.f17806n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f17806n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f17806n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f17805m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f17805m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f17798e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17800g = false;
        }
        if (!this.f17800g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f17800g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f17800g = false;
        return true;
    }

    public void setContentHeight(int i5) {
        this.f17798e = i5;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f17805m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f17805m = view;
        if (view != null && (linearLayout = this.f17806n) != null) {
            removeView(linearLayout);
            this.f17806n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f17803j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f17802i = charSequence;
        d();
        S.n(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f17811s) {
            requestLayout();
        }
        this.f17811s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

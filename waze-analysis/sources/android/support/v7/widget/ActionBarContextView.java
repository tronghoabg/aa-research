package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ActionBarContextView extends b {

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f873g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f874h;

    /* renamed from: i, reason: collision with root package name */
    private View f875i;

    /* renamed from: j, reason: collision with root package name */
    private View f876j;

    /* renamed from: k, reason: collision with root package name */
    private View f877k;

    /* renamed from: l, reason: collision with root package name */
    private LinearLayout f878l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        gc gcVarN = gc.n(context, attributeSet, android.support.v7.a.a.f482d, i2, 0);
        setBackground(gcVarN.j(0));
        this.o = gcVarN.f(5, 0);
        this.p = gcVarN.f(4, 0);
        this.f1103e = gcVarN.e(3, 0);
        this.r = gcVarN.f(2, R.layout.abc_action_mode_close_item_material);
        gcVarN.q();
        this.v = getPaddingLeft();
        this.w = getPaddingTop();
        this.x = getPaddingRight();
        this.y = getPaddingBottom();
    }

    private final void t() {
        if (this.f878l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f878l = linearLayout;
            this.m = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.n = (TextView) this.f878l.findViewById(R.id.action_bar_subtitle);
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.m.setText(this.f873g);
        this.n.setText(this.f874h);
        boolean zIsEmpty = TextUtils.isEmpty(this.f873g);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f874h);
        this.n.setVisibility(true != zIsEmpty2 ? 0 : 8);
        this.f878l.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f878l.getParent() == null) {
            addView(this.f878l);
        }
    }

    private final void u() {
        super.setPadding(this.s + this.v, this.t + this.w, this.u + this.x, this.y);
    }

    @Override // android.support.v7.widget.b
    public final void d(int i2) {
        this.f1103e = i2;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final CharSequence h() {
        return this.f874h;
    }

    public final CharSequence i() {
        return this.f873g;
    }

    public final void j() {
        if (this.f875i == null) {
            l();
        }
    }

    public final void k(android.support.v7.view.b bVar) {
        View view = this.f875i;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.r, (ViewGroup) this, false);
            this.f875i = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f875i);
        }
        View viewFindViewById = this.f875i.findViewById(R.id.action_mode_close_button);
        this.f876j = viewFindViewById;
        viewFindViewById.setOnClickListener(new gf(bVar, 1));
        android.support.v7.view.menu.q qVar = (android.support.v7.view.menu.q) bVar.a();
        p pVar = this.f1102d;
        if (pVar != null) {
            pVar.w();
        }
        this.f1102d = new p(getContext());
        this.f1102d.z();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        qVar.k(this.f1102d, this.f1100b);
        this.f1101c = (ActionMenuView) this.f1102d.r(this);
        this.f1101c.setBackground(null);
        addView(this.f1101c, layoutParams);
    }

    public final void l() {
        removeAllViews();
        this.f877k = null;
        this.f1101c = null;
        this.f1102d = null;
        View view = this.f876j;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void m(View view) {
        LinearLayout linearLayout;
        View view2 = this.f877k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f877k = view;
        if (view != null && (linearLayout = this.f878l) != null) {
            removeView(linearLayout);
            this.f878l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void n(CharSequence charSequence) {
        this.f874h = charSequence;
        t();
    }

    public final void o(CharSequence charSequence) {
        this.f873g = charSequence;
        t();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    @Override // android.support.v7.widget.b, android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, android.support.v7.a.a.f482d, R.attr.actionModeStyle, 0);
        this.f1103e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p pVar = this.f1102d;
        if (pVar != null) {
            pVar.t();
            this.f1102d.A();
        }
    }

    @Override // android.support.v7.widget.b, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean zC = android.support.v4.app.dc.c(this);
        int paddingRight = zC ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f875i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f875i.getLayoutParams();
            int i6 = zC ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zC ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = a(paddingRight, i6, zC);
            paddingRight = a(iA + g(this.f875i, iA, paddingTop, paddingTop2, zC), i7, zC);
        }
        LinearLayout linearLayout = this.f878l;
        if (linearLayout != null && this.f877k == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f878l, paddingRight, paddingTop, paddingTop2, zC);
        }
        View view2 = this.f877k;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, zC);
        }
        int paddingLeft = zC ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1101c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zC);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i4 = this.f1103e;
        int size2 = i4 > 0 ? i4 + this.t : View.MeasureSpec.getSize(i3);
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f875i;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f875i.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1101c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1101c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f878l;
        if (linearLayout != null && this.f877k == null) {
            if (this.q) {
                this.f878l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f878l.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f878l.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f877k;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i6 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = Math.min(layoutParams.height, iMin);
            }
            this.f877k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f1103e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.support.v7.widget.b, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void p(boolean z) {
        if (z != this.q) {
            requestLayout();
        }
        this.q = z;
    }

    public final boolean q() {
        return this.q;
    }

    public final void r(int i2, int i3, int i4) {
        this.s = i2;
        this.t = i3;
        this.u = i4;
        u();
    }

    public final void s() {
        p pVar = this.f1102d;
        if (pVar != null) {
            pVar.v();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.v = i2;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        u();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
        if (getLayoutDirection() == 1) {
            i4 = i2;
            i2 = i4;
        }
        this.v = i2;
        this.x = i4;
        this.w = i3;
        this.y = i5;
        u();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}

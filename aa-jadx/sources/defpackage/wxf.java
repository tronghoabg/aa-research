package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxf extends android.widget.LinearLayout {
    public android.widget.TextView a;
    public android.widget.ImageView b;
    public android.view.View c;
    public final android.graphics.drawable.Drawable d;
    final /* synthetic */ com.google.android.material.tabs.TabLayout e;
    private defpackage.wxd f;
    private android.widget.TextView g;
    private android.widget.ImageView h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxf(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        this.e = tabLayout;
        this.i = 2;
        int i = tabLayout.p;
        if (i != 0) {
            android.graphics.drawable.Drawable drawableE = defpackage.ca.e(context, i);
            this.d = drawableE;
            if (drawableE != null && drawableE.isStateful()) {
                drawableE.setState(getDrawableState());
            }
        } else {
            this.d = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        android.graphics.drawable.Drawable drawableA = gradientDrawable;
        if (tabLayout.k != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList colorStateList = tabLayout.k;
            int[] iArr = defpackage.wud.a;
            int iA = defpackage.wud.a(colorStateList, defpackage.wud.c);
            int[] iArr2 = defpackage.wud.b;
            android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(new int[][]{defpackage.wud.d, iArr2, android.util.StateSet.NOTHING}, new int[]{iA, defpackage.wud.a(colorStateList, iArr2), defpackage.wud.a(colorStateList, defpackage.wud.a)});
            if (tabLayout.y) {
                drawableA = com.google.android.material.focus.FocusRingDrawable.a(context, new android.graphics.drawable.RippleDrawable(colorStateList2, null, null));
            } else {
                android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                com.google.android.material.focus.FocusRingDrawable.c(context, rippleDrawable, null);
                drawableA = rippleDrawable;
            }
        }
        setBackground(drawableA);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        android.view.PointerIcon systemIcon = android.view.PointerIcon.getSystemIcon(getContext(), 1002);
        int[] iArr3 = defpackage.ebt.a;
        defpackage.ebn.a(this, systemIcon);
    }

    private final void d(android.widget.TextView textView, android.widget.ImageView imageView, boolean z) {
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        if (textView != null) {
            textView.setText((java.lang.CharSequence) null);
            textView.setVisibility(8);
        }
        if (z && imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (this.e.v) {
                if (marginLayoutParams.getMarginEnd() != 0) {
                    marginLayoutParams.setMarginEnd(0);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        defpackage.wxd wxdVar = this.f;
        setTooltipText(wxdVar != null ? wxdVar.b : null);
    }

    private static final void e(android.view.View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new defpackage.oco(view, 5));
    }

    public final void a(defpackage.wxd wxdVar) {
        if (wxdVar != this.f) {
            this.f = wxdVar;
            b();
        }
    }

    final void b() {
        c();
        defpackage.wxd wxdVar = this.f;
        boolean z = false;
        if (wxdVar != null) {
            com.google.android.material.tabs.TabLayout tabLayout = wxdVar.f;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iA = tabLayout.a();
            if (iA != -1 && iA == wxdVar.c) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void c() {
        int i;
        android.view.ViewParent parent;
        defpackage.wxd wxdVar = this.f;
        android.view.View view = wxdVar != null ? wxdVar.d : null;
        if (view != null) {
            android.view.ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((android.view.ViewGroup) parent2).removeView(view);
                }
                android.view.View view2 = this.c;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((android.view.ViewGroup) parent).removeView(this.c);
                }
                addView(view);
            }
            this.c = view;
            android.widget.TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.b.setImageDrawable(null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.i = textView2.getMaxLines();
            }
            this.h = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        } else {
            android.view.View view3 = this.c;
            if (view3 != null) {
                removeView(view3);
                this.c = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.c == null) {
            if (this.b == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.projection.gearhead.R.layout.design_layout_tab_icon, (android.view.ViewGroup) this, false);
                this.b = imageView2;
                addView(imageView2, 0);
            }
            if (this.a == null) {
                android.widget.TextView textView3 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.projection.gearhead.R.layout.design_layout_tab_text, (android.view.ViewGroup) this, false);
                this.a = textView3;
                addView(textView3);
                this.i = this.a.getMaxLines();
            }
            android.widget.TextView textView4 = this.a;
            com.google.android.material.tabs.TabLayout tabLayout = this.e;
            textView4.setTextAppearance(tabLayout.g);
            if (!isSelected() || (i = tabLayout.i) == -1) {
                this.a.setTextAppearance(tabLayout.h);
            } else {
                this.a.setTextAppearance(i);
            }
            android.content.res.ColorStateList colorStateList = tabLayout.j;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            d(this.a, this.b, true);
            e(this.b);
            e(this.a);
        } else {
            android.widget.TextView textView5 = this.g;
            if (textView5 != null || this.h != null) {
                d(textView5, this.h, false);
            }
        }
        if (wxdVar == null || android.text.TextUtils.isEmpty(wxdVar.b)) {
            return;
        }
        setContentDescription(wxdVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.d;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
            this.e.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        defpackage.edn ednVar = new defpackage.edn(accessibilityNodeInfo);
        ednVar.u(defpackage.erh.J(0, 1, this.f.c, 1, isSelected()));
        if (isSelected()) {
            ednVar.s(false);
            ednVar.ab(defpackage.edm.c);
        }
        ednVar.K(getResources().getString(com.google.android.projection.gearhead.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        android.text.Layout layout;
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        com.google.android.material.tabs.TabLayout tabLayout = this.e;
        int i3 = tabLayout.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = tabLayout.m;
            if (isSelected() && tabLayout.i != -1) {
                f = tabLayout.n;
            }
            int i4 = this.i;
            android.widget.ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.o;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.f.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        android.widget.TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        android.widget.ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        android.view.View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}

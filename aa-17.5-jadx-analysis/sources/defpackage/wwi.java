package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class wwi extends LinearLayout {
    public TextView a;
    public ImageView b;
    public View c;
    public final Drawable d;
    final /* synthetic */ TabLayout e;
    private wwg f;
    private TextView g;
    private ImageView h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwi(TabLayout tabLayout, Context context) {
        super(context);
        this.e = tabLayout;
        this.i = 2;
        int i = tabLayout.p;
        if (i != 0) {
            Drawable drawableE = ca.e(context, i);
            this.d = drawableE;
            if (drawableE != null && drawableE.isStateful()) {
                drawableE.setState(getDrawableState());
            }
        } else {
            this.d = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable drawableA = gradientDrawable;
        if (tabLayout.k != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.k;
            int[] iArr = wtg.a;
            int iA = wtg.a(colorStateList, wtg.c);
            int[] iArr2 = wtg.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{wtg.d, iArr2, StateSet.NOTHING}, new int[]{iA, wtg.a(colorStateList, iArr2), wtg.a(colorStateList, wtg.a)});
            if (tabLayout.y) {
                drawableA = FocusRingDrawable.a(context, new RippleDrawable(colorStateList2, null, null));
            } else {
                RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.c(context, rippleDrawable, null);
                drawableA = rippleDrawable;
            }
        }
        setBackground(drawableA);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        int[] iArr3 = ebm.a;
        ebg.a(this, systemIcon);
    }

    private final void d(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        boolean z3 = !zIsEmpty;
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                int i = this.f.e;
                z2 = true;
            }
            textView.setText((CharSequence) null);
            textView.setVisibility(true != z2 ? 8 : 0);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iE = (z2 && imageView.getVisibility() == 0) ? (int) woy.E(getContext(), 8) : 0;
            if (this.e.v) {
                if (iE != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iE);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iE != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iE;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        wwg wwgVar = this.f;
        setTooltipText(true != z3 ? wwgVar != null ? wwgVar.b : null : null);
    }

    private static final void e(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new obt(view, 5));
    }

    public final void a(wwg wwgVar) {
        if (wwgVar != this.f) {
            this.f = wwgVar;
            b();
        }
    }

    final void b() {
        c();
        wwg wwgVar = this.f;
        boolean z = false;
        if (wwgVar != null) {
            TabLayout tabLayout = wwgVar.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iA = tabLayout.a();
            if (iA != -1 && iA == wwgVar.c) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void c() {
        int i;
        ViewParent parent;
        wwg wwgVar = this.f;
        View view = wwgVar != null ? wwgVar.d : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.c;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.c);
                }
                addView(view);
            }
            this.c = view;
            TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.b.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.i = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.c;
            if (view3 != null) {
                removeView(view3);
                this.c = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.c == null) {
            if (this.b == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.google.android.projection.gearhead.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.b = imageView2;
                addView(imageView2, 0);
            }
            if (this.a == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.google.android.projection.gearhead.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.a = textView3;
                addView(textView3);
                this.i = this.a.getMaxLines();
            }
            TextView textView4 = this.a;
            TabLayout tabLayout = this.e;
            textView4.setTextAppearance(tabLayout.g);
            if (!isSelected() || (i = tabLayout.i) == -1) {
                this.a.setTextAppearance(tabLayout.h);
            } else {
                this.a.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.j;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            d(this.a, this.b, true);
            e(this.b);
            e(this.a);
        } else {
            TextView textView5 = this.g;
            if (textView5 != null || this.h != null) {
                d(textView5, this.h, false);
            }
        }
        if (wwgVar == null || TextUtils.isEmpty(wwgVar.b)) {
            return;
        }
        setContentDescription(wwgVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
            this.e.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        edg edgVar = new edg(accessibilityNodeInfo);
        edgVar.u(erb.y(0, 1, this.f.c, 1, isSelected()));
        if (isSelected()) {
            edgVar.s(false);
            edgVar.ab(edf.c);
        }
        edgVar.K(getResources().getString(com.google.android.projection.gearhead.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.e;
        int i3 = tabLayout.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = tabLayout.m;
            if (isSelected() && tabLayout.i != -1) {
                f = tabLayout.n;
            }
            int i4 = this.i;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
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
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}

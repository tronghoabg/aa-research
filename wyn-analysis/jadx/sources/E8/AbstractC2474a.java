package e8;

import Ba.c;
import C6.j;
import U8.v0;
import W7.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.C1583g;
import c8.C1587k;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.H;
import k1.J;
import k1.S;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2474a extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final j f34428i = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final C1587k f34429a;

    /* renamed from: b, reason: collision with root package name */
    public int f34430b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34431c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34432d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34433e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34434f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f34435g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f34436h;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2474a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(h8.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, I7.a.f5420w);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = S.f38779a;
            J.k(this, dimensionPixelSize);
        }
        this.f34430b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f34429a = C1587k.b(context2, attributeSet, 0, 0).a();
        }
        this.f34431c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(c.w(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(k.g(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f34432d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f34433e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f34434f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f34428i);
        setFocusable(true);
        if (getBackground() == null) {
            int iS = v0.S(getBackgroundOverlayColorAlpha(), v0.I(R.attr.colorSurface, this), v0.I(R.attr.colorOnSurface, this));
            C1587k c1587k = this.f34429a;
            if (c1587k != null) {
                int i5 = b.f34437a;
                C1583g c1583g = new C1583g(c1587k);
                c1583g.j(ColorStateList.valueOf(iS));
                gradientDrawable = c1583g;
            } else {
                Resources resources = getResources();
                int i10 = b.f34437a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iS);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f34435g;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = S.f38779a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f34432d;
    }

    public int getAnimationMode() {
        return this.f34430b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f34431c;
    }

    public int getMaxInlineActionWidth() {
        return this.f34434f;
    }

    public int getMaxWidth() {
        return this.f34433e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = S.f38779a;
        H.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int i11 = this.f34433e;
        if (i11 <= 0 || getMeasuredWidth() <= i11) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }

    public void setAnimationMode(int i5) {
        this.f34430b = i5;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f34435g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f34435g);
            drawable.setTintMode(this.f34436h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f34435g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f34436h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f34436h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f34428i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(b bVar) {
    }
}

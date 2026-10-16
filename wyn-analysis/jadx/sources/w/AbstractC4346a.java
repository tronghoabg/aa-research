package w;

import ae.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import u0.w0;
import v.AbstractC4297a;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4346a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f47250f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final d f47251g = new d(15);

    /* renamed from: a, reason: collision with root package name */
    public boolean f47252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47253b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f47254c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f47255d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f47256e;

    public AbstractC4346a(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.wynauto.wyn.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f47254c = rect;
        this.f47255d = new Rect();
        w0 w0Var = new w0(this);
        this.f47256e = w0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4297a.f46798a, com.wynauto.wyn.R.attr.cardViewStyle, com.wynauto.wyn.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f47250f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.wynauto.wyn.R.color.cardview_light_background) : getResources().getColor(com.wynauto.wyn.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f47252a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f47253b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        d dVar = f47251g;
        C4347b c4347b = new C4347b(colorStateListValueOf, dimension);
        w0Var.f46405a = c4347b;
        setBackgroundDrawable(c4347b);
        setClipToOutline(true);
        setElevation(dimension2);
        dVar.i(w0Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C4347b) ((Drawable) this.f47256e.f46405a)).f47264h;
    }

    public float getCardElevation() {
        return ((AbstractC4346a) this.f47256e.f46406b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f47254c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f47254c.left;
    }

    public int getContentPaddingRight() {
        return this.f47254c.right;
    }

    public int getContentPaddingTop() {
        return this.f47254c.top;
    }

    public float getMaxCardElevation() {
        return ((C4347b) ((Drawable) this.f47256e.f46405a)).f47261e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f47253b;
    }

    public float getRadius() {
        return ((C4347b) ((Drawable) this.f47256e.f46405a)).f47257a;
    }

    public boolean getUseCompatPadding() {
        return this.f47252a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
    }

    public void setCardBackgroundColor(int i5) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i5);
        C4347b c4347b = (C4347b) ((Drawable) this.f47256e.f46405a);
        if (colorStateListValueOf == null) {
            c4347b.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c4347b.f47264h = colorStateListValueOf;
        c4347b.f47258b.setColor(colorStateListValueOf.getColorForState(c4347b.getState(), c4347b.f47264h.getDefaultColor()));
        c4347b.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((AbstractC4346a) this.f47256e.f46406b).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f47251g.i(this.f47256e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i5) {
        super.setMinimumHeight(i5);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i5) {
        super.setMinimumWidth(i5);
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f47253b) {
            this.f47253b = z2;
            d dVar = f47251g;
            w0 w0Var = this.f47256e;
            dVar.i(w0Var, ((C4347b) ((Drawable) w0Var.f46405a)).f47261e);
        }
    }

    public void setRadius(float f10) {
        C4347b c4347b = (C4347b) ((Drawable) this.f47256e.f46405a);
        if (f10 == c4347b.f47257a) {
            return;
        }
        c4347b.f47257a = f10;
        c4347b.b(null);
        c4347b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f47252a != z2) {
            this.f47252a = z2;
            d dVar = f47251g;
            w0 w0Var = this.f47256e;
            dVar.i(w0Var, ((C4347b) ((Drawable) w0Var.f46405a)).f47261e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C4347b c4347b = (C4347b) ((Drawable) this.f47256e.f46405a);
        if (colorStateList == null) {
            c4347b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c4347b.f47264h = colorStateList;
        c4347b.f47258b.setColor(colorStateList.getColorForState(c4347b.getState(), c4347b.f47264h.getDefaultColor()));
        c4347b.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i5, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i5, int i10, int i11, int i12) {
    }
}

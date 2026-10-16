package w;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4347b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f47257a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f47258b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f47259c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f47260d;

    /* renamed from: e, reason: collision with root package name */
    public float f47261e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f47264h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f47265i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f47266j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47262f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47263g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public C4347b(ColorStateList colorStateList, float f10) {
        this.f47257a = f10;
        Paint paint = new Paint(5);
        this.f47258b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f47264h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f47264h.getDefaultColor()));
        this.f47259c = new RectF();
        this.f47260d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f47259c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f47260d;
        rect2.set(rect);
        if (this.f47262f) {
            rect2.inset((int) Math.ceil(AbstractC4348c.a(this.f47261e, this.f47257a, this.f47263g)), (int) Math.ceil(AbstractC4348c.b(this.f47261e, this.f47257a, this.f47263g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f47258b;
        if (this.f47265i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f47265i);
            z2 = true;
        }
        RectF rectF = this.f47259c;
        float f10 = this.f47257a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f47260d, this.f47257a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f47266j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f47264h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f47264h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f47258b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f47266j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z2;
        }
        this.f47265i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f47258b.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47258b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f47266j = colorStateList;
        this.f47265i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f47265i = a(this.f47266j, mode);
        invalidateSelf();
    }
}

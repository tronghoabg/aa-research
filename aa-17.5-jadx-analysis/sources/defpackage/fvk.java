package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public abstract class fvk extends FrameLayout {
    public int a;
    public int b;
    public final float c;
    public final int d;
    public final int e;
    private final int f;
    private final int g;
    private final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fvn.a, i, 0);
        typedArrayObtainStyledAttributes.getClass();
        b(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0));
        a(typedArrayObtainStyledAttributes.getColor(0, 0));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.c = typedArrayObtainStyledAttributes.getFloat(6, BitmapDescriptorFactory.HUE_RED);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.h = typedArrayObtainStyledAttributes.getBoolean(7, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        d();
    }

    public final void b(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        d();
    }

    public abstract void c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [fvk] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.graphics.drawable.InsetDrawable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.graphics.drawable.InsetDrawable] */
    public final void d() {
        c();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.a;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.b);
        int i2 = this.f;
        int i3 = this.g;
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setCornerRadii(fArr);
        if (e()) {
            gradientDrawable = new InsetDrawable((Drawable) gradientDrawable, 0, 0, 0, -i2);
        }
        setBackground(gradientDrawable);
        if (this.h) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int i4 = this.b;
            float fAlpha = Color.alpha(i3) / 255.0f;
            float f = 1.0f - fAlpha;
            gradientDrawable2.setStroke(i2, Color.argb(255, gbt.i((Color.red(i3) * fAlpha) + (Color.red(i4) * f)), gbt.i((Color.green(i3) * fAlpha) + (Color.green(i4) * f)), gbt.i((fAlpha * Color.blue(i3)) + (f * Color.blue(i4)))));
            gradientDrawable2.setCornerRadii(fArr);
            if (e()) {
                gradientDrawable2 = new InsetDrawable((Drawable) gradientDrawable2, 0, 0, 0, -i2);
            }
            setForeground(gradientDrawable2);
            setClipToOutline(true);
            setOutlineProvider(new fvj(this));
        }
        invalidate();
    }

    public final boolean e() {
        if (getParent() == null) {
            return false;
        }
        ViewParent parent = getParent();
        parent.getClass();
        return getTop() + getHeight() >= ((ViewGroup) parent).getHeight();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setClipToOutline(false);
        d();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (getId() == -1) {
            return;
        }
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fvk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fvk(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fvk(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ fvk(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

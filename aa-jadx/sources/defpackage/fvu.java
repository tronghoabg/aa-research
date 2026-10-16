package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fvu extends android.widget.FrameLayout {
    public int a;
    public int b;
    public final float c;
    public final int d;
    public final int e;
    private final int f;
    private final int g;
    private final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.fvx.a, i, 0);
        typedArrayObtainStyledAttributes.getClass();
        b(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0));
        a(typedArrayObtainStyledAttributes.getColor(0, 0));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.c = typedArrayObtainStyledAttributes.getFloat(6, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
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

    public final void d() {
        android.graphics.drawable.Drawable insetDrawable;
        c();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.a;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(this.b);
        int i2 = this.f;
        int i3 = this.g;
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setCornerRadii(fArr);
        android.graphics.drawable.Drawable insetDrawable2 = gradientDrawable;
        if (e()) {
            insetDrawable2 = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) gradientDrawable, 0, 0, 0, -i2);
        }
        setBackground(insetDrawable2);
        if (this.h) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            int i4 = this.b;
            float fAlpha = android.graphics.Color.alpha(i3) / 255.0f;
            float f = 1.0f - fAlpha;
            gradientDrawable2.setStroke(i2, android.graphics.Color.argb(255, defpackage.gcg.f((android.graphics.Color.red(i3) * fAlpha) + (android.graphics.Color.red(i4) * f)), defpackage.gcg.f((android.graphics.Color.green(i3) * fAlpha) + (android.graphics.Color.green(i4) * f)), defpackage.gcg.f((fAlpha * android.graphics.Color.blue(i3)) + (f * android.graphics.Color.blue(i4)))));
            gradientDrawable2.setCornerRadii(fArr);
            if (e()) {
                insetDrawable = gradientDrawable2;
                insetDrawable = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) gradientDrawable2, 0, 0, 0, -i2);
            }
            insetDrawable = gradientDrawable2;
            setForeground(insetDrawable);
            setClipToOutline(true);
            setOutlineProvider(new defpackage.fvt(this));
        }
        invalidate();
    }

    public final boolean e() {
        if (getParent() == null) {
            return false;
        }
        android.view.ViewParent parent = getParent();
        parent.getClass();
        return getTop() + getHeight() >= ((android.view.ViewGroup) parent).getHeight();
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
    public fvu(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fvu(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fvu(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ fvu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, defpackage.affu affuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

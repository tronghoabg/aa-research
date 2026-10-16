package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {
    private static final int[] f = {android.R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final defpackage.yu e;

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.c = rect;
        this.d = new android.graphics.Rect();
        defpackage.yu yuVar = new defpackage.yu(this);
        this.e = yuVar;
        int[] iArr = defpackage.yt.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.projection.gearhead.R.style.CardView);
        defpackage.ebt.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, com.google.android.projection.gearhead.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(color, fArr);
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.google.android.projection.gearhead.R.color.cardview_light_background) : getResources().getColor(com.google.android.projection.gearhead.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.yv yvVar = new defpackage.yv(colorStateListValueOf, dimension);
        yuVar.a = yvVar;
        androidx.cardview.widget.CardView cardView = yuVar.b;
        cardView.setBackgroundDrawable(yvVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        android.graphics.drawable.Drawable drawable = yuVar.a;
        boolean zC = yuVar.c();
        boolean zB = yuVar.b();
        defpackage.yv yvVar2 = (defpackage.yv) drawable;
        if (dimension3 != yvVar2.b || yvVar2.c != zC || yvVar2.d != zB) {
            yvVar2.b = dimension3;
            yvVar2.c = zC;
            yvVar2.d = zB;
            yvVar2.b(null);
            yvVar2.invalidateSelf();
        }
        defpackage.ca.ah(yuVar);
    }

    public void eJ(int i) {
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        defpackage.yv yvVar = (defpackage.yv) this.e.a;
        yvVar.a(colorStateListValueOf);
        yvVar.invalidateSelf();
    }

    public final float eK() {
        return defpackage.ca.af(this.e);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.cardViewStyle);
    }

    public CardView(android.content.Context context) {
        this(context, null);
    }
}

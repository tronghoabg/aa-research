package com.google.android.projection.gearhead.rail.ui;

/* JADX INFO: loaded from: classes3.dex */
public class ImageButtonWithAlphaFade extends android.widget.ImageButton {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    private final int d;
    private final float e;
    private final float f;
    private boolean g;

    public ImageButtonWithAlphaFade(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new float[3];
        float[] fArr = new float[3];
        this.b = fArr;
        float[] fArr2 = new float[3];
        this.c = fArr2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wzd.b, i, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(3, 300);
        this.e = typedArrayObtainStyledAttributes.getFloat(0, 0.7f);
        this.f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        android.graphics.Color.colorToHSV(typedArrayObtainStyledAttributes.getInteger(2, -1), fArr);
        if (isSelected()) {
            setSelected(true);
        } else {
            setSelected(false);
        }
        android.graphics.Color.colorToHSV(typedArrayObtainStyledAttributes.getInteger(4, -1), fArr2);
        if (fArr[1] == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            fArr[0] = fArr2[0];
        }
        typedArrayObtainStyledAttributes.recycle();
        setOnFocusChangeListener(new defpackage.krq((android.view.View) this, 13));
        this.g = false;
        b(false);
    }

    private final void b(boolean z) {
        this.g = z;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(getBackground(), "alpha", this.e, this.f).setDuration(this.d);
        duration.addUpdateListener(new defpackage.wxh(this, 3));
        if (z) {
            duration.start();
        } else {
            duration.reverse();
        }
    }

    public final void a() {
        boolean z = true;
        if (!isSelected() && !hasFocus()) {
            z = false;
        }
        if (this.g != z) {
            b(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        a();
    }

    public ImageButtonWithAlphaFade(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

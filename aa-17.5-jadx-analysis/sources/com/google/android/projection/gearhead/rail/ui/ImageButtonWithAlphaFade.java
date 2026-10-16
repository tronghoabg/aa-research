package com.google.android.projection.gearhead.rail.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.krj;
import defpackage.wwk;
import defpackage.wyh;

/* loaded from: classes3.dex */
public class ImageButtonWithAlphaFade extends ImageButton {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    private final int d;
    private final float e;
    private final float f;
    private boolean g;

    public ImageButtonWithAlphaFade(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new float[3];
        float[] fArr = new float[3];
        this.b = fArr;
        float[] fArr2 = new float[3];
        this.c = fArr2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wyh.b, i, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(3, 300);
        this.e = typedArrayObtainStyledAttributes.getFloat(0, 0.7f);
        this.f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        Color.colorToHSV(typedArrayObtainStyledAttributes.getInteger(2, -1), fArr);
        if (isSelected()) {
            setSelected(true);
        } else {
            setSelected(false);
        }
        Color.colorToHSV(typedArrayObtainStyledAttributes.getInteger(4, -1), fArr2);
        if (fArr[1] == BitmapDescriptorFactory.HUE_RED) {
            fArr[0] = fArr2[0];
        }
        typedArrayObtainStyledAttributes.recycle();
        setOnFocusChangeListener(new krj((View) this, 13));
        this.g = false;
        b(false);
    }

    private final void b(boolean z) {
        this.g = z;
        ObjectAnimator duration = ObjectAnimator.ofFloat(getBackground(), "alpha", this.e, this.f).setDuration(this.d);
        duration.addUpdateListener(new wwk(this, 3));
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

    public ImageButtonWithAlphaFade(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

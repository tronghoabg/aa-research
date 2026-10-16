package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.ca;
import defpackage.ebm;
import defpackage.ym;
import defpackage.yn;
import defpackage.yo;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] f = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final yn e;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        yn ynVar = new yn(this);
        this.e = ynVar;
        int[] iArr = ym.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.projection.gearhead.R.style.CardView);
        ebm.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, com.google.android.projection.gearhead.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.google.android.projection.gearhead.R.color.cardview_light_background) : getResources().getColor(com.google.android.projection.gearhead.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED);
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
        yo yoVar = new yo(colorStateListValueOf, dimension);
        ynVar.a = yoVar;
        CardView cardView = ynVar.b;
        cardView.setBackgroundDrawable(yoVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        Drawable drawable = ynVar.a;
        boolean zC = ynVar.c();
        boolean zB = ynVar.b();
        yo yoVar2 = (yo) drawable;
        if (dimension3 != yoVar2.b || yoVar2.c != zC || yoVar2.d != zB) {
            yoVar2.b = dimension3;
            yoVar2.c = zC;
            yoVar2.d = zB;
            yoVar2.b(null);
            yoVar2.invalidateSelf();
        }
        ca.ah(ynVar);
    }

    public void fB(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        yo yoVar = (yo) this.e.a;
        yoVar.a(colorStateListValueOf);
        yoVar.invalidateSelf();
    }

    public final float fC() {
        return ca.af(this.e);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}

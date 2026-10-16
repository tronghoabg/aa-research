package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class fdm extends ffe {
    private static final float a = (float) Math.tan(Math.toRadians(35.0d));
    private float b;
    private float c;
    private float d;

    public fdm(Context context, AttributeSet attributeSet) {
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.i);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.c = b(dlz.k(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, BitmapDescriptorFactory.HUE_RED));
        this.b = b(dlz.k(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, BitmapDescriptorFactory.HUE_RED));
        this.d = b(dlz.k(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float b(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // defpackage.ffe
    public final Path a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = 0.25f * f10;
        if (Math.abs(f8) < Math.abs(f9)) {
            float fAbs = Math.abs(f10 / (f9 + f9));
            if (f2 > f4) {
                f6 = fAbs + f4;
                f5 = f3;
            } else {
                f6 = fAbs + f2;
                f5 = f;
            }
            f7 = this.c;
        } else {
            float f12 = f10 / (f8 + f8);
            if (f2 > f4) {
                f6 = f2;
                f5 = f12 + f;
            } else {
                f5 = f3 - f12;
                f6 = f4;
            }
            f7 = this.b;
        }
        float f13 = f11 * f7 * f7;
        float f14 = this.d;
        float f15 = f11 * f14 * f14;
        float f16 = (f2 + f4) / 2.0f;
        float f17 = f16 - f6;
        float f18 = (f + f3) / 2.0f;
        float f19 = f18 - f5;
        float f20 = (f19 * f19) + (f17 * f17);
        if (f20 >= f13) {
            f13 = f20 > f15 ? f15 : 0.0f;
        }
        if (f13 != BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt(f13 / f20);
            f5 = ((f5 - f18) * fSqrt) + f18;
            f6 = f16 + (fSqrt * (f6 - f16));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}

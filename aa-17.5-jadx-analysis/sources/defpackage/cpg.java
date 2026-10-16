package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class cpg {
    public final XmlPullParser a;
    public int[] c;
    public int d;
    public int b = 0;
    public final coc e = new coc();

    public cpg(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (dlz.u(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        if (dlz.u(this.a, str)) {
            i2 = typedArray.getInt(i, i2);
        }
        e(typedArray.getChangingConfigurations());
        return i2;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        e(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.b = i | this.b;
    }

    public final float f(TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, BitmapDescriptorFactory.HUE_RED);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, BitmapDescriptorFactory.HUE_RED);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final duw h(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        duw duwVarZ = dlz.z(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return duwVarZ;
    }
}

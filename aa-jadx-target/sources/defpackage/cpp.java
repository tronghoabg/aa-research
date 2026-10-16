package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cpp {
    public final org.xmlpull.v1.XmlPullParser a;
    public int[] c;
    public int d;
    public int b = 0;
    public final defpackage.cok e = new defpackage.cok();

    public cpp(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(android.content.res.TypedArray typedArray, java.lang.String str, int i, float f) {
        if (defpackage.dmh.u(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final int b(android.content.res.TypedArray typedArray, java.lang.String str, int i, int i2) {
        if (defpackage.dmh.u(this.a, str)) {
            i2 = typedArray.getInt(i, i2);
        }
        e(typedArray.getChangingConfigurations());
        return i2;
    }

    public final android.content.res.TypedArray c(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        android.content.res.TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        e(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final java.lang.String d(android.content.res.TypedArray typedArray, int i) {
        java.lang.String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.b = i | this.b;
    }

    public final float f(android.content.res.TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(android.content.res.TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final defpackage.dvd h(android.content.res.TypedArray typedArray, android.content.res.Resources.Theme theme, java.lang.String str, int i) {
        defpackage.dvd dvdVarZ = defpackage.dmh.z(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return dvdVarZ;
    }
}

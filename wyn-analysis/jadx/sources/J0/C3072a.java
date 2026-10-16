package j0;

import Va.M6;
import a1.AbstractC1312b;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3072a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f38566a;

    /* renamed from: b, reason: collision with root package name */
    public int f38567b = 0;

    public C3072a(XmlResourceParser xmlResourceParser) {
        this.f38566a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i5, float f10) {
        if (AbstractC1312b.f(this.f38566a, str)) {
            f10 = typedArray.getFloat(i5, f10);
        }
        d(typedArray.getChangingConfigurations());
        return f10;
    }

    public final int b(TypedArray typedArray, String str, int i5, int i10) {
        if (AbstractC1312b.f(this.f38566a, str)) {
            i10 = typedArray.getInt(i5, i10);
        }
        d(typedArray.getChangingConfigurations());
        return i10;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        AbstractC3340k.d(typedArrayObtainStyledAttributes, "obtainAttributes(\n      …          attrs\n        )");
        d(typedArrayObtainStyledAttributes.getChangingConfigurations());
        return typedArrayObtainStyledAttributes;
    }

    public final void d(int i5) {
        this.f38567b = i5 | this.f38567b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3072a)) {
            return false;
        }
        C3072a c3072a = (C3072a) obj;
        return this.f38566a.equals(c3072a.f38566a) && this.f38567b == c3072a.f38567b;
    }

    public final int hashCode() {
        return (this.f38566a.hashCode() * 31) + this.f38567b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f38566a);
        sb2.append(", config=");
        return M6.r(sb2, this.f38567b, ')');
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class gc {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1544a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f1545b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1546c;

    private gc(Context context, TypedArray typedArray) {
        this.f1544a = context;
        this.f1545b = typedArray;
    }

    public static gc l(Context context, int i2, int[] iArr) {
        return new gc(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static gc m(Context context, AttributeSet attributeSet, int[] iArr) {
        return new gc(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static gc n(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new gc(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public final int a(int i2, int i3) {
        return this.f1545b.getDimensionPixelOffset(i2, i3);
    }

    public final int b(int i2, int i3) {
        return this.f1545b.getDimensionPixelSize(i2, i3);
    }

    public final int c(int i2, int i3) {
        return this.f1545b.getInt(i2, i3);
    }

    public final int d(int i2, int i3) {
        return this.f1545b.getInteger(i2, i3);
    }

    public final int e(int i2, int i3) {
        return this.f1545b.getLayoutDimension(i2, i3);
    }

    public final int f(int i2, int i3) {
        return this.f1545b.getResourceId(i2, i3);
    }

    public final ColorStateList g(int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f1545b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(this.f1544a, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public final TypedArray h() {
        return this.f1545b;
    }

    public final Typeface i(int i2, int i3, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1545b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = this.f1546c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.f1546c = typedValue;
        }
        return ResourcesCompat.getFont(this.f1544a, resourceId, typedValue, i3, fontCallback);
    }

    public final Drawable j(int i2) {
        int resourceId;
        TypedArray typedArray = this.f1545b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : android.support.a.i.d(this.f1544a, resourceId);
    }

    public final Drawable k(int i2) {
        int resourceId;
        TypedArray typedArray = this.f1545b;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return ae.e().h(this.f1544a, resourceId);
    }

    public final CharSequence o(int i2) {
        return this.f1545b.getText(i2);
    }

    public final String p(int i2) {
        return this.f1545b.getString(i2);
    }

    public final void q() {
        this.f1545b.recycle();
    }

    public final boolean r(int i2, boolean z) {
        return this.f1545b.getBoolean(i2, z);
    }

    public final boolean s(int i2) {
        return this.f1545b.hasValue(i2);
    }

    public final int t(int i2) {
        return this.f1545b.getColor(i2, 0);
    }

    public final float u(int i2) {
        return this.f1545b.getDimension(i2, -1.0f);
    }

    public final float v() {
        return this.f1545b.getFloat(4, -1.0f);
    }

    public final CharSequence[] w() {
        return this.f1545b.getTextArray(0);
    }

    public final TypedValue x() {
        return this.f1545b.peekValue(19);
    }
}

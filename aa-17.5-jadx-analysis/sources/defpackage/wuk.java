package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class wuk implements wui {
    public static final wtz a = new wug(0.5f);
    public final wtz b;
    public final wtz c;
    public final wtz d;
    public final wtz e;
    final wub f;
    final wub g;
    final wub h;
    final wub i;
    public final wub j;
    public final wub k;
    public final wub l;
    public final wub m;

    public wuk() {
        this.j = new wuh();
        this.k = new wuh();
        this.l = new wuh();
        this.m = new wuh();
        this.b = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.c = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.d = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.e = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.f = new wub();
        this.g = new wub();
        this.h = new wub();
        this.i = new wub();
    }

    public static wtz g(TypedArray typedArray, int i, wtz wtzVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new wtw(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new wug(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return wtzVar;
    }

    public static wuj h(Resources.Theme theme, int i) {
        return m(theme.obtainStyledAttributes(i, wuf.b), new wtw(BitmapDescriptorFactory.HUE_RED));
    }

    public static wuj i(Context context, AttributeSet attributeSet, int i, int i2, wtz wtzVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wuf.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return n(context, resourceId, resourceId2, wtzVar);
    }

    public static wuj k(Context context, int i, int i2) {
        return n(context, i, i2, new wtw(BitmapDescriptorFactory.HUE_RED));
    }

    public static wuj l(Context context, AttributeSet attributeSet, int i, int i2) {
        return i(context, attributeSet, i, i2, new wtw(BitmapDescriptorFactory.HUE_RED));
    }

    private static wuj m(TypedArray typedArray, wtz wtzVar) {
        try {
            int[] iArr = wuf.a;
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            wtz wtzVarG = g(typedArray, 5, wtzVar);
            wtz wtzVarG2 = g(typedArray, 8, wtzVarG);
            wtz wtzVarG3 = g(typedArray, 9, wtzVarG);
            wtz wtzVarG4 = g(typedArray, 7, wtzVarG);
            wtz wtzVarG5 = g(typedArray, 6, wtzVarG);
            wuj wujVar = new wuj();
            wujVar.i(wub.l(i2));
            wujVar.a = wtzVarG2;
            wujVar.j(wub.l(i3));
            wujVar.b = wtzVarG3;
            wujVar.h(wub.l(i4));
            wujVar.c = wtzVarG4;
            wujVar.g(wub.l(i5));
            wujVar.d = wtzVarG5;
            return wujVar;
        } finally {
            typedArray.recycle();
        }
    }

    private static wuj n(Context context, int i, int i2, wtz wtzVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return m(contextThemeWrapper.obtainStyledAttributes(wuf.b), wtzVar);
    }

    @Override // defpackage.wui
    public final wuk c(float f) {
        wuj wujVar = new wuj(this);
        wujVar.e(f);
        return new wuk(wujVar);
    }

    @Override // defpackage.wui
    public final wuk d(wtz wtzVar) {
        wuj wujVar = new wuj(this);
        wujVar.f(wtzVar);
        return new wuk(wujVar);
    }

    @Override // defpackage.wui
    public final boolean e() {
        return false;
    }

    @Override // defpackage.wui
    public final wuk[] f() {
        return new wuk[]{this};
    }

    public final boolean j(RectF rectF) {
        boolean z = this.i.getClass().equals(wub.class) && this.g.getClass().equals(wub.class) && this.f.getClass().equals(wub.class) && this.h.getClass().equals(wub.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && (this.k instanceof wuh) && (this.j instanceof wuh) && (this.l instanceof wuh) && (this.m instanceof wuh);
    }

    public final String toString() {
        wtz wtzVar = this.e;
        wtz wtzVar2 = this.d;
        wtz wtzVar3 = this.c;
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(wtzVar3) + ", " + String.valueOf(wtzVar2) + ", " + String.valueOf(wtzVar) + "]";
    }

    @Override // defpackage.wui
    public final wuk a() {
        return this;
    }

    @Override // defpackage.wui
    public final wuk b(int[] iArr) {
        return this;
    }

    public wuk(wuj wujVar) {
        this.j = wujVar.i;
        this.k = wujVar.j;
        this.l = wujVar.k;
        this.m = wujVar.l;
        this.b = wujVar.a;
        this.c = wujVar.b;
        this.d = wujVar.c;
        this.e = wujVar.d;
        this.f = wujVar.e;
        this.g = wujVar.f;
        this.h = wujVar.g;
        this.i = wujVar.h;
    }
}

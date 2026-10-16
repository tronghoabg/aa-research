package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wvi implements defpackage.wvh {
    public static final defpackage.wuy a = new defpackage.wvf(0.5f);
    public final defpackage.wuy b;
    public final defpackage.wuy c;
    public final defpackage.wuy d;
    public final defpackage.wuy e;
    public final defpackage.wva f;
    public final defpackage.wva g;
    public final defpackage.wva h;
    public final defpackage.wva i;
    public final defpackage.wpu j;
    public final defpackage.wpu k;
    public final defpackage.wpu l;
    public final defpackage.wpu m;

    public wvi() {
        this.j = new defpackage.wvg();
        this.k = new defpackage.wvg();
        this.l = new defpackage.wvg();
        this.m = new defpackage.wvg();
        this.b = new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.c = new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.d = new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.e = new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.f = new defpackage.wva();
        this.g = new defpackage.wva();
        this.h = new defpackage.wva();
        this.i = new defpackage.wva();
    }

    public static defpackage.wuy g(android.content.res.TypedArray typedArray, int i, defpackage.wuy wuyVar) {
        android.util.TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new defpackage.wuv(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new defpackage.wvf(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return wuyVar;
    }

    public static defpackage.xta i(android.content.res.Resources.Theme theme, int i) {
        return m(theme.obtainStyledAttributes(i, defpackage.wve.b), new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
    }

    public static defpackage.xta j(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.wuy wuyVar) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wve.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return n(context, resourceId, resourceId2, wuyVar);
    }

    public static defpackage.xta k(android.content.Context context, int i, int i2) {
        return n(context, i, i2, new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
    }

    public static defpackage.xta l(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        return j(context, attributeSet, i, i2, new defpackage.wuv(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
    }

    private static defpackage.xta m(android.content.res.TypedArray typedArray, defpackage.wuy wuyVar) {
        try {
            int[] iArr = defpackage.wve.a;
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            defpackage.wuy wuyVarG = g(typedArray, 5, wuyVar);
            defpackage.wuy wuyVarG2 = g(typedArray, 8, wuyVarG);
            defpackage.wuy wuyVarG3 = g(typedArray, 9, wuyVarG);
            defpackage.wuy wuyVarG4 = g(typedArray, 7, wuyVarG);
            defpackage.wuy wuyVarG5 = g(typedArray, 6, wuyVarG);
            defpackage.xta xtaVar = new defpackage.xta((char[]) null);
            xtaVar.p(defpackage.wva.u(i2));
            xtaVar.j = wuyVarG2;
            xtaVar.q(defpackage.wva.u(i3));
            xtaVar.i = wuyVarG3;
            xtaVar.o(defpackage.wva.u(i4));
            xtaVar.g = wuyVarG4;
            xtaVar.n(defpackage.wva.u(i5));
            xtaVar.f = wuyVarG5;
            return xtaVar;
        } finally {
            typedArray.recycle();
        }
    }

    private static defpackage.xta n(android.content.Context context, int i, int i2, defpackage.wuy wuyVar) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return m(contextThemeWrapper.obtainStyledAttributes(defpackage.wve.b), wuyVar);
    }

    @Override // defpackage.wvh
    public final defpackage.wvi c(float f) {
        defpackage.xta xtaVar = new defpackage.xta(this);
        xtaVar.l(f);
        return new defpackage.wvi(xtaVar);
    }

    @Override // defpackage.wvh
    public final defpackage.wvi d(defpackage.wuy wuyVar) {
        defpackage.xta xtaVar = new defpackage.xta(this);
        xtaVar.m(wuyVar);
        return new defpackage.wvi(xtaVar);
    }

    @Override // defpackage.wvh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.wvh
    public final defpackage.wvi[] f() {
        return new defpackage.wvi[]{this};
    }

    public final boolean h(android.graphics.RectF rectF) {
        boolean z = this.i.getClass().equals(defpackage.wva.class) && this.g.getClass().equals(defpackage.wva.class) && this.f.getClass().equals(defpackage.wva.class) && this.h.getClass().equals(defpackage.wva.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && (this.k instanceof defpackage.wvg) && (this.j instanceof defpackage.wvg) && (this.l instanceof defpackage.wvg) && (this.m instanceof defpackage.wvg);
    }

    public final java.lang.String toString() {
        defpackage.wuy wuyVar = this.e;
        defpackage.wuy wuyVar2 = this.d;
        defpackage.wuy wuyVar3 = this.c;
        return "[" + java.lang.String.valueOf(this.b) + ", " + java.lang.String.valueOf(wuyVar3) + ", " + java.lang.String.valueOf(wuyVar2) + ", " + java.lang.String.valueOf(wuyVar) + "]";
    }

    @Override // defpackage.wvh
    public final defpackage.wvi a() {
        return this;
    }

    @Override // defpackage.wvh
    public final defpackage.wvi b(int[] iArr) {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, wuy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, wuy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, wuy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, wuy] */
    public wvi(defpackage.xta xtaVar) {
        this.j = (defpackage.wpu) xtaVar.k;
        this.k = (defpackage.wpu) xtaVar.b;
        this.l = (defpackage.wpu) xtaVar.a;
        this.m = (defpackage.wpu) xtaVar.l;
        this.b = xtaVar.j;
        this.c = xtaVar.i;
        this.d = xtaVar.g;
        this.e = xtaVar.f;
        this.f = (defpackage.wva) xtaVar.e;
        this.g = (defpackage.wva) xtaVar.h;
        this.h = (defpackage.wva) xtaVar.c;
        this.i = (defpackage.wva) xtaVar.d;
    }
}

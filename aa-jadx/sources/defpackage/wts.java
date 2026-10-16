package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wts extends defpackage.wsm {
    public final int q;
    public final int r;
    public boolean s;
    public int t;
    public java.lang.Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    public wts(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.projection.gearhead.R.attr.linearProgressIndicatorStyle, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        android.content.res.TypedArray typedArrayA = defpackage.wro.a(context, attributeSet, defpackage.wtt.c, com.google.android.projection.gearhead.R.attr.linearProgressIndicatorStyle, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.q = typedArrayA.getInt(0, 1);
        int i = typedArrayA.getInt(1, 0);
        this.r = i;
        this.t = typedArrayA.getDimensionPixelSize(4, 0);
        if (typedArrayA.hasValue(3)) {
            this.u = java.lang.Integer.valueOf(typedArrayA.getDimensionPixelSize(3, 0));
        }
        android.util.TypedValue typedValuePeekValue = typedArrayA.peekValue(2);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                this.v = java.lang.Math.min(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayA.getResources().getDisplayMetrics()), this.a / 2);
                this.x = false;
                this.y = true;
            } else if (typedValuePeekValue.type == 6) {
                this.w = java.lang.Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.x = true;
                this.y = true;
            }
        }
        typedArrayA.recycle();
        b();
        this.s = i == 1;
    }

    @Override // defpackage.wsm
    public final void b() {
        super.b();
        if (this.t < 0) {
            throw new java.lang.IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && g() > 0)) && this.i == 0) {
                throw new java.lang.IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.e.length < 3) {
                throw new java.lang.IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    @Override // defpackage.wsm
    public final boolean f() {
        return super.f() && g() == a();
    }

    public final int g() {
        if (!this.y) {
            return a();
        }
        if (!this.x) {
            return this.v;
        }
        return (int) (this.a * this.w);
    }
}

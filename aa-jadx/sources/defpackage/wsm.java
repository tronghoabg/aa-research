package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wsm {
    public final int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final float p;

    protected wsm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.mtrl_progress_track_thickness);
        android.content.res.TypedArray typedArrayA = defpackage.wro.a(context, attributeSet, defpackage.wtt.a, i, i2, new int[0]);
        int iBg = defpackage.sqs.bg(context, typedArrayA, 10, dimensionPixelSize);
        this.a = iBg;
        android.util.TypedValue typedValuePeekValue = typedArrayA.peekValue(9);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                this.b = java.lang.Math.min(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayA.getResources().getDisplayMetrics()), iBg / 2);
                this.d = false;
            } else if (typedValuePeekValue.type == 6) {
                this.c = java.lang.Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = typedArrayA.getInt(6, 0);
        this.h = typedArrayA.getInt(1, 0);
        this.i = typedArrayA.getDimensionPixelSize(4, 0);
        int iAbs = java.lang.Math.abs(typedArrayA.getDimensionPixelSize(15, 0));
        this.j = java.lang.Math.abs(typedArrayA.getDimensionPixelSize(16, iAbs));
        this.k = java.lang.Math.abs(typedArrayA.getDimensionPixelSize(17, iAbs));
        this.l = java.lang.Math.abs(typedArrayA.getDimensionPixelSize(11, 0));
        this.m = typedArrayA.getDimensionPixelSize(14, 0);
        this.n = typedArrayA.getFloat(2, 1.0f);
        this.o = typedArrayA.getFloat(13, 0.1f);
        this.p = typedArrayA.getFloat(12, 0.9f);
        if (!typedArrayA.hasValue(3)) {
            this.e = new int[]{defpackage.sqs.bw(context, com.google.android.projection.gearhead.R.attr.colorPrimary, -1)};
        } else if (typedArrayA.peekValue(3).type != 1) {
            this.e = new int[]{typedArrayA.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayA.getResourceId(3, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                throw new java.lang.IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayA.hasValue(8)) {
            this.f = typedArrayA.getColor(8, -1);
        } else {
            this.f = this.e[0];
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f = defpackage.sqs.bu(this.f, (int) (f * 255.0f));
        }
        typedArrayA.recycle();
    }

    public final int a() {
        if (!this.d) {
            return this.b;
        }
        return (int) (this.a * this.c);
    }

    public void b() {
        if (this.i < 0) {
            throw new java.lang.IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public final boolean c(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z) {
            return this.j > 0;
        }
        return this.k > 0;
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean e() {
        return this.g != 0;
    }

    public boolean f() {
        return this.d && this.c == 0.5f;
    }
}

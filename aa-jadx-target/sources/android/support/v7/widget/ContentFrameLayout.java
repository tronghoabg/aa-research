package android.support.v7.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    public android.util.TypedValue b;
    public android.util.TypedValue c;
    public android.util.TypedValue d;
    public android.util.TypedValue e;
    public android.util.TypedValue f;
    public android.util.TypedValue g;
    public final android.graphics.Rect h;
    public defpackage.izq i;

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new android.graphics.Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.izq izqVar = this.i;
        if (izqVar != null) {
            java.lang.Object obj = izqVar.a;
            defpackage.ff ffVar = (defpackage.ff) obj;
            kg kgVar = ffVar.p;
            if (kgVar != null) {
                kgVar.a();
            }
            if (ffVar.s != null) {
                ffVar.l.getDecorView().removeCallbacks(ffVar.t);
                if (ffVar.s.isShowing()) {
                    try {
                        ((defpackage.ff) obj).s.dismiss();
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                ffVar.s = null;
            }
            ffVar.G();
            defpackage.hh hhVar = ffVar.Q(0).h;
            if (hhVar != null) {
                hhVar.i(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        float fraction;
        int i4;
        float fraction2;
        int i5;
        float fraction3;
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        int mode = android.view.View.MeasureSpec.getMode(i);
        boolean z2 = true;
        boolean z3 = i6 < i7;
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            android.util.TypedValue typedValue = z3 ? this.e : this.d;
            if (typedValue == null || typedValue.type == 0) {
                z = false;
            } else {
                if (typedValue.type == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (typedValue.type == 6) {
                        fraction3 = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                    } else {
                        i5 = 0;
                    }
                    if (i5 > 0) {
                        android.graphics.Rect rect = this.h;
                        i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i5 - (rect.left + rect.right), android.view.View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i5 = (int) fraction3;
                if (i5 > 0) {
                    android.graphics.Rect rect2 = this.h;
                    i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i5 - (rect2.left + rect2.right), android.view.View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            android.util.TypedValue typedValue2 = z3 ? this.f : this.g;
            if (typedValue2 != null && typedValue2.type != 0) {
                if (typedValue2.type == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (typedValue2.type == 6) {
                        fraction2 = typedValue2.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        android.graphics.Rect rect3 = this.h;
                        i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4 - (rect3.top + rect3.bottom), android.view.View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i4 = (int) fraction2;
                if (i4 > 0) {
                    android.graphics.Rect rect4 = this.h;
                    i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4 - (rect4.top + rect4.bottom), android.view.View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            android.util.TypedValue typedValue3 = z3 ? this.c : this.b;
            if (typedValue3 == null || typedValue3.type == 0) {
                z2 = false;
            } else {
                if (typedValue3.type == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (typedValue3.type == 6) {
                        fraction = typedValue3.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 0) {
                        android.graphics.Rect rect5 = this.h;
                        i3 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i3) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i3 = (int) fraction;
                if (i3 > 0) {
                    android.graphics.Rect rect6 = this.h;
                    i3 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i3) {
                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(android.content.Context context) {
        this(context, null);
    }
}

package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class Flow extends defpackage.dsk {
    private defpackage.dqy a;

    public Flow(android.content.Context context) {
        super(context);
    }

    @Override // defpackage.dsk, defpackage.drt
    protected final void a(android.util.AttributeSet attributeSet) {
        super.a(attributeSet);
        this.a = new defpackage.dqy();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.dsj.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a.aI = typedArrayObtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    defpackage.dqy dqyVar = this.a;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                    dqyVar.aN = dimensionPixelSize;
                    dqyVar.aO = dimensionPixelSize;
                    dqyVar.aP = dimensionPixelSize;
                    dqyVar.aQ = dimensionPixelSize;
                } else if (index == 18) {
                    this.a.aj(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
                } else if (index == 19) {
                    this.a.aQ = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
                } else if (index == 2) {
                    this.a.aR = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.a.aN = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.a.aS = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.a.aO = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 54) {
                    this.a.aG = typedArrayObtainStyledAttributes.getInt(54, 0);
                } else if (index == 44) {
                    this.a.a = typedArrayObtainStyledAttributes.getInt(44, 0);
                } else if (index == 53) {
                    this.a.b = typedArrayObtainStyledAttributes.getInt(53, 0);
                } else if (index == 38) {
                    this.a.c = typedArrayObtainStyledAttributes.getInt(38, 0);
                } else if (index == 46) {
                    this.a.e = typedArrayObtainStyledAttributes.getInt(46, 0);
                } else if (index == 40) {
                    this.a.d = typedArrayObtainStyledAttributes.getInt(40, 0);
                } else if (index == 48) {
                    this.a.f = typedArrayObtainStyledAttributes.getInt(48, 0);
                } else if (index == 42) {
                    this.a.g = typedArrayObtainStyledAttributes.getFloat(42, 0.5f);
                } else if (index == 37) {
                    this.a.i = typedArrayObtainStyledAttributes.getFloat(37, 0.5f);
                } else if (index == 45) {
                    this.a.k = typedArrayObtainStyledAttributes.getFloat(45, 0.5f);
                } else if (index == 39) {
                    this.a.j = typedArrayObtainStyledAttributes.getFloat(39, 0.5f);
                } else if (index == 47) {
                    this.a.aB = typedArrayObtainStyledAttributes.getFloat(47, 0.5f);
                } else if (index == 51) {
                    this.a.h = typedArrayObtainStyledAttributes.getFloat(51, 0.5f);
                } else if (index == 41) {
                    this.a.aE = typedArrayObtainStyledAttributes.getInt(41, 2);
                } else if (index == 50) {
                    this.a.aF = typedArrayObtainStyledAttributes.getInt(50, 2);
                } else if (index == 43) {
                    this.a.aC = typedArrayObtainStyledAttributes.getDimensionPixelSize(43, 0);
                } else if (index == 52) {
                    this.a.aD = typedArrayObtainStyledAttributes.getDimensionPixelSize(52, 0);
                } else if (index == 49) {
                    this.a.aH = typedArrayObtainStyledAttributes.getInt(49, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.a;
        k();
    }

    @Override // defpackage.dsk
    public final void b(defpackage.drc drcVar, int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (drcVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            drcVar.b(mode, size, mode2, size2);
            setMeasuredDimension(drcVar.aU, drcVar.aV);
        }
    }

    @Override // defpackage.drt
    public final void c(defpackage.dqv dqvVar, boolean z) {
        defpackage.dqy dqyVar = this.a;
        int i = dqyVar.aP;
        if (i > 0 || dqyVar.aQ > 0) {
            if (z) {
                dqyVar.aR = dqyVar.aQ;
            } else {
                dqyVar.aR = i;
                i = dqyVar.aQ;
            }
            dqyVar.aS = i;
        }
    }

    @Override // defpackage.drt, android.view.View
    protected final void onMeasure(int i, int i2) {
        b(this.a, i, i2);
    }

    public Flow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

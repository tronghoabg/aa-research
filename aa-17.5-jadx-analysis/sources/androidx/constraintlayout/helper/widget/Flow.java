package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.dqn;
import defpackage.dqq;
import defpackage.dqu;
import defpackage.dsb;
import defpackage.dsc;

/* loaded from: classes.dex */
public class Flow extends dsc {
    private dqq a;

    public Flow(Context context) {
        super(context);
    }

    @Override // defpackage.dsc, defpackage.drl
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.a = new dqq();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dsb.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a.aI = typedArrayObtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    dqq dqqVar = this.a;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                    dqqVar.aN = dimensionPixelSize;
                    dqqVar.aO = dimensionPixelSize;
                    dqqVar.aP = dimensionPixelSize;
                    dqqVar.aQ = dimensionPixelSize;
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

    @Override // defpackage.dsc
    public final void b(dqu dquVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (dquVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            dquVar.b(mode, size, mode2, size2);
            setMeasuredDimension(dquVar.aU, dquVar.aV);
        }
    }

    @Override // defpackage.drl
    public final void c(dqn dqnVar, boolean z) {
        dqq dqqVar = this.a;
        int i = dqqVar.aP;
        if (i > 0 || dqqVar.aQ > 0) {
            if (z) {
                dqqVar.aR = dqqVar.aQ;
            } else {
                dqqVar.aR = i;
                i = dqqVar.aQ;
            }
            dqqVar.aS = i;
        }
    }

    @Override // defpackage.drl, android.view.View
    protected final void onMeasure(int i, int i2) {
        b(this.a, i, i2);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

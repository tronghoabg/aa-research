package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.Flow mFlow;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mFlow = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.mFlow.setOrientation(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.mFlow.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
                } else if (index == 18) {
                    this.mFlow.setPaddingStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
                } else if (index == 19) {
                    this.mFlow.setPaddingEnd(typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0));
                } else if (index == 2) {
                    this.mFlow.setPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0));
                } else if (index == 3) {
                    this.mFlow.setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
                } else if (index == 4) {
                    this.mFlow.setPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0));
                } else if (index == 5) {
                    this.mFlow.setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0));
                } else if (index == 54) {
                    this.mFlow.setWrapMode(typedArrayObtainStyledAttributes.getInt(54, 0));
                } else if (index == 44) {
                    this.mFlow.setHorizontalStyle(typedArrayObtainStyledAttributes.getInt(44, 0));
                } else if (index == 53) {
                    this.mFlow.setVerticalStyle(typedArrayObtainStyledAttributes.getInt(53, 0));
                } else if (index == 38) {
                    this.mFlow.setFirstHorizontalStyle(typedArrayObtainStyledAttributes.getInt(38, 0));
                } else if (index == 46) {
                    this.mFlow.setLastHorizontalStyle(typedArrayObtainStyledAttributes.getInt(46, 0));
                } else if (index == 40) {
                    this.mFlow.setFirstVerticalStyle(typedArrayObtainStyledAttributes.getInt(40, 0));
                } else if (index == 48) {
                    this.mFlow.setLastVerticalStyle(typedArrayObtainStyledAttributes.getInt(48, 0));
                } else if (index == 42) {
                    this.mFlow.setHorizontalBias(typedArrayObtainStyledAttributes.getFloat(42, 0.5f));
                } else if (index == 37) {
                    this.mFlow.setFirstHorizontalBias(typedArrayObtainStyledAttributes.getFloat(37, 0.5f));
                } else if (index == 45) {
                    this.mFlow.setLastHorizontalBias(typedArrayObtainStyledAttributes.getFloat(45, 0.5f));
                } else if (index == 39) {
                    this.mFlow.setFirstVerticalBias(typedArrayObtainStyledAttributes.getFloat(39, 0.5f));
                } else if (index == 47) {
                    this.mFlow.setLastVerticalBias(typedArrayObtainStyledAttributes.getFloat(47, 0.5f));
                } else if (index == 51) {
                    this.mFlow.setVerticalBias(typedArrayObtainStyledAttributes.getFloat(51, 0.5f));
                } else if (index == 41) {
                    this.mFlow.setHorizontalAlign(typedArrayObtainStyledAttributes.getInt(41, 2));
                } else if (index == 50) {
                    this.mFlow.setVerticalAlign(typedArrayObtainStyledAttributes.getInt(50, 2));
                } else if (index == 43) {
                    this.mFlow.setHorizontalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(43, 0));
                } else if (index == 52) {
                    this.mFlow.setVerticalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(52, 0));
                } else if (index == 49) {
                    this.mFlow.setMaxElementsWrap(typedArrayObtainStyledAttributes.getInt(49, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) helperWidget;
            int i2 = layoutParams.orientation;
            if (i2 != -1) {
                flow.setOrientation(i2);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.measure(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        this.mFlow.applyRtl(z);
    }

    public void setFirstHorizontalBias(float f2) {
        this.mFlow.setFirstHorizontalBias(f2);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.mFlow.setFirstHorizontalStyle(i2);
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.mFlow.setFirstVerticalBias(f2);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.mFlow.setFirstVerticalStyle(i2);
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.mFlow.setHorizontalAlign(i2);
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.mFlow.setHorizontalBias(f2);
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.mFlow.setHorizontalGap(i2);
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.mFlow.setHorizontalStyle(i2);
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.mFlow.setLastHorizontalBias(f2);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.mFlow.setLastHorizontalStyle(i2);
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.mFlow.setLastVerticalBias(f2);
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.mFlow.setLastVerticalStyle(i2);
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.mFlow.setMaxElementsWrap(i2);
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.mFlow.setOrientation(i2);
        requestLayout();
    }

    public void setPadding(int i2) {
        this.mFlow.setPadding(i2);
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.mFlow.setPaddingBottom(i2);
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.mFlow.setPaddingLeft(i2);
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.mFlow.setPaddingRight(i2);
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.mFlow.setPaddingTop(i2);
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.mFlow.setVerticalAlign(i2);
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.mFlow.setVerticalBias(f2);
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.mFlow.setVerticalGap(i2);
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.mFlow.setVerticalStyle(i2);
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.mFlow.setWrapMode(i2);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i2, int i3) {
        onMeasure(this.mFlow, i2, i3);
    }
}

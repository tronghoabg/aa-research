package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Constraints extends ViewGroup {
    public static final String TAG = "Constraints";
    ConstraintSet mConstraintSet;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
        super.setVisibility(8);
    }

    private void init() {
        Log.v(TAG, " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet == null) {
            constraintSet = new ConstraintSet();
            this.mConstraintSet = constraintSet;
        }
        constraintSet.clone(this);
        return this.mConstraintSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
        super.setVisibility(8);
    }

    /* compiled from: WazeSource */
    public class LayoutParams extends ConstraintLayout.LayoutParams {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(15, this.alpha);
                } else if (index == 28) {
                    this.elevation = typedArrayObtainStyledAttributes.getFloat(28, this.elevation);
                    this.applyElevation = true;
                } else if (index == 23) {
                    this.rotationX = typedArrayObtainStyledAttributes.getFloat(23, this.rotationX);
                } else if (index == 24) {
                    this.rotationY = typedArrayObtainStyledAttributes.getFloat(24, this.rotationY);
                } else if (index == 22) {
                    this.rotation = typedArrayObtainStyledAttributes.getFloat(22, this.rotation);
                } else if (index == 20) {
                    this.scaleX = typedArrayObtainStyledAttributes.getFloat(20, this.scaleX);
                } else if (index == 21) {
                    this.scaleY = typedArrayObtainStyledAttributes.getFloat(21, this.scaleY);
                } else if (index == 16) {
                    this.transformPivotX = typedArrayObtainStyledAttributes.getFloat(16, this.transformPivotX);
                } else if (index == 17) {
                    this.transformPivotY = typedArrayObtainStyledAttributes.getFloat(17, this.transformPivotY);
                } else if (index == 18) {
                    this.translationX = typedArrayObtainStyledAttributes.getFloat(18, this.translationX);
                } else if (index == 19) {
                    this.translationY = typedArrayObtainStyledAttributes.getFloat(19, this.translationY);
                } else if (index == 27) {
                    this.translationZ = typedArrayObtainStyledAttributes.getFloat(27, this.translationZ);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }
    }
}

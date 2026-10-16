package androidx.core.view.insets;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class Protection {
    private static final long DEFAULT_DURATION_IN = 333;
    private static final long DEFAULT_DURATION_OUT = 166;
    private final Attributes mAttributes = new Attributes();
    private Object mController;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;
    private final int mSide;
    private float mSystemAlpha;
    private float mSystemInsetAmount;
    private float mUserAlpha;
    private ValueAnimator mUserAlphaAnimator;
    private float mUserInsetAmount;
    private ValueAnimator mUserInsetAmountAnimator;
    private static final Interpolator DEFAULT_INTERPOLATOR_MOVE_IN = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    private static final Interpolator DEFAULT_INTERPOLATOR_MOVE_OUT = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    private static final Interpolator DEFAULT_INTERPOLATOR_FADE_IN = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    private static final Interpolator DEFAULT_INTERPOLATOR_FADE_OUT = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* compiled from: WazeSource */
    class Attributes {
        private static final int UNSPECIFIED = -1;
        private Callback mCallback;
        private int mWidth = -1;
        private int mHeight = -1;
        private Insets mMargin = Insets.NONE;
        private boolean mVisible = false;
        private Drawable mDrawable = null;
        private float mTranslationX = 0.0f;
        private float mTranslationY = 0.0f;
        private float mAlpha = 1.0f;

        /* compiled from: WazeSource */
        interface Callback {

            /* compiled from: WazeSource */
            /* renamed from: androidx.core.view.insets.Protection$Attributes$Callback$-CC, reason: invalid class name */
            public final /* synthetic */ class CC {
                public static void $default$onAlphaChanged(Callback callback, float f2) {
                }

                public static void $default$onDrawableChanged(Callback callback, Drawable drawable) {
                }

                public static void $default$onHeightChanged(Callback callback, int i2) {
                }

                public static void $default$onMarginChanged(Callback callback, Insets insets) {
                }

                public static void $default$onTranslationXChanged(Callback callback, float f2) {
                }

                public static void $default$onTranslationYChanged(Callback callback, float f2) {
                }

                public static void $default$onVisibilityChanged(Callback callback, boolean z) {
                }

                public static void $default$onWidthChanged(Callback callback, int i2) {
                }
            }

            void onAlphaChanged(float f2);

            void onDrawableChanged(Drawable drawable);

            void onHeightChanged(int i2);

            void onMarginChanged(Insets insets);

            void onTranslationXChanged(float f2);

            void onTranslationYChanged(float f2);

            void onVisibilityChanged(boolean z);

            void onWidthChanged(int i2);
        }

        Attributes() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlpha(float f2) {
            if (this.mAlpha != f2) {
                this.mAlpha = f2;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onAlphaChanged(f2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
            Callback callback = this.mCallback;
            if (callback != null) {
                callback.onDrawableChanged(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i2) {
            if (this.mHeight != i2) {
                this.mHeight = i2;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onHeightChanged(i2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMargin(Insets insets) {
            if (this.mMargin.equals(insets)) {
                return;
            }
            this.mMargin = insets;
            Callback callback = this.mCallback;
            if (callback != null) {
                callback.onMarginChanged(insets);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslationX(float f2) {
            if (this.mTranslationX != f2) {
                this.mTranslationX = f2;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onTranslationXChanged(f2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslationY(float f2) {
            if (this.mTranslationY != f2) {
                this.mTranslationY = f2;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onTranslationYChanged(f2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisible(boolean z) {
            if (this.mVisible != z) {
                this.mVisible = z;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onVisibilityChanged(z);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i2) {
            if (this.mWidth != i2) {
                this.mWidth = i2;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onWidthChanged(i2);
                }
            }
        }

        float getAlpha() {
            return this.mAlpha;
        }

        Drawable getDrawable() {
            return this.mDrawable;
        }

        int getHeight() {
            return this.mHeight;
        }

        Insets getMargin() {
            return this.mMargin;
        }

        float getTranslationX() {
            return this.mTranslationX;
        }

        float getTranslationY() {
            return this.mTranslationY;
        }

        int getWidth() {
            return this.mWidth;
        }

        boolean isVisible() {
            return this.mVisible;
        }

        void setCallback(Callback callback) {
            if (this.mCallback != null && callback != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.mCallback = callback;
        }
    }

    public Protection(int i2) {
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        this.mSystemAlpha = 1.0f;
        this.mUserAlpha = 1.0f;
        this.mSystemInsetAmount = 1.0f;
        this.mUserInsetAmount = 1.0f;
        this.mController = null;
        this.mUserAlphaAnimator = null;
        this.mUserInsetAmountAnimator = null;
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 8) {
            this.mSide = i2;
        } else {
            throw new IllegalArgumentException("Unexpected side: " + i2);
        }
    }

    private void cancelUserAlphaAnimation() {
        ValueAnimator valueAnimator = this.mUserAlphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mUserAlphaAnimator = null;
        }
    }

    private void cancelUserInsetsAmountAnimation() {
        ValueAnimator valueAnimator = this.mUserInsetAmountAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mUserInsetAmountAnimator = null;
        }
    }

    private void setAlphaInternal(float f2) {
        this.mUserAlpha = f2;
        updateAlpha();
    }

    private void setInsetAmountInternal(float f2) {
        this.mUserInsetAmount = f2;
        updateInsetAmount();
    }

    private void updateAlpha() {
        this.mAttributes.setAlpha(this.mSystemAlpha * this.mUserAlpha);
    }

    private void updateInsetAmount() {
        float f2 = this.mUserInsetAmount * this.mSystemInsetAmount;
        int i2 = this.mSide;
        if (i2 == 1) {
            this.mAttributes.setTranslationX((-(1.0f - f2)) * r4.mWidth);
        } else if (i2 == 2) {
            this.mAttributes.setTranslationY((-(1.0f - f2)) * r4.mHeight);
        } else if (i2 == 4) {
            this.mAttributes.setTranslationX((1.0f - f2) * r4.mWidth);
        } else {
            if (i2 != 8) {
                return;
            }
            this.mAttributes.setTranslationY((1.0f - f2) * r4.mHeight);
        }
    }

    public void animateAlpha(float f2) {
        cancelUserAlphaAnimation();
        float f3 = this.mUserAlpha;
        if (f2 == f3) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f2);
        this.mUserAlphaAnimator = valueAnimatorOfFloat;
        if (this.mUserAlpha < f2) {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_IN);
            this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_IN);
        } else {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_OUT);
            this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_OUT);
        }
        this.mUserAlphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.Protection$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m11809lambda$animateAlpha$0$androidxcoreviewinsetsProtection(valueAnimator);
            }
        });
        this.mUserAlphaAnimator.start();
    }

    public void animateInsetsAmount(float f2) {
        cancelUserInsetsAmountAnimation();
        float f3 = this.mUserInsetAmount;
        if (f2 == f3) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f2);
        this.mUserInsetAmountAnimator = valueAnimatorOfFloat;
        if (this.mUserInsetAmount < f2) {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_IN);
            this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_IN);
        } else {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_OUT);
            this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_OUT);
        }
        this.mUserInsetAmountAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.Protection$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m11810x124db077(valueAnimator);
            }
        });
        this.mUserInsetAmountAnimator.start();
    }

    void dispatchColorHint(int i2) {
    }

    Insets dispatchInsets(Insets insets, Insets insets2, Insets insets3) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets2;
        this.mAttributes.setMargin(insets3);
        return updateLayout();
    }

    public float getAlpha() {
        return this.mUserAlpha;
    }

    Attributes getAttributes() {
        return this.mAttributes;
    }

    Object getController() {
        return this.mController;
    }

    public float getInsetAmount() {
        return this.mUserInsetAmount;
    }

    public int getSide() {
        return this.mSide;
    }

    int getThickness(int i2) {
        return i2;
    }

    /* renamed from: lambda$animateAlpha$0$androidx-core-view-insets-Protection, reason: not valid java name */
    /* synthetic */ void m11809lambda$animateAlpha$0$androidxcoreviewinsetsProtection(ValueAnimator valueAnimator) {
        setAlphaInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: lambda$animateInsetsAmount$1$androidx-core-view-insets-Protection, reason: not valid java name */
    /* synthetic */ void m11810x124db077(ValueAnimator valueAnimator) {
        setAlphaInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    boolean occupiesCorners() {
        return false;
    }

    public void setAlpha(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Alpha must in a range of [0, 1]. Got: " + f2);
        }
        cancelUserAlphaAnimation();
        setAlphaInternal(f2);
    }

    void setController(Object obj) {
        this.mController = obj;
    }

    void setDrawable(Drawable drawable) {
        this.mAttributes.setDrawable(drawable);
    }

    public void setInsetAmount(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: " + f2);
        }
        cancelUserInsetsAmountAnimation();
        setInsetAmountInternal(f2);
    }

    void setSystemAlpha(float f2) {
        this.mSystemAlpha = f2;
        updateAlpha();
    }

    void setSystemInsetAmount(float f2) {
        this.mSystemInsetAmount = f2;
        updateInsetAmount();
    }

    void setSystemVisible(boolean z) {
        this.mAttributes.setVisible(z);
    }

    Insets updateLayout() {
        int i2;
        int i3 = this.mSide;
        Insets insetsOf = Insets.NONE;
        if (i3 == 1) {
            i2 = this.mInsets.left;
            this.mAttributes.setWidth(getThickness(this.mInsetsIgnoringVisibility.left));
            if (occupiesCorners()) {
                insetsOf = Insets.of(getThickness(i2), 0, 0, 0);
            }
        } else if (i3 == 2) {
            i2 = this.mInsets.top;
            this.mAttributes.setHeight(getThickness(this.mInsetsIgnoringVisibility.top));
            if (occupiesCorners()) {
                insetsOf = Insets.of(0, getThickness(i2), 0, 0);
            }
        } else if (i3 == 4) {
            i2 = this.mInsets.right;
            this.mAttributes.setWidth(getThickness(this.mInsetsIgnoringVisibility.right));
            if (occupiesCorners()) {
                insetsOf = Insets.of(0, 0, getThickness(i2), 0);
            }
        } else if (i3 != 8) {
            i2 = 0;
        } else {
            i2 = this.mInsets.bottom;
            this.mAttributes.setHeight(getThickness(this.mInsetsIgnoringVisibility.bottom));
            if (occupiesCorners()) {
                insetsOf = Insets.of(0, 0, 0, getThickness(i2));
            }
        }
        setSystemVisible(i2 > 0);
        float f2 = i2 > 0 ? 1.0f : 0.0f;
        setSystemAlpha(f2);
        setSystemInsetAmount(f2);
        return insetsOf;
    }
}

package androidx.camera.core;

import androidx.core.util.Pair;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CompositionSettings {
    public static final CompositionSettings DEFAULT;
    private final float mAlpha;
    private final int mBorderColor;
    private final float mBorderWidthRatio;
    private final Pair<Float, Float> mOffset;
    private final float mRoundedCornerRatio;
    private final Pair<Float, Float> mScale;
    private final int mZOrder;

    /* compiled from: WazeSource */
    public final class Builder {
        private float mAlpha = 1.0f;
        private int mBorderColor;
        private float mBorderWidthRatio;
        private Pair<Float, Float> mOffset;
        private float mRoundedCornerRatio;
        private Pair<Float, Float> mScale;
        private int mZOrder;

        public Builder() {
            Float fValueOf = Float.valueOf(0.0f);
            this.mOffset = Pair.create(fValueOf, fValueOf);
            Float fValueOf2 = Float.valueOf(1.0f);
            this.mScale = Pair.create(fValueOf2, fValueOf2);
            this.mRoundedCornerRatio = 0.0f;
            this.mBorderWidthRatio = 0.0f;
            this.mBorderColor = -1;
            this.mZOrder = 0;
        }

        public CompositionSettings build() {
            return new CompositionSettings(this.mAlpha, this.mOffset, this.mScale, this.mRoundedCornerRatio, this.mBorderWidthRatio, this.mBorderColor, this.mZOrder);
        }

        public Builder setAlpha(float f2) {
            this.mAlpha = f2;
            return this;
        }

        public Builder setBorderColor(int i2) {
            this.mBorderColor = i2;
            return this;
        }

        public Builder setBorderWidthRatio(float f2) {
            this.mBorderWidthRatio = f2;
            return this;
        }

        public Builder setOffset(float f2, float f3) {
            this.mOffset = Pair.create(Float.valueOf(f2), Float.valueOf(f3));
            return this;
        }

        public Builder setRoundedCornerRatio(float f2) {
            this.mRoundedCornerRatio = f2;
            return this;
        }

        public Builder setScale(float f2, float f3) {
            this.mScale = Pair.create(Float.valueOf(f2), Float.valueOf(f3));
            return this;
        }

        public Builder setZOrder(int i2) {
            Preconditions.checkArgument(i2 >= 0, "z-order must be non-negative.");
            this.mZOrder = i2;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.setAlpha(1.0f);
        builder.setOffset(0.0f, 0.0f);
        builder.setScale(1.0f, 1.0f);
        builder.setRoundedCornerRatio(0.0f);
        builder.setBorderWidthRatio(0.0f);
        builder.setBorderColor(-1);
        builder.setZOrder(0);
        DEFAULT = builder.build();
    }

    private CompositionSettings(float f2, Pair<Float, Float> pair, Pair<Float, Float> pair2, float f3, float f4, int i2, int i3) {
        this.mAlpha = f2;
        this.mOffset = pair;
        this.mScale = pair2;
        this.mRoundedCornerRatio = f3;
        this.mBorderWidthRatio = f4;
        this.mBorderColor = i2;
        this.mZOrder = i3;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public float getBorderWidthRatio() {
        return this.mBorderWidthRatio;
    }

    public Pair<Float, Float> getOffset() {
        return this.mOffset;
    }

    public float getRoundedCornerRatio() {
        return this.mRoundedCornerRatio;
    }

    public Pair<Float, Float> getScale() {
        return this.mScale;
    }

    public int getZOrder() {
        return this.mZOrder;
    }
}

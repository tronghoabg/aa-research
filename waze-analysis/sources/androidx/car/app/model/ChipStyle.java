package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class ChipStyle {
    private final CarColor mBackgroundColor;
    private final CarColor mContentColor;
    private final CarColor mOutlineColor;
    private final Shape mShape;

    /* compiled from: WazeSource */
    public final class Builder {
        private CarColor mBackgroundColor;
        private CarColor mContentColor;
        private CarColor mOutlineColor;
        private Shape mShape;

        public ChipStyle build() {
            return new ChipStyle(this);
        }

        public Builder setBackgroundColor(CarColor carColor) {
            this.mBackgroundColor = (CarColor) Objects.requireNonNull(carColor);
            return this;
        }

        public Builder setContentColor(CarColor carColor) {
            this.mContentColor = (CarColor) Objects.requireNonNull(carColor);
            return this;
        }

        public Builder setOutlineColor(CarColor carColor) {
            this.mOutlineColor = (CarColor) Objects.requireNonNull(carColor);
            return this;
        }

        public Builder setShape(Shape shape) {
            this.mShape = (Shape) Objects.requireNonNull(shape);
            return this;
        }
    }

    ChipStyle(Builder builder) {
        this.mBackgroundColor = builder.mBackgroundColor;
        this.mContentColor = builder.mContentColor;
        this.mOutlineColor = builder.mOutlineColor;
        this.mShape = builder.mShape;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipStyle)) {
            return false;
        }
        ChipStyle chipStyle = (ChipStyle) obj;
        return Objects.equals(this.mBackgroundColor, chipStyle.mBackgroundColor) && Objects.equals(this.mContentColor, chipStyle.mContentColor) && Objects.equals(this.mOutlineColor, chipStyle.mOutlineColor) && Objects.equals(this.mShape, chipStyle.mShape);
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public CarColor getContentColor() {
        return this.mContentColor;
    }

    public CarColor getOutlineColor() {
        return this.mOutlineColor;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mBackgroundColor, this.mContentColor, this.mOutlineColor, this.mShape);
    }

    public String toString() {
        return "ChipStyle{backgroundColor=" + this.mBackgroundColor + ", contentColor=" + this.mContentColor + ", outlineColor=" + this.mOutlineColor + ", shape=" + this.mShape + "}";
    }

    private ChipStyle() {
        this.mBackgroundColor = null;
        this.mContentColor = null;
        this.mOutlineColor = null;
        this.mShape = null;
    }
}

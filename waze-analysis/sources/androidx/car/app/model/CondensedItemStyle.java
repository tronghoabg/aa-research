package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.BackgroundConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class CondensedItemStyle {
    private final Background mBackground;
    private final Shape mShape;

    /* compiled from: WazeSource */
    @RequiresCarApi(9)
    public final class Builder {
        Background mBackground;
        Shape mShape;

        public CondensedItemStyle build() {
            if (this.mShape == null && this.mBackground == null) {
                throw new IllegalStateException("Either a shape or a background must be set for a CondensedItemStyle");
            }
            return new CondensedItemStyle(this);
        }

        public Builder setBackground(Background background) {
            BackgroundConstraints.COLOR_ONLY.validateOrThrow(background);
            this.mBackground = (Background) Objects.requireNonNull(background);
            return this;
        }

        public Builder setShape(Shape shape) {
            this.mShape = (Shape) Objects.requireNonNull(shape);
            return this;
        }
    }

    private CondensedItemStyle(Builder builder) {
        this.mShape = builder.mShape;
        this.mBackground = builder.mBackground;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItemStyle)) {
            return false;
        }
        CondensedItemStyle condensedItemStyle = (CondensedItemStyle) obj;
        return Objects.equals(this.mShape, condensedItemStyle.mShape) && Objects.equals(this.mBackground, condensedItemStyle.mBackground);
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mBackground);
    }

    public String toString() {
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}

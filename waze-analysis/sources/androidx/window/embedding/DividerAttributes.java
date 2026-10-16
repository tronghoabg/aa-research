package androidx.window.embedding;

import androidx.camera.video.AudioStats;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class DividerAttributes {
    public static final int COLOR_SYSTEM_DEFAULT = -16777216;
    public static final float DRAG_RANGE_VALUE_UNSPECIFIED = -1.0f;
    public static final int TYPE_VALUE_DRAGGABLE = 1;
    public static final int TYPE_VALUE_FIXED = 0;
    public static final int WIDTH_SYSTEM_DEFAULT = -1;
    private final int color;
    private final int widthDp;
    public static final Companion Companion = new Companion(null);
    public static final DividerAttributes NO_DIVIDER = new DividerAttributes() { // from class: androidx.window.embedding.DividerAttributes$Companion$NO_DIVIDER$1
        public int hashCode() {
            return toString().hashCode();
        }

        @Override // androidx.window.embedding.DividerAttributes
        public String toString() {
            return "NO_DIVIDER";
        }
    };

    /* synthetic */ DividerAttributes(int i2, int i3, int i4, o oVar) {
        this(1 == (i4 & 1) ? -1 : i2, (i4 & 2) != 0 ? -16777216 : i3);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getWidthDp() {
        return this.widthDp;
    }

    public String toString() {
        return "DividerAttributes{width=" + this.widthDp + ", color=" + this.color + "}";
    }

    /* compiled from: WazeSource */
    public abstract class DragRange {
        public static final Companion Companion = new Companion(null);
        public static final DragRange DRAG_RANGE_SYSTEM_DEFAULT = new DragRange() { // from class: androidx.window.embedding.DividerAttributes$DragRange$Companion$DRAG_RANGE_SYSTEM_DEFAULT$1
            public String toString() {
                return "DRAG_RANGE_SYSTEM_DEFAULT";
            }
        };

        /* compiled from: WazeSource */
        public final class SplitRatioDragRange extends DragRange {
            private final float maxRatio;
            private final float minRatio;

            public SplitRatioDragRange(float f2, float f3) {
                super(null);
                this.minRatio = f2;
                this.maxRatio = f3;
                double d2 = f2;
                if (d2 <= AudioStats.AUDIO_AMPLITUDE_NONE || d2 >= 1.0d) {
                    throw new IllegalArgumentException("minRatio must be in the interval (0.0, 1.0)");
                }
                double d3 = f3;
                if (d3 <= AudioStats.AUDIO_AMPLITUDE_NONE || d3 >= 1.0d) {
                    throw new IllegalArgumentException("maxRatio must be in the interval (0.0, 1.0)");
                }
                if (f2 > f3) {
                    throw new IllegalArgumentException("minRatio must be less than or equal to maxRatio");
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SplitRatioDragRange)) {
                    return false;
                }
                SplitRatioDragRange splitRatioDragRange = (SplitRatioDragRange) obj;
                return this.minRatio == splitRatioDragRange.minRatio && this.maxRatio == splitRatioDragRange.maxRatio;
            }

            public final float getMaxRatio() {
                return this.maxRatio;
            }

            public final float getMinRatio() {
                return this.minRatio;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.minRatio) * 31) + Float.floatToIntBits(this.maxRatio);
            }

            public String toString() {
                return "SplitRatioDragRange[" + this.minRatio + ", " + this.maxRatio + "]";
            }
        }

        private DragRange() {
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ DragRange(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final int alpha(int i2) {
            return i2 >>> 24;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateColor(int i2) {
            if (alpha(i2) != 255) {
                throw new IllegalArgumentException("Divider color must be opaque. Got: ".concat(String.valueOf(Integer.toHexString(i2))));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateWidth(int i2) {
            if (i2 == -1 || i2 >= 0) {
                return;
            }
            throw new IllegalArgumentException("widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: " + i2);
        }

        public final DividerAttributes createDividerAttributes$window(int i2, int i3, int i4, float f2, float f3, boolean z) {
            if (i2 == 0) {
                return new FixedDividerAttributes.Builder().setWidthDp(i3).setColor(i4).build();
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Got unknown divider type " + i2 + "!");
            }
            DraggableDividerAttributes.Builder draggingToFullscreenAllowed = new DraggableDividerAttributes.Builder().setWidthDp(i3).setColor(i4).setDraggingToFullscreenAllowed(z);
            if (f2 == -1.0f || f3 == -1.0f) {
                draggingToFullscreenAllowed.setDragRange(DragRange.DRAG_RANGE_SYSTEM_DEFAULT);
            } else {
                draggingToFullscreenAllowed.setDragRange(new DragRange.SplitRatioDragRange(f2, f3));
            }
            return draggingToFullscreenAllowed.build();
        }

        public final void validateXmlDividerAttributes$window(int i2, boolean z, boolean z2, boolean z3) {
            if (i2 == 1) {
                return;
            }
            if (z) {
                throw new IllegalArgumentException("Fixed divider does not allow attribute dragRangeMinRatio!");
            }
            if (z2) {
                throw new IllegalArgumentException("Fixed divider does not allow attribute dragRangeMaxRatio!");
            }
            if (z3) {
                throw new IllegalArgumentException("Fixed divider does not allow attribute isDraggingToFullscreenAllowed!");
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class FixedDividerAttributes extends DividerAttributes {
        /* synthetic */ FixedDividerAttributes(int i2, int i3, int i4, o oVar) {
            this(1 == (i4 & 1) ? -1 : i2, (i4 & 2) != 0 ? -16777216 : i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FixedDividerAttributes)) {
                return false;
            }
            FixedDividerAttributes fixedDividerAttributes = (FixedDividerAttributes) obj;
            return getWidthDp() == fixedDividerAttributes.getWidthDp() && getColor() == fixedDividerAttributes.getColor();
        }

        public int hashCode() {
            return (getWidthDp() * 31) + getColor();
        }

        private FixedDividerAttributes(int i2, int i3) {
            super(i2, i3, null);
        }

        public /* synthetic */ FixedDividerAttributes(int i2, int i3, o oVar) {
            this(i2, i3);
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private int color;
            private int widthDp;

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Builder(FixedDividerAttributes fixedDividerAttributes) {
                this();
                x.f(fixedDividerAttributes, "original");
                this.widthDp = fixedDividerAttributes.getWidthDp();
                this.color = fixedDividerAttributes.getColor();
            }

            public final FixedDividerAttributes build() {
                return new FixedDividerAttributes(this.widthDp, this.color, null);
            }

            public final Builder setColor(int i2) {
                DividerAttributes.Companion.validateColor(i2);
                this.color = i2;
                return this;
            }

            public final Builder setWidthDp(int i2) {
                DividerAttributes.Companion.validateWidth(i2);
                this.widthDp = i2;
                return this;
            }

            public Builder() {
                this.widthDp = -1;
                this.color = -16777216;
            }
        }
    }

    public /* synthetic */ DividerAttributes(int i2, int i3, o oVar) {
        this(i2, i3);
    }

    private DividerAttributes(int i2, int i3) {
        this.widthDp = i2;
        this.color = i3;
    }

    /* compiled from: WazeSource */
    public final class DraggableDividerAttributes extends DividerAttributes {
        private final DragRange dragRange;
        private final boolean isDraggingToFullscreenAllowed;

        /* JADX WARN: Illegal instructions before constructor call */
        /* synthetic */ DraggableDividerAttributes(int i2, int i3, DragRange dragRange, boolean z, int i4, o oVar) {
            dragRange = (i4 & 4) != 0 ? DragRange.DRAG_RANGE_SYSTEM_DEFAULT : dragRange;
            int i5 = i4 & 1;
            this(1 == i5 ? -1 : i2, (i4 & 2) != 0 ? -16777216 : i3, dragRange, z & ((i4 & 8) == 0));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DraggableDividerAttributes)) {
                return false;
            }
            DraggableDividerAttributes draggableDividerAttributes = (DraggableDividerAttributes) obj;
            return getWidthDp() == draggableDividerAttributes.getWidthDp() && getColor() == draggableDividerAttributes.getColor() && x.n(this.dragRange, draggableDividerAttributes.dragRange) && this.isDraggingToFullscreenAllowed == draggableDividerAttributes.isDraggingToFullscreenAllowed;
        }

        public final DragRange getDragRange() {
            return this.dragRange;
        }

        public int hashCode() {
            return (((((getWidthDp() * 31) + getColor()) * 31) + this.dragRange.hashCode()) * 31) + DividerAttributes$DraggableDividerAttributes$$ExternalSyntheticBackport0.m(this.isDraggingToFullscreenAllowed);
        }

        public final boolean isDraggingToFullscreenAllowed() {
            return this.isDraggingToFullscreenAllowed;
        }

        @Override // androidx.window.embedding.DividerAttributes
        public String toString() {
            return DraggableDividerAttributes.class.getSimpleName() + "{width=" + getWidthDp() + ", color=" + getColor() + ", primaryContainerDragRange=" + this.dragRange + ", isDraggingToFullscreenAllowed=" + this.isDraggingToFullscreenAllowed + "}";
        }

        private DraggableDividerAttributes(int i2, int i3, DragRange dragRange, boolean z) {
            super(i2, i3, null);
            this.dragRange = dragRange;
            this.isDraggingToFullscreenAllowed = z;
        }

        public /* synthetic */ DraggableDividerAttributes(int i2, int i3, DragRange dragRange, boolean z, o oVar) {
            this(i2, i3, dragRange, z);
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private int color;
            private DragRange dragRange;
            private boolean isDraggingToFullscreenAllowed;
            private int widthDp;

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Builder(DraggableDividerAttributes draggableDividerAttributes) {
                this();
                x.f(draggableDividerAttributes, "original");
                this.widthDp = draggableDividerAttributes.getWidthDp();
                this.dragRange = draggableDividerAttributes.getDragRange();
                this.color = draggableDividerAttributes.getColor();
                this.isDraggingToFullscreenAllowed = draggableDividerAttributes.isDraggingToFullscreenAllowed();
            }

            public final DraggableDividerAttributes build() {
                return new DraggableDividerAttributes(this.widthDp, this.color, this.dragRange, this.isDraggingToFullscreenAllowed, null);
            }

            public final Builder setColor(int i2) {
                DividerAttributes.Companion.validateColor(i2);
                this.color = i2;
                return this;
            }

            public final Builder setDragRange(DragRange dragRange) {
                x.f(dragRange, "dragRange");
                this.dragRange = dragRange;
                return this;
            }

            public final Builder setDraggingToFullscreenAllowed(boolean z) {
                this.isDraggingToFullscreenAllowed = z;
                return this;
            }

            public final Builder setWidthDp(int i2) {
                DividerAttributes.Companion.validateWidth(i2);
                this.widthDp = i2;
                return this;
            }

            public Builder() {
                this.widthDp = -1;
                this.color = -16777216;
                this.dragRange = DragRange.DRAG_RANGE_SYSTEM_DEFAULT;
            }
        }
    }
}

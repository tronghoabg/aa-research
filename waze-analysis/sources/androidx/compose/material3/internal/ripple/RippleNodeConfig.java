package androidx.compose.material3.internal.ripple;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleNodeConfig {
    public static final int $stable = 0;
    private final Drag drag;
    private final Focus focus;
    private final Hover hover;
    private final Press press;

    public RippleNodeConfig(Press press, Focus focus, Hover hover, Drag drag) {
        this.press = press;
        this.focus = focus;
        this.hover = hover;
        this.drag = drag;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeConfig)) {
            return false;
        }
        RippleNodeConfig rippleNodeConfig = (RippleNodeConfig) obj;
        return x.n(this.press, rippleNodeConfig.press) && x.n(this.focus, rippleNodeConfig.focus) && x.n(this.hover, rippleNodeConfig.hover) && x.n(this.drag, rippleNodeConfig.drag);
    }

    public final Drag getDrag() {
        return this.drag;
    }

    public final Focus getFocus() {
        return this.focus;
    }

    public final Hover getHover() {
        return this.hover;
    }

    public final Press getPress() {
        return this.press;
    }

    public int hashCode() {
        return (((((this.press.hashCode() * 31) + this.focus.hashCode()) * 31) + this.hover.hashCode()) * 31) + this.drag.hashCode();
    }

    /* compiled from: WazeSource */
    public abstract class Drag {
        public static final int $stable = 0;

        /* compiled from: WazeSource */
        public final class None extends Drag {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        /* compiled from: WazeSource */
        public final class Opacity extends Drag {
            public static final int $stable = 0;
            private final float alpha;

            public Opacity(float f2) {
                super(null);
                this.alpha = f2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Opacity) && this.alpha == ((Opacity) obj).alpha;
            }

            public final float getAlpha() {
                return this.alpha;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.alpha);
            }
        }

        private Drag() {
        }

        public /* synthetic */ Drag(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public abstract class Focus {
        public static final int $stable = 0;

        /* compiled from: WazeSource */
        public final class None extends Focus {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        /* compiled from: WazeSource */
        public final class Opacity extends Focus {
            public static final int $stable = 0;
            private final float alpha;

            public Opacity(float f2) {
                super(null);
                this.alpha = f2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Opacity) && this.alpha == ((Opacity) obj).alpha;
            }

            public final float getAlpha() {
                return this.alpha;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.alpha);
            }
        }

        private Focus() {
        }

        public /* synthetic */ Focus(o oVar) {
            this();
        }

        /* compiled from: WazeSource */
        public final class InsetRing extends Focus {
            public static final int $stable = 8;
            private final FiniteAnimationSpec<Float> focusingAnimationSpec;
            private final ColorProducer innerStrokeColor;
            private final float innerStrokeInset;
            private final float innerStrokeWidth;
            private final ColorProducer outerStrokeColor;
            private final float outerStrokeInset;
            private final float outerStrokeWidth;
            private final Shape shape;
            private final FiniteAnimationSpec<Float> unfocusingAnimationSpec;

            private InsetRing(Shape shape, float f2, float f3, ColorProducer colorProducer, float f4, float f5, ColorProducer colorProducer2, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<Float> finiteAnimationSpec2) {
                super(null);
                this.shape = shape;
                this.outerStrokeInset = f2;
                this.outerStrokeWidth = f3;
                this.outerStrokeColor = colorProducer;
                this.innerStrokeInset = f4;
                this.innerStrokeWidth = f5;
                this.innerStrokeColor = colorProducer2;
                this.focusingAnimationSpec = finiteAnimationSpec;
                this.unfocusingAnimationSpec = finiteAnimationSpec2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InsetRing)) {
                    return false;
                }
                InsetRing insetRing = (InsetRing) obj;
                return x.n(this.shape, insetRing.shape) && Dp.m11169equalsimpl0(this.outerStrokeInset, insetRing.outerStrokeInset) && Dp.m11169equalsimpl0(this.outerStrokeWidth, insetRing.outerStrokeWidth) && x.n(this.outerStrokeColor, insetRing.outerStrokeColor) && Dp.m11169equalsimpl0(this.innerStrokeInset, insetRing.innerStrokeInset) && Dp.m11169equalsimpl0(this.innerStrokeWidth, insetRing.innerStrokeWidth) && x.n(this.innerStrokeColor, insetRing.innerStrokeColor) && x.n(this.focusingAnimationSpec, insetRing.focusingAnimationSpec) && x.n(this.unfocusingAnimationSpec, insetRing.unfocusingAnimationSpec);
            }

            public final FiniteAnimationSpec<Float> getFocusingAnimationSpec() {
                return this.focusingAnimationSpec;
            }

            public final ColorProducer getInnerStrokeColor() {
                return this.innerStrokeColor;
            }

            /* renamed from: getInnerStrokeInset-D9Ej5fM, reason: not valid java name */
            public final float m6404getInnerStrokeInsetD9Ej5fM() {
                return this.innerStrokeInset;
            }

            /* renamed from: getInnerStrokeWidth-D9Ej5fM, reason: not valid java name */
            public final float m6405getInnerStrokeWidthD9Ej5fM() {
                return this.innerStrokeWidth;
            }

            public final ColorProducer getOuterStrokeColor() {
                return this.outerStrokeColor;
            }

            /* renamed from: getOuterStrokeInset-D9Ej5fM, reason: not valid java name */
            public final float m6406getOuterStrokeInsetD9Ej5fM() {
                return this.outerStrokeInset;
            }

            /* renamed from: getOuterStrokeWidth-D9Ej5fM, reason: not valid java name */
            public final float m6407getOuterStrokeWidthD9Ej5fM() {
                return this.outerStrokeWidth;
            }

            public final Shape getShape() {
                return this.shape;
            }

            public final FiniteAnimationSpec<Float> getUnfocusingAnimationSpec() {
                return this.unfocusingAnimationSpec;
            }

            public int hashCode() {
                return (((((((((((((((this.shape.hashCode() * 31) + Dp.m11170hashCodeimpl(this.outerStrokeInset)) * 31) + Dp.m11170hashCodeimpl(this.outerStrokeWidth)) * 31) + this.outerStrokeColor.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.innerStrokeInset)) * 31) + Dp.m11170hashCodeimpl(this.innerStrokeWidth)) * 31) + this.innerStrokeColor.hashCode()) * 31) + this.focusingAnimationSpec.hashCode()) * 31) + this.unfocusingAnimationSpec.hashCode();
            }

            public /* synthetic */ InsetRing(Shape shape, float f2, float f3, ColorProducer colorProducer, float f4, float f5, ColorProducer colorProducer2, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, o oVar) {
                this(shape, f2, f3, colorProducer, f4, f5, colorProducer2, finiteAnimationSpec, finiteAnimationSpec2);
            }
        }
    }

    /* compiled from: WazeSource */
    public abstract class Hover {
        public static final int $stable = 0;

        /* compiled from: WazeSource */
        public final class None extends Hover {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        /* compiled from: WazeSource */
        public final class Opacity extends Hover {
            public static final int $stable = 0;
            private final float alpha;

            public Opacity(float f2) {
                super(null);
                this.alpha = f2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Opacity) && this.alpha == ((Opacity) obj).alpha;
            }

            public final float getAlpha() {
                return this.alpha;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.alpha);
            }
        }

        private Hover() {
        }

        public /* synthetic */ Hover(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public abstract class Press {
        public static final int $stable = 0;

        /* compiled from: WazeSource */
        public final class None extends Press {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        /* compiled from: WazeSource */
        public final class Opacity extends Press {
            public static final int $stable = 0;
            private final float alpha;

            public Opacity(float f2) {
                super(null);
                this.alpha = f2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Opacity) && this.alpha == ((Opacity) obj).alpha;
            }

            public final float getAlpha() {
                return this.alpha;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.alpha);
            }
        }

        private Press() {
        }

        public /* synthetic */ Press(o oVar) {
            this();
        }
    }
}
